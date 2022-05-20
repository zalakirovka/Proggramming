package org.example.laba.laba3;

import org.example.laba.laba3.Chain.ChainService;
import org.example.laba.laba3.Chain.Request;
import org.example.laba.laba3.Iterator.ItemType;
import org.example.laba.laba3.Iterator.TreasureChest;
import org.example.laba.laba3.Iterator.TreasureChestItemIterator;
import org.example.laba.laba3.Strategy.CommaSeparatedStrategy;
import org.example.laba.laba3.Strategy.SemicolonSeparatedStrategy;
import org.example.laba.laba3.Strategy.StrategyServiceImpl;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2","3","4","5");
        StrategyServiceImpl strategyService = new StrategyServiceImpl(new SemicolonSeparatedStrategy());
        StrategyServiceImpl strategyService1 = new StrategyServiceImpl(new CommaSeparatedStrategy());
        System.out.println(strategyService.exec(list));
        System.out.println(strategyService1.exec(list));


        TreasureChest treasureChest = new TreasureChest();
        TreasureChestItemIterator treasureChestItemIterator = new TreasureChestItemIterator(treasureChest, ItemType.ANY);
        while (treasureChestItemIterator.hasNext()) {
            System.out.println(treasureChestItemIterator.next());

        }

        String getmethod = "method:GET \npath:/user/service/info \nsession:session-example";
        ChainService chainService = new ChainService();
        Request request = chainService.exec(getmethod);
        System.out.println("METHOD: " + request.getMethod());
        System.out.println("PATH: " + request.getPath());
        System.out.println("SESSION: " + request.getSession());


    }
}