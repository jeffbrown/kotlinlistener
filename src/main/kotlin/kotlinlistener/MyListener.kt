package kotlinlistener

import io.micronaut.discovery.event.ServiceStartedEvent
import io.micronaut.runtime.event.annotation.EventListener
import javax.inject.Singleton

@Singleton
class MyListener {

    var hasRun = false

    @EventListener
    internal fun onStartup(event: ServiceStartedEvent) {
        hasRun = true
    }
}