package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U1515840713725655492 {
    public static final Logger c = Logger.getLogger(U1515840713725655492.class.getName());
    public static final U1515840713725655492 d;
    public ConcurrentHashMap a;
    public ConcurrentHashMap b;

    static {
        U1515840713725655492 u1515840713725655492 = new U1515840713725655492();
        u1515840713725655492.a = new ConcurrentHashMap();
        u1515840713725655492.b = new ConcurrentHashMap();
        d = u1515840713725655492;
    }

    public final I12868278259670714421 a(Class cls, String str) throws GeneralSecurityException {
        I12868278259670714421 i12868278259670714421;
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
            i12868278259670714421 = (I12868278259670714421) this.a.get(str);
        }
        if (i12868278259670714421.b.equals(cls)) {
            return i12868278259670714421;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(i12868278259670714421.getClass());
        String strValueOf2 = String.valueOf(i12868278259670714421.b);
        StringBuilder sbY = G6547577305291411977.y("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbY.append(strValueOf2);
        throw new GeneralSecurityException(sbY.toString());
    }

    public final synchronized void b(I12868278259670714421 i12868278259670714421, boolean z) {
        try {
            String str = i12868278259670714421.a;
            if (z && this.b.containsKey(str) && !((Boolean) this.b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            I12868278259670714421 i128682782596707144212 = (I12868278259670714421) this.a.get(str);
            if (i128682782596707144212 != null && !i128682782596707144212.getClass().equals(i12868278259670714421.getClass())) {
                c.getClass();
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + i128682782596707144212.getClass().getName() + ", cannot be re-registered with " + i12868278259670714421.getClass().getName());
            }
            this.a.putIfAbsent(str, i12868278259670714421);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(I12868278259670714421 i12868278259670714421, boolean z) {
        d(i12868278259670714421, 1, z);
    }

    public final synchronized void d(I12868278259670714421 i12868278259670714421, int i, boolean z) {
        if (!G6547577305291411977.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        b(i12868278259670714421, z);
    }
}
