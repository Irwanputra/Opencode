package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class t93 implements dev.epro.r0.C13242887440142317312 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final ads_mobile_sdk.rp1 c;
    public final dev.epro.r0.V5431423861497278836 d;
    public final ads_mobile_sdk.sh3 e;

    public t93(java.lang.String str, java.lang.String str2, dev.epro.r0.V5431423861497278836 v5431423861497278836, ads_mobile_sdk.rp1 rp1Var, ads_mobile_sdk.sh3 sh3Var) {
        this.a = str;
        this.b = str2;
        this.d = v5431423861497278836;
        this.c = rp1Var;
        this.e = sh3Var;
    }

    public void a(java.lang.reflect.Method method, dev.epro.r0.V5431423861497278836 v5431423861497278836) {
        if (ads_mobile_sdk.zi1.f == null) {
            synchronized (ads_mobile_sdk.zi1.g) {
                try {
                    if (ads_mobile_sdk.zi1.f == null) {
                        java.lang.Long l = (java.lang.Long) method.invoke("", null);
                        l.getClass();
                        ads_mobile_sdk.zi1.f = l;
                    }
                } finally {
                }
            }
        }
        synchronized (v5431423861497278836) {
            try {
                if (ads_mobile_sdk.zi1.f != null) {
                    long jLongValue = ads_mobile_sdk.zi1.f.longValue();
                    v5431423861497278836.b();
                    ads_mobile_sdk.pd pdVar = (ads_mobile_sdk.pd) v5431423861497278836.b;
                    pdVar.bitField0_ |= 1048576;
                    pdVar.jbkSignal_ = jLongValue;
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        ads_mobile_sdk.sh3 sh3Var = this.e;
        try {
            sh3Var.b();
            java.lang.reflect.Method methodA = this.c.a(this.a, this.b);
            if (methodA != null) {
                a(methodA, this.d);
            }
            sh3Var.a();
            return null;
        } finally {
        }
    }
}
