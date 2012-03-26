package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class videocategory extends Activity implements OnItemClickListener{
	private ListView text;
	private String text_array[]={"Communication & Literature",
			"Teacher Effectiveness",
			"Financial Literacy & Entrepreneurship",
			"Mathematics",
			"Science & Technology",
			"Social Studies and Values",
			"News & Current Affairs"};
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.viewvideos);
        
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
        
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Communication & Literature")
    	{
			Intent intent = new 
			Intent(videocategory.this,Communication_and_Literature.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Teacher Effectiveness")
    	{
    		Intent intent = new 
			Intent(videocategory.this,Teacher_effectiveness.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Financial Literacy & Entrepreneurship")
    	{
    		Intent intent = new 
			Intent(videocategory.this,Finance_literacy_and_entrepreneurship.class);
			startActivity(intent);
    	}
    	if(text_array[position] == "Mathematics")
    	{
    		Intent intent = new 
			Intent(videocategory.this,Mathematics.class);
			startActivity(intent);
    	}
    	if(text_array[position] == "Science & Technology")
    	{
    		Toast.makeText(this, "Under Construction", Toast.LENGTH_LONG).show();
    	}
    	if(text_array[position] == "Social Studies and Values")
    	{
    		Toast.makeText(this, "Under Construction", Toast.LENGTH_LONG).show();
    	}
    	if(text_array[position] == "News & Current Affairs")
    	{
    		Intent intent = new 
			Intent(videocategory.this,News_and_current_affairs.class);
			startActivity(intent);
    	}
	}
}