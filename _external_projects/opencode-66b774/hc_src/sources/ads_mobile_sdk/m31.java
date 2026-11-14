package ads_mobile_sdk;

import dev.epro.r0.D15596191924284547207;
import dev.epro.r0.T1335862270807194835;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class m31 {
    public static final /* synthetic */ D15596191924284547207[] b = {T1335862270807194835.f("impressionData", "getImpressionData()Ljava/util/Map;", m31.class)};
    public final ii a = new ii((Object) null, (Object) null);

    public final String a() {
        D15596191924284547207[] d15596191924284547207Arr = b;
        D15596191924284547207 d15596191924284547207 = d15596191924284547207Arr[0];
        ii iiVar = this.a;
        Map map = (Map) iiVar.getValue(this, d15596191924284547207);
        Object obj = map != null ? map.get("targetAppId") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return str;
        }
        Map map2 = (Map) iiVar.getValue(this, d15596191924284547207Arr[0]);
        Object obj2 = map2 != null ? map2.get("targetPackageName") : null;
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }
}
