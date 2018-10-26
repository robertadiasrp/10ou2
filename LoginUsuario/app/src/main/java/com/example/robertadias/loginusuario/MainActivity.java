package com.example.robertadias.loginusuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_login = (TextView) findViewById(R.id.tv_login);
                TextView tv_senha = (TextView) findViewById(R.id.tv_senha);
                String login = tv_login.getText().toString();
                String senha = tv_senha.getText().toString();
                if (login.equals("testeroberta") && senha.equals("1234")) {
                    alert("Login realizado com sucesso");
                }else{
                    alert("Login ou senha incorretos");
                }
            }
        });
    }

    private void alert (String s){
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();


    }
}
