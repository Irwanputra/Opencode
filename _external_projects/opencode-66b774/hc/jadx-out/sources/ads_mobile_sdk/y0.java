package ads_mobile_sdk;

import dev.epro.r0.C13242887440142317312;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.V5431423861497278836;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements C13242887440142317312 {
    public final Map a;
    public final V5431423861497278836 b;
    public final vi3 c;
    public final sh3 d;
    public final long e;

    public y0(V5431423861497278836 v5431423861497278836, Map map, j7 j7Var, vi3 vi3Var) {
        this.a = map;
        this.b = v5431423861497278836;
        this.c = vi3Var;
        this.d = vi3Var.a(yk0.EVENT_ID_AD_ATTEST_SIGNALS_TASK);
        this.e = j7Var.D();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        pd pdVar;
        try {
            try {
                try {
                    this.d.b();
                    D16915945238461757356 d16915945238461757356 = (D16915945238461757356) this.a.get("gs");
                    if (d16915945238461757356 != null && (pdVar = (pd) d16915945238461757356.get(this.e, TimeUnit.MILLISECONDS)) != null) {
                        synchronized (this.b) {
                            V5431423861497278836 v5431423861497278836 = this.b;
                            he heVarR = pdVar.r();
                            v5431423861497278836.b();
                            ((pd) v5431423861497278836.b).a(heVarR);
                            V5431423861497278836 v54314238614972788362 = this.b;
                            long jO = pdVar.o();
                            v54314238614972788362.b();
                            pd pdVar2 = (pd) v54314238614972788362.b;
                            pdVar2.bitField1_ |= 1048576;
                            pdVar2.gmscoreVersionSignal_ = jO;
                        }
                    }
                    return null;
                } catch (ClassCastException e) {
                    this.d.a(e);
                    return null;
                } catch (TimeoutException unused) {
                    this.c.b(yk0.EVENT_ID_AD_ATTEST_SIGNALS_TASK_TIMEOUT);
                    return null;
                }
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return null;
            } catch (ExecutionException e2) {
                e = e2;
                Throwable cause = e.getCause();
                sh3 sh3Var = this.d;
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
