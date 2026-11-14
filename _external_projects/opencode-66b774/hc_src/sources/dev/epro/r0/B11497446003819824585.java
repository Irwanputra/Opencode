package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B11497446003819824585 extends Z14368087615735085238 {
    private static final B11497446003819824585 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile T3521423756786688980 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private A10696933611341011168 keyInfo_ = Y3479847386076544429.e;
    private int primaryKeyId_;

    static {
        B11497446003819824585 b11497446003819824585 = new B11497446003819824585();
        DEFAULT_INSTANCE = b11497446003819824585;
        Z14368087615735085238.u(B11497446003819824585.class, b11497446003819824585);
    }

    public static R11359628841234317791 x() {
        return (R11359628841234317791) DEFAULT_INSTANCE.h();
    }

    @Override // dev.epro.r0.Z14368087615735085238
    public final Object i(int i) {
        T3521423756786688980 t3521423756786688980;
        int A = L11610354117192841236.A(i);
        if (A == 0) {
            return (byte) 1;
        }
        if (A == 2) {
            return new J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", V2461605201390006818.class});
        }
        if (A == 3) {
            return new B11497446003819824585();
        }
        if (A == 4) {
            return new R11359628841234317791(DEFAULT_INSTANCE);
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
        synchronized (B11497446003819824585.class) {
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

    public final void w(V2461605201390006818 v2461605201390006818) {
        A10696933611341011168 a10696933611341011168 = this.keyInfo_;
        if (!((F4350745041554760175) a10696933611341011168).a) {
            a10696933611341011168 = a10696933611341011168.h(a10696933611341011168.size() * 2);
            this.keyInfo_ = a10696933611341011168;
        }
        a10696933611341011168.add(v2461605201390006818);
    }

    public final void y(int i) {
        this.primaryKeyId_ = i;
    }
}
