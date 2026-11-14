package dev.epro.r0;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F5390871378632077601 extends P5124777957357031757 {
    public final transient byte[][] e;
    public final transient int[] f;

    public F5390871378632077601(byte[][] bArr, int[] iArr) {
        super(P5124777957357031757.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final String a() {
        return new P5124777957357031757(k()).a();
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final String c() {
        return new P5124777957357031757(k()).c();
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final byte[] d() {
        return k();
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final byte e(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        E12775674050813925581.t(iArr[length], i, 1L);
        int Z = S10823041268949770285.Z(this, i);
        return bArr[Z][(i - (Z == 0 ? 0 : iArr[Z - 1])) + iArr[bArr.length + Z]];
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P5124777957357031757)) {
            return false;
        }
        P5124777957357031757 p5124777957357031757 = (P5124777957357031757) obj;
        return p5124777957357031757.b() == b() && g(p5124777957357031757, b());
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final boolean f(int i, int i2, byte[] bArr, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= b() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int Z = S10823041268949770285.Z(this, i);
            while (i < i4) {
                int[] iArr = this.f;
                int i5 = Z == 0 ? 0 : iArr[Z - 1];
                int i6 = iArr[Z] - i5;
                byte[][] bArr2 = this.e;
                int i7 = iArr[bArr2.length + Z];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[Z];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                Z++;
            }
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final boolean g(P5124777957357031757 p5124777957357031757, int i) {
        p5124777957357031757.getClass();
        if (b() - i >= 0) {
            int Z = S10823041268949770285.Z(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f;
                int i4 = Z == 0 ? 0 : iArr[Z - 1];
                int i5 = iArr[Z] - i4;
                byte[][] bArr = this.e;
                int i6 = iArr[bArr.length + Z];
                int min = Math.min(i, i5 + i4) - i2;
                if (p5124777957357031757.f(i3, (i2 - i4) + i6, bArr[Z], min)) {
                    i3 += min;
                    i2 += min;
                    Z++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final String h(Charset charset) {
        charset.getClass();
        return new P5124777957357031757(k()).h(charset);
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final P5124777957357031757 i(int i, int i2) {
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > b()) {
            StringBuilder q = E12098517352909843120.q(i2, "endIndex=", " > length(");
            q.append(b());
            q.append(')');
            throw new IllegalArgumentException(q.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            S10973172697741180971.i(E12098517352909843120.l("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == b()) {
            return this;
        }
        if (i == i2) {
            return P5124777957357031757.d;
        }
        int Z = S10823041268949770285.Z(this, i);
        int Z2 = S10823041268949770285.Z(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) O5378677881740157249.v0(bArr, Z, Z2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (Z <= Z2) {
            int i4 = Z;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == Z2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = Z != 0 ? iArr2[Z - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new F5390871378632077601(bArr2, iArr);
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final P5124777957357031757 j() {
        return new P5124777957357031757(k()).j();
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final byte[] k() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            O5378677881740157249.o0(i3, i4, bArr2[i], i4 + i6, bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final void m(P5176232750190581838 p5176232750190581838, int i) {
        int Z = S10823041268949770285.Z(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = Z == 0 ? 0 : iArr[Z - 1];
            int i4 = iArr[Z] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + Z];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            P5586796822028136504 p5586796822028136504 = new P5586796822028136504(bArr[Z], i6, i6 + min, true);
            P5586796822028136504 p55867968220281365042 = p5176232750190581838.a;
            if (p55867968220281365042 == null) {
                p5586796822028136504.g = p5586796822028136504;
                p5586796822028136504.f = p5586796822028136504;
                p5176232750190581838.a = p5586796822028136504;
            } else {
                P5586796822028136504 p55867968220281365043 = p55867968220281365042.g;
                p55867968220281365043.getClass();
                p55867968220281365043.b(p5586796822028136504);
            }
            i2 += min;
            Z++;
        }
        p5176232750190581838.b += i;
    }

    @Override // dev.epro.r0.P5124777957357031757
    public final String toString() {
        return new P5124777957357031757(k()).toString();
    }
}
