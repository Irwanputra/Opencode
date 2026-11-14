package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A16630659125393700025 extends dev.epro.r0.R5425141374325592367 {
    public static final dev.epro.r0.A16630659125393700025 d;
    public java.lang.Object[] b;
    public int c;

    static {
        dev.epro.r0.A16630659125393700025 a16630659125393700025 = new dev.epro.r0.A16630659125393700025(0, new java.lang.Object[0]);
        d = a16630659125393700025;
        ((dev.epro.r0.R5425141374325592367) a16630659125393700025).a = false;
    }

    public A16630659125393700025(int i, java.lang.Object[] objArr) {
        this.b = objArr;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, java.lang.Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            dev.epro.r0.D11988991656201568495.i(this.c, dev.epro.r0.E12098517352909843120.q(i, "Index:", ", Size:"));
            return;
        }
        java.lang.Object[] objArr = this.b;
        if (i2 < objArr.length) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    public final dev.epro.r0.R5425141374325592367 b(int i) {
        if (i >= this.c) {
            return new dev.epro.r0.A16630659125393700025(this.c, java.util.Arrays.copyOf(this.b, i));
        }
        dev.epro.r0.K2042933864045806308.h();
        return null;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            dev.epro.r0.D11988991656201568495.i(this.c, dev.epro.r0.E12098517352909843120.q(i, "Index:", ", Size:"));
        }
    }

    public final java.lang.Object get(int i) {
        c(i);
        return this.b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object remove(int i) {
        a();
        c(i);
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object set(int i, java.lang.Object obj) {
        a();
        c(i);
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    public final int size() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean add(java.lang.Object obj) {
        a();
        int i = this.c;
        java.lang.Object[] objArrCopyOf = this.b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
