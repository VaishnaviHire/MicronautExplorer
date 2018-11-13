package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lexample/micronaut/AuthenticationProviderUserPassword;", "Lio/micronaut/security/authentication/AuthenticationProvider;", "()V", "authenticate", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/security/authentication/AuthenticationResponse;", "authenticationRequest", "Lio/micronaut/security/authentication/AuthenticationRequest;", "micronautJWT"})
@javax.inject.Singleton()
public final class AuthenticationProviderUserPassword implements io.micronaut.security.authentication.AuthenticationProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.security.authentication.AuthenticationResponse> authenticate(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.authentication.AuthenticationRequest<?, ?> authenticationRequest) {
        return null;
    }
    
    public AuthenticationProviderUserPassword() {
        super();
    }
}