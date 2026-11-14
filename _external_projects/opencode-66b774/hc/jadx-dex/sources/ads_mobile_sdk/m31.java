package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class m31 {
    public static final /* synthetic */ dev.epro.r0.D15596191924284547207[] b = {dev.epro.r0.T1335862270807194835.f("impressionData", "getImpressionData()Ljava/util/Map;", ads_mobile_sdk.m31.class)};
    public final ads_mobile_sdk.ii a = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);

    public final java.lang.String a() {
        dev.epro.r0.D15596191924284547207[] d15596191924284547207Arr = b;
        dev.epro.r0.D15596191924284547207 d15596191924284547207 = d15596191924284547207Arr[0];
        ads_mobile_sdk.ii iiVar = this.a;
        java.util.Map map = (java.util.Map) iiVar.getValue(this, d15596191924284547207);
        java.lang.Object obj = map != null ? map.get("targetAppId") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null) {
            return str;
        }
        java.util.Map map2 = (java.util.Map) iiVar.getValue(this, d15596191924284547207Arr[0]);
        java.lang.Object obj2 = map2 != null ? map2.get("targetPackageName") : null;
        if (obj2 instanceof java.lang.String) {
            return (java.lang.String) obj2;
        }
        return null;
    }
}
