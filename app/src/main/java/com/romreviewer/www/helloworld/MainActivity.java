package com.romreviewer.www.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
        editText1=(EditText) findViewById(R.id.editText2);
        textView=(TextView) findViewById(R.id.textView);
    }
    public void button(View view)
    {
        int firstno,secondno,result;
        firstno=Integer.valueOf(editText.getText().toString());
        secondno=Integer.valueOf(editText1.getText().toString());
        result=firstno+secondno;
        textView.setText(String.valueOf(result));
    }

}
