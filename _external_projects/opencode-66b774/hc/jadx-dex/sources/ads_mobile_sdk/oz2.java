package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class oz2 implements java.util.Iterator {
    public final java.util.ArrayDeque a;
    public dev.epro.r0.L8361547894089146393 b;

    public oz2(ads_mobile_sdk.sq sqVar) {
        if (!(sqVar instanceof ads_mobile_sdk.pz2)) {
            this.a = null;
            this.b = (dev.epro.r0.L8361547894089146393) sqVar;
            return;
        }
        ads_mobile_sdk.pz2 pz2Var = (ads_mobile_sdk.pz2) sqVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(pz2Var.h);
        this.a = arrayDeque;
        arrayDeque.push(pz2Var);
        ads_mobile_sdk.sq sqVar2 = pz2Var.e;
        while (sqVar2 instanceof ads_mobile_sdk.pz2) {
            ads_mobile_sdk.pz2 pz2Var2 = (ads_mobile_sdk.pz2) sqVar2;
            this.a.push(pz2Var2);
            sqVar2 = pz2Var2.e;
        }
        this.b = (dev.epro.r0.L8361547894089146393) sqVar2;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.L8361547894089146393 next() {
        dev.epro.r0.L8361547894089146393 l8361547894089146393 = this.b;
        dev.epro.r0.L8361547894089146393 l83615478940891463932 = null;
        if (l8361547894089146393 == null) {
            dev.epro.r0.Z3383101362411723454.u();
            return null;
        }
        while (true) {
            java.util.ArrayDeque arrayDeque = this.a;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                ads_mobile_sdk.sq sqVar = ((ads_mobile_sdk.pz2) arrayDeque.pop()).f;
                while (sqVar instanceof ads_mobile_sdk.pz2) {
                    ads_mobile_sdk.pz2 pz2Var = (ads_mobile_sdk.pz2) sqVar;
                    arrayDeque.push(pz2Var);
                    sqVar = pz2Var.e;
                }
                dev.epro.r0.L8361547894089146393 l83615478940891463933 = (dev.epro.r0.L8361547894089146393) sqVar;
                if (l83615478940891463933.size() != 0) {
                    l83615478940891463932 = l83615478940891463933;
                    break;
                }
            } else {
                break;
            }
        }
        this.b = l83615478940891463932;
        return l8361547894089146393;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
