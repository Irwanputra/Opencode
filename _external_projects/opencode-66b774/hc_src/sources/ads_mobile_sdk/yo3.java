package ads_mobile_sdk;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yo3 {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final wi0 b;
    public final v6 c;
    public final uo3 d;
    public final boolean e;
    public cm1 f;
    public final Object g = new Object();

    public yo3(Context context, wi0 wi0Var, v6 v6Var, uo3 uo3Var, boolean z) {
        this.a = context;
        this.b = wi0Var;
        this.c = v6Var;
        this.d = uo3Var;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[Catch: Exception -> 0x012b, TryCatch #5 {Exception -> 0x012b, blocks: (B:10:0x005c, B:12:0x0078, B:18:0x0087, B:19:0x009a, B:25:0x0091, B:26:0x0094, B:22:0x0096, B:33:0x00a6, B:69:0x00a0), top: B:9:0x005c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ads_mobile_sdk.cm1 a(ads_mobile_sdk.fm2 r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yo3.a(ads_mobile_sdk.fm2):ads_mobile_sdk.cm1");
    }

    public final cm1 a() {
        cm1 cm1Var;
        synchronized (this.g) {
            cm1Var = this.f;
        }
        return cm1Var;
    }

    public final void a(cm1 cm1Var) {
        synchronized (this.g) {
            cm1 cm1Var2 = this.f;
            if (cm1Var2 != null) {
                try {
                    cm1Var2.a();
                } catch (wo3 e) {
                    this.c.a(e.a, -1L, e);
                }
            }
            this.f = cm1Var;
        }
    }
}
