package dev.epro.r0;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C12173677222265696772 implements Runnable {
    public final H17290033108192114773 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ V5252629055842691065 c;

    public C12173677222265696772(V5252629055842691065 v5252629055842691065, H17290033108192114773 h17290033108192114773) {
        this.c = v5252629055842691065;
        this.a = h17290033108192114773;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J15730374346044043770 j15730374346044043770;
        String strConcat = "OkHttp ".concat(this.c.b.a.f());
        V5252629055842691065 v5252629055842691065 = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            v5252629055842691065.e.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.onResponse(v5252629055842691065, v5252629055842691065.f());
                        j15730374346044043770 = v5252629055842691065.a.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                            X4422675003582389573 x44226750035823895732 = X4422675003582389573.a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((v5252629055842691065.q ? "canceled " : "") + "call to " + v5252629055842691065.b.a.f());
                            x44226750035823895732.j(4, sb.toString());
                        } else {
                            this.a.onFailure(v5252629055842691065, e);
                        }
                        j15730374346044043770 = v5252629055842691065.a.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        v5252629055842691065.c();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.onFailure(v5252629055842691065, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        j15730374346044043770 = v5252629055842691065.a.a;
                    }
                } catch (Throwable th2) {
                    J15730374346044043770 j157303743460440437702 = v5252629055842691065.a.a;
                    j157303743460440437702.getClass();
                    J15730374346044043770.R(j157303743460440437702, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            j15730374346044043770.getClass();
            J15730374346044043770.R(j15730374346044043770, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
