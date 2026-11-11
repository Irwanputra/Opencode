package p034.p095;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* renamed from: づざかべべ.は〲ぱなで.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1737 extends AbstractC1692 {
    @Override // p034.p095.AbstractC1738
    /* renamed from: げつ〴ぬぐ */
    public long mo3753(ViewGroup viewGroup, Transition transition, C1700 c1700, C1700 c17002) {
        int i;
        int round;
        int i2;
        if (c1700 == null && c17002 == null) {
            return 0L;
        }
        if (c17002 == null || m3742(c1700) == 0) {
            i = -1;
        } else {
            c1700 = c17002;
            i = 1;
        }
        int m3741 = AbstractC1692.m3741(c1700, 0);
        int m37412 = AbstractC1692.m3741(c1700, 1);
        Rect m1039 = transition.m1039();
        if (m1039 != null) {
            i2 = m1039.centerX();
            round = m1039.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            i2 = round2;
        }
        float f = i2 - m3741;
        float f2 = round - m37412;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j = transition.f1802;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * i) / 3.0f) * sqrt2);
    }
}
