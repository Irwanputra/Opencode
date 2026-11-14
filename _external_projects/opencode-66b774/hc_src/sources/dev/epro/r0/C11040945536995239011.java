package dev.epro.r0;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C11040945536995239011 extends K10678596132709730734 {
    public static final M15027517010688111229 c = new M15027517010688111229(1);
    public final F14240031463097426304 a;
    public final int b;

    public C11040945536995239011(F14240031463097426304 f14240031463097426304, int i) {
        this.a = f14240031463097426304;
        this.b = i;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        Object arrayList;
        Serializable arrayList2;
        int H = d13396727227989475489.H();
        int A = L11610354117192841236.A(H);
        if (A == 0) {
            d13396727227989475489.b();
            arrayList = new ArrayList();
        } else if (A != 2) {
            arrayList = null;
        } else {
            d13396727227989475489.c();
            arrayList = new H14305894327539119220(true);
        }
        if (arrayList == null) {
            return d(H, d13396727227989475489);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (d13396727227989475489.p()) {
                String B = arrayList instanceof Map ? d13396727227989475489.B() : null;
                int H2 = d13396727227989475489.H();
                int A2 = L11610354117192841236.A(H2);
                if (A2 == 0) {
                    d13396727227989475489.b();
                    arrayList2 = new ArrayList();
                } else if (A2 != 2) {
                    arrayList2 = null;
                } else {
                    d13396727227989475489.c();
                    arrayList2 = new H14305894327539119220(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(H2, d13396727227989475489);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(B, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    d13396727227989475489.g();
                } else {
                    d13396727227989475489.h();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (obj == null) {
            y14132333989764804283.p();
            return;
        }
        Class<?> cls = obj.getClass();
        F14240031463097426304 f14240031463097426304 = this.a;
        f14240031463097426304.getClass();
        K10678596132709730734 c2 = f14240031463097426304.c(new K11898134656129953686(cls));
        if (!(c2 instanceof C11040945536995239011)) {
            c2.c(y14132333989764804283, obj);
        } else {
            y14132333989764804283.d();
            y14132333989764804283.h();
        }
    }

    public final Serializable d(int i, D13396727227989475489 d13396727227989475489) {
        int A = L11610354117192841236.A(i);
        if (A == 5) {
            return d13396727227989475489.F();
        }
        if (A == 6) {
            return G6547577305291411977.b(this.b, d13396727227989475489);
        }
        if (A == 7) {
            return Boolean.valueOf(d13396727227989475489.u());
        }
        if (A == 8) {
            d13396727227989475489.D();
            return null;
        }
        S10973172697741180971.m("Unexpected token: ".concat(G11450220448113054352.x(i)));
        return null;
    }
}
