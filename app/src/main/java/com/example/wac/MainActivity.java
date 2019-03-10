package com.example.wac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1;
    EditText text2;
    int a1,a2;
    float b1,b2;
    TextView t1;
    Button ad,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        t1=findViewById(R.id.text);
        ad=findViewById(R.id.add1);
        sub=findViewById(R.id.sub1);
        mul= findViewById(R.id.mul1);
        div=findViewById(R.id.div1);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtract();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide();
            }
        });
    }
    private void add()
    {
        if(text1.getText().toString().trim().isEmpty()||text2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this,"Field cant be empty",Toast.LENGTH_SHORT).show();
        }else{
        a1=Integer.parseInt(text1.getText().toString());
        a2=Integer.parseInt(text2.getText().toString());
        int c;
        c=a1+a2;
        t1.setText(String.valueOf(a1)+"+"+String.valueOf(a2)+"="+String.valueOf(c));
    }
    }
    private void Subtract()
    {
        if(text1.getText().toString().trim().isEmpty()||text2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this,"Field cant be empty",Toast.LENGTH_SHORT).show();
        }else{
        a1=Integer.parseInt(text1.getText().toString());
        a2=Integer.parseInt(text2.getText().toString());
        int c;
        c=a1-a2;
        t1.setText(String.valueOf(a1)+"-"+String.valueOf(a2)+"="+String.valueOf(c));
    }}
    private void Multiply()
    {
        if(text1.getText().toString().trim().isEmpty()||text2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this,"Field cant be empty",Toast.LENGTH_SHORT).show();
        }else{
        a1=Integer.parseInt(text1.getText().toString());
        a2=Integer.parseInt(text2.getText().toString());
        int c;
        c=a1*a2;
        t1.setText(String.valueOf(a1)+"*"+String.valueOf(a2)+"="+String.valueOf(c));
    }}
    private void Divide()
    {
        if(text1.getText().toString().trim().isEmpty()||text2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this,"Field cant be empty",Toast.LENGTH_SHORT).show();
        }else{
            b1=Float.parseFloat(text1.getText().toString());
        b2=Float.parseFloat(text2.getText().toString());
        float c;
        if(b2==0)
        {
            Toast.makeText(this,"Denominator cant be zero",Toast.LENGTH_SHORT).show();
        }
        else
        {
            c=b1/b2;
            t1.setText(String.valueOf(b1)+"/"+String.valueOf(b2)+"="+String.valueOf(c));
        }
        }
    }
    public void clear(View v)
    {
     text1.setText("");
     text2.setText("");
     t1.setText("");
     text1.requestFocus();
    }
}
