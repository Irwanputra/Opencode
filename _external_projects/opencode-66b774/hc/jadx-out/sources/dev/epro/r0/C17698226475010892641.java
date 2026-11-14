package dev.epro.r0;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C17698226475010892641 extends T3817383632789307090 {
    private static final C17698226475010892641 DEFAULT_INSTANCE;
    private static volatile X11083265167116078764 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C17595962009821566633 preferences_ = C17595962009821566633.b;

    static {
        C17698226475010892641 c17698226475010892641 = new C17698226475010892641();
        DEFAULT_INSTANCE = c17698226475010892641;
        T3817383632789307090.j(C17698226475010892641.class, c17698226475010892641);
    }

    public static V16497511513164727473 n() {
        return (V16497511513164727473) ((Y11622804996820966392) DEFAULT_INSTANCE.c(5));
    }

    public static C17698226475010892641 o(FileInputStream fileInputStream) {
        C17698226475010892641 c17698226475010892641 = DEFAULT_INSTANCE;
        N283669454412232072 n283669454412232072 = new N283669454412232072(fileInputStream);
        R12171924199823312678 r12171924199823312678A = R12171924199823312678.a();
        T3817383632789307090 t3817383632789307090I = c17698226475010892641.i();
        try {
            X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
            x8293765978123339002.getClass();
            B8838962141159673445 b8838962141159673445A = x8293765978123339002.a(t3817383632789307090I.getClass());
            E17564419012940707302 e17564419012940707302 = (E17564419012940707302) n283669454412232072.b;
            if (e17564419012940707302 == null) {
                e17564419012940707302 = new E17564419012940707302(n283669454412232072);
            }
            b8838962141159673445A.e(t3817383632789307090I, e17564419012940707302, r12171924199823312678A);
            b8838962141159673445A.b(t3817383632789307090I);
            if (T3817383632789307090.f(t3817383632789307090I, true)) {
                return (C17698226475010892641) t3817383632789307090I;
            }
            throw new A9458650138667563085(new K6038895509461751088().getMessage());
        } catch (A9458650138667563085 e) {
            if (e.a) {
                throw new A9458650138667563085(e.getMessage(), e);
            }
            throw e;
        } catch (K6038895509461751088 e2) {
            throw new A9458650138667563085(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof A9458650138667563085) {
                throw ((A9458650138667563085) e3.getCause());
            }
            throw new A9458650138667563085(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof A9458650138667563085) {
                throw ((A9458650138667563085) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // dev.epro.r0.T3817383632789307090
    public final Object c(int i) {
        X11083265167116078764 y16467866395019052000;
        switch (L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new J12688447796732847593(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", J17194807622508327576.a});
            case 3:
                return new C17698226475010892641();
            case 4:
                return new V16497511513164727473(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X11083265167116078764 x11083265167116078764 = PARSER;
                if (x11083265167116078764 != null) {
                    return x11083265167116078764;
                }
                synchronized (C17698226475010892641.class) {
                    try {
                        y16467866395019052000 = PARSER;
                        if (y16467866395019052000 == null) {
                            y16467866395019052000 = new Y16467866395019052000();
                            PARSER = y16467866395019052000;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return y16467866395019052000;
            default:
                Z3383101362411723454.t();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final C17595962009821566633 m() {
        C17595962009821566633 c17595962009821566633 = this.preferences_;
        if (c17595962009821566633.a) {
            return c17595962009821566633;
        }
        C17595962009821566633 c17595962009821566633B = c17595962009821566633.b();
        this.preferences_ = c17595962009821566633B;
        return c17595962009821566633B;
    }
}
