package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J4327291511168983093 {
    public static final J4327291511168983093 a;
    public static final J4327291511168983093 b;
    public static final J4327291511168983093 c;
    public static final J4327291511168983093 d;
    public static final J4327291511168983093 e;
    public static final /* synthetic */ J4327291511168983093[] f;

    static {
        J4327291511168983093 j4327291511168983093 = new J4327291511168983093("Measuring", 0);
        a = j4327291511168983093;
        J4327291511168983093 j43272915111689830932 = new J4327291511168983093("LookaheadMeasuring", 1);
        b = j43272915111689830932;
        J4327291511168983093 j43272915111689830933 = new J4327291511168983093("LayingOut", 2);
        c = j43272915111689830933;
        J4327291511168983093 j43272915111689830934 = new J4327291511168983093("LookaheadLayingOut", 3);
        d = j43272915111689830934;
        J4327291511168983093 j43272915111689830935 = new J4327291511168983093("Idle", 4);
        e = j43272915111689830935;
        f = new J4327291511168983093[]{j4327291511168983093, j43272915111689830932, j43272915111689830933, j43272915111689830934, j43272915111689830935};
    }

    public static J4327291511168983093 valueOf(String str) {
        return (J4327291511168983093) Enum.valueOf(J4327291511168983093.class, str);
    }

    public static J4327291511168983093[] values() {
        return (J4327291511168983093[]) f.clone();
    }
}
