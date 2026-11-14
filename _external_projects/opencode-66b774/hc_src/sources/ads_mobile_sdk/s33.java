package ads_mobile_sdk;

import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import dev.epro.r0.Z13168519540281190457;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class s33 implements Y4798753258822141670 {
    public final pa2 a;

    public s33(pa2 pa2Var) {
        pa2Var.getClass();
        this.a = pa2Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("enabled");
        if (!Z13168519540281190457.A(str, "true", true) && !Z13168519540281190457.A(str, "false", true)) {
            return O9245300239821758723.a;
        }
        pa2 pa2Var = this.a;
        boolean parseBoolean = Boolean.parseBoolean(str);
        pa2Var.getClass();
        try {
            Object value = pa2Var.e.getValue();
            value.getClass();
            yy0 yy0Var = (yy0) value;
            synchronized (yy0.class) {
                yy0Var.a.a("paidv2_user_option", Boolean.valueOf(parseBoolean));
            }
        } catch (Exception e) {
            zi3.a(4, "Exception while setting GpidV2 UserOption", e);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 28;
    }
}
