package org.jrvivanco.mascotita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.widget.Toast;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(AcercaDeActivity.this, "Mensaje de prueba", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
