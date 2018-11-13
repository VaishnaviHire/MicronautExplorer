package example.micronaut
//
import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.junit.Assert.assertEquals
import org.jetbrains.spek.api.dsl.it
import com.nimbusds.jwt.JWTParser
import com.nimbusds.jwt.SignedJWT
import io.micronaut.http.HttpRequest.GET
import io.micronaut.http.*
import io.micronaut.security.token.jwt.render.AccessRefreshToken
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.render.BearerAccessRefreshToken
import io.micronaut.security.token.jwt.endpoints.TokenRefreshRequest


class JwtAuthTest: Spek({
    describe("JWTtests") {
        val embeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        //Creating a low level HTTP-client using inbuilt server
        var client: HttpClient = HttpClient.create(embeddedServer.url)
        //Creating our own Client

        it("when unauthorized request is called") {
            kotlin.test.assertFailsWith<HttpClientResponseException> { client.toBlocking().retrieve("/") }
        }

        it("when login endpoint is called with credentials"){
            val creds   = UsernamePasswordCredentials("vaish", "1234")

            var resp   = client.toBlocking().exchange(HttpRequest.POST("/login", creds),BearerAccessRefreshToken::class.java)

            JWTParser.parse(resp.body()?.accessToken) as SignedJWT

            print(resp.body())
            resp.body()?.refreshToken
            JWTParser.parse(resp.body()?.refreshToken) as SignedJWT

            val accessToken  = resp.body()?.accessToken
            print(accessToken)

            var req = GET<Any>("/").header(HttpHeaders.AUTHORIZATION, "Bearer $accessToken")

           var resp1   = client.toBlocking().retrieve(req)

            assertEquals("vaish",resp1)

        }

        it("refresh access token"){
            val creds   = UsernamePasswordCredentials("vaish", "1234")

            var request : HttpRequest<Any> = HttpRequest.POST("/login", creds)

            var rsp   = client.toBlocking().exchange(HttpRequest.POST("/login", creds),BearerAccessRefreshToken::class.java)


            assertEquals(HttpStatus.OK, rsp.status)



            var refreshToken : String? = rsp.body()?.refreshToken
            var accessToken : String?  = rsp.body()?.accessToken

           var response :  HttpResponse<AccessRefreshToken>  = client.toBlocking().exchange(HttpRequest.POST("/oauth/access_token",
                    TokenRefreshRequest("refresh_token", refreshToken)))
            print(accessToken)



            assertEquals(response.body()?.accessToken != accessToken, true )



        }





    }


})






