package com.kingbse.sms.services;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import android.util.Log;

public class TestService extends AndroidTestCase {
	private static final String TAG = "TestService"

	private String save() {
		return "小明：" + "12岁";
	}

	private int sum() {
		return 2 + 1;

	}

	public static void main(String[] args) {
		TestService t = new TestService();
		// String s=t.save();
		int sub = t.sum();
		String messs = String.valueOf(sub);
		Assert.assertEquals(5555, sub);
		 Assert.assertEquals(3,s);
		Log.i(TAG, messs);

	}

}
