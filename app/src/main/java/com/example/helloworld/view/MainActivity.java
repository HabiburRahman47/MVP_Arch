package com.example.helloworld.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;
import com.example.helloworld.presenter.ILoginPresenter;
import com.example.helloworld.presenter.LoginPresenterImpt;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements ILoginView{
    private ProgressBar progressBar;
    private TextInputEditText email,password;
    private Button loginBtn;
    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.eamilET);
        password = findViewById(R.id.passwordET);;
        loginBtn = findViewById(R.id.loginBtn);
        progressBar = findViewById(R.id.progress_bar);

        loginPresenter = new LoginPresenterImpt(this);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.doLogin(email.getText().toString().trim(),password.getText().toString().trim());
//                Toast.makeText(MainActivity.this,email.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void onLoginSuccess(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSetProgessBarVisibility(int visibility) {

    }
}