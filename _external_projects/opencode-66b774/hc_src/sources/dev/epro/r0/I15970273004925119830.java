package dev.epro.r0;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I15970273004925119830 extends Z6326841645877405634 {
    public D14208870094104617988 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public D14208870094104617988 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f288o;
    public boolean p;
    public I1470541803076273897 q;
    public final B1061516154492673368 r;
    public B1061516154492673368 s;
    public B1061516154492673368 t;
    public final K7493131619793429513 u;

    public I15970273004925119830() {
        int i = A5540824790408504619.a;
        this.d = O2161699089510411363.a;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.f288o = true;
        B1061516154492673368 a = W7346099082318612118.a();
        this.r = a;
        this.s = a;
        this.u = M9216324016624295870.L(G14718160286012243331.c, new B9178969769697472001((byte) 26));
    }

    @Override // dev.epro.r0.Z6326841645877405634
    public final void a(L17598299826319227431 l17598299826319227431) {
        L17598299826319227431 l175982998263192274312;
        I1470541803076273897 i1470541803076273897;
        if (this.n) {
            C9869900372345142877.Y(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        D14208870094104617988 d14208870094104617988 = this.b;
        if (d14208870094104617988 != null) {
            l175982998263192274312 = l17598299826319227431;
            L17598299826319227431.p0(l175982998263192274312, this.s, d14208870094104617988, this.c, null, 56);
        } else {
            l175982998263192274312 = l17598299826319227431;
        }
        D14208870094104617988 d142088700941046179882 = this.g;
        if (d142088700941046179882 != null) {
            I1470541803076273897 i14705418030762738972 = this.q;
            if (this.f288o || i14705418030762738972 == null) {
                I1470541803076273897 i14705418030762738973 = new I1470541803076273897(this.f, this.j, this.h, this.i, 16);
                this.q = i14705418030762738973;
                this.f288o = false;
                i1470541803076273897 = i14705418030762738973;
            } else {
                i1470541803076273897 = i14705418030762738972;
            }
            L17598299826319227431.p0(l175982998263192274312, this.s, d142088700941046179882, this.e, i1470541803076273897, 48);
        }
    }

    public final void e() {
        float f = this.k;
        B1061516154492673368 b1061516154492673368 = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = b1061516154492673368;
            return;
        }
        B1061516154492673368 b10615161544926733682 = this.s;
        if (b10615161544926733682 != b1061516154492673368) {
            int i = b10615161544926733682.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.a.rewind();
            this.s.h(i);
        } else {
            this.s = W7346099082318612118.a();
        }
        K7493131619793429513 k7493131619793429513 = this.u;
        ((U18321239743851522118) k7493131619793429513.getValue()).a.setPath(b1061516154492673368.a, false);
        float length = ((U18321239743851522118) k7493131619793429513.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((U18321239743851522118) k7493131619793429513.getValue()).a(f4, f5, this.s);
            return;
        }
        B1061516154492673368 b10615161544926733683 = this.t;
        if (b10615161544926733683 == null) {
            b10615161544926733683 = W7346099082318612118.a();
            this.t = b10615161544926733683;
        }
        b10615161544926733683.g();
        ((U18321239743851522118) k7493131619793429513.getValue()).a(f4, length, b10615161544926733683);
        B1061516154492673368.a(this.s, b10615161544926733683);
        b10615161544926733683.g();
        ((U18321239743851522118) k7493131619793429513.getValue()).a(0.0f, f5, b10615161544926733683);
        B1061516154492673368.a(this.s, b10615161544926733683);
    }

    public final String toString() {
        return this.r.toString();
    }
}
