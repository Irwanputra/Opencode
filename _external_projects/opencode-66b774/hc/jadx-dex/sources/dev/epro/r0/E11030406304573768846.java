package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E11030406304573768846 extends java.util.AbstractMap {
    public static final /* synthetic */ int g = 0;
    public java.lang.Object[] a;
    public int b;
    public java.util.Map c;
    public boolean d;
    public volatile dev.epro.r0.I8586442731552441025 e;
    public java.util.Map f;

    public E11030406304573768846() {
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        this.c = map;
        this.f = map;
    }

    public final java.util.Set a() {
        return this.c.isEmpty() ? java.util.Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        g();
        int iD = d(comparable);
        if (iD >= 0) {
            return ((dev.epro.r0.L16776831627675862909) this.a[iD]).setValue(obj);
        }
        g();
        java.lang.Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new java.lang.Object[16];
            this.a = objArr;
        }
        int i = -(iD + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.b == 16) {
            dev.epro.r0.L16776831627675862909 l16776831627675862909 = (dev.epro.r0.L16776831627675862909) objArr[15];
            this.b = 15;
            f().put(l16776831627675862909.a, l16776831627675862909.b);
        }
        java.lang.Object[] objArr2 = this.a;
        int length = objArr2.length;
        java.lang.System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.a[i] = new dev.epro.r0.L16776831627675862909(this, comparable, obj);
        this.b++;
        return null;
    }

    public final dev.epro.r0.L16776831627675862909 c(int i) {
        if (i < this.b) {
            return (dev.epro.r0.L16776831627675862909) this.a[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return d(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final int d(java.lang.Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((dev.epro.r0.L16776831627675862909) this.a[i2]).a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((dev.epro.r0.L16776831627675862909) this.a[i4]).a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final java.lang.Object e(int i) {
        g();
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = ((dev.epro.r0.L16776831627675862909) objArr[i]).b;
        java.lang.System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            java.util.Iterator it = f().entrySet().iterator();
            java.lang.Object[] objArr2 = this.a;
            int i2 = this.b;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objArr2[i2] = new dev.epro.r0.L16776831627675862909(this, (java.lang.Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.e == null) {
            this.e = new dev.epro.r0.I8586442731552441025(this, (byte) 3);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E11030406304573768846)) {
            return super.equals(obj);
        }
        dev.epro.r0.E11030406304573768846 e11030406304573768846 = (dev.epro.r0.E11030406304573768846) obj;
        int size = size();
        if (size == e11030406304573768846.size()) {
            int i = this.b;
            if (i != e11030406304573768846.b) {
                return entrySet().equals(e11030406304573768846.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (c(i2).equals(e11030406304573768846.c(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(e11030406304573768846.c);
            }
            return true;
        }
        return false;
    }

    public final java.util.SortedMap f() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.c;
    }

    public final void g() {
        if (this.d) {
            dev.epro.r0.Z3383101362411723454.t();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iD = d(comparable);
        return iD >= 0 ? ((dev.epro.r0.L16776831627675862909) this.a[iD]).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        g();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            return e(iD);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
