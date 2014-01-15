package mynotification.com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationClickedActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myfile);
		TextView textView=(TextView)findViewById(R.id.textView1);
		Intent intent=getIntent();
		
	}

}
