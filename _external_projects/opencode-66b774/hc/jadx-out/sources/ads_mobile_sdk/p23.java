package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.X2485016533998461232;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p23 implements R16693852608535438299 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public p23(String str, String str2, int i, String str3, boolean z, boolean z2) {
        X2485016533998461232.i(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        p3477296814990354048.L0 = this.a;
        p3477296814990354048.N0 = true;
        p3477296814990354048.O0 = this.b;
        p3477296814990354048.P0 = Integer.valueOf(this.c);
        p3477296814990354048.Q0 = this.d;
        p3477296814990354048.R0.a = Boolean.valueOf(this.e);
        p3477296814990354048.R0.b = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p23)) {
            return false;
        }
        p23 p23Var = (p23) obj;
        return S10823041268949770285.t(this.a, p23Var.a) && S10823041268949770285.t(this.b, p23Var.b) && this.c == p23Var.c && S10823041268949770285.t(this.d, p23Var.d) && this.e == p23Var.e && this.f == p23Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iC = H4776669175763245653.c(U1554499319261669842.h(this.c, H4776669175763245653.c(this.a.hashCode() * 31, this.b)), this.d);
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iC + r2) * 31;
        boolean z2 = this.f;
        return (i + (z2 ? 1 : z2)) * 31;
    }

    public final String toString() {
        StringBuilder sbY = G6547577305291411977.y("SdkEnvironmentSignal(afmaVersion=", this.a, ", additionalCapabilities=", this.b, ", targetApi=");
        sbY.append(this.c);
        sbY.append(", externalVersion=");
        sbY.append(this.d);
        sbY.append(", isInstantApp=");
        sbY.append(this.e);
        sbY.append(", isPrivilegedProcess=");
        sbY.append(this.f);
        sbY.append(", isAdapterInitConfigSet=false)");
        return sbY.toString();
    }
}
