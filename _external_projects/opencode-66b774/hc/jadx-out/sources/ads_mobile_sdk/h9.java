package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.I12024973293062010767;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.U4857089234315512256;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class h9 implements I12024973293062010767 {
    public final String a;
    public final U4857089234315512256 b;
    public final g9 c;
    public final O16637889491137121389 d;

    public h9(String str, U4857089234315512256 u4857089234315512256, g9 g9Var, O16637889491137121389 o16637889491137121389) {
        str.getClass();
        u4857089234315512256.getClass();
        g9Var.getClass();
        o16637889491137121389.getClass();
        this.a = str;
        this.b = u4857089234315512256;
        this.c = g9Var;
        this.d = o16637889491137121389;
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        String strE = this.b.e();
        this.d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g9 g9Var = this.c;
        g9Var.getClass();
        String str = this.a;
        str.getClass();
        E17093345031926825464 e17093345031926825464 = (E17093345031926825464) g9Var.c.get(str);
        if (e17093345031926825464 != null && strE != null) {
            ConcurrentHashMap concurrentHashMap = g9Var.d;
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            concurrentHashMap.put(strE, new E17093345031926825464(E17093345031926825464.g(M9216324016624295870.a0(jElapsedRealtime, N13798149404328803870.MILLISECONDS), e17093345031926825464.a)));
        }
        return O9245300239821758723.a;
    }
}
