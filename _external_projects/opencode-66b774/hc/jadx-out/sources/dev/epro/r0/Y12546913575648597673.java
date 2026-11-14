package dev.epro.r0;

import ads_mobile_sdk.xv;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y12546913575648597673 {
    public final String a;
    public String c;
    public String i;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final LinkedHashMap h = new LinkedHashMap();

    public Y12546913575648597673(String str) {
        this.a = str;
    }

    public final Y12546913575648597673 b(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            bundle = bundle.deepCopy();
            bundle.getClass();
        }
        this.e = bundle;
        return a();
    }

    public final Y12546913575648597673 c(Set set) {
        HashSet hashSet = this.g;
        hashSet.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 0) {
                xv.c("Neighboring content URL should not be empty.", null);
            } else {
                hashSet.add(str);
            }
        }
        return a();
    }

    public Y12546913575648597673 a() {
        return this;
    }
}
