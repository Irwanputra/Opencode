package ads_mobile_sdk;

import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.G15142808377942141248;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.Z4899479314060394891;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 extends Z4899479314060394891 implements G15142808377942141248 {
    public final ci3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(ci3 ci3Var) {
        super(B14824868959299866349.e);
        ci3Var.getClass();
        this.a = ci3Var;
    }

    @Override // dev.epro.r0.G15142808377942141248
    public final void handleException(G8001132634698687269 g8001132634698687269, Throwable th) {
        g8001132634698687269.getClass();
        th.getClass();
        xv.c("Uncaught exception on context " + g8001132634698687269 + ": " + th, null);
        try {
            this.a.b(th);
        } catch (Throwable th2) {
            xv.c("Failed to report untrapped exception: " + th2, null);
        }
    }
}
