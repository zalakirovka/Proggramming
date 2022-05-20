package org.example.laba.laba3.Chain;
import org.jetbrains.annotations.NotNull;

public class MethodChainHandler extends AbstractChainHandler {

    private static final String KEY = "method";

    @Override
    void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setMethod(request.getHeaders().get(KEY));
    }

}