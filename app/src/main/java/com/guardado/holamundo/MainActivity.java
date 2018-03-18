package com.guardado.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Declaramos los controles que usaremos
     //TextView
    TextView txvMensaje;
    //EditText
    EditText txtUsuario;
    //Button
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscaremos cada uno de los elementos para poder trabajarlos
        this.txvMensaje = (TextView) findViewById(R.id.txvMensaje);
        this.txtUsuario = (EditText) findViewById(R.id.txtUser);
        this.btnClick = (Button) findViewById(R.id.btnClick);

        //activaremos el evento de click en el boton
        this.btnClick.setOnClickListener(this);
    }


    //Por medio de este metodo le daremos la funcionalidad al boton

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnClick:
                //en una variable extreamos el contenido del edittext
                String user = this.txtUsuario.getText().toString(); // lo convertimos a cadena
                //cambiamos el conetenido del textview
                this.txvMensaje.setText(user);

                break;
        }
    }
}
