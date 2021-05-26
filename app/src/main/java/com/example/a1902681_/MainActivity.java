package com.example.a1902681_;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Integer;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText seat11, seat22;
    Button ok;
    Button[][] seats = new Button[5][10];
    int[][] ids={
            {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn3,R.id.btn4,
                    R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9},
            {R.id.btn10,R.id.btn11,R.id.btn12,R.id.btn13,R.id.btn13,R.id.btn14,
                    R.id.btn15,R.id.btn16,R.id.btn17,R.id.btn18,R.id.btn19},
            {R.id.btn20,R.id.btn21,R.id.btn22,R.id.btn23,R.id.btn23,R.id.btn24,
                    R.id.btn25,R.id.btn26,R.id.btn27,R.id.btn28,R.id.btn29},
            {R.id.btn30,R.id.btn31,R.id.btn32,R.id.btn33,R.id.btn33,R.id.btn34,
                    R.id.btn35,R.id.btn36,R.id.btn37,R.id.btn38,R.id.btn39},
            {R.id.btn40,R.id.btn41,R.id.btn42,R.id.btn43,R.id.btn43,R.id.btn44,
                    R.id.btn45,R.id.btn46,R.id.btn47,R.id.btn48,R.id.btn49}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seat11 = findViewById(R.id.seat1);
        seat22 = findViewById(R.id.seat2);
        ok = findViewById(R.id.ok);

        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                this.seats[i][j]=(Button)findViewById(ids[i][j]);
            }
        }

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String su1 = seat11.getText().toString();
                String su2 = seat22.getText().toString();

                int num1=Integer.parseInt(su1);
                int num2=Integer.parseInt(su2);

                Toast.makeText(getApplicationContext(),"예매되었습니다",Toast.LENGTH_SHORT).show();
                seats[num1-1][num2-1].setText("X");
                seats[num1-1][num2-1].setBackgroundColor(Color.YELLOW);
                seats[num1-1][num2-1].setTextColor(Color.RED);


            }
        });

    }
}


