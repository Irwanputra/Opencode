package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J1177206280180038194 extends K9754274840577282785 {
    public final J15049672055732829618 c;
    public int d;
    public V15316295198673619864 e;
    public int f;

    public J1177206280180038194(J15049672055732829618 j15049672055732829618, int i) {
        super(i, j15049672055732829618.h);
        this.c = j15049672055732829618;
        this.d = j15049672055732829618.j();
        this.f = -1;
        b();
    }

    public final void a() {
        if (this.d == this.c.j()) {
            return;
        }
        U15384774985926769650.c();
    }

    @Override // dev.epro.r0.K9754274840577282785, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.a;
        J15049672055732829618 j15049672055732829618 = this.c;
        j15049672055732829618.add(i, obj);
        this.a++;
        this.b = j15049672055732829618.a();
        this.d = j15049672055732829618.j();
        this.f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        J15049672055732829618 j15049672055732829618 = this.c;
        Object[] objArr = j15049672055732829618.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (j15049672055732829618.h - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (j15049672055732829618.d / 5) + 1;
        V15316295198673619864 v15316295198673619864 = this.e;
        if (v15316295198673619864 == null) {
            this.e = new V15316295198673619864(objArr, i2, i, i3);
            return;
        }
        v15316295198673619864.a = i2;
        v15316295198673619864.b = i;
        v15316295198673619864.c = i3;
        Object[] objArr2 = v15316295198673619864.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            v15316295198673619864.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        v15316295198673619864.e = r0;
        v15316295198673619864.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.a;
        this.f = i;
        V15316295198673619864 v15316295198673619864 = this.e;
        J15049672055732829618 j15049672055732829618 = this.c;
        if (v15316295198673619864 == null) {
            Object[] objArr = j15049672055732829618.g;
            this.a = i + 1;
            return objArr[i];
        }
        if (v15316295198673619864.hasNext()) {
            this.a++;
            return v15316295198673619864.next();
        }
        Object[] objArr2 = j15049672055732829618.g;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - v15316295198673619864.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        V15316295198673619864 v15316295198673619864 = this.e;
        J15049672055732829618 j15049672055732829618 = this.c;
        if (v15316295198673619864 == null) {
            Object[] objArr = j15049672055732829618.g;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = v15316295198673619864.b;
        if (i <= i3) {
            this.a = i - 1;
            return v15316295198673619864.previous();
        }
        Object[] objArr2 = j15049672055732829618.g;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // dev.epro.r0.K9754274840577282785, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f;
        if (i == -1) {
            Z3383101362411723454.r();
            return;
        }
        J15049672055732829618 j15049672055732829618 = this.c;
        j15049672055732829618.b(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = j15049672055732829618.a();
        this.d = j15049672055732829618.j();
        this.f = -1;
        b();
    }

    @Override // dev.epro.r0.K9754274840577282785, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f;
        if (i == -1) {
            Z3383101362411723454.r();
            return;
        }
        J15049672055732829618 j15049672055732829618 = this.c;
        j15049672055732829618.set(i, obj);
        this.d = j15049672055732829618.j();
        b();
    }
}
