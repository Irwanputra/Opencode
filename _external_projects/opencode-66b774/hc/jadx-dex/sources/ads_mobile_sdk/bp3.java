package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bp3 implements dev.epro.r0.S1392253949846343516, dev.epro.r0.L17385865533161060024 {
    public static final java.lang.String[] h = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final dev.epro.r0.O16637889491137121389 a;
    public final android.content.Context b;
    public final java.util.concurrent.ExecutorService c;
    public long d = 0;
    public long e = 0;
    public long f = -1;
    public boolean g = false;

    public bp3(android.content.Context context, dev.epro.r0.O16637889491137121389 o16637889491137121389, java.util.concurrent.ExecutorService executorService) {
        this.a = o16637889491137121389;
        this.b = context;
        this.c = executorService;
    }

    public final void a(java.util.HashMap map) {
        long j;
        long j2;
        c();
        synchronized (this) {
            try {
                j = this.g ? this.e - this.d : -1L;
            } finally {
            }
        }
        map.put("vs", java.lang.Long.valueOf(j));
        synchronized (this) {
            j2 = this.f;
            this.f = -1L;
        }
        map.put("vf", java.lang.Long.valueOf(j2));
    }

    public final void b(java.util.HashMap map) {
        c();
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.g) {
                    this.a.getClass();
                    this.e = java.lang.System.currentTimeMillis();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void a(java.util.HashMap map, android.content.Context context, android.view.View view) {
        c();
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return dev.epro.r0.B6805403844224311194.b;
        }
        dev.epro.r0.H8027516537527559298 h8027516537527559298 = new dev.epro.r0.H8027516537527559298(java.util.concurrent.Executors.callable(new dev.epro.r0.W13948953340889349604(this, (byte) 29), null));
        this.c.execute(h8027516537527559298);
        return h8027516537527559298;
    }
}
