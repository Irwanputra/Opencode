package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.X2485016533998461232;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {
    public final String a;
    public final long b;
    public final int d;

    public wk0(String str, int i, long j) {
        Build.MODEL.getClass();
        this.a = str;
        this.b = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk0)) {
            return false;
        }
        wk0 wk0Var = (wk0) obj;
        if (!this.a.equals(wk0Var.a) || this.b != wk0Var.b) {
            return false;
        }
        String str = Build.MODEL;
        return S10823041268949770285.t(str, str) && this.d == wk0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + H4776669175763245653.c(G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31), Build.MODEL);
    }

    public final String toString() {
        String str = Build.MODEL;
        StringBuilder sbH = X2485016533998461232.h("EnvironmentData(packageName=", this.a, ", versionCode=", this.b);
        sbH.append(", deviceModel=");
        sbH.append(str);
        sbH.append(", apiVersion=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
