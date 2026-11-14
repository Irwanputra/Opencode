package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class in2 extends ads_mobile_sdk.j implements java.util.RandomAccess, java.io.Serializable {
    public static final java.lang.Object[] d;
    public static final ads_mobile_sdk.in2 e;
    public java.lang.Object[] b;
    public int c;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        d = objArr;
        e = new ads_mobile_sdk.in2(objArr, 0, false);
    }

    public in2(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    public final dev.epro.r0.O6641393078261985068 a(int i) {
        if (i >= this.c) {
            return new ads_mobile_sdk.in2(i == 0 ? d : java.util.Arrays.copyOf(this.b, i), this.c, true);
        }
        dev.epro.r0.K2042933864045806308.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        a$1();
        if (i < 0 || i > (i2 = this.c)) {
            dev.epro.r0.W4415201450379021245.a(c(i));
            return;
        }
        java.lang.Object[] objArr = this.b;
        if (i2 < objArr.length) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[dev.epro.r0.V16504496955554646429.a(objArr.length)];
            java.lang.System.arraycopy(this.b, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    public final java.lang.String c(int i) {
        return dev.epro.r0.E12098517352909843120.l("Index:", i, this.c, ", Size:");
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (!(obj instanceof java.util.RandomAccess)) {
                return super.equals(obj);
            }
            java.util.List list = (java.util.List) obj;
            int i = this.c;
            if (i == list.size()) {
                if (!(obj instanceof ads_mobile_sdk.in2)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.b[i2].equals(list.get(i2))) {
                        }
                    }
                    return true;
                }
                ads_mobile_sdk.in2 in2Var = (ads_mobile_sdk.in2) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.b[i3].equals(in2Var.b[i3])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i];
        }
        dev.epro.r0.W4415201450379021245.a(c(i));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.b[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // ads_mobile_sdk.j, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        int i2;
        a$1();
        if (i < 0 || i >= (i2 = this.c)) {
            dev.epro.r0.W4415201450379021245.a(c(i));
            return null;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        a$1();
        if (i < 0 || i >= this.c) {
            dev.epro.r0.W4415201450379021245.a(c(i));
            return null;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a$1();
        int i = this.c;
        java.lang.Object[] objArrCopyOf = this.b;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = java.util.Arrays.copyOf(this.b, dev.epro.r0.V16504496955554646429.a(objArrCopyOf.length));
            this.b = objArrCopyOf;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
