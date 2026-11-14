package ads_mobile_sdk;

import dev.epro.r0.O17574792317020433029;
import dev.epro.r0.Z3383101362411723454;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ru extends tu {
    public final byte[] e;
    public final int f;
    public int g;
    public int j;
    public int k = Integer.MAX_VALUE;
    public int h = 0;

    public ru(byte[] bArr, int i) {
        this.e = bArr;
        this.f = i;
        this.g = i;
    }

    public final long A() {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.g;
        byte[] bArr = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                            j = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i4] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i4] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j5 = j6 ^ (bArr[i10] << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i4];
                                                long j7 = j5 ^ (b2 << 63);
                                                if (j7 >= 0) {
                                                    int i11 = i + 10;
                                                    if (b2 >= 0) {
                                                        j = j7 ^ (-9151873028817141888L);
                                                        i4 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j2 ^ j5;
                        }
                    }
                }
                this.h = i4;
                return j;
            }
        }
        long j8 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.h;
            if (i13 == this.g) {
                Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.h = i13 + 1;
            j8 |= (r1 & Byte.MAX_VALUE) << i12;
            if ((bArr[i13] & 128) == 0) {
                return j8;
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // ads_mobile_sdk.tu
    public final int a() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.h;
    }

    @Override // ads_mobile_sdk.tu
    public final int b() {
        return this.h;
    }

    @Override // ads_mobile_sdk.tu
    public final void c(int i) {
        this.k = i;
        int i2 = this.f;
        if (i <= i2) {
            this.g = i;
        } else {
            this.g = i2;
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int d(int i) {
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.h;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - i2) {
                Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.k;
        if (i3 > i4) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i3;
        int i5 = this.f;
        if (i3 <= i5) {
            this.g = i3;
            return i4;
        }
        this.g = i5;
        return i4;
    }

    @Override // ads_mobile_sdk.tu
    public final boolean e(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                f(8);
                return true;
            }
            if (i2 == 2) {
                f(m());
                return true;
            }
            if (i2 == 3) {
                w();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 == 5) {
                f(4);
                return true;
            }
            Z3383101362411723454.v();
            return false;
        }
        int i4 = this.g - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.h;
            if (i6 == this.g) {
                Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    public final void f(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int g() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final int h() {
        return x();
    }

    @Override // ads_mobile_sdk.tu
    public final long i() {
        return y();
    }

    @Override // ads_mobile_sdk.tu
    public final float j() {
        return Float.intBitsToFloat(x());
    }

    @Override // ads_mobile_sdk.tu
    public final int k() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final long l() {
        return A();
    }

    @Override // ads_mobile_sdk.tu
    public final int m() {
        try {
            int z = z();
            if (this.h <= this.g) {
                return z;
            }
            throw new yi1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (yi1 e) {
            if (this.h <= this.g) {
                throw e;
            }
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int n() {
        return x();
    }

    @Override // ads_mobile_sdk.tu
    public final long o() {
        return y();
    }

    @Override // ads_mobile_sdk.tu
    public final int p() {
        return tu.b(m());
    }

    @Override // ads_mobile_sdk.tu
    public final long q() {
        return tu.a(A());
    }

    @Override // ads_mobile_sdk.tu
    public final String r() {
        int m = m();
        if (m > 0) {
            int i = this.g;
            int i2 = this.h;
            if (m <= i - i2) {
                String str = new String(this.e, i2, m, StandardCharsets.UTF_8);
                this.h += m;
                return str;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // ads_mobile_sdk.tu
    public final String s() {
        int m = m();
        String str = "";
        if (m > 0) {
            int i = this.g;
            int i2 = this.h;
            if (m <= i - i2) {
                if (m == 0) {
                    O17574792317020433029 o17574792317020433029 = vn3.a;
                } else {
                    str = vn3.a.a(i2, this.e, m);
                }
                this.h += m;
                return str;
            }
        }
        if (m == 0) {
            return "";
        }
        if (m <= 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // ads_mobile_sdk.tu
    public final int t() {
        if (c()) {
            this.j = 0;
            return 0;
        }
        int m = m();
        this.j = m;
        if ((m >>> 3) != 0) {
            return m;
        }
        Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // ads_mobile_sdk.tu
    public final int u() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final long v() {
        return A();
    }

    public final int x() {
        int i = this.h;
        if (this.g - i < 4) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long y() {
        int i = this.h;
        if (this.g - i < 8) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int z() {
        int i = this.h;
        int i2 = i + 1;
        byte[] bArr = this.e;
        int i3 = bArr[i];
        if (i3 < 0) {
            int i4 = i + 2;
            int i5 = (bArr[i2] << 7) ^ i3;
            if (i5 < 0) {
                i3 = i5 ^ (-128);
            } else {
                int i6 = i + 3;
                int i7 = i5 ^ (bArr[i4] << 14);
                if (i7 >= 0) {
                    int i8 = i7 ^ 16256;
                    i2 = i6;
                    i3 = i8;
                } else {
                    i4 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << 21);
                    if (i9 < 0) {
                        i3 = i9 ^ (-2080896);
                    } else {
                        int i10 = i + 5;
                        int i11 = bArr[i4];
                        int i12 = (i9 ^ (i11 << 28)) ^ 266354560;
                        if (i11 < 0) {
                            i4 = i + 6;
                            if (bArr[i10] < 0) {
                                i10 = i + 7;
                                if (bArr[i4] < 0) {
                                    i4 = i + 8;
                                    if (bArr[i10] < 0) {
                                        i10 = i + 9;
                                        if (bArr[i4] < 0) {
                                            int i13 = i + 10;
                                            if (bArr[i10] < 0) {
                                                Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
                                                return 0;
                                            }
                                            i3 = i12;
                                            i2 = i13;
                                        }
                                    }
                                }
                            }
                            i3 = i12;
                        }
                        int i14 = i10;
                        i3 = i12;
                        i2 = i14;
                    }
                }
            }
            i2 = i4;
        }
        this.h = i2;
        return i3;
    }

    @Override // ads_mobile_sdk.tu
    public final boolean c() {
        return this.h == this.g;
    }

    @Override // ads_mobile_sdk.tu
    public final void a(int i) {
        if (this.j == i) {
            return;
        }
        Z3383101362411723454.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // ads_mobile_sdk.tu
    public final double f() {
        return Double.longBitsToDouble(y());
    }

    @Override // ads_mobile_sdk.tu
    public final boolean d() {
        return A() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // ads_mobile_sdk.tu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ads_mobile_sdk.qq e() {
        /*
            r4 = this;
            int r0 = r4.m()
            byte[] r1 = r4.e
            if (r0 <= 0) goto L19
            int r2 = r4.g
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            ads_mobile_sdk.qq r1 = ads_mobile_sdk.sq.b(r3, r1, r0)
            int r2 = r4.h
            int r2 = r2 + r0
            r4.h = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            ads_mobile_sdk.qq r4 = ads_mobile_sdk.sq.b
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.g
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.h = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L36
        L2f:
            r4 = 0
            if (r0 > 0) goto L4a
            if (r0 != 0) goto L44
            byte[] r4 = ads_mobile_sdk.rb1.a
        L36:
            ads_mobile_sdk.qq r0 = ads_mobile_sdk.sq.b
            int r0 = r4.length
            if (r0 != 0) goto L3e
            ads_mobile_sdk.qq r4 = ads_mobile_sdk.sq.b
            return r4
        L3e:
            ads_mobile_sdk.qq r0 = new ads_mobile_sdk.qq
            r0.<init>(r4)
            return r0
        L44:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            dev.epro.r0.Z3383101362411723454.o(r0)
            return r4
        L4a:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            dev.epro.r0.Z3383101362411723454.o(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ru.e():ads_mobile_sdk.qq");
    }
}
