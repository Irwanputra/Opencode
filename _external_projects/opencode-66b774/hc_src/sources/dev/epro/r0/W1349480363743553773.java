package dev.epro.r0;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class W1349480363743553773 {
    public static final P12817159812099202599 d = new P12817159812099202599("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final P12817159812099202599 e = new P12817159812099202599("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final R9879029263869211740 f;
    public final I10442258309656079103 a;
    public final Character b;
    public volatile W1349480363743553773 c;

    static {
        new W1349480363743553773("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new W1349480363743553773("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f = new R9879029263869211740(new I10442258309656079103(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}, "base16()"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public W1349480363743553773(dev.epro.r0.I10442258309656079103 r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r3.getClass()
            r2.a = r3
            if (r4 == 0) goto L1a
            char r0 = r4.charValue()
            byte[] r3 = r3.g
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L1a
            r3 = 0
            goto L1b
        L1a:
            r3 = 1
        L1b:
            if (r3 == 0) goto L20
            r2.b = r4
            return
        L20:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String r3 = "Padding character %s was already in alphabet"
            java.lang.String r2 = dev.epro.r0.E17665849472693074628.f(r3, r2)
            dev.epro.r0.S10973172697741180971.j(r2)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W1349480363743553773.<init>(dev.epro.r0.I10442258309656079103, java.lang.Character):void");
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b = b(bArr, h(str));
            if (b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b];
            System.arraycopy(bArr, 0, bArr2, 0, b);
            return bArr2;
        } catch (N4436072098053578995 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence h = h(charSequence);
        int length = h.length();
        I10442258309656079103 i10442258309656079103 = this.a;
        boolean[] zArr = i10442258309656079103.h;
        int i = i10442258309656079103.d;
        int i2 = i10442258309656079103.e;
        if (!zArr[length % i2]) {
            throw new N4436072098053578995("Invalid input length " + h.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < h.length(); i4 += i2) {
            long j = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j <<= i;
                if (i4 + i6 < h.length()) {
                    j |= i10442258309656079103.a(h.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = i10442258309656079103.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((j >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        U15853425786981391261.B(0, length, bArr.length);
        I10442258309656079103 i10442258309656079103 = this.a;
        int i = i10442258309656079103.e;
        int i2 = i10442258309656079103.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(M2066880349381062048.z(length, i2) * i);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i2) {
        U15853425786981391261.B(i, i + i2, bArr.length);
        I10442258309656079103 i10442258309656079103 = this.a;
        int i3 = i10442258309656079103.f;
        int i4 = i10442258309656079103.d;
        if (i2 > i3) {
            K2042933864045806308.h();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(i10442258309656079103.b[((int) (j >>> (i7 - i5))) & i10442258309656079103.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < i10442258309656079103.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        U15853425786981391261.B(0, i, bArr.length);
        while (i2 < i) {
            I10442258309656079103 i10442258309656079103 = this.a;
            d(sb, bArr, i2, Math.min(i10442258309656079103.f, i - i2));
            i2 += i10442258309656079103.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W1349480363743553773) {
            W1349480363743553773 w1349480363743553773 = (W1349480363743553773) obj;
            if (this.a.equals(w1349480363743553773.a) && Objects.equals(this.b, w1349480363743553773.b)) {
                return true;
            }
        }
        return false;
    }

    public final W1349480363743553773 f() {
        boolean z;
        W1349480363743553773 w1349480363743553773 = this.c;
        if (w1349480363743553773 == null) {
            I10442258309656079103 i10442258309656079103 = this.a;
            char[] cArr = i10442258309656079103.b;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char c = cArr[i];
                if (c < 'A' || c > 'Z') {
                    i++;
                } else {
                    int length2 = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i2];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    U15853425786981391261.C("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c3 = cArr[i3];
                        if (c3 >= 'A' && c3 <= 'Z') {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i3] = c3;
                    }
                    I10442258309656079103 i104422583096560791032 = new I10442258309656079103(cArr2, G6547577305291411977.u(new StringBuilder(), i10442258309656079103.a, ".lowerCase()"));
                    if (i10442258309656079103.i) {
                        byte[] bArr = i104422583096560791032.g;
                        if (!i104422583096560791032.i) {
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            for (int i4 = 65; i4 <= 90; i4++) {
                                int i5 = i4 | 32;
                                byte b = bArr[i4];
                                byte b2 = bArr[i5];
                                if (b == -1) {
                                    copyOf[i4] = b2;
                                } else {
                                    char c4 = (char) i4;
                                    char c5 = (char) i5;
                                    if (!(b2 == -1)) {
                                        S10973172697741180971.m(E17665849472693074628.f("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        return null;
                                    }
                                    copyOf[i5] = b;
                                }
                            }
                            i10442258309656079103 = new I10442258309656079103(G6547577305291411977.u(new StringBuilder(), i104422583096560791032.a, ".ignoreCase()"), i104422583096560791032.b, copyOf, true);
                        }
                    }
                    i10442258309656079103 = i104422583096560791032;
                }
            }
            w1349480363743553773 = i10442258309656079103 == this.a ? this : g(i10442258309656079103, this.b);
            this.c = w1349480363743553773;
        }
        return w1349480363743553773;
    }

    public W1349480363743553773 g(I10442258309656079103 i10442258309656079103, Character ch) {
        return new W1349480363743553773(i10442258309656079103, ch);
    }

    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        I10442258309656079103 i10442258309656079103 = this.a;
        sb.append(i10442258309656079103);
        if (8 % i10442258309656079103.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public W1349480363743553773(String str, String str2) {
        this(new I10442258309656079103(str2.toCharArray(), str), (Character) '=');
    }
}
