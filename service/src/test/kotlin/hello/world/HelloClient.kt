package hello.world

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client
import io.reactivex.Single
import javax.validation.constraints.NotBlank
import io.micronaut.http.annotation.*

@Client("/")
// Headers can be manipulated easily using annotations
@Header(name="X-Cli-Header", value="abcd")


 interface HelloClient {
    @Get("/hello/{name}")
    //Using JAVARx 2 methods to call function
    fun index(@NotBlank name: String): Single<String>
}