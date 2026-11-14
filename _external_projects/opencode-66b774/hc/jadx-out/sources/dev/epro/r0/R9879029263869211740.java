package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R9879029263869211740 extends W1349480363743553773 {
    public final char[] g;

    public R9879029263869211740(I10442258309656079103 i10442258309656079103) {
        super(i10442258309656079103, (Character) null);
        this.g = new char[512];
        char[] cArr = i10442258309656079103.b;
        if (cArr.length != 16) {
            K2042933864045806308.h();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.g;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final int b(byte[] bArr, CharSequence charSequence) throws N4436072098053578995 {
        if (charSequence.length() % 2 == 1) {
            throw new N4436072098053578995("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            I10442258309656079103 i10442258309656079103 = this.a;
            bArr[i2] = (byte) ((i10442258309656079103.a(cCharAt) << 4) | i10442258309656079103.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        U15853425786981391261.B(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // dev.epro.r0.W1349480363743553773
    public final W1349480363743553773 g(I10442258309656079103 i10442258309656079103, Character ch) {
        return new R9879029263869211740(i10442258309656079103);
    }
}
