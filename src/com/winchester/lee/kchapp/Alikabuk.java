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

public class Alikabuk extends Activity implements OnItemClickListener{
	private ListView text;
	private String text_array[]={"Isang Gabing Madilim (Pagtukoy sa mga pang-uri sa napakinggang seleksyon)",
				"Anim Na Tanong (Pagsagot Sa Mga Tanong tungkol sa detalye ng balitang napakinggan)",
				"Kuro-Kuro Ko! (Pagbibigay Ng Sariling Palagay Sa Nabasa)",
				"Bernardo Carpio (Paggamit Ng Wastong Bantas)",
				"Jomel At Minda (Karaniwan At Di-Karaniwang Ayos Ng Pangungusap)"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.alikabuk);  
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
        
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Isang Gabing Madilim (Pagtukoy sa mga pang-uri sa napakinggang seleksyon)")
    	{
			String video_path = "http://www.youtube.com/watch?v=nHuzLZHzDVc&feature=player_embedded";			
			Intent intent = new Intent(Alikabuk.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Anim Na Tanong (Pagsagot Sa Mga Tanong tungkol sa detalye ng balitang napakinggan)")
    	{
    		String video_path = "http://www.youtube.com/watch?v=QF0jU3CgDoc&feature=player_embedded";			
			Intent intent = new Intent(Alikabuk.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Financial Literacy & Entrepreneurship")
    	{
    	Toast.makeText(this, "Mathematics", Toast.LENGTH_LONG).show();	
    	}
    	if(text_array[position] == "Exit")
    	{
    		System.exit(0);
    	}
		
	}
}