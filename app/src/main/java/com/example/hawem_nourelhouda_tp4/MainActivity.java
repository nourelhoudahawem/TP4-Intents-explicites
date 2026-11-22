package com.example.hawem_nourelhouda_tp4;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    EditText editNom , editPrenom , editMail ;
    Button btnEnvoyer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNom=findViewById(R.id.editNom);
        editPrenom=findViewById(R.id.editPrenom);
        editMail=findViewById(R.id.editMail);
        btnEnvoyer=findViewById(R.id.btnEnvoyer);

        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom=editNom.getText().toString();
                String prenom=editPrenom.getText().toString();
                String mail=editMail.getText().toString();

                Intent myIntent=new Intent(MainActivity.this,activity_welcome.class);
                myIntent.putExtra("name",nom);
                myIntent.putExtra("lastname",prenom);
                myIntent.putExtra("mymail",mail);
                startActivity(myIntent);
            }
        });
    }
}
