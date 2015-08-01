package com.example.suraphol.localization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akexorcist.localizationactivity.LocalizationActivity;

import java.util.Locale;

public class MainActivity extends LocalizationActivity {

    private Button btnT, btnF, btnE, btnA;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setDefaultLanguage(Locale.JAPAN.toString());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnT = (Button) findViewById(R.id.btnThai);
        btnF = (Button) findViewById(R.id.btnF);
        btnA = (Button) findViewById(R.id.btnA);
        btnE = (Button) findViewById(R.id.btnEng);

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage("th");
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage(Locale.CANADA_FRENCH.toString());
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage(Locale.JAPAN.toString());
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLanguage("en_US");
            }
        });
    }
}
