package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class L8858318240788919753 implements Iterator, D14639766352081121636 {
    public final Y975470382943463598[] a;
    public int b;
    public boolean c = true;

    public L8858318240788919753(B14108412273878533248 b14108412273878533248, Y975470382943463598[] y975470382943463598Arr) {
        this.a = y975470382943463598Arr;
        y975470382943463598Arr[0].a(b14108412273878533248.d, Integer.bitCount(b14108412273878533248.a) * 2, 0);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        Y975470382943463598[] y975470382943463598Arr = this.a;
        Y975470382943463598 y975470382943463598 = y975470382943463598Arr[i];
        if (y975470382943463598.c < y975470382943463598.b) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                Y975470382943463598 y9754703829434635982 = y975470382943463598Arr[i];
                int i2 = y9754703829434635982.c;
                Object[] objArr = y9754703829434635982.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    y9754703829434635982.c = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                Y975470382943463598 y9754703829434635983 = y975470382943463598Arr[i - 1];
                int i3 = y9754703829434635983.c;
                int length2 = y9754703829434635983.a.length;
                y9754703829434635983.c = i3 + 1;
            }
            y975470382943463598Arr[i].a(B14108412273878533248.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        Y975470382943463598[] y975470382943463598Arr = this.a;
        Y975470382943463598 y975470382943463598 = y975470382943463598Arr[i];
        int i2 = y975470382943463598.c;
        if (i2 < y975470382943463598.b) {
            return i;
        }
        Object[] objArr = y975470382943463598.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        B14108412273878533248 b14108412273878533248 = (B14108412273878533248) obj;
        if (i == 6) {
            Y975470382943463598 y9754703829434635982 = y975470382943463598Arr[i + 1];
            Object[] objArr2 = b14108412273878533248.d;
            y9754703829434635982.a(objArr2, objArr2.length, 0);
        } else {
            y975470382943463598Arr[i + 1].a(b14108412273878533248.d, Integer.bitCount(b14108412273878533248.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            Z3383101362411723454.u();
            return null;
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
