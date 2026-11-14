package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S3216761178606715008;
import dev.epro.r0.Z3437138737604933638;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xq3 implements S3216761178606715008 {
    public final bs3 a;
    public final jr0 b;

    public xq3(bs3 bs3Var, jr0 jr0Var) {
        bs3Var.getClass();
        jr0Var.getClass();
        this.a = bs3Var;
        this.b = jr0Var;
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final Object a(Map map, R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        List list = (List) map.get((String) jr0Var.a("gads:webview_prefetch_resource_url_header", "X-Afma-Creative-Resource-Urls", ao.a$6));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!M8927913404651150384.Y((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                bs3 bs3Var = this.a;
                bs3Var.getClass();
                Object objA = bs3.a(bs3Var, arrayList, (K14749510448791472029) r4833348786910499294);
                if (objA == Z3437138737604933638.a) {
                    return objA;
                }
            }
        }
        return O9245300239821758723.a;
    }
}
