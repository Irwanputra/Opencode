package dev.epro.r0;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H5270339962551858100 {
    public static final H5270339962551858100 c = new H5270339962551858100("NIST_P256", R11362382501444029219.a);
    public static final H5270339962551858100 d = new H5270339962551858100("NIST_P384", R11362382501444029219.b);
    public static final H5270339962551858100 e = new H5270339962551858100("NIST_P521", R11362382501444029219.c);
    public final String a;
    public final ECParameterSpec b;

    public H5270339962551858100(String str, ECParameterSpec eCParameterSpec) {
        this.a = str;
        this.b = eCParameterSpec;
    }

    public final String toString() {
        return this.a;
    }
}
