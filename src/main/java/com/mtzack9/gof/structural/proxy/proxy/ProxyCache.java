package com.mtzack9.gof.structural.proxy.proxy;

import com.mtzack9.gof.structural.proxy.services.IService;
import com.mtzack9.gof.structural.proxy.services.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {
    private ServiceImpl service;
    private Map<Integer, Double> cache = new HashMap<>();

    public ProxyCache() {}
    public ProxyCache(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public double compute(int t) {
        if (service == null) service = new ServiceImpl();
        if (!cache.containsKey(t)) {
           double res = service.compute(t);
           cache.put(t, res);
           return res;
        }
        return cache.get(t);
    }

    public void setService(ServiceImpl service) {
        this.service = service;
    }
}
