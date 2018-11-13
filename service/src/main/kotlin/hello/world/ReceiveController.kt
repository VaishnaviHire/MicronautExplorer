package hello.world
import io.reactivex.Flowable
import io.reactivex.Single
import io.micronaut.http.*
import io.micronaut.http.annotation.*
import javax.inject.Singleton
import javax.validation.constraints.Size


@Controller("/post")
class ReceiveController {

    //Post request with max size =1024
    @Post("/")
     fun echo(text: @Size(max = 1024) String):String {

        return text
    }

}