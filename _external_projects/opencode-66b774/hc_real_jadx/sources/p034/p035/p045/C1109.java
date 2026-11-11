package p034.p035.p045;

import android.view.View;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1109 extends C1096.AbstractC1097<Boolean> {
    public C1109(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // p034.p035.p045.C1096.AbstractC1097
    /* renamed from: 〺つふすそ */
    public Boolean mo2444(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean m2542(Object obj, Object obj2) {
        return !m2524((Boolean) obj, (Boolean) obj2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2543(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }
}
