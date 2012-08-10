package org.wintrisstech.teamhawk.irobot2013;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();
		String message = intent.getStringExtra(Dashboard.EXTRA_MESSAGE);

		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		setContentView(textView);
	}

}
