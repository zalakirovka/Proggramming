package org.example.laba.laba3.Strategy;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class CommaSeparatedStrategy implements Strategy {

    @NotNull
    @Override
    public String process(
            @NotNull List<String> stings
    ) {
        return StringUtils.join(stings, ",");
    }

}

