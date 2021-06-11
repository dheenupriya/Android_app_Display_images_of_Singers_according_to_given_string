package com.example.singer;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView viewingText;
    Button b1,b2,b3;
    ImageView iv;
    String name;
    int cc=1;
    float font=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.singerName);
        viewingText=findViewById(R.id.textView);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        iv=findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = editText.getText().toString();
                viewingText.setText(name);
                if(name.equalsIgnoreCase("Katy Perry")){
                    iv.setImageResource(R.drawable.katty_perry);
                }
                else if(name.equalsIgnoreCase("Eric Nam")){
                    iv.setImageResource(R.drawable.eric_nam);
                }
                else if(name.equalsIgnoreCase("BTS")){
                    iv.setImageResource(R.drawable.bts);
                }
                else if(name.equalsIgnoreCase("Camilla Cabello")){
                    iv.setImageResource(R.drawable.camila_cabello);
                }
                else if(name.equalsIgnoreCase("Harry Styles")){
                    iv.setImageResource(R.drawable.harry_styles);
                }
                else if(name.equalsIgnoreCase("Liam Payne")){
                    iv.setImageResource(R.drawable.liam_payne);
                }
                else if(name.equalsIgnoreCase("Armaan Malik")){
                    iv.setImageResource(R.drawable.armaan_malik);
                }
                else if(name.equalsIgnoreCase("Zayn Malik")){
                    iv.setImageResource(R.drawable.zayn_malik);
                }
                else if(name.equalsIgnoreCase("V")){
                    iv.setImageResource(R.drawable.v);
                }
                else if(name.equalsIgnoreCase("Hiphop Tamizha")){
                    iv.setImageResource(R.drawable.hiphop_tamizha);
                }
                else if(name.equalsIgnoreCase("One Direction")){
                    iv.setImageResource(R.drawable.one_direction);
                }
                else if(name.equalsIgnoreCase("Rihanna")){
                    iv.setImageResource(R.drawable.rihanna);
                }
                else{
                    iv.setImageResource(R.drawable.image_not);
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewingText.setTextSize(font);
                font = font - 2;
                if ( font<10){
                    font=30;
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(cc){
                    case 1:
                        viewingText.setTextColor(Color.parseColor("#FF8B51"));
                        break;
                    case 2:
                        viewingText.setTextColor(Color.parseColor("#FF5151"));
                        break;
                    case 3:
                        viewingText.setTextColor(Color.parseColor("#FFBF51"));
                        break;
                    case 4:
                        viewingText.setTextColor(Color.parseColor("#F1FF51"));
                        break;
                    case 5:
                        viewingText.setTextColor(Color.parseColor("#9EFF51"));
                        break;
                    case 6:
                        viewingText.setTextColor(Color.parseColor("#51FFC6"));
                        break;
                    case 7:
                        viewingText.setTextColor(Color.parseColor("#51F5FF"));
                        break;
                    case 8:
                        viewingText.setTextColor(Color.parseColor("#5187FF"));
                        break;
                    case 9:
                        viewingText.setTextColor(Color.parseColor("#9351FF"));
                        break;
                    case 10:
                        viewingText.setTextColor(Color.parseColor("#FF51DE"));
                        break;
                    case 11:
                        viewingText.setTextColor(Color.parseColor("#FF5190"));
                        break;
                    case 12:
                        viewingText.setTextColor(Color.parseColor("#FF5151"));
                        break;
                }
                cc++;
                if(cc==12){
                    cc=1;
                }
            }
        });
    }
}