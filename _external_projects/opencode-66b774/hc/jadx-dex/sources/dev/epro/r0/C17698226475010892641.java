package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C17698226475010892641 extends dev.epro.r0.T3817383632789307090 {
    private static final dev.epro.r0.C17698226475010892641 DEFAULT_INSTANCE;
    private static volatile dev.epro.r0.X11083265167116078764 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private dev.epro.r0.C17595962009821566633 preferences_ = dev.epro.r0.C17595962009821566633.b;

    static {
        dev.epro.r0.C17698226475010892641 c17698226475010892641 = new dev.epro.r0.C17698226475010892641();
        DEFAULT_INSTANCE = c17698226475010892641;
        dev.epro.r0.T3817383632789307090.j(dev.epro.r0.C17698226475010892641.class, c17698226475010892641);
    }

    public static dev.epro.r0.V16497511513164727473 n() {
        return (dev.epro.r0.Y11622804996820966392) DEFAULT_INSTANCE.c(5);
    }

    public static dev.epro.r0.C17698226475010892641 o(java.io.FileInputStream fileInputStream) throws dev.epro.r0.A9458650138667563085 {
        dev.epro.r0.C17698226475010892641 c17698226475010892641 = DEFAULT_INSTANCE;
        dev.epro.r0.N283669454412232072 n283669454412232072 = new dev.epro.r0.N283669454412232072(fileInputStream);
        dev.epro.r0.R12171924199823312678 r12171924199823312678A = dev.epro.r0.R12171924199823312678.a();
        dev.epro.r0.T3817383632789307090 t3817383632789307090I = c17698226475010892641.i();
        try {
            dev.epro.r0.X8293765978123339002 x8293765978123339002 = dev.epro.r0.X8293765978123339002.c;
            x8293765978123339002.getClass();
            dev.epro.r0.B8838962141159673445 b8838962141159673445A = x8293765978123339002.a(t3817383632789307090I.getClass());
            dev.epro.r0.E17564419012940707302 e17564419012940707302 = (dev.epro.r0.E17564419012940707302) ((dev.epro.r0.F3160751278268780235) n283669454412232072).b;
            if (e17564419012940707302 == null) {
                e17564419012940707302 = new dev.epro.r0.E17564419012940707302((dev.epro.r0.F3160751278268780235) n283669454412232072);
            }
            b8838962141159673445A.e(t3817383632789307090I, e17564419012940707302, r12171924199823312678A);
            b8838962141159673445A.b(t3817383632789307090I);
            if (dev.epro.r0.T3817383632789307090.f(t3817383632789307090I, true)) {
                return (dev.epro.r0.C17698226475010892641) t3817383632789307090I;
            }
            throw new dev.epro.r0.A9458650138667563085(new dev.epro.r0.K6038895509461751088().getMessage());
        } catch (java.io.IOException e) {
            if (e.getCause() instanceof dev.epro.r0.A9458650138667563085) {
                throw ((dev.epro.r0.A9458650138667563085) e.getCause());
            }
            throw new dev.epro.r0.A9458650138667563085(e.getMessage(), e);
        } catch (java.lang.RuntimeException e2) {
            if (e2.getCause() instanceof dev.epro.r0.A9458650138667563085) {
                throw ((dev.epro.r0.A9458650138667563085) e2.getCause());
            }
            throw e2;
        } catch (dev.epro.r0.K6038895509461751088 e3) {
            throw new dev.epro.r0.A9458650138667563085(e3.getMessage());
        } catch (dev.epro.r0.A9458650138667563085 e4) {
            if (e4.a) {
                throw new dev.epro.r0.A9458650138667563085(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    public final java.lang.Object c(int i) {
        dev.epro.r0.Y16467866395019052000 y16467866395019052000;
        switch (dev.epro.r0.L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dev.epro.r0.J12688447796732847593(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", dev.epro.r0.J17194807622508327576.a});
            case 3:
                return new dev.epro.r0.C17698226475010892641();
            case 4:
                return new dev.epro.r0.V16497511513164727473(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                dev.epro.r0.X11083265167116078764 x11083265167116078764 = PARSER;
                if (x11083265167116078764 != null) {
                    return x11083265167116078764;
                }
                synchronized (dev.epro.r0.C17698226475010892641.class) {
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

    public final java.util.Map l() {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }

    public final dev.epro.r0.C17595962009821566633 m() {
        dev.epro.r0.C17595962009821566633 c17595962009821566633 = this.preferences_;
        if (c17595962009821566633.a) {
            return c17595962009821566633;
        }
        dev.epro.r0.C17595962009821566633 c17595962009821566633B = c17595962009821566633.b();
        this.preferences_ = c17595962009821566633B;
        return c17595962009821566633B;
    }
}
