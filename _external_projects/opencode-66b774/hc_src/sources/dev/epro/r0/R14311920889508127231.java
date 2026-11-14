package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
            boolean h = m3727281027331139839.h(this) | m3727281027331139839.h(obj);
            Object M = m3727281027331139839.M();
            if (h || M == O9023047933786425027.a) {
                M = new B2138252231653711516(this, obj, (byte) 13);
                m3727281027331139839.k0(M);
            }
            Q13169198992966610970.c(obj, (F4096073349764486348) M, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new N18429394832860979851(this, obj, t15443218846549482730, i, (byte) 11);
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

    @Override // dev.epro.r0.P14826151584039718691
    public final Map d() {
        E13273723708836014930 e13273723708836014930 = this.c;
        Object[] objArr = e13273723708836014930.b;
        long[] jArr = e13273723708836014930.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.b(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.a.d();
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
