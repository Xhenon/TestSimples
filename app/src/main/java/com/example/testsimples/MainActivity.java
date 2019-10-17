package com.example.testsimples;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /*float time = 0;

    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {

            Button b = (Button) findViewById(R.id.button1);
            time +=0.05;
            b.setTextSize((float)Math.abs(Math.sin(time))*200);

            handler.postDelayed(this , 40);
        }
    };*/

    String mode = "default";
    boolean comma = false;
    float res = 0;
    float current =0;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //handler.post(r);

        Button b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                if(comma) {

                }

                else {
                    current*=10;
                }

                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=1;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=2;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=3;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=4;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }            }
        });

        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=5;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=6;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=7;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=8;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current*=10;
                current+=9;
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(Float.toString(current));

                if(mode =="waiting") {
                    mode = "default";
                    res = 0;
                }
            }
        });

        Button bEqual = (Button) findViewById(R.id.buttonEqual);
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode == "add") {
                    res+=current;
                    current = 0;
                    mode = "waiting";
                }

                else if (mode == "subtract") {
                    res-= current;
                    current = 0;
                    mode = "waiting";
                }
                else if (mode == "divide") {
                    res/=current;
                    current = 0;
                    mode = "waiting";
                }

                else if (mode =="multiply") {
                    res*= current;
                    current = 0;
                    mode = "waiting";
                }

                TextView tv = (TextView) findViewById(R.id.textView);

                if(mode == "default") {
                    tv.setText(Float.toString(current));
                }

                else {
                    tv.setText(Float.toString(res));
                }


            }
        });

        Button bPlus = (Button) findViewById(R.id.buttonPlus);
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current!=0) {
                    mode = "add";
                    res = current;
                    current = 0;
                }

                else if (res != 0) {
                    mode = "add";
                }
            }
        });

        Button bMinus = (Button) findViewById(R.id.buttonMinus);
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current!=0) {
                    mode = "subtract";
                    res = current;
                    current = 0;
                }

                else if (res != 0) {
                    mode = "subtract";
                }
            }
        });

        Button bDivide = (Button) findViewById(R.id.buttonDivide);
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current!=0) {
                    mode = "divide";
                    res = current;
                    current = 0;
                }

                else if (res != 0) {
                    mode = "divide";
                }
            }
        });

        Button bMultiply = (Button) findViewById(R.id.buttonMultiply);
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current!=0) {
                    mode = "multiply";
                    res = current;
                    current = 0;
                }

                else if (res != 0) {
                    mode = "multiply";
                }
            }
        });

        Button bClear = findViewById(R.id.buttonC);
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                current = 0;
                TextView tv = findViewById(R.id.textView);
                tv.setText(Float.toString(current));
                mode = "default";
            }
        });
    }

}
