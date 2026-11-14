package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8586442731552441025;
import dev.epro.r0.Z3383101362411723454;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ob3 extends AbstractMap {
    public volatile I8586442731552441025 d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;

    public final void a(int i) {
        Object[] objArr = this.a;
        if (objArr == null || objArr.length == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > objArr.length) {
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - 2147483639 > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            Z3383101362411723454.s();
            return false;
        }
        int i = this.b - 1;
        if (i < 0) {
            return false;
        }
        throw G6547577305291411977.m(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new I8586442731552441025(this, (byte) 1);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob3)) {
            return super.equals(obj);
        }
        ob3 ob3Var = (ob3) obj;
        int i = this.b;
        if (i == ob3Var.b) {
            Object[] objArr = this.a;
            Object[] objArr2 = ob3Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2].equals(objArr2[i2])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            Z3383101362411723454.s();
            return null;
        }
        int i = this.b - 1;
        if (i < 0) {
            return null;
        }
        throw G6547577305291411977.m(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.a[i3].hashCode();
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        a();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        boolean z = map instanceof ob3;
        int i = this.b;
        if (z) {
            ob3 ob3Var = (ob3) map;
            a(i + ob3Var.b);
            int i2 = this.b;
            if (i2 < ob3Var.b + i2) {
                throw G6547577305291411977.m(ob3Var.a[0]);
            }
            return;
        }
        a(map.size() + i);
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                Z3383101362411723454.s();
            } else {
                entry.getValue();
                a();
                throw null;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        if (obj != null) {
            Z3383101362411723454.s();
            return null;
        }
        int i = this.b - 1;
        if (i < 0) {
            return null;
        }
        throw G6547577305291411977.m(this.a[i >>> 1]);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b;
    }

    public final void a() {
        if (this.c) {
            Z3383101362411723454.t();
        }
    }
}
