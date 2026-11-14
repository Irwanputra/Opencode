package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public enum S11983430735376301043 implements J10744057881386199887 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int a;

    S11983430735376301043(int i2) {
        this.a = i2;
    }

    public static S11983430735376301043 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 == 4) {
            return SHA512;
        }
        if (i2 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }
}
