package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D15721838497647431583 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.D15721838497647431583 DEFAULT_INSTANCE;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        dev.epro.r0.D15721838497647431583 d15721838497647431583 = new dev.epro.r0.D15721838497647431583();
        DEFAULT_INSTANCE = d15721838497647431583;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.D15721838497647431583.class, d15721838497647431583);
    }

    public static dev.epro.r0.D15721838497647431583 w() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.M4569630009890340992 y() {
        return DEFAULT_INSTANCE.h();
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"tagSize_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.D15721838497647431583();
        }
        if (iA == 4) {
            return new dev.epro.r0.M4569630009890340992(DEFAULT_INSTANCE);
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
        synchronized (dev.epro.r0.D15721838497647431583.class) {
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

    public final int x() {
        return this.tagSize_;
    }

    public final void z(int i) {
        this.tagSize_ = i;
    }
}
