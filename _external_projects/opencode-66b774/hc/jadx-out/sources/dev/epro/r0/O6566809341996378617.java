package dev.epro.r0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O6566809341996378617 implements Map.Entry, F10586287370236042155 {
    public final H6457936572911484476 a;
    public final int b;
    public final int c;

    public O6566809341996378617(H6457936572911484476 h6457936572911484476, int i) {
        this.a = h6457936572911484476;
        this.b = i;
        this.c = h6457936572911484476.h;
    }

    public final void a() {
        if (this.a.h != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return S10823041268949770285.t(entry.getKey(), getKey()) && S10823041268949770285.t(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.b;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        H6457936572911484476 h6457936572911484476 = this.a;
        h6457936572911484476.c();
        Object[] objArr = h6457936572911484476.b;
        if (objArr == null) {
            int length = h6457936572911484476.a.length;
            if (length < 0) {
                S10973172697741180971.j("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            h6457936572911484476.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
