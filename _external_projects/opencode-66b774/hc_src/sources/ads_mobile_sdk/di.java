package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R4833348786910499294;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class di extends cc3 {
    public final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(Context context) {
        super(wv0.CUI_NAME_SDKINIT_INIT_APP_PERMISSIONS, 2);
        context.getClass();
        this.d = context;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.APP_PERMISSIONS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dev.epro.r0.O2161699089510411363] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        ?? r2;
        P5733283974459951585 p5733283974459951585 = rw0.f;
        Context context = this.d;
        context.getClass();
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr != null) {
            List U0 = O5378677881740157249.U0(strArr);
            r2 = new ArrayList();
            for (Object obj : U0) {
                String str = (String) obj;
                P5733283974459951585 p57332839744599515852 = rw0.f;
                str.getClass();
                if (P5733283974459951585.e(context, str)) {
                    r2.add(obj);
                }
            }
        } else {
            r2 = O2161699089510411363.a;
        }
        return new xu0(new ci(r2));
    }
}
