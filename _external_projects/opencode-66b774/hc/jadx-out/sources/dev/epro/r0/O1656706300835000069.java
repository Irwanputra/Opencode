package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O1656706300835000069 extends F3160751278268780235 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public O1656706300835000069(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int A() throws A9458650138667563085 {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iH = H();
        this.h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new A9458650138667563085("Protocol message contained an invalid tag (zero).");
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int B() {
        return H();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long C() {
        return I();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean D(int i) throws A9458650138667563085 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                L(8);
                return true;
            }
            if (i2 == 2) {
                L(H());
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
            L(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw A9458650138667563085.c();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw A9458650138667563085.e();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw A9458650138667563085.c();
        return true;
    }

    public final int F() throws A9458650138667563085 {
        int i = this.f;
        if (this.d - i < 4) {
            throw A9458650138667563085.e();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long G() throws A9458650138667563085 {
        int i = this.f;
        if (this.d - i < 8) {
            throw A9458650138667563085.e();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int H() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                this.f = i4;
                return j;
            }
        }
        return J();
    }

    public final long J() throws A9458650138667563085 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw A9458650138667563085.e();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw A9458650138667563085.c();
    }

    public final void K() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void L(int i) throws A9458650138667563085 {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw A9458650138667563085.e();
        }
        throw A9458650138667563085.d();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void a(int i) throws A9458650138667563085 {
        if (this.h != i) {
            throw new A9458650138667563085("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int b() {
        return this.f - this.g;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void i(int i) {
        this.i = i;
        K();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int j(int i) {
        if (i < 0) {
            throw A9458650138667563085.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int i2 = this.i;
        if (iB > i2) {
            throw A9458650138667563085.e();
        }
        this.i = iB;
        K();
        return i2;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final boolean k() {
        return I() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // dev.epro.r0.F3160751278268780235
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.D8243293650800641817 l() throws dev.epro.r0.A9458650138667563085 {
        /*
            r4 = this;
            int r0 = r4.H()
            byte[] r1 = r4.c
            if (r0 <= 0) goto L19
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            dev.epro.r0.D8243293650800641817 r1 = dev.epro.r0.D8243293650800641817.i(r3, r1, r0)
            int r2 = r4.f
            int r2 = r2 + r0
            r4.f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            dev.epro.r0.D8243293650800641817 r4 = dev.epro.r0.D8243293650800641817.c
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r4 = dev.epro.r0.A9187767737237685029.b
        L35:
            dev.epro.r0.D8243293650800641817 r0 = dev.epro.r0.D8243293650800641817.c
            dev.epro.r0.D8243293650800641817 r0 = new dev.epro.r0.D8243293650800641817
            r0.<init>(r4)
            return r0
        L3d:
            dev.epro.r0.A9458650138667563085 r4 = dev.epro.r0.A9458650138667563085.d()
            throw r4
        L42:
            dev.epro.r0.A9458650138667563085 r4 = dev.epro.r0.A9458650138667563085.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O1656706300835000069.l():dev.epro.r0.D8243293650800641817");
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int n() {
        return H();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int o() {
        return F();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long p() {
        return G();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int r() {
        return H();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long s() {
        return I();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int u() {
        return F();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long v() {
        return G();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final int w() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final long x() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final String y() throws A9458650138667563085 {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String str = new String(this.c, i2, iH, A9187767737237685029.a);
                this.f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw A9458650138667563085.d();
        }
        throw A9458650138667563085.e();
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final String z() throws A9458650138667563085 {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String strI = D3909889792577220704.a.i(i2, this.c, iH);
                this.f += iH;
                return strI;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw A9458650138667563085.d();
        }
        throw A9458650138667563085.e();
    }
}
