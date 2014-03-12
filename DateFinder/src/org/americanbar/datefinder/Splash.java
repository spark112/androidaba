package org.americanbar.datefinder;
import org.americanbar.datefinder.R;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(4000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openActivity = new Intent("org.americanbar.datefinder.CALENDARACTIVITY");
					startActivity(openActivity);
				}
			}
		};
		timer.start();
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		finish();
	}
}
