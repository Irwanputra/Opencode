package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3490162855680961927 extends Z14368087615735085238 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final Q3490162855680961927 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER;
    private K17475131016376933427 aesCtrKeyFormat_;
    private int bitField0_;
    private R12168770235458988931 hmacKeyFormat_;

    static {
        Q3490162855680961927 q3490162855680961927 = new Q3490162855680961927();
        DEFAULT_INSTANCE = q3490162855680961927;
        Z14368087615735085238.u(Q3490162855680961927.class, q3490162855680961927);
    }

    public static Y11643405131922837963 y() {
        return (Y11643405131922837963) DEFAULT_INSTANCE.h();
    }

    public static Q3490162855680961927 z(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (Q3490162855680961927) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public final void A(K17475131016376933427 k17475131016376933427) {
        this.aesCtrKeyFormat_ = k17475131016376933427;
        this.bitField0_ |= 1;
    }

    public final void B(R12168770235458988931 r12168770235458988931) {
        this.hmacKeyFormat_ = r12168770235458988931;
        this.bitField0_ |= 2;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (A == 3) {
            return new Q3490162855680961927();
        }
        if (A == 4) {
            return new Y11643405131922837963(DEFAULT_INSTANCE);
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
        synchronized (Q3490162855680961927.class) {
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

    public final K17475131016376933427 w() {
        K17475131016376933427 k17475131016376933427 = this.aesCtrKeyFormat_;
        return k17475131016376933427 == null ? K17475131016376933427.w() : k17475131016376933427;
    }

    public final R12168770235458988931 x() {
        R12168770235458988931 r12168770235458988931 = this.hmacKeyFormat_;
        return r12168770235458988931 == null ? R12168770235458988931.w() : r12168770235458988931;
    }
}
