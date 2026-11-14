package ads_mobile_sdk;

import dev.epro.r0.O16637889491137121389;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kz2 {
    public final g0 a;
    public final ci3 b;
    public final O16637889491137121389 c;

    public kz2(g0 g0Var, ci3 ci3Var, O16637889491137121389 o16637889491137121389) {
        g0Var.getClass();
        ci3Var.getClass();
        o16637889491137121389.getClass();
        this.a = g0Var;
        this.b = ci3Var;
        this.c = o16637889491137121389;
    }

    public static em2 a(kz2 kz2Var, wv0 wv0Var, List list, mi3 mi3Var) {
        boolean z;
        kz2Var.getClass();
        wv0Var.getClass();
        mi3Var.getClass();
        O16637889491137121389 o16637889491137121389 = kz2Var.c;
        ci3 ci3Var = kz2Var.b;
        o16637889491137121389.getClass();
        ci3Var.getClass();
        c7 c7Var = new c7((byte) 6);
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        em2 em2Var = new em2(wv0Var, list, uuidRandomUUID, mi3Var, c7Var, o16637889491137121389, ci3Var, 0, null, true, 1280);
        ((AtomicReference) c7Var.a).set(em2Var);
        ji3.a(ji3.b(), null);
        ji3.a(ji3.b(), em2Var);
        cc2 cc2Var = em2Var.k;
        g0 g0Var = kz2Var.a;
        synchronized (g0Var) {
            z = g0Var.f39o;
        }
        cc2Var.x = z ? 3 : 2;
        return em2Var;
    }
}
