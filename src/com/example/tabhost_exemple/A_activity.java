package com.example.tabhost_exemple;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class A_activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a);
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//			 MainActivity.getInstance().getTabHost().getTabWidget().removeViewAt(getIntent().getIntExtra("position", -1));
			 
			}
		});
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	 
		
	}

}
