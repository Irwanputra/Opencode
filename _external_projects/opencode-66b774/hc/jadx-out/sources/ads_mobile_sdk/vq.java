package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq {
    public final O16637889491137121389 a;
    public final long b;

    public vq(O16637889491137121389 o16637889491137121389, long j) {
        o16637889491137121389.getClass();
        this.a = o16637889491137121389;
        this.b = j;
    }

    public final boolean a() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.a.getClass();
        return E17093345031926825464.c(M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS), this.b) >= 0;
    }
}
