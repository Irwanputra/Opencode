package ads_mobile_sdk;

import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T18397286815848089648;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import java.util.Map;
import java.util.Optional;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class vb1 implements T18397286815848089648 {
    private final z1 b;
    private final hv c;
    private final mi3 d;
    private final y2 f;
    private final ih0 g;
    private final hf2 h;
    private final z03 i;
    private final eg2 j;
    public F11004654978627682545 k;

    public vb1(String str, z1 z1Var, hv hvVar, mi3 mi3Var, Optional optional, y2 y2Var, ih0 ih0Var, hf2 hf2Var, z03 z03Var, eg2 eg2Var, U4857089234315512256 u4857089234315512256) {
        str.getClass();
        z1Var.getClass();
        hvVar.getClass();
        mi3Var.getClass();
        optional.getClass();
        y2Var.getClass();
        ih0Var.getClass();
        hf2Var.getClass();
        z03Var.getClass();
        eg2Var.getClass();
        u4857089234315512256.getClass();
        this.b = z1Var;
        this.c = hvVar;
        this.d = mi3Var;
        this.f = y2Var;
        this.g = ih0Var;
        this.h = hf2Var;
        this.i = z03Var;
        this.j = eg2Var;
        s8 s8Var = mi3Var.d;
        s8Var.b = str;
        s8Var.c = z1Var.e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (ads_mobile_sdk.hf2.a(r7, r6, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7.i(r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.vb1 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.ub1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.ub1 r0 = (ads_mobile_sdk.ub1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ub1 r0 = new ads_mobile_sdk.ub1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L59
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            ads_mobile_sdk.vb1 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L47
        L37:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.y2 r7 = r6.f
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r5) goto L47
            goto L58
        L47:
            ads_mobile_sdk.hf2 r7 = r6.h
            ads_mobile_sdk.z03 r1 = r6.i
            r0.a = r2
            r0.d = r3
            r7.getClass()
            java.lang.Object r6 = ads_mobile_sdk.hf2.a(r7, r6, r1, r0)
            if (r6 != r5) goto L59
        L58:
            return r5
        L59:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vb1.a(ads_mobile_sdk.vb1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final z1 b() {
        return this.b;
    }

    public final eg2 c() {
        return this.j;
    }

    @Override // dev.epro.r0.T18397286815848089648
    public void destroy() {
        y2 y2Var = this.f;
        byte b = 1;
        if (y2Var.f.getAndSet(true)) {
            return;
        }
        for (Map.Entry entry : ((Map) y2Var.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) y2Var.a;
            R4833348786910499294 r4833348786910499294 = null;
            ha haVar = new ha(str, value, r4833348786910499294, (byte) 7);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r4833348786910499294, b), 2);
        }
    }

    @Override // dev.epro.r0.T18397286815848089648
    public I16631908410500040363 g() {
        return null;
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final F11004654978627682545 getResponseInfo() {
        F11004654978627682545 f11004654978627682545 = this.k;
        if (f11004654978627682545 != null) {
            return f11004654978627682545;
        }
        S10823041268949770285.b0("responseInfo");
        throw null;
    }

    public final hv i() {
        return this.c;
    }

    public final ih0 j() {
        return this.g;
    }

    @Override // dev.epro.r0.T18397286815848089648
    /* renamed from: a */
    public final void mo6a(fo2 fo2Var) {
        this.f.e();
    }

    @Override // dev.epro.r0.T18397286815848089648
    public Object a(fo2 fo2Var) {
        return a(this, fo2Var);
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final mi3 a() {
        return this.d;
    }

    @Override // dev.epro.r0.T18397286815848089648
    public final void a(F11004654978627682545 f11004654978627682545) {
        this.k = f11004654978627682545;
    }
}
