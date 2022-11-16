package com.example.firebase;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnxacnhan;
    private CheckBox remeberpass;
    private EditText username,pass;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sharedPreferences=getSharedPreferences("datalogin",MODE_PRIVATE);
        anhxa();
        username.setText(sharedPreferences.getString("taikhoan",""));
        pass.setText(sharedPreferences.getString("matkhau",""));
        remeberpass.setChecked(sharedPreferences.getBoolean("check",false));
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && pass.getText().toString().equals("12345"))
                {
                    new AlertDialog.Builder(LoginActivity.this).setIcon(R.drawable.ic_baseline_check_24)
                            .setTitle("WELCOME")
                            .setMessage("Login success")
                            .setNegativeButton("ok",null)
                            .show();
                    Toast.makeText(LoginActivity.this,"Login success",Toast.LENGTH_LONG);
                    String user =username.getText().toString().trim();
                    String password =pass.getText().toString().trim();
                    if(remeberpass.isChecked()){
                        SharedPreferences.Editor editor= sharedPreferences.edit();
                        editor.putString("taikhoan",user);
                        editor.putString("matkhau",password);
                        editor.putBoolean("check",true);
                        editor.commit();
                    }else {
                        SharedPreferences.Editor editor= sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("check");
                        editor.commit();
                    }
                    Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else new AlertDialog.Builder(LoginActivity.this).setIcon(R.drawable.ic_baseline_error_outline_24)
                        .setTitle("WRONG USERNAME OR PASSWORD")
                        .setMessage("Please enter true")
                        .setNegativeButton("Back",null)
                        .show();



            }

        });
    }
    private void anhxa(){
        btnxacnhan = (Button) findViewById(R.id.btn_Login);
        remeberpass = (CheckBox) findViewById(R.id.CkBox);
        username = (EditText) findViewById(R.id.edt_User);
        pass = (EditText) findViewById(R.id.edt_Pass);
    }
}
