package dev.epro.r0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X12014589167171900524 implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f568o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static X12014589167171900524 r;
    public long a;
    public boolean b;
    public X12923627983819883516 c;
    public R1522653773346014961 d;
    public final Context e;
    public final X11123940576545591343 f;
    public final M204440408817344908 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final K4498948325030944807 k;
    public final K4498948325030944807 l;
    public final R502132765509599220 m;
    public volatile boolean n;

    public X12014589167171900524(Context context, Looper looper) {
        X11123940576545591343 x11123940576545591343 = X11123940576545591343.d;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new K4498948325030944807(0);
        this.l = new K4498948325030944807(0);
        this.n = true;
        this.e = context;
        R502132765509599220 r502132765509599220 = new R502132765509599220(looper, this);
        this.m = r502132765509599220;
        this.f = x11123940576545591343;
        this.g = new M204440408817344908((byte) 11);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = Y582199805280922215.A;
        if (bool == null) {
            bool = Boolean.valueOf(M2066880349381062048.G() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            Y582199805280922215.A = bool;
        }
        if (bool.booleanValue()) {
            this.n = false;
        }
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(6));
    }

    public static Status c(H9807528374655572032 h9807528374655572032, B6867906687934285025 b6867906687934285025) {
        String str = (String) h9807528374655572032.b.c;
        String valueOf = String.valueOf(b6867906687934285025);
        return new Status(17, G6547577305291411977.w(new StringBuilder(str.length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), b6867906687934285025.f, b6867906687934285025);
    }

    public static X12014589167171900524 e(Context context) {
        X12014589167171900524 x12014589167171900524;
        HandlerThread handlerThread;
        synchronized (q) {
            x12014589167171900524 = r;
            if (x12014589167171900524 == null) {
                synchronized (K4690422250417820120.g) {
                    try {
                        handlerThread = K4690422250417820120.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            K4690422250417820120.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = K4690422250417820120.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = X11123940576545591343.c;
                X12014589167171900524 x120145891671719005242 = new X12014589167171900524(applicationContext, looper);
                r = x120145891671719005242;
                x12014589167171900524 = x120145891671719005242;
            }
        }
        return x12014589167171900524;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        F5577235160184315757 f5577235160184315757 = (F5577235160184315757) H12843822278061842084.C().b;
        if (f5577235160184315757 != null && !f5577235160184315757.e) {
            return false;
        }
        int i = ((SparseIntArray) this.g.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(B6867906687934285025 b6867906687934285025, int i) {
        Boolean bool;
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool2;
        X11123940576545591343 x11123940576545591343 = this.f;
        Context context = this.e;
        x11123940576545591343.getClass();
        synchronized (S2941385686793915703.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = S2941385686793915703.a;
            if (context2 != null && (bool2 = S2941385686793915703.b) != null && context2 == applicationContext) {
                booleanValue = bool2.booleanValue();
            }
            S2941385686793915703.b = null;
            if (M2066880349381062048.G()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                bool = Boolean.valueOf(isInstantApp);
                S2941385686793915703.b = bool;
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    bool = Boolean.TRUE;
                    S2941385686793915703.b = bool;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                    S2941385686793915703.b = bool;
                }
            }
            S2941385686793915703.a = applicationContext;
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = b6867906687934285025.e;
        if (i2 == 0 || (activity = b6867906687934285025.f) == null) {
            Intent a = x11123940576545591343.a(context, i2, null);
            activity = a != null ? PendingIntent.getActivity(context, 0, a, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = b6867906687934285025.e;
        int i4 = GoogleApiActivity.b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        x11123940576545591343.f(context, i3, PendingIntent.getActivity(context, 0, intent, C1954869789476761065.a | 134217728));
        return true;
    }

    public final Z102412548944701279 d(G12913592264896487192 g12913592264896487192) {
        H9807528374655572032 h9807528374655572032 = g12913592264896487192.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        Z102412548944701279 z102412548944701279 = (Z102412548944701279) concurrentHashMap.get(h9807528374655572032);
        if (z102412548944701279 == null) {
            z102412548944701279 = new Z102412548944701279(this, g12913592264896487192);
            concurrentHashMap.put(h9807528374655572032, z102412548944701279);
        }
        if (z102412548944701279.b.requiresSignIn()) {
            this.l.add(h9807528374655572032);
        }
        z102412548944701279.j();
        return z102412548944701279;
    }

    public final void f(B6867906687934285025 b6867906687934285025, int i) {
        if (b(b6867906687934285025, i)) {
            return;
        }
        R502132765509599220 r502132765509599220 = this.m;
        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(5, i, 0, b6867906687934285025));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0386  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X12014589167171900524.handleMessage(android.os.Message):boolean");
    }
}
