package com.example.myapplication;
import android.os.Bundle;

// librerie utilizzate  per associare gli elementi grafici
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    //dichiarazione degli oggetti utilizatti
    //riferimetno agli elementi
    EditText textView;
    Button btAura;
    ImageView ImmageTafOlio;

    // codice base quando si crea l' applicazione
    // quando si avvia l' activity viene eseguito il metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // richiamo della risorsa e del layout con findViewById @resurce.id.main
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // il codice va inserito qui


        //collegamento XML-->JAVA
        textView = findViewById(R.id.textView);
        btAura = findViewById(R.id.btAura);
        ImmageTafOlio = findViewById(R.id.ImmageTafOlio);


        btAura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messaggio = textView.getText().toString();

                if (messaggio.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Non è stato inserito nulla nella TextView", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, messaggio, Toast.LENGTH_SHORT).show();
                }
            }
        });
        // dove inserire funzioni e procedure
    }
}

