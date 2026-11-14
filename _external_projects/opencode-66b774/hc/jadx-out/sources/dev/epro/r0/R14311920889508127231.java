package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R14311920889508127231 implements P14826151584039718691, V4145611664959724223 {
    public final L6644189956008555542 a;
    public final V4145611664959724223 b;
    public final E13273723708836014930 c;

    public R14311920889508127231(P14826151584039718691 p14826151584039718691, Map map, V4145611664959724223 v4145611664959724223) {
        S16262227471297796850 s16262227471297796850 = new S16262227471297796850(p14826151584039718691, (byte) 20);
        X354568553596380848 x354568553596380848 = T1414416723643307303.a;
        this.a = new L6644189956008555542(map, s16262227471297796850);
        this.b = v4145611664959724223;
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        this.c = new E13273723708836014930();
    }

    @Override // dev.epro.r0.V4145611664959724223
    public final void a(Object obj, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        int i2;
        m3727281027331139839.b0(-858296452);
        if ((i & 6) == 0) {
            i2 = (m3727281027331139839.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.h(this) ? 256 : 128;
        }
        if (m3727281027331139839.R(i2 & 1, (i2 & 147) != 146)) {
            this.b.a(obj, t15443218846549482730, m3727281027331139839, i2 & 126);
            boolean zH = m3727281027331139839.h(this) | m3727281027331139839.h(obj);
            Object objM = m3727281027331139839.M();
            if (zH || objM == O9023047933786425027.a) {
                objM = new B2138252231653711516(this, obj, (byte) 13);
                m3727281027331139839.k0(objM);
            }
            Q13169198992966610970.c(obj, (F4096073349764486348) objM, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new N18429394832860979851(this, obj, t15443218846549482730, i, (byte) 11);
        }
    }

    @Override // dev.epro.r0.V4145611664959724223
    public final void b(Object obj) {
        this.b.b(obj);
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // dev.epro.r0.P14826151584039718691
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            r14 = this;
            dev.epro.r0.E13273723708836014930 r0 = r14.c
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            dev.epro.r0.V4145611664959724223 r11 = r14.b
            r11.b(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            dev.epro.r0.L6644189956008555542 r14 = r14.a
            java.util.Map r14 = r14.d()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R14311920889508127231.d():java.util.Map");
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // dev.epro.r0.P14826151584039718691
    public final R11800251031747375035 f(String str, B13729205492206812220 b13729205492206812220) {
        return this.a.f(str, b13729205492206812220);
    }
}
