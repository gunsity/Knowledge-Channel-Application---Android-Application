package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class category extends Activity implements OnItemClickListener{
	private ListView text;
	private String text_array[]={"View Videos","Check out Main site","About this Application","Exit"};
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.categories);
        
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
        
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "View Videos")
    	{
			Intent intent = new 
			Intent(category.this,videocategory.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Check Out Main Site")
    	{
    		String site = "http://kchonline.ph";			
			Intent intent = new Intent(category.this, browser.class);
			intent.putExtra("link", site);
			startActivity(intent);
    	}
    	if(text_array[position] == "About this Application")
    	{
    	Toast.makeText(this, "Under Construction", Toast.LENGTH_LONG).show();	
    	}
    	if(text_array[position] == "Exit")
    	{
    		System.exit(0);
    	}
		
	}
}