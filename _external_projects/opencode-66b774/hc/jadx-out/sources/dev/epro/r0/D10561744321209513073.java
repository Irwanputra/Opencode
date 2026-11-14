package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D10561744321209513073 extends Z14368087615735085238 {
    private static final D10561744321209513073 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private A10696933611341011168 key_ = Y3479847386076544429.e;
    private int primaryKeyId_;

    static {
        D10561744321209513073 d10561744321209513073 = new D10561744321209513073();
        DEFAULT_INSTANCE = d10561744321209513073;
        Z14368087615735085238.u(D10561744321209513073.class, d10561744321209513073);
    }

    public static J17709767831594123196 A() {
        return (J17709767831594123196) DEFAULT_INSTANCE.h();
    }

    public static D10561744321209513073 B(byte[] bArr, R4931231174251890987 r4931231174251890987) {
        return (D10561744321209513073) Z14368087615735085238.t(DEFAULT_INSTANCE, bArr, r4931231174251890987);
    }

    public final void C(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 e1228818263435470419;
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", X7969147725001179512.class});
        }
        if (iA == 3) {
            return new D10561744321209513073();
        }
        if (iA == 4) {
            return new J17709767831594123196(DEFAULT_INSTANCE);
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
        synchronized (D10561744321209513073.class) {
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

    public final void w(X7969147725001179512 x7969147725001179512) {
        A10696933611341011168 a10696933611341011168H = this.key_;
        if (!((F4350745041554760175) a10696933611341011168H).a) {
            a10696933611341011168H = a10696933611341011168H.h(a10696933611341011168H.size() * 2);
            this.key_ = a10696933611341011168H;
        }
        a10696933611341011168H.add(x7969147725001179512);
    }

    public final int x() {
        return this.key_.size();
    }

    public final A10696933611341011168 y() {
        return this.key_;
    }

    public final int z() {
        return this.primaryKeyId_;
    }
}
