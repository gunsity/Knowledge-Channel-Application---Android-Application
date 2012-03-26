package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Agham_aralin extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={
				"Organization of Life (Agham Aralin)",
				"Organization in an Ecosystem (Agham Aralin)",
				"Organization of Celestial Bodies (Agham Aralin)",};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agham_aralin);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Organization of Life (Agham Aralin)")
    	{
			String video_path = "http://www.youtube.com/watch?list=PL96D3953061E6EB51&feature=player_embedded&v=yq70-Qi5vCY";			
			Intent intent = new Intent(Agham_aralin.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Organization in an Ecosystem (Agham Aralin)")
    	{
    		String video_path = "http://www.youtube.com/watch?feature=player_embedded&v=jEqn2lM7HD4&list=PL544EDF529D8B34EB";			
			Intent intent = new Intent(Agham_aralin.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);
    	}
    	if(text_array[position] == "Organization of Celestial Bodies (Agham Aralin)")
    	{
    		String video_path = "http://www.youtube.com/watch?feature=player_embedded&v=pqxkyz7j500&list=PL7E88DAA482FC7CEE";			
			Intent intent = new Intent(Agham_aralin.this, browser.class);
			intent.putExtra("link", video_path);
			startActivity(intent);	
    	}
    	
    }
}