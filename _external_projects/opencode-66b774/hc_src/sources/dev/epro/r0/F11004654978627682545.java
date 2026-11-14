package dev.epro.r0;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F11004654978627682545 {

    @O7462376509978667369("Mediation Adapter Class Name")
    private final String a;

    @O7462376509978667369("Response ID")
    private final String b;

    @O7462376509978667369("Response Extras")
    private final Bundle c;

    @O7462376509978667369("Loaded Ad Source Response Info")
    private final M9264509465983414107 d;

    @O7462376509978667369("Ad Source Responses")
    private final List<M9264509465983414107> e;

    public F11004654978627682545(String str, String str2, Bundle bundle, M9264509465983414107 m9264509465983414107, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = m9264509465983414107;
        this.e = list;
    }

    public final List a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F11004654978627682545)) {
            return false;
        }
        F11004654978627682545 f11004654978627682545 = (F11004654978627682545) obj;
        return S10823041268949770285.t(this.a, f11004654978627682545.a) && S10823041268949770285.t(this.b, f11004654978627682545.b) && S10823041268949770285.t(this.c, f11004654978627682545.c) && S10823041268949770285.t(this.d, f11004654978627682545.d) && S10823041268949770285.t(this.e, f11004654978627682545.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        M9264509465983414107 m9264509465983414107 = this.d;
        return this.e.hashCode() + ((hashCode2 + (m9264509465983414107 != null ? m9264509465983414107.hashCode() : 0)) * 31);
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
