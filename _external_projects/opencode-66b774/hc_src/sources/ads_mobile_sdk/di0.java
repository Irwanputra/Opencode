package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Environment;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10823041268949770285;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class di0 extends c61 {
    public final Context c;
    public final ci3 d;
    public final PackageManager e;
    public final O12494175665883759871 f;
    public final O12494175665883759871 g;
    public final O12494175665883759871 h;
    public final O12494175665883759871 i;
    public final O12494175665883759871 j;
    public final O12494175665883759871 k;
    public final O12494175665883759871 l;
    public final O12494175665883759871 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(Context context, ci3 ci3Var) {
        super(wv0.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK, 2);
        context.getClass();
        ci3Var.getClass();
        this.c = context;
        this.d = ci3Var;
        this.e = context.getPackageManager();
        this.f = new O12494175665883759871(new ai0(this, (byte) 4));
        this.g = new O12494175665883759871(new ai0(this, (byte) 0));
        this.h = new O12494175665883759871(yh0.a);
        this.i = new O12494175665883759871(new ai0(this, (byte) 2));
        this.j = new O12494175665883759871(new ai0(this, (byte) 1));
        this.k = new O12494175665883759871(new ai0(this, (byte) 5));
        this.l = new O12494175665883759871(new ai0(this, (byte) 3));
        this.m = new O12494175665883759871(new ai0(this, (byte) 6));
    }

    public final boolean a(Intent intent) {
        PackageManager.ResolveInfoFlags of;
        List queryIntentActivities;
        PackageManager packageManager = this.c.getPackageManager();
        if (packageManager != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                queryIntentActivities.getClass();
                if (!queryIntentActivities.isEmpty()) {
                    return true;
                }
            } else {
                List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                queryIntentActivities2.getClass();
                if (!queryIntentActivities2.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (S10823041268949770285.t(Environment.getExternalStorageState(), "mounted")) {
            return Build.VERSION.SDK_INT >= 30 || this.c.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return false;
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        this.f.getValue();
        this.h.getValue();
        this.g.getValue();
        this.i.getValue();
        this.j.getValue();
        this.k.getValue();
        this.l.getValue();
        this.m.getValue();
        return new xu0(O9245300239821758723.a);
    }
}
