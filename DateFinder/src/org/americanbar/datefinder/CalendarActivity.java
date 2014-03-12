package org.americanbar.datefinder;
import org.americanbar.datefinder.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;


public class CalendarActivity extends Activity {
	
	AutoCompleteTextView txtSearch;
	//Button btnAbout;
	ImageButton btnSearch;
	String[] holidayList = {"Christmas", "Easter", "Unofficial", "Easter (Orthodox)", "Cinco de Mayo", "New Year", " Chinese New Year"};
	//Calendar calendar;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void onCreate(Bundle b){
		// TODO Auto-generated method stub
		super.onCreate(b);
		setContentView(R.layout.activity_calendar);
		//btnAbout = (Button) findViewById(R.id.btnAbout);
		btnSearch = (ImageButton) findViewById(R.id.btnSearch);
		txtSearch = (AutoCompleteTextView) findViewById(R.id.txtSearch);
		txtSearch.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				// selection.setText(txtSearch.getText());
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// do nothing
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// do nothing (unless afterTextChanged has too long of delay)
				// In that case, make this check last time function was called or it might perform actions too quickly
				// Or check for auto-complete
			}
		});
		txtSearch.setAdapter(new ArrayAdapter(this, android.R.layout.select_dialog_singlechoice, holidayList));
	}
}
	
