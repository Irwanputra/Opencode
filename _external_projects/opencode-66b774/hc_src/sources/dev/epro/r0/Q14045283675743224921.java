package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Q14045283675743224921 implements Iterator {
    public String b;
    public final CharSequence c;
    public int a = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public Q14045283675743224921(M9197813449740923653 m9197813449740923653, CharSequence charSequence) {
        this.c = charSequence;
    }

    public int a(int i) {
        return i + 1;
    }

    public int b(int i) {
        int i2 = i + 4000;
        if (i2 < this.c.length()) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int a;
        int i = this.a;
        if (i == 4) {
            Z3383101362411723454.r();
            return false;
        }
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return true;
        }
        if (A != 2) {
            this.a = 4;
            int i2 = this.d;
            while (true) {
                int i3 = this.d;
                if (i3 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                int b = b(i3);
                CharSequence charSequence = this.c;
                if (b == -1) {
                    b = charSequence.length();
                    this.d = -1;
                    a = -1;
                } else {
                    a = a(b);
                    this.d = a;
                }
                if (a == i2) {
                    int i4 = a + 1;
                    this.d = i4;
                    if (i4 > charSequence.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i2 < b) {
                        charSequence.charAt(i2);
                    }
                    if (b > i2) {
                        charSequence.charAt(b - 1);
                    }
                    int i5 = this.e;
                    if (i5 == 1) {
                        b = charSequence.length();
                        this.d = -1;
                        if (b > i2) {
                            charSequence.charAt(b - 1);
                        }
                    } else {
                        this.e = i5 - 1;
                    }
                    str = charSequence.subSequence(i2, b).toString();
                }
            }
            this.b = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
