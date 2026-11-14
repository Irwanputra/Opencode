package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.X11644140690951955496;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class k61 {
    public final String a;
    public final X11644140690951955496 b;
    public final String c;
    public final I16631908410500040363 d;
    public final String e;
    public final boolean f;

    public k61(String str, X11644140690951955496 x11644140690951955496, String str2, I16631908410500040363 i16631908410500040363, String str3, boolean z) {
        this.a = str;
        this.b = x11644140690951955496;
        this.c = str2;
        this.d = i16631908410500040363;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k61)) {
            return false;
        }
        k61 k61Var = (k61) obj;
        return S10823041268949770285.t(this.a, k61Var.a) && S10823041268949770285.t(this.b, k61Var.b) && S10823041268949770285.t(this.c, k61Var.c) && S10823041268949770285.t(this.d, k61Var.d) && S10823041268949770285.t(this.e, k61Var.e) && this.f == k61Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        X11644140690951955496 x11644140690951955496 = this.b;
        int hashCode2 = (hashCode + (x11644140690951955496 == null ? 0 : x11644140690951955496.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        I16631908410500040363 i16631908410500040363 = this.d;
        int hashCode4 = (hashCode3 + (i16631908410500040363 == null ? 0 : i16631908410500040363.a.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "InlineAd(html=" + this.a + ", bodyDeferred=" + this.b + ", baseUrl=" + this.c + ", adJson=" + this.d + ", adConfigKey=" + this.e + ", hasMultiAdConfigKey=" + this.f + ")";
    }
}
