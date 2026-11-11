package p034.p035.p041;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1047 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Field f5477;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final Handler f5478 = new Handler(Looper.getMainLooper());

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Field f5479;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final Class<?> f5480;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Method f5481;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Method f5482;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final Method f5483;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C1048 implements Application.ActivityLifecycleCallbacks {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Object f5484;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Activity f5485;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f5488 = false;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f5486 = false;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f5487 = false;

        public C1048(Activity activity) {
            this.f5485 = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f5485 == activity) {
                this.f5485 = null;
                this.f5486 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f5486 || this.f5487 || this.f5488) {
                return;
            }
            Object obj = this.f5484;
            boolean z = false;
            try {
                Object obj2 = C1047.f5479.get(activity);
                if (obj2 == obj) {
                    C1047.f5478.postAtFrontOfQueue(new RunnableC1050(C1047.f5477.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable unused) {
            }
            if (z) {
                this.f5487 = true;
                this.f5484 = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f5485 == activity) {
                this.f5488 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p034.p035.p041.C1047.f5478 = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            p034.p035.p041.C1047.f5480 = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            p034.p035.p041.C1047.f5477 = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r2 = r0
        L33:
            p034.p035.p041.C1047.f5479 = r2
            java.lang.Class<?> r2 = p034.p035.p041.C1047.f5480
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L40
        L3e:
            r2 = r0
            goto L55
        L40:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r7[r1] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3e
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
        L55:
            p034.p035.p041.C1047.f5483 = r2
            java.lang.Class<?> r2 = p034.p035.p041.C1047.f5480
            if (r2 != 0) goto L5d
        L5b:
            r2 = r0
            goto L6e
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5b
            r7[r1] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L5b
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
        L6e:
            p034.p035.p041.C1047.f5481 = r2
            java.lang.Class<?> r2 = p034.p035.p041.C1047.f5480
            boolean r4 = m2382()
            if (r4 == 0) goto Laf
            if (r2 != 0) goto L7b
            goto Laf
        L7b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Laf
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Laf
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Laf
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Laf
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Laf
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Laf
            r0 = r2
        Laf:
            p034.p035.p041.C1047.f5482 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p041.C1047.<clinit>():void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2382() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
