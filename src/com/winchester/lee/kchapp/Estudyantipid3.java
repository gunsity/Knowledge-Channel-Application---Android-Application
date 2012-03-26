package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Estudyantipid3 extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Human Resource",
				"Human Resource",
				};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudyantipid3);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Human Resource")
    	{
			String video_path = "http://www.youtube.com/watch?v=hvgoWxKJ3b8&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid3.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Marketing")
    	{
    		String video_path = "http://www.youtube.com/watch?v=XXBkFrVMnx4&feature=player_embedded";			
			Intent intent = new Intent(Estudyantipid3.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	
	}

}