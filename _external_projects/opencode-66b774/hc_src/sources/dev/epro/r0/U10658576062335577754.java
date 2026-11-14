package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U10658576062335577754 extends Z14368087615735085238 {
    private static final U10658576062335577754 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private D5244425530560719140 params_;
    private int version_;

    static {
        U10658576062335577754 u10658576062335577754 = new U10658576062335577754();
        DEFAULT_INSTANCE = u10658576062335577754;
        Z14368087615735085238.u(U10658576062335577754.class, u10658576062335577754);
    }

    public static P17023343522998529741 x() {
        return (P17023343522998529741) DEFAULT_INSTANCE.h();
    }

    public static U10658576062335577754 y(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (U10658576062335577754) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"bitField0_", "params_", "version_"});
        }
        if (A == 3) {
            return new U10658576062335577754();
        }
        if (A == 4) {
            return new P17023343522998529741(DEFAULT_INSTANCE);
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
        synchronized (U10658576062335577754.class) {
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

    public final D5244425530560719140 w() {
        D5244425530560719140 d5244425530560719140 = this.params_;
        return d5244425530560719140 == null ? D5244425530560719140.x() : d5244425530560719140;
    }

    public final void z(D5244425530560719140 d5244425530560719140) {
        this.params_ = d5244425530560719140;
        this.bitField0_ |= 1;
    }
}
