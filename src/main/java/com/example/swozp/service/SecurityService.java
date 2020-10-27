package com.example.swozp.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String email, String password);
}