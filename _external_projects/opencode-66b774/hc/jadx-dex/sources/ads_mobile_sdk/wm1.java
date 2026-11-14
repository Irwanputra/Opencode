package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wm1 extends ads_mobile_sdk.j implements dev.epro.r0.U12378827310912896889, java.util.RandomAccess, dev.epro.r0.Y16198579552193879165 {
    public static final long[] d;
    public static final ads_mobile_sdk.wm1 e;
    public long[] b;
    public int c;

    static {
        long[] jArr = new long[0];
        d = jArr;
        e = new ads_mobile_sdk.wm1(jArr, 0, false);
    }

    public wm1(long[] jArr, int i, boolean z) {
        super(z);
        this.b = jArr;
        this.c = i;
    }

    public final void a(long j) {
        a$1();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            jArr = new long[dev.epro.r0.V16504496955554646429.a(jArr.length)];
            java.lang.System.arraycopy(this.b, 0, jArr, 0, this.c);
            this.b = jArr;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        jArr[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        a$1();
        if (i < 0 || i > (i2 = this.c)) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Index:", i, this.c, ", Size:"));
            return;
        }
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[dev.epro.r0.V16504496955554646429.a(jArr.length)];
            java.lang.System.arraycopy(this.b, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = jLongValue;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        a$1();
        byte[] bArr = ads_mobile_sdk.rb1.a;
        collection.getClass();
        if (!(collection instanceof ads_mobile_sdk.wm1)) {
            return super.addAll(collection);
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) collection;
        int i = wm1Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArrCopyOf = this.b;
        if (i3 > jArrCopyOf.length) {
            jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i3);
            this.b = jArrCopyOf;
        }
        java.lang.System.arraycopy(wm1Var.b, 0, jArrCopyOf, this.c, wm1Var.c);
        this.c = i3;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("Index:", i, this.c, ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ads_mobile_sdk.wm1 a(int i) {
        if (i >= this.c) {
            return new ads_mobile_sdk.wm1(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        dev.epro.r0.K2042933864045806308.h();
        return null;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.wm1)) {
            return super.equals(obj);
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) obj;
        if (this.c == wm1Var.c) {
            long[] jArr = wm1Var.b;
            for (int i = 0; i < this.c; i++) {
                if (this.b[i] == jArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        c(i);
        return java.lang.Long.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            byte[] bArr = ads_mobile_sdk.rb1.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        a$1();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a$1();
        if (i2 < i) {
            dev.epro.r0.W4415201450379021245.a("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.b;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        a$1();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a(((java.lang.Long) obj).longValue());
        return true;
    }
}
