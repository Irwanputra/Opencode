package dev.epro.r0;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N13222963410360886453 {
    public static final /* synthetic */ int b = 0;
    public final Object a;

    static {
        B14824868959299866349.o("NetworkRequestCompat");
    }

    public N13222963410360886453(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N13222963410360886453) && S10823041268949770285.t(this.a, ((N13222963410360886453) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
