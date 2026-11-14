package ads_mobile_sdk;

import dev.epro.r0.O10710380540062020186;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public enum wp implements O10710380540062020186 {
    UNKNOWN(0),
    COLLECTED_BIDDING_SIGNAL(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    wp(int i) {
        this.a = i;
    }

    @Override // dev.epro.r0.O10710380540062020186
    public final int getNumber() {
        return this.a ? 1 : 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + wp.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + (this.a ? 1 : 0) + " name=" + name() + '>';
    }
}
