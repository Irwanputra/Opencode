package p244.p245.p246.p247;

import android.os.Bundle;
import p034.p105.p106.AbstractC1780;
import p244.p245.p246.C2838;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2832<T> extends AbstractC2834<T> {
    public AbstractC2832(T t) {
        super(t);
    }

    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo4942(String str, String str2, String str3, int i, int i2, String... strArr) {
        AbstractC1780 mo4940 = mo4940();
        if (mo4940.mo3822("RationaleDialogFragmentCompat") instanceof C2838) {
            return;
        }
        C2838 c2838 = new C2838();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i);
        bundle.putInt("requestCode", i2);
        bundle.putStringArray("permissions", strArr);
        c2838.m475(bundle);
        if (mo4940.mo3821()) {
            return;
        }
        c2838.m3825(mo4940, "RationaleDialogFragmentCompat");
    }

    /* renamed from: なぎぱいぢぎ */
    public abstract AbstractC1780 mo4940();
}
