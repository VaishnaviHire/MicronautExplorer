package example.micronaut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.Secured
import java.security.Principal


@Secured("isAuthenticated()")
@Controller("/")
class HomeController {

    @Get("/")
    internal fun home(principal: Principal): String {
        return principal.name
    }
}
