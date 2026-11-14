package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public final Context a;
    public final b41 b;
    public final ApplicationInfo c;
    public final AtomicReference d;

    public mg(Context context, b41 b41Var) {
        context.getClass();
        b41Var.getClass();
        this.a = context;
        this.b = b41Var;
        this.c = context.getApplicationInfo();
        this.d = new AtomicReference();
    }
}
