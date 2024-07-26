package com.denizkpln.applicationevent.event.configuration;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.context.ApplicationEvent;

@Getter
public class YourEvent extends ApplicationEvent {
    @Accessors(prefix = "m_")
    private final String m_message;
    public YourEvent(Object source, String message) {
        super(source);
        m_message = message;
    }
}
