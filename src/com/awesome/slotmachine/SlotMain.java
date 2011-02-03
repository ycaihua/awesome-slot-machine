package com.awesome.slotmachine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class SlotMain extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView joaq = new ImageView(this);
        joaq.setImageResource(R.drawable.test);
        setContentView(joaq);
        //setContentView(R.layout.main);
        //Tagalog comment:
        //Yung text na nakikita sa screen ay galing sa res/layout/main.xml 
        //may feeling ako na hindi siya dynamic.
        //Wak
        //To Iman: Nakalagay ako ng image? Pero feeling ko di pa siya ganun ka yeah.
    }
}

