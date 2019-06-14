package kotlinlistener

import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.StringSpec
import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer

class ListenerSpec : StringSpec({

    "test listener"() {
        val server = ApplicationContext.run(EmbeddedServer::class.java)
        val ctx = server.applicationContext
        val bean = ctx.getBean(MyListener::class.java)
        bean.hasRun.shouldBeTrue()
    }
})