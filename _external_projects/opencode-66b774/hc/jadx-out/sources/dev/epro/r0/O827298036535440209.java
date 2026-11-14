package dev.epro.r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O827298036535440209 extends W929662112881511578 implements Map {
    public I8586442731552441025 d;
    public G3918396620323029008 e;
    public Z13445346151515234775 f;

    @Override // java.util.Map
    public final Set entrySet() {
        I8586442731552441025 i8586442731552441025 = this.d;
        if (i8586442731552441025 != null) {
            return i8586442731552441025;
        }
        I8586442731552441025 i85864427315524410252 = new I8586442731552441025(this, (byte) 0);
        this.d = i85864427315524410252;
        return i85864427315524410252;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        G3918396620323029008 g3918396620323029008 = this.e;
        if (g3918396620323029008 != null) {
            return g3918396620323029008;
        }
        G3918396620323029008 g39183966203230290082 = new G3918396620323029008(this);
        this.e = g39183966203230290082;
        return g39183966203230290082;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        if (iArr.length < size) {
            this.a = Arrays.copyOf(iArr, size);
            this.b = Arrays.copyOf(this.b, size * 2);
        }
        if (this.c != i) {
            U15384774985926769650.c();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        Z13445346151515234775 z13445346151515234775 = this.f;
        if (z13445346151515234775 != null) {
            return z13445346151515234775;
        }
        Z13445346151515234775 z134453461515152347752 = new Z13445346151515234775(this);
        this.f = z134453461515152347752;
        return z134453461515152347752;
    }
}
