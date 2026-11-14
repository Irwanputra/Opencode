package ads_mobile_sdk;

import dev.epro.r0.O11737420808161199786;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wo implements R16693852608535438299 {
    public final double a;
    public final boolean b;

    public wo(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        O11737420808161199786 o11737420808161199786 = p3477296814990354048.g0.a;
        o11737420808161199786.a = this.b;
        o11737420808161199786.b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return Double.compare(this.a, woVar.a) == 0 && this.b == woVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        return "BatterySignal(batteryLevel=" + this.a + ", isCharging=" + this.b + ")";
    }
}
