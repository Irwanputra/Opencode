package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H12838525957287096428 {
    public static final H12838525957287096428 a;
    public static final H12838525957287096428 b;
    public static final H12838525957287096428 c;
    public static final /* synthetic */ H12838525957287096428[] d;

    static {
        H12838525957287096428 h12838525957287096428 = new H12838525957287096428("Active", 0);
        a = h12838525957287096428;
        H12838525957287096428 h128385259572870964282 = new H12838525957287096428("ActiveParent", 1);
        b = h128385259572870964282;
        H12838525957287096428 h128385259572870964283 = new H12838525957287096428("Captured", 2);
        H12838525957287096428 h128385259572870964284 = new H12838525957287096428("Inactive", 3);
        c = h128385259572870964284;
        d = new H12838525957287096428[]{h12838525957287096428, h128385259572870964282, h128385259572870964283, h128385259572870964284};
    }

    public static H12838525957287096428 valueOf(String str) {
        return (H12838525957287096428) Enum.valueOf(H12838525957287096428.class, str);
    }

    public static H12838525957287096428[] values() {
        return (H12838525957287096428[]) d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        Z3383101362411723454.g();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                Z3383101362411723454.g();
                return false;
            }
        }
        return true;
    }
}
