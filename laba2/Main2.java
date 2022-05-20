package org.example.laba.laba2;

import org.example.laba.laba2.Adapter.AdapterService;
import org.example.laba.laba2.Bridge.BridgeService;
import org.example.laba.laba2.Proxy.ProxyService;

public class Main2 {
    public static void main(String[] args) {

          AdapterService adapterService = new AdapterService();
          adapterService.exec();

          BridgeService bridgeService = new BridgeService();
          bridgeService.exec();

          ProxyService proxyService = new ProxyService();
          proxyService.exec();
    }
}
