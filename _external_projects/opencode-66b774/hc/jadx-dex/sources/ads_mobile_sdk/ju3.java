package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ju3 {
    public final java.util.ArrayDeque a;

    public ju3(byte b) {
        switch (b) {
            case 1:
                this.a = new java.util.ArrayDeque();
                break;
            default:
                int[] iArr = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                int i = iArr[7] % iArr[8];
                this.a = new java.util.ArrayDeque();
                break;
        }
    }

    public void a(ads_mobile_sdk.sq sqVar) {
        if (!sqVar.b()) {
            if (!(sqVar instanceof ads_mobile_sdk.pz2)) {
                dev.epro.r0.S10973172697741180971.j("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(sqVar.getClass())));
                return;
            }
            ads_mobile_sdk.pz2 pz2Var = (ads_mobile_sdk.pz2) sqVar;
            a(pz2Var.e);
            a(pz2Var.f);
            return;
        }
        int iBinarySearch = java.util.Arrays.binarySearch(ads_mobile_sdk.pz2.i, sqVar.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iC = ads_mobile_sdk.pz2.c(iBinarySearch + 1);
        java.util.ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty() || ((ads_mobile_sdk.sq) arrayDeque.peek()).size() >= iC) {
            arrayDeque.push(sqVar);
            return;
        }
        int iC2 = ads_mobile_sdk.pz2.c(iBinarySearch);
        ads_mobile_sdk.sq pz2Var2 = (ads_mobile_sdk.sq) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ads_mobile_sdk.sq) arrayDeque.peek()).size() < iC2) {
            pz2Var2 = new ads_mobile_sdk.pz2((ads_mobile_sdk.sq) arrayDeque.pop(), pz2Var2);
        }
        ads_mobile_sdk.pz2 pz2Var3 = new ads_mobile_sdk.pz2(pz2Var2, sqVar);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = java.util.Arrays.binarySearch(ads_mobile_sdk.pz2.i, pz2Var3.d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ads_mobile_sdk.sq) arrayDeque.peek()).size() >= ads_mobile_sdk.pz2.c(iBinarySearch2 + 1)) {
                break;
            } else {
                pz2Var3 = new ads_mobile_sdk.pz2((ads_mobile_sdk.sq) arrayDeque.pop(), pz2Var3);
            }
        }
        arrayDeque.push(pz2Var3);
    }

    public ads_mobile_sdk.gu3 a() {
        return (ads_mobile_sdk.gu3) java.util.Optional.ofNullable((ads_mobile_sdk.gu3) this.a.peek()).orElseThrow(ads_mobile_sdk.fu3.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.K14765462210213530574 */
    public void a(long j, long j2, long j3) throws dev.epro.r0.K14765462210213530574 {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = dev.epro.r0.C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        ads_mobile_sdk.gu3 gu3Var = new ads_mobile_sdk.gu3(j, j2, j3);
        java.util.ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= iD) {
            throw new dev.epro.r0.K14765462210213530574();
        }
        arrayDeque.push(gu3Var);
    }
}
