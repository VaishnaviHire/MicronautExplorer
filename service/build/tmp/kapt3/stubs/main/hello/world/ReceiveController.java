package hello.world;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u00120\u0004\u00a2\u0006\r\b\u0006\u0012\t\b\u0007\u0012\u0005\b\u0003\u0010\u0080\u0010H\u0007\u00a8\u0006\b"}, d2 = {"Lhello/world/ReceiveController;", "", "()V", "echo", "", "text", "Ljavax/validation/constraints/Size;", "max", "hello-world"})
@io.micronaut.http.annotation.Controller(value = "/post")
public final class ReceiveController {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    public final java.lang.String echo(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    public ReceiveController() {
        super();
    }
}