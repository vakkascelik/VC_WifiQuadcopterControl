package com.example.vakkascelik.vc_wifiquadcoptercontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class mainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void PIDbutton(View view){
        Intent PIDintent = new Intent(mainMenu.this, PIDcontrol.class);
        startActivity(PIDintent);
    }

}
