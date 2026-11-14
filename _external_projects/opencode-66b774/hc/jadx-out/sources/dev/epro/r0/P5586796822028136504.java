package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P5586796822028136504 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public P5586796822028136504 f;
    public P5586796822028136504 g;

    public P5586796822028136504(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final P5586796822028136504 a() {
        P5586796822028136504 p5586796822028136504 = this.f;
        if (p5586796822028136504 == this) {
            p5586796822028136504 = null;
        }
        P5586796822028136504 p55867968220281365042 = this.g;
        p55867968220281365042.getClass();
        p55867968220281365042.f = this.f;
        P5586796822028136504 p55867968220281365043 = this.f;
        p55867968220281365043.getClass();
        p55867968220281365043.g = this.g;
        this.f = null;
        this.g = null;
        return p5586796822028136504;
    }

    public final void b(P5586796822028136504 p5586796822028136504) {
        p5586796822028136504.getClass();
        p5586796822028136504.g = this;
        p5586796822028136504.f = this.f;
        P5586796822028136504 p55867968220281365042 = this.f;
        p55867968220281365042.getClass();
        p55867968220281365042.g = p5586796822028136504;
        this.f = p5586796822028136504;
    }

    public final P5586796822028136504 c() {
        this.d = true;
        return new P5586796822028136504(this.a, this.b, this.c, true);
    }

    public final void d(P5586796822028136504 p5586796822028136504, int i) {
        p5586796822028136504.getClass();
        if (!p5586796822028136504.e) {
            S10973172697741180971.m("only owner can write");
            return;
        }
        int i2 = p5586796822028136504.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (p5586796822028136504.d) {
                K2042933864045806308.h();
                return;
            }
            int i4 = p5586796822028136504.b;
            if (i3 - i4 > 8192) {
                K2042933864045806308.h();
                return;
            }
            byte[] bArr = p5586796822028136504.a;
            O5378677881740157249.t0(0, bArr, i4, bArr, i2, 2);
            i2 = p5586796822028136504.c - p5586796822028136504.b;
            p5586796822028136504.c = i2;
            p5586796822028136504.b = 0;
        }
        byte[] bArr2 = p5586796822028136504.a;
        int i5 = this.b;
        O5378677881740157249.o0(i2, i5, this.a, i5 + i, bArr2);
        p5586796822028136504.c += i;
        this.b += i;
    }

    public P5586796822028136504() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
