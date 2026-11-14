package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Arrays;
import java.util.LinkedHashSet;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class F3333679059580639958 implements Application.ActivityLifecycleCallbacks {
    public static final F3333679059580639958 a;
    public static final Handler b;
    public static final F17287084996581210871 c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final S17255966974483065294 f;
    public static final S14249227312368728278 g;
    public static boolean h;
    public static final Z3874088516406380299 i;

    static {
        int iWpdktvvfppho;
        izmyclvb.dpqpjfpoanwt1(1568);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iWpdktvvfppho = wpdktvvfppho(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWpdktvvfppho != 0) {
                switch (iWpdktvvfppho) {
                    case 1:
                        a = (F3333679059580639958) objArr[1];
                        continue;
                    case 2:
                        b = (Handler) objArr[1];
                        continue;
                    case 3:
                        c = (F17287084996581210871) objArr[1];
                        continue;
                    case 4:
                        d = (LinkedHashSet) objArr[1];
                        continue;
                    case 5:
                        e = (LinkedHashSet) objArr[1];
                        continue;
                    case 6:
                        f = (S17255966974483065294) objArr[1];
                        continue;
                    case 7:
                        g = (S14249227312368728278) objArr[1];
                        continue;
                    case 8:
                        i = (Z3874088516406380299) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a();

    public static native void b();

    public static native void c(Object obj, boolean z);

    private static native int wpdktvvfppho(Object[] objArr);

    private native void wtujurrxctvb();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStopped(Activity activity);

    private F3333679059580639958() {
        wtujurrxctvb();
    }
}
