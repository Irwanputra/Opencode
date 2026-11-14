package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class R11891371385360051901 extends Fragment {
    public static final /* synthetic */ int b = 0;
    public F6942723054099263096 a;

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Z11244019023321623390 implements Application.ActivityLifecycleCallbacks {
        public static final E11575356292173820582 Companion = new E11575356292173820582();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new Z11244019023321623390());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = R11891371385360051901.b;
            T4867633725758960939.a(activity, P72364327365747079.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void a(P72364327365747079 p72364327365747079) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            T4867633725758960939.a(activity, p72364327365747079);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(P72364327365747079.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(P72364327365747079.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(P72364327365747079.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        F6942723054099263096 f6942723054099263096 = this.a;
        if (f6942723054099263096 != null) {
            ((I4909713222951731791) f6942723054099263096.b).c();
        }
        a(P72364327365747079.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        F6942723054099263096 f6942723054099263096 = this.a;
        if (f6942723054099263096 != null) {
            I4909713222951731791 i4909713222951731791 = (I4909713222951731791) f6942723054099263096.b;
            int i = i4909713222951731791.a + 1;
            i4909713222951731791.a = i;
            if (i == 1 && i4909713222951731791.d) {
                i4909713222951731791.f.e(P72364327365747079.ON_START);
                i4909713222951731791.d = false;
            }
        }
        a(P72364327365747079.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(P72364327365747079.ON_STOP);
    }
}
