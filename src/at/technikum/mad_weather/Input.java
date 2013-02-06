package at.technikum.mad_weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * 
 * @author bernhardedler
 * Main method for data input. OnClickListener invokes AsyncTask
 */
public class Input extends Activity implements OnClickListener {
	Button btnGo;
	TextView tvCity, tvCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        
        btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);
        tvCity = (TextView) findViewById(R.id.city);
        tvCountry = (TextView) findViewById(R.id.country);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_input, menu);
        return true;
    }
    /**
     * Invokes AsyncTask for Data
     * startActivityForResult()...
     */
    public void onClick(View v){
    	Intent i = new Intent(this, GetData.class);
    	i.putExtra("city", tvCity.getText());
    	i.putExtra("country", tvCountry.getText());
    	startActivityForResult(i, 0);
    
    }
    @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, intent);
		Log.d("INPUT.onActivityResult()", "SUCCESS");
	}
    
}
