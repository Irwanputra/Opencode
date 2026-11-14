package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L622219180424329983 implements Iterator {
    public S8064361206571326475 a;
    public S8064361206571326475 b = null;
    public int c;
    public final /* synthetic */ H14305894327539119220 d;
    public final /* synthetic */ byte e;

    public L622219180424329983(H14305894327539119220 h14305894327539119220, byte b) {
        this.e = b;
        this.d = h14305894327539119220;
        this.a = h14305894327539119220.f.d;
        this.c = h14305894327539119220.e;
    }

    public final S8064361206571326475 a() {
        S8064361206571326475 s8064361206571326475 = this.a;
        H14305894327539119220 h14305894327539119220 = this.d;
        if (s8064361206571326475 == h14305894327539119220.f) {
            Z3383101362411723454.u();
            return null;
        }
        if (h14305894327539119220.e != this.c) {
            U15384774985926769650.c();
            return null;
        }
        this.a = s8064361206571326475.d;
        this.b = s8064361206571326475;
        return s8064361206571326475;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return a();
            default:
                return a().f;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        S8064361206571326475 s8064361206571326475 = this.b;
        if (s8064361206571326475 == null) {
            Z3383101362411723454.r();
            return;
        }
        H14305894327539119220 h14305894327539119220 = this.d;
        h14305894327539119220.c(s8064361206571326475, true);
        this.b = null;
        this.c = h14305894327539119220.e;
    }
}
