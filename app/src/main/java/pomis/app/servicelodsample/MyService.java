package pomis.app.servicelodsample;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

public class MyService extends Service {
    private static final int NOTIF_ID = 5432;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4500);
                    Log.d("kek", "SERVICE SLEPT FOR 4500 milliseconds");
                    sendNotification();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        })
                .start();

        return super.onStartCommand(intent, flags, startId);
    }

    private void sendNotification() {
        Notification notification = new Notification.Builder(getApplicationContext())
                .setContentTitle("KADAW LOX")
                .setContentText("ПРИВЕТИКИ РЕБЗЯ")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setWhen(System.currentTimeMillis())
                .setNumber(1488)
                .build();


        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(NOTIF_ID, notification);
    }
}
