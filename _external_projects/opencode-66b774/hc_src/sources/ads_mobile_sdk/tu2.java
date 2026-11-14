package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class tu2 {
    public String a = "";
    public int b = 0;
    public String c = "";
    public String d = "";
    public Boolean f = null;
    public boolean g = false;
    public boolean h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu2)) {
            return false;
        }
        tu2 tu2Var = (tu2) obj;
        return S10823041268949770285.t(this.a, tu2Var.a) && this.b == tu2Var.b && S10823041268949770285.t(this.c, tu2Var.c) && S10823041268949770285.t(this.d, tu2Var.d) && S10823041268949770285.t(this.f, tu2Var.f) && this.g == tu2Var.g && this.h == tu2Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c = H4776669175763245653.c(H4776669175763245653.c(U1554499319261669842.h(this.b, this.a.hashCode() * 31), this.c), this.d) * 31;
        Boolean bool = this.f;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.h;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String str3 = this.d;
        Boolean bool = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder x = G6547577305291411977.x(i, "RenderTraceMeta(renderId=", str, ", adConfigIndex=", ", renderer=");
        G6547577305291411977.B(x, str2, ", adapterName=", str3, ", adapterVersion=, winningAd=");
        x.append(bool);
        x.append(", isOfflineAd=");
        x.append(z);
        x.append(", isHtmlAdResponse=");
        return E12098517352909843120.o(x, z2, ")");
    }
}
