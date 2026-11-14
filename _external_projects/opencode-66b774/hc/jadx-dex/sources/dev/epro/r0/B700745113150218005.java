package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B700745113150218005 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.B700745113150218005 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private dev.epro.r0.D5244425530560719140 params_;
    private int version_;
    private dev.epro.r0.N17666688112968464504 x_;
    private dev.epro.r0.N17666688112968464504 y_;

    static {
        dev.epro.r0.B700745113150218005 b700745113150218005 = new dev.epro.r0.B700745113150218005();
        DEFAULT_INSTANCE = b700745113150218005;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.B700745113150218005.class, b700745113150218005);
    }

    public B700745113150218005() {
        dev.epro.r0.M18082356575916498704 m18082356575916498704 = dev.epro.r0.N17666688112968464504.b;
        this.x_ = m18082356575916498704;
        this.y_ = m18082356575916498704;
    }

    public static dev.epro.r0.C10004055661283132603 B() {
        return (dev.epro.r0.C10004055661283132603) DEFAULT_INSTANCE.h();
    }

    public static dev.epro.r0.B700745113150218005 C(dev.epro.r0.N17666688112968464504 n17666688112968464504, dev.epro.r0.R4931231174251890987 r4931231174251890987) {
        return (dev.epro.r0.B700745113150218005) dev.epro.r0.Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static dev.epro.r0.T3521423756786688980 D() {
        return DEFAULT_INSTANCE.l();
    }

    public static dev.epro.r0.B700745113150218005 w() {
        return DEFAULT_INSTANCE;
    }

    public final dev.epro.r0.N17666688112968464504 A() {
        return this.y_;
    }

    public final void E(dev.epro.r0.D5244425530560719140 d5244425530560719140) {
        this.params_ = d5244425530560719140;
        this.bitField0_ |= 1;
    }

    public final void F(dev.epro.r0.M18082356575916498704 m18082356575916498704) {
        this.x_ = m18082356575916498704;
    }

    public final void G(dev.epro.r0.M18082356575916498704 m18082356575916498704) {
        this.y_ = m18082356575916498704;
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new java.lang.Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (iA == 3) {
            return new dev.epro.r0.B700745113150218005();
        }
        if (iA == 4) {
            return new dev.epro.r0.C10004055661283132603(DEFAULT_INSTANCE);
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
        synchronized (dev.epro.r0.B700745113150218005.class) {
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

    public final dev.epro.r0.D5244425530560719140 x() {
        dev.epro.r0.D5244425530560719140 d5244425530560719140 = this.params_;
        return d5244425530560719140 == null ? dev.epro.r0.D5244425530560719140.x() : d5244425530560719140;
    }

    public final int y() {
        return this.version_;
    }

    public final dev.epro.r0.N17666688112968464504 z() {
        return this.x_;
    }
}
