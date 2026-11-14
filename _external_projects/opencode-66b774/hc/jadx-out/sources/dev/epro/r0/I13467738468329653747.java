package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I13467738468329653747 extends Z14368087615735085238 {
    private static final I13467738468329653747 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private N17666688112968464504 value_ = N17666688112968464504.b;

    static {
        I13467738468329653747 i13467738468329653747 = new I13467738468329653747();
        DEFAULT_INSTANCE = i13467738468329653747;
        Z14368087615735085238.u(I13467738468329653747.class, i13467738468329653747);
    }

    public static F14641504636625371985 A() {
        return (F14641504636625371985) DEFAULT_INSTANCE.h();
    }

    public static I13467738468329653747 B(byte[] bArr, R4931231174251890987 r4931231174251890987) {
        return (I13467738468329653747) Z14368087615735085238.t(DEFAULT_INSTANCE, bArr, r4931231174251890987);
    }

    public static I13467738468329653747 w() {
        return DEFAULT_INSTANCE;
    }

    public final void C(D16925706105132416423 d16925706105132416423) {
        this.outputPrefixType_ = d16925706105132416423.b();
    }

    public final void D(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void E(N17666688112968464504 n17666688112968464504) {
        n17666688112968464504.getClass();
        this.value_ = n17666688112968464504;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (iA == 3) {
            return new I13467738468329653747();
        }
        if (iA == 4) {
            return new F14641504636625371985(DEFAULT_INSTANCE);
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
        synchronized (I13467738468329653747.class) {
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

    public final D16925706105132416423 x() {
        D16925706105132416423 d16925706105132416423A = D16925706105132416423.a(this.outputPrefixType_);
        return d16925706105132416423A == null ? D16925706105132416423.UNRECOGNIZED : d16925706105132416423A;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final N17666688112968464504 z() {
        return this.value_;
    }
}
