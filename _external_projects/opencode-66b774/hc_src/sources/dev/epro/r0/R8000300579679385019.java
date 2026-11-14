package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R8000300579679385019 {
    public final H11725168162114556860 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public int f474o;
    public L8383256292871170816 q;
    public J4327291511168983093 d = J4327291511168983093.e;
    public final T8458668874796040341 p = new T8458668874796040341(this);

    public R8000300579679385019(H11725168162114556860 h11725168162114556860) {
        this.a = h11725168162114556860;
    }

    public final Y4989033692226475498 a() {
        return (Y4989033692226475498) this.a.F.e;
    }

    public final void b() {
        J4327291511168983093 j4327291511168983093 = this.a.G.d;
        J4327291511168983093 j43272915111689830932 = J4327291511168983093.c;
        J4327291511168983093 j43272915111689830933 = J4327291511168983093.d;
        if (j4327291511168983093 == j43272915111689830932 || j4327291511168983093 == j43272915111689830933) {
            if (this.p.B) {
                g(true);
            } else {
                f(true);
            }
        }
        if (j4327291511168983093 == j43272915111689830933) {
            L8383256292871170816 l8383256292871170816 = this.q;
            if (l8383256292871170816 == null || !l8383256292871170816.v) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        L8383256292871170816 l8383256292871170816 = this.q;
        if (l8383256292871170816 != null) {
            R8000300579679385019 r8000300579679385019 = l8383256292871170816.f;
            r8000300579679385019.d = J4327291511168983093.b;
            H11725168162114556860 h11725168162114556860 = r8000300579679385019.a;
            r8000300579679385019.e = false;
            l8383256292871170816.z = j;
            B4499109999593241705 snapshotObserver = ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getSnapshotObserver();
            L2507713026531741258 l2507713026531741258 = l8383256292871170816.A;
            snapshotObserver.a.d(h11725168162114556860, snapshotObserver.b, l2507713026531741258);
            r8000300579679385019.f = true;
            r8000300579679385019.g = true;
            boolean y = O4077903568229246.y(h11725168162114556860);
            T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
            if (y) {
                t8458668874796040341.w = true;
                t8458668874796040341.x = true;
            } else {
                t8458668874796040341.v = true;
            }
            r8000300579679385019.d = J4327291511168983093.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            H11725168162114556860 u = this.a.u();
            R8000300579679385019 r8000300579679385019 = u != null ? u.G : null;
            if (r8000300579679385019 != null) {
                int i3 = r8000300579679385019.l;
                if (i == 0) {
                    r8000300579679385019.d(i3 - 1);
                } else {
                    r8000300579679385019.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.f474o;
        this.f474o = i;
        if ((i2 == 0) != (i == 0)) {
            H11725168162114556860 u = this.a.u();
            R8000300579679385019 r8000300579679385019 = u != null ? u.G : null;
            if (r8000300579679385019 != null) {
                int i3 = r8000300579679385019.f474o;
                if (i == 0) {
                    r8000300579679385019.e(i3 - 1);
                } else {
                    r8000300579679385019.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.f474o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.f474o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.f474o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.f474o - 1);
            }
        }
    }

    public final void j() {
        T8458668874796040341 t8458668874796040341 = this.p;
        R8000300579679385019 r8000300579679385019 = t8458668874796040341.f;
        Object obj = t8458668874796040341.s;
        H11725168162114556860 h11725168162114556860 = this.a;
        if ((obj != null || r8000300579679385019.a().k() != null) && t8458668874796040341.r) {
            t8458668874796040341.r = false;
            t8458668874796040341.s = r8000300579679385019.a().k();
            H11725168162114556860 u = h11725168162114556860.u();
            if (u != null) {
                H11725168162114556860.W(u, false, 7);
            }
        }
        L8383256292871170816 l8383256292871170816 = this.q;
        if (l8383256292871170816 != null) {
            R8000300579679385019 r80003005796793850192 = l8383256292871170816.f;
            if (l8383256292871170816.y == null) {
                L5844152868342410893 c1 = r80003005796793850192.a().c1();
                c1.getClass();
                if (c1.u.k() == null) {
                    return;
                }
            }
            if (l8383256292871170816.x) {
                l8383256292871170816.x = false;
                L5844152868342410893 c12 = r80003005796793850192.a().c1();
                c12.getClass();
                l8383256292871170816.y = c12.u.k();
                if (O4077903568229246.y(h11725168162114556860)) {
                    H11725168162114556860 u2 = h11725168162114556860.u();
                    if (u2 != null) {
                        H11725168162114556860.W(u2, false, 7);
                        return;
                    }
                    return;
                }
                H11725168162114556860 u3 = h11725168162114556860.u();
                if (u3 != null) {
                    H11725168162114556860.U(u3, false, 7);
                }
            }
        }
    }
}
