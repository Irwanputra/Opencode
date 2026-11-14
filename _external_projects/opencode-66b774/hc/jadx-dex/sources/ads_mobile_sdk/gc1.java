package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gc1 implements dev.epro.r0.J12043550928838212009 {
    public final /* synthetic */ dev.epro.r0.J12043550928838212009 a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ gc1(dev.epro.r0.J12043550928838212009 j12043550928838212009, java.lang.Object obj, byte b) {
        this.c = b;
        this.a = j12043550928838212009;
        this.b = obj;
    }

    public final java.lang.Object collect(dev.epro.r0.S7864201625552763331 s7864201625552763331, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = this.c;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        java.lang.Object obj = this.b;
        dev.epro.r0.J12043550928838212009 j12043550928838212009 = this.a;
        switch (b) {
            case 0:
                java.lang.Object objCollect = j12043550928838212009.collect(new ads_mobile_sdk.fc1(s7864201625552763331, (ads_mobile_sdk.jc1) obj, (byte) 0), r4833348786910499294);
                return objCollect == z3437138737604933638 ? objCollect : o9245300239821758723;
            case 1:
                java.lang.Object objCollect2 = j12043550928838212009.collect(new ads_mobile_sdk.go2(s7864201625552763331, (ads_mobile_sdk.wo2) obj), r4833348786910499294);
                return objCollect2 == z3437138737604933638 ? objCollect2 : o9245300239821758723;
            default:
                java.lang.Object objCollect3 = j12043550928838212009.collect(new ads_mobile_sdk.fc1(s7864201625552763331, (dev.epro.r0.I9096980162579903974) obj, (byte) 1), r4833348786910499294);
                return objCollect3 == z3437138737604933638 ? objCollect3 : o9245300239821758723;
        }
    }
}
