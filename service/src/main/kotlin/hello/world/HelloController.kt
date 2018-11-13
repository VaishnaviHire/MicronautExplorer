package hello.world

import io.micronaut.http.*
import io.micronaut.http.annotation.*
import javax.inject.Singleton

import io.micronaut.http.HttpResponse.*

@Controller("/")
//for calling external api : @Contoller(value = "api.brightcove.com", path="/v1/")

class HelloController {
// Path after controller
    @Get("/hello/{name}")
    fun index(name: String): String {
        return "Hello $name"
    }
}
