package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qm1 implements dev.epro.r0.L17385865533161060024 {
    public static final ads_mobile_sdk.m7 u;
    public final android.content.Context a;
    public final dev.epro.r0.P17493338506140929634 b;
    public final java.util.concurrent.ExecutorService c;
    public final ads_mobile_sdk.j11 d;
    public final boolean e;
    public final java.lang.String f;
    public final long g;
    public final long h;
    public final double i;
    public final java.lang.String j;
    public final int k;
    public final long l;
    public final java.util.concurrent.atomic.AtomicBoolean m = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.lang.Object n = new java.lang.Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f97o = new java.lang.Object();
    public final java.lang.Object p = new java.lang.Object();
    public final dev.epro.r0.L6589127411573323482 q = ads_mobile_sdk.s7.o();
    public final java.util.ArrayList r = new java.util.ArrayList();
    public boolean s = false;
    public final java.util.HashMap t = new java.util.HashMap();

    static {
        dev.epro.r0.Z8828090230903725619 z8828090230903725619O = ads_mobile_sdk.m7.o();
        z8828090230903725619O.b();
        ads_mobile_sdk.m7 m7Var = (ads_mobile_sdk.m7) z8828090230903725619O.b;
        m7Var.getClass();
        m7Var.binaryName_ = 15;
        m7Var.bitField0_ |= 1;
        u = (ads_mobile_sdk.m7) z8828090230903725619O.a();
    }

    public qm1(android.content.Context context, dev.epro.r0.P17493338506140929634 p17493338506140929634, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.j11 j11Var, java.util.Random random, java.lang.String str, long j, long j2, double d, java.lang.String str2, int i, long j3) {
        this.a = context;
        this.b = p17493338506140929634;
        this.c = executorService;
        this.d = j11Var;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = i;
        this.l = j3;
        this.e = random.nextDouble() < d;
    }

    public final void a(ads_mobile_sdk.s7 s7Var) {
        try {
            dev.epro.r0.G6043217313194465797 g6043217313194465797O = ads_mobile_sdk.a8.o();
            ads_mobile_sdk.m7 m7Var = u;
            g6043217313194465797O.b();
            ((ads_mobile_sdk.a8) g6043217313194465797O.b).a(m7Var);
            dev.epro.r0.Z10352821448393905481 z10352821448393905481O = ads_mobile_sdk.y7.o();
            z10352821448393905481O.b();
            ((ads_mobile_sdk.y7) z10352821448393905481O.b).a(s7Var);
            ads_mobile_sdk.y7 y7Var = (ads_mobile_sdk.y7) z10352821448393905481O.a();
            g6043217313194465797O.b();
            ((ads_mobile_sdk.a8) g6043217313194465797O.b).a(y7Var);
            this.d.a(this.f, "application/x-protobuf", true, ((ads_mobile_sdk.a8) g6043217313194465797O.a()).a());
        } catch (java.lang.RuntimeException unused) {
        }
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        dev.epro.r0.H8027516537527559298 h8027516537527559298 = new dev.epro.r0.H8027516537527559298(java.util.concurrent.Executors.callable(new dev.epro.r0.D454499102558517651(this, (byte) 1), null));
        this.c.execute(h8027516537527559298);
        return h8027516537527559298;
    }

    public final void a(int i, long j, java.lang.Throwable th, java.lang.String str) {
        if (this.e) {
            synchronized (this.f97o) {
                try {
                    this.r.add(new ads_mobile_sdk.pm1(i, j, th, str, a(i)));
                    if (!this.s) {
                        this.s = true;
                        this.b.a(new dev.epro.r0.D454499102558517651(this, (byte) 0), this.h);
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final long a(int i) {
        long jLongValue;
        synchronized (this.p) {
            try {
                java.lang.Long l = (java.lang.Long) this.t.get(java.lang.Integer.valueOf(i));
                if (l == null) {
                    l = 0L;
                }
                jLongValue = l.longValue() + 1;
                this.t.put(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(jLongValue));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return jLongValue;
    }
}
