package org.laokou.common.statemachine.impl;

import org.laokou.common.statemachine.Transition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * EventTransitions
 * <p>
 * 同一个Event可以触发多个Transitions，<a href="https://github.com/alibaba/COLA/pull/158">...</a>
 *
 * @author Frank Zhang 2021-05-28 5:17 PM
 */
public class EventTransitions<S,E,C> {
    private final HashMap<E, List<Transition<S,E,C>>> eventTransitions;

    public EventTransitions(){
        eventTransitions = new HashMap<>();
    }

    public void put(E event, Transition<S, E, C> transition){
        if(eventTransitions.get(event) == null){
            List<Transition<S,E,C>> transitions = new ArrayList<>();
            transitions.add(transition);
            eventTransitions.put(event, transitions);
        }
        else{
			List<Transition<S,E,C>> existingTransitions = eventTransitions.get(event);
            verify(existingTransitions, transition);
            existingTransitions.add(transition);
        }
    }

    /**
     * Per one source and target state, there is only one transition is allowed
	 */
    private void verify(List<Transition<S,E,C>> existingTransitions, Transition<S,E,C> newTransition) {
        for (Transition<S,E,C> transition : existingTransitions) {
            if (transition.equals(newTransition)) {
                throw new StateMachineException(transition + " already Exist, you can not add another one");
            }
        }
    }

    public List<Transition<S,E,C>> get(E event){
        return eventTransitions.get(event);
    }

    public List<Transition<S,E,C>> allTransitions(){
        List<Transition<S,E,C>> allTransitions = new ArrayList<>();
        for(List<Transition<S,E,C>> transitions : eventTransitions.values()){
            allTransitions.addAll(transitions);
        }
        return allTransitions;
    }
}
