package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M7968841747429118896 implements Iterator, D14639766352081121636 {
    public final Iterator b;
    public Object d;
    public final /* synthetic */ U16443665883761795894 e;
    public final /* synthetic */ byte a = 1;
    public int c = -1;

    public M7968841747429118896(B2664082256516729321 b2664082256516729321) {
        this.e = b2664082256516729321;
        this.b = ((U16443665883761795894) b2664082256516729321.b).iterator();
    }

    public void a() {
        Object next;
        E4880248942576735123 e4880248942576735123 = (E4880248942576735123) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) e4880248942576735123.c.invoke(next)).booleanValue() != e4880248942576735123.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((B2664082256516729321) this.e).c.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 1) {
                }
                break;
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    Z3383101362411723454.u();
                } else {
                    Object obj = this.d;
                    this.d = null;
                    this.c = -1;
                }
                break;
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    Z3383101362411723454.u();
                } else {
                    Object obj2 = this.d;
                    this.d = null;
                    this.c = -1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public M7968841747429118896(E4880248942576735123 e4880248942576735123) {
        this.e = e4880248942576735123;
        this.b = e4880248942576735123.a.iterator();
    }
}
