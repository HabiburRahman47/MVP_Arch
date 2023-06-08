package com.example.helloworld.view;

public interface ILoginView {
    void onLoginSuccess(String msg);
    void onLoginError(String msg);
    void onSetProgessBarVisibility(int visibility);
}
