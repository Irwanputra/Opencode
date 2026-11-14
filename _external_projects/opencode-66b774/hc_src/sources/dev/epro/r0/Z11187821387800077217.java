package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Z11187821387800077217 extends L8858318240788919753 {
    public final D13190160240050003111 d;
    public Object e;
    public boolean f;
    public int g;

    public Z11187821387800077217(D13190160240050003111 d13190160240050003111, Y975470382943463598[] y975470382943463598Arr) {
        super(d13190160240050003111.b, y975470382943463598Arr);
        this.d = d13190160240050003111;
        this.g = d13190160240050003111.d;
    }

    public final void c(int i, B14108412273878533248 b14108412273878533248, Object obj, int i2) {
        int i3 = i2 * 5;
        Y975470382943463598[] y975470382943463598Arr = this.a;
        if (i3 <= 30) {
            int k = 1 << T8598786036980488824.k(i, i3);
            if (b14108412273878533248.h(k)) {
                y975470382943463598Arr[i2].a(b14108412273878533248.d, Integer.bitCount(b14108412273878533248.a) * 2, b14108412273878533248.f(k));
                this.b = i2;
                return;
            } else {
                int t = b14108412273878533248.t(k);
                B14108412273878533248 s = b14108412273878533248.s(t);
                y975470382943463598Arr[i2].a(b14108412273878533248.d, Integer.bitCount(b14108412273878533248.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        Y975470382943463598 y975470382943463598 = y975470382943463598Arr[i2];
        Object[] objArr = b14108412273878533248.d;
        y975470382943463598.a(objArr, objArr.length, 0);
        while (true) {
            Y975470382943463598 y9754703829434635982 = y975470382943463598Arr[i2];
            if (S10823041268949770285.t(y9754703829434635982.a[y9754703829434635982.c], obj)) {
                this.b = i2;
                return;
            } else {
                y975470382943463598Arr[i2].c += 2;
            }
        }
    }

    @Override // dev.epro.r0.L8858318240788919753, java.util.Iterator
    public final Object next() {
        if (this.d.d != this.g) {
            U15384774985926769650.c();
            return null;
        }
        if (!this.c) {
            Z3383101362411723454.u();
            return null;
        }
        Y975470382943463598 y975470382943463598 = this.a[this.b];
        this.e = y975470382943463598.a[y975470382943463598.c];
        this.f = true;
        return super.next();
    }

    @Override // dev.epro.r0.L8858318240788919753, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            Z3383101362411723454.r();
            return;
        }
        boolean z = this.c;
        D13190160240050003111 d13190160240050003111 = this.d;
        if (!z) {
            V12319504402545346730.r(d13190160240050003111).remove(this.e);
        } else {
            if (!z) {
                Z3383101362411723454.u();
                return;
            }
            Y975470382943463598 y975470382943463598 = this.a[this.b];
            Object obj = y975470382943463598.a[y975470382943463598.c];
            V12319504402545346730.r(d13190160240050003111).remove(this.e);
            c(obj != null ? obj.hashCode() : 0, d13190160240050003111.b, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.g = d13190160240050003111.d;
    }
}
