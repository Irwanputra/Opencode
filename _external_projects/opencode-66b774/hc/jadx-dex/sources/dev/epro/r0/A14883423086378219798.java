package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A14883423086378219798 extends dev.epro.r0.V9316690655140275436 {
    public static final java.lang.Object[] l;
    public static final dev.epro.r0.A14883423086378219798 m;
    public final transient java.lang.Object[] g;
    public final transient int h;
    public final transient java.lang.Object[] i;
    public final transient int j;
    public final transient int k;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        l = objArr;
        m = new dev.epro.r0.A14883423086378219798(0, 0, 0, objArr, objArr);
    }

    public A14883423086378219798(int i, int i2, int i3, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        super((byte) 2);
        this.g = objArr;
        this.h = i;
        this.i = objArr2;
        this.j = i2;
        this.k = i3;
    }

    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        java.lang.Object[] objArr = this.i;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) java.lang.Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.j;
            java.lang.Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    public final int hashCode() {
        return this.h;
    }

    public final java.util.Iterator iterator() {
        dev.epro.r0.M3906571825257549980 m3906571825257549980 = ((dev.epro.r0.V9316690655140275436) this).e;
        if (m3906571825257549980 == null) {
            dev.epro.r0.N985323811900954496 n985323811900954496 = dev.epro.r0.J13319129656433893658.e;
            int i = this.k;
            m3906571825257549980 = i == 0 ? dev.epro.r0.M3906571825257549980.h : new dev.epro.r0.M3906571825257549980(i, this.g);
            ((dev.epro.r0.V9316690655140275436) this).e = m3906571825257549980;
        }
        return m3906571825257549980.r(0);
    }

    public final int j(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.g;
        int i = this.k;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int k() {
        return this.k;
    }

    public final int m() {
        return 0;
    }

    public final java.lang.Object[] o() {
        return this.g;
    }

    public final int size() {
        return this.k;
    }
}
