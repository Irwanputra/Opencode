package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A7202329723792933819 {
    public final android.app.Application b;
    public final dev.epro.r0.D6285004323073107982 c;
    public final java.util.concurrent.Executor d;
    public final boolean e;
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference j = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference k = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference l = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(null);

    public A7202329723792933819(android.app.Application application, java.util.concurrent.Executor executor, dev.epro.r0.D6285004323073107982 d6285004323073107982, boolean z) {
        this.e = z;
        this.b = application;
        this.c = d6285004323073107982;
        this.d = executor;
    }

    public final void a(java.util.Queue queue, int i, int i2, java.lang.String str) {
        android.os.Bundle bundle;
        java.lang.Long l = (java.lang.Long) queue.poll();
        if (l != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = this.k;
            java.util.Queue queue2 = (java.util.Queue) atomicReference.get();
            dev.epro.r0.D6285004323073107982 d6285004323073107982 = this.c;
            android.app.Application application = d6285004323073107982.a;
            dev.epro.r0.U502168740281352038 u502168740281352038L = dev.epro.r0.R11149085407531885860.l();
            dev.epro.r0.Y16042940039758055201 y16042940039758055201L = dev.epro.r0.O17502728698316798833.l();
            dev.epro.r0.Q6316841325799975503 q6316841325799975503L = dev.epro.r0.K3685918173329061.l();
            q6316841325799975503L.b();
            dev.epro.r0.K3685918173329061.o(((dev.epro.r0.T1232575005132407166) q6316841325799975503L).b, i);
            if (str != null) {
                q6316841325799975503L.b();
                dev.epro.r0.K3685918173329061.m(((dev.epro.r0.T1232575005132407166) q6316841325799975503L).b, str);
            }
            if (jCurrentTimeMillis > 0) {
                q6316841325799975503L.b();
                dev.epro.r0.K3685918173329061.n(((dev.epro.r0.T1232575005132407166) q6316841325799975503L).b, jCurrentTimeMillis);
            }
            dev.epro.r0.K3685918173329061 k3685918173329061A = q6316841325799975503L.a();
            y16042940039758055201L.b();
            dev.epro.r0.O17502728698316798833.q(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, k3685918173329061A);
            java.lang.String str2 = d6285004323073107982.e;
            android.content.pm.PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    d6285004323073107982.e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                android.text.TextUtils.isEmpty(d6285004323073107982.e);
                str2 = d6285004323073107982.e;
            }
            if (str2 != null) {
                y16042940039758055201L.b();
                dev.epro.r0.O17502728698316798833.n(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, str2);
            }
            dev.epro.r0.P6050475907163555115 p6050475907163555115 = d6285004323073107982.b;
            if (p6050475907163555115 == null) {
                dev.epro.r0.G9236695831746325507 g9236695831746325507L = dev.epro.r0.P6050475907163555115.l();
                g9236695831746325507L.b();
                dev.epro.r0.P6050475907163555115.m(((dev.epro.r0.T1232575005132407166) g9236695831746325507L).b);
                p6050475907163555115 = (dev.epro.r0.P6050475907163555115) g9236695831746325507L.a();
                d6285004323073107982.b = p6050475907163555115;
            }
            y16042940039758055201L.b();
            dev.epro.r0.O17502728698316798833.r(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, p6050475907163555115);
            dev.epro.r0.J16182260230277075531 j16182260230277075531 = d6285004323073107982.d;
            if (j16182260230277075531 == null) {
                dev.epro.r0.D9644658574388513154 d9644658574388513154L = dev.epro.r0.J16182260230277075531.l();
                int i3 = android.os.Build.VERSION.SDK_INT;
                d9644658574388513154L.b();
                dev.epro.r0.J16182260230277075531.m(((dev.epro.r0.T1232575005132407166) d9644658574388513154L).b, i3);
                java.lang.String str3 = android.os.Build.MODEL;
                d9644658574388513154L.b();
                dev.epro.r0.J16182260230277075531.n(((dev.epro.r0.T1232575005132407166) d9644658574388513154L).b);
                d9644658574388513154L.b();
                dev.epro.r0.J16182260230277075531.p(((dev.epro.r0.T1232575005132407166) d9644658574388513154L).b);
                java.lang.String str4 = android.os.Build.VERSION.RELEASE;
                d9644658574388513154L.b();
                dev.epro.r0.J16182260230277075531.o(((dev.epro.r0.T1232575005132407166) d9644658574388513154L).b);
                j16182260230277075531 = (dev.epro.r0.J16182260230277075531) d9644658574388513154L.a();
                d6285004323073107982.d = j16182260230277075531;
            }
            y16042940039758055201L.b();
            dev.epro.r0.O17502728698316798833.p(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, j16182260230277075531);
            dev.epro.r0.P3983812329505132585 p3983812329505132585 = d6285004323073107982.c;
            if (p3983812329505132585 == null) {
                java.lang.String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    dev.epro.r0.U1589746969543987342 u1589746969543987342L = dev.epro.r0.P3983812329505132585.l();
                    java.lang.String string = java.lang.Long.toString(android.os.Build.VERSION.SDK_INT >= 28 ? dev.epro.r0.U14881866531452519068.u(packageInfo) : packageInfo.versionCode);
                    u1589746969543987342L.b();
                    dev.epro.r0.P3983812329505132585.n(((dev.epro.r0.T1232575005132407166) u1589746969543987342L).b, string);
                    u1589746969543987342L.b();
                    dev.epro.r0.P3983812329505132585.m(((dev.epro.r0.T1232575005132407166) u1589746969543987342L).b, packageName);
                    d6285004323073107982.c = u1589746969543987342L.a();
                }
                p3983812329505132585 = d6285004323073107982.c;
            }
            if (p3983812329505132585 != null) {
                y16042940039758055201L.b();
                dev.epro.r0.O17502728698316798833.o(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, p3983812329505132585);
            }
            java.lang.String string2 = android.preference.PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                dev.epro.r0.T1758414213958857646 t1758414213958857646 = new dev.epro.r0.T1758414213958857646(string2);
                while (t1758414213958857646.hasNext()) {
                    java.lang.String str5 = (java.lang.String) t1758414213958857646.next();
                    y16042940039758055201L.b();
                    dev.epro.r0.O17502728698316798833.m(((dev.epro.r0.T1232575005132407166) y16042940039758055201L).b, str5);
                }
            }
            dev.epro.r0.O17502728698316798833 o17502728698316798833A = y16042940039758055201L.a();
            u502168740281352038L.b();
            dev.epro.r0.R11149085407531885860.m(((dev.epro.r0.T1232575005132407166) u502168740281352038L).b, o17502728698316798833A);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            u502168740281352038L.b();
            dev.epro.r0.R11149085407531885860.n(((dev.epro.r0.T1232575005132407166) u502168740281352038L).b, jCurrentTimeMillis2);
            queue2.add(u502168740281352038L.a());
            if (this.e) {
                ((java.util.ArrayDeque) this.l.get()).addAll((java.util.Collection) atomicReference.get());
            }
            this.d.execute(new dev.epro.r0.U3594978070141619353(this, (byte) 20));
        }
    }
}
