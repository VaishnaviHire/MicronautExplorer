package hello.world;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007\u00a8\u0006\t"}, d2 = {"Lhello/world/RequestController;", "", "()V", "hello", "Lio/micronaut/http/HttpResponse;", "", "request", "Lio/micronaut/http/HttpRequest;", "html", "hello-world"})
@io.micronaut.http.annotation.Controller(value = "/request")
public final class RequestController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/hello")
    public final io.micronaut.http.HttpResponse<java.lang.String> hello(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.HttpRequest<java.lang.String> request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/")
    @io.micronaut.http.annotation.Produces(value = {"text/html"})
    public final java.lang.String html() {
        return null;
    }
    
    public RequestController() {
        super();
    }
}