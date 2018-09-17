package com.polytech.androidtp1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBack;
    private Button btnLike;
    private ImageButton btnClose;
    private ImageButton btnSend;
    private Button btnComment;
    private EditText sendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBack = findViewById(R.id.backButton);
        btnLike = findViewById(R.id.btnLike);
        btnClose = findViewById(R.id.closeButton);
        btnSend = findViewById(R.id.btnSend);
        btnComment = findViewById(R.id.btnComment);
        sendText = findViewById(R.id.sendText);

        btnBack.setOnClickListener(this);
        btnLike.setOnClickListener(this);
        btnClose.setOnClickListener(this);
        btnSend.setOnClickListener(this);
        btnComment.setOnClickListener(this);

        sendText.setFocusableInTouchMode(true);

    }

    @Override
    public void onClick(View v) {
        if(v.equals(btnBack))
        {
            this.finish();
        }
        else if(v.equals(btnLike))
        {

        }
        else if(v.equals(btnComment))
        {
            sendText.requestFocus();
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(sendText,InputMethodManager.SHOW_IMPLICIT);

        }
        else if(v.equals(btnClose))
        {
            this.finish();
        }
        else if(v.equals(btnSend))
        {
            Toast.makeText(this, sendText.getText(), Toast.LENGTH_LONG).show();
        }

    }
}
