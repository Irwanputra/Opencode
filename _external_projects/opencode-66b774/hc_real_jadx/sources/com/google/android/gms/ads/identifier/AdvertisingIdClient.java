package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.google.android.gms.internal.zzfo;
import com.google.android.gms.internal.zzfp;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p196.C2355;
import p131.p161.p162.p193.p205.C2508;
import p131.p161.p162.p193.p205.C2518;
import p131.p161.p162.p193.p205.ServiceConnectionC2514;
import p131.p161.p162.p193.p205.p210.C2516;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AdvertisingIdClient {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public long f2568;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzfo f2569;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2570;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2571;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public ServiceConnectionC2514 f2572;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C0373 f2573;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Context f2574;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object f2575;

    public static final class Info {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean f2576;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f2577;

        public Info(String str, boolean z) {
            this.f2577 = str;
            this.f2576 = z;
        }

        public final String getId() {
            return this.f2577;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f2576;
        }

        public final String toString() {
            String str = this.f2577;
            boolean z = this.f2576;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0373 extends Thread {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public WeakReference<AdvertisingIdClient> f2578;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public long f2579;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public CountDownLatch f2581 = new CountDownLatch(1);

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f2580 = false;

        public C0373(AdvertisingIdClient advertisingIdClient, long j) {
            this.f2578 = new WeakReference<>(advertisingIdClient);
            this.f2579 = j;
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AdvertisingIdClient advertisingIdClient;
            try {
                if (this.f2581.await(this.f2579, TimeUnit.MILLISECONDS) || (advertisingIdClient = this.f2578.get()) == null) {
                    return;
                }
                advertisingIdClient.finish();
                this.f2580 = true;
            } catch (InterruptedException unused) {
                AdvertisingIdClient advertisingIdClient2 = this.f2578.get();
                if (advertisingIdClient2 != null) {
                    advertisingIdClient2.finish();
                    this.f2580 = true;
                }
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f2575 = new Object();
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2574 = context;
        this.f2571 = false;
        this.f2568 = j;
        this.f2570 = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0024 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:9:0x001f, B:29:0x0024), top: B:8:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context r13) {
        /*
            com.google.android.gms.ads.identifier.zzb r0 = new com.google.android.gms.ads.identifier.zzb
            r0.<init>(r13)
            java.lang.String r1 = "gads:ad_id_app_context:enabled"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.String r3 = "gads:ad_id_app_context:ping_ratio"
            r4 = 0
            android.content.SharedPreferences r5 = r0.f2582     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L14
            goto L1a
        L14:
            float r3 = r5.getFloat(r3, r4)     // Catch: java.lang.Throwable -> L1a
            r11 = r3
            goto L1b
        L1a:
            r11 = 0
        L1b:
            java.lang.String r3 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r4 = ""
            android.content.SharedPreferences r5 = r0.f2582     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L24
            goto L2a
        L24:
            java.lang.String r3 = r5.getString(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r12 = r3
            goto L2b
        L2a:
            r12 = r4
        L2b:
            java.lang.String r3 = "gads:ad_id_use_persistent_service:enabled"
            boolean r8 = r0.getBoolean(r3, r2)
            com.google.android.gms.ads.identifier.AdvertisingIdClient r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r5 = -1
            r3 = r0
            r4 = r13
            r7 = r1
            r3.<init>(r4, r5, r7, r8)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L59
            r0.m1203(r2)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r13 = r0.getInfo()     // Catch: java.lang.Throwable -> L59
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L59
            long r7 = r5 - r3
            r10 = 0
            r3 = r0
            r4 = r13
            r5 = r1
            r6 = r11
            r9 = r12
            r3.m1201(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L59
            r0.finish()
            return r13
        L59:
            r13 = move-exception
            r4 = 0
            r7 = -1
            r3 = r0
            r5 = r1
            r6 = r11
            r9 = r12
            r10 = r13
            r3.m1201(r4, r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L66:
            r13 = move-exception
            r0.finish()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzbVar = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.m1203(false);
            return advertisingIdClient.getIsAdIdFakeForDebugLogging();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static ServiceConnectionC2514 m1200(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int m4531 = C2518.f9865.m4531(context);
            if (m4531 != 0 && m4531 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC2514 serviceConnectionC2514 = new ServiceConnectionC2514();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                C2516 m4528 = C2516.m4528();
                m4528.getClass();
                context.getClass().getName();
                if (m4528.m4529(context, intent, serviceConnectionC2514, 1)) {
                    return serviceConnectionC2514;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C2508(9);
        }
    }

    public void finalize() {
        finish();
        super.finalize();
    }

    public void finish() {
        C1687.m3676("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2574 == null || this.f2572 == null) {
                return;
            }
            try {
                if (this.f2571) {
                    C2516.m4528();
                    this.f2574.unbindService(this.f2572);
                }
            } catch (Throwable unused) {
            }
            this.f2571 = false;
            this.f2569 = null;
            this.f2572 = null;
        }
    }

    public Info getInfo() {
        Info info;
        C1687.m3676("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f2571) {
                synchronized (this.f2575) {
                    C0373 c0373 = this.f2573;
                    if (c0373 == null || !c0373.f2580) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m1203(false);
                    if (!this.f2571) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C1687.m3688(this.f2572);
            C1687.m3688(this.f2569);
            try {
                info = new Info(this.f2569.getId(), this.f2569.zzb(true));
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        m1202();
        return info;
    }

    public boolean getIsAdIdFakeForDebugLogging() {
        boolean zzbp;
        C1687.m3676("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f2571) {
                synchronized (this.f2575) {
                    C0373 c0373 = this.f2573;
                    if (c0373 == null || !c0373.f2580) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m1203(false);
                    if (!this.f2571) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            C1687.m3688(this.f2572);
            C1687.m3688(this.f2569);
            try {
                zzbp = this.f2569.zzbp();
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        m1202();
        return zzbp;
    }

    public void start() {
        m1203(true);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m1201(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2355(hashMap).start();
        return true;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1202() {
        synchronized (this.f2575) {
            C0373 c0373 = this.f2573;
            if (c0373 != null) {
                c0373.f2581.countDown();
                try {
                    this.f2573.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f2568 > 0) {
                this.f2573 = new C0373(this, this.f2568);
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1203(boolean z) {
        C1687.m3676("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2571) {
                finish();
            }
            ServiceConnectionC2514 m1200 = m1200(this.f2574, this.f2570);
            this.f2572 = m1200;
            try {
                this.f2569 = zzfp.zzc(m1200.m4527(TimeUnit.MILLISECONDS));
                this.f2571 = true;
                if (z) {
                    m1202();
                }
            } catch (InterruptedException unused) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }
}
