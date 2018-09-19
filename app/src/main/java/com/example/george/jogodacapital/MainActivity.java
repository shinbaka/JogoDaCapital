package com.example.george.jogodacapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    Random r;
    Estados estados[] = new Estados[5];
    ArrayList<Estados> lista = new ArrayList<Estados>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Estados e = new Estados();
        e.setNome("Paraná");
        e.setCidade("Curitiba");
        lista.add(0,e);
        estados[0] = e;
        Estados e2 = new Estados();
        e2.setNome("São Paulo");
        e2.setCidade("São Paulo");
        lista.add(1,e2);
        estados[1] = e2;
        Estados e3 = new Estados();
        e3.setNome("Amazonas");
        e3.setCidade("Manaus");
        estados[2] = e3;
        lista.add(2,e3);
        Estados e4 = new Estados();
        e4.setNome("Mato Grosso do Sul");
        e4.setCidade("Campo Grande");
        estados[3] = e4;
        lista.add(3,e4);
        Estados e5 = new Estados();
        e5.setNome("Sergipe");
        e5.setCidade("Aracaju");
        estados[4] = e5;
        lista.add(4,e5);
        lista.get(num).getNome();
        r = new Random();
        num = r.nextInt(4);
        System.out.println(num);
        TextView question = (TextView)findViewById(R.id.question);
        String pergunta = "Qual a capital do " + estados[num].getNome().toString() +"?";
        question.setText(pergunta);

    }



    public void responder(View view){


        TextView answer = (TextView)findViewById(R.id.answer);
        EditText input = (EditText)findViewById(R.id.check);

        //(estados[2].getCidade().equals(resposta))
        if(input.length() == 0){
            Toast.makeText(this, "Insira alguma resposta", Toast.LENGTH_SHORT).show();
        } else {
            String correto;
            String resposta = input.getText().toString();
            if(lista.get(num).getCidade().equals(resposta)){
                correto = "ACERTO MIZERAVI";
            } else{
                correto = "ERROUUU";
            }
            answer.setText(correto);
        }
    }
}
