package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class q23 extends cc3 {
    public final String d;
    public final jr0 e;
    public final Context f;
    public final rw0 g;
    public final String h;
    public final b41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q23(String str, jr0 jr0Var, Context context, rw0 rw0Var, String str2, b41 b41Var) {
        super(wv0.CUI_NAME_SDKINIT_INIT_ENVIRONMENT_SIGNAL, 2);
        str.getClass();
        jr0Var.getClass();
        context.getClass();
        rw0Var.getClass();
        str2.getClass();
        b41Var.getClass();
        this.d = str;
        this.e = jr0Var;
        this.f = context;
        this.g = rw0Var;
        this.h = str2;
        this.i = b41Var;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.SDK_ENV;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        ApplicationInfo applicationInfo = this.f.getApplicationInfo();
        int i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
        jr0 jr0Var = this.e;
        jr0Var.getClass();
        String str = (String) jr0Var.a("gads:sdk_core_constants:caps", "", ao.a$6);
        boolean c = this.g.c();
        int myUid = Process.myUid();
        boolean z = myUid == 0 || myUid == 1000 || myUid == 1001 || myUid == 1002 || myUid == 1027;
        this.i.a();
        return new xu0(new p23(this.d, str, i, this.h, c, z));
    }
}
