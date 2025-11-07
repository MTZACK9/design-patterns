package com.mtzack9.gof.structural.proxy.proxy;

import com.mtzack9.gof.structural.proxy.services.IService;

public class SecuredProxy implements IService {

    private IService target;
    private String password;
    @Override
    public double compute(int t) {
        if (password.equals("1234")){
            return target.compute(t);
        }
        throw new RuntimeException("Not Authorized");
    }

    public void setTarget(IService service) {
        this.target = service;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
