package com.example.promotions;

import android.graphics.Paint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_element);

        TextView list_element = findViewById(R.id.textView);
        list_element.setPaintFlags(list_element.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }
}