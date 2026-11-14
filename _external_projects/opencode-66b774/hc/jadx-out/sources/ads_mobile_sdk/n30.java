package ads_mobile_sdk;

import dev.epro.r0.O10710380540062020186;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public enum n30 implements O10710380540062020186 {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    n30(int i) {
        this.a = i;
    }

    @Override // dev.epro.r0.O10710380540062020186
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n30.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
