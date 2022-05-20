package org.example.laba.laba3.Strategy;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface StrategyService {
    String exec(List<String> strings);

    StrategyService setStrategy(@NotNull Strategy strategy);
}
