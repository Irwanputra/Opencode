package dev.epro.r0;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import dev.epro.r0.R11891371385360051901;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class T4867633725758960939 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, P72364327365747079 p72364327365747079) {
        p72364327365747079.getClass();
        if (activity instanceof I4293432593871965076) {
            R3192876217964974737 j = ((I4293432593871965076) activity).j();
            if (j instanceof I1283052979100930176) {
                ((I1283052979100930176) j).e(p72364327365747079);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            R11891371385360051901.Z11244019023321623390.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new R11891371385360051901.Z11244019023321623390());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new R11891371385360051901(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
