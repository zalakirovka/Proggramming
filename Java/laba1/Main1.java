package org.example.laba.laba1;

import org.example.laba.laba1.Abstract_Fabric.AbstractFabricService;
import org.example.laba.laba1.Builder.BuilderService;
import org.example.laba.laba1.Fabric_method.FabricMethodService;
import org.example.laba.laba1.Singletone.SingletonService;

public class Main1 {
    public static void main(String[] args) throws Exception {

        BuilderService builder = new BuilderService();
        builder.exec();

        AbstractFabricService abstractFabricService = new AbstractFabricService();
        abstractFabricService.exec();

        FabricMethodService fabricMethodService = new FabricMethodService();
        fabricMethodService.exec();

        SingletonService singletonService = new SingletonService();
        singletonService.exec();

    }
}
