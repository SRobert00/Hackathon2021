package com.group17.CJTInvest.model.entity;

public enum Rol {
    ADMIN, UTILIZATOR;

    @Override
    public String toString() {
        return  "ROLE_"+this.name();
    }
}
