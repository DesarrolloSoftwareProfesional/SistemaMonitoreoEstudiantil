package pe.edu.sise.appsgmonitoreoestudiantil;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import pe.edu.sise.utils.Attributes;

/**
 * Created by Abel on 17/06/2017.
 */

public class SmeFirebaseMessagingService extends FirebaseMessagingService {
    public static final String TAG = "SmeFirebaseMsgServ";

    NotificationCompat.Builder notificationBuilder;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String msgId = remoteMessage.getData().get(Attributes.MSG_ID);
        String msgActivity = remoteMessage.getData().get(Attributes.MSG_ACTIVIDAD);
        String msgStartDate = remoteMessage.getData().get(Attributes.MSG_FECHA_REALIZARSE);
        String msgTypeNotification = remoteMessage.getData().get(Attributes.MSG_TIPO_NOTIFICACION);

        Log.d(TAG, msgActivity);

        this.sendNotification(msgId, msgActivity, msgStartDate, msgTypeNotification);
        //super.onMessageReceived(remoteMessage);
    }

    private void sendNotification(String msgId, String msgActivity, String msgStartDate, String msgTypeNotification) {

        Intent intent;

        if (Attributes.TIPO_NOTIFICACION_NOTA.equals(msgTypeNotification)) {
            intent = new Intent(this, NotificandoActivity.class);
        }else{
            intent = new Intent(this, DetalleActividad.class);
        }

            intent.putExtra(Attributes.MSG_ACTIVIDAD, msgActivity);
            intent.putExtra(Attributes.MSG_FECHA_REALIZARSE, msgStartDate);
            intent.putExtra(Attributes.MSG_ID, msgId);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                    PendingIntent.FLAG_ONE_SHOT);

            Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            notificationBuilder = new NotificationCompat.Builder(this)
                    .setSmallIcon(R.drawable.ic_logo_monitoreo_msg)
                    .setContentTitle(msgActivity)
                    .setContentText(msgStartDate)
                    .setAutoCancel(true)
                    .setSound(defaultSoundUri)
                    .setContentIntent(pendingIntent);

            NotificationManager notificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            notificationManager.notify(Integer.valueOf(msgId) /* ID of notification */, notificationBuilder.build());

    }
}
