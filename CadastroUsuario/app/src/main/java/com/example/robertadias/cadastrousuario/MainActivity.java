package com.example.robertadias.cadastrousuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_cadastro = (Button) findViewById(R.id.bt_cadastro);
        bt_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv_email = (TextView) findViewById(R.id.tEmail);
                TextView tv_login = (TextView) findViewById(R.id.tLogin);
                TextView tv_senha = (TextView) findViewById(R.id.tSenha);
                TextView tv_confirmaSenha = (TextView) findViewById(R.id.tConfirmasenha);
                String login = tv_login.getText().toString();
                String senha = tv_senha.getText().toString();
                String confirmaSenha = tv_confirmaSenha.getText().toString();
                String email = tv_email.getText().toString();
                if ((senha.length() < 8) && (!senha.equalsIgnoreCase(confirmaSenha))){
                    alert ("Sua senha deve conter no mínimo 8 digitos e os dados do campo de confirmaçao devem ser iguais ao de senha");
                }else if (senha.length() <8) {
                    alert("A senha deve conter no mínimo 8 diígitos");
                }else if (!senha.equalsIgnoreCase(confirmaSenha)) {
                    alert ("Confirmaçao de senha incorreta");
                }else if ((senha.length() > 7) && (senha.equalsIgnoreCase(confirmaSenha))){
                    alert("Usuario cadastrado com sucesso!");
                }
            }
        });
    }

    private void alert (String a){
        Toast.makeText(this, a, Toast.LENGTH_LONG).show();

    }
}
