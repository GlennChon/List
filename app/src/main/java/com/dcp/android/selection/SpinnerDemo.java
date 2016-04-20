/***
ListViewDemo.java
*/

package com.dcp.android.selection;

import android.app.Activity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerDemo extends Activity implements AdapterView.OnItemSelectedListener{
	TextView selection;
	String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
					"consectetuer", "adipiscing", "elit", "morbi", "vel",
					"ligula", "vitae", "arcu", "aliquet", "mollis",
					"etiam", "vel", "erat", "placerat", "ante",
					"porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);

        // Spinner element
		Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selection=(TextView)findViewById(R.id.selection);

        // attach data adapter to spinner
        spinner.setAdapter(spinnerArrayAdapter);



	}
	
	public void onItemSelected(AdapterView<?> parent, View v, int position,
								long id) {
	 	selection.setText(items[position]);
	}
    public void onNothingSelected(AdapterView<?> arg0){

    }



	


}