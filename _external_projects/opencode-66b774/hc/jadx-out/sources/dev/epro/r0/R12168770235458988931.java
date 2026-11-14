package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R12168770235458988931 extends Z14368087615735085238 {
    private static final R12168770235458988931 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private K14067081624082208325 params_;
    private int version_;

    static {
        R12168770235458988931 r12168770235458988931 = new R12168770235458988931();
        DEFAULT_INSTANCE = r12168770235458988931;
        Z14368087615735085238.u(R12168770235458988931.class, r12168770235458988931);
    }

    public static X6694750255078630279 A() {
        return (X6694750255078630279) DEFAULT_INSTANCE.h();
    }

    public static R12168770235458988931 B(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (R12168770235458988931) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static R12168770235458988931 w() {
        return DEFAULT_INSTANCE;
    }

    public final void C(int i) {
        this.keySize_ = i;
    }

    public final void D(K14067081624082208325 k14067081624082208325) {
        this.params_ = k14067081624082208325;
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iA == 3) {
            return new R12168770235458988931();
        }
        if (iA == 4) {
            return new X6694750255078630279(DEFAULT_INSTANCE);
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
        synchronized (R12168770235458988931.class) {
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

    public final int x() {
        return this.keySize_;
    }

    public final K14067081624082208325 y() {
        K14067081624082208325 k14067081624082208325 = this.params_;
        return k14067081624082208325 == null ? K14067081624082208325.w() : k14067081624082208325;
    }

    public final int z() {
        return this.version_;
    }
}
