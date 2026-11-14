package dev.epro.r0;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H1785888784825263132 extends C7384315755006527706 {
    final /* synthetic */ I4909713222951731791 this$0;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Z11244019023321623390 extends C7384315755006527706 {
        final /* synthetic */ I4909713222951731791 this$0;

        public Z11244019023321623390(I4909713222951731791 i4909713222951731791) {
            this.this$0 = i4909713222951731791;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            I4909713222951731791 i4909713222951731791 = this.this$0;
            int i = i4909713222951731791.a + 1;
            i4909713222951731791.a = i;
            if (i == 1 && i4909713222951731791.d) {
                i4909713222951731791.f.e(P72364327365747079.ON_START);
                i4909713222951731791.d = false;
            }
        }
    }

    public H1785888784825263132(I4909713222951731791 i4909713222951731791) {
        this.this$0 = i4909713222951731791;
    }

    @Override // dev.epro.r0.C7384315755006527706, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = R11891371385360051901.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((R11891371385360051901) fragmentFindFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // dev.epro.r0.C7384315755006527706, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        I4909713222951731791 i4909713222951731791 = this.this$0;
        int i = i4909713222951731791.b - 1;
        i4909713222951731791.b = i;
        if (i == 0) {
            Handler handler = i4909713222951731791.e;
            handler.getClass();
            handler.postDelayed(i4909713222951731791.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        N13459929895848246258.m(activity, new Z11244019023321623390(this.this$0));
    }

    @Override // dev.epro.r0.C7384315755006527706, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        I4909713222951731791 i4909713222951731791 = this.this$0;
        int i = i4909713222951731791.a - 1;
        i4909713222951731791.a = i;
        if (i == 0 && i4909713222951731791.c) {
            i4909713222951731791.f.e(P72364327365747079.ON_STOP);
            i4909713222951731791.d = true;
        }
    }
}
