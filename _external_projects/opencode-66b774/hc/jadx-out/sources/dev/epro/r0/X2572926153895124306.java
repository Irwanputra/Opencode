package dev.epro.r0;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X2572926153895124306 extends K17275736824900228431 {
    public static final X2572926153895124306 f;
    public static volatile C12371267504993118269 g;
    public final C12163932668652713734 e = C12163932668652713734.b;

    static {
        X2572926153895124306 x2572926153895124306 = new X2572926153895124306();
        f = x2572926153895124306;
        x2572926153895124306.b &= Integer.MAX_VALUE;
        K17275736824900228431.d.put(X2572926153895124306.class, x2572926153895124306);
    }

    public static X2572926153895124306 g(FileInputStream fileInputStream) throws F10620977331851870088 {
        K17275736824900228431 k17275736824900228431;
        X8134396307090105871 x8134396307090105871A = X8134396307090105871.a();
        try {
            int i = fileInputStream.read();
            if (i == -1) {
                k17275736824900228431 = null;
            } else {
                X4929887216837100213 x4929887216837100213 = new X4929887216837100213(new L626102241925478440(F3160751278268780235.t(i, fileInputStream), fileInputStream));
                K17275736824900228431 k17275736824900228431F = f.f();
                try {
                    X1177226880161088161 x1177226880161088161 = X1177226880161088161.c;
                    x1177226880161088161.getClass();
                    N10092264544134359582 n10092264544134359582A = x1177226880161088161.a(k17275736824900228431F.getClass());
                    E17564419012940707302 e17564419012940707302 = (E17564419012940707302) x4929887216837100213.b;
                    if (e17564419012940707302 == null) {
                        e17564419012940707302 = new E17564419012940707302(x4929887216837100213);
                    }
                    n10092264544134359582A.g(k17275736824900228431F, e17564419012940707302, x8134396307090105871A);
                    n10092264544134359582A.b(k17275736824900228431F);
                    x4929887216837100213.a(0);
                    k17275736824900228431 = k17275736824900228431F;
                } catch (F10620977331851870088 e) {
                    if (e.a) {
                        throw new F10620977331851870088(e.getMessage(), e);
                    }
                    throw e;
                } catch (K2053872328549434758 e2) {
                    throw new F10620977331851870088(e2.getMessage());
                } catch (IOException e3) {
                    if (e3.getCause() instanceof F10620977331851870088) {
                        throw ((F10620977331851870088) e3.getCause());
                    }
                    throw new F10620977331851870088(e3.getMessage(), e3);
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof F10620977331851870088) {
                        throw ((F10620977331851870088) e4.getCause());
                    }
                    throw e4;
                }
            }
            if (k17275736824900228431 == null || K17275736824900228431.d(k17275736824900228431, true)) {
                return (X2572926153895124306) k17275736824900228431;
            }
            throw new F10620977331851870088(new K2053872328549434758().getMessage());
        } catch (F10620977331851870088 e5) {
            if (e5.a) {
                throw new F10620977331851870088(e5.getMessage(), e5);
            }
            throw e5;
        } catch (IOException e6) {
            throw new F10620977331851870088(e6.getMessage(), e6);
        }
    }

    @Override // dev.epro.r0.K17275736824900228431
    public final Object a(int i) {
        C12371267504993118269 c12371267504993118269;
        switch (L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T14602662695158654172(f, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", Z1063574821297500145.a});
            case 3:
                return new X2572926153895124306();
            case 4:
                return new D5130720463069386173(f);
            case 5:
                return f;
            case 6:
                C12371267504993118269 c123712675049931182692 = g;
                if (c123712675049931182692 != null) {
                    return c123712675049931182692;
                }
                synchronized (X2572926153895124306.class) {
                    try {
                        c12371267504993118269 = g;
                        if (c12371267504993118269 == null) {
                            c12371267504993118269 = new C12371267504993118269();
                            g = c12371267504993118269;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c12371267504993118269;
            default:
                Z3383101362411723454.t();
                return null;
        }
    }
}
