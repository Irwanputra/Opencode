package ads_mobile_sdk;

import dev.epro.r0.C13242887440142317312;
import dev.epro.r0.V5431423861497278836;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class t93 implements C13242887440142317312 {
    public final String a;
    public final String b;
    public final rp1 c;
    public final V5431423861497278836 d;
    public final sh3 e;

    public t93(String str, String str2, V5431423861497278836 v5431423861497278836, rp1 rp1Var, sh3 sh3Var) {
        this.a = str;
        this.b = str2;
        this.d = v5431423861497278836;
        this.c = rp1Var;
        this.e = sh3Var;
    }

    public void a(Method method, V5431423861497278836 v5431423861497278836) {
        if (zi1.f == null) {
            synchronized (zi1.g) {
                try {
                    if (zi1.f == null) {
                        Long l = (Long) method.invoke("", null);
                        l.getClass();
                        zi1.f = l;
                    }
                } finally {
                }
            }
        }
        synchronized (v5431423861497278836) {
            try {
                if (zi1.f != null) {
                    long jLongValue = zi1.f.longValue();
                    v5431423861497278836.b();
                    pd pdVar = (pd) v5431423861497278836.b;
                    pdVar.bitField0_ |= 1048576;
                    pdVar.jbkSignal_ = jLongValue;
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        sh3 sh3Var = this.e;
        try {
            sh3Var.b();
            Method methodA = this.c.a(this.a, this.b);
            if (methodA != null) {
                a(methodA, this.d);
            }
            sh3Var.a();
            return null;
        } finally {
        }
    }
}
