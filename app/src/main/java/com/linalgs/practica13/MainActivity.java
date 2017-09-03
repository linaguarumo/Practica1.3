package com.linalgs.practica13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double resultado, valor1, valor2;
    private boolean operador1, operador2, igual, inicio = true;
    private String tipoOperaciones;
    private TextView Tauxiliar, Tresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tauxiliar = (TextView) findViewById(R.id.Tauxiliar);
        Tresultado = (TextView) findViewById(R.id.Tresultado);
    }
    private void Operaciones(double valor1,double valor2){
        switch (tipoOperaciones){
            case "+":
                resultado=valor1+valor2;
                Tresultado.setText(resultado + (""));
                valor1=Double.parseDouble(Tresultado.getText().toString());
                break;
            case "-":
                resultado=valor1-valor2;
                Tresultado.setText(resultado +(""));
                valor1=Double.parseDouble(Tresultado.getText().toString());
                break;
            case "*":
                resultado=valor1*valor2;
                Tresultado.setText(resultado+(""));
                valor1=Double.parseDouble(Tresultado.getText().toString());
                break;
            case "/":
                if (valor2==0){
                    Tresultado.setText("Error");
                    break;
                }else{
                    resultado=valor1/valor2;
                    Tresultado.setText(resultado+(""));
                    valor1=Double.parseDouble(Tresultado.getText().toString());
                    break;
                }
        }
    }

    public void Button0(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("0");
            inicio=false;
            }else{
            Tresultado.setText(Tresultado.getText()+"0");
        }
    }
    public void Button1(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("1");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"1");
        }
    }
    public void Button2(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("2");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"2");
        }
    }
    public void Button3(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("3");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"3");
        }
    }
    public void Button4(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("4");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"4");
        }
    }
    public void Button5(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("5");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"5");
        }
    }
    public void Button6(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("6");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"6");
        }
    }
    public void Button7(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("7");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"7");
        }
    }
    public void Button8(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("8");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"8");
        }
    }
    public void Button9(View view){
        if (inicio==true){
            Tresultado.setText("");
            Tresultado.setText("9");
            inicio=false;
        }else{
            Tresultado.setText(Tresultado.getText()+"9");
        }
    }
    public void ButtonPunto(View view){
        if (".".contains(Tresultado.getText())){

        }else{
            Tresultado.setText(Tresultado.getText()+".");
            inicio=false;
        }
    }

    public void ButtonMas(View view){
        igual=true;
        inicio=true;
        if(operador1=true){
            valor1=Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText()+("+"));
            operador1=false;
        }else {
            if (operador2==true){
                valor2=Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText()+("+"));
                operador2=false;
            }else{
                Tauxiliar.setText(Tresultado.getText()+("+"));
                Operaciones(resultado,valor2);
            }
        }
        tipoOperaciones="+";
    }

    public void ButtonMenos(View view){
        igual=true;
        inicio=true;
        if(operador1=true){
            valor1=Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText()+("-"));
            operador1=false;
        }else {
            if (operador2==true){
                valor2=Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText()+("-"));
                operador2=false;
            }else{
                Tauxiliar.setText(Tresultado.getText()+("-"));
                Operaciones(resultado,valor2);
            }
        }
        tipoOperaciones="-";
    }

    public void ButtonMult(View view){
        igual=true;
        inicio=true;
        if(operador1=true){
            valor1=Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText()+("*"));
            operador1=false;
        }else {
            if (operador2==true){
                valor2=Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText()+("*"));
                operador2=false;
            }else{
                Tauxiliar.setText(Tresultado.getText()+("*"));
                Operaciones(resultado,valor2);
            }
        }
        tipoOperaciones="*";
    }

    public void ButtonDiv(View view){
        igual=true;
        inicio=true;
        if(operador1=true){
            valor1=Double.parseDouble(Tresultado.getText().toString());
            Tauxiliar.setText("");
            Tauxiliar.setText(Tresultado.getText()+("/"));
            operador1=false;
        }else {
            if (operador2==true){
                valor2=Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText("");
                Tauxiliar.setText(Tresultado.getText()+("/"));
                operador2=false;
            }else{
                Tauxiliar.setText(Tresultado.getText()+("/"));
                Operaciones(resultado,valor2);
            }
        }
        tipoOperaciones="/";
    }

    public void ButtonIgual(View view){
        inicio=true;
        operador1=true;
        if(igual=true){
            if(tipoOperaciones==null){
            }else {
                valor2=Double.parseDouble(Tresultado.getText().toString());
                Tauxiliar.setText(Tauxiliar.getText()+Tresultado.getText().toString());
                Operaciones(valor1,valor2);
            }
            igual=false;
        }
        else {
            Tauxiliar.setText("");
            Operaciones(valor1,valor2);
        }
    }


}
