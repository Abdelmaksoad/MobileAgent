package com.rentcentric.mobileagent.util.asynctask;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.rentcentric.mobileagent.MainActivity;
import com.rentcentric.mobileagent.R;
import com.rentcentric.mobileagent.constants.Constants;
import com.rentcentric.mobileagent.preference.CarRentalPrefs;
import com.rentcentric.mobileagent.util.InfoDialogs;
import com.rentcentric.mobileagent.util.network.ServerConnectUtil;

import org.json.JSONObject;

public class AsyncAdminLoginUtil extends AsyncTask<Void, Void, Void> {

	private Activity activity;
	private ProgressDialog pDialog;
	private String response;
	private String username, password;
	private CarRentalPrefs prefs;

	public AsyncAdminLoginUtil(Activity activity, String username, String password) {
		this.activity = activity;
		this.password = password;
		this.username = username;
		prefs = CarRentalPrefs.getInstance(activity);
	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
		pDialog = ProgressDialog.show(activity, "", activity.getResources().getString(R.string.wait_text));

	}

	@Override
	protected Void doInBackground(Void... arg0) {
		// TODO Auto-generated method stub
		try {

			JSONObject object = new JSONObject();
			object.put("AdminId", username);
			object.put("Password", password);

			// parameters.add(new BasicNameValuePair("data",
			// object.toString()));

			response = new ServerConnectUtil(Constants.BASE_URL + "AdminLogin", object, 1).getResponse();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);
		pDialog.cancel();
		System.out.println("login response    " + response);

		if (response != null) {
			try {
				JSONObject object = new JSONObject(response);
				if (object==null || object.equals("")) {
					Toast.makeText(activity, "Invalid credentials", Toast.LENGTH_LONG).show();
				} else {
					
					if(!object.isNull("AdminId")){
						prefs.setAdminID(object.getString("AdminId"));
					}
					if(!object.isNull("LocationID")){
						prefs.setAdminLocationID(object.getString("LocationID"));

					}
					if(!object.isNull("FullName")){
						prefs.setAdminFullName(object.getString("FullName"));
					}
					if(!object.isNull("CheckIns")){
						prefs.setAdminAllowChickins(object.getString("CheckIns"));
					}
					if(!object.isNull("DamagesAdd")){
						prefs.setAdminAllowDamagesAdd(object.getString("DamagesAdd"));
					}
					if(!object.isNull("LocationID")){
						prefs.setLocationID(object.getString("LocationID"));
					}

					if(!object.isNull("AdminId")){
						if(object.getString("AdminId").length()>0){
							prefs.setLogin(true);
							activity.startActivity(new Intent(activity, MainActivity.class));
							activity.finish();
						}else{
							String dlg_msg = activity.getResources().getString(R.string.error_invalid_user);
							String dlg_title = activity.getResources().getString(R.string.message_lbl);
							InfoDialogs.showInfoDialog(activity, dlg_msg, dlg_title);

						}
					}else{
						String dlg_msg = activity.getResources().getString(R.string.error_invalid_user);
						String dlg_title = activity.getResources().getString(R.string.message_lbl);
						InfoDialogs.showInfoDialog(activity, dlg_msg, dlg_title);

					}


				}
			} catch (Exception e) {
				e.printStackTrace();
				String dlg_msg = activity.getResources().getString(R.string.error_server_connection);
				String dlg_title = activity.getResources().getString(R.string.message_lbl);
				InfoDialogs.showInfoDialog(activity, dlg_msg, dlg_title);

			}

		}else{
			String dlg_msg = activity.getResources().getString(R.string.error_server_connection);
			String dlg_title = activity.getResources().getString(R.string.message_lbl);
			InfoDialogs.showInfoDialog(activity, dlg_msg, dlg_title);

		}

	}

}
