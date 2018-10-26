package com.example.robertadias.alterarsenha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_recuperar = (Button) findViewById(R.id.bt_recuperar);
        bt_recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tEmail = (EditText) findViewById(R.id.tEmail);
                String email = tEmail.getText().toString();
                if (email.equals("emaildeteste@uniriotec.br")){
                    alert ("Sua senha foi enviada para o email informado");
                }else {
                    alert ("Email nao cadastrado!");
                }
            }
        });


    }

    private void alert (String a) {
        Toast.makeText(this, a, Toast.LENGTH_LONG ).show();
    }
}
