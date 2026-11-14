package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T6528971164790359864 {
    public static final T6528971164790359864 b;
    public final HashMap a = new HashMap();

    static {
        H11126897742451323118 h11126897742451323118 = new H11126897742451323118();
        T6528971164790359864 t6528971164790359864 = new T6528971164790359864();
        try {
            t6528971164790359864.a(h11126897742451323118, V5443054910857193357.class);
            b = t6528971164790359864;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(H11126897742451323118 h11126897742451323118, Class cls) {
        try {
            H11126897742451323118 h111268977424513231182 = (H11126897742451323118) this.a.get(cls);
            if (h111268977424513231182 != null && !h111268977424513231182.equals(h11126897742451323118)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.a.put(cls, h11126897742451323118);
        } catch (Throwable th) {
            throw th;
        }
    }
}
