package com.winchester.lee.kchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Finance_literacy_and_entrepreneurship extends Activity implements OnItemClickListener{
    /** Called when the activity is first created. */
	private ListView text;
	private String text_array[]={"Estudyantipid",
			"Estudyantipid2",
			"Estudyantipid3",
			"Negosyo Ko,Asenso Ko",
			};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.financial_literacy_and_entrepreneurship);
        text = (ListView)findViewById(R.id.listView1);
        text.setOnItemClickListener(this);
        text.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, text_array));
    }
    @Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		if(text_array[position] == "Estudyantipid")
    	{
			Intent intent = new 
			Intent(Finance_literacy_and_entrepreneurship.this,Estudyantipid.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Estudyantipid2")
    	{
    		Intent intent = new 
			Intent(Finance_literacy_and_entrepreneurship.this,Estudyantipid2.class);
			startActivity(intent);	
    	}
    	if(text_array[position] == "Estudyantipid3")
    	{
    		Intent intent = new 
			Intent(Finance_literacy_and_entrepreneurship.this,Estudyantipid3.class);
			startActivity(intent);
    	}
    	if(text_array[position] == "Negosyo Ko,Asenso Ko")
    	{
    		Intent intent = new 
			Intent(Finance_literacy_and_entrepreneurship.this,Negosyo_ko_asenso_ko.class);
			startActivity(intent);
    	}
    	
	}
}