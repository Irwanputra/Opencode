package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10823041268949770285;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jh3 {
    public final int a;
    public final Integer b;
    public final long c;
    public final long d;
    public final im0 e;

    public jh3(int i, Integer num, long j, long j2, im0 im0Var) {
        this.a = i;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = im0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3Var = (jh3) obj;
        return this.a == jh3Var.a && S10823041268949770285.t(this.b, jh3Var.b) && E17093345031926825464.d(this.c, jh3Var.c) && E17093345031926825464.d(this.d, jh3Var.d) && this.e == jh3Var.e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return this.e.hashCode() + G6547577305291411977.j(G6547577305291411977.j(hashCode2, this.c, 31), this.d, 31);
    }

    public final String toString() {
        String l = E17093345031926825464.l(this.c);
        String l2 = E17093345031926825464.l(this.d);
        StringBuilder sb = new StringBuilder("ThrottleConfiguration(nofillsBeforeThrottle=");
        sb.append(this.a);
        sb.append(", postThrottleNofillsBeforeThrottle=");
        sb.append(this.b);
        sb.append(", nofillRetentionTime=");
        G6547577305291411977.B(sb, l, ", callbackDelay=", l2, ", fillDefinition=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
