package dev.epro.r0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H14305894327539119220 extends AbstractMap implements Serializable {
    public static final J10770752472956524045 i = new J10770752472956524045(12);
    public final boolean b;
    public S8064361206571326475 c;
    public final S8064361206571326475 f;
    public S11564727846197427291 g;
    public S11564727846197427291 h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;

    public H14305894327539119220(boolean z) {
        this.b = z;
        this.f = new S8064361206571326475(z);
    }

    public final S8064361206571326475 a(Object obj, boolean z) {
        int i2;
        S8064361206571326475 s8064361206571326475;
        S8064361206571326475 s80643612065713264752 = this.c;
        J10770752472956524045 j10770752472956524045 = i;
        Comparator comparator = this.a;
        if (s80643612065713264752 != null) {
            Comparable comparable = comparator == j10770752472956524045 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = s80643612065713264752.f;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i2 == 0) {
                    return s80643612065713264752;
                }
                S8064361206571326475 s80643612065713264753 = i2 < 0 ? s80643612065713264752.b : s80643612065713264752.c;
                if (s80643612065713264753 == null) {
                    break;
                }
                s80643612065713264752 = s80643612065713264753;
            }
        } else {
            i2 = 0;
        }
        S8064361206571326475 s80643612065713264754 = s80643612065713264752;
        if (!z) {
            return null;
        }
        S8064361206571326475 s80643612065713264755 = this.f;
        if (s80643612065713264754 != null) {
            s8064361206571326475 = new S8064361206571326475(this.b, s80643612065713264754, obj, s80643612065713264755, s80643612065713264755.e);
            if (i2 < 0) {
                s80643612065713264754.b = s8064361206571326475;
            } else {
                s80643612065713264754.c = s8064361206571326475;
            }
            b(s80643612065713264754, true);
        } else {
            if (comparator == j10770752472956524045 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            s8064361206571326475 = new S8064361206571326475(this.b, s80643612065713264754, obj, s80643612065713264755, s80643612065713264755.e);
            this.c = s8064361206571326475;
        }
        this.d++;
        this.e++;
        return s8064361206571326475;
    }

    public final void b(S8064361206571326475 s8064361206571326475, boolean z) {
        while (s8064361206571326475 != null) {
            S8064361206571326475 s80643612065713264752 = s8064361206571326475.b;
            S8064361206571326475 s80643612065713264753 = s8064361206571326475.c;
            int i2 = s80643612065713264752 != null ? s80643612065713264752.i : 0;
            int i3 = s80643612065713264753 != null ? s80643612065713264753.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                S8064361206571326475 s80643612065713264754 = s80643612065713264753.b;
                S8064361206571326475 s80643612065713264755 = s80643612065713264753.c;
                int i5 = (s80643612065713264754 != null ? s80643612065713264754.i : 0) - (s80643612065713264755 != null ? s80643612065713264755.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    e(s8064361206571326475);
                } else {
                    f(s80643612065713264753);
                    e(s8064361206571326475);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                S8064361206571326475 s80643612065713264756 = s80643612065713264752.b;
                S8064361206571326475 s80643612065713264757 = s80643612065713264752.c;
                int i6 = (s80643612065713264756 != null ? s80643612065713264756.i : 0) - (s80643612065713264757 != null ? s80643612065713264757.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    f(s8064361206571326475);
                } else {
                    e(s80643612065713264752);
                    f(s8064361206571326475);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                s8064361206571326475.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                s8064361206571326475.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            s8064361206571326475 = s8064361206571326475.a;
        }
    }

    public final void c(S8064361206571326475 s8064361206571326475, boolean z) {
        S8064361206571326475 s80643612065713264752;
        S8064361206571326475 s80643612065713264753;
        int i2;
        if (z) {
            S8064361206571326475 s80643612065713264754 = s8064361206571326475.e;
            s80643612065713264754.d = s8064361206571326475.d;
            s8064361206571326475.d.e = s80643612065713264754;
        }
        S8064361206571326475 s80643612065713264755 = s8064361206571326475.b;
        S8064361206571326475 s80643612065713264756 = s8064361206571326475.c;
        S8064361206571326475 s80643612065713264757 = s8064361206571326475.a;
        int i3 = 0;
        if (s80643612065713264755 == null || s80643612065713264756 == null) {
            if (s80643612065713264755 != null) {
                d(s8064361206571326475, s80643612065713264755);
                s8064361206571326475.b = null;
            } else if (s80643612065713264756 != null) {
                d(s8064361206571326475, s80643612065713264756);
                s8064361206571326475.c = null;
            } else {
                d(s8064361206571326475, null);
            }
            b(s80643612065713264757, false);
            this.d--;
            this.e++;
            return;
        }
        if (s80643612065713264755.i > s80643612065713264756.i) {
            S8064361206571326475 s80643612065713264758 = s80643612065713264755.c;
            while (true) {
                S8064361206571326475 s80643612065713264759 = s80643612065713264758;
                s80643612065713264753 = s80643612065713264755;
                s80643612065713264755 = s80643612065713264759;
                if (s80643612065713264755 == null) {
                    break;
                } else {
                    s80643612065713264758 = s80643612065713264755.c;
                }
            }
        } else {
            S8064361206571326475 s806436120657132647510 = s80643612065713264756.b;
            while (true) {
                s80643612065713264752 = s80643612065713264756;
                s80643612065713264756 = s806436120657132647510;
                if (s80643612065713264756 == null) {
                    break;
                } else {
                    s806436120657132647510 = s80643612065713264756.b;
                }
            }
            s80643612065713264753 = s80643612065713264752;
        }
        c(s80643612065713264753, false);
        S8064361206571326475 s806436120657132647511 = s8064361206571326475.b;
        if (s806436120657132647511 != null) {
            i2 = s806436120657132647511.i;
            s80643612065713264753.b = s806436120657132647511;
            s806436120657132647511.a = s80643612065713264753;
            s8064361206571326475.b = null;
        } else {
            i2 = 0;
        }
        S8064361206571326475 s806436120657132647512 = s8064361206571326475.c;
        if (s806436120657132647512 != null) {
            i3 = s806436120657132647512.i;
            s80643612065713264753.c = s806436120657132647512;
            s806436120657132647512.a = s80643612065713264753;
            s8064361206571326475.c = null;
        }
        s80643612065713264753.i = Math.max(i2, i3) + 1;
        d(s8064361206571326475, s80643612065713264753);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        S8064361206571326475 s8064361206571326475 = this.f;
        s8064361206571326475.e = s8064361206571326475;
        s8064361206571326475.d = s8064361206571326475;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        S8064361206571326475 s8064361206571326475 = null;
        if (obj != null) {
            try {
                s8064361206571326475 = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return s8064361206571326475 != null;
    }

    public final void d(S8064361206571326475 s8064361206571326475, S8064361206571326475 s80643612065713264752) {
        S8064361206571326475 s80643612065713264753 = s8064361206571326475.a;
        s8064361206571326475.a = null;
        if (s80643612065713264752 != null) {
            s80643612065713264752.a = s80643612065713264753;
        }
        if (s80643612065713264753 == null) {
            this.c = s80643612065713264752;
        } else if (s80643612065713264753.b == s8064361206571326475) {
            s80643612065713264753.b = s80643612065713264752;
        } else {
            s80643612065713264753.c = s80643612065713264752;
        }
    }

    public final void e(S8064361206571326475 s8064361206571326475) {
        S8064361206571326475 s80643612065713264752 = s8064361206571326475.b;
        S8064361206571326475 s80643612065713264753 = s8064361206571326475.c;
        S8064361206571326475 s80643612065713264754 = s80643612065713264753.b;
        S8064361206571326475 s80643612065713264755 = s80643612065713264753.c;
        s8064361206571326475.c = s80643612065713264754;
        if (s80643612065713264754 != null) {
            s80643612065713264754.a = s8064361206571326475;
        }
        d(s8064361206571326475, s80643612065713264753);
        s80643612065713264753.b = s8064361206571326475;
        s8064361206571326475.a = s80643612065713264753;
        int max = Math.max(s80643612065713264752 != null ? s80643612065713264752.i : 0, s80643612065713264754 != null ? s80643612065713264754.i : 0) + 1;
        s8064361206571326475.i = max;
        s80643612065713264753.i = Math.max(max, s80643612065713264755 != null ? s80643612065713264755.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        S11564727846197427291 s11564727846197427291 = this.g;
        if (s11564727846197427291 != null) {
            return s11564727846197427291;
        }
        S11564727846197427291 s115647278461974272912 = new S11564727846197427291(this, (byte) 0);
        this.g = s115647278461974272912;
        return s115647278461974272912;
    }

    public final void f(S8064361206571326475 s8064361206571326475) {
        S8064361206571326475 s80643612065713264752 = s8064361206571326475.b;
        S8064361206571326475 s80643612065713264753 = s8064361206571326475.c;
        S8064361206571326475 s80643612065713264754 = s80643612065713264752.b;
        S8064361206571326475 s80643612065713264755 = s80643612065713264752.c;
        s8064361206571326475.b = s80643612065713264755;
        if (s80643612065713264755 != null) {
            s80643612065713264755.a = s8064361206571326475;
        }
        d(s8064361206571326475, s80643612065713264752);
        s80643612065713264752.c = s8064361206571326475;
        s8064361206571326475.a = s80643612065713264752;
        int max = Math.max(s80643612065713264753 != null ? s80643612065713264753.i : 0, s80643612065713264755 != null ? s80643612065713264755.i : 0) + 1;
        s8064361206571326475.i = max;
        s80643612065713264752.i = Math.max(max, s80643612065713264754 != null ? s80643612065713264754.i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            dev.epro.r0.S8064361206571326475 r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.h
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H14305894327539119220.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        S11564727846197427291 s11564727846197427291 = this.h;
        if (s11564727846197427291 != null) {
            return s11564727846197427291;
        }
        S11564727846197427291 s115647278461974272912 = new S11564727846197427291(this, (byte) 1);
        this.h = s115647278461974272912;
        return s115647278461974272912;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            Z3383101362411723454.k("key == null");
            return null;
        }
        if (obj2 == null && !this.b) {
            Z3383101362411723454.k("value == null");
            return null;
        }
        S8064361206571326475 a = a(obj, true);
        Object obj3 = a.h;
        a.h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            dev.epro.r0.S8064361206571326475 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.h
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H14305894327539119220.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
