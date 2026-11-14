package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E3303960769985644055 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.E3303960769985644055 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private dev.epro.r0.N17666688112968464504 keyValue_ = dev.epro.r0.N17666688112968464504.b;
    private dev.epro.r0.D15721838497647431583 params_;
    private int version_;

    static {
        dev.epro.r0.E3303960769985644055 e3303960769985644055 = new dev.epro.r0.E3303960769985644055();
        DEFAULT_INSTANCE = e3303960769985644055;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.E3303960769985644055.class, e3303960769985644055);
    }

    public static dev.epro.r0.E3303960769985644055 A(dev.epro.r0.N17666688112968464504 n17666688112968464504, dev.epro.r0.R4931231174251890987 r4931231174251890987) {
        return (dev.epro.r0.E3303960769985644055) dev.epro.r0.Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static dev.epro.r0.T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static dev.epro.r0.F6528600733304600919 z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void C(dev.epro.r0.M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    public final void D(dev.epro.r0.D15721838497647431583 d15721838497647431583) {
        this.params_ = d15721838497647431583;
        this.bitField0_ |= 1;
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new java.lang.Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.E3303960769985644055();
        }
        if (iA == 4) {
            return new dev.epro.r0.F6528600733304600919(DEFAULT_INSTANCE);
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
        synchronized (dev.epro.r0.E3303960769985644055.class) {
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

    public final dev.epro.r0.N17666688112968464504 w() {
        return this.keyValue_;
    }

    public final dev.epro.r0.D15721838497647431583 x() {
        dev.epro.r0.D15721838497647431583 d15721838497647431583 = this.params_;
        return d15721838497647431583 == null ? dev.epro.r0.D15721838497647431583.w() : d15721838497647431583;
    }

    public final int y() {
        return this.version_;
    }
}
