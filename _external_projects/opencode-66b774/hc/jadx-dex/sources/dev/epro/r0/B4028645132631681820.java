package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B4028645132631681820 extends dev.epro.r0.H10977569097456317418 implements java.util.RandomAccess {
    public static final java.lang.Object[] d;
    public static final dev.epro.r0.B4028645132631681820 e;
    public java.lang.Object[] b;
    public int c;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        d = objArr;
        e = new dev.epro.r0.B4028645132631681820(objArr, 0, false);
    }

    public B4028645132631681820(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void add(int i, java.lang.Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Index:", i, this.c, ", Size:"));
            return;
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[dev.epro.r0.E12098517352909843120.g(length, 3, 2, 1, 10)];
            java.lang.System.arraycopy(this.b, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.c) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Index:", i, this.c, ", Size:"));
        }
    }

    public final /* bridge */ /* synthetic */ dev.epro.r0.K5888984147544128677 g(int i) {
        if (i >= this.c) {
            return new dev.epro.r0.B4028645132631681820(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        dev.epro.r0.K2042933864045806308.h();
        return null;
    }

    public final java.lang.Object get(int i) {
        b(i);
        return this.b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object remove(int i) {
        a();
        b(i);
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
        b(i);
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
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = java.util.Arrays.copyOf(this.b, dev.epro.r0.E12098517352909843120.g(length, 3, 2, 1, 10));
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
