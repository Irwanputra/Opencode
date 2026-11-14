package dev.epro.r0;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N283669454412232072 extends F3160751278268780235 {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public N283669454412232072(FileInputStream fileInputStream) {
        Charset charset = A9187767737237685029.a;
        this.c = fileInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int A() throws A9458650138667563085 {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iK = K();
        this.h = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new A9458650138667563085("Protocol message contained an invalid tag (zero).");
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int B() {
        return K();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long C() {
        return L();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean D(int i) throws A9458650138667563085 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                P(8);
                return true;
            }
            if (i2 == 2) {
                P(K());
                return true;
            }
            if (i2 == 3) {
                E();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw A9458650138667563085.b();
            }
            P(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw A9458650138667563085.c();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                O(1);
            }
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw A9458650138667563085.c();
        return true;
    }

    public final byte[] F(int i) throws IOException {
        byte[] bArrG = G(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList arrayListH = H(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        int size = arrayListH.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListH.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) throws IOException {
        if (i == 0) {
            return A9187767737237685029.b;
        }
        if (i < 0) {
            throw A9458650138667563085.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new A9458650138667563085("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            P((i5 - i2) - i3);
            throw A9458650138667563085.e();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (A9458650138667563085 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw A9458650138667563085.e();
                }
                this.i += i8;
                i6 += i8;
            } catch (A9458650138667563085 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw A9458650138667563085.e();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws A9458650138667563085 {
        int i = this.g;
        if (this.e - i < 4) {
            O(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() throws A9458650138667563085 {
        int i = this.g;
        if (this.e - i < 8) {
            O(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int K() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() throws A9458650138667563085 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                O(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw A9458650138667563085.c();
    }

    public final void N() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void O(int i) throws A9458650138667563085 {
        if (Q(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw A9458650138667563085.e();
        }
        throw new A9458650138667563085("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i) throws A9458650138667563085 {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw A9458650138667563085.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            P((i8 - i5) - i3);
            throw A9458650138667563085.e();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (A9458650138667563085 e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i4;
                N();
                throw th;
            }
        }
        this.i += i4;
        N();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        O(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                O(1);
            }
        }
    }

    public final boolean Q(int i) throws IOException {
        FileInputStream fileInputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            S10973172697741180971.m(G6547577305291411977.o(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.i + i2;
                this.i = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            try {
                int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.e += i6;
                    N();
                    if (this.e >= i) {
                        return true;
                    }
                    return Q(i);
                }
            } catch (A9458650138667563085 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void a(int i) throws A9458650138667563085 {
        if (this.h != i) {
            throw new A9458650138667563085("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int b() {
        return this.i + this.g;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean c() {
        return this.g == this.e && !Q(1);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void i(int i) {
        this.j = i;
        N();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int j(int i) throws A9458650138667563085 {
        if (i < 0) {
            throw A9458650138667563085.d();
        }
        int i2 = this.i + this.g + i;
        if (i2 < 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw A9458650138667563085.e();
        }
        this.j = i2;
        N();
        return i3;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean k() {
        return L() != 0;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final D8243293650800641817 l() throws IOException {
        int iK = K();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iK <= i3 && iK > 0) {
            D8243293650800641817 d8243293650800641817I = D8243293650800641817.i(i2, bArr, iK);
            this.g += iK;
            return d8243293650800641817I;
        }
        if (iK == 0) {
            return D8243293650800641817.c;
        }
        if (iK < 0) {
            throw A9458650138667563085.d();
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return D8243293650800641817.i(0, bArrG, bArrG.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListH.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListH.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        D8243293650800641817 d8243293650800641817 = D8243293650800641817.c;
        return new D8243293650800641817(bArr2);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int n() {
        return K();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int o() {
        return I();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long p() {
        return J();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int r() {
        return K();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long s() {
        return L();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int u() {
        return I();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long v() {
        return J();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int w() {
        int iK = K();
        return (-(iK & 1)) ^ (iK >>> 1);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long x() {
        long jL = L();
        return (-(jL & 1)) ^ (jL >>> 1);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final String y() throws A9458650138667563085 {
        int iK = K();
        byte[] bArr = this.d;
        if (iK > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK <= i - i2) {
                String str = new String(bArr, i2, iK, A9187767737237685029.a);
                this.g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw A9458650138667563085.d();
        }
        if (iK > this.e) {
            return new String(F(iK), A9187767737237685029.a);
        }
        O(iK);
        String str2 = new String(bArr, this.g, iK, A9187767737237685029.a);
        this.g += iK;
        return str2;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final String z() throws IOException {
        int iK = K();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrF = this.d;
        if (iK <= i3 && iK > 0) {
            this.g = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw A9458650138667563085.d();
            }
            i = 0;
            if (iK <= i2) {
                O(iK);
                this.g = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return D3909889792577220704.a.i(i, bArrF, iK);
    }
}
