package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,btn_7, btn_8, btn_9, btn_open, pls, minus, multiply, btn_divide, btn_cos, btn_sin, btn_tan, btn_decimal,btn_close, btn_pi, btn_clear,log, ln, btn_equals, btn_root;
    TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cos = findViewById(R.id.cos);btn_sin = findViewById(R.id.sin);btn_tan = findViewById(R.id.tan);
        btn_7 = findViewById(R.id.svn);btn_pi = findViewById(R.id.pi);btn_clear = findViewById(R.id.clr);
        log = findViewById(R.id.log);btn_8 = findViewById(R.id.ate);btn_9 = findViewById(R.id.nine);
        btn_divide = findViewById(R.id.div);ln = findViewById(R.id.ln);btn_4 = findViewById(R.id.four);
        btn_5 = findViewById(R.id.fiv);btn_6 = findViewById(R.id.six);
        multiply = findViewById(R.id.into);
        btn_root = findViewById(R.id.root);
        btn_1 = findViewById(R.id.on);
        btn_2 = findViewById(R.id.two);
        btn_3 = findViewById(R.id.three);
        minus = findViewById(R.id.minus);
        btn_0 = findViewById(R.id.zro);
        btn_decimal = findViewById(R.id.dot);
        btn_equals = findViewById(R.id.eql);
        pls = findViewById(R.id.pls);
        btn_close = findViewById(R.id.close);
        btn_open = findViewById(R.id.open);
        input = findViewById(R.id.input);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "0");
            }
        });
        try{
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText().toString() + "1");

                }
            });
        } catch (NullPointerException ignored) {

        }
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "9");
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + ")");
            }
        });

        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "(");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "log");
            }
        });
        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "+");
            }
        })
        ;
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "-");
            }
        })
        ;
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "*");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "/");
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + ".");
            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "sin");
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "cos");
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "tan");
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "ln");
            }
        });
        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "√ ");
            }
        });
        btn_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + "pi ");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String change = input.getText().toString();

                change = change.replaceAll("sin", "Math.sin");
                change = change.replaceAll("cos", "Math.cos");
                change = change.replaceAll("tan", "Math.tan");
                change = change.replaceAll("√", "Math.sqrt");
                change = change.replaceAll("log", "Math.log10");
                change = change.replaceAll("ln", "Math.log");
                change = change.replaceAll("pi", "*3.14");


                org.mozilla.javascript.Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String myresult = "";

                Scriptable scope = rhino.initStandardObjects();
                myresult = rhino.evaluateString(scope, change, "JavaScript", 1, null).toString();


                String myresultString = new StringBuilder().append(change).append(" = ").append(myresult).toString();
                input.setText(myresultString);
                FirebaseController firestore = new FirebaseController();
                firestore.saveToFirebase(myresultString);
            }
        });

    }

}
