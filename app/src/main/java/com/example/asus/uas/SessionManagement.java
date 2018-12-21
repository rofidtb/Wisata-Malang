package com.example.asus.uas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.HashMap;

public class SessionManagement {
    private SharedPreferences mSharedPreference;

    private SharedPreferences.Editor mEditor;

    private Context mContext;

    int PRIVATE_MODE;

    private static final String PREF_NAME = "SharedPref";

    private static final String IS_LOGIN = "IsLoggedIn";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    public SessionManagement(Context mContext) {
        this.mContext = mContext;
        mSharedPreference = this.mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        mEditor = mSharedPreference.edit();
    }

    //untuk menyimpan shared preferences
    public void createLoginSession(String email, String password) {
        mEditor.putBoolean(IS_LOGIN, true);
        mEditor.putString(KEY_EMAIL, email);
        mEditor.putString(KEY_PASSWORD, password);
        mEditor.commit();
    }

    //untuk mendapatakan informasi user
    public HashMap<String, String> getUserInformation() {
        HashMap<String, String> user = new HashMap<String, String>();
        user.put(KEY_EMAIL, mSharedPreference.getString(KEY_EMAIL, null));
        user.put(KEY_PASSWORD, mSharedPreference.getString(KEY_PASSWORD, null));
        return user;
    }

    //untuk mengecek apakah user sudah login atau belum
    public boolean isLoggedIn() {
        return mSharedPreference.getBoolean(IS_LOGIN, false);
    }

    public void checkIsLogin() {
        // Check login status
        if(!isLoggedIn()) {
            // user is not logged n redirect to MainActivity
            Intent i = new Intent(mContext, LoginActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(i);
        }
    }

    // untuk menghapus Shared Preference yang telah disimpan
    public void logoutUser() {
        mEditor.clear();
        mEditor.commit();

        Intent i = new Intent(mContext, LoginActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(i);
    }
}
