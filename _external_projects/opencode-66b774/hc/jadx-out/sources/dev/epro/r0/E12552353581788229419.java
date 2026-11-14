package dev.epro.r0;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E12552353581788229419 implements ListIterator, D14639766352081121636 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public E12552353581788229419(R5670552972627103399 r5670552972627103399, int i) {
        this.a = (byte) 3;
        this.e = r5670552972627103399;
        this.b = i - 1;
        this.c = -1;
        this.d = E3422549137300678133.T(r5670552972627103399);
    }

    public void a() {
        if (((AbstractList) ((R15533989166562977617) this.e).e).modCount == this.d) {
            return;
        }
        U15384774985926769650.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                R15533989166562977617 r15533989166562977617 = (R15533989166562977617) obj2;
                int i = this.b;
                this.b = i + 1;
                r15533989166562977617.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) r15533989166562977617).modCount;
                return;
            case 2:
                b();
                G9506192477171422664 g9506192477171422664 = (G9506192477171422664) obj2;
                int i2 = this.b;
                this.b = i2 + 1;
                g9506192477171422664.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) g9506192477171422664).modCount;
                return;
            default:
                c();
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj2;
                r5670552972627103399.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = E3422549137300678133.T(r5670552972627103399);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((G9506192477171422664) this.e)).modCount == this.d) {
            return;
        }
        U15384774985926769650.c();
    }

    public void c() {
        if (E3422549137300678133.T((R5670552972627103399) this.e) == this.d) {
            return;
        }
        U15384774985926769650.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (this.b < this.d) {
                }
                break;
            case 1:
                if (this.b < ((R15533989166562977617) obj).c) {
                }
                break;
            case 2:
                if (this.b < ((G9506192477171422664) obj).b) {
                }
                break;
            default:
                if (this.b < ((R5670552972627103399) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                }
                break;
            case 1:
                if (this.b > 0) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                U9803441765912152712 u9803441765912152712 = ((Z12993664435766561681) obj).a;
                int i = this.b;
                this.b = i + 1;
                Object objF = u9803441765912152712.f(i);
                objF.getClass();
                return (R15896830329318850690) objF;
            case 1:
                a();
                int i2 = this.b;
                R15533989166562977617 r15533989166562977617 = (R15533989166562977617) obj;
                if (i2 >= r15533989166562977617.c) {
                    Z3383101362411723454.u();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                return r15533989166562977617.a[r15533989166562977617.b + i2];
            case 2:
                b();
                int i3 = this.b;
                G9506192477171422664 g9506192477171422664 = (G9506192477171422664) obj;
                if (i3 >= g9506192477171422664.b) {
                    Z3383101362411723454.u();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return g9506192477171422664.a[i3];
            default:
                c();
                int i4 = this.b + 1;
                this.c = i4;
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj;
                E3422549137300678133.e0(i4, r5670552972627103399.size());
                Object obj2 = r5670552972627103399.get(i4);
                this.b = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                U9803441765912152712 u9803441765912152712 = ((Z12993664435766561681) obj).a;
                int i = this.b - 1;
                this.b = i;
                Object objF = u9803441765912152712.f(i);
                objF.getClass();
                return (R15896830329318850690) objF;
            case 1:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    Z3383101362411723454.u();
                    return null;
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                R15533989166562977617 r15533989166562977617 = (R15533989166562977617) obj;
                return r15533989166562977617.a[r15533989166562977617.b + i3];
            case 2:
                b();
                int i4 = this.b;
                if (i4 <= 0) {
                    Z3383101362411723454.u();
                    return null;
                }
                int i5 = i4 - 1;
                this.b = i5;
                this.c = i5;
                return ((G9506192477171422664) obj).a[i5];
            default:
                c();
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj;
                E3422549137300678133.e0(this.b, r5670552972627103399.size());
                int i6 = this.b;
                this.c = i6;
                this.b--;
                return r5670552972627103399.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                R15533989166562977617 r15533989166562977617 = (R15533989166562977617) obj;
                a();
                int i = this.c;
                if (i == -1) {
                    S10973172697741180971.m("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                r15533989166562977617.b(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) r15533989166562977617).modCount;
                return;
            case 2:
                G9506192477171422664 g9506192477171422664 = (G9506192477171422664) obj;
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    S10973172697741180971.m("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                g9506192477171422664.b(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) g9506192477171422664).modCount;
                return;
            default:
                c();
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj;
                r5670552972627103399.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = E3422549137300678133.T(r5670552972627103399);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.c;
                if (i != -1) {
                    ((R15533989166562977617) obj2).set(i, obj);
                    return;
                } else {
                    S10973172697741180971.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((G9506192477171422664) obj2).set(i2, obj);
                    return;
                } else {
                    S10973172697741180971.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                R5670552972627103399 r5670552972627103399 = (R5670552972627103399) obj2;
                c();
                int i3 = this.c;
                if (i3 < 0) {
                    S10973172697741180971.m("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    r5670552972627103399.set(i3, obj);
                    this.d = E3422549137300678133.T(r5670552972627103399);
                    return;
                }
        }
    }

    public E12552353581788229419(G9506192477171422664 g9506192477171422664, int i) {
        this.a = (byte) 2;
        this.e = g9506192477171422664;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) g9506192477171422664).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E12552353581788229419(Z12993664435766561681 z12993664435766561681, int i, int i2) {
        this(z12993664435766561681, (i2 & 1) != 0 ? 0 : i, 0, z12993664435766561681.a.b);
        this.a = (byte) 0;
    }

    public E12552353581788229419(Z12993664435766561681 z12993664435766561681, int i, int i2, int i3) {
        this.a = (byte) 0;
        this.e = z12993664435766561681;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public E12552353581788229419(R15533989166562977617 r15533989166562977617, int i) {
        this.a = (byte) 1;
        this.e = r15533989166562977617;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) r15533989166562977617).modCount;
    }
}
