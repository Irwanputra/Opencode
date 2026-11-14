package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C1629617973188005475 {
    public final A4559761392562572984 a;

    public /* synthetic */ C1629617973188005475(A4559761392562572984 a4559761392562572984) {
        this.a = a4559761392562572984;
    }

    public static final void a(A4559761392562572984 a4559761392562572984, Object obj, Object obj2) {
        int f = a4559761392562572984.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : a4559761392562572984.c[f];
        if (obj3 != null) {
            if (obj3 instanceof U9803441765912152712) {
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj3;
                u9803441765912152712.a(obj2);
                obj2 = u9803441765912152712;
            } else {
                Object[] objArr = M17189296052689530719.a;
                U9803441765912152712 u98034417659121527122 = new U9803441765912152712(2);
                u98034417659121527122.a(obj3);
                u98034417659121527122.a(obj2);
                obj2 = u98034417659121527122;
            }
        }
        if (!z) {
            a4559761392562572984.c[f] = obj2;
            return;
        }
        int i = ~f;
        a4559761392562572984.b[i] = obj;
        a4559761392562572984.c[i] = obj2;
    }

    public static final Object b(A4559761392562572984 a4559761392562572984, C4085811703908263224 c4085811703908263224) {
        Object g = a4559761392562572984.g(c4085811703908263224);
        if (g == null) {
            return null;
        }
        if (!(g instanceof U9803441765912152712)) {
            a4559761392562572984.l(c4085811703908263224);
            return g;
        }
        U9803441765912152712 u9803441765912152712 = (U9803441765912152712) g;
        if (u9803441765912152712.h()) {
            K2042933864045806308.n("List is empty.");
            return null;
        }
        int i = u9803441765912152712.b - 1;
        Object f = u9803441765912152712.f(i);
        u9803441765912152712.k(i);
        f.getClass();
        if (u9803441765912152712.h()) {
            a4559761392562572984.l(c4085811703908263224);
        }
        if (u9803441765912152712.b == 1) {
            a4559761392562572984.n(c4085811703908263224, u9803441765912152712.e());
        }
        return f;
    }

    public static final void c(A4559761392562572984 a4559761392562572984, C4085811703908263224 c4085811703908263224, F4096073349764486348 f4096073349764486348) {
        Object g = a4559761392562572984.g(c4085811703908263224);
        if (g != null) {
            if (!(g instanceof U9803441765912152712)) {
                if (((Boolean) f4096073349764486348.invoke(g)).booleanValue()) {
                    a4559761392562572984.l(c4085811703908263224);
                    return;
                }
                return;
            }
            U9803441765912152712 u9803441765912152712 = (U9803441765912152712) g;
            int i = u9803441765912152712.b;
            Object[] objArr = u9803441765912152712.a;
            int i2 = 0;
            P8646985343900033725 N = W7808703833045379622.N(0, i);
            int i3 = N.a;
            int i4 = N.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) f4096073349764486348.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            O5378677881740157249.x0(i - i2, i, null, objArr);
            u9803441765912152712.b -= i2;
            if (u9803441765912152712.h()) {
                a4559761392562572984.l(c4085811703908263224);
            }
            if (u9803441765912152712.b == 1) {
                a4559761392562572984.n(c4085811703908263224, u9803441765912152712.e());
            }
        }
    }

    public static final U9803441765912152712 d(A4559761392562572984 a4559761392562572984) {
        if (a4559761392562572984.i()) {
            U9803441765912152712 u9803441765912152712 = M17189296052689530719.b;
            u9803441765912152712.getClass();
            return u9803441765912152712;
        }
        U9803441765912152712 u98034417659121527122 = new U9803441765912152712();
        Object[] objArr = a4559761392562572984.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof U9803441765912152712) {
                                u98034417659121527122.b((U9803441765912152712) obj);
                            } else {
                                obj.getClass();
                                u98034417659121527122.a(obj);
                            }
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
        return u98034417659121527122;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1629617973188005475) {
            return this.a.equals(((C1629617973188005475) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
