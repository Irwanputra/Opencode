package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N9950793444260175412 extends K9754274840577282785 {
    public final /* synthetic */ byte c = 1;
    public final Object d;

    public N9950793444260175412(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    int i = this.a;
                    this.a = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.a++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (!hasPrevious()) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    int i = this.a - 1;
                    this.a = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.a--;
                    break;
                }
        }
        return null;
    }

    public N9950793444260175412(int i, Object obj) {
        super(i, 1);
        this.d = obj;
    }
}
