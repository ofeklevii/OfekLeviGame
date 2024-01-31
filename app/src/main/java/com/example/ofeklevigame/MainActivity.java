package com.example.ofeklevigame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tV1;
    private TextView tV2;
    private TextView tV3;
    private TextView tV4;
    private TextView tV5;
    private TextView tV6;
    private EditText eT1;
    private EditText eT2;
    private EditText eT3;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private ImageView iV1;
    private ImageView iV2;
    private ImageView iV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        tV6 = findViewById(R.id.tV6);
        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);

        int random_number1 = get_randomNum();
        int random_number2 = get_randomNum();
        int random_number3 = get_randomNum();
        int random_number4 = get_randomNum();
        int random_number5 = get_randomNum();
        int random_number6 = get_randomNum();

        tV1.setText("" + random_number1);
        tV2.setText("" + random_number2);
        tV3.setText("" + random_number3);
        tV4.setText("" + random_number4);
        tV5.setText("" + random_number5);
        tV6.setText("" + random_number6);
    }

    public static int get_randomNum()
    {
        Random rand = new Random();
        return (int)Math.floor(Math.random() * (89) + 10);
    }
    //
}