package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d3 extends dr {
    public final fz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(fz fzVar, jr0 jr0Var, g0 g0Var, kz2 kz2Var, O16637889491137121389 o16637889491137121389, W5797197595347441198 w5797197595347441198) {
        super(o16637889491137121389, w5797197595347441198, kz2Var, jr0Var, g0Var);
        w5797197595347441198.getClass();
        fzVar.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        kz2Var.getClass();
        g0Var.getClass();
        this.l = fzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d3 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.b3
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.b3 r0 = (ads_mobile_sdk.b3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.b3 r0 = new ads_mobile_sdk.b3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L51
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r3
        L2c:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.W5797197595347441198 r6 = r5.d
            dev.epro.r0.H10430515288632824348 r1 = new dev.epro.r0.H10430515288632824348
            r1.<init>(r5, r3, r2)
            r6.getClass()
            dev.epro.r0.X15965119713728731855 r5 = new dev.epro.r0.X15965119713728731855
            r4 = 3
            r5.<init>(r1, r3, r4)
            r1 = 2
            dev.epro.r0.I3826119971291161142 r4 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.O11899788901879362309 r5 = dev.epro.r0.R7033599853981556291.l(r6, r4, r5, r1)
            r0.c = r2
            java.lang.Object r6 = r5.y(r0)
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r5) goto L51
            return r5
        L51:
            dev.epro.r0.M16184408391440927034 r6 = (dev.epro.r0.M16184408391440927034) r6
            if (r6 == 0) goto L63
            boolean r5 = r6 instanceof ads_mobile_sdk.pu0
            if (r5 == 0) goto L5c
            ads_mobile_sdk.pu0 r6 = (ads_mobile_sdk.pu0) r6
            return r6
        L5c:
            ads_mobile_sdk.xu0 r6 = (ads_mobile_sdk.xu0) r6
            java.lang.Object r5 = r6.b
            r3 = r5
            dev.epro.r0.F6124250193528699243 r3 = (dev.epro.r0.F6124250193528699243) r3
        L63:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0
            ads_mobile_sdk.a3 r6 = new ads_mobile_sdk.a3
            r6.<init>(r3)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d3.a(ads_mobile_sdk.d3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // ads_mobile_sdk.dr, ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.f;
        jr0Var.getClass();
        return ((Boolean) jr0Var.a("gads:ad_id_init_from_signal_source_enabled", Boolean.FALSE, ao.a$11)).booleanValue() ? dr.c(this, (K14749510448791472029) r4833348786910499294) : new xu0(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.AD_ID_INFO;
    }
}
