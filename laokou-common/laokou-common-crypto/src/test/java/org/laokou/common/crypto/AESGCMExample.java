package org.laokou.common.crypto;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

@Slf4j
public class AESGCMExample {

    private static final String AES = "AES";
    private static final String AES_GCM_NO_PADDING = "AES/GCM/NoPadding";
    private static final int GCM_TAG_LENGTH = 16;
    private static final int GCM_IV_LENGTH = 12;

    public static void main(String[] args) throws Exception {
        String originalText = "Hello, World!";

        // Generate key
        SecretKey secretKey = generateKey(256);

        // Encrypt
        byte[] iv = generateIV();
		String encryptedText = encrypt(originalText, secretKey, iv);
		log.info("Encrypted Text: {}", encryptedText);

		String encryptedText1 = encrypt(originalText, secretKey, iv);
		log.info("Encrypted1 Text: {}", encryptedText1);

        // Decrypt
        String decryptedText = decrypt(encryptedText, secretKey, iv);
        log.info("Decrypted Text: {}", decryptedText);
    }

    public static SecretKey generateKey(int keySize) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(AES);
        keyGen.init(keySize, new SecureRandom());
        return keyGen.generateKey();
    }

    public static byte[] generateIV() {
        byte[] iv = new byte[GCM_IV_LENGTH];
        new SecureRandom().nextBytes(iv);
        return iv;
    }

    public static String encrypt(String plainText, SecretKey key, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_GCM_NO_PADDING);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
        cipher.init(Cipher.ENCRYPT_MODE, key, gcmSpec);

        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        byte[] encryptedIVAndText = new byte[GCM_IV_LENGTH + encryptedBytes.length];
        System.arraycopy(iv, 0, encryptedIVAndText, 0, GCM_IV_LENGTH);
        System.arraycopy(encryptedBytes, 0, encryptedIVAndText, GCM_IV_LENGTH, encryptedBytes.length);
        return Base64.getEncoder().encodeToString(encryptedIVAndText);
    }

    public static String decrypt(String encryptedText, SecretKey key, byte[] iv) throws Exception {
        byte[] decoded = Base64.getDecoder().decode(encryptedText);

        Cipher cipher = Cipher.getInstance(AES_GCM_NO_PADDING);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
        cipher.init(Cipher.DECRYPT_MODE, key, gcmSpec);

        byte[] decryptedBytes = cipher.doFinal(decoded, GCM_IV_LENGTH, decoded.length - GCM_IV_LENGTH);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
