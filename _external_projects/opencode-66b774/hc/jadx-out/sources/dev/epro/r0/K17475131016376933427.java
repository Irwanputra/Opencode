package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17475131016376933427 extends Z14368087615735085238 {
    private static final K17475131016376933427 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int bitField0_;
    private int keySize_;
    private G5535738230181928554 params_;

    static {
        K17475131016376933427 k17475131016376933427 = new K17475131016376933427();
        DEFAULT_INSTANCE = k17475131016376933427;
        Z14368087615735085238.u(K17475131016376933427.class, k17475131016376933427);
    }

    public static K17475131016376933427 w() {
        return DEFAULT_INSTANCE;
    }

    public static O15043370141581947601 z() {
        return (O15043370141581947601) DEFAULT_INSTANCE.h();
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    public final void B(G5535738230181928554 g5535738230181928554) {
        this.params_ = g5535738230181928554;
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
            return new K17475131016376933427();
        }
        if (iA == 4) {
            return new O15043370141581947601(DEFAULT_INSTANCE);
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
        synchronized (K17475131016376933427.class) {
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

    public final G5535738230181928554 y() {
        G5535738230181928554 g5535738230181928554 = this.params_;
        return g5535738230181928554 == null ? G5535738230181928554.w() : g5535738230181928554;
    }
}
