package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KnowledgeChannelApplicationActivity extends Activity {
    /** Called when the activity is first created. */
	
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

       Button startBTN = (Button)findViewById(R.id.button1); 
       
       OnClickListener ocl = new OnClickListener() {
    		@Override
    		public void onClick(View arg0) {
    			Intent i = new Intent(KnowledgeChannelApplicationActivity.this,category.class);
    			startActivity(i);
    			
    		}
    		   
    	   };
    	   
    	   startBTN.setOnClickListener(ocl);
    }
    
   
    
   
    
    
    
} 
    
