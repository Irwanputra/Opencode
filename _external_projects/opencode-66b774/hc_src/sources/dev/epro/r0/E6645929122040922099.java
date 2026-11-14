package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E6645929122040922099 extends Exception {
    public final B6867906687934285025 a;

    public E6645929122040922099(B6867906687934285025 b6867906687934285025) {
        if ((b6867906687934285025.e == 0 || b6867906687934285025.f == null) ? false : true) {
            this.a = b6867906687934285025;
        } else {
            S10973172697741180971.j("ResolvableConnectionException can only be created with a connection result containing a resolution.");
            throw null;
        }
    }
}
