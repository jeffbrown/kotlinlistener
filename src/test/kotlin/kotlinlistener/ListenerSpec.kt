package kotlinlistener

import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.StringSpec
import io.micronaut.context.ApplicationContext

class ListenerSpec : StringSpec({

    "test listener"() {
        val ctx = ApplicationContext.run()
        val bean = ctx.getBean(MyListener::class.java)
        bean.hasRun.shouldBeTrue()
    }
})