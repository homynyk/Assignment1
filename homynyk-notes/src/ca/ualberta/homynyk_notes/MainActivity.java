package ca.ualberta.homynyk_notes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	Button new_counter;
	public ListView counterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterList = (ListView)findViewById(R.id.counterList);
    }
    
    protected void onStart() {
    	super.onStart();
    	Counter counter = new Counter("Test", 0);
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item);
    	adapter.add(counter.getName());
    	counterList.setAdapter(adapter);
    	
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
