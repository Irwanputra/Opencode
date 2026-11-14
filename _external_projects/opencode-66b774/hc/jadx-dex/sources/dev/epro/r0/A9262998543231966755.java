package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9262998543231966755 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.A9262998543231966755 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        dev.epro.r0.A9262998543231966755 a9262998543231966755 = new dev.epro.r0.A9262998543231966755();
        DEFAULT_INSTANCE = a9262998543231966755;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.A9262998543231966755.class, a9262998543231966755);
    }

    public static dev.epro.r0.D17665983519861703360 y() {
        return (dev.epro.r0.D17665983519861703360) DEFAULT_INSTANCE.h();
    }

    public static dev.epro.r0.A9262998543231966755 z(dev.epro.r0.N17666688112968464504 n17666688112968464504, dev.epro.r0.R4931231174251890987 r4931231174251890987) {
        return (dev.epro.r0.A9262998543231966755) dev.epro.r0.Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"version_", "keySize_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.A9262998543231966755();
        }
        if (iA == 4) {
            return new dev.epro.r0.D17665983519861703360(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA != 6) {
            throw null;
        }
        dev.epro.r0.T3521423756786688980 t3521423756786688980 = PARSER;
        if (t3521423756786688980 != null) {
            return t3521423756786688980;
        }
        synchronized (dev.epro.r0.A9262998543231966755.class) {
            try {
                e1228818263435470419 = PARSER;
                if (e1228818263435470419 == null) {
                    e1228818263435470419 = new dev.epro.r0.E1228818263435470419();
                    PARSER = e1228818263435470419;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return e1228818263435470419;
    }

    public final int w() {
        return this.keySize_;
    }

    public final int x() {
        return this.version_;
    }
}
