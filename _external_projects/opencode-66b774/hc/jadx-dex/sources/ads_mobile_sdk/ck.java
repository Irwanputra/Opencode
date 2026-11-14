package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ck implements dev.epro.r0.B8669154544800329371 {
    public final dev.epro.r0.O16637889491137121389 a;
    public final ads_mobile_sdk.jr0 b;
    public final java.lang.Object c;
    public int d;
    public int e;
    public final java.util.LinkedHashMap f;
    public java.lang.Long g;
    public final java.lang.Object h;
    public int i;
    public final java.util.LinkedHashMap j;
    public final java.util.LinkedHashMap k;
    public final java.lang.Object l;
    public boolean m;
    public long n;

    public ck(ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        o16637889491137121389.getClass();
        jr0Var.getClass();
        this.a = o16637889491137121389;
        this.b = jr0Var;
        this.c = new java.lang.Object();
        this.d = -1;
        this.e = -1;
        this.f = new java.util.LinkedHashMap();
        this.h = new java.lang.Object();
        this.j = new java.util.LinkedHashMap();
        this.k = new java.util.LinkedHashMap();
        this.l = new java.lang.Object();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.n = 0L;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object b(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        synchronized (this.l) {
            if (!this.m) {
                return dev.epro.r0.O9245300239821758723.a;
            }
            if (dev.epro.r0.E17093345031926825464.c(j, this.n) < 0) {
                return dev.epro.r0.O9245300239821758723.a;
            }
            boolean z = false;
            this.m = false;
            ads_mobile_sdk.jr0 jr0Var = this.b;
            jr0Var.getClass();
            if (((java.lang.Boolean) jr0Var.a("gads:reset_session_counters_on_app_foreground:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                long jG = dev.epro.r0.E17093345031926825464.g(j, this.n);
                ads_mobile_sdk.jr0 jr0Var2 = this.b;
                jr0Var2.getClass();
                if (dev.epro.r0.E17093345031926825464.c(jG, ((dev.epro.r0.E17093345031926825464) jr0Var2.a("gads:app_activity_tracker:app_session_timeout_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(5, dev.epro.r0.N13798149404328803870.f)), ads_mobile_sdk.ao.a)).a) > 0) {
                    z = true;
                }
            }
            this.n = j;
            dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
            if (!z) {
                return o9245300239821758723;
            }
            synchronized (this.c) {
                this.g = null;
                this.e = -1;
            }
            return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object d(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        synchronized (this.l) {
            if (this.m) {
                return dev.epro.r0.O9245300239821758723.a;
            }
            if (dev.epro.r0.E17093345031926825464.c(j, this.n) < 0) {
                return dev.epro.r0.O9245300239821758723.a;
            }
            this.m = true;
            this.n = j;
            return dev.epro.r0.O9245300239821758723.a;
        }
    }
}
