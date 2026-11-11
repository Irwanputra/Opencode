package p034.p095;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: づざかべべ.は〲ぱなで.ぷぞてのほき, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1739 extends C1708 {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static boolean f7926 = true;

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: 〺つふすそ */
    public float mo3748(View view) {
        if (f7926) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f7926 = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p034.p095.C1708
    /* renamed from: くし〴〺ぅ */
    public void mo3756(View view) {
    }

    @Override // p034.p095.C1708
    /* renamed from: げつ〴ぬぐ */
    public void mo3757(View view) {
    }

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: なぎぱいぢぎ */
    public void mo3750(View view, float f) {
        if (f7926) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f7926 = false;
            }
        }
        view.setAlpha(f);
    }
}
