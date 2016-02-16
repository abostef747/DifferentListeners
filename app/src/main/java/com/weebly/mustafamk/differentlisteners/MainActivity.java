package com.weebly.mustafamk.differentlisteners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runMethod1(View view){
        Toast.makeText(this, "We Made the first Click", Toast.LENGTH_SHORT).show();
    }

    public void runMethod2(View view){
        String tag = view.getTag().toString();
        String message = "";
        if(tag.equals("dog")){
            message = "Du klickade på en HUND!";
        }else if(tag.equals("cat")){
            message = "Du klickad på en KATT";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void runMethod3(View view){
        String message = "";
        switch (view.getId()){
            case R.id.special_button_1: message = "Speciell Knapp 1"; break;
            case R.id.special_button_2: message = "Speciell Knapp 2"; break;
            default: message = "ingen Speciell Knapp";

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
