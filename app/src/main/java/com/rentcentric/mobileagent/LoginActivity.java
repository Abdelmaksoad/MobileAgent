package com.rentcentric.mobileagent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.rentcentric.mobileagent.util.InfoDialogs;
import com.rentcentric.mobileagent.util.asynctask.AsyncAdminLoginUtil;
import com.rentcentric.mobileagent.util.network.NetworkUtil;

public class LoginActivity extends Activity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener {

    private EditText username_et, password_et;
    private CheckBox show_pass_cb;
    private Button sign_in_bt;
    private TextView forget_pass_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
        setListener();
    }

    private void initialize() {
        username_et = (EditText) findViewById(R.id.username_et);
        password_et = (EditText) findViewById(R.id.password_et);
        show_pass_cb = (CheckBox) findViewById(R.id.show_pass_cb);
        sign_in_bt = (Button) findViewById(R.id.sign_in_bt);
        forget_pass_tv = (TextView) findViewById(R.id.forget_pass_tv);

        //username_et.setText(Constants.USERNAME);
        //password_et.setText(Constants.PASSWORD);

    }

    private void setListener() {
        sign_in_bt.setOnClickListener(this);
        forget_pass_tv.setOnClickListener(this);
        show_pass_cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_in_bt:
                signIn();
                break;
            case R.id.forget_pass_tv:
                break;
        }

    }

    private void signIn() {

        if(username_et.getText().toString().length()>0 && password_et.getText().toString().length()>0){
            if(NetworkUtil.isConnected(this)){
                new AsyncAdminLoginUtil(this, username_et.getText().toString(), password_et.getText().toString()).execute();
            }else{
                String dlg_msg = getResources().getString(R.string.error_no_internet);
                String dlg_title = getResources().getString(R.string.message_lbl);
                InfoDialogs.showInfoDialog(this, dlg_msg, dlg_title);
            }
        }else{
            String dlg_msg = getResources().getString(R.string.error_blank);
            String dlg_title = getResources().getString(R.string.message_lbl);
            InfoDialogs.showInfoDialog(this, dlg_msg, dlg_title);
        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
        super.onBackPressed();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            password_et.setTransformationMethod(null);
        } else {
            password_et.setTransformationMethod(new PasswordTransformationMethod());
        }

    }
}
