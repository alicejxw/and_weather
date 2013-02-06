package at.technikum.mad_weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Result extends Activity implements OnClickListener{
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_input);
	        Button btnReturn;
	        btnReturn = (Button)findViewById(R.id.btnReturn);
	        btnReturn.setOnClickListener(this);
	        
	    }

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Input.class);
		startActivity(i);
	}
}
