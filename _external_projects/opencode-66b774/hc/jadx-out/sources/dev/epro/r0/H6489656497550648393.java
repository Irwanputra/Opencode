package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H6489656497550648393 {
    public static final H6489656497550648393 a;
    public static final H6489656497550648393 b;
    public static final H6489656497550648393 c;
    public static final H6489656497550648393 d;
    public static final /* synthetic */ H6489656497550648393[] e;

    static {
        H6489656497550648393 h6489656497550648393 = new H6489656497550648393("SUCCESSFUL", 0);
        a = h6489656497550648393;
        H6489656497550648393 h64896564975506483932 = new H6489656497550648393("REREGISTER", 1);
        b = h64896564975506483932;
        H6489656497550648393 h64896564975506483933 = new H6489656497550648393("CANCELLED", 2);
        c = h64896564975506483933;
        H6489656497550648393 h64896564975506483934 = new H6489656497550648393("ALREADY_SELECTED", 3);
        d = h64896564975506483934;
        e = new H6489656497550648393[]{h6489656497550648393, h64896564975506483932, h64896564975506483933, h64896564975506483934};
    }

    public static H6489656497550648393 valueOf(String str) {
        return (H6489656497550648393) Enum.valueOf(H6489656497550648393.class, str);
    }

    public static H6489656497550648393[] values() {
        return (H6489656497550648393[]) e.clone();
    }
}
