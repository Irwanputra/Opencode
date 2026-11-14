package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V15589895908649643259 {
    public static final V15589895908649643259 b = new V15589895908649643259();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, T5990920249823963282 t5990920249823963282) {
        try {
            boolean zContainsKey = this.a.containsKey(str);
            HashMap map = this.a;
            if (!zContainsKey) {
                map.put(str, t5990920249823963282);
                return;
            }
            if (((T5990920249823963282) map.get(str)).equals(t5990920249823963282)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.a.get(str)) + "), cannot insert " + String.valueOf(t5990920249823963282));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (T5990920249823963282) entry.getValue());
        }
    }
}
