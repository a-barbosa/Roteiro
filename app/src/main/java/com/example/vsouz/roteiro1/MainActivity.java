package com.example.vsouz.roteiro1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nTexto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nTexto = (TextView) findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        String texto = bundle.getString("Nome");
        nTexto.setText("Olá " +texto+", seja bem vindo!");
    }
}
