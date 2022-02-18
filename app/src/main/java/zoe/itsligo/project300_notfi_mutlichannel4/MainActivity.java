package zoe.itsligo.project300_notfi_mutlichannel4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // public static final String NOTIFICATION_CHANNEL_ID = "10001";

  //  public static final String NOTIFICATION_CHANNEL_ID = null;

    public String ChannelID;
    public String ChannelDesc;

    public static final int base_CHANNEL_ID = 10001;

    private final static String default_notification_channel_id = "default";

    public static final String NOTIFICATION2_CHANNEL_ID = "10002";

    //Button btnCreateNotification = findViewById(R.id.btnCreateNotification);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
       /* btnCreateNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Uri sound = Uri. parse (ContentResolver. SCHEME_ANDROID_RESOURCE + "://" + getPackageName() + "/raw/quite_impressed.mp3" ) ;
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this, default_notification_channel_id)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("Test")
                        // .setSound(sound)
                        .setContentText("Hello! This is my first push notification");
                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    AudioAttributes audioAttributes = new AudioAttributes.Builder()
                            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                            .setUsage(AudioAttributes.USAGE_ALARM)
                            .build();
                    int importance = NotificationManager.IMPORTANCE_HIGH;
                    NotificationChannel notificationChannel = new
                            NotificationChannel(NOTIFICATION_CHANNEL_ID, "NOTIFICATION_CHANNEL_NAME", importance);
                    notificationChannel.enableLights(true);
                    notificationChannel.setLightColor(Color.RED);
                    notificationChannel.enableVibration(true);
                    notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                    //  notificationChannel.setSound(sound , audioAttributes) ;
                    mBuilder.setChannelId(NOTIFICATION_CHANNEL_ID);
                    assert mNotificationManager != null;
                    mNotificationManager.createNotificationChannel(notificationChannel);
                }
                assert mNotificationManager != null;
                mNotificationManager.notify((int) System.currentTimeMillis(),
                        mBuilder.build());
            }
        });
    }*/
       public void notification1(View view) {
           ChannelID = Integer.toString(base_CHANNEL_ID + 1);
           ChannelDesc="notification 1";
           myMethod(ChannelID,ChannelDesc);
       }

      public void notification2(View view) {
          ChannelID = Integer.toString(base_CHANNEL_ID + 2);
          ChannelDesc="notification 2";
        myMethod(ChannelID,ChannelDesc);

      }



    void myMethod(String channel, String Description) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this, default_notification_channel_id)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Test")
                // .setSound(sound)
                .setContentText(Description);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .setUsage(AudioAttributes.USAGE_ALARM)
                    .build();
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel notificationChannel = new
               /* NOTIFICATION_CHANNEL:*/    NotificationChannel(channel, "NOTIFICATION_CHANNEL_NAME", importance);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            //  notificationChannel.setSound(sound , audioAttributes) ;
            /* NOTIFICATION_CHANNEL:*/ mBuilder.setChannelId(channel);
            assert mNotificationManager != null;
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
        assert mNotificationManager != null;
        mNotificationManager.notify((int) System.currentTimeMillis(),
                mBuilder.build());
    }


}