package mynotification.com.example;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	public Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b = (Button) findViewById(R.id.btnGenerateNotifications);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						NotificationClickedActivity.class);
				PendingIntent pendIntent = PendingIntent.getActivity(
						MainActivity.this, 0, intent, 0);
				Notification notiMail = new Notification.Builder(
						MainActivity.this)
						.setContentTitle("support@edureka.in")
						.setContentText("Subject - Android Class")
						.setSmallIcon(R.drawable.ic_launcher)
						.setContentIntent(pendIntent).setAutoCancel(true)
						.build();
				NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				notificationManager.notify(0, notiMail);
			}
		});
	}

}
