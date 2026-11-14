package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w8 implements dev.epro.r0.K4548097313143615345 {
    public final java.lang.Object a;

    public w8(ads_mobile_sdk.yu yuVar) {
        byte[] bArr = ads_mobile_sdk.rb1.a;
        this.a = yuVar;
        yuVar.a = this;
    }

    public ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.AD_TYPE;
    }

    public void b(int i, dev.epro.r0.G18207276409179303092 g18207276409179303092, java.lang.Object obj) {
        ads_mobile_sdk.g gVar = (ads_mobile_sdk.g) obj;
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) this.a;
        yuVar.g(i, 2);
        yuVar.m(gVar.a(g18207276409179303092));
        g18207276409179303092.a(gVar, this);
    }

    public java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.util.Set set = (java.util.Set) this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ads_mobile_sdk.qw2) it.next()).a);
        }
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.v8(arrayList));
    }

    public w8(dev.epro.r0.B12268161065087441760 b12268161065087441760) {
        this.a = b12268161065087441760;
    }

    public w8(java.util.Set set) {
        set.getClass();
        this.a = set;
    }
}
