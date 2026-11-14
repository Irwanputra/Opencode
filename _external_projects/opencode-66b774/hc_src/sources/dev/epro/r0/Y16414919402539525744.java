package dev.epro.r0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y16414919402539525744 implements E9133045636215945243, R17143752899285419206, H3517214926285464793 {
    public int a;
    public int b;
    public Object c;

    public Y16414919402539525744(int i, int i2, J6301524036964264730 j6301524036964264730) {
        this.a = i;
        this.b = i2;
        this.c = new J15730374346044043770(new Q13115504886484571245(i, i2, j6301524036964264730));
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 e(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.c).e(j, z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public Object f() {
        return ((E9133045636215945243) this.c).f();
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void g(int i, Object obj) {
        ((E9133045636215945243) this.c).g(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void h(Object obj) {
        this.b++;
        ((E9133045636215945243) this.c).h(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void i() {
        ((E9133045636215945243) this.c).i();
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void j(int i, Object obj) {
        ((E9133045636215945243) this.c).j(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void l(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((E9133045636215945243) this.c).l(i + i4, i2 + i4, i3);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void m(int i, int i2) {
        ((E9133045636215945243) this.c).m(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // dev.epro.r0.H3517214926285464793
    public int n() {
        return this.b;
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void o(L12639328004344855510 l12639328004344855510, Object obj) {
        ((E9133045636215945243) this.c).o(l12639328004344855510, obj);
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int p(int i) {
        int p = ((R17143752899285419206) this.c).p(i);
        if (i >= 0 && i <= this.b) {
            N2420111770332391767.c(p, this.a, i);
        }
        return p;
    }

    @Override // dev.epro.r0.H3517214926285464793
    public int q() {
        return this.a;
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 r(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.c).r(j, z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // dev.epro.r0.R17143752899285419206
    public int s(int i) {
        int s = ((R17143752899285419206) this.c).s(i);
        if (i >= 0 && i <= this.a) {
            N2420111770332391767.b(s, this.b, i);
        }
        return s;
    }

    @Override // dev.epro.r0.E9133045636215945243
    public void t() {
        if (this.b <= 0) {
            N2332913310205178802.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((E9133045636215945243) this.c).t();
    }

    public Y16414919402539525744(R17143752899285419206 r17143752899285419206, int i, int i2) {
        this.c = r17143752899285419206;
        this.a = i;
        this.b = i2;
    }

    public Y16414919402539525744(int i, int i2, ByteBuffer byteBuffer) {
        this.a = i;
        this.c = byteBuffer;
        this.b = i2;
    }

    public Y16414919402539525744() {
        this.c = new Y16414919402539525744[256];
        this.a = 0;
        this.b = 0;
    }

    public /* synthetic */ Y16414919402539525744(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }
}
