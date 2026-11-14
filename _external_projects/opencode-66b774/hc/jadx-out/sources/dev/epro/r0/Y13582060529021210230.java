package dev.epro.r0;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y13582060529021210230 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? M8927913404651150384.L(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
