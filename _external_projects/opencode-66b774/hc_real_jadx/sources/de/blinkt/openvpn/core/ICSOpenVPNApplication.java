package de.blinkt.openvpn.core;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import p010.p011.p012.p013.C0743;
import p010.p011.p012.p013.C0750;
import p010.p011.p012.p014.C0777;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ICSOpenVPNApplication extends Application {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0750 f3688;

    @Override // android.app.Application
    public void onCreate() {
        if (Crypt.a(Crypt.xrc("Ja;\u001bb=\u001abm\u001ae=A79Mc;N7=A4hM6nKe=Lg")).equals(Build.FINGERPRINT)) {
            return;
        }
        super.onCreate();
        C0743.m2018();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193")));
            NotificationChannel notificationChannel = new NotificationChannel(Crypt.a(Crypt.xrc("L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg")), getString(2131820684), 1);
            notificationChannel.setDescription(getString(2131820681));
            notificationChannel.enableLights(false);
            notificationChannel.setLightColor(-12303292);
            notificationManager.createNotificationChannel(notificationChannel);
            NotificationChannel notificationChannel2 = new NotificationChannel(Crypt.a(Crypt.xrc("K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj")), getString(2131820685), 2);
            notificationChannel2.setDescription(getString(2131820682));
            notificationChannel2.enableLights(true);
            notificationChannel2.setLightColor(-16776961);
            notificationManager.createNotificationChannel(notificationChannel2);
            NotificationChannel notificationChannel3 = new NotificationChannel(Crypt.a(Crypt.xrc("Kdl\u001cdiH0:AfnJ6kJemI4oAfmN6f@0j\u001af")), getString(2131820686), 4);
            notificationChannel3.setDescription(getString(2131820683));
            notificationChannel3.enableVibration(true);
            notificationChannel3.setLightColor(-16711681);
            notificationManager.createNotificationChannel(notificationChannel3);
        }
        C0750 c0750 = new C0750();
        this.f3688 = c0750;
        c0750.m2026(getApplicationContext());
        if (i >= 21) {
            if (C0777.f5004 == null) {
                C0777.f5004 = new C0777();
            }
            C0777.f5004.m2103(this);
        }
    }
}
