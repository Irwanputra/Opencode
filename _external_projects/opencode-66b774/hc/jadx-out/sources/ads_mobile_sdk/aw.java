package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class aw {
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final b41 a;
    public final ii b;
    public final F7878618420024429111 c;
    public final F7878618420024429111 d;
    public final ii e;
    public final F7878618420024429111 f;
    public final ii g;
    public final F7878618420024429111 h;
    public final F7878618420024429111 i;

    static {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        j = M9216324016624295870.Z(10, N13798149404328803870.SECONDS);
    }

    public aw(b41 b41Var) {
        b41Var.getClass();
        this.a = b41Var;
        int iMax = Math.max(2, Math.min(10, Runtime.getRuntime().availableProcessors()));
        long j2 = j;
        ii iiVarA = xv.a("BG", iMax, j2);
        this.b = iiVarA;
        F7878618420024429111 f7878618420024429111 = new F7878618420024429111((ThreadPoolExecutor) iiVarA.a);
        this.c = f7878618420024429111;
        this.d = f7878618420024429111;
        ii iiVarA2 = xv.a("Load", Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j2);
        this.e = iiVarA2;
        this.f = new F7878618420024429111((ThreadPoolExecutor) iiVarA2.a);
        ii iiVarA3 = xv.a("WebViewInit", Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j2);
        this.g = iiVarA3;
        F7878618420024429111 f78786184200244291112 = new F7878618420024429111((ThreadPoolExecutor) iiVarA3.a);
        this.h = f78786184200244291112;
        this.i = f78786184200244291112;
    }
}
