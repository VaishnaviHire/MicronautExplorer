package example.micronaut


import io.micronaut.security.authentication.AuthenticationFailed
import io.micronaut.security.authentication.AuthenticationProvider
import io.micronaut.security.authentication.AuthenticationRequest
import io.micronaut.security.authentication.AuthenticationResponse
import io.micronaut.security.authentication.UserDetails
import io.reactivex.Flowable
import org.reactivestreams.Publisher

import javax.inject.Singleton
import java.util.ArrayList

@Singleton
class AuthenticationProviderUserPassword : AuthenticationProvider {

   override fun authenticate(authenticationRequest: AuthenticationRequest<*,*>): Publisher<AuthenticationResponse> {
        System.out.println(authenticationRequest)
        return if (authenticationRequest.getIdentity().equals("vaish") && authenticationRequest.getSecret().equals("1234")) {
            Flowable.just(UserDetails(authenticationRequest.getIdentity() as String, ArrayList<String>()))
        } else Flowable.just(AuthenticationFailed())
    }
}
