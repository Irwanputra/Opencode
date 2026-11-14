package ads_mobile_sdk;

import dev.epro.r0.H17686692708284905246;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.I3887072968740112330;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class dn3 extends c61 {
    public final W5797197595347441198 c;
    public final O12043144740933444288 d;
    public final H17686692708284905246 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn3(W5797197595347441198 w5797197595347441198, O12043144740933444288 o12043144740933444288) {
        super((wv0) null, 3);
        w5797197595347441198.getClass();
        o12043144740933444288.getClass();
        this.c = w5797197595347441198;
        this.d = o12043144740933444288;
        this.e = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, null, (byte) 5);
        W5797197595347441198 w5797197595347441198 = this.c;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n4024785987441166868, null, (byte) 1), 2);
        return new xu0(O9245300239821758723.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r11 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:13:0x0078, B:15:0x007e), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0075 -> B:13:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.bn3
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.bn3 r0 = (ads_mobile_sdk.bn3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.bn3 r0 = new ads_mobile_sdk.bn3
            dev.epro.r0.K14749510448791472029 r11 = (dev.epro.r0.K14749510448791472029) r11
            r0.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            android.net.Uri r10 = r0.b
            ads_mobile_sdk.dn3 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Exception -> L31
            goto L78
        L31:
            r11 = move-exception
            goto L8d
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r2
        L39:
            ads_mobile_sdk.dn3 r10 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L51
        L3f:
            dev.epro.r0.E17665849472693074628.k(r11)
        L42:
            dev.epro.r0.H17686692708284905246 r11 = r10.e
            r0.a = r10
            r0.b = r2
            r0.e = r4
            java.lang.Object r11 = r11.n(r0)
            if (r11 != r5) goto L51
            goto L74
        L51:
            dev.epro.r0.H9390398899829886498 r11 = (dev.epro.r0.H9390398899829886498) r11
            java.lang.Object r1 = r11.a
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r11 = r11.b
            java.util.Map r11 = (java.util.Map) r11
            dev.epro.r0.O12043144740933444288 r6 = r10.d     // Catch: java.lang.Exception -> L89
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Exception -> L89
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> L89
            r7.<init>(r8)     // Catch: java.lang.Exception -> L89
            r0.a = r10     // Catch: java.lang.Exception -> L89
            r0.b = r1     // Catch: java.lang.Exception -> L89
            r0.e = r3     // Catch: java.lang.Exception -> L89
            r8 = 26
            java.lang.Object r11 = dev.epro.r0.O12043144740933444288.a(r6, r7, r11, r0, r8)     // Catch: java.lang.Exception -> L89
            if (r11 != r5) goto L75
        L74:
            return r5
        L75:
            r9 = r1
            r1 = r10
            r10 = r9
        L78:
            dev.epro.r0.M16184408391440927034 r11 = (dev.epro.r0.M16184408391440927034) r11     // Catch: java.lang.Exception -> L31
            boolean r6 = r11 instanceof ads_mobile_sdk.xu0     // Catch: java.lang.Exception -> L31
            if (r6 == 0) goto L87
            ads_mobile_sdk.xu0 r11 = (ads_mobile_sdk.xu0) r11     // Catch: java.lang.Exception -> L31
            java.lang.Object r11 = r11.b     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.a21 r11 = (ads_mobile_sdk.a21) r11     // Catch: java.lang.Exception -> L31
            r11.getClass()     // Catch: java.lang.Exception -> L31
        L87:
            r10 = r1
            goto L42
        L89:
            r11 = move-exception
            r9 = r1
            r1 = r10
            r10 = r9
        L8d:
            r11.getMessage()
            java.util.Objects.toString(r10)
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dn3.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
