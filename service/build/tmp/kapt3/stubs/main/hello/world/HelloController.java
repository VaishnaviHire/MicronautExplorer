package hello.world;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lhello/world/HelloController;", "", "()V", "index", "", "name", "hello-world"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class HelloController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/hello/{name}")
    public final java.lang.String index(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public HelloController() {
        super();
    }
}