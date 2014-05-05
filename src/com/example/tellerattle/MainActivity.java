package com.example.tellerattle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;


import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Vibrator;

public class MainActivity extends Activity implements OnClickListener {
	
	Button shakeButton;
	
	Vibrator v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        v = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        
        shakeButton =  (Button) findViewById(R.id.shakeButton);
        shakeButton.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View view) {
		if(view == shakeButton){
			v.vibrate(500);
		}
		
	}

    
}
