package io.cloudboost.instagramcloneandroid;

import java.util.Arrays;
import java.util.List;
import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {

	private Button loginButton;
	private Dialog progressDialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		loginButton = (Button) findViewById(R.id.loginButton);
		loginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i("mainactivity", "Login button clicked");
				onLoginButtonClicked();
			}
		});

	}
	
	private void onLoginButtonClicked() {
		LoginActivity.this.progressDialog = ProgressDialog.show(
				LoginActivity.this, "", "Logging in...", true);
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
		progressDialog.dismiss();
//		List<String> permissions = Arrays.asList("public_profile","user_about_me","user_friends");

	}
	
	/**
	 * Used to provide "single sign-on" for users who don't have the Facebook app installed
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	  super.onActivityResult(requestCode, resultCode, data);
	}
	
	private void showHomeListActivity() {
		//Log.i(AnypicApplication.TAG, "entered showHomeListActivity");
//		Intent intent = new Intent(this, HomeListActivity.class);
//		startActivity(intent);
//		finish(); // This closes the login screen so it's not on the back stack
	}
	
	/***************************************************************************/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
//			View rootView = inflater.inflate(R.layout.fragment_login,
//					container, false);
			return new TextView(getActivity());
		}
	}

}
