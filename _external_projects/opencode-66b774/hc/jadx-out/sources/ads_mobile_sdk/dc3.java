package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S3216761178606715008;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dc3 implements S3216761178606715008 {
    public final g9 a;
    public final String b;
    public final long c;

    public dc3(g9 g9Var, ck ckVar, String str, long j) {
        g9Var.getClass();
        ckVar.getClass();
        str.getClass();
        this.a = g9Var;
        this.b = str;
        this.c = j;
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final Object b(R4833348786910499294 r4833348786910499294) {
        g9 g9Var = this.a;
        g9Var.getClass();
        String str = this.b;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = g9Var.c;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        concurrentHashMap.put(str, new E17093345031926825464(M9216324016624295870.a0(this.c, N13798149404328803870.MILLISECONDS)));
        return O9245300239821758723.a;
    }
}
