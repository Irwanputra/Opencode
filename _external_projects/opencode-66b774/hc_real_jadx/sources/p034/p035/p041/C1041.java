package p034.p035.p041;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1041 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public RemoteViews f5463;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final NotificationCompat.Builder f5464;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f5465;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public RemoteViews f5466;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Notification.Builder f5467;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<Bundle> f5468 = new ArrayList();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Bundle f5469 = new Bundle();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public RemoteViews f5470;

    /* JADX WARN: Removed duplicated region for block: B:164:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1041(androidx.core.app.NotificationCompat.Builder r18) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p041.C1041.<init>(androidx.core.app.NotificationCompat$Builder):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2379(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
