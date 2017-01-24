package com.serbeh.garden;

import android.content.Intent;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication implements GardenActivity.MyGameCallback{
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new GardenActivity(), config);
	}

	@Override
	public void onStartActivityA() {
        Intent intent = new Intent(this, testactivity.class);
        startActivity(intent);
	}

	@Override
	public void onStartActivityB() {

	}

	@Override
	public void onStartSomeActivity(int someParameter, String someOtherParameter) {

	}
}
