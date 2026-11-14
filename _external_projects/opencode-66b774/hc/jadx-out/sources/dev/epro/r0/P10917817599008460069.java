package dev.epro.r0;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P10917817599008460069 implements Closeable {
    public final G842859980338292746 a;
    public final P10544952747155442696 b;
    public final String c;
    public final int d;
    public final F3187248827616951674 e;
    public final F12902864952249894497 f;
    public final W7378377772343420238 g;
    public final L6498280162989651404 h;
    public final P10917817599008460069 i;
    public final P10917817599008460069 j;
    public final P10917817599008460069 k;
    public final long l;
    public final long m;
    public final T558270488962777544 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S76089685918653100 f419o;
    public final boolean p;

    public P10917817599008460069(G842859980338292746 g842859980338292746, P10544952747155442696 p10544952747155442696, String str, int i, F3187248827616951674 f3187248827616951674, F12902864952249894497 f12902864952249894497, W7378377772343420238 w7378377772343420238, L6498280162989651404 l6498280162989651404, P10917817599008460069 p10917817599008460069, P10917817599008460069 p109178175990084600692, P10917817599008460069 p109178175990084600693, long j, long j2, T558270488962777544 t558270488962777544, S76089685918653100 s76089685918653100) {
        g842859980338292746.getClass();
        p10544952747155442696.getClass();
        str.getClass();
        w7378377772343420238.getClass();
        s76089685918653100.getClass();
        this.a = g842859980338292746;
        this.b = p10544952747155442696;
        this.c = str;
        this.d = i;
        this.e = f3187248827616951674;
        this.f = f12902864952249894497;
        this.g = w7378377772343420238;
        this.h = l6498280162989651404;
        this.i = p10917817599008460069;
        this.j = p109178175990084600692;
        this.k = p109178175990084600693;
        this.l = j;
        this.m = j2;
        this.n = t558270488962777544;
        this.f419o = s76089685918653100;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.p = z;
    }

    public final O6225539295864356213 b() {
        O6225539295864356213 o6225539295864356213 = new O6225539295864356213();
        o6225539295864356213.c = -1;
        o6225539295864356213.g = W7378377772343420238.a;
        o6225539295864356213.f413o = S76089685918653100.Wo;
        o6225539295864356213.a = this.a;
        o6225539295864356213.b = this.b;
        o6225539295864356213.c = this.d;
        o6225539295864356213.d = this.c;
        o6225539295864356213.e = this.e;
        o6225539295864356213.f = X7410747940286448830.f(this.f);
        o6225539295864356213.g = this.g;
        o6225539295864356213.h = this.h;
        o6225539295864356213.i = this.i;
        o6225539295864356213.j = this.j;
        o6225539295864356213.k = this.k;
        o6225539295864356213.l = this.l;
        o6225539295864356213.m = this.m;
        o6225539295864356213.n = this.n;
        o6225539295864356213.f413o = this.f419o;
        return o6225539295864356213;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
