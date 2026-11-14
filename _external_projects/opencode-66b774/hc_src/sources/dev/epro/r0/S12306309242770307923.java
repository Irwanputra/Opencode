package dev.epro.r0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S12306309242770307923 extends B11964701839924937722 {

    @O7462376509978667369("Code")
    private final int n;

    /* renamed from: o, reason: collision with root package name */
    @O7462376509978667369("Message")
    private final String f478o;

    @O7462376509978667369("Domain")
    private final String p;

    public S12306309242770307923(int i, String str, String str2) {
        str.getClass();
        this.n = i;
        this.f478o = str;
        this.p = str2;
    }

    public final Integer L() {
        return Integer.valueOf(this.n);
    }

    public final String M() {
        return this.p;
    }

    public final String N() {
        return this.f478o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S12306309242770307923)) {
            return false;
        }
        S12306309242770307923 s12306309242770307923 = (S12306309242770307923) obj;
        return this.n == s12306309242770307923.n && S10823041268949770285.t(this.f478o, s12306309242770307923.f478o) && S10823041268949770285.t(this.p, s12306309242770307923.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + H4776669175763245653.c(Integer.hashCode(this.n) * 31, this.f478o);
    }

    public final String toString() {
        X16868335726098211378 x16868335726098211378 = X16868335726098211378.c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        A16798789777035163011 a16798789777035163011 = F14240031463097426304.i;
        int i = F14240031463097426304.k;
        int i2 = F14240031463097426304.l;
        ArrayDeque arrayDeque = new ArrayDeque();
        A16798789777035163011 a167987897770351630112 = A16798789777035163011.e;
        Objects.requireNonNull(a167987897770351630112);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = M4353767700798623786.a;
        HashMap hashMap2 = new HashMap(hashMap);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new F14240031463097426304(x16868335726098211378, 1, hashMap2, true, a167987897770351630112, arrayList3, i, i2, new ArrayList(arrayDeque)).g(this);
    }
}
