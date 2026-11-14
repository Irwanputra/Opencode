package dev.epro.r0;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R12643293538999642754 implements U18133900443301080740 {
    public B9692660393722135472 a;
    public final Y17698807562857349923 b;
    public final S7974369370986781936 c;
    public L12639328004344855510 d;
    public B13729205492206812220 e;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public J8045362843799184672 p;
    public boolean q;
    public boolean r;
    public boolean t;
    public long f = 9223372034707292159L;
    public final float[] h = N9580590882934638229.a();
    public R8540738700654750557 k = Z1953481206310471956.e();
    public F10342546226345611902 l = F10342546226345611902.a;
    public final N16536369055082677148 m = new N16536369055082677148();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f463o = N13757329872968394114.b;
    public boolean s = true;
    public final S16262227471297796850 u = new S16262227471297796850(this, (byte) 3);

    public R12643293538999642754(B9692660393722135472 b9692660393722135472, Y17698807562857349923 y17698807562857349923, S7974369370986781936 s7974369370986781936, L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220) {
        this.a = b9692660393722135472;
        this.b = y17698807562857349923;
        this.c = s7974369370986781936;
        this.d = l12639328004344855510;
        this.e = b13729205492206812220;
    }

    public final float[] a() {
        float[] fArrA = this.i;
        if (fArrA == null) {
            fArrA = N9580590882934638229.a();
            this.i = fArrA;
        }
        if (this.r) {
            this.r = false;
            float[] fArrB = b();
            if (this.s) {
                return fArrB;
            }
            if (!U15853425786981391261.S(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            B9692660393722135472 b9692660393722135472 = this.a;
            long jM = b9692660393722135472.z;
            Y257452374762370649 y257452374762370649 = b9692660393722135472.a;
            if ((9223372034707292159L & jM) == 9205357640488583168L) {
                jM = S12227320117525376577.m(I3887072968740112330.Q(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
            float fS = y257452374762370649.s();
            float fG = y257452374762370649.g();
            float fW = y257452374762370649.w();
            float fD = y257452374762370649.D();
            float fJ = y257452374762370649.J();
            float fD2 = y257452374762370649.d();
            float fH = y257452374762370649.H();
            double d = ((double) fW) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fG * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fG * fSin);
            double d2 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fS * fCos2);
            float f10 = (f3 * fCos2) + ((-fS) * fSin2);
            double d3 = ((double) fJ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fD2;
            float f16 = f14 * fD2;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fD2;
            float f18 = f12 * fH;
            float f19 = fCos * fCos3 * fH;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fH;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = D1286559660607336098.w(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.j || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zP = S7974369370986781936.p();
        S7974369370986781936 s7974369370986781936 = this.c;
        if (zP) {
            s7974369370986781936.Q(-4.0f);
        }
        B9692660393722135472 b9692660393722135472 = this.a;
        if (!Q2551293802323679034.b(b9692660393722135472.t, j)) {
            b9692660393722135472.t = j;
            b9692660393722135472.a.r((int) (j >> 32), b9692660393722135472.u, (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT < 26) {
            s7974369370986781936.invalidate();
            return;
        }
        ViewParent parent = s7974369370986781936.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(s7974369370986781936, s7974369370986781936);
        }
    }

    public final void e(long j) {
        if (Q13254524308163418711.a(j, this.f)) {
            return;
        }
        if (S7974369370986781936.p()) {
            this.c.Q(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.j) {
            this.j = z;
            S7974369370986781936 s7974369370986781936 = this.c;
            U9803441765912152712 u9803441765912152712 = s7974369370986781936.A;
            boolean z2 = s7974369370986781936.C;
            if (!z) {
                if (z2) {
                    return;
                }
                u9803441765912152712.j(this);
                U9803441765912152712 u98034417659121527122 = s7974369370986781936.B;
                if (u98034417659121527122 != null) {
                    u98034417659121527122.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                u9803441765912152712.a(this);
                return;
            }
            U9803441765912152712 u98034417659121527123 = s7974369370986781936.B;
            if (u98034417659121527123 == null) {
                u98034417659121527123 = new U9803441765912152712();
                s7974369370986781936.B = u98034417659121527123;
            }
            u98034417659121527123.a(this);
        }
    }

    public final void g() {
        S7974369370986781936.p();
        if (this.j) {
            if (!N13757329872968394114.a(this.f463o, N13757329872968394114.b) && !Q13254524308163418711.a(this.a.u, this.f)) {
                B9692660393722135472 b9692660393722135472 = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f463o >> 32)) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f463o & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!L2216691091636065972.b(b9692660393722135472.z, jFloatToRawIntBits)) {
                    b9692660393722135472.z = jFloatToRawIntBits;
                    b9692660393722135472.a.L(jFloatToRawIntBits);
                }
            }
            B9692660393722135472 b96926603937221354722 = this.a;
            R8540738700654750557 r8540738700654750557 = this.k;
            F10342546226345611902 f10342546226345611902 = this.l;
            long j = this.f;
            long j2 = b96926603937221354722.u;
            Y257452374762370649 y257452374762370649 = b96926603937221354722.a;
            if (!Q13254524308163418711.a(j2, j)) {
                b96926603937221354722.u = j;
                long j3 = b96926603937221354722.t;
                y257452374762370649.r((int) (j3 >> 32), j, (int) (4294967295L & j3));
                if (b96926603937221354722.i == 9205357640488583168L) {
                    b96926603937221354722.g = true;
                    b96926603937221354722.a();
                }
            }
            b96926603937221354722.b = r8540738700654750557;
            b96926603937221354722.c = f10342546226345611902;
            b96926603937221354722.d = this.u;
            y257452374762370649.N(r8540738700654750557, f10342546226345611902, b96926603937221354722, b96926603937221354722.e);
            f(false);
        }
    }
}
