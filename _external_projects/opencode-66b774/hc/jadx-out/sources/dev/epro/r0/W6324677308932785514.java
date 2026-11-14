package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W6324677308932785514 extends K9754274840577282785 {
    public final Object[] c;
    public final V15316295198673619864 d;

    public W6324677308932785514(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new V15316295198673619864(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        V15316295198673619864 v15316295198673619864 = this.d;
        if (v15316295198673619864.hasNext()) {
            this.a++;
            return v15316295198673619864.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - v15316295198673619864.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.a;
        V15316295198673619864 v15316295198673619864 = this.d;
        int i2 = v15316295198673619864.b;
        if (i <= i2) {
            this.a = i - 1;
            return v15316295198673619864.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
