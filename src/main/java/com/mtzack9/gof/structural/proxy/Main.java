package com.mtzack9.gof.structural.proxy;

import com.mtzack9.gof.structural.proxy.controller.Client;
import com.mtzack9.gof.structural.proxy.proxy.ProxyCache;
import com.mtzack9.gof.structural.proxy.proxy.SecuredProxy;
import com.mtzack9.gof.structural.proxy.services.IService;
import com.mtzack9.gof.structural.proxy.services.ServiceImpl;

public class Main {
    static void main() {
        /*
            Proxy is a structural design pattern that lets you provide a substitute or placeholder
            for another object. A proxy controls access to the original object, allowing you
            to perform something either before or after the request gets through to the original object.
        */

        Client client = new Client();
        //IService service = new ServiceImpl();

        System.out.println("----------------------");
        IService proxy = new ProxyCache();
        client.setService(proxy);
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(44));
        System.out.println("RES="+client.perform(44));

        System.out.println("----------------------");

        //IService service = new ServiceImpl();
        IService proxy1 = new ProxyCache();
        SecuredProxy securedProxy = new SecuredProxy();
        securedProxy.setTarget(proxy1);
        securedProxy.setPassword("1234");
        client.setService(securedProxy);

        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));
    }
}
