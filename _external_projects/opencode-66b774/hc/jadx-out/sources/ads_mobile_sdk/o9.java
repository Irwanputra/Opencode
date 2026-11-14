package ads_mobile_sdk;

import dev.epro.r0.G11450220448113054352;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.L11610354117192841236;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class o9 {
    public final q9 a;
    public final long b;
    public final int c;
    public final String d;

    public o9(q9 q9Var, long j, int i, String str) {
        if (i == 0) {
            throw null;
        }
        this.a = q9Var;
        this.b = j;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.a == o9Var.a && this.b == o9Var.b && this.c == o9Var.c && this.d.equals(o9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((L11610354117192841236.A(this.c) + G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "AdValueParcel(type=" + this.a + ", valueMicros=" + this.b + ", precisionType=" + G11450220448113054352.y(this.c) + ", currencyCode=" + this.d + ")";
    }
}
