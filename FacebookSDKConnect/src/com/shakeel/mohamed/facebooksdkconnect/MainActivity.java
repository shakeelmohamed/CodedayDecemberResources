package com.shakeel.mohamed.facebooksdkconnect;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button connectButton = (Button)findViewById(R.id.connectButton);
		connectButton.setOnClickListener(this);	
	}

	@Override
	public void onClick(View v) {
		if(((Button)v).getId() == R.id.connectButton){
			Session.openActiveSession(this, true, new Session.StatusCallback() {
				@Override
				public void call(Session session, SessionState state, Exception exception) {
					if (session.isOpened()) {
						Request.executeMeRequestAsync(session, new Request.GraphUserCallback() {
							@Override
							public void onCompleted(GraphUser user, Response response) {
								if (user != null) {
									Button connectButton = (Button)findViewById(R.id.connectButton);
									connectButton.setVisibility(View.INVISIBLE);
									TextView dumpTextField = (TextView)findViewById(R.id.dumpText);
									dumpTextField.setText(user.toString());
								}
								else 
									return; //Add custom error handling here
							}
						});
					}
				}
			});	
		}
	}
}
