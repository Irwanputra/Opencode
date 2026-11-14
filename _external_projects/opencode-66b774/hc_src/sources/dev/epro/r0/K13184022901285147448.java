package dev.epro.r0;

import android.net.NetworkRequest;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K13184022901285147448 {
    public static final K13184022901285147448 j = new K13184022901285147448();
    public final M12733718480826052124 a;
    public final N13222963410360886453 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public K13184022901285147448(K13184022901285147448 k13184022901285147448) {
        k13184022901285147448.getClass();
        this.c = k13184022901285147448.c;
        this.d = k13184022901285147448.d;
        this.b = k13184022901285147448.b;
        this.a = k13184022901285147448.a;
        this.e = k13184022901285147448.e;
        this.f = k13184022901285147448.f;
        this.i = k13184022901285147448.i;
        this.g = k13184022901285147448.g;
        this.h = k13184022901285147448.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !K13184022901285147448.class.equals(obj.getClass())) {
            return false;
        }
        K13184022901285147448 k13184022901285147448 = (K13184022901285147448) obj;
        if (this.c == k13184022901285147448.c && this.d == k13184022901285147448.d && this.e == k13184022901285147448.e && this.f == k13184022901285147448.f && this.g == k13184022901285147448.g && this.h == k13184022901285147448.h && S10823041268949770285.t(a(), k13184022901285147448.a()) && this.a == k13184022901285147448.a) {
            return this.i.equals(k13184022901285147448.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int h = L11610354117192841236.h(this.i, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest a = a();
        return h + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public K13184022901285147448(N13222963410360886453 n13222963410360886453, M12733718480826052124 m12733718480826052124, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = n13222963410360886453;
        this.a = m12733718480826052124;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public K13184022901285147448() {
        this.b = new N13222963410360886453(null);
        this.a = M12733718480826052124.a;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = H15747516787109764287.a;
    }
}
