package com.newware.saturdaychallange;
/**
        Saturday Coding Challenge : Make Android Logo Page
 **/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tvGotoSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGotoSignUp = findViewById(R.id.tvSignUp);
        tvGotoSignUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));
            }
        });
    }
}
