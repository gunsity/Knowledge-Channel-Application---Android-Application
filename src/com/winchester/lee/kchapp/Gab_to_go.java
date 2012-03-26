package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Gab_to_go extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Story-Telling",
				"Validty & Accuracy of Information",
				"Primary & Secondary Sources",
				"Topic Research",
				"Story Telling as a Form of Art"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gab_to_go);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Story-Telling")
    	{
			String video_path = "http://www.youtube.com/watch?v=p9fetGRT-os&feature=player_embedded";			
			Intent intent = new Intent(Gab_to_go.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Validty & Accuracy of Information")
    	{
    		String video_path = "http://www.youtube.com/watch?v=vjil43eXH_A&feature=player_embedded";			
			Intent intent = new Intent(Gab_to_go.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Primary & Secondary Sources")
    	{
    		String video_path = "http://www.youtube.com/watch?v=twT6rfPsMyI&feature=player_embedded";			
			Intent intent = new Intent(Gab_to_go.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Topic Research")
    	{
    		String video_path = "http://www.youtube.com/watch?v=vbPL68Z3ojg&feature=player_embedded";			
			Intent intent = new Intent(Gab_to_go.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Story Telling as a Form of Art")
    	{
    		String video_path = "http://www.youtube.com/watch?v=MhnVix97-oA&feature=player_embedded";			
			Intent intent = new Intent(Gab_to_go.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
		
	}
}