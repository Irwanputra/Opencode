package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N834945665174679349 extends Z14368087615735085238 {
    private static final N834945665174679349 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER;
    private int bitField0_;
    private int keySize_;
    private D15721838497647431583 params_;

    static {
        N834945665174679349 n834945665174679349 = new N834945665174679349();
        DEFAULT_INSTANCE = n834945665174679349;
        Z14368087615735085238.u(N834945665174679349.class, n834945665174679349);
    }

    public static B9335872021855041505 y() {
        return (B9335872021855041505) DEFAULT_INSTANCE.h();
    }

    public static N834945665174679349 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (N834945665174679349) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    public final void B(D15721838497647431583 d15721838497647431583) {
        this.params_ = d15721838497647431583;
        this.bitField0_ |= 1;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
        }
        if (iA == 3) {
            return new N834945665174679349();
        }
        if (iA == 4) {
            return new B9335872021855041505(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA != 6) {
            throw null;
        }
        T3521423756786688980 t3521423756786688980 = PARSER;
        if (t3521423756786688980 != null) {
            return t3521423756786688980;
        }
        synchronized (N834945665174679349.class) {
            try {
                e1228818263435470419 = PARSER;
                if (e1228818263435470419 == null) {
                    e1228818263435470419 = new E1228818263435470419();
                    PARSER = e1228818263435470419;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e1228818263435470419;
    }

    public final int w() {
        return this.keySize_;
    }

    public final D15721838497647431583 x() {
        D15721838497647431583 d15721838497647431583 = this.params_;
        return d15721838497647431583 == null ? D15721838497647431583.w() : d15721838497647431583;
    }
}
