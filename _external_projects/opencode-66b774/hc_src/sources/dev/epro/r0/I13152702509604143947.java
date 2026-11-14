package dev.epro.r0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I13152702509604143947 implements ListIterator, D14639766352081121636 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public I13152702509604143947(A10468597346719636873 a10468597346719636873, int i) {
        this.c = a10468597346719636873;
        List list = (List) a10468597346719636873.b;
        if (i >= 0 && i <= a10468597346719636873.a()) {
            this.b = list.listIterator(a10468597346719636873.a() - i);
            return;
        }
        StringBuilder q = E12098517352909843120.q(i, "Position index ", " must be in range [");
        q.append(new P8646985343900033725(0, a10468597346719636873.a(), 1));
        q.append("].");
        throw new IndexOutOfBoundsException(q.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((A8284336046188466534) obj).a < ((X4685569590240598738) this.c).d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((A8284336046188466534) obj).a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                A8284336046188466534 a8284336046188466534 = (A8284336046188466534) obj;
                int i = a8284336046188466534.a + 1;
                X4685569590240598738 x4685569590240598738 = (X4685569590240598738) this.c;
                E3422549137300678133.e0(i, x4685569590240598738.d);
                a8284336046188466534.a = i;
                return x4685569590240598738.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                A10468597346719636873 a10468597346719636873 = (A10468597346719636873) this.c;
                return (a10468597346719636873.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((A8284336046188466534) obj).a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                A8284336046188466534 a8284336046188466534 = (A8284336046188466534) obj;
                int i = a8284336046188466534.a;
                X4685569590240598738 x4685569590240598738 = (X4685569590240598738) this.c;
                E3422549137300678133.e0(i, x4685569590240598738.d);
                a8284336046188466534.a = i - 1;
                return x4685569590240598738.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                A10468597346719636873 a10468597346719636873 = (A10468597346719636873) this.c;
                return (a10468597346719636873.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((A8284336046188466534) obj).a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public I13152702509604143947(A8284336046188466534 a8284336046188466534, X4685569590240598738 x4685569590240598738) {
        this.b = a8284336046188466534;
        this.c = x4685569590240598738;
    }
}
