package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N12253737202470468561 {
    public final Context b;
    public final W1977247516027959386 c;
    public final Q13914734507241918864 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        B14824868959299866349.o("Processor");
    }

    public N12253737202470468561(Context context, W1977247516027959386 w1977247516027959386, Q13914734507241918864 q13914734507241918864, WorkDatabase workDatabase) {
        this.b = context;
        this.c = w1977247516027959386;
        this.d = q13914734507241918864;
        this.e = workDatabase;
    }

    public static boolean d(H1239233717680269921 h1239233717680269921, int i) {
        if (h1239233717680269921 == null) {
            B14824868959299866349.n().getClass();
            return false;
        }
        h1239233717680269921.k.z(new M3766625580725462707(i));
        B14824868959299866349.n().getClass();
        return true;
    }

    public final void a(T16632042582001818609 t16632042582001818609) {
        synchronized (this.k) {
            this.j.add(t16632042582001818609);
        }
    }

    public final H1239233717680269921 b(String str) {
        H1239233717680269921 h1239233717680269921 = (H1239233717680269921) this.f.remove(str);
        boolean z = h1239233717680269921 != null;
        if (!z) {
            h1239233717680269921 = (H1239233717680269921) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        int i = Y13568929412073945273.j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable unused) {
                            B14824868959299866349.n().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return h1239233717680269921;
    }

    public final H1239233717680269921 c(String str) {
        H1239233717680269921 h1239233717680269921 = (H1239233717680269921) this.f.get(str);
        return h1239233717680269921 == null ? (H1239233717680269921) this.g.get(str) : h1239233717680269921;
    }
}
