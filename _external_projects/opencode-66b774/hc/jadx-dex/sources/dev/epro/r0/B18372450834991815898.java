package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B18372450834991815898 extends dev.epro.r0.F12738319475220657879 {
    public final transient dev.epro.r0.A13981518004556070623 d;
    public final transient java.lang.Object[] e;
    public final transient int f;

    public B18372450834991815898(dev.epro.r0.A13981518004556070623 a13981518004556070623, java.lang.Object[] objArr, int i) {
        this.d = a13981518004556070623;
        this.e = objArr;
        this.f = i;
    }

    public final int b(java.lang.Object[] objArr) {
        return a().b(objArr);
    }

    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return true;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.U1864172318023436692 iterator() {
        return a().o(0);
    }

    public final dev.epro.r0.N7756202525712935399 o() {
        return new dev.epro.r0.I8109741225409501516(this);
    }

    public final int size() {
        return this.f;
    }
}
