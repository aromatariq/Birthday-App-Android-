package com.example.shoukhin.bgift;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Alarm extends BroadcastReceiver {
    public Alarm() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, Surprise.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(i);
    }
}
