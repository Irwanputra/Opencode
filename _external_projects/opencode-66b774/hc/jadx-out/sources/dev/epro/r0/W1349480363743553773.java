package dev.epro.r0;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
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
            CharSequence charSequenceH = h(str);
            int length = (int) (((((long) this.a.d) * ((long) charSequenceH.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceH);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (N4436072098053578995 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws N4436072098053578995 {
        CharSequence charSequenceH = h(charSequence);
        int length = charSequenceH.length();
        I10442258309656079103 i10442258309656079103 = this.a;
        boolean[] zArr = i10442258309656079103.h;
        int i = i10442258309656079103.d;
        int i2 = i10442258309656079103.e;
        if (!zArr[length % i2]) {
            throw new N4436072098053578995("Invalid input length " + charSequenceH.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceH.length(); i4 += i2) {
            long jA = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jA <<= i;
                if (i4 + i6 < charSequenceH.length()) {
                    jA |= (long) i10442258309656079103.a(charSequenceH.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = i10442258309656079103.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jA >>> i9) & 255);
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
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
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

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.W1349480363743553773 f() {
        /*
            r12 = this;
            dev.epro.r0.W1349480363743553773 r0 = r12.c
            if (r0 != 0) goto Lc5
            dev.epro.r0.I10442258309656079103 r0 = r12.a
            char[] r1 = r0.b
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lb:
            if (r4 >= r2) goto Lb7
            char r5 = r1[r4]
            r6 = 65
            if (r5 < r6) goto Lb3
            r7 = 90
            if (r5 > r7) goto Lb3
            int r2 = r1.length
            r4 = r3
        L19:
            r5 = 1
            if (r4 >= r2) goto L2b
            char r8 = r1[r4]
            r9 = 97
            if (r8 < r9) goto L28
            r9 = 122(0x7a, float:1.71E-43)
            if (r8 > r9) goto L28
            r2 = r5
            goto L2c
        L28:
            int r4 = r4 + 1
            goto L19
        L2b:
            r2 = r3
        L2c:
            r2 = r2 ^ r5
            java.lang.String r4 = "Cannot call lowerCase() on a mixed-case alphabet"
            dev.epro.r0.U15853425786981391261.C(r4, r2)
            int r2 = r1.length
            char[] r2 = new char[r2]
            r4 = r3
        L36:
            int r8 = r1.length
            if (r4 >= r8) goto L47
            char r8 = r1[r4]
            if (r8 < r6) goto L42
            if (r8 > r7) goto L42
            r8 = r8 ^ 32
            char r8 = (char) r8
        L42:
            r2[r4] = r8
            int r4 = r4 + 1
            goto L36
        L47:
            dev.epro.r0.I10442258309656079103 r1 = new dev.epro.r0.I10442258309656079103
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = r0.a
            java.lang.String r9 = ".lowerCase()"
            java.lang.String r4 = dev.epro.r0.G6547577305291411977.u(r4, r8, r9)
            r1.<init>(r2, r4)
            boolean r0 = r0.i
            if (r0 == 0) goto Lb1
            byte[] r0 = r1.g
            boolean r2 = r1.i
            if (r2 == 0) goto L64
            goto Lb1
        L64:
            int r2 = r0.length
            byte[] r2 = java.util.Arrays.copyOf(r0, r2)
        L69:
            if (r6 > r7) goto L9c
            r4 = r6 | 32
            r8 = r0[r6]
            r9 = r0[r4]
            r10 = -1
            if (r8 != r10) goto L77
            r2[r6] = r9
            goto L82
        L77:
            if (r9 != r10) goto L7b
            r9 = r5
            goto L7c
        L7b:
            r9 = r3
        L7c:
            char r10 = (char) r6
            char r11 = (char) r4
            if (r9 == 0) goto L85
            r2[r4] = r8
        L82:
            int r6 = r6 + 1
            goto L69
        L85:
            java.lang.Character r12 = java.lang.Character.valueOf(r10)
            java.lang.Character r0 = java.lang.Character.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r0}
            java.lang.String r0 = "Can't ignoreCase() since '%s' and '%s' encode different values"
            java.lang.String r12 = dev.epro.r0.E17665849472693074628.f(r0, r12)
            dev.epro.r0.S10973172697741180971.m(r12)
            r12 = 0
            return r12
        L9c:
            dev.epro.r0.I10442258309656079103 r0 = new dev.epro.r0.I10442258309656079103
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.a
            java.lang.String r6 = ".ignoreCase()"
            java.lang.String r3 = dev.epro.r0.G6547577305291411977.u(r3, r4, r6)
            char[] r1 = r1.b
            r0.<init>(r3, r1, r2, r5)
            goto Lb7
        Lb1:
            r0 = r1
            goto Lb7
        Lb3:
            int r4 = r4 + 1
            goto Lb
        Lb7:
            dev.epro.r0.I10442258309656079103 r1 = r12.a
            if (r0 != r1) goto Lbd
            r0 = r12
            goto Lc3
        Lbd:
            java.lang.Character r1 = r12.b
            dev.epro.r0.W1349480363743553773 r0 = r12.g(r0, r1)
        Lc3:
            r12.c = r0
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W1349480363743553773.f():dev.epro.r0.W1349480363743553773");
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
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
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
