package hello.world

import io.micronaut.http.*
import io.micronaut.http.annotation.*
import javax.inject.Singleton
import io.micronaut.http.HttpResponse.*

//More controlled request using HttpResponse and HttpRequest Methods

@Controller("/request")
class RequestController {
    @Get("/hello")
     fun hello(request:HttpRequest<String>):HttpResponse<String> {
        val name = request.getParameters()
                .getFirst("name")
                .orElse("Nobody")
        return ok("Hello " + name + "!!")
                .header("X-My-Header", "Foo")
    }


 //Content Type is HTML for "localhost/request
 // Content-type can be changed to any format

    @Produces(MediaType.TEXT_HTML)
    @Get("/")
    public fun html() : String{
        return "<html>" +
                    "<title>" +
                    "</title>" +
                    "<body>" +
                        "<h1>Welcome</h1>" +
                    "</body>" +
                "</html>";
    }



}