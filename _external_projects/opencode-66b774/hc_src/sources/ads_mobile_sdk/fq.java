package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.W15082408677311432558;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fq {
    public static final W15082408677311432558 h = new W15082408677311432558();
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public String f;
    public final List g;

    public fq(List list, String str, String str2, boolean z, String str3, String str4, List list2) {
        str3.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return S10823041268949770285.t(this.a, fqVar.a) && S10823041268949770285.t(this.b, fqVar.b) && S10823041268949770285.t(this.c, fqVar.c) && this.d == fqVar.d && S10823041268949770285.t(this.e, fqVar.e) && S10823041268949770285.t(this.f, fqVar.f) && S10823041268949770285.t(this.g, fqVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int c = H4776669175763245653.c((hashCode3 + i) * 31, this.e);
        String str3 = this.f;
        int hashCode4 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.g;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f;
        StringBuilder sb = new StringBuilder("BuildAdUrlResult(errors=");
        sb.append(this.a);
        sb.append(", baseUri=");
        sb.append(this.b);
        sb.append(", postParameters=");
        E12098517352909843120.s(this.c, ", includeCookies=", ", url=", sb, this.d);
        G6547577305291411977.B(sb, this.e, ", queryWithFlattenedBlobParams=", str, ", csrbErrors=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
