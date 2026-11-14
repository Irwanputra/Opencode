package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xp1 extends ads_mobile_sdk.th3 {
    public final ads_mobile_sdk.cc2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public xp1(ads_mobile_sdk.wv0 wv0Var, java.util.List list, java.util.UUID uuid, ads_mobile_sdk.mi3 mi3Var, int i, int i2, ads_mobile_sdk.xp1 xp1Var, boolean z) {
        wv0Var.getClass();
        mi3Var.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        super(wv0Var, mi3Var, uuid, xp1Var, jCurrentTimeMillis);
        int i3 = xp1Var != null ? xp1Var.g.a : -1;
        long j = jCurrentTimeMillis - dev.epro.r0.J10256772239794345968.c;
        long j2 = dev.epro.r0.J10256772239794345968.d;
        this.g = new ads_mobile_sdk.cc2(i2, mi3Var, wv0Var, list, uuid, i3, i, jCurrentTimeMillis, j, j2 < 0 ? -1L : jCurrentTimeMillis - j2, z, null, null, null, -2048);
    }

    @Override // ads_mobile_sdk.th3
    public final ads_mobile_sdk.th3 a(ads_mobile_sdk.wv0 wv0Var, java.util.List list, boolean z) {
        wv0Var.getClass();
        ads_mobile_sdk.cc2 cc2Var = this.g;
        return new ads_mobile_sdk.xp1(wv0Var, list, cc2Var.e, this.a, cc2Var.g + 1, cc2Var.a + 1, this, z);
    }

    @Override // ads_mobile_sdk.th3
    public final ads_mobile_sdk.cc2 e() {
        return this.g;
    }

    @Override // ads_mobile_sdk.th3
    public final void h() {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
        this.g.p = dev.epro.r0.E17093345031926825464.g(dev.epro.r0.M9216324016624295870.a0(jCurrentTimeMillis, n13798149404328803870), dev.epro.r0.M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
