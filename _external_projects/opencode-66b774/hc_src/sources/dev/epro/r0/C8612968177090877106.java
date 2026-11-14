package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C8612968177090877106 implements CharSequence {
    public CharSequence a;
    public T17027910246883169756 b;
    public int c;
    public int d;

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            Y16081827717826519461.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            Y16081827717826519461.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            Y16081827717826519461.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            Y16081827717826519461.a("textStart must be non-negative, but was " + i3);
        }
        T17027910246883169756 t17027910246883169756 = this.b;
        int i5 = i4 - i3;
        if (t17027910246883169756 == null) {
            int max = Math.max(255, i5 + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.a.length() - i2, 64);
            int i6 = i - min;
            T3224757362656795885.p(this.a, cArr, 0, i6, i);
            int i7 = max - min2;
            int i8 = min2 + i2;
            T3224757362656795885.p(this.a, cArr, i7, i2, i8);
            T3224757362656795885.p(charSequence, cArr, min, i3, i4);
            T17027910246883169756 t170279102468831697562 = new T17027910246883169756((byte) 1);
            t170279102468831697562.b = max;
            t170279102468831697562.c = cArr;
            t170279102468831697562.d = min + i5;
            t170279102468831697562.e = i7;
            this.b = t170279102468831697562;
            this.c = i6;
            this.d = i8;
            return;
        }
        int i9 = this.c;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > t17027910246883169756.b - t17027910246883169756.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > t17027910246883169756.a()) {
            int a = i12 - t17027910246883169756.a();
            int i13 = t17027910246883169756.b;
            do {
                i13 *= 2;
            } while (i13 - t17027910246883169756.b < a);
            char[] cArr2 = new char[i13];
            O5378677881740157249.p0(t17027910246883169756.c, cArr2, 0, 0, t17027910246883169756.d);
            int i14 = t17027910246883169756.b;
            int i15 = t17027910246883169756.e;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            O5378677881740157249.p0(t17027910246883169756.c, cArr2, i17, i15, i16 + i15);
            t17027910246883169756.c = cArr2;
            t17027910246883169756.b = i13;
            t17027910246883169756.e = i17;
        }
        int i18 = t17027910246883169756.d;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = t17027910246883169756.c;
            O5378677881740157249.p0(cArr3, cArr3, t17027910246883169756.e - i19, i11, i18);
            t17027910246883169756.d = i10;
            t17027910246883169756.e -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int a2 = t17027910246883169756.a() + i10;
            int a3 = t17027910246883169756.a() + i11;
            int i20 = t17027910246883169756.e;
            char[] cArr4 = t17027910246883169756.c;
            O5378677881740157249.p0(cArr4, cArr4, t17027910246883169756.d, i20, a2);
            i10 = t17027910246883169756.d + (a2 - i20);
            t17027910246883169756.d = i10;
            t17027910246883169756.e = a3;
        } else {
            t17027910246883169756.e = t17027910246883169756.a() + i11;
            t17027910246883169756.d = i10;
        }
        T3224757362656795885.p(charSequence, t17027910246883169756.c, i10, i3, i4);
        t17027910246883169756.d += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        T17027910246883169756 t17027910246883169756 = this.b;
        if (t17027910246883169756 == null) {
            return this.a.charAt(i);
        }
        if (i < this.c) {
            return this.a.charAt(i);
        }
        int a = t17027910246883169756.b - t17027910246883169756.a();
        int i2 = this.c;
        if (i >= a + i2) {
            return this.a.charAt(i - ((a - this.d) + i2));
        }
        int i3 = i - i2;
        int i4 = t17027910246883169756.d;
        char[] cArr = t17027910246883169756.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + t17027910246883169756.e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        T17027910246883169756 t17027910246883169756 = this.b;
        CharSequence charSequence = this.a;
        if (t17027910246883169756 == null) {
            return charSequence.length();
        }
        return (t17027910246883169756.b - t17027910246883169756.a()) + (charSequence.length() - (this.d - this.c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        T17027910246883169756 t17027910246883169756 = this.b;
        if (t17027910246883169756 == null) {
            return this.a.toString();
        }
        StringBuilder sb = new StringBuilder((this.a.length() + ((t17027910246883169756.b - t17027910246883169756.a()) + this.c)) - this.d);
        sb.append(this.a, 0, this.c);
        sb.append(t17027910246883169756.c, 0, t17027910246883169756.d);
        char[] cArr = t17027910246883169756.c;
        int i = t17027910246883169756.e;
        sb.append(cArr, i, t17027910246883169756.b - i);
        CharSequence charSequence = this.a;
        sb.append(charSequence, this.d, charSequence.length());
        return sb.toString();
    }
}
