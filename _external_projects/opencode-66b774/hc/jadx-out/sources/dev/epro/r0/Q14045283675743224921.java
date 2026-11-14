package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        String string;
        int iA;
        int i = this.a;
        if (i == 4) {
            Z3383101362411723454.r();
            return false;
        }
        int iA2 = L11610354117192841236.A(i);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 != 2) {
            this.a = 4;
            int i2 = this.d;
            while (true) {
                int i3 = this.d;
                if (i3 == -1) {
                    this.a = 3;
                    string = null;
                    break;
                }
                int iB = b(i3);
                CharSequence charSequence = this.c;
                if (iB == -1) {
                    iB = charSequence.length();
                    this.d = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.d = iA;
                }
                if (iA == i2) {
                    int i4 = iA + 1;
                    this.d = i4;
                    if (i4 > charSequence.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i2 < iB) {
                        charSequence.charAt(i2);
                    }
                    if (iB > i2) {
                        charSequence.charAt(iB - 1);
                    }
                    int i5 = this.e;
                    if (i5 == 1) {
                        iB = charSequence.length();
                        this.d = -1;
                        if (iB > i2) {
                            charSequence.charAt(iB - 1);
                        }
                    } else {
                        this.e = i5 - 1;
                    }
                    string = charSequence.subSequence(i2, iB).toString();
                }
            }
            this.b = string;
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
