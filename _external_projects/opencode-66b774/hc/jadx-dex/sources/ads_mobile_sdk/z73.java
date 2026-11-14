package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class z73 {
    public final dev.epro.r0.F7878618420024429111 a;
    public final ads_mobile_sdk.a b;
    public final java.util.Set c;
    public final java.lang.String d;
    public final dev.epro.r0.V5431423861497278836 e;
    public final ads_mobile_sdk.rp1 f;
    public final ads_mobile_sdk.vi3 g;

    public z73(dev.epro.r0.F7878618420024429111 f7878618420024429111, ads_mobile_sdk.a aVar, ads_mobile_sdk.rp1 rp1Var, ads_mobile_sdk.sb3 sb3Var, java.lang.String str, dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.r33 r33Var, ads_mobile_sdk.r33 r33Var2, ads_mobile_sdk.r33 r33Var3, ads_mobile_sdk.vi3 vi3Var) {
        this.a = f7878618420024429111;
        this.b = aVar;
        this.d = str;
        this.f = rp1Var;
        this.e = v5431423861497278836;
        this.g = vi3Var;
        int iOrdinal = sb3Var.ordinal();
        if (iOrdinal == 0) {
            this.c = (java.util.Set) r33Var.get();
            return;
        }
        if (iOrdinal == 1) {
            this.c = (java.util.Set) r33Var2.get();
        } else if (iOrdinal == 2) {
            this.c = (java.util.Set) r33Var3.get();
        } else {
            dev.epro.r0.Z3383101362411723454.r();
            throw null;
        }
    }

    public final dev.epro.r0.D16915945238461757356 b() {
        boolean z;
        boolean z2;
        ads_mobile_sdk.a aVar = this.b;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            return dev.epro.r0.M9216324016624295870.J(java.lang.Integer.toString(7));
        }
        ads_mobile_sdk.rp1 rp1Var = this.f;
        synchronized (rp1Var) {
            z2 = rp1Var.j;
        }
        if (!z2) {
            return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.P17416614265316018830(this, (byte) 0), this.a);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.c.size());
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.submit((dev.epro.r0.C13242887440142317312) it.next()));
        }
        dev.epro.r0.N7756202525712935399 n7756202525712935399N = dev.epro.r0.N7756202525712935399.n(arrayList);
        dev.epro.r0.P17416614265316018830 p17416614265316018830 = new dev.epro.r0.P17416614265316018830(this, (byte) 1);
        dev.epro.r0.F1091364834390067043 f1091364834390067043 = new dev.epro.r0.F1091364834390067043(n7756202525712935399N, false, false);
        f1091364834390067043.p = new dev.epro.r0.P13515607228063833704(f1091364834390067043, p17416614265316018830);
        f1091364834390067043.u();
        return f1091364834390067043;
    }
}
