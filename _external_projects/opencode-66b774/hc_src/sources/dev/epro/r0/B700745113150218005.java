package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B700745113150218005 extends Z14368087615735085238 {
    private static final B700745113150218005 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private D5244425530560719140 params_;
    private int version_;
    private N17666688112968464504 x_;
    private N17666688112968464504 y_;

    static {
        B700745113150218005 b700745113150218005 = new B700745113150218005();
        DEFAULT_INSTANCE = b700745113150218005;
        Z14368087615735085238.u(B700745113150218005.class, b700745113150218005);
    }

    public B700745113150218005() {
        M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
        this.x_ = m18082356575916498704;
        this.y_ = m18082356575916498704;
    }

    public static C10004055661283132603 B() {
        return (C10004055661283132603) DEFAULT_INSTANCE.h();
    }

    public static B700745113150218005 C(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (B700745113150218005) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 D() {
        return DEFAULT_INSTANCE.l();
    }

    public static B700745113150218005 w() {
        return DEFAULT_INSTANCE;
    }

    public final N17666688112968464504 A() {
        return this.y_;
    }

    public final void E(D5244425530560719140 d5244425530560719140) {
        this.params_ = d5244425530560719140;
        this.bitField0_ |= 1;
    }

    public final void F(M18082356575916498704 m18082356575916498704) {
        this.x_ = m18082356575916498704;
    }

    public final void G(M18082356575916498704 m18082356575916498704) {
        this.y_ = m18082356575916498704;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (A == 3) {
            return new B700745113150218005();
        }
        if (A == 4) {
            return new C10004055661283132603(DEFAULT_INSTANCE);
        }
        if (A == 5) {
            return DEFAULT_INSTANCE;
        }
        if (A != 6) {
            throw null;
        }
        T3521423756786688980 t35214237567866889802 = PARSER;
        if (t35214237567866889802 != null) {
            return t35214237567866889802;
        }
        synchronized (B700745113150218005.class) {
            try {
                t3521423756786688980 = PARSER;
                if (t3521423756786688980 == null) {
                    t3521423756786688980 = new E1228818263435470419();
                    PARSER = t3521423756786688980;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3521423756786688980;
    }

    public final D5244425530560719140 x() {
        D5244425530560719140 d5244425530560719140 = this.params_;
        return d5244425530560719140 == null ? D5244425530560719140.x() : d5244425530560719140;
    }

    public final int y() {
        return this.version_;
    }

    public final N17666688112968464504 z() {
        return this.x_;
    }
}
