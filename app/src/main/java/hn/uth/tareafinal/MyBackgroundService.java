package hn.uth.tareafinal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyBackgroundService extends Service {

    private static final String TAG = "MyBackgroundService";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "El servicio se ha creado.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "El servicio se ha iniciado.");

        // Realiza aquí las tareas en segundo plano

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "El servicio se ha detenido.");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
