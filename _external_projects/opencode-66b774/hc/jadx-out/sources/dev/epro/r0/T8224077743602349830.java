package dev.epro.r0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T8224077743602349830 {
    public A314510841421691141[] a;
    public int b;
    public int c;
    public M2547930385040280601 d;

    public final A314510841421691141 b() {
        A314510841421691141 a314510841421691141C;
        M2547930385040280601 m2547930385040280601;
        synchronized (this) {
            try {
                A314510841421691141[] a314510841421691141ArrD = this.a;
                if (a314510841421691141ArrD == null) {
                    a314510841421691141ArrD = d();
                    this.a = a314510841421691141ArrD;
                } else if (this.b >= a314510841421691141ArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(a314510841421691141ArrD, a314510841421691141ArrD.length * 2);
                    this.a = (A314510841421691141[]) objArrCopyOf;
                    a314510841421691141ArrD = (A314510841421691141[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    a314510841421691141C = a314510841421691141ArrD[i];
                    if (a314510841421691141C == null) {
                        a314510841421691141C = c();
                        a314510841421691141ArrD[i] = a314510841421691141C;
                    }
                    i++;
                    if (i >= a314510841421691141ArrD.length) {
                        i = 0;
                    }
                } while (!a314510841421691141C.a(this));
                this.c = i;
                this.b++;
                m2547930385040280601 = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m2547930385040280601 != null) {
            m2547930385040280601.v(1);
        }
        return a314510841421691141C;
    }

    public A314510841421691141 c() {
        return new R8171059466006247269();
    }

    public A314510841421691141[] d() {
        return new R8171059466006247269[2];
    }

    public final void e(A314510841421691141 a314510841421691141) {
        M2547930385040280601 m2547930385040280601;
        int i;
        R4833348786910499294[] r4833348786910499294ArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                m2547930385040280601 = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                a314510841421691141.getClass();
                r4833348786910499294ArrB = a314510841421691141.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (R4833348786910499294 r4833348786910499294 : r4833348786910499294ArrB) {
            if (r4833348786910499294 != null) {
                r4833348786910499294.resumeWith(O9245300239821758723.a);
            }
        }
        if (m2547930385040280601 != null) {
            m2547930385040280601.v(-1);
        }
    }

    public final M2547930385040280601 f() {
        M2547930385040280601 m2547930385040280601;
        synchronized (this) {
            m2547930385040280601 = this.d;
            if (m2547930385040280601 == null) {
                int i = this.b;
                m2547930385040280601 = new M2547930385040280601(1, Integer.MAX_VALUE, T1542296375665870064.b);
                m2547930385040280601.h(Integer.valueOf(i));
                this.d = m2547930385040280601;
            }
        }
        return m2547930385040280601;
    }
}
