package dev.epro.r0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K4690422250417820120 {
    public static final Object g = new Object();
    public static K4690422250417820120 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile R502132765509599220 c;
    public final H12843822278061842084 d;
    public final short e;
    public final int f;

    public K4690422250417820120(Context context, Looper looper) {
        W11441420927348451793 w11441420927348451793 = new W11441420927348451793(this);
        this.b = context.getApplicationContext();
        R502132765509599220 r502132765509599220 = new R502132765509599220(looper, w11441420927348451793);
        Looper.getMainLooper();
        this.c = r502132765509599220;
        this.d = H12843822278061842084.D();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public static K4690422250417820120 a(Context context) {
        K4690422250417820120 k4690422250417820120;
        synchronized (g) {
            try {
                k4690422250417820120 = h;
                if (k4690422250417820120 == null) {
                    k4690422250417820120 = new K4690422250417820120(context.getApplicationContext(), context.getMainLooper());
                    h = k4690422250417820120;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k4690422250417820120;
    }

    public final B6867906687934285025 b(B7526239878873455655 b7526239878873455655, S14544699827375243894 s14544699827375243894, String str, Executor executor) {
        B6867906687934285025 b6867906687934285025A;
        HashMap map = this.a;
        synchronized (map) {
            try {
                F14087932618967811298 f14087932618967811298 = (F14087932618967811298) map.get(b7526239878873455655);
                if (executor == null) {
                    executor = null;
                }
                if (f14087932618967811298 == null) {
                    f14087932618967811298 = new F14087932618967811298(this, b7526239878873455655);
                    f14087932618967811298.a.put(s14544699827375243894, s14544699827375243894);
                    b6867906687934285025A = f14087932618967811298.a(str, executor);
                    map.put(b7526239878873455655, f14087932618967811298);
                } else {
                    this.c.removeMessages(0, b7526239878873455655);
                    if (f14087932618967811298.a.containsKey(s14544699827375243894)) {
                        String string = b7526239878873455655.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    f14087932618967811298.a.put(s14544699827375243894, s14544699827375243894);
                    byte b = f14087932618967811298.b;
                    if (b == 1) {
                        s14544699827375243894.onServiceConnected(f14087932618967811298.f, f14087932618967811298.d);
                    } else if (b == 2) {
                        b6867906687934285025A = f14087932618967811298.a(str, executor);
                    }
                    b6867906687934285025A = null;
                }
                if (f14087932618967811298.c) {
                    return B6867906687934285025.i;
                }
                if (b6867906687934285025A == null) {
                    b6867906687934285025A = new B6867906687934285025(-1, null, null);
                }
                return b6867906687934285025A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        B7526239878873455655 b7526239878873455655 = new B7526239878873455655(str, z);
        M18113111391818111737.w("ServiceConnection must not be null", serviceConnection);
        HashMap map = this.a;
        synchronized (map) {
            try {
                F14087932618967811298 f14087932618967811298 = (F14087932618967811298) map.get(b7526239878873455655);
                if (f14087932618967811298 == null) {
                    String string = b7526239878873455655.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!f14087932618967811298.a.containsKey(serviceConnection)) {
                    String string2 = b7526239878873455655.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                f14087932618967811298.a.remove(serviceConnection);
                if (f14087932618967811298.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, b7526239878873455655), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
