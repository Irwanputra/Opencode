package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E10198359844879945462 implements S2460821117650695638, Iterable, D14639766352081121636 {
    public final A4559761392562572984 a;
    public C5203614693743173659 b;
    public boolean c;
    public boolean d;

    public E10198359844879945462() {
        long[] jArr = X4026756943680612204.a;
        this.a = new A4559761392562572984();
    }

    @Override // dev.epro.r0.S2460821117650695638
    public final void a(P14992748401341948828 p14992748401341948828, Object obj) {
        boolean z = obj instanceof R17587901753867651123;
        A4559761392562572984 a4559761392562572984 = this.a;
        if (z && a4559761392562572984.c(p14992748401341948828)) {
            Object g = a4559761392562572984.g(p14992748401341948828);
            g.getClass();
            R17587901753867651123 r17587901753867651123 = (R17587901753867651123) g;
            R17587901753867651123 r175879017538676511232 = (R17587901753867651123) obj;
            String str = r175879017538676511232.a;
            if (str == null) {
                str = r17587901753867651123.a;
            }
            S8977162183056139880 s8977162183056139880 = r175879017538676511232.b;
            if (s8977162183056139880 == null) {
                s8977162183056139880 = r17587901753867651123.b;
            }
            a4559761392562572984.n(p14992748401341948828, new R17587901753867651123(str, s8977162183056139880));
        } else {
            a4559761392562572984.n(p14992748401341948828, obj);
        }
        p14992748401341948828.getClass();
    }

    public final Object b(P14992748401341948828 p14992748401341948828) {
        Object g = this.a.g(p14992748401341948828);
        if (g != null) {
            return g;
        }
        Q11088980322693754445.j("Key not present: ", p14992748401341948828, " - consider getOrElse or getOrNull");
        return null;
    }

    public final void c(E10198359844879945462 e10198359844879945462) {
        A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        Object[] objArr = a4559761392562572984.b;
        Object[] objArr2 = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        P14992748401341948828 p14992748401341948828 = (P14992748401341948828) obj;
                        A4559761392562572984 a45597613925625729842 = this.a;
                        Object g = a45597613925625729842.g(p14992748401341948828);
                        p14992748401341948828.getClass();
                        Object invoke = p14992748401341948828.b.invoke(g, obj2);
                        if (invoke != null) {
                            a45597613925625729842.n(p14992748401341948828, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E10198359844879945462)) {
            return false;
        }
        E10198359844879945462 e10198359844879945462 = (E10198359844879945462) obj;
        return this.a.equals(e10198359844879945462.a) && this.c == e10198359844879945462.c && this.d == e10198359844879945462.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + G6547577305291411977.i(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C5203614693743173659 c5203614693743173659 = this.b;
        if (c5203614693743173659 == null) {
            c5203614693743173659 = new C5203614693743173659(this.a);
            this.b = c5203614693743173659;
        }
        return ((M14345366659885436266) c5203614693743173659.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        A4559761392562572984 a4559761392562572984 = this.a;
        Object[] objArr = a4559761392562572984.b;
        Object[] objArr2 = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((P14992748401341948828) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return O5354877807466160604.a0(this) + "{ " + ((Object) sb) + " }";
    }
}
