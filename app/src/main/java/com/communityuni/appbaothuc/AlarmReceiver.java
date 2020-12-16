package com.communityuni.appbaothuc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.e("toi trong Receiver","Xin chao");
        String string_chuoi = intent.getExtras().getString("extra");
        Log.e("Ban Truyen Key",string_chuoi);
        Intent myintent = new Intent(context,music.class);
        myintent.putExtra("extra",string_chuoi);
        context.startService(myintent);
    }
}
