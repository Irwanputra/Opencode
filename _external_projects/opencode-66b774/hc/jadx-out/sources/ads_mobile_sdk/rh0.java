package ads_mobile_sdk;

import dev.epro.r0.O10710380540062020186;
import dev.epro.r0.S10973172697741180971;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public enum rh0 implements O10710380540062020186 {
    PROCESSOR_TIER_UNKNOWN(0),
    PROCESSOR_TIER_INVALID_DATA_SOURCE(1),
    PROCESSOR_TIER_EXTREME_LOW(2),
    PROCESSOR_TIER_LOW(3),
    PROCESSOR_TIER_MID(4),
    PROCESSOR_TIER_MID_PLUS(5),
    PROCESSOR_TIER_HIGH(6),
    PROCESSOR_TIER_EXTREME_HIGH(7),
    /* JADX INFO: Fake field, exist only in values array */
    PROCESSOR_TIER_UNPARSABLE(255),
    UNRECOGNIZED(-1);

    public final int a;

    rh0(int i) {
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
        sb.append(rh0.class.getName());
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
