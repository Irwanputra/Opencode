package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public enum D16925706105132416423 implements J10744057881386199887 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public final int a;

    D16925706105132416423(int i2) {
        this.a = i2;
    }

    public static D16925706105132416423 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 == 4) {
            return CRUNCHY;
        }
        if (i2 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }
}
