package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.S10973172697741180971;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yr0 {
    public final ArrayList a = new ArrayList();

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public final void a(View view, xr0 xr0Var) {
        wr0 wr0Var;
        if (view == null) {
            S10973172697741180971.j("FriendlyObstruction is null");
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                wr0Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            wr0Var = (wr0) obj;
            if (wr0Var.a.get() == view) {
                break;
            }
        }
        if (wr0Var == null) {
            arrayList.add(new wr0(view, xr0Var));
        }
    }
}
