package com.polytech.androidtp1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AppBar extends LinearLayout {

    private Button backButton;
    private TextView pageTitle;


    public AppBar(Context context) {
        super(context);
        this.initialize(context, null);
    }

    public AppBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.initialize(context, attrs);
    }

    public AppBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.initialize(context, attrs);
    }

    public AppBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
       super(context, attrs, defStyleAttr, defStyleRes);
        this.initialize(context, attrs);
    }

    private void initialize(Context context,@Nullable AttributeSet attrs)
    {
        inflate(context,R.layout.appbar,this);

        this.backButton = findViewById(R.id.backButton);
        this.pageTitle = findViewById(R.id.pageTitle);

        if(attrs != null)
        {
            TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.AppBar, 0, 0);

            String backTitle = array.getString(R.styleable.AppBar_backTitle);
            if(this.backButton != null)
            {
                this.backButton.setText(backTitle);
            }
            String title = array.getString(R.styleable.AppBar_pageTitle);
            if(this.pageTitle != null)
            {
                this.pageTitle.setText(title);
            }
            int backColor = array.getColor(R.styleable.AppBar_backColor,0);
            this.setBackgroundColor(backColor);
        }

    }
}
