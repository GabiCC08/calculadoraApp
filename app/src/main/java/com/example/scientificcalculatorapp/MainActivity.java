package com.example.scientificcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.scientificcalculatorapp.R.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // Inicializacion de las variables
    boolean raizene = false;
    boolean in = false;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divide = false;
    boolean exp  = false;
    boolean ra = false;
    boolean targ = false;
    boolean cos = false;
    boolean se = false;
    boolean log = false;
    boolean porc = false;
    Double[] numero = new Double [20];
    Double resultado ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciar los botones numericos para setear el OnClickListener
        Button n0 = findViewById(id.btn0);
        n0.setOnClickListener(this);

        Button n1 =  findViewById(id.btn1);
        n1.setOnClickListener(this);

        Button n2 =  findViewById(id.btn2);
        n2.setOnClickListener(this);

        Button n3 =  findViewById(id.btn3);
        n3.setOnClickListener(this);

        Button n4 =  findViewById(id.btn4);
        n4.setOnClickListener(this);

        Button n5 =  findViewById(id.btn5);
        n5.setOnClickListener(this);

        Button n6 =  findViewById(id.btn6);
        n6.setOnClickListener(this);

        Button n7 =  findViewById(id.btn7);
        n7.setOnClickListener(this);

        Button n8 =  findViewById(id.btn8);
        n8.setOnClickListener(this);

        Button n9 =  findViewById(id.btn9);
        n9.setOnClickListener(this);

        Button punto =  findViewById(id.btnpunto);
        punto.setOnClickListener(this);

        Button igual =  findViewById(id.btnigual);
        igual.setOnClickListener(this);

        Button raiz =  findViewById(id.btnraiz);
        raiz.setOnClickListener(this);

        Button sumar =  findViewById(id.btnsumar);
        sumar.setOnClickListener(this);

        Button restar =  findViewById(id.btnrestar);
        restar.setOnClickListener(this);

        Button dividir =  findViewById(id.btndividir);
        dividir.setOnClickListener(this);

        Button multiplicar =  findViewById(id.btnmulti);
        multiplicar.setOnClickListener(this);

        Button borrar =  findViewById(id.btnBorrar);
        borrar.setOnClickListener(this);

        Button exp =  findViewById(id.btnExp);
        exp.setOnClickListener(this);

        Button seno =  findViewById(id.btnseno);
        seno.setOnClickListener(this);

        Button coseno =  findViewById(id.btncoseno);
        coseno.setOnClickListener(this);

        Button targente =  findViewById(id.btnTargente);
        targente.setOnClickListener(this);

        Button delete =  findViewById(id.btndelete);
        delete.setOnClickListener(this);

        Button pocentaje =  findViewById(id.btnporcentaje);
        pocentaje.setOnClickListener(this);

        Button log =  findViewById(id.btnLog);
        log.setOnClickListener(this);

        Button in =  findViewById(id.btnIn);
        in.setOnClickListener(this);

        Button raizen =  findViewById(id.btnRaizEnes);
        raizen.setOnClickListener(this);
    }

    //Operaciones de la calculadora
    @Override
    public void onClick(View v) {
        TextView pantalla = findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
            switch (seleccion) {
                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a + "2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnLog:
                    log = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log10(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnIn:
                    in = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnBorrar:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btncoseno:
                    cos=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btndelete:
                    String cadena = a.substring(0, a.length() - 1);
                    pantalla.setText(cadena);
                    break;
                case R.id.btndividir:
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnExp:
                    exp=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnigual:
                    numero[1]= Double.parseDouble(a);
                    if(suma) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide){
                        resultado = numero[0]/ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (porc){
                        resultado=(numero[0]*100)/numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (exp){
                        resultado = Math.pow(numero[0],numero[1]);
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (raizene){
                        resultado=Math.pow(numero[0], 1 / numero[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp  = false;
                    ra = false;
                    targ = false;
                    cos = false;
                    se = false;
                    log = false;
                    porc = false;
                    in = false;
                    raizene = false;
                    break;
                case R.id.btnmulti:
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnpunto:
                    pantalla.setText(a+".");
                    decimal = true;
                    if(!decimal){
                        pantalla.setText(a+".");
                    }else{
                        return;
                    }
                    break;
                case R.id.btnraiz:
                    ra = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal=false;
                    break;
                case R.id.btnRaizEnes:
                    raizene = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal=false;
                    break;
                case R.id.btnrestar:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnseno:
                    se=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btnporcentaje:
                    porc=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnsumar:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnTargente:
                    targ=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
            }
        }catch(Exception e){
            pantalla.setText("Math Error");
        };

    }
}
