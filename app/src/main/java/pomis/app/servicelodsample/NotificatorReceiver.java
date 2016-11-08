package pomis.app.servicelodsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by romanismagilov on 08.11.16.
 */
public class NotificatorReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("kek", "BOOT RECEIVED");
        Intent serviceIntent = new Intent(context, MyService.class);
        context.startService(serviceIntent);
    }
}
