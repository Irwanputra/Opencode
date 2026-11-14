package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D389890677992184566 implements java.util.RandomAccess {
    public java.lang.Object[] a;
    public dev.epro.r0.K7217096618580727896 b;
    public int c;

    public D389890677992184566(int i, java.lang.Object[] objArr) {
        this.a = objArr;
        this.c = i;
    }

    public final void a(int i, java.lang.Object obj) {
        int i2 = this.c + 1;
        if (this.a.length < i2) {
            o(i2);
        }
        java.lang.Object[] objArr = this.a;
        int i3 = this.c;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.c++;
    }

    public final void b(java.lang.Object obj) {
        int i = this.c + 1;
        if (this.a.length < i) {
            o(i);
        }
        java.lang.Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj;
        this.c = i2 + 1;
    }

    public final void c(int i, dev.epro.r0.D389890677992184566 d389890677992184566) {
        int i2 = d389890677992184566.c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.c + i2;
        if (this.a.length < i3) {
            o(i3);
        }
        java.lang.Object[] objArr = this.a;
        int i4 = this.c;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        java.lang.System.arraycopy(d389890677992184566.a, 0, objArr, i, i2);
        this.c += i2;
    }

    public final void d(int i, java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.c + size;
        if (this.a.length < i2) {
            o(i2);
        }
        java.lang.Object[] objArr = this.a;
        int i3 = this.c;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.c += size;
    }

    public final boolean e(int i, java.util.Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.c + size;
        if (this.a.length < i3) {
            o(i3);
        }
        java.lang.Object[] objArr = this.a;
        int i4 = this.c;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (java.lang.Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                dev.epro.r0.K5751602218013079365.f0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.c += size;
        return true;
    }

    public final java.util.List f() {
        dev.epro.r0.K7217096618580727896 k7217096618580727896 = this.b;
        if (k7217096618580727896 != null) {
            return k7217096618580727896;
        }
        dev.epro.r0.K7217096618580727896 k72170966185807278962 = new dev.epro.r0.K7217096618580727896(this, (byte) 1);
        this.b = k72170966185807278962;
        return k72170966185807278962;
    }

    public final void i() {
        java.lang.Object[] objArr = this.a;
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.c = 0;
    }

    public final boolean j(java.lang.Object obj) {
        int i = this.c - 1;
        if (i >= 0) {
            for (int i2 = 0; !dev.epro.r0.S10823041268949770285.t(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int k(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (dev.epro.r0.S10823041268949770285.t(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean l(java.lang.Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        m(iK);
        return true;
    }

    public final java.lang.Object m(int i) {
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i];
        int i2 = this.c;
        if (i != i2 - 1) {
            int i3 = i + 1;
            java.lang.System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.c - 1;
        this.c = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > i) {
            int i3 = this.c;
            if (i2 < i3) {
                java.lang.Object[] objArr = this.a;
                java.lang.System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.c;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.c = i5;
        }
    }

    public final void o(int i) {
        java.lang.Object[] objArr = this.a;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, length * 2)];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }
}
