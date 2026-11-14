package dev.epro.r0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A9403161892277650160 implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ O827298036535440209 d;

    public A9403161892277650160(O827298036535440209 o827298036535440209) {
        this.d = o827298036535440209;
        this.a = o827298036535440209.c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            S10973172697741180971.m("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            O827298036535440209 o827298036535440209 = this.d;
            if (S10823041268949770285.t(key, o827298036535440209.e(i)) && S10823041268949770285.t(entry.getValue(), o827298036535440209.h(this.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.e(this.b);
        }
        S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.h(this.b);
        }
        S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            S10973172697741180971.m("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.b;
        O827298036535440209 o827298036535440209 = this.d;
        Object e = o827298036535440209.e(i);
        Object h = o827298036535440209.h(this.b);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            Z3383101362411723454.r();
            return;
        }
        this.d.f(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.g(this.b, obj);
        }
        S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
