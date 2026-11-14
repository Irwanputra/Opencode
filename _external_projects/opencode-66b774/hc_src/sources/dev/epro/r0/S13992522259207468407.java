package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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

    /* renamed from: o, reason: collision with root package name */
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
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = N9580590882934638229.a();
                this.b = fArr;
            } else {
                N9580590882934638229.d(fArr);
            }
            N9580590882934638229.f(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.f481o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            N9580590882934638229.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                B1061516154492673368 b1061516154492673368 = this.h;
                if (b1061516154492673368 == null) {
                    b1061516154492673368 = W7346099082318612118.a();
                    this.h = b1061516154492673368;
                }
                C9869900372345142877.Y(this.f, b1061516154492673368);
            }
            this.g = false;
        }
        Q7316561721656982910 R = l17598299826319227431.R();
        long F = R.F();
        R.A().l();
        try {
            Q7316561721656982910 q7316561721656982910 = (Q7316561721656982910) ((H12843822278061842084) R.b).b;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                q7316561721656982910.A().s(fArr2);
            }
            B1061516154492673368 b10615161544926733682 = this.h;
            if (!this.f.isEmpty() && b10615161544926733682 != null) {
                q7316561721656982910.A().b(b10615161544926733682);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Z6326841645877405634) arrayList.get(i)).a(l17598299826319227431);
            }
        } finally {
            L11610354117192841236.w(R, F);
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
