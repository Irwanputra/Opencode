package ads_mobile_sdk;

import dev.epro.r0.O10710380540062020186;
import dev.epro.r0.S10973172697741180971;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public enum ph0 implements O10710380540062020186 {
    TIER_UNKNOWN(0),
    TIER_INVALID_DATA_SOURCE(1),
    TIER_EXTREME_LOW(2),
    TIER_VERY_LOW(3),
    TIER_LOW(4),
    TIER_MID(5),
    TIER_MID_PLUS(6),
    TIER_HIGH(7),
    TIER_VERY_HIGH(8),
    TIER_EXTREME_HIGH(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIER_UNPARSABLE(255),
    UNRECOGNIZED(-1);

    public final int a;

    ph0(int i) {
        this.a = i;
    }

    @Override // dev.epro.r0.O10710380540062020186
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        byte[] bArr = rb1.a;
        S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(ph0.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
