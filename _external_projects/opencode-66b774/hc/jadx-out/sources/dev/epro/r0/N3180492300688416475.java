package dev.epro.r0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N3180492300688416475 implements Iterator, R4833348786910499294, D14639766352081121636 {
    public byte a;
    public Object b;
    public R4833348786910499294 c;

    public final RuntimeException a() {
        byte b = this.a;
        if (b == 4) {
            return new NoSuchElementException();
        }
        if (b == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.a));
    }

    public final void c(R4833348786910499294 r4833348786910499294, Object obj) {
        this.b = obj;
        this.a = (byte) 3;
        this.c = r4833348786910499294;
        r4833348786910499294.getClass();
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return I3826119971291161142.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.a;
            if (b != 0) {
                break;
            }
            this.a = (byte) 5;
            R4833348786910499294 r4833348786910499294 = this.c;
            r4833348786910499294.getClass();
            this.c = null;
            r4833348786910499294.resumeWith(O9245300239821758723.a);
        }
        if (b == 1) {
            throw null;
        }
        if (b == 2 || b == 3) {
            return true;
        }
        if (b == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 0 || b == 1) {
            if (hasNext()) {
                return next();
            }
            Z3383101362411723454.u();
            return null;
        }
        if (b == 2) {
            this.a = (byte) 1;
            throw null;
        }
        if (b != 3) {
            throw a();
        }
        this.a = (byte) 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        E17665849472693074628.k(obj);
        this.a = (byte) 4;
    }
}
