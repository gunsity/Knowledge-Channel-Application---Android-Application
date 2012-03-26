package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Faculty_room extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Fear of Technology Part 1",
				"Fear of Technology Part 2",
				"Fear of Innovation Part 1",
				"Fear of Innovation Part 2",
				"Pilot Part 1",
				"Pilot Part 2"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_room);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Fear of Technology Part 1")
    	{
			String video_path = "http://www.youtube.com/watch?v=ukvO4z5Lxiw&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Fear of Technology Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=SGnJoMaa1sw&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Fear of Innovation Part 1")
    	{
    		String video_path = "http://www.youtube.com/watch?v=vh3INfukKv4&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Fear of Innovation Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=woa56HWUdwo&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Pilot Part 1")
    	{
    		String video_path = "http://www.youtube.com/watch?v=sZ58tpTh0Oo&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Pilot Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=___IM2s_pn0&feature=player_embedded";			
			Intent intent = new Intent(Faculty_room.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
		
	}
}