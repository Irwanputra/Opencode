package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Z1085125311131623997 implements Iterator, D14639766352081121636 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;

    public Z1085125311131623997(Object[] objArr) {
        this.a = (byte) 2;
        objArr.getClass();
        this.c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b < ((L17338558938414325155) obj).a()) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.b < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.b < ((E8321115364184429049) obj).d()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    Z3383101362411723454.u();
                    return null;
                }
                int i = this.b;
                this.b = i + 1;
                return ((L17338558938414325155) obj).get(i);
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return Byte.valueOf(((byte[]) obj)[i2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    K2042933864045806308.n(e.getMessage());
                    return null;
                }
            case 2:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.b--;
                    K2042933864045806308.n(e2.getMessage());
                    return null;
                }
            default:
                int i4 = this.b;
                this.b = i4 + 1;
                return ((E8321115364184429049) obj).e(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ Z1085125311131623997(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }
}
