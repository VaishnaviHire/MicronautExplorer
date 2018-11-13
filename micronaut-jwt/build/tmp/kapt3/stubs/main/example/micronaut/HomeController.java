package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lexample/micronaut/HomeController;", "", "()V", "home", "", "principal", "Ljava/security/Principal;", "home$micronautJWT", "micronautJWT"})
@io.micronaut.http.annotation.Controller(value = "/")
@io.micronaut.security.Secured(value = {"isAuthenticated()"})
public final class HomeController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/")
    public final java.lang.String home$micronautJWT(@org.jetbrains.annotations.NotNull()
    java.security.Principal principal) {
        return null;
    }
    
    public HomeController() {
        super();
    }
}