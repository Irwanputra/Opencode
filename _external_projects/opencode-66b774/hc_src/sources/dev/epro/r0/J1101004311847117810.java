package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J1101004311847117810 {
    public static final J1101004311847117810 a;
    public static final J1101004311847117810 b;
    public static final J1101004311847117810 c;
    public static final /* synthetic */ J1101004311847117810[] d;

    static {
        J1101004311847117810 j1101004311847117810 = new J1101004311847117810("NIST_P256", 0);
        a = j1101004311847117810;
        J1101004311847117810 j11010043118471178102 = new J1101004311847117810("NIST_P384", 1);
        b = j11010043118471178102;
        J1101004311847117810 j11010043118471178103 = new J1101004311847117810("NIST_P521", 2);
        c = j11010043118471178103;
        d = new J1101004311847117810[]{j1101004311847117810, j11010043118471178102, j11010043118471178103};
    }

    public static J1101004311847117810 valueOf(String str) {
        return (J1101004311847117810) Enum.valueOf(J1101004311847117810.class, str);
    }

    public static J1101004311847117810[] values() {
        return (J1101004311847117810[]) d.clone();
    }
}
