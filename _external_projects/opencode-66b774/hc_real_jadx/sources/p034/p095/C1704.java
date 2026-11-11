package p034.p095;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: づざかべべ.は〲ぱなで.おかぷせ〱, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1704 extends C1707 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static boolean f7848 = true;

    @Override // p034.p095.C1708
    @SuppressLint({"NewApi"})
    /* renamed from: づざかべべ */
    public void mo3749(View view, int i, int i2, int i3, int i4) {
        if (f7848) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f7848 = false;
            }
        }
    }
}
