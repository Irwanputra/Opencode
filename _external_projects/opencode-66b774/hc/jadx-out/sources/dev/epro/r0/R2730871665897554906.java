package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R2730871665897554906 extends Z14368087615735085238 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final R2730871665897554906 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private R2093184223260123021 aesCtrKey_;
    private int bitField0_;
    private B2519396215970499246 hmacKey_;
    private int version_;

    static {
        R2730871665897554906 r2730871665897554906 = new R2730871665897554906();
        DEFAULT_INSTANCE = r2730871665897554906;
        Z14368087615735085238.u(R2730871665897554906.class, r2730871665897554906);
    }

    public static R2730871665897554906 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (R2730871665897554906) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static K3475778432629073748 z() {
        return (K3475778432629073748) DEFAULT_INSTANCE.h();
    }

    public final void C(R2093184223260123021 r2093184223260123021) {
        this.aesCtrKey_ = r2093184223260123021;
        this.bitField0_ |= 1;
    }

    public final void D(B2519396215970499246 b2519396215970499246) {
        this.hmacKey_ = b2519396215970499246;
        this.bitField0_ |= 2;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (iA == 3) {
            return new R2730871665897554906();
        }
        if (iA == 4) {
            return new K3475778432629073748(DEFAULT_INSTANCE);
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
        synchronized (R2730871665897554906.class) {
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

    public final R2093184223260123021 w() {
        R2093184223260123021 r2093184223260123021 = this.aesCtrKey_;
        return r2093184223260123021 == null ? R2093184223260123021.w() : r2093184223260123021;
    }

    public final B2519396215970499246 x() {
        B2519396215970499246 b2519396215970499246 = this.hmacKey_;
        return b2519396215970499246 == null ? B2519396215970499246.w() : b2519396215970499246;
    }

    public final int y() {
        return this.version_;
    }
}
