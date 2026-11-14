package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q7424779606472524857 implements Application.ActivityLifecycleCallbacks {
    public final Activity a;
    public final /* synthetic */ X17123927029532314696 b;

    public Q7424779606472524857(X17123927029532314696 x17123927029532314696, Activity activity) {
        this.b = x17123927029532314696;
        this.a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        X17123927029532314696 x17123927029532314696 = this.b;
        Dialog dialog = x17123927029532314696.g;
        AtomicReference atomicReference = x17123927029532314696.l;
        if (dialog == null || !x17123927029532314696.m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        O6655543165492094776 o6655543165492094776 = x17123927029532314696.b;
        if (o6655543165492094776 != null) {
            o6655543165492094776.a = activity;
        }
        Q7424779606472524857 q7424779606472524857 = (Q7424779606472524857) atomicReference.getAndSet(null);
        if (q7424779606472524857 != null) {
            q7424779606472524857.b.a.unregisterActivityLifecycleCallbacks(q7424779606472524857);
            Q7424779606472524857 q74247796064725248572 = new Q7424779606472524857(x17123927029532314696, activity);
            x17123927029532314696.a.registerActivityLifecycleCallbacks(q74247796064725248572);
            atomicReference.set(q74247796064725248572);
        }
        Dialog dialog2 = x17123927029532314696.g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.a) {
            return;
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        X17123927029532314696 x17123927029532314696 = this.b;
        if (isChangingConfigurations && x17123927029532314696.m && (dialog = x17123927029532314696.g) != null) {
            dialog.dismiss();
            return;
        }
        I10210771329789820200 i10210771329789820200 = new I10210771329789820200(3, "Activity is destroyed.");
        Dialog dialog2 = x17123927029532314696.g;
        if (dialog2 != null) {
            dialog2.dismiss();
            x17123927029532314696.g = null;
        }
        x17123927029532314696.b.a = null;
        Q7424779606472524857 q7424779606472524857 = (Q7424779606472524857) x17123927029532314696.l.getAndSet(null);
        if (q7424779606472524857 != null) {
            q7424779606472524857.b.a.unregisterActivityLifecycleCallbacks(q7424779606472524857);
        }
        S14143580604745876919 s14143580604745876919 = (S14143580604745876919) x17123927029532314696.k.getAndSet(null);
        if (s14143580604745876919 == null) {
            return;
        }
        x17123927029532314696.d(i10210771329789820200);
        s14143580604745876919.a(i10210771329789820200.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
