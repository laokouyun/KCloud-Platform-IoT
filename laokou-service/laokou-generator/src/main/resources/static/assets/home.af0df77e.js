var Le=Object.defineProperty,Ce=Object.defineProperties;var Ee=Object.getOwnPropertyDescriptors;var he=Object.getOwnPropertySymbols;var xe=Object.prototype.hasOwnProperty,Se=Object.prototype.propertyIsEnumerable;var ge=(a,o,t)=>o in a?Le(a,o,{enumerable:!0,configurable:!0,writable:!0,value:t}):a[o]=t,R=(a,o)=>{for(var t in o||(o={}))xe.call(o,t)&&ge(a,t,o[t]);if(he)for(var t of he(o))Se.call(o,t)&&ge(a,t,o[t]);return a},W=(a,o)=>Ce(a,Ee(o));import{y as Oe,U as D,a as V,o as p,j as _,n as r,b as pe,d as ce,be as we,r as y,bf as Ve,c as I,Z as ye,V as ue,q as ke,P as be,g as Z,e as d,h as m,a7 as v,u as n,ab as Te,a6 as $,F as de,a9 as $e,k as Ne,t as Me,a5 as Ae,ad as fe,a8 as P,ag as Be,aq as Re,X as F,w as me,$ as He,aa as De,_ as Fe,ac as Pe,bg as Xe,b9 as Ye,ba as je,l as k}from"./index.7b9fb216.js";import{_ as We}from"./plugin-vue_export-helper.21dcd24c.js";import{_ as X,u as ve,E as O,f as Ze,d as _e,e as Ge,i as qe}from"./index2.546b21f2.js";import{m as ze,u as Ue,a as Ke,b as Je,E as H}from"./index2.4acfc743.js";import{d as Qe,a as Ie,u as et,b as tt}from"./index2.ea140b44.js";var nt="Expected a function";function ie(a,o,t){var l=!0,h=!0;if(typeof a!="function")throw new TypeError(nt);return Oe(t)&&(l="leading"in t?!!t.leading:l,h="trailing"in t?!!t.trailing:h),Qe(a,o,{leading:l,maxWait:o,trailing:h})}const st=(a,o)=>{if(!D||!a||!o)return!1;const t=a.getBoundingClientRect();let l;return o instanceof Element?l=o.getBoundingClientRect():l={top:0,right:window.innerWidth,bottom:window.innerHeight,left:0},t.top<l.bottom&&t.bottom>l.top&&t.right>l.left&&t.left<l.right},at=V({name:"FullScreen"}),ot={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},lt=r("path",{fill:"currentColor",d:"m160 96.064 192 .192a32 32 0 0 1 0 64l-192-.192V352a32 32 0 0 1-64 0V96h64v.064zm0 831.872V928H96V672a32 32 0 1 1 64 0v191.936l192-.192a32 32 0 1 1 0 64l-192 .192zM864 96.064V96h64v256a32 32 0 1 1-64 0V160.064l-192 .192a32 32 0 1 1 0-64l192-.192zm0 831.872-192-.192a32 32 0 0 1 0-64l192 .192V672a32 32 0 1 1 64 0v256h-64v-.064z"},null,-1),rt=[lt];function it(a,o,t,l,h,c){return p(),_("svg",ot,rt)}var ct=X(at,[["render",it]]);const ut=V({name:"RefreshLeft"}),dt={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},ft=r("path",{fill:"currentColor",d:"M289.088 296.704h92.992a32 32 0 0 1 0 64H232.96a32 32 0 0 1-32-32V179.712a32 32 0 0 1 64 0v50.56a384 384 0 0 1 643.84 282.88 384 384 0 0 1-383.936 384 384 384 0 0 1-384-384h64a320 320 0 1 0 640 0 320 320 0 0 0-555.712-216.448z"},null,-1),pt=[ft];function mt(a,o,t,l,h,c){return p(),_("svg",dt,pt)}var vt=X(ut,[["render",mt]]);const _t=V({name:"RefreshRight"}),ht={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},gt=r("path",{fill:"currentColor",d:"M784.512 230.272v-50.56a32 32 0 1 1 64 0v149.056a32 32 0 0 1-32 32H667.52a32 32 0 1 1 0-64h92.992A320 320 0 1 0 524.8 833.152a320 320 0 0 0 320-320h64a384 384 0 0 1-384 384 384 384 0 0 1-384-384 384 384 0 0 1 643.712-282.88z"},null,-1),wt=[gt];function yt(a,o,t,l,h,c){return p(),_("svg",ht,wt)}var kt=X(_t,[["render",yt]]);const bt=V({name:"ScaleToOriginal"}),$t={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},zt=r("path",{fill:"currentColor",d:"M813.176 180.706a60.235 60.235 0 0 1 60.236 60.235v481.883a60.235 60.235 0 0 1-60.236 60.235H210.824a60.235 60.235 0 0 1-60.236-60.235V240.94a60.235 60.235 0 0 1 60.236-60.235h602.352zm0-60.235H210.824A120.47 120.47 0 0 0 90.353 240.94v481.883a120.47 120.47 0 0 0 120.47 120.47h602.353a120.47 120.47 0 0 0 120.471-120.47V240.94a120.47 120.47 0 0 0-120.47-120.47zm-120.47 180.705a30.118 30.118 0 0 0-30.118 30.118v301.177a30.118 30.118 0 0 0 60.236 0V331.294a30.118 30.118 0 0 0-30.118-30.118zm-361.412 0a30.118 30.118 0 0 0-30.118 30.118v301.177a30.118 30.118 0 1 0 60.236 0V331.294a30.118 30.118 0 0 0-30.118-30.118zM512 361.412a30.118 30.118 0 0 0-30.118 30.117v30.118a30.118 30.118 0 0 0 60.236 0V391.53A30.118 30.118 0 0 0 512 361.412zM512 512a30.118 30.118 0 0 0-30.118 30.118v30.117a30.118 30.118 0 0 0 60.236 0v-30.117A30.118 30.118 0 0 0 512 512z"},null,-1),It=[zt];function Lt(a,o,t,l,h,c){return p(),_("svg",$t,It)}var Ct=X(bt,[["render",Lt]]);const Et=V({name:"ZoomIn"}),xt={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},St=r("path",{fill:"currentColor",d:"m795.904 750.72 124.992 124.928a32 32 0 0 1-45.248 45.248L750.656 795.904a416 416 0 1 1 45.248-45.248zM480 832a352 352 0 1 0 0-704 352 352 0 0 0 0 704zm-32-384v-96a32 32 0 0 1 64 0v96h96a32 32 0 0 1 0 64h-96v96a32 32 0 0 1-64 0v-96h-96a32 32 0 0 1 0-64h96z"},null,-1),Ot=[St];function Vt(a,o,t,l,h,c){return p(),_("svg",xt,Ot)}var Tt=X(Et,[["render",Vt]]);const Nt=V({name:"ZoomOut"}),Mt={viewBox:"0 0 1024 1024",xmlns:"http://www.w3.org/2000/svg"},At=r("path",{fill:"currentColor",d:"m795.904 750.72 124.992 124.928a32 32 0 0 1-45.248 45.248L750.656 795.904a416 416 0 1 1 45.248-45.248zM480 832a352 352 0 1 0 0-704 352 352 0 0 0 0 704zM352 448h256a32 32 0 0 1 0 64H352a32 32 0 0 1 0-64z"},null,-1),Bt=[At];function Rt(a,o,t,l,h,c){return p(),_("svg",Mt,Bt)}var Ht=X(Nt,[["render",Rt]]);const Dt=()=>D&&/firefox/i.test(window.navigator.userAgent),Ft=pe({urlList:{type:ce(Array),default:()=>ze([])},zIndex:{type:Number},initialIndex:{type:Number,default:0},infinite:{type:Boolean,default:!0},hideOnClickModal:{type:Boolean,default:!1},teleported:{type:Boolean,default:!1},closeOnPressEscape:{type:Boolean,default:!0}}),Pt={close:()=>!0,switch:a=>typeof a=="number"},Xt=["src"],Yt={name:"ElImageViewer"},jt=V(W(R({},Yt),{props:Ft,emits:Pt,setup(a,{emit:o}){const t=a,l={CONTAIN:{name:"contain",icon:we(ct)},ORIGINAL:{name:"original",icon:we(Ct)}},h=Dt()?"DOMMouseScroll":"mousewheel",{t:c}=Ie(),f=ve("image-viewer"),{nextZIndex:se}=Ue(),C=y(),T=y([]),G=Ve(),N=y(!0),g=y(t.initialIndex),E=y(l.CONTAIN),u=y({scale:1,deg:0,offsetX:0,offsetY:0,enableTransition:!1}),q=I(()=>{const{urlList:e}=t;return e.length<=1}),A=I(()=>g.value===0),U=I(()=>g.value===t.urlList.length-1),ae=I(()=>t.urlList[g.value]),Y=I(()=>{const{scale:e,deg:s,offsetX:i,offsetY:w,enableTransition:x}=u.value;let b=i/e,S=w/e;switch(s%360){case 90:case-270:[b,S]=[S,-b];break;case 180:case-180:[b,S]=[-b,-S];break;case 270:case-90:[b,S]=[-S,b];break}const B={transform:`scale(${e}) rotate(${s}deg) translate(${b}px, ${S}px)`,transition:x?"transform .3s":""};return E.value.name===l.CONTAIN.name&&(B.maxWidth=B.maxHeight="100%"),B}),oe=I(()=>ye(t.zIndex)?t.zIndex:se());function M(){re(),o("close")}function le(){const e=ie(i=>{switch(i.code){case H.esc:t.closeOnPressEscape&&M();break;case H.space:ee();break;case H.left:te();break;case H.up:z("zoomIn");break;case H.right:ne();break;case H.down:z("zoomOut");break}}),s=ie(i=>{(i.wheelDelta?i.wheelDelta:-i.detail)>0?z("zoomIn",{zoomRate:1.2,enableTransition:!1}):z("zoomOut",{zoomRate:1.2,enableTransition:!1})});G.run(()=>{F(document,"keydown",e),F(document,h,s)})}function re(){G.stop()}function K(){N.value=!1}function J(e){N.value=!1,e.target.alt=c("el.image.error")}function Q(e){if(N.value||e.button!==0||!C.value)return;u.value.enableTransition=!1;const{offsetX:s,offsetY:i}=u.value,w=e.pageX,x=e.pageY,b=ie(B=>{u.value=W(R({},u.value),{offsetX:s+B.pageX-w,offsetY:i+B.pageY-x})}),S=F(document,"mousemove",b);F(document,"mouseup",()=>{S()}),e.preventDefault()}function j(){u.value={scale:1,deg:0,offsetX:0,offsetY:0,enableTransition:!1}}function ee(){if(N.value)return;const e=Object.keys(l),s=Object.values(l),i=E.value.name,x=(s.findIndex(b=>b.name===i)+1)%e.length;E.value=l[e[x]],j()}function te(){if(A.value&&!t.infinite)return;const e=t.urlList.length;g.value=(g.value-1+e)%e}function ne(){if(U.value&&!t.infinite)return;const e=t.urlList.length;g.value=(g.value+1)%e}function z(e,s={}){if(N.value)return;const{zoomRate:i,rotateDeg:w,enableTransition:x}=R({zoomRate:1.4,rotateDeg:90,enableTransition:!0},s);switch(e){case"zoomOut":u.value.scale>.2&&(u.value.scale=Number.parseFloat((u.value.scale/i).toFixed(3)));break;case"zoomIn":u.value.scale<7&&(u.value.scale=Number.parseFloat((u.value.scale*i).toFixed(3)));break;case"clockwise":u.value.deg+=w;break;case"anticlockwise":u.value.deg-=w;break}u.value.enableTransition=x}return ue(ae,()=>{ke(()=>{const e=T.value[0];e!=null&&e.complete||(N.value=!0)})}),ue(g,e=>{j(),o("switch",e)}),be(()=>{var e,s;le(),(s=(e=C.value)==null?void 0:e.focus)==null||s.call(e)}),(e,s)=>(p(),Z(Re,{to:"body",disabled:!e.teleported},[d(Be,{name:"viewer-fade",appear:""},{default:m(()=>[r("div",{ref_key:"wrapper",ref:C,tabindex:-1,class:v(n(f).e("wrapper")),style:fe({zIndex:n(oe)})},[r("div",{class:v(n(f).e("mask")),onClick:s[0]||(s[0]=Te(i=>e.hideOnClickModal&&M(),["self"]))},null,2),$(" CLOSE "),r("span",{class:v([n(f).e("btn"),n(f).e("close")]),onClick:M},[d(n(O),null,{default:m(()=>[d(n(Ze))]),_:1})],2),$(" ARROW "),n(q)?$("v-if",!0):(p(),_(de,{key:0},[r("span",{class:v([n(f).e("btn"),n(f).e("prev"),n(f).is("disabled",!e.infinite&&n(A))]),onClick:te},[d(n(O),null,{default:m(()=>[d(n(Ke))]),_:1})],2),r("span",{class:v([n(f).e("btn"),n(f).e("next"),n(f).is("disabled",!e.infinite&&n(U))]),onClick:ne},[d(n(O),null,{default:m(()=>[d(n(Je))]),_:1})],2)],64)),$(" ACTIONS "),r("div",{class:v([n(f).e("btn"),n(f).e("actions")])},[r("div",{class:v(n(f).e("actions__inner"))},[d(n(O),{onClick:s[1]||(s[1]=i=>z("zoomOut"))},{default:m(()=>[d(n(Ht))]),_:1}),d(n(O),{onClick:s[2]||(s[2]=i=>z("zoomIn"))},{default:m(()=>[d(n(Tt))]),_:1}),r("i",{class:v(n(f).e("actions__divider"))},null,2),d(n(O),{onClick:ee},{default:m(()=>[(p(),Z($e(E.value.icon)))]),_:1}),r("i",{class:v(n(f).e("actions__divider"))},null,2),d(n(O),{onClick:s[3]||(s[3]=i=>z("anticlockwise"))},{default:m(()=>[d(n(vt))]),_:1}),d(n(O),{onClick:s[4]||(s[4]=i=>z("clockwise"))},{default:m(()=>[d(n(kt))]),_:1})],2)],2),$(" CANVAS "),r("div",{class:v(n(f).e("canvas"))},[(p(!0),_(de,null,Ne(e.urlList,(i,w)=>Me((p(),_("img",{ref_for:!0,ref:x=>T.value[w]=x,key:i,src:i,style:fe(n(Y)),class:v(n(f).e("img")),onLoad:K,onError:J,onMousedown:Q},null,46,Xt)),[[Ae,w===g.value]])),128))],2),P(e.$slots,"default")],6)]),_:3})],8,["disabled"]))}}));var Wt=_e(jt,[["__file","/home/runner/work/element-plus/element-plus/packages/components/image-viewer/src/image-viewer.vue"]]);const Zt=me(Wt),Gt=pe({hideOnClickModal:{type:Boolean,default:!1},src:{type:String,default:""},fit:{type:String,values:["","contain","cover","fill","none","scale-down"],default:""},lazy:{type:Boolean,default:!1},scrollContainer:{type:ce([String,Object])},previewSrcList:{type:ce(Array),default:()=>ze([])},previewTeleported:{type:Boolean,default:!1},zIndex:{type:Number},initialIndex:{type:Number,default:0},infinite:{type:Boolean,default:!0},closeOnPressEscape:{type:Boolean,default:!0}}),qt={error:a=>a instanceof Event,switch:a=>ye(a),close:()=>!0},Ut=["src"],Kt={key:0},Jt={name:"ElImage",inheritAttrs:!1},Qt=V(W(R({},Jt),{props:Gt,emits:qt,setup(a,{emit:o}){const t=a;let l="";const{t:h}=Ie(),c=ve("image"),f=He(),se=et(),C=y(!1),T=y(!0),G=y(0),N=y(0),g=y(!1),E=y(),u=y();let q,A;const U=I(()=>f.style),ae=I(()=>{const{fit:e}=t;return D&&e?{objectFit:e}:{}}),Y=I(()=>{const{previewSrcList:e}=t;return Array.isArray(e)&&e.length>0}),oe=I(()=>{const{previewSrcList:e,initialIndex:s}=t;let i=s;return s>e.length-1&&(i=0),i}),M=()=>{if(!D)return;T.value=!0,C.value=!1;const e=new Image,s=t.src;e.addEventListener("load",i=>{s===t.src&&le(i,e)}),e.addEventListener("error",i=>{s===t.src&&re(i)}),Object.entries(f).forEach(([i,w])=>{i.toLowerCase()!=="onload"&&e.setAttribute(i,w)}),e.src=s};function le(e,s){G.value=s.width,N.value=s.height,T.value=!1,C.value=!1}function re(e){T.value=!1,C.value=!0,o("error",e)}function K(){st(E.value,u.value)&&(M(),j())}const J=Xe(K,200);async function Q(){var e;if(!D)return;await ke();const{scrollContainer:s}=t;Ge(s)?u.value=s:Fe(s)&&s!==""?u.value=(e=document.querySelector(s))!=null?e:void 0:E.value&&(u.value=tt(E.value)),u.value&&(q=F(u,"scroll",J),setTimeout(()=>K(),100))}function j(){!D||!u.value||!J||(q(),u.value=void 0)}function ee(e){if(!!e.ctrlKey){if(e.deltaY<0)return e.preventDefault(),!1;if(e.deltaY>0)return e.preventDefault(),!1}}function te(){!Y.value||(A=F("wheel",ee,{passive:!1}),l=document.body.style.overflow,document.body.style.overflow="hidden",g.value=!0)}function ne(){A==null||A(),document.body.style.overflow=l,g.value=!1,o("close")}function z(e){o("switch",e)}return ue(()=>t.src,()=>{t.lazy?(T.value=!0,C.value=!1,j(),Q()):M()}),be(()=>{t.lazy?Q():M()}),(e,s)=>(p(),_("div",{ref_key:"container",ref:E,class:v([n(c).b(),e.$attrs.class]),style:fe(n(U))},[T.value?P(e.$slots,"placeholder",{key:0},()=>[r("div",{class:v(n(c).e("placeholder"))},null,2)]):C.value?P(e.$slots,"error",{key:1},()=>[r("div",{class:v(n(c).e("error"))},Pe(n(h)("el.image.error")),3)]):(p(),_("img",De({key:2},n(se),{src:e.src,style:n(ae),class:[n(c).e("inner"),n(Y)?n(c).e("preview"):""],onClick:te}),null,16,Ut)),n(Y)?(p(),_(de,{key:3},[g.value?(p(),Z(n(Zt),{key:0,"z-index":e.zIndex,"initial-index":n(oe),infinite:e.infinite,"url-list":e.previewSrcList,"hide-on-click-modal":e.hideOnClickModal,teleported:e.previewTeleported,"close-on-press-escape":e.closeOnPressEscape,onClose:ne,onSwitch:z},{default:m(()=>[e.$slots.viewer?(p(),_("div",Kt,[P(e.$slots,"viewer")])):$("v-if",!0)]),_:3},8,["z-index","initial-index","infinite","url-list","hide-on-click-modal","teleported","close-on-press-escape"])):$("v-if",!0)],2112)):$("v-if",!0)],6))}}));var en=_e(Qt,[["__file","/home/runner/work/element-plus/element-plus/packages/components/image/src/image.vue"]]);const tn=me(en),nn=pe({type:{type:String,values:["primary","success","warning","info","danger","default"],default:"default"},underline:{type:Boolean,default:!0},disabled:{type:Boolean,default:!1},href:{type:String,default:""},icon:{type:qe,default:""}}),sn={click:a=>a instanceof MouseEvent},an=["href"],on={name:"ElLink"},ln=V(W(R({},on),{props:nn,emits:sn,setup(a,{emit:o}){const t=a,l=ve("link");function h(c){t.disabled||o("click",c)}return(c,f)=>(p(),_("a",{class:v([n(l).b(),n(l).m(c.type),n(l).is("disabled",c.disabled),n(l).is("underline",c.underline&&!c.disabled)]),href:c.disabled||!c.href?void 0:c.href,onClick:h},[c.icon?(p(),Z(n(O),{key:0},{default:m(()=>[(p(),Z($e(c.icon)))]),_:1})):$("v-if",!0),c.$slots.default?(p(),_("span",{key:1,class:v(n(l).e("inner"))},[P(c.$slots,"default")],2)):$("v-if",!0),c.$slots.icon?P(c.$slots,"icon",{key:2}):$("v-if",!0)],10,an))}}));var rn=_e(ln,[["__file","/home/runner/work/element-plus/element-plus/packages/components/link/src/link.vue"]]);const cn=me(rn);const un={},L=a=>(Ye("data-v-3c7e0c3d"),a=a(),je(),a),dn={class:"layout-home"},fn=L(()=>r("h2",null,"\u4ECB\u7ECD",-1)),pn=L(()=>r("p",null," fast-generator\u662F\u4E00\u6B3E\u4F4E\u4EE3\u7801\u751F\u6210\u5668\uFF0C\u53EF\u6839\u636E\u81EA\u5B9A\u4E49\u6A21\u677F\u5185\u5BB9\uFF0C\u5FEB\u901F\u751F\u6210\u4EE3\u7801\uFF0C\u5B9E\u73B0\u9879\u76EE\u7684\u5FEB\u901F\u5F00\u53D1\u3001\u4E0A\u7EBF\uFF0C\u51CF\u5C11\u91CD\u590D\u7684\u4EE3\u7801\u7F16\u5199\uFF0C\u5F00\u53D1\u4EBA\u5458\u53EA\u9700\u4E13\u6CE8\u4E1A\u52A1\u903B\u8F91\u5373\u53EF\u3002 ",-1)),mn=L(()=>r("br",null,null,-1)),vn=L(()=>r("h2",null,"\u4EA4\u6D41\u548C\u53CD\u9988",-1)),_n=k("\u5B98\u65B9\u793E\u533A\uFF1A"),hn=k(" https://maku.net"),gn=k(" \u6F14\u793A\u73AF\u5883\uFF1A"),wn=k(" https://demo.maku.net/fast-generator"),yn=k(" Github\u5730\u5740\uFF1A"),kn=k(" https://github.com/makunet/fast-generator"),bn=k(" Gitee\u5730\u5740\uFF1A"),$n=k(" https://gitee.com/makunet/fast-generator"),zn=L(()=>r("p",null,"\u6280\u672F\u89E3\u7B54\u3001\u4EA4\u6D41\u3001\u53CD\u9988\u3001\u5EFA\u8BAE\u7B49\uFF0C\u8BF7\u79FB\u6B65\u5230\u5B98\u65B9\u793E\u533A\uFF0C\u6211\u4EEC\u4F1A\u53CA\u65F6\u56DE\u590D\uFF0C\u4E5F\u65B9\u4FBF\u4ECA\u540E\u7684\u5C0F\u4F19\u4F34\u5BFB\u627E\u7B54\u6848\uFF0C\u611F\u8C22\u7406\u89E3\uFF01",-1)),In=L(()=>r("br",null,null,-1)),Ln=L(()=>r("h2",null,"\u5FAE\u4FE1\u4EA4\u6D41\u7FA4",-1)),Cn=L(()=>r("p",null,"\u4E3A\u4E86\u66F4\u597D\u7684\u4EA4\u6D41\uFF0C\u6211\u4EEC\u65B0\u63D0\u4F9B\u4E86\u5FAE\u4FE1\u4EA4\u6D41\u7FA4\uFF0C\u9700\u626B\u63CF\u4E0B\u9762\u7684\u4E8C\u7EF4\u7801\uFF0C\u5173\u6CE8\u516C\u4F17\u53F7\uFF0C\u56DE\u590D\u3010\u52A0\u7FA4\u3011\uFF0C\u6839\u636E\u63D0\u793A\u4FE1\u606F\uFF0C\u4F5C\u8005\u4F1A\u62C9\u4F60\u8FDB\u7FA4\u7684\uFF0C\u611F\u8C22\u914D\u5408\uFF01",-1)),En=L(()=>r("br",null,null,-1)),xn=L(()=>r("h2",null,"\u652F\u6301",-1)),Sn=k(" \u5982\u679C\u89C9\u5F97\u6846\u67B6\u8FD8\u4E0D\u9519\uFF0C\u6216\u8005\u5DF2\u7ECF\u5728\u4F7F\u7528\u4E86\uFF0C\u5E0C\u671B\u4F60\u53EF\u4EE5\u53BB "),On=k("Github"),Vn=k(" \u6216 "),Tn=k("Gitee"),Nn=k(" \u5E2E\u4F5C\u8005\u70B9\u4E2A \u2B50 Star\uFF0C\u8FD9\u5C06\u662F\u5BF9\u4F5C\u8005\u6781\u5927\u7684\u9F13\u52B1\u4E0E\u652F\u6301\u3002 ");function Mn(a,o){const t=cn,l=tn;return p(),_("div",dn,[fn,pn,mn,vn,r("p",null,[_n,d(t,{href:"https://maku.net",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[hn]),_:1})]),r("p",null,[gn,d(t,{href:"https://demo.maku.net/fast-generator",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[wn]),_:1})]),r("p",null,[yn,d(t,{href:"https://github.com/makunet/fast-generator",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[kn]),_:1})]),r("p",null,[bn,d(t,{href:"https://gitee.com/makunet/fast-generator",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[$n]),_:1})]),zn,In,Ln,Cn,d(l,{src:"https://maku.net/app/img/qrcode.jpg"}),En,xn,r("p",null,[Sn,d(t,{href:"https://github.com/makunet",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[On]),_:1}),Vn,d(t,{href:"https://gitee.com/makunet",underline:!1,type:"primary",target:"_blank"},{default:m(()=>[Tn]),_:1}),Nn])])}var Pn=We(un,[["render",Mn],["__scopeId","data-v-3c7e0c3d"]]);export{Pn as default};
