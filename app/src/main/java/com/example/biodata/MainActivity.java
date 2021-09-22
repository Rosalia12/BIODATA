package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bAlamat=(Button)findViewById(R.id.buttonAlamat);

        bAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:Kec.Pinggir,Kabupaten Bengkalis,Riau");
                Intent mapIntent=new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                if (mapIntent.resolveActivity(getPackageManager()) !=null){
                    startActivity(mapIntent);
                }
            }
        });



    }
}