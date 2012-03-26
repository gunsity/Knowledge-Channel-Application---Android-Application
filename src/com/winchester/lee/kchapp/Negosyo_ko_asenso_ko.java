package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Negosyo_ko_asenso_ko extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Omart",};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.negosyo_ko_asenso_ko);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Omart")
    	{
			String video_path = "http://www.youtube.com/watch?v=7kU_1DXmx_k&feature=player_embedded";			
			Intent intent = new Intent(Negosyo_ko_asenso_ko.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	
		
	}
}