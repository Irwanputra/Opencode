package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I14055983621650734609 extends Z14368087615735085238 {
    private static final I14055983621650734609 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int bitField0_;
    private int keySize_;
    private Z12613980850602045436 params_;

    static {
        I14055983621650734609 i14055983621650734609 = new I14055983621650734609();
        DEFAULT_INSTANCE = i14055983621650734609;
        Z14368087615735085238.u(I14055983621650734609.class, i14055983621650734609);
    }

    public static J15815857725139355184 y() {
        return (J15815857725139355184) DEFAULT_INSTANCE.h();
    }

    public static I14055983621650734609 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (I14055983621650734609) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    public final void B(Z12613980850602045436 z12613980850602045436) {
        this.params_ = z12613980850602045436;
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (iA == 3) {
            return new I14055983621650734609();
        }
        if (iA == 4) {
            return new J15815857725139355184(DEFAULT_INSTANCE);
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
        synchronized (I14055983621650734609.class) {
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

    public final Z12613980850602045436 x() {
        Z12613980850602045436 z12613980850602045436 = this.params_;
        return z12613980850602045436 == null ? Z12613980850602045436.w() : z12613980850602045436;
    }
}
