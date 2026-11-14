package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class M3862790495145116409 {
    public static final X354568553596380848 a = new X354568553596380848(new H475444086652660118((byte) 16), (byte) 0);
    public static final T10404628478956475064 b;
    public static final T10404628478956475064 c;

    static {
        long j = U10174709222559481877.h;
        b = new T10404628478956475064(true, Float.NaN, j);
        c = new T10404628478956475064(false, Float.NaN, j);
    }

    public static T10404628478956475064 a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = U10174709222559481877.h;
        }
        return (A891803927997771281.b(f, Float.NaN) && P15388715743159210616.a(j, U10174709222559481877.h)) ? z ? b : c : new T10404628478956475064(z, f, j);
    }
}
