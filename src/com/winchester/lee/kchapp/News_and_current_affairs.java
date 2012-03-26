package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class News_and_current_affairs extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"K-Now",
			"RLB Hour",
			
			};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_and_current_affairs);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "K-Now")
    	{
			Intent intent = new 
			Intent(News_and_current_affairs.this,K_now.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "RLB Hour")
    	{
    		Intent intent = new 
			Intent(News_and_current_affairs.this,Rlb_hour.class);
			startActivity(intent);	
    	}
    	
    	
	}
}