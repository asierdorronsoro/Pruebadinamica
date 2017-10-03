package com.example.usuario.pruebadinamica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
//https://myaccount.google.com/lesssecureapps?pli=1 solucion stackoverflow link
//https://stackoverflow.com/questions/25341198/javax-mail-authenticationfailedexception-is-thrown-while-sending-email-in-java
public class MainActivity extends AppCompatActivity {

    private LinearLayout parentLinearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll);
        parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);
        aniadir_conbucle("Primeros");
        aniadir_conbucle("Segundos");
        aniadir_conbucle("Postres");
    }

    public void aniadir_conbucle(String nombre){

        LayoutInflater inflater1 = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView1 = inflater1.inflate(R.layout.titulos, null);

        EditText z =(EditText) rowView1.findViewById(R.id.Seccion);
        z.setText(nombre);
        z.setFocusable(false);
        z.setClickable(false);

        parentLinearLayout.addView(rowView1, parentLinearLayout.getChildCount());

        for(int i=0;i<5;i++){

            System.out.println(i);
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final View rowView = inflater.inflate(R.layout.field, null);
            TextView a =(TextView) rowView.findViewById(R.id.plato);
            a.setText(Integer.toString(i));
            // Add the new row before the add field button.
            parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount());
        }
    }
}