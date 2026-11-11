package p034.p095;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: づざかべべ.は〲ぱなで.〺でおいここ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1688 extends C1704 {

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static boolean f7818 = true;

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo3738(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3738(view, i);
        } else if (f7818) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f7818 = false;
            }
        }
    }
}
