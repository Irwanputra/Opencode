package dev.epro.r0;

import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D16573472668995260995 extends B11964701839924937722 {

    @O7462376509978667369("Code")
    private final E3361600325772812308 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @O7462376509978667369("Message")
    private final String f204o;

    @O7462376509978667369("Response Info")
    private final F11004654978627682545 p;

    public D16573472668995260995(E3361600325772812308 e3361600325772812308, String str, F11004654978627682545 f11004654978627682545) {
        str.getClass();
        this.n = e3361600325772812308;
        this.f204o = str;
        this.p = f11004654978627682545;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D16573472668995260995)) {
            return false;
        }
        D16573472668995260995 d16573472668995260995 = (D16573472668995260995) obj;
        return this.n == d16573472668995260995.n && S10823041268949770285.t(this.f204o, d16573472668995260995.f204o) && S10823041268949770285.t(this.p, d16573472668995260995.p);
    }

    public final int hashCode() {
        int iC = H4776669175763245653.c(this.n.hashCode() * 31, this.f204o);
        F11004654978627682545 f11004654978627682545 = this.p;
        return iC + (f11004654978627682545 == null ? 0 : f11004654978627682545.hashCode());
    }

    public final String toString() {
        X16868335726098211378 x16868335726098211378 = X16868335726098211378.c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        A16798789777035163011 a16798789777035163011 = F14240031463097426304.i;
        int i = F14240031463097426304.k;
        int i2 = F14240031463097426304.l;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayList.add(new AndroidBundleTypeAdapterFactory());
        V17190203728625001156 v17190203728625001156 = new V17190203728625001156();
        K11898134656129953686 k11898134656129953686 = new K11898134656129953686(E3361600325772812308.class);
        arrayList.add(new W978455893304964068(v17190203728625001156, k11898134656129953686, k11898134656129953686.b == k11898134656129953686.a));
        A16798789777035163011 a167987897770351630112 = A16798789777035163011.e;
        Objects.requireNonNull(a167987897770351630112);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = M4353767700798623786.a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new F14240031463097426304(x16868335726098211378, 1, map2, true, a167987897770351630112, arrayList3, i, i2, new ArrayList(arrayDeque)).g(this);
    }
}
