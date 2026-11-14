package dev.epro.r0;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I10442258309656079103 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public I10442258309656079103(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int K = M2066880349381062048.K(length);
            this.d = K;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(K);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.e = i;
            this.f = K >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[M2066880349381062048.z(i2 * 8, i3)] = true;
            }
            this.h = zArr;
            this.i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) {
        if (c > 127) {
            throw new N4436072098053578995("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new N4436072098053578995("Unrecognized character: " + c);
        }
        throw new N4436072098053578995("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I10442258309656079103)) {
            return false;
        }
        I10442258309656079103 i10442258309656079103 = (I10442258309656079103) obj;
        return this.i == i10442258309656079103.i && Arrays.equals(this.b, i10442258309656079103.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I10442258309656079103(char[] r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4a
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            r8 = 0
            if (r7 == 0) goto L38
            r7 = r1[r5]
            if (r7 != r2) goto L1d
            goto L1e
        L1d:
            r6 = r3
        L1e:
            if (r6 == 0) goto L26
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L26:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r9 = dev.epro.r0.E17665849472693074628.f(r10, r9)
            dev.epro.r0.S10973172697741180971.j(r9)
            throw r8
        L38:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r9 = dev.epro.r0.E17665849472693074628.f(r10, r9)
            dev.epro.r0.S10973172697741180971.j(r9)
            throw r8
        L4a:
            r9.<init>(r11, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I10442258309656079103.<init>(char[], java.lang.String):void");
    }
}
