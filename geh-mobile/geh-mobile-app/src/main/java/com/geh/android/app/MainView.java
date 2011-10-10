
package com.geh.android.app;

import com.geh.android.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainView extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				//
			}
			
		});
        
        Button btnValidate = (Button) findViewById(R.id.btnValidate);
        btnValidate.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View view) {
				//
			}
			
		});        
    }
}