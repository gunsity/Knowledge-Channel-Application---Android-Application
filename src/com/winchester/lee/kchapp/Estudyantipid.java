package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Estudyantipid extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Kahalagahan ng Pera",
				"Maliliit na Hakbang ng Tagumpay",
				"Pera Ko Para Sa Kinabukasan Ko (Pag-iimpok Ng Pera)",
				"Maging Marunong Sa Pera (Pag-iimpok Ng Pera)",
				"Kayamanan"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudyantipid);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Kahalagahan ng Pera")
    	{
			String video_path = "http://www.youtube.com/watch?v=TMrECGAVKgg&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Maliliit na Hakbang ng Tagumpay")
    	{
    		String video_path = "http://www.youtube.com/watch?v=ZUOccixBs0g&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Pera Ko Para Sa Kinabukasan Ko (Pag-iimpok Ng Pera)")
    	{
    		String video_path = "http://www.youtube.com/watch?v=S-QeLHMuab4&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Maging Marunong Sa Pera (Pag-iimpok Ng Pera)")
    	{
    		String video_path = "http://www.youtube.com/watch?v=4y5javwc_Kw&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Kayamanan")
    	{
    		String video_path = "http://www.youtube.com/watch?v=n_g_WATPIGU&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
		
	}

}