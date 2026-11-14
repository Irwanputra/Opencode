package ads_mobile_sdk;

import android.content.Intent;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class d43 implements Y4798753258822141670 {
    public final rw0 a;

    public d43(rw0 rw0Var) {
        rw0Var.getClass();
        this.a = rw0Var;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        String str = (String) map.get("text");
        String str2 = (String) map.get("title");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (str != null && !M8927913404651150384.Y(str)) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            if (str2 != null && !M8927913404651150384.Y(str2)) {
                intent.putExtra("android.intent.extra.TITLE", str2);
            }
            this.a.a(intent);
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 43;
    }
}
