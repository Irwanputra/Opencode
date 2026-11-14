package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F16522637209502086415 {
    public static final F16522637209502086415 b = new F16522637209502086415();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(B7431089386356209140 b7431089386356209140, Class cls) throws GeneralSecurityException {
        B7431089386356209140 b74310893863562091402 = (B7431089386356209140) this.a.putIfAbsent(cls, b7431089386356209140);
        if (b74310893863562091402 == null || b74310893863562091402.equals(b7431089386356209140)) {
            return;
        }
        W4415201450379021245.c("Different key creator for parameters class already inserted");
    }
}
