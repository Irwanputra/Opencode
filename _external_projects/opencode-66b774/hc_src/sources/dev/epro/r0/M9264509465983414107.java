package dev.epro.r0;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M9264509465983414107 {

    @O7462376509978667369("Adapter")
    private final String a;

    @O7462376509978667369("Latency")
    private final long b;

    @O7462376509978667369("Error")
    private final S12306309242770307923 c;

    @O7462376509978667369("Credentials")
    private final Bundle d;

    @O7462376509978667369("Ad Source Name")
    private final String e;

    @O7462376509978667369("Ad Source ID")
    private final String f;

    @O7462376509978667369("Ad Source Instance Name")
    private final String g;

    @O7462376509978667369("Ad Source Instance ID")
    private final String h;

    public M9264509465983414107(String str, long j, S12306309242770307923 s12306309242770307923, Bundle bundle, String str2, String str3, String str4, String str5) {
        str.getClass();
        bundle.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = j;
        this.c = s12306309242770307923;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final S12306309242770307923 a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Bundle c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M9264509465983414107)) {
            return false;
        }
        M9264509465983414107 m9264509465983414107 = (M9264509465983414107) obj;
        return S10823041268949770285.t(this.a, m9264509465983414107.a) && this.b == m9264509465983414107.b && S10823041268949770285.t(this.c, m9264509465983414107.c) && S10823041268949770285.t(this.d, m9264509465983414107.d) && S10823041268949770285.t(this.e, m9264509465983414107.e) && S10823041268949770285.t(this.f, m9264509465983414107.f) && S10823041268949770285.t(this.g, m9264509465983414107.g) && S10823041268949770285.t(this.h, m9264509465983414107.h);
    }

    public final String f() {
        return this.g;
    }

    public final long g() {
        return this.b;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int j = G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31);
        S12306309242770307923 s12306309242770307923 = this.c;
        return this.h.hashCode() + H4776669175763245653.c(H4776669175763245653.c(H4776669175763245653.c((this.d.hashCode() + ((j + (s12306309242770307923 == null ? 0 : s12306309242770307923.hashCode())) * 31)) * 31, this.e), this.f), this.g);
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
        arrayList.add(new AndroidBundleTypeAdapterFactory());
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
