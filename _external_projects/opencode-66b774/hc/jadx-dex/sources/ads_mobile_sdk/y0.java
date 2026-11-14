package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y0 implements dev.epro.r0.C13242887440142317312 {
    public final java.util.Map a;
    public final dev.epro.r0.V5431423861497278836 b;
    public final ads_mobile_sdk.vi3 c;
    public final ads_mobile_sdk.sh3 d;
    public final long e;

    public y0(dev.epro.r0.V5431423861497278836 v5431423861497278836, java.util.Map map, ads_mobile_sdk.j7 j7Var, ads_mobile_sdk.vi3 vi3Var) {
        this.a = map;
        this.b = v5431423861497278836;
        this.c = vi3Var;
        this.d = vi3Var.a(ads_mobile_sdk.yk0.EVENT_ID_AD_ATTEST_SIGNALS_TASK);
        this.e = j7Var.D();
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        ads_mobile_sdk.pd pdVar;
        try {
            try {
                try {
                    this.d.b();
                    dev.epro.r0.D16915945238461757356 d16915945238461757356 = (dev.epro.r0.D16915945238461757356) this.a.get("gs");
                    if (d16915945238461757356 != null && (pdVar = (ads_mobile_sdk.pd) d16915945238461757356.get(this.e, java.util.concurrent.TimeUnit.MILLISECONDS)) != null) {
                        synchronized (this.b) {
                            dev.epro.r0.V5431423861497278836 v5431423861497278836 = this.b;
                            ads_mobile_sdk.he heVarR = pdVar.r();
                            v5431423861497278836.b();
                            ((ads_mobile_sdk.pd) v5431423861497278836.b).a(heVarR);
                            dev.epro.r0.V5431423861497278836 v54314238614972788362 = this.b;
                            long jO = pdVar.o();
                            v54314238614972788362.b();
                            ads_mobile_sdk.pd pdVar2 = (ads_mobile_sdk.pd) v54314238614972788362.b;
                            pdVar2.bitField1_ |= 1048576;
                            pdVar2.gmscoreVersionSignal_ = jO;
                        }
                    }
                    return null;
                } catch (java.lang.ClassCastException e) {
                    this.d.a(e);
                    return null;
                } catch (java.util.concurrent.TimeoutException unused) {
                    this.c.b(ads_mobile_sdk.yk0.EVENT_ID_AD_ATTEST_SIGNALS_TASK_TIMEOUT);
                    return null;
                }
            } catch (java.lang.InterruptedException unused2) {
                java.lang.Thread.currentThread().interrupt();
                return null;
            } catch (java.util.concurrent.ExecutionException e2) {
                e = e2;
                java.lang.Throwable cause = e.getCause();
                ads_mobile_sdk.sh3 sh3Var = this.d;
                if (cause != null) {
                    e = cause;
                }
                sh3Var.a(e);
                return null;
            }
        } finally {
            this.d.a();
        }
    }
}
