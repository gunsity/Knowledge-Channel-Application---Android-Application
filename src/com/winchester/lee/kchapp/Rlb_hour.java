package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Rlb_hour extends Activity implements OnItemClickListener{
	private ListView text;
	private String text_array[]={"RLB Hour Episode 1"};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rlb_hour);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "RLB Hour Episode 1")
    	{
			String video_path = "http://www.youtube.com/watch?v=yrzglqeU63k&feature=player_embedded";			
			Intent intent = new Intent(Rlb_hour.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	
		
	}
}