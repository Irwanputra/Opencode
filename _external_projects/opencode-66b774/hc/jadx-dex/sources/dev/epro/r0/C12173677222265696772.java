package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C12173677222265696772 implements java.lang.Runnable {
    public final dev.epro.r0.H17290033108192114773 a;
    public volatile java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    public final /* synthetic */ dev.epro.r0.V5252629055842691065 c;

    public C12173677222265696772(dev.epro.r0.V5252629055842691065 v5252629055842691065, dev.epro.r0.H17290033108192114773 h17290033108192114773) {
        this.c = v5252629055842691065;
        this.a = h17290033108192114773;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dev.epro.r0.J15730374346044043770 j15730374346044043770;
        java.lang.String strConcat = "OkHttp ".concat(this.c.b.a.f());
        dev.epro.r0.V5252629055842691065 v5252629055842691065 = this.c;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            v5252629055842691065.e.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.onResponse(v5252629055842691065, v5252629055842691065.f());
                        j15730374346044043770 = v5252629055842691065.a.a;
                    } catch (java.io.IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
                            dev.epro.r0.X4422675003582389573 x44226750035823895732 = dev.epro.r0.X4422675003582389573.a;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Callback failure for ");
                            sb.append((v5252629055842691065.q ? "canceled " : "") + "call to " + v5252629055842691065.b.a.f());
                            x44226750035823895732.j(4, sb.toString());
                        } else {
                            this.a.onFailure(v5252629055842691065, e);
                        }
                        j15730374346044043770 = v5252629055842691065.a.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z = true;
                        v5252629055842691065.c();
                        if (!z) {
                            java.io.IOException iOException = new java.io.IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.onFailure(v5252629055842691065, iOException);
                        }
                        if (!(th instanceof java.lang.InterruptedException)) {
                            throw th;
                        }
                        java.lang.Thread.currentThread().interrupt();
                        j15730374346044043770 = v5252629055842691065.a.a;
                    }
                } catch (java.lang.Throwable th2) {
                    dev.epro.r0.J15730374346044043770 j157303743460440437702 = v5252629055842691065.a.a;
                    j157303743460440437702.getClass();
                    dev.epro.r0.J15730374346044043770.R(j157303743460440437702, (dev.epro.r0.C12173677222265696772) null, this, 3);
                    throw th2;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            j15730374346044043770.getClass();
            dev.epro.r0.J15730374346044043770.R(j15730374346044043770, (dev.epro.r0.C12173677222265696772) null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
