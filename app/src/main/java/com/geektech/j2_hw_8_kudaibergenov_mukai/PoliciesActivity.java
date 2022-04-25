package com.geektech.j2_hw_8_kudaibergenov_mukai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PoliciesActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);
        textView = findViewById(R.id.text_view2);
        String string = getIntent().getStringExtra("key");
        button = findViewById(R.id.btn);
        Log.d("shamal", "OnCreare Result");
        textView.setText(string);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                System.exit(1);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shamal", "onStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shamal", "onResume MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shamal", "onPause MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shamal", "onRestart MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shamal", "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shamal", "onDestroy MainActivity");
    }
}