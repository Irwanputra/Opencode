package dev.epro.r0;

import ads_mobile_sdk.f01;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.View;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import java.util.Map;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J6457333644812339360 implements K8888766238980911980 {
    public final Context a;
    public final H3430986877638506198 b;
    public final H3430986877638506198 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final I1632105416032993715 g;
    public S1367054881189475726 h;

    public J6457333644812339360(Context context, H3430986877638506198 h3430986877638506198, H3430986877638506198 h34309868776385061982, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3 && (context instanceof Activity)) {
            z4 = true;
        }
        I1632105416032993715 i1632105416032993715 = context instanceof Activity ? new I1632105416032993715((Activity) context) : null;
        this.h = null;
        this.a = context;
        this.b = h3430986877638506198;
        this.c = h34309868776385061982;
        this.d = z;
        this.e = z2;
        this.f = z4;
        this.g = i1632105416032993715;
    }

    public static void e(String str, f01 f01Var, Map map, E17835566830149380994 e17835566830149380994, Activity activity) {
        int o2 = T13998044911588922055.o(activity, activity.getResources().getConfiguration().screenWidthDp);
        int p = T13998044911588922055.p(activity);
        V9493494307739248620 v9493494307739248620 = (V9493494307739248620) e17835566830149380994;
        Activity activity2 = v9493494307739248620.b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            S10973172697741180971.m("Window token is null, cannot open HPOA service.");
            return;
        }
        X17317415102512733138 x17317415102512733138 = new X17317415102512733138(v9493494307739248620, str, packageName, windowToken, o2, p, f01Var, map);
        P17112279574965248524 p17112279574965248524 = v9493494307739248620.a;
        if (p17112279574965248524 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        p17112279574965248524.a(new F16393152783805540385(v9493494307739248620, bundle, x17317415102512733138, (byte) 4));
    }

    public final void a(String str) {
        R2847330884077978889 r2847330884077978889 = (R2847330884077978889) ((V11923105316530470448) this.c.f());
        if (((S9286526287894964911) r2847330884077978889.c.get(str)) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", r2847330884077978889.a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            r2847330884077978889.b.a(new B451504449649050588(r2847330884077978889, bundle));
        }
        c();
    }

    public final void b(String str, String str2, f01 f01Var, Map map, boolean z) {
        Context context = this.a;
        Intent B = C468629748621011703.B(str, str2, context.getPackageName(), map);
        if (!this.e) {
            Activity activity = (Activity) context;
            if (this.g == null) {
                S10973172697741180971.m("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
                return;
            }
            B.addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            B.addFlags(262144);
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(B, 65536);
            H3430986877638506198 h3430986877638506198 = this.b;
            if (resolveActivity != null) {
                d();
                activity.startActivityForResult(B, 0);
                e(str, f01Var, map, (E17835566830149380994) h3430986877638506198.f(), activity);
                return;
            } else if (this.d) {
                e(str, f01Var, map, (E17835566830149380994) h3430986877638506198.f(), activity);
                return;
            } else {
                activity.startActivityForResult(C468629748621011703.y(str, str2, map), 0);
                return;
            }
        }
        Uri data = B.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            f01Var.onError(bundle);
            return;
        }
        String uri = data.toString();
        if (context instanceof Activity) {
            Activity activity2 = (Activity) context;
            H3430986877638506198 h34309868776385061982 = this.c;
            IInterface iInterface = (T8664623300549140039) ((IInterface) ((R2847330884077978889) ((V11923105316530470448) h34309868776385061982.f())).b.j);
            if (iInterface == null || !((I11267981316413440737) iInterface).b.isBinderAlive()) {
                d();
            }
            ((R2847330884077978889) ((V11923105316530470448) h34309868776385061982.f())).a(str, uri, activity2.getWindow().getDecorView().getWindowToken(), T13998044911588922055.o(activity2, activity2.getResources().getConfiguration().screenWidthDp), T13998044911588922055.p(activity2), z, !this.f ? new B7737662242554011465(this, f01Var, activity2, str, str2, map) : new X7555133151306842378(this, f01Var, activity2, str, str2, map));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
        intent.putExtra("target_package_name", str);
        intent.putExtra("referrer", str2);
        intent.putExtra("auto_trigger", z);
        intent.putExtra("deeplink_url", uri);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle2.putString((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtra("extra_query_params_bundle", bundle2);
        intent.addFlags(262144);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    public final void c() {
        if (this.f) {
            Activity activity = (Activity) this.a;
            I1632105416032993715 i1632105416032993715 = this.g;
            if (i1632105416032993715 == null) {
                S10973172697741180971.m("hsdpLoadingPanel cannot be null when loading panel is enabled.");
                return;
            }
            View view = (View) i1632105416032993715.d;
            if (view != null) {
                ((Activity) i1632105416032993715.b).runOnUiThread(new I3863025946240164840(i1632105416032993715, view, (byte) 20));
            }
            if (this.h != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.h);
                this.h = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J6457333644812339360.d():void");
    }
}
