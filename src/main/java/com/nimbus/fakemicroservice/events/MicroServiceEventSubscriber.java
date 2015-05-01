package com.nimbus.fakemicroservice.events;

import com.nimbus.poc.events.Event;
import com.nimbus.poc.events.EventSubscriber;
import org.springframework.stereotype.Component;

/**
 * Created by Kye on 30/04/15.
 */
@Component
public class MicroServiceEventSubscriber implements EventSubscriber {

    @Override
    public void onEvent(Event event) {

        System.out.println("MicroService received an event: " + event);
    }
}
