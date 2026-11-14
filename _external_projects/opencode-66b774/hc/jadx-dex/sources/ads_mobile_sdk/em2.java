package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class em2 extends ads_mobile_sdk.th3 {
    public final ads_mobile_sdk.c7 g;
    public final dev.epro.r0.O16637889491137121389 h;
    public final ads_mobile_sdk.ci3 i;
    public ads_mobile_sdk.em2 j;
    public final ads_mobile_sdk.cc2 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public em2(ads_mobile_sdk.wv0 wv0Var, java.util.List list, java.util.UUID uuid, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.c7 c7Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.ci3 ci3Var, int i, ads_mobile_sdk.em2 em2Var, boolean z, int i2) {
        ads_mobile_sdk.em2 em2Var2 = (i2 & 256) != 0 ? null : em2Var;
        int i3 = (i2 & 512) != 0 ? -1 : 0;
        ads_mobile_sdk.q22 q22Var = ads_mobile_sdk.xv.f2a;
        java.lang.Boolean boolValueOf = q22Var != null ? java.lang.Boolean.valueOf(q22Var.l.get()) : null;
        o16637889491137121389.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        super(wv0Var, mi3Var, uuid, em2Var2, jCurrentTimeMillis);
        this.g = c7Var;
        this.h = o16637889491137121389;
        this.i = ci3Var;
        int i4 = em2Var2 != null ? em2Var2.k.a : -1;
        long j = jCurrentTimeMillis - dev.epro.r0.J10256772239794345968.c;
        long j2 = dev.epro.r0.J10256772239794345968.d;
        long j3 = j2 < 0 ? -1L : jCurrentTimeMillis - j2;
        ads_mobile_sdk.q22 q22Var2 = ads_mobile_sdk.xv.f2a;
        java.lang.Integer numValueOf = q22Var2 != null ? java.lang.Integer.valueOf(q22Var2.m.get()) : null;
        ads_mobile_sdk.q22 q22Var3 = ads_mobile_sdk.xv.f2a;
        this.k = new ads_mobile_sdk.cc2(i3, mi3Var, wv0Var, list, uuid, i4, i, jCurrentTimeMillis, j, j3, z, boolValueOf, numValueOf, q22Var3 != null ? java.lang.Integer.valueOf(q22Var3.n.get()) : null, 536868864);
    }

    @Override // ads_mobile_sdk.th3
    public final ads_mobile_sdk.th3 a(ads_mobile_sdk.wv0 wv0Var, java.util.List list, boolean z) {
        wv0Var.getClass();
        ads_mobile_sdk.cc2 cc2Var = this.k;
        java.util.UUID uuid = cc2Var.e;
        ads_mobile_sdk.mi3 mi3Var = this.a;
        int i = cc2Var.g + 1;
        ads_mobile_sdk.c7 c7Var = this.g;
        ads_mobile_sdk.em2 em2Var = new ads_mobile_sdk.em2(wv0Var, list, uuid, mi3Var, c7Var, this.h, this.i, i, this, z, 1536);
        int i2 = cc2Var.x;
        ads_mobile_sdk.cc2 cc2Var2 = em2Var.k;
        cc2Var2.x = i2;
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) c7Var.a;
        while (true) {
            java.lang.Object obj = atomicReference.get();
            obj.getClass();
            ads_mobile_sdk.em2 em2Var2 = (ads_mobile_sdk.em2) obj;
            int i3 = em2Var2.k.a + 1;
            if (em2Var.d.get()) {
                ads_mobile_sdk.xv.a("This trace " + cc2Var2.c.name() + " has already finished");
            } else {
                cc2Var2.a = i3;
                em2Var.j = em2Var2;
            }
            while (!atomicReference.compareAndSet(em2Var2, em2Var)) {
                if (atomicReference.get() != em2Var2) {
                    break;
                }
            }
            return em2Var;
        }
    }

    @Override // ads_mobile_sdk.th3
    public final void a$1() {
        ads_mobile_sdk.cc2[] cc2VarArr;
        super.a$1();
        ads_mobile_sdk.cc2 cc2Var = this.k;
        if (cc2Var.a == 0) {
            java.util.UUID uuid = cc2Var.e;
            ads_mobile_sdk.em2 em2Var = (ads_mobile_sdk.em2) ((java.util.concurrent.atomic.AtomicReference) this.g.a).get();
            if (em2Var == null) {
                cc2VarArr = new ads_mobile_sdk.cc2[0];
            } else {
                ads_mobile_sdk.cc2[] cc2VarArr2 = new ads_mobile_sdk.cc2[em2Var.k.a + 1];
                while (em2Var != null) {
                    ads_mobile_sdk.cc2 cc2Var2 = em2Var.k;
                    cc2VarArr2[cc2Var2.a] = cc2Var2;
                    em2Var = em2Var.j;
                }
                cc2VarArr = (ads_mobile_sdk.cc2[]) dev.epro.r0.O5378677881740157249.B0(cc2VarArr2).toArray(new ads_mobile_sdk.cc2[0]);
            }
            cc2VarArr.getClass();
            ads_mobile_sdk.ci3 ci3Var = this.i;
            ci3Var.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ads_mobile_sdk.cc2 cc2Var3 : cc2VarArr) {
                java.lang.Boolean bool = (java.lang.Boolean) ci3Var.f20o.get(java.lang.String.valueOf(cc2Var3.c.getNumber()));
                if (bool != null ? bool.booleanValue() : ci3Var.k) {
                    arrayList.add(cc2Var3);
                }
            }
            ads_mobile_sdk.qi3 qi3Var = !arrayList.isEmpty() ? new ads_mobile_sdk.qi3(uuid, (ads_mobile_sdk.cc2[]) arrayList.toArray(new ads_mobile_sdk.cc2[0])) : null;
            if (qi3Var != null) {
                ci3Var.d.a(qi3Var);
                if (ci3Var.n) {
                    for (ads_mobile_sdk.cc2 cc2Var4 : qi3Var.b) {
                        java.lang.Throwable th = cc2Var4.f18o;
                        if (th == null) {
                            th = cc2Var4.n;
                        }
                        java.lang.Throwable th2 = th;
                        if (th2 != null) {
                            ci3Var.e.a(new ads_mobile_sdk.fl0(th2, cc2Var4.c.name(), cc2Var4.b, true, cc2Var4.h, -1, false));
                        }
                    }
                }
            }
        }
    }

    @Override // ads_mobile_sdk.th3
    public final ads_mobile_sdk.cc2 e() {
        return this.k;
    }

    @Override // ads_mobile_sdk.th3
    public final void h() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.h.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
        this.k.p = dev.epro.r0.E17093345031926825464.g(dev.epro.r0.M9216324016624295870.a0(jCurrentTimeMillis, n13798149404328803870), dev.epro.r0.M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
