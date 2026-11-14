package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        String string = null;
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
                int length = this.d;
                if (length == -1) {
                    this.b = (byte) 3;
                    break;
                }
                String str = this.c;
                int length2 = str.length();
                P1789376955961125859.n(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.d = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.d = i;
                }
                if (i == i3) {
                    int i4 = i + 1;
                    this.d = i4;
                    if (i4 > str.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i3 < length) {
                        str.charAt(i3);
                    }
                    if (i3 < length) {
                        str.charAt(length - 1);
                    }
                    int i5 = this.e;
                    if (i5 == 1) {
                        length = str.length();
                        this.d = -1;
                        if (length > i3) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.e = i5 - 1;
                    }
                    string = str.subSequence(i3, length).toString();
                }
            }
            this.a = string;
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
