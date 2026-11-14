package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16505841721158300488 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ T5910761665012682387 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ T5910761665012682387 f;

    public I16505841721158300488(T5910761665012682387 t5910761665012682387, byte b) {
        this.e = b;
        this.f = t5910761665012682387;
        this.d = t5910761665012682387;
        this.a = t5910761665012682387.e;
        this.b = t5910761665012682387.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object l12016659735899535396;
        T5910761665012682387 t5910761665012682387 = this.d;
        if (t5910761665012682387.e != this.a) {
            U15384774985926769650.c();
            return null;
        }
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.b;
        this.c = i;
        byte b = this.e;
        T5910761665012682387 t59107616650126823872 = this.f;
        switch (b) {
            case 0:
                l12016659735899535396 = t59107616650126823872.i()[i];
                break;
            case 1:
                l12016659735899535396 = new L12016659735899535396(t59107616650126823872, i);
                break;
            default:
                l12016659735899535396 = t59107616650126823872.j()[i];
                break;
        }
        int i2 = this.b + 1;
        if (i2 >= t5910761665012682387.f) {
            i2 = -1;
        }
        this.b = i2;
        return l12016659735899535396;
    }

    @Override // java.util.Iterator
    public final void remove() {
        T5910761665012682387 t5910761665012682387 = this.d;
        if (t5910761665012682387.e != this.a) {
            U15384774985926769650.c();
            return;
        }
        U15853425786981391261.C("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        int i = this.c;
        Object obj = T5910761665012682387.j;
        t5910761665012682387.remove(t5910761665012682387.i()[i]);
        this.b--;
        this.c = -1;
    }
}
