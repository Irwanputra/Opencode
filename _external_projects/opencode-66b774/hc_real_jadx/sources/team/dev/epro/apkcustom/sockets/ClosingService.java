package team.dev.epro.apkcustom.sockets;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ClosingService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        InterfaceC1837 interfaceC1837 = App.f3760;
        if (((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739()).length > 21) {
            InterfaceC1837 interfaceC18372 = App.f3760;
            if (Boolean.parseBoolean(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[21])) {
                SharedPreferences sharedPreferences = App.f3762;
                String a = Crypt.a(Crypt.xrc("J`hJ6m\u001b`>\u001e6gJdj\u001e6;\u0019foKci\u001edi\u001bbg\u001d`"));
                String string = sharedPreferences.getString(a, "");
                InterfaceC1837 interfaceC18373 = App.f3760;
                if (!string.equals(((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[22])) {
                    ((C1216) App.f3760).m2794();
                    C2098.m4206(App.f3762, a, "");
                }
            }
        }
        stopSelf();
    }
}
