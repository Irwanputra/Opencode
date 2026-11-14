package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class oi3 extends ads_mobile_sdk.iv2 {
    public final ads_mobile_sdk.b41 k;
    public double l;
    public java.util.Map m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.K12714355155332733186 k12714355155332733186, ads_mobile_sdk.b41 b41Var) {
        super(rg0Var, o12043144740933444288, jr0Var, k12714355155332733186);
        rg0Var.getClass();
        o12043144740933444288.getClass();
        jr0Var.getClass();
        k12714355155332733186.getClass();
        b41Var.getClass();
        this.k = b41Var;
        this.m = dev.epro.r0.X9852054718446117252.a;
    }

    @Override // ads_mobile_sdk.iv2
    public final boolean a() {
        boolean z;
        synchronized (this) {
            try {
                java.util.Iterator it = this.j.iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += ((ads_mobile_sdk.qi3) it.next()).b.length;
                }
                ads_mobile_sdk.jr0 jr0Var = this.c;
                jr0Var.getClass();
                z = length >= ((java.lang.Number) jr0Var.a("gads:cui_buffer_size", (java.lang.Object) 1000, (dev.epro.r0.F4096073349764486348) ads_mobile_sdk.ao.a$18)).intValue();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // ads_mobile_sdk.iv2
    public final long b() {
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return ((dev.epro.r0.E17093345031926825464) jr0Var.a("gads:cui_monitoring_interval_ms", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(5, dev.epro.r0.N13798149404328803870.f)), ads_mobile_sdk.ao.a)).a;
    }

    @Override // ads_mobile_sdk.iv2
    public final java.lang.Object a(dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        java.lang.Object objB = dev.epro.r0.O8620973563946607355.B(new ads_mobile_sdk.ni3(this, null), r14062301455140331524);
        return objB == dev.epro.r0.Z3437138737604933638.a ? objB : dev.epro.r0.O9245300239821758723.a;
    }
}
