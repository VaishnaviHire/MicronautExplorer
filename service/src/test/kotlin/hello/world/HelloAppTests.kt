package hello.world
//
import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.jetbrains.spek.api.dsl.it

class HelloAppTests: Spek({
    describe("HelloAppTests") {
        val embeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        //Creating a low level HTTP-client using inbuilt server
        var client : HttpClient  = HttpClient.create(embeddedServer.url)

        //Creating our own Client
        val myClient = embeddedServer.applicationContext.getBean(HelloClient::class.java)


        //testing myclient
        it("should return 'Hello User1!'"){

            assertEquals(myClient.index("User1").blockingGet(), "Hello User1")
        }

       // testing using micronaut client
        on("test /hello/User2 responds Hello User2") {
            var rsp : String = client.toBlocking().retrieve("/hello/User2")
            assertEquals(rsp, "Hello User2")
        }


        on("test /request/hello?name=Fred responds Hello User3") {
            var rsp : String = client.toBlocking().retrieve("/request/hello?name=User3")
            assertEquals(rsp, "Hello User3!!")
        }
        // Close embedded server after all the tests
        afterGroup {
            client.close()
            embeddedServer.close()
        }

    }


})




