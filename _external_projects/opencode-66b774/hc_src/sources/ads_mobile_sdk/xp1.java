package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xp1 extends th3 {
    public final cc2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xp1(ads_mobile_sdk.wv0 r20, java.util.List r21, java.util.UUID r22, ads_mobile_sdk.mi3 r23, int r24, int r25, ads_mobile_sdk.xp1 r26, boolean r27) {
        /*
            r19 = this;
            r20.getClass()
            r23.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            r0 = r19
            r1 = r20
            r3 = r22
            r2 = r23
            r4 = r26
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            ads_mobile_sdk.cc2 r0 = new ads_mobile_sdk.cc2
            if (r4 == 0) goto L22
            ads_mobile_sdk.cc2 r1 = r4.g
            int r1 = r1.a
        L20:
            r6 = r1
            goto L24
        L22:
            r1 = -1
            goto L20
        L24:
            long r1 = dev.epro.r0.J10256772239794345968.c
            long r10 = r8 - r1
            long r1 = dev.epro.r0.J10256772239794345968.d
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L34
            r1 = -1
        L32:
            r12 = r1
            goto L37
        L34:
            long r1 = r8 - r1
            goto L32
        L37:
            r17 = 0
            r18 = -2048(0xfffffffffffff800, float:NaN)
            r15 = 0
            r16 = 0
            r3 = r20
            r4 = r21
            r5 = r22
            r2 = r23
            r7 = r24
            r1 = r25
            r14 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18)
            r1 = r0
            r0 = r19
            r0.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xp1.<init>(ads_mobile_sdk.wv0, java.util.List, java.util.UUID, ads_mobile_sdk.mi3, int, int, ads_mobile_sdk.xp1, boolean):void");
    }

    @Override // ads_mobile_sdk.th3
    public final th3 a(wv0 wv0Var, List list, boolean z) {
        wv0Var.getClass();
        cc2 cc2Var = this.g;
        return new xp1(wv0Var, list, cc2Var.e, this.a, cc2Var.g + 1, cc2Var.a + 1, this, z);
    }

    @Override // ads_mobile_sdk.th3
    public final cc2 e() {
        return this.g;
    }

    @Override // ads_mobile_sdk.th3
    public final void h() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long currentTimeMillis = System.currentTimeMillis();
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        this.g.p = E17093345031926825464.g(M9216324016624295870.a0(currentTimeMillis, n13798149404328803870), M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
