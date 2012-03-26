package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Mathematics extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"K-High-Math",
			"Solved",
			
			};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathematics);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "K-High-Math")
    	{
			Intent intent = new 
			Intent(Mathematics.this,K_high_math.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Solved")
    	{
    		Intent intent = new 
			Intent(Mathematics.this,Solved.class);
			startActivity(intent);	
    	}
    	
    	
	}
}