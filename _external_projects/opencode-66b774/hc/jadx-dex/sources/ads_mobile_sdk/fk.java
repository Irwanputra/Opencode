package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum fk implements dev.epro.r0.O10710380540062020186 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    fk(int i2) {
        this.a = i2;
    }

    public static ads_mobile_sdk.fk a(int i2) {
        if (i2 == 0) {
            return UNSUPPORTED;
        }
        if (i2 == 2) {
            return ARM7;
        }
        if (i2 == 999) {
            return UNKNOWN;
        }
        if (i2 == 4) {
            return X86;
        }
        if (i2 == 5) {
            return ARM64;
        }
        if (i2 == 6) {
            return X86_64;
        }
        if (i2 != 7) {
            return null;
        }
        return RISCV64;
    }

    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "<" + ads_mobile_sdk.fk.class.getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
