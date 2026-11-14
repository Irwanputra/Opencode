package dev.epro.r0;

import ads_mobile_sdk.ts1;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I9096980162579903974 implements J14094762838860758899 {
    public final J14094762838860758899 a;
    public final J14094762838860758899 b;
    public final F4096073349764486348 c;

    public I9096980162579903974(J14094762838860758899 j14094762838860758899, J14094762838860758899 j140947628388607588992, F4096073349764486348 f4096073349764486348) {
        j14094762838860758899.getClass();
        j140947628388607588992.getClass();
        this.a = j14094762838860758899;
        this.b = j140947628388607588992;
        this.c = f4096073349764486348;
    }

    @Override // dev.epro.r0.J14094762838860758899
    public final U10184268024341301528 a(String str) {
        str.getClass();
        U10184268024341301528 u10184268024341301528A = this.b.a(str);
        if (u10184268024341301528A != null) {
            return new ts1(u10184268024341301528A, this);
        }
        J14094762838860758899 j14094762838860758899 = this.a;
        if (j14094762838860758899.a(str) != null) {
            return j14094762838860758899.a(str);
        }
        return null;
    }
}
