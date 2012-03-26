package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Karens_world extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Inggo's Funny Bones",
				"Painting in Words",
				"Ready, Get Set, Ing-Go!",
				"Too Many Clubs!",
				"Impossible Dream"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.karens_world);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
        
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Inggo's Funny Bones")
    	{
			String video_path = "http://www.youtube.com/watch?v=AzhPEe3FENI&feature=player_embedded";			
			Intent intent = new Intent(Karens_world.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Painting in Words")
    	{
    		String video_path = "http://www.youtube.com/watch?v=77XB1vNQjwU&feature=player_embedded";			
			Intent intent = new Intent(Karens_world.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Ready, Get Set, Ing-Go!")
    	{
    		String video_path = "http://www.youtube.com/watch?v=NZHLPcWHl4o&feature=player_embedded";			
			Intent intent = new Intent(Karens_world.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Too Many Clubs!")
    	{
    		String video_path = "http://www.youtube.com/watch?v=mJUg9B1c8lY&feature=player_embedded";			
			Intent intent = new Intent(Karens_world.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Impossible Dream")
    	{
    		String video_path = "http://www.youtube.com/watch?v=dgmjD-w-UyQ&feature=player_embedded";			
			Intent intent = new Intent(Karens_world.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
		
	}
}