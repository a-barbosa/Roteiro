package com.example.vsouz.roteiro1;

import  android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText nNome;
    private EditText nSobrenome;
    private EditText nUsuario;
    private EditText nSenha;
    private EditText nConfirmarsenha;
    private Button nCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        nNome = (EditText)findViewById(R.id.nome);
        nSobrenome = (EditText)findViewById(R.id.sobrenome);
        nUsuario = (EditText)findViewById(R.id.usuario);
        nSenha = (EditText)findViewById(R.id.senha);
        nConfirmarsenha = (EditText)findViewById(R.id.confirmarsenha);
        nCadastrar = (Button)findViewById(R.id.cadastrar);


        nCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();
            }
        });


    }

    private void cadastrar() {

        String nome = nNome.getText().toString();
        String sobrenome = nSobrenome.getText().toString();
        String usuario = nUsuario.getText().toString();
        String senha = nSenha.getText().toString();
        String confirmarsenha = nConfirmarsenha.getText().toString();


        if(senha.equalsIgnoreCase(confirmarsenha)){
            Intent i = new Intent(this,MainActivity.class);
            Bundle b = new Bundle();
            b.putString("Nome", nome);
            i.putExtras(b);
            startActivity(i);
            finish();
        }
        else{

            View focus = null;

            if (TextUtils.isEmpty(nome)){
                nNome.setError("Campo Vazio");
                focus = nNome;
                focus.requestFocus();
            }

            if (TextUtils.isEmpty(sobrenome)){
                nSobrenome.setError("Campo Vazio");
                focus = nSobrenome;
                focus.requestFocus();
            }
            if (TextUtils.isEmpty(usuario)){
                nUsuario.setError("Campo Vazio");
                focus = nUsuario;
                focus.requestFocus();
            }

            if (TextUtils.isEmpty(senha)){
                nSenha.setError("Campo Vazio");
                focus = nSenha;
                focus.requestFocus();
            }

            if (TextUtils.isEmpty(confirmarsenha)){
                nConfirmarsenha.setError("Campo Vazio");
                focus = nConfirmarsenha;
                focus.requestFocus();
            }
        }

    }


}
