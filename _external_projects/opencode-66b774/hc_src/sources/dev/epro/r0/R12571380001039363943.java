package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R12571380001039363943 {

    @O7462376509978667369("nofill_urls")
    public final List<String> a;

    @O7462376509978667369("refresh_interval")
    public final long b;

    @O7462376509978667369("gws_query_id")
    public final String c;

    @O7462376509978667369("response_info_extras")
    public final I16631908410500040363 d;

    public R12571380001039363943(ArrayList arrayList, long j, String str, I16631908410500040363 i16631908410500040363) {
        this.a = arrayList;
        this.b = j;
        this.c = str;
        this.d = i16631908410500040363;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R12571380001039363943)) {
            return false;
        }
        R12571380001039363943 r12571380001039363943 = (R12571380001039363943) obj;
        return S10823041268949770285.t(this.a, r12571380001039363943.a) && this.b == r12571380001039363943.b && S10823041268949770285.t(this.c, r12571380001039363943.c) && S10823041268949770285.t(this.d, r12571380001039363943.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + H4776669175763245653.c(G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31), this.c);
    }

    public final String toString() {
        return "ParentCommonConfig(noFillUrls=" + this.a + ", refreshIntervalInSeconds=" + this.b + ", gwsQueryId=" + this.c + ", responseInfoExtras=" + this.d + ")";
    }
}
