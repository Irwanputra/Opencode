package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D16573472668995260995 extends dev.epro.r0.B11964701839924937722 {

    @dev.epro.r0.O7462376509978667369("Code")
    private final dev.epro.r0.E3361600325772812308 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dev.epro.r0.O7462376509978667369("Message")
    private final java.lang.String f204o;

    @dev.epro.r0.O7462376509978667369("Response Info")
    private final dev.epro.r0.F11004654978627682545 p;

    public D16573472668995260995(dev.epro.r0.E3361600325772812308 e3361600325772812308, java.lang.String str, dev.epro.r0.F11004654978627682545 f11004654978627682545) {
        str.getClass();
        this.n = e3361600325772812308;
        this.f204o = str;
        this.p = f11004654978627682545;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D16573472668995260995)) {
            return false;
        }
        dev.epro.r0.D16573472668995260995 d16573472668995260995 = (dev.epro.r0.D16573472668995260995) obj;
        return this.n == d16573472668995260995.n && dev.epro.r0.S10823041268949770285.t(this.f204o, d16573472668995260995.f204o) && dev.epro.r0.S10823041268949770285.t(this.p, d16573472668995260995.p);
    }

    public final int hashCode() {
        int iC = dev.epro.r0.H4776669175763245653.c(this.n.hashCode() * 31, this.f204o);
        dev.epro.r0.F11004654978627682545 f11004654978627682545 = this.p;
        return iC + (f11004654978627682545 == null ? 0 : f11004654978627682545.hashCode());
    }

    public final java.lang.String toString() {
        dev.epro.r0.X16868335726098211378 x16868335726098211378 = dev.epro.r0.X16868335726098211378.c;
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        dev.epro.r0.A16798789777035163011 a16798789777035163011 = dev.epro.r0.F14240031463097426304.i;
        int i = dev.epro.r0.F14240031463097426304.k;
        int i2 = dev.epro.r0.F14240031463097426304.l;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayList.add(new com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory());
        dev.epro.r0.V17190203728625001156 v17190203728625001156 = new dev.epro.r0.V17190203728625001156();
        dev.epro.r0.K11898134656129953686 k11898134656129953686 = new dev.epro.r0.K11898134656129953686(dev.epro.r0.E3361600325772812308.class);
        arrayList.add(new dev.epro.r0.W978455893304964068(v17190203728625001156, k11898134656129953686, k11898134656129953686.b == k11898134656129953686.a));
        dev.epro.r0.A16798789777035163011 a167987897770351630112 = dev.epro.r0.A16798789777035163011.e;
        java.util.Objects.requireNonNull(a167987897770351630112);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        java.util.Collections.reverse(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList2);
        java.util.Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = dev.epro.r0.M4353767700798623786.a;
        java.util.HashMap map2 = new java.util.HashMap(map);
        new java.util.ArrayList(arrayList);
        new java.util.ArrayList(arrayList2);
        return new dev.epro.r0.F14240031463097426304(x16868335726098211378, 1, map2, true, a167987897770351630112, arrayList3, i, i2, new java.util.ArrayList(arrayDeque)).g(this);
    }
}
