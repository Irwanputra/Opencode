package dev.epro.r0;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class R4468382834154872542 {
    public static final X354568553596380848 a = new X354568553596380848(new G5865513469313204166((byte) 20), (byte) 1);
    public static Boolean b;

    public static final void a(final M11181104712105445833 m11181104712105445833, final S16571168858015125610 s16571168858015125610, final U14340554418656580554 u14340554418656580554, final List list, final boolean z, M3727281027331139839 m3727281027331139839) {
        Executor executor = (Executor) m3727281027331139839.j(a);
        if (executor == null || !b(m11181104712105445833.b.length())) {
            m3727281027331139839.a0(317137883);
            m3727281027331139839.q(false);
            return;
        }
        m3727281027331139839.a0(315439796);
        final F10342546226345611902 f10342546226345611902 = (F10342546226345611902) m3727281027331139839.j(Y238707362170117896.n);
        final R8540738700654750557 r8540738700654750557 = (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h);
        try {
            executor.execute(new Runnable() { // from class: dev.epro.r0.C2492153280570683204
                @Override // java.lang.Runnable
                public final void run() {
                    A6237865184482427403 C;
                    S16571168858015125610 s165711688580151256102 = S16571168858015125610.this;
                    F10342546226345611902 f103425462263456119022 = f10342546226345611902;
                    M11181104712105445833 m111811047121054458332 = m11181104712105445833;
                    R8540738700654750557 r85407387006547505572 = r8540738700654750557;
                    U14340554418656580554 u143405544186565805542 = u14340554418656580554;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        M4722199849958580248 h = D459204867321966484.h();
                        A6237865184482427403 a6237865184482427403 = h instanceof A6237865184482427403 ? (A6237865184482427403) h : null;
                        if (a6237865184482427403 == null || (C = a6237865184482427403.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            M4722199849958580248 j = C.j();
                            try {
                                S16571168858015125610 l = H4776669175763245653.l(s165711688580151256102, f103425462263456119022);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = O2161699089510411363.a;
                                }
                                I1581330382723795749 i1581330382723795749 = new I1581330382723795749(m111811047121054458332, r85407387006547505572, u143405544186565805542, l, list2, z2);
                                i1581330382723795749.c();
                                i1581330382723795749.a();
                                M4722199849958580248.q(j);
                                C.w().h();
                                C.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                M4722199849958580248.q(j);
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        m3727281027331139839.q(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean bool = b;
            if (bool == null) {
                bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = bool;
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
