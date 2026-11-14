package ads_mobile_sdk;

import ads_mobile_sdk.e13;
import ads_mobile_sdk.k33;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import dev.epro.r0.F7831687019675582853;
import dev.epro.r0.M17133811648581684718;
import dev.epro.r0.M8821877208104636290;
import dev.epro.r0.S16368912275120420111;
import dev.epro.r0.W4415201450379021245;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class k33 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f63o = new HashMap();
    public final Context a;
    public final d62 b;
    public boolean g;
    public final Intent h;
    public final W4415201450379021245 i;
    public j33 m;
    public S16368912275120420111 n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final F7831687019675582853 k = new IBinder.DeathRecipient() { // from class: dev.epro.r0.F7831687019675582853
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            k33 k33Var = this.a;
            k33Var.b.getClass();
            if (k33Var.j.get() != null) {
                Z3383101362411723454.s();
                return;
            }
            k33Var.b.getClass();
            ArrayList arrayList = k33Var.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                RemoteException remoteException = new RemoteException(G6547577305291411977.u(new StringBuilder(), k33Var.c, " : Binder has died."));
                M17133811648581684718 m17133811648581684718 = ((e13) obj).a;
                if (m17133811648581684718 != null) {
                    m17133811648581684718.a(remoteException);
                }
            }
            k33Var.d.clear();
            synchronized (k33Var.f) {
                try {
                    Iterator it = k33Var.e.iterator();
                    while (it.hasNext()) {
                        ((M17133811648581684718) it.next()).a(new RemoteException(k33Var.c + " : Binder has died."));
                    }
                    k33Var.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "PrewarmService";
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [dev.epro.r0.F7831687019675582853] */
    public k33(Context context, d62 d62Var, Intent intent, W4415201450379021245 w4415201450379021245) {
        this.a = context;
        this.b = d62Var;
        this.h = intent;
        this.i = w4415201450379021245;
    }

    public final void a(e33 e33Var) {
        S16368912275120420111 s16368912275120420111 = this.n;
        d62 d62Var = this.b;
        ArrayList arrayList = this.d;
        if (s16368912275120420111 != null || this.g) {
            if (!this.g) {
                e33Var.run();
                return;
            } else {
                d62Var.getClass();
                arrayList.add(e33Var);
                return;
            }
        }
        d62Var.getClass();
        arrayList.add(e33Var);
        j33 j33Var = new j33(this);
        this.m = j33Var;
        this.g = true;
        if (this.a.bindService(this.h, j33Var, 1)) {
            return;
        }
        int i = 0;
        this.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            M8821877208104636290 m8821877208104636290 = new M8821877208104636290("Failed to bind to the service.");
            M17133811648581684718 m17133811648581684718 = ((e13) obj).a;
            if (m17133811648581684718 != null) {
                m17133811648581684718.a(m8821877208104636290);
            }
        }
        arrayList.clear();
    }

    public final void b(e13 e13Var) {
        Handler handler;
        HashMap map = f63o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(e13Var);
    }
}
