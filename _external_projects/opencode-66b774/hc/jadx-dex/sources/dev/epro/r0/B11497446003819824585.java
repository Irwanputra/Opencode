package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B11497446003819824585 extends dev.epro.r0.Z14368087615735085238 {
    private static final dev.epro.r0.B11497446003819824585 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile dev.epro.r0.T3521423756786688980 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private dev.epro.r0.A10696933611341011168 keyInfo_ = dev.epro.r0.Y3479847386076544429.e;
    private int primaryKeyId_;

    static {
        dev.epro.r0.B11497446003819824585 b11497446003819824585 = new dev.epro.r0.B11497446003819824585();
        DEFAULT_INSTANCE = b11497446003819824585;
        dev.epro.r0.Z14368087615735085238.u(dev.epro.r0.B11497446003819824585.class, b11497446003819824585);
    }

    public static dev.epro.r0.R11359628841234317791 x() {
        return DEFAULT_INSTANCE.h();
    }

    public final java.lang.Object i(int i) {
        dev.epro.r0.T3521423756786688980 e1228818263435470419;
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new dev.epro.r0.J14415172299974100388(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"primaryKeyId_", "keyInfo_", dev.epro.r0.V2461605201390006818.class});
        }
        if (iA == 3) {
            return new dev.epro.r0.B11497446003819824585();
        }
        if (iA == 4) {
            return new dev.epro.r0.R11359628841234317791(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA != 6) {
            throw null;
        }
        dev.epro.r0.T3521423756786688980 t3521423756786688980 = PARSER;
        if (t3521423756786688980 != null) {
            return t3521423756786688980;
        }
        synchronized (dev.epro.r0.B11497446003819824585.class) {
            try {
                e1228818263435470419 = PARSER;
                if (e1228818263435470419 == null) {
                    e1228818263435470419 = new dev.epro.r0.E1228818263435470419();
                    PARSER = e1228818263435470419;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return e1228818263435470419;
    }

    public final void w(dev.epro.r0.V2461605201390006818 v2461605201390006818) {
        dev.epro.r0.A10696933611341011168 a10696933611341011168H = this.keyInfo_;
        if (!((dev.epro.r0.F4350745041554760175) a10696933611341011168H).a) {
            a10696933611341011168H = a10696933611341011168H.h(a10696933611341011168H.size() * 2);
            this.keyInfo_ = a10696933611341011168H;
        }
        a10696933611341011168H.add(v2461605201390006818);
    }

    public final void y(int i) {
        this.primaryKeyId_ = i;
    }
}
