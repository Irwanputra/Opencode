package dev.epro.r0;

import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O16200024709371809403 implements R8540738700654750557 {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I5573661370475160895 f403o;
    public boolean p;
    public int q;
    public long r;
    public X3174009376965511256 s;
    public R8540738700654750557 t;
    public F10342546226345611902 u;
    public R3103059035698929241 v;
    public int w;
    public J8045362843799184672 x;

    public O16200024709371809403() {
        long j = P15210604536357993274.a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = N13757329872968394114.b;
        this.f403o = R7033599853981556291.n;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = X3174009376965511256.a;
        this.t = Z1953481206310471956.e();
        this.u = F10342546226345611902.a;
        this.w = 3;
    }

    public final void a() {
        g(1.0f);
        h(1.0f);
        b(1.0f);
        if (this.e != 0.0f) {
            this.a |= 8;
            this.e = 0.0f;
        }
        n(0.0f);
        i(0.0f);
        long j = P15210604536357993274.a;
        d(j);
        k(j);
        if (this.j != 0.0f) {
            this.a |= 256;
            this.j = 0.0f;
        }
        if (this.k != 0.0f) {
            this.a |= 512;
            this.k = 0.0f;
        }
        if (this.l != 0.0f) {
            this.a |= 1024;
            this.l = 0.0f;
        }
        if (this.m != 8.0f) {
            this.a |= 2048;
            this.m = 8.0f;
        }
        l(N13757329872968394114.b);
        j(R7033599853981556291.n);
        f(false);
        if (!S10823041268949770285.t(this.v, null)) {
            this.a |= 262144;
            this.v = null;
        }
        if (this.w != 3) {
            this.a |= 524288;
            this.w = 3;
        }
        if (this.q != 0) {
            this.a |= 32768;
            this.q = 0;
        }
        X3174009376965511256 x3174009376965511256 = X3174009376965511256.a;
        if (!S10823041268949770285.t(this.s, x3174009376965511256)) {
            this.a |= 1048576;
            this.s = x3174009376965511256;
        }
        this.r = 9205357640488583168L;
        this.x = null;
        this.a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.t.c();
    }

    public final void d(long j) {
        long j2 = this.h;
        int i = U10174709222559481877.i;
        if (P15388715743159210616.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void f(boolean z) {
        if (this.p != z) {
            this.a |= CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE;
            this.p = z;
        }
    }

    public final void g(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void h(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void i(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void j(I5573661370475160895 i5573661370475160895) {
        if (S10823041268949770285.t(this.f403o, i5573661370475160895)) {
            return;
        }
        this.a |= 8192;
        this.f403o = i5573661370475160895;
    }

    public final void k(long j) {
        long j2 = this.i;
        int i = U10174709222559481877.i;
        if (P15388715743159210616.a(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void l(long j) {
        if (N13757329872968394114.a(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void n(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.t.s();
    }
}
