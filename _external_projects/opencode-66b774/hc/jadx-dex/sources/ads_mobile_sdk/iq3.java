package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iq3 extends ads_mobile_sdk.c61 {
    public final ads_mobile_sdk.op3 c;
    public final ads_mobile_sdk.aw d;
    public final ads_mobile_sdk.jr0 e;
    public final dev.epro.r0.W5797197595347441198 f;
    public final dev.epro.r0.W5797197595347441198 g;
    public final ads_mobile_sdk.kz2 h;
    public final ads_mobile_sdk.rg0 i;
    public final dev.epro.r0.K12714355155332733186 j;
    public final dev.epro.r0.R5692663580087387669 k;
    public final dev.epro.r0.O12494175665883759871 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq3(ads_mobile_sdk.op3 op3Var, ads_mobile_sdk.aw awVar, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.K12714355155332733186 k12714355155332733186) {
        super((ads_mobile_sdk.wv0) null, 1);
        op3Var.getClass();
        awVar.getClass();
        jr0Var.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        kz2Var.getClass();
        k12714355155332733186.getClass();
        this.c = op3Var;
        this.d = awVar;
        this.e = jr0Var;
        this.f = w5797197595347441198;
        this.g = w57971975953474411982;
        this.h = kz2Var;
        this.i = rg0Var;
        this.j = k12714355155332733186;
        this.k = dev.epro.r0.J8045362843799184672.k();
        this.l = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.H2607093550274855851(this, (byte) 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.iq3 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iq3.a(ads_mobile_sdk.iq3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        if (((java.lang.Boolean) this.l.getValue()).booleanValue()) {
            ads_mobile_sdk.jr0 jr0Var = this.e;
            jr0Var.getClass();
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = ((java.lang.Boolean) jr0Var.a("gads:webview_initialization_executor:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue() ? this.g : this.f;
            dev.epro.r0.S14769385926647291222 s14769385926647291222 = new dev.epro.r0.S14769385926647291222(this, (dev.epro.r0.R4833348786910499294) null, (byte) 3);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(s14769385926647291222, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        } else {
            this.k.f0();
        }
        return new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        boolean zBooleanValue = ((java.lang.Boolean) this.l.getValue()).booleanValue();
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        if (zBooleanValue) {
            java.lang.Object objV = this.k.v(k14749510448791472029);
            if (objV == z3437138737604933638) {
                return objV;
            }
        } else {
            java.lang.Object objB = this.j.b(k14749510448791472029);
            if (objB == z3437138737604933638) {
                return objB;
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
