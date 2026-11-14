package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V10413431034832764763 extends Z14368087615735085238 {
    private static final V10413431034832764763 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private N17666688112968464504 keyValue_ = N17666688112968464504.b;
    private B700745113150218005 publicKey_;
    private int version_;

    static {
        V10413431034832764763 v10413431034832764763 = new V10413431034832764763();
        DEFAULT_INSTANCE = v10413431034832764763;
        Z14368087615735085238.u(V10413431034832764763.class, v10413431034832764763);
    }

    public static V10413431034832764763 A(N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        return (V10413431034832764763) Z14368087615735085238.s(DEFAULT_INSTANCE, n17666688112968464504, r4931231174251890987);
    }

    public static T3521423756786688980 B() {
        return DEFAULT_INSTANCE.l();
    }

    public static J17963313904821611648 z() {
        return (J17963313904821611648) DEFAULT_INSTANCE.h();
    }

    public final void C(M18082356575916498704 m18082356575916498704) {
        this.keyValue_ = m18082356575916498704;
    }

    public final void D(B700745113150218005 b700745113150218005) {
        this.publicKey_ = b700745113150218005;
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
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
        }
        if (iA == 3) {
            return new V10413431034832764763();
        }
        if (iA == 4) {
            return new J17963313904821611648(DEFAULT_INSTANCE);
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
        synchronized (V10413431034832764763.class) {
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

    public final N17666688112968464504 w() {
        return this.keyValue_;
    }

    public final B700745113150218005 x() {
        B700745113150218005 b700745113150218005 = this.publicKey_;
        return b700745113150218005 == null ? B700745113150218005.w() : b700745113150218005;
    }

    public final int y() {
        return this.version_;
    }
}
