package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S13992522259207468407 extends Z6326841645877405634 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = U10174709222559481877.h;
    public List f;
    public boolean g;
    public B1061516154492673368 h;
    public F4096073349764486348 i;
    public final S16262227471297796850 j;
    public String k;
    public float l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f481o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public S13992522259207468407() {
        int i = A5540824790408504619.a;
        this.f = O2161699089510411363.a;
        this.g = true;
        this.j = new S16262227471297796850(this, (byte) 4);
        this.k = "";
        this.f481o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // dev.epro.r0.Z6326841645877405634
    public final void a(L17598299826319227431 l17598299826319227431) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = N9580590882934638229.a();
                this.b = fArrA;
            } else {
                N9580590882934638229.d(fArrA);
            }
            N9580590882934638229.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f481o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            N9580590882934638229.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                B1061516154492673368 b1061516154492673368A = this.h;
                if (b1061516154492673368A == null) {
                    b1061516154492673368A = W7346099082318612118.a();
                    this.h = b1061516154492673368A;
                }
                C9869900372345142877.Y(this.f, b1061516154492673368A);
            }
            this.g = false;
        }
        Q7316561721656982910 q7316561721656982910R = l17598299826319227431.R();
        long jF = q7316561721656982910R.F();
        q7316561721656982910R.A().l();
        try {
            Q7316561721656982910 q7316561721656982910 = (Q7316561721656982910) ((H12843822278061842084) q7316561721656982910R.b).b;
            float[] fArr = this.b;
            if (fArr != null) {
                q7316561721656982910.A().s(fArr);
            }
            B1061516154492673368 b1061516154492673368 = this.h;
            if (!this.f.isEmpty() && b1061516154492673368 != null) {
                q7316561721656982910.A().b(b1061516154492673368);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Z6326841645877405634) arrayList.get(i)).a(l17598299826319227431);
            }
        } finally {
            L11610354117192841236.w(q7316561721656982910R, jF);
        }
    }

    @Override // dev.epro.r0.Z6326841645877405634
    public final F4096073349764486348 b() {
        return this.i;
    }

    @Override // dev.epro.r0.Z6326841645877405634
    public final void d(S16262227471297796850 s16262227471297796850) {
        this.i = s16262227471297796850;
    }

    public final void e(int i, Z6326841645877405634 z6326841645877405634) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, z6326841645877405634);
        } else {
            arrayList.add(z6326841645877405634);
        }
        g(z6326841645877405634);
        z6326841645877405634.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = A5540824790408504619.a;
            if (U10174709222559481877.g(j2) == U10174709222559481877.g(j) && U10174709222559481877.f(j2) == U10174709222559481877.f(j) && U10174709222559481877.d(j2) == U10174709222559481877.d(j)) {
                return;
            }
            this.d = false;
            this.e = U10174709222559481877.h;
        }
    }

    public final void g(Z6326841645877405634 z6326841645877405634) {
        if (!(z6326841645877405634 instanceof I15970273004925119830)) {
            if (z6326841645877405634 instanceof S13992522259207468407) {
                S13992522259207468407 s13992522259207468407 = (S13992522259207468407) z6326841645877405634;
                if (s13992522259207468407.d && this.d) {
                    f(s13992522259207468407.e);
                    return;
                } else {
                    this.d = false;
                    this.e = U10174709222559481877.h;
                    return;
                }
            }
            return;
        }
        I15970273004925119830 i15970273004925119830 = (I15970273004925119830) z6326841645877405634;
        D14208870094104617988 d14208870094104617988 = i15970273004925119830.b;
        if (this.d && d14208870094104617988 != null) {
            if (d14208870094104617988 instanceof H10765568533039107979) {
                f(((H10765568533039107979) d14208870094104617988).a);
            } else {
                this.d = false;
                this.e = U10174709222559481877.h;
            }
        }
        D14208870094104617988 d142088700941046179882 = i15970273004925119830.g;
        if (this.d && d142088700941046179882 != null) {
            if (d142088700941046179882 instanceof H10765568533039107979) {
                f(((H10765568533039107979) d142088700941046179882).a);
            } else {
                this.d = false;
                this.e = U10174709222559481877.h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Z6326841645877405634 z6326841645877405634 = (Z6326841645877405634) arrayList.get(i);
            sb.append("\t");
            sb.append(z6326841645877405634.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
