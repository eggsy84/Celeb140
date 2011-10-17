package uk.co.celeb140;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Celeb140Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celeb140_dashboard);
    }
    
    public void onClickFeature(View view){
    	int id = view.getId ();
    	
    	Context context = getApplicationContext();
		CharSequence text = null;
		int duration = Toast.LENGTH_SHORT;
    	
    	switch (id) {
    		case R.id.home_button_fame_hungry: {
    			text = "Fame hungry pressed";
    			break;
    		}
    		case R.id.home_button_guest_list: {
    			text = "Guest list pressed";
    			break;
    		}
    		case R.id.home_button_papped: {
    			text = "Papped pressed";
    			break;
    		}
    		case R.id.home_button_classified: {
    			text = "Classified pressed";
    			break;
    		}
    	}
    	
    	Toast toast = Toast.makeText(context, text, duration);
		toast.show();
    	
    }
}