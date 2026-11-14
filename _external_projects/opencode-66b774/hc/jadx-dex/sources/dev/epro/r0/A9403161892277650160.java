package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9403161892277650160 implements java.util.Iterator, java.util.Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ dev.epro.r0.O827298036535440209 d;

    public A9403161892277650160(dev.epro.r0.O827298036535440209 o827298036535440209) {
        this.d = o827298036535440209;
        this.a = ((dev.epro.r0.W929662112881511578) o827298036535440209).c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.c) {
            dev.epro.r0.S10973172697741180971.m("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            int i = this.b;
            dev.epro.r0.O827298036535440209 o827298036535440209 = this.d;
            if (dev.epro.r0.S10823041268949770285.t(key, o827298036535440209.e(i)) && dev.epro.r0.S10823041268949770285.t(entry.getValue(), o827298036535440209.h(this.b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.c) {
            return this.d.e(this.b);
        }
        dev.epro.r0.S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.c) {
            return this.d.h(this.b);
        }
        dev.epro.r0.S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            dev.epro.r0.S10973172697741180971.m("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.b;
        dev.epro.r0.O827298036535440209 o827298036535440209 = this.d;
        java.lang.Object objE = o827298036535440209.e(i);
        java.lang.Object objH = o827298036535440209.h(this.b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            dev.epro.r0.Z3383101362411723454.u();
            return null;
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            dev.epro.r0.Z3383101362411723454.r();
            return;
        }
        this.d.f(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.c) {
            return this.d.g(this.b, obj);
        }
        dev.epro.r0.S10973172697741180971.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
