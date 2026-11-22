package com.example.hawem_nourelhouda_tp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_welcome extends AppCompatActivity {
    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);
          txtWelcome=findViewById(R.id.txtWelcome);
          String nom =getIntent().getStringExtra("name");
         String prenom =getIntent().getStringExtra("lastname");
        String mail =getIntent().getStringExtra("mymail");

        String message= " bienvenue " +nom+ " " + prenom + " ,\n"
                +"c'est la deuxieme activité.\n"
                +"vous serez bientot contacté sur :" +mail+ " ";
        txtWelcome.setText(message);


    }
}