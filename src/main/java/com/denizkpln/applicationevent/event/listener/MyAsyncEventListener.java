package com.denizkpln.applicationevent.event.listener;

import com.denizkpln.applicationevent.event.configuration.MyAsyncEvent;
import com.denizkpln.applicationevent.event.configuration.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class MyAsyncEventListener  {

    private final ConfigurableApplicationContext configurableApplicationContext;

    @EventListener
    @Async
    public void onApplicationEvent(MyAsyncEvent event) {
       log.info("MyEventListener received event: {}", "bitti" );
//       configurableApplicationContext.close();
    }


}
