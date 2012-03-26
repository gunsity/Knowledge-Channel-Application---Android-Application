package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Estudyantipid2 extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Thrift and Savings: Wise Money Management Part 1",
				"Thrift and Savings: Wise Money Management Part 2",
				"Career and Financial Management Part 1",
				"Career and Financial Management Part 2",
				"Investing and Entrepreneurship Part 1",
				"Investing and Entrepreneurship Part 2"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudyantipid2);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    
    public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Thrift and Savings: Wise Money Management Part 1")
    	{
			String video_path = "http://www.youtube.com/watch?v=WB3XaKIHQik&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Thrift and Savings: Wise Money Management Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=ZqNFK1pG3bc&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Career and Financial Management Part 1")
    	{
    		String video_path = "http://www.youtube.com/watch?v=WSWkppbh6ZM&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Career and Financial Management Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=TH2PNZifsvY&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Investing and Entrepreneurship Part 1")
    	{
    		String video_path = "http://www.youtube.com/watch?v=e-mjjlRyRPE&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Investing and Entrepreneurship Part 2")
    	{
    		String video_path = "http://www.youtube.com/watch?v=uS9CuqfMbKU&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid2.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
		
	}

}