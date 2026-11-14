package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B14593915613258039923 extends dev.epro.r0.T3817383632789307090 {
    private static final dev.epro.r0.B14593915613258039923 DEFAULT_INSTANCE;
    private static volatile dev.epro.r0.X11083265167116078764 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private dev.epro.r0.D11116981298317247998 strings_ = dev.epro.r0.H7410314698464292688.d;

    static {
        dev.epro.r0.B14593915613258039923 b14593915613258039923 = new dev.epro.r0.B14593915613258039923();
        DEFAULT_INSTANCE = b14593915613258039923;
        dev.epro.r0.T3817383632789307090.j(dev.epro.r0.B14593915613258039923.class, b14593915613258039923);
    }

    public static dev.epro.r0.B14593915613258039923 m() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.A12186326491919036017 o() {
        return (dev.epro.r0.A12186326491919036017) ((dev.epro.r0.Y11622804996820966392) DEFAULT_INSTANCE.c(5));
    }

    public final java.lang.Object c(int i) {
        dev.epro.r0.Y16467866395019052000 y16467866395019052000;
        switch (dev.epro.r0.L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dev.epro.r0.J12688447796732847593(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case 3:
                return new dev.epro.r0.B14593915613258039923();
            case 4:
                return new dev.epro.r0.A12186326491919036017(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                dev.epro.r0.X11083265167116078764 x11083265167116078764 = PARSER;
                if (x11083265167116078764 != null) {
                    return x11083265167116078764;
                }
                synchronized (dev.epro.r0.B14593915613258039923.class) {
                    try {
                        y16467866395019052000 = PARSER;
                        if (y16467866395019052000 == null) {
                            y16467866395019052000 = new dev.epro.r0.Y16467866395019052000();
                            PARSER = y16467866395019052000;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return y16467866395019052000;
            default:
                dev.epro.r0.Z3383101362411723454.t();
                return null;
        }
    }

    public final void l(java.lang.Iterable iterable) {
        dev.epro.r0.H7410314698464292688 h7410314698464292688I = this.strings_;
        if (!h7410314698464292688I.a) {
            dev.epro.r0.H7410314698464292688 h7410314698464292688 = h7410314698464292688I;
            int i = h7410314698464292688.c;
            h7410314698464292688I = h7410314698464292688.i(i == 0 ? 10 : i * 2);
            this.strings_ = h7410314698464292688I;
        }
        java.nio.charset.Charset charset = dev.epro.r0.A9187767737237685029.a;
        if (iterable instanceof dev.epro.r0.V6791345594253748120) {
            ((dev.epro.r0.V6791345594253748120) iterable).d();
            dev.epro.r0.Z3383101362411723454.s();
            return;
        }
        if (iterable instanceof dev.epro.r0.I16207106522106600590) {
            h7410314698464292688I.addAll((java.util.Collection) iterable);
            return;
        }
        if ((h7410314698464292688I instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) h7410314698464292688I).ensureCapacity(((java.util.Collection) iterable).size() + h7410314698464292688I.c);
        }
        dev.epro.r0.H7410314698464292688 h74103146984642926882 = h7410314698464292688I;
        int i2 = h74103146984642926882.c;
        for (java.lang.Object obj : iterable) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (h74103146984642926882.c - i2) + " is null.";
                for (int i3 = h74103146984642926882.c - 1; i3 >= i2; i3--) {
                    h74103146984642926882.remove(i3);
                }
                dev.epro.r0.Z3383101362411723454.k(str);
                return;
            }
            h74103146984642926882.add(obj);
        }
    }

    public final dev.epro.r0.D11116981298317247998 n() {
        return this.strings_;
    }
}
