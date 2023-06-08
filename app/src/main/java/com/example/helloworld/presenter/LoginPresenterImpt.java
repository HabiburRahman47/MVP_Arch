package com.example.helloworld.presenter;

import android.content.Intent;

import com.example.helloworld.model.IUser;
import com.example.helloworld.model.UserImpt;
import com.example.helloworld.view.ILoginView;

public class LoginPresenterImpt implements ILoginPresenter{

    private ILoginView loginView;

    public LoginPresenterImpt(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void doLogin(String email, String password) {

        IUser user = new UserImpt(email,password);
        int login_code = user.checkUserValidity();
        if (login_code == 0){
            loginView.onLoginError("Please, enter your email.");
        }
        else if (login_code == 1){
            loginView.onLoginError("Please, enter valid email.");
        } else if (login_code == 2) {
            loginView.onLoginError("Please, enter your passwrod.");
        } else if (login_code == 3) {
            loginView.onLoginError("Password should be more than 6 character.");
        }else loginView.onLoginSuccess("Login Successfull.");


    }

    @Override
    public void setProgessBarVisibility(int visibility) {
        loginView.onSetProgessBarVisibility(visibility);

    }
}
