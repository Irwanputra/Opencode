package dev.epro.r0;

import ads_mobile_sdk.a;
import ads_mobile_sdk.le;
import ads_mobile_sdk.pd;
import ads_mobile_sdk.sh3;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.yk0;
import ads_mobile_sdk.z73;
import android.util.Base64;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P17416614265316018830 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z73 b;

    public /* synthetic */ P17416614265316018830(z73 z73Var, byte b) {
        this.a = b;
        this.b = z73Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strEncodeToString;
        byte b = this.a;
        z73 z73Var = this.b;
        switch (b) {
            case 0:
                a aVar = z73Var.b;
                String str = z73Var.d;
                aVar.getClass();
                V5431423861497278836 v5431423861497278836W = pd.w();
                v5431423861497278836W.c(E12098517352909843120.c(24));
                return Base64.encodeToString(aVar.a(((pd) v5431423861497278836W.a()).a(), str, true), 11);
            default:
                vi3 vi3Var = z73Var.g;
                try {
                    new sh3(yk0.EVENT_ID_ENCRYPTION, vi3Var.b, vi3Var.a).b();
                    a aVar2 = z73Var.b;
                    pd pdVar = (pd) z73Var.e.a();
                    String str2 = z73Var.d;
                    aVar2.getClass();
                    try {
                        strEncodeToString = Base64.encodeToString(((le) aVar2.a(str2, pdVar.a()).a()).a(), 11);
                        break;
                    } catch (IllegalArgumentException unused) {
                        V5431423861497278836 v5431423861497278836W2 = pd.w();
                        v5431423861497278836W2.c(E12098517352909843120.c(22));
                        strEncodeToString = Base64.encodeToString(aVar2.a(((pd) v5431423861497278836W2.a()).a(), str2, true), 11);
                    }
                    return strEncodeToString;
                } finally {
                }
        }
    }
}
