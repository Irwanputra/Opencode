package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C11040945536995239011 extends dev.epro.r0.K10678596132709730734 {
    public static final dev.epro.r0.M15027517010688111229 c = new dev.epro.r0.M15027517010688111229(1);
    public final dev.epro.r0.F14240031463097426304 a;
    public final int b;

    public C11040945536995239011(dev.epro.r0.F14240031463097426304 f14240031463097426304, int i) {
        this.a = f14240031463097426304;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        java.lang.Object arrayList;
        dev.epro.r0.H14305894327539119220 arrayList2;
        int iH = d13396727227989475489.H();
        int iA = dev.epro.r0.L11610354117192841236.A(iH);
        if (iA == 0) {
            d13396727227989475489.b();
            arrayList = new java.util.ArrayList();
        } else if (iA != 2) {
            arrayList = null;
        } else {
            d13396727227989475489.c();
            arrayList = new dev.epro.r0.H14305894327539119220(true);
        }
        if (arrayList == null) {
            return d(iH, d13396727227989475489);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (d13396727227989475489.p()) {
                java.lang.String strB = arrayList instanceof java.util.Map ? d13396727227989475489.B() : null;
                int iH2 = d13396727227989475489.H();
                int iA2 = dev.epro.r0.L11610354117192841236.A(iH2);
                if (iA2 == 0) {
                    d13396727227989475489.b();
                    arrayList2 = new java.util.ArrayList();
                } else if (iA2 != 2) {
                    arrayList2 = null;
                } else {
                    d13396727227989475489.c();
                    arrayList2 = new dev.epro.r0.H14305894327539119220(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(iH2, d13396727227989475489);
                }
                if (arrayList instanceof java.util.List) {
                    ((java.util.List) arrayList).add(arrayList2);
                } else {
                    ((java.util.Map) arrayList).put(strB, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof java.util.List) {
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

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        if (obj == null) {
            y14132333989764804283.p();
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        dev.epro.r0.F14240031463097426304 f14240031463097426304 = this.a;
        f14240031463097426304.getClass();
        dev.epro.r0.K10678596132709730734 k10678596132709730734C = f14240031463097426304.c(new dev.epro.r0.K11898134656129953686(cls));
        if (!(k10678596132709730734C instanceof dev.epro.r0.C11040945536995239011)) {
            k10678596132709730734C.c(y14132333989764804283, obj);
        } else {
            y14132333989764804283.d();
            y14132333989764804283.h();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.io.Serializable d(int i, dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 5) {
            return d13396727227989475489.F();
        }
        if (iA == 6) {
            return dev.epro.r0.G6547577305291411977.b(this.b, d13396727227989475489);
        }
        if (iA == 7) {
            return java.lang.Boolean.valueOf(d13396727227989475489.u());
        }
        if (iA == 8) {
            d13396727227989475489.D();
            return null;
        }
        dev.epro.r0.S10973172697741180971.m("Unexpected token: ".concat(dev.epro.r0.G11450220448113054352.x(i)));
        return null;
    }
}
