package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Teacher_effectiveness extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Faculty Room",
				"The Power to Empower",
				};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_effectiveness);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Faculty Room")
    	{
			Intent intent = new 
			Intent(Teacher_effectiveness.this,Faculty_room.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "The Power to Empower")
    	{
    		Intent intent = new 
			Intent(Teacher_effectiveness.this,The_power_to_empower.class);
			startActivity(intent);	
    	}
   
	}
}