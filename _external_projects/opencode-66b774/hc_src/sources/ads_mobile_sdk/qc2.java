package ads_mobile_sdk;

import dev.epro.r0.O10710380540062020186;
import dev.epro.r0.S10973172697741180971;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public enum qc2 implements O10710380540062020186 {
    /* JADX INFO: Fake field, exist only in values array */
    CLEAR_REASON_UNKNOWN(0),
    CLEAR_REASON_CONSENT_DENIED(1),
    CLEAR_REASON_CONSENT_ALLOWLIST_CHANGED(2),
    CLEAR_REASON_CONSENT_HASH_CHANGED(3),
    CLEAR_REASON_PACKAGE_NAME_CHANGE(4),
    CLEAR_REASON_VERSION_CODE_CHANGE(5),
    CLEAR_REASON_DEVICE_MODEL_CHANGE(6),
    CLEAR_REASON_API_VERSION_CHANGE(7),
    UNRECOGNIZED(-1);

    public final int a;

    qc2(int i) {
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
        sb.append(qc2.class.getName());
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
