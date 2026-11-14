package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G2215898220892222614 implements Iterator, D14639766352081121636 {
    public final /* synthetic */ byte a = 2;
    public final Iterator b;
    public int c;

    public G2215898220892222614(M1986501868727531892 m1986501868727531892) {
        this.c = m1986501868727531892.b;
        this.b = m1986501868727531892.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Iterator it = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new B8690326337663253179(i, it.next());
                }
                K5751602218013079365.f0();
                throw null;
            default:
                int i2 = this.c;
                if (i2 != 0) {
                    this.c = i2 - 1;
                    return it.next();
                }
                Z3383101362411723454.u();
                return null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public G2215898220892222614(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public G2215898220892222614(Y11282557324216517430 y11282557324216517430) {
        this.b = y11282557324216517430.a.iterator();
        this.c = y11282557324216517430.b;
    }
}
