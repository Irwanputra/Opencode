package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P12817159812099202599 extends W1349480363743553773 {
    public P12817159812099202599(String str, String str2) {
        this(new I10442258309656079103(str2.toCharArray(), str), (Character) '=');
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence h = h(charSequence);
        int length = h.length();
        I10442258309656079103 i10442258309656079103 = this.a;
        if (!i10442258309656079103.h[length % i10442258309656079103.e]) {
            throw new N4436072098053578995("Invalid input length " + h.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < h.length()) {
            int i3 = i + 2;
            int a = (i10442258309656079103.a(h.charAt(i + 1)) << 12) | (i10442258309656079103.a(h.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (a >>> 16);
            if (i3 < h.length()) {
                int i5 = i + 3;
                int a2 = a | (i10442258309656079103.a(h.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((a2 >>> 8) & 255);
                if (i5 < h.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | i10442258309656079103.a(h.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        U15853425786981391261.B(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            I10442258309656079103 i10442258309656079103 = this.a;
            char[] cArr = i10442258309656079103.b;
            char[] cArr2 = i10442258309656079103.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            d(sb, bArr, i2, i - i2);
        }
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final W1349480363743553773 g(I10442258309656079103 i10442258309656079103, Character ch) {
        return new P12817159812099202599(i10442258309656079103, ch);
    }

    public P12817159812099202599(I10442258309656079103 i10442258309656079103, Character ch) {
        super(i10442258309656079103, ch);
        if (i10442258309656079103.b.length == 64) {
            return;
        }
        K2042933864045806308.h();
        throw null;
    }
}
