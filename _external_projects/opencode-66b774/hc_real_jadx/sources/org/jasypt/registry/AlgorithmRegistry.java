package org.jasypt.registry;

import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AlgorithmRegistry {
    private AlgorithmRegistry() {
    }

    public static Set getAllDigestAlgorithms() {
        ArrayList arrayList = new ArrayList(Security.getAlgorithms("MessageDigest"));
        Collections.sort(arrayList);
        return Collections.unmodifiableSet(new LinkedHashSet(arrayList));
    }

    public static Set getAllPBEAlgorithms() {
        ArrayList arrayList = new ArrayList(Security.getAlgorithms("Cipher"));
        Collections.sort(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("PBE")) {
                linkedHashSet.add(str);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
