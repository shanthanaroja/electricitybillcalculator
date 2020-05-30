package com.example.ebcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Bill extends Activity {
	TextView receipt;
	Intent i1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		receipt=(TextView) findViewById(R.id.textView1);
		i1=getIntent();
		receipt.setText(i1.getStringExtra("editText1"));
		
		
	}

}
