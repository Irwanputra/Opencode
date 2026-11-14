package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G5535738230181928554 extends Z14368087615735085238 {
    private static final G5535738230181928554 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile T3521423756786688980 PARSER;
    private int ivSize_;

    static {
        G5535738230181928554 g5535738230181928554 = new G5535738230181928554();
        DEFAULT_INSTANCE = g5535738230181928554;
        Z14368087615735085238.u(G5535738230181928554.class, g5535738230181928554);
    }

    public static G5535738230181928554 w() {
        return DEFAULT_INSTANCE;
    }

    public static I7040761221046812072 y() {
        return (I7040761221046812072) DEFAULT_INSTANCE.h();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
        }
        if (iA == 3) {
            return new G5535738230181928554();
        }
        if (iA == 4) {
            return new I7040761221046812072(DEFAULT_INSTANCE);
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
        synchronized (G5535738230181928554.class) {
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
        return this.ivSize_;
    }

    public final void z(int i) {
        this.ivSize_ = i;
    }
}
