package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K12238100791927223227 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f324o = new HashMap();
    public final Context a;
    public final P8755783434649014957 b;
    public boolean g;
    public final Intent h;
    public final O12545633033254628644 i;
    public P16318072974459194610 m;
    public E17780051485341276699 n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final D1811628803814760955 k = new D1811628803814760955(this, 0);
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "ExpressIntegrityService";
    public final WeakReference j = new WeakReference(null);

    public K12238100791927223227(Context context, P8755783434649014957 p8755783434649014957, Intent intent, O12545633033254628644 o12545633033254628644) {
        this.a = context;
        this.b = p8755783434649014957;
        this.h = intent;
        this.i = o12545633033254628644;
    }

    public static void b(K12238100791927223227 k12238100791927223227, L3120623210002840329 l3120623210002840329) {
        E17780051485341276699 e17780051485341276699 = k12238100791927223227.n;
        ArrayList arrayList = k12238100791927223227.d;
        P8755783434649014957 p8755783434649014957 = k12238100791927223227.b;
        if (e17780051485341276699 != null || k12238100791927223227.g) {
            if (!k12238100791927223227.g) {
                l3120623210002840329.run();
                return;
            } else {
                p8755783434649014957.getClass();
                arrayList.add(l3120623210002840329);
                return;
            }
        }
        p8755783434649014957.getClass();
        arrayList.add(l3120623210002840329);
        P16318072974459194610 p16318072974459194610 = new P16318072974459194610(k12238100791927223227);
        k12238100791927223227.m = p16318072974459194610;
        k12238100791927223227.g = true;
        if (k12238100791927223227.a.bindService(k12238100791927223227.h, p16318072974459194610, 1)) {
            return;
        }
        int i = 0;
        k12238100791927223227.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((N3901745123707141715) obj).a(new P16878392633646159868("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f324o;
        synchronized (map) {
            try {
                String str = this.c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(M17133811648581684718 m17133811648581684718) {
        synchronized (this.f) {
            this.e.remove(m17133811648581684718);
        }
        a().post(new D3626849491593542492(this));
    }
}
