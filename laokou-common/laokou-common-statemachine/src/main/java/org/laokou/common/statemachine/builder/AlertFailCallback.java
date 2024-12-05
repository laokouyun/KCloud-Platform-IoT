package org.laokou.common.statemachine.builder;


import org.laokou.common.statemachine.exception.TransitionFailException;

/**
 * Alert fail callback, throw an {@code TransitionFailException}
 *
 * @author 龙也 2022/9/15 12:02 PM
 */
public class AlertFailCallback<S, E, C> implements FailCallback<S, E, C> {

    @Override
    public void onFail(S sourceState, E event, C context) {
        throw new TransitionFailException(
            "Cannot fire event [" + event + "] on current state [" + sourceState + "] with context [" + context + "]"
        );
    }
}
