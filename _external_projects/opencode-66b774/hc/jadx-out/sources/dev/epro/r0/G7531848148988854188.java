package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G7531848148988854188 {
    public static final H16705941102157523559 a;
    public static final H16705941102157523559 b;

    static {
        Class cls = E6993330184355272251.a;
        H16705941102157523559 h16705941102157523559 = null;
        try {
            h16705941102157523559 = (H16705941102157523559) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h16705941102157523559;
        b = new H16705941102157523559();
    }
}
