package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E3303960769985644055 extends Z14368087615735085238 {
    private static final E3303960769985644055 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private D15721838497647431583 params_;
    private int version_;

    static {
        E3303960769985644055 e3303960769985644055 = new E3303960769985644055();
        DEFAULT_INSTANCE = e3303960769985644055;
        Z14368087615735085238.u(E3303960769985644055.class, e3303960769985644055);
    }

    public static E3303960769985644055 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (E3303960769985644055) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static F6528600733304600919 z() {
        return (F6528600733304600919) DEFAULT_INSTANCE.h();
    }

    public final void C(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    public final void D(D15721838497647431583 d15721838497647431583) {
        this.params_ = d15721838497647431583;
        this.bitField0_ |= 1;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
        }
        if (A == 3) {
            return new E3303960769985644055();
        }
        if (A == 4) {
            return new F6528600733304600919(DEFAULT_INSTANCE);
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
        synchronized (E3303960769985644055.class) {
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

    public final N17666688112968464504 w() {
        return this.keyValue_;
    }

    public final D15721838497647431583 x() {
        D15721838497647431583 d15721838497647431583 = this.params_;
        return d15721838497647431583 == null ? D15721838497647431583.w() : d15721838497647431583;
    }

    public final int y() {
        return this.version_;
    }
}
