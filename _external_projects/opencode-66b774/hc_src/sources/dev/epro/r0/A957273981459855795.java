package dev.epro.r0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A957273981459855795 {
    public static final V10300877997588547986 l = new V10300877997588547986((Object) new W15213244012953673763(25), (Object) new Y13361005827119333637((byte) 4), (byte) 20);
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final G14438155262350387569 c;
    public final AtomicLong d;
    public H285489298426063548 e;
    public L14660234597990339555 f;
    public H10076715707250891826 g;
    public V10383417447826362791 h;
    public H285489298426063548 i;
    public H285489298426063548 j;
    public final V697849047308847220 k;

    public A957273981459855795(long j) {
        G14438155262350387569 g14438155262350387569 = S11299071591039262705.a;
        this.c = new G14438155262350387569();
        this.d = new AtomicLong(j);
        G14438155262350387569 g144381552623503875692 = S11299071591039262705.a;
        g144381552623503875692.getClass();
        this.k = V4416135141588678913.t(g144381552623503875692);
    }

    public final G14438155262350387569 a() {
        return (G14438155262350387569) this.k.getValue();
    }

    public final boolean b(B1029012102904255937 b1029012102904255937, long j, long j2, S6976414540931251790 s6976414540931251790, boolean z) {
        H10076715707250891826 h10076715707250891826 = this.g;
        if (h10076715707250891826 == null) {
            return true;
        }
        A15234621907337682254 a15234621907337682254 = h10076715707250891826.a;
        long b = a15234621907337682254.b(b1029012102904255937, j);
        long b2 = a15234621907337682254.b(b1029012102904255937, j2);
        a15234621907337682254.n(z);
        return a15234621907337682254.s(b, b2, false, s6976414540931251790);
    }

    public final void c() {
        V10383417447826362791 v10383417447826362791 = this.h;
        if (v10383417447826362791 != null) {
            v10383417447826362791.invoke();
        }
    }

    public final void d(B1029012102904255937 b1029012102904255937, long j, S6976414540931251790 s6976414540931251790, boolean z) {
        L14660234597990339555 l14660234597990339555 = this.f;
        if (l14660234597990339555 != null) {
            l14660234597990339555.i(Boolean.valueOf(z), b1029012102904255937, new L2216691091636065972(j), s6976414540931251790);
        }
    }

    public final ArrayList e(B1029012102904255937 b1029012102904255937) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            final Q15027034467569330017 q15027034467569330017 = new Q15027034467569330017(b1029012102904255937, (byte) 28);
            final byte b = 1;
            R4678422174699242737.m0(arrayList, new Comparator() { // from class: dev.epro.r0.K2977404645357369836
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    byte b2 = b;
                    Object obj3 = q15027034467569330017;
                    switch (b2) {
                        case 0:
                            for (F4096073349764486348 f4096073349764486348 : (F4096073349764486348[]) obj3) {
                                int o2 = Y582199805280922215.o((Comparable) f4096073349764486348.invoke(obj), (Comparable) f4096073349764486348.invoke(obj2));
                                if (o2 != 0) {
                                    return o2;
                                }
                            }
                            return 0;
                        default:
                            return ((Number) ((Q15027034467569330017) obj3).invoke(obj, obj2)).intValue();
                    }
                }
            });
            this.a = true;
        }
        return arrayList;
    }
}
