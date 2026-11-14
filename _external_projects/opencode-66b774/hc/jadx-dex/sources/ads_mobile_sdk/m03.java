package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class m03 implements dev.epro.r0.R16693852608535438299 {
    public final java.util.List a;

    public m03(java.util.List list) {
        list.getClass();
        this.a = list;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        dev.epro.r0.F14240031463097426304 f14240031463097426304 = new dev.epro.r0.F14240031463097426304();
        java.util.List list = this.a;
        p3477296814990354048.D0 = f14240031463097426304.g(list);
        p3477296814990354048.E0 = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads_mobile_sdk.m03) && dev.epro.r0.S10823041268949770285.t(this.a, ((ads_mobile_sdk.m03) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RtbSignal(rtbAdapterDataList=" + this.a + ")";
    }
}
