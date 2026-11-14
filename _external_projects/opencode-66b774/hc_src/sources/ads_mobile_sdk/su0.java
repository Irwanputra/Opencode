package ads_mobile_sdk;

import dev.epro.r0.S12306309242770307923;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class su0 extends pu0 {
    public final S12306309242770307923 c;

    public su0(S12306309242770307923 s12306309242770307923) {
        super(13);
        this.c = s12306309242770307923;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su0) && this.c.equals(((su0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "InternalMediationAdError(mediationAdError=" + this.c + ")";
    }
}
