package ca.ualberta.homynyk_notes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MakeNewCounterActivity extends Activity {
	private EditText nameText;
	private ListView counterList;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_new_counter_activity);
		nameText = (EditText)findViewById(R.id.body);
		Button saveButton = (Button)findViewById(R.id.save);
		
		// Set listener for save button to save counter 
		counterList=(ListView)findViewById(R.id.counterList);
		saveButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setResult(RESULT_OK);
				String name = nameText.getText().toString();
				// initialize counter with inputed name
				Counter new_counter = new Counter(name);
				/*****
				 * Load old array list
				 * append new counter to it
				 * save new array list
				 */
				nameText.setText(null);
				finish();
			}
		});
	}

}
