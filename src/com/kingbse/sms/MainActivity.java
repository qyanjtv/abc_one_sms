package com.kingbse.sms;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText numbertext;
	private EditText messtext;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		numbertext = (EditText) this.findViewById(R.id.number);
		messtext = (EditText) this.findViewById(R.id.mess);
		Button button = (Button) this.findViewById(R.id.sendid);
		button.setOnClickListener(new sms());
	}

	private final class sms implements View.OnClickListener {
		@SuppressWarnings("deprecation")
		public void onClick(View v) {
			String number = numbertext.getText().toString();
			String message = messtext.getText().toString();
			SmsManager manage = SmsManager.getDefault();
			ArrayList<String> meslist = manage.divideMessage(message);
			for (String text : meslist) {
				manage.sendTextMessage(number, null, text, null, null);
			}
			Toast.makeText(MainActivity.this, R.string.suc, Toast.LENGTH_LONG)
					.show();
		}

	}
}