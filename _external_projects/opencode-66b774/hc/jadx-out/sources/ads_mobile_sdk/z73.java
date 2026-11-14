package ads_mobile_sdk;

import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.F1091364834390067043;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N7756202525712935399;
import dev.epro.r0.P13515607228063833704;
import dev.epro.r0.P17416614265316018830;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.Z3383101362411723454;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class z73 {
    public final F7878618420024429111 a;
    public final a b;
    public final Set c;
    public final String d;
    public final V5431423861497278836 e;
    public final rp1 f;
    public final vi3 g;

    public z73(F7878618420024429111 f7878618420024429111, a aVar, rp1 rp1Var, sb3 sb3Var, String str, V5431423861497278836 v5431423861497278836, r33 r33Var, r33 r33Var2, r33 r33Var3, vi3 vi3Var) {
        this.a = f7878618420024429111;
        this.b = aVar;
        this.d = str;
        this.f = rp1Var;
        this.e = v5431423861497278836;
        this.g = vi3Var;
        int iOrdinal = sb3Var.ordinal();
        if (iOrdinal == 0) {
            this.c = (Set) r33Var.get();
            return;
        }
        if (iOrdinal == 1) {
            this.c = (Set) r33Var2.get();
        } else if (iOrdinal == 2) {
            this.c = (Set) r33Var3.get();
        } else {
            Z3383101362411723454.r();
            throw null;
        }
    }

    public final D16915945238461757356 b() {
        boolean z;
        boolean z2;
        a aVar = this.b;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            return M9216324016624295870.J(Integer.toString(7));
        }
        rp1 rp1Var = this.f;
        synchronized (rp1Var) {
            z2 = rp1Var.j;
        }
        if (!z2) {
            return M9216324016624295870.X(new P17416614265316018830(this, (byte) 0), this.a);
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.submit((Callable) it.next()));
        }
        N7756202525712935399 n7756202525712935399N = N7756202525712935399.n(arrayList);
        P17416614265316018830 p17416614265316018830 = new P17416614265316018830(this, (byte) 1);
        F1091364834390067043 f1091364834390067043 = new F1091364834390067043(n7756202525712935399N, false, false);
        f1091364834390067043.p = new P13515607228063833704(f1091364834390067043, p17416614265316018830);
        f1091364834390067043.u();
        return f1091364834390067043;
    }
}
