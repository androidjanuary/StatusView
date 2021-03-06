package com.lewis.ui.demo;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.lewis.widget.ui.Status;
import com.lewis.widget.ui.base.BaseStatusActivity;

/**
 * Created by Lewis on 2017/9/28.
 * Description: show the emptyView
 */

public class EmptyActivity extends BaseStatusActivity {


	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);

		setTitle("EmptyView Activity");

		mStatusView.setStatus(Status.LOADING);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				mStatusView.setStatus(Status.EMPTY);
			}
		}, 2000);
	}
}
