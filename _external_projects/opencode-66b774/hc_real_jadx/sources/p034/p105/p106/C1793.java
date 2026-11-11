package p034.p105.p106;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1793 extends AbstractC1812 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Fragment f8066;

    public C1793(Fragment fragment) {
        this.f8066 = fragment;
    }

    @Override // p034.p105.p106.AbstractC1812
    /* renamed from: 〺つふすそ */
    public boolean mo540() {
        return this.f8066.f1186 != null;
    }

    @Override // p034.p105.p106.AbstractC1812
    /* renamed from: げつ〴ぬぐ */
    public View mo545(int i) {
        View view = this.f8066.f1186;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }
}
