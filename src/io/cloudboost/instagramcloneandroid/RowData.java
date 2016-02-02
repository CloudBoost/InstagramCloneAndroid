package io.cloudboost.instagramcloneandroid;

import android.graphics.Bitmap;

public class RowData {
	private Bitmap avatar;
	private String screenName;
	private String fullName;
	public RowData(Bitmap avatar, String screenName, String fullName) {
		super();
		this.avatar = avatar;
		this.screenName = screenName;
		this.fullName = fullName;
	}
	public Bitmap getAvatar() {
		return avatar;
	}
	public void setAvatar(Bitmap avatar) {
		this.avatar = avatar;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
