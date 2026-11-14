package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I938944866413167075 implements Iterator, D14639766352081121636 {
    public final Iterator a;
    public Iterator b;
    public byte c;
    public final /* synthetic */ B2664082256516729321 d;

    public I938944866413167075(B2664082256516729321 b2664082256516729321) {
        this.d = b2664082256516729321;
        this.a = ((U16443665883761795894) b2664082256516729321.b).iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.b;
        if (it2 != null && it2.hasNext()) {
            this.c = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.a;
            if (!it3.hasNext()) {
                this.c = (byte) 2;
                this.b = null;
                return false;
            }
            it = (Iterator) E12338935621460473980.h.invoke(this.d.c.invoke(it3.next()));
        } while (!it.hasNext());
        this.b = it;
        this.c = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.c;
        if (b == 2) {
            Z3383101362411723454.u();
            return null;
        }
        if (b == 0 && !a()) {
            Z3383101362411723454.u();
            return null;
        }
        this.c = (byte) 0;
        Iterator it = this.b;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
