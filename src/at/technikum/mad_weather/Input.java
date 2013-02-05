package at.technikum.mad_weather;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author bernhardedler
 * Main method for data input. OnClickListener invokes AsyncTask
 */
public class Input extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button btnGo;
        btnGo = (Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);
        
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
  
    
    }
    
}
