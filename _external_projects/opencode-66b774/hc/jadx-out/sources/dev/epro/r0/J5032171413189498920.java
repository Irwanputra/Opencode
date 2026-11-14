package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J5032171413189498920 {
    public static final J5032171413189498920 a;
    public static final J5032171413189498920 b;
    public static final J5032171413189498920 c;
    public static final J5032171413189498920 d;
    public static final /* synthetic */ J5032171413189498920[] e;

    static {
        J5032171413189498920 j5032171413189498920 = new J5032171413189498920("LookaheadMeasurement", 0);
        a = j5032171413189498920;
        J5032171413189498920 j50321714131894989202 = new J5032171413189498920("LookaheadPlacement", 1);
        b = j50321714131894989202;
        J5032171413189498920 j50321714131894989203 = new J5032171413189498920("Measurement", 2);
        c = j50321714131894989203;
        J5032171413189498920 j50321714131894989204 = new J5032171413189498920("Placement", 3);
        d = j50321714131894989204;
        e = new J5032171413189498920[]{j5032171413189498920, j50321714131894989202, j50321714131894989203, j50321714131894989204};
    }

    public static J5032171413189498920 valueOf(String str) {
        return (J5032171413189498920) Enum.valueOf(J5032171413189498920.class, str);
    }

    public static J5032171413189498920[] values() {
        return (J5032171413189498920[]) e.clone();
    }
}
