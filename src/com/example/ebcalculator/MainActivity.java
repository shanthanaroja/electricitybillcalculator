package com.example.ebcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
	EditText units;
	Button b1;
	TextView total;
	

	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        units=(EditText)findViewById(R.id.editText1);
		b1=(Button)findViewById(R.id.button1);
		
    }
			@Override
			public void callCheck(View v) {
				// TODO Auto-generated method stub
				int num=Integer.parseInt(units.getText().toString());
				if(num<100)
				{
					Intent i=new Intent(this,Bill.class);
					i.putExtra("editText1","Your electricity bill is Rs.100");				
					
				}
				
				else if(num>=100)
				{   Intent i=new Intent(this,Bill.class);
					i.putExtra("editText1","Your electricity bill is Rs.200");	
				}
									
				else if(num>=400)
				{
					Intent i=new Intent(this,Bill.class);
					i.putExtra("editText1","Your electricity bill is Rs.800");	
					
				}
				else if(num>=600)
				{
					Intent i=new Intent(this,Bill.class);
					i.putExtra("editText1","Your electricity bill is Rs.1200");	
				}
				else
				{
					Intent i=new Intent(this,Bill.class);
					i.putExtra("editText1","Your electricity bill is Rs.2400");	
				}
					
				
				
			}
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
