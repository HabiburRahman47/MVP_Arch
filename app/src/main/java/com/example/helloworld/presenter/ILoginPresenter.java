package com.example.helloworld.presenter;

public interface ILoginPresenter {
    void doLogin(String email, String password);
    void setProgessBarVisibility(int visibility);
}
