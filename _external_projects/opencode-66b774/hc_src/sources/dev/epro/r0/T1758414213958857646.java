package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T1758414213958857646 implements Iterator {
    public String a;
    public final String c;
    public byte b = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public T1758414213958857646(String str) {
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        byte b = this.b;
        if (b == 4) {
            Z3383101362411723454.r();
            return false;
        }
        int i2 = b - 1;
        String str = null;
        if (b == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = (byte) 4;
            int i3 = this.d;
            while (true) {
                int i4 = this.d;
                if (i4 == -1) {
                    this.b = (byte) 3;
                    break;
                }
                String str2 = this.c;
                int length = str2.length();
                P1789376955961125859.n(i4, length);
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (str2.charAt(i4) == ',') {
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    i4 = str2.length();
                    this.d = -1;
                    i = -1;
                } else {
                    i = i4 + 1;
                    this.d = i;
                }
                if (i == i3) {
                    int i5 = i + 1;
                    this.d = i5;
                    if (i5 > str2.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i3 < i4) {
                        str2.charAt(i3);
                    }
                    if (i3 < i4) {
                        str2.charAt(i4 - 1);
                    }
                    int i6 = this.e;
                    if (i6 == 1) {
                        i4 = str2.length();
                        this.d = -1;
                        if (i4 > i3) {
                            str2.charAt(i4 - 1);
                        }
                    } else {
                        this.e = i6 - 1;
                    }
                    str = str2.subSequence(i3, i4).toString();
                }
            }
            this.a = str;
            if (this.b != 3) {
                this.b = (byte) 1;
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
        this.b = (byte) 2;
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
