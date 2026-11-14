package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O13358947611952778634 {
    public final M3727281027331139839 a;
    public M18113111391818111737 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final B3798966058357121240 d = new B3798966058357121240((byte) 1);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public O13358947611952778634(M3727281027331139839 m3727281027331139839, M18113111391818111737 m18113111391818111737) {
        this.a = m3727281027331139839;
        this.b = m18113111391818111737;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            Z17561488864728364842 z17561488864728364842 = this.b.a;
            z17561488864728364842.e0(G7353694319700332679.c);
            z17561488864728364842.Q[z17561488864728364842.R - z17561488864728364842.O[z17561488864728364842.P - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        M18113111391818111737 m18113111391818111737 = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        m18113111391818111737.getClass();
        if (size != 0) {
            Z17561488864728364842 z175614888647283648422 = m18113111391818111737.a;
            z175614888647283648422.e0(V14973314157116751731.c);
            Z860808776098365610.M(z175614888647283648422, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                Z17561488864728364842 z17561488864728364842 = this.b.a;
                z17561488864728364842.e0(K15206691954580320105.c);
                int i3 = z17561488864728364842.R - z17561488864728364842.O[z17561488864728364842.P - 1].a;
                int[] iArr = z17561488864728364842.Q;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                Z17561488864728364842 z175614888647283648422 = this.b.a;
                z175614888647283648422.e0(V1244065743919710852.c);
                int i6 = z175614888647283648422.R - z175614888647283648422.O[z175614888647283648422.P - 1].a;
                int[] iArr2 = z175614888647283648422.Q;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        S2509933476155449112 s2509933476155449112 = this.a.G;
        int i = z ? s2509933476155449112.i : s2509933476155449112.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            N2332913310205178802.a("Tried to seek backward");
        }
        if (i2 > 0) {
            Z17561488864728364842 z17561488864728364842 = this.b.a;
            z17561488864728364842.e0(Q14356339215819651053.c);
            z17561488864728364842.Q[z17561488864728364842.R - z17561488864728364842.O[z17561488864728364842.P - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        S2509933476155449112 s2509933476155449112 = this.a.G;
        if (s2509933476155449112.c > 0) {
            int i = s2509933476155449112.i;
            B3798966058357121240 b3798966058357121240 = this.d;
            if (b3798966058357121240.c(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.a.e0(Z13122484887259424128.c);
                    this.c = true;
                }
                if (i > 0) {
                    M7798980774515057476 a = s2509933476155449112.a(i);
                    b3798966058357121240.e(i);
                    d(false);
                    Z17561488864728364842 z17561488864728364842 = this.b.a;
                    z17561488864728364842.e0(Z2330155803778778754.c);
                    Z860808776098365610.M(z17561488864728364842, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                N2332913310205178802.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
