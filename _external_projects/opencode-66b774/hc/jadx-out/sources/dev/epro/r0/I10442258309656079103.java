package dev.epro.r0;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
            int iK = M2066880349381062048.K(length);
            this.d = iK;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iK);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iK >> iNumberOfTrailingZeros;
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

    public final int a(char c) throws N4436072098053578995 {
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
    public I10442258309656079103(char[] cArr, String str) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    S10973172697741180971.j(E17665849472693074628.f("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                S10973172697741180971.j(E17665849472693074628.f("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
