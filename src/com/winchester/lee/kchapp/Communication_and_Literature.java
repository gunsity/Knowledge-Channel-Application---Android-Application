package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Communication_and_Literature extends Activity implements OnItemClickListener{
	private ListView text;
	private String text_array[]={"Alikabuk","Gab to Go","Karen's World"};
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.communications_and_literature);
        
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
        
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Alikabuk")
    	{
			Intent intent = new 
			Intent(Communication_and_Literature.this,Alikabuk.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Gab to Go")
    	{
    		Intent intent = new 
			Intent(Communication_and_Literature.this,Gab_to_go.class);
			startActivity(intent);
    	}
    	if(text_array[position] == "Karen's World")
    	{
    		Intent intent = new 
			Intent(Communication_and_Literature.this,Karens_world.class);
			startActivity(intent);
    	}
    	
		
	}
}