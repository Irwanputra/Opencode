package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y2677586711477821327;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zx1 implements Y4798753258822141670 {
    public final y2 a;
    public final kx2 b;

    public zx1(y2 y2Var, kx2 kx2Var) {
        y2Var.getClass();
        kx2Var.getClass();
        this.a = y2Var;
        this.b = kx2Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("u");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str == null || str.length() == 0) {
            zi3.a(6, "Impression URL in native GMSG is null or empty", null);
            return o9245300239821758723;
        }
        Uri parse = Uri.parse(str);
        Boolean bool = Boolean.TRUE;
        Y2677586711477821327 y2677586711477821327 = qw2.b;
        kx2 kx2Var = this.b;
        kx2Var.getClass();
        parse.getClass();
        kx2Var.c.a(parse, kx2Var.a, kx2Var.b, this.a, bool);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 56;
    }
}
