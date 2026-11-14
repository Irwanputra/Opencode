package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R3845543328788571334 implements E13074456978433253839 {
    public final W5896017744614017491 a;

    public R3845543328788571334(W5896017744614017491 w5896017744614017491) {
        this.a = w5896017744614017491;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int a() {
        return this.a.g().q;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int b() {
        return ((V2435767323669307206) R9411874267597469228.K0(this.a.g().n)).a;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final boolean c() {
        return !this.a.g().n.isEmpty();
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int d() {
        int i;
        W5896017744614017491 w5896017744614017491 = this.a;
        int i2 = 0;
        if (w5896017744614017491.g().n.isEmpty()) {
            return 0;
        }
        K15976628200778816833 g = w5896017744614017491.g();
        R7000310675073492254 r7000310675073492254 = g.r;
        R7000310675073492254 r70003106750734922542 = R7000310675073492254.a;
        int i3 = (int) (r7000310675073492254 == r70003106750734922542 ? g.i() & 4294967295L : g.i() >> 32);
        K15976628200778816833 g2 = w5896017744614017491.g();
        R7000310675073492254 r70003106750734922543 = g2.r;
        List list = g2.n;
        boolean z = r70003106750734922543 == r70003106750734922542;
        if (!list.isEmpty()) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < list.size()) {
                V2435767323669307206 v2435767323669307206 = (V2435767323669307206) list.get(i4);
                int i7 = z ? v2435767323669307206.x : v2435767323669307206.y;
                if (i7 == -1) {
                    i4++;
                } else {
                    int i8 = 0;
                    while (i4 < list.size()) {
                        V2435767323669307206 v24357673236693072062 = (V2435767323669307206) list.get(i4);
                        if ((z ? v24357673236693072062.x : v24357673236693072062.y) != i7) {
                            break;
                        }
                        i8 = Math.max(i8, (int) (z ? ((V2435767323669307206) list.get(i4)).v & 4294967295L : ((V2435767323669307206) list.get(i4)).v >> 32));
                        i4++;
                    }
                    i5 += i8;
                    i6++;
                }
            }
            i2 = (i5 / i6) + g2.t;
        }
        if (i2 != 0 && (i = i3 / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int e() {
        return this.a.d.b.g();
    }
}
