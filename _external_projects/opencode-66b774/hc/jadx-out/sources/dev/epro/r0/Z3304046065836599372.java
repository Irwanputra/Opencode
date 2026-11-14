package dev.epro.r0;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z3304046065836599372 implements Iterator, D14639766352081121636 {
    public byte a;
    public Object b;
    public final Iterator c;
    public final F4096073349764486348 d;
    public final HashSet e;

    public Z3304046065836599372(Iterator it, F4096073349764486348 f4096073349764486348) {
        it.getClass();
        this.c = it;
        this.d = f4096073349764486348;
        this.e = new HashSet();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = (byte) 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.e.add(this.d.invoke(next)));
        this.b = next;
        this.a = (byte) 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        if (b == 0) {
            this.a = (byte) 3;
            a();
            return this.a == 1;
        }
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        S10973172697741180971.j("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        if (b == 1) {
            this.a = (byte) 0;
            return this.b;
        }
        if (b != 2) {
            this.a = (byte) 3;
            a();
            if (this.a == 1) {
                this.a = (byte) 0;
                return this.b;
            }
        }
        Z3383101362411723454.u();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
