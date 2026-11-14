package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X5270663186006261488 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ U5420740526844651015 d;

    public X5270663186006261488(U5420740526844651015 u5420740526844651015) {
        this.d = u5420740526844651015;
        this.a = u5420740526844651015.d;
        this.b = u5420740526844651015.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        U5420740526844651015 u5420740526844651015 = this.d;
        if (u5420740526844651015.d != this.a) {
            U15384774985926769650.c();
            return null;
        }
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.b;
        this.c = i;
        Object obj = u5420740526844651015.i()[i];
        int i2 = this.b + 1;
        if (i2 >= u5420740526844651015.e) {
            i2 = -1;
        }
        this.b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        U5420740526844651015 u5420740526844651015 = this.d;
        if (u5420740526844651015.d != this.a) {
            U15384774985926769650.c();
            return;
        }
        U15853425786981391261.C("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        u5420740526844651015.remove(u5420740526844651015.i()[this.c]);
        this.b--;
        this.c = -1;
    }
}
