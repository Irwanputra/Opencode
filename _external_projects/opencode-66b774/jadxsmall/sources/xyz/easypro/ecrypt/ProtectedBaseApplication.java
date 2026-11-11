package xyz.easypro.ecrypt;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.ecrypt.utils.a;

/* loaded from: classes.dex */
public class ProtectedBaseApplication extends Application {
    public static final String b = ProtectedBaseApplication.class.getSimpleName();
    public static ProtectedBaseApplication c;
    public String a = null;

    public static ProtectedBaseApplication getInstance() {
        return c;
    }

    public final String a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(Crypt.xrc("\u001d\u0011-\u0001\"+'3/\b"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        c = this;
        try {
            if (new a(this).d(getAssets().open(Crypt.xrc("\u001d\u0011-\u0001\"+V06\u0016"))) == null) {
                return;
            }
            String a = a();
            if (TextUtils.isEmpty(a)) {
                return;
            }
            this.a = a;
        } catch (Exception unused) {
            String a2 = a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            this.a = a2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: Exception -> 0x0121, LOOP:0: B:9:0x003d->B:11:0x0044, LOOP_END, TryCatch #3 {Exception -> 0x0121, blocks: (B:8:0x0026, B:9:0x003d, B:11:0x0044, B:13:0x0048, B:35:0x0115, B:36:0x0120), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[EDGE_INSN: B:12:0x0048->B:13:0x0048 BREAK  A[LOOP:0: B:9:0x003d->B:11:0x0044], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115 A[Catch: Exception -> 0x0121, TRY_ENTER, TryCatch #3 {Exception -> 0x0121, blocks: (B:8:0x0026, B:9:0x003d, B:11:0x0044, B:13:0x0048, B:35:0x0115, B:36:0x0120), top: B:7:0x0026 }] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xyz.easypro.ecrypt.ProtectedBaseApplication.onCreate():void");
    }
}
