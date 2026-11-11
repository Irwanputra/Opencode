package p244.p245.p246.p247;

import android.content.Context;
import androidx.fragment.app.Fragment;
import p034.p105.p106.AbstractC1780;
import p034.p105.p106.AbstractC1784;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ.〳ぜぞぜべっ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2835 extends AbstractC2832<Fragment> {
    public C2835(Fragment fragment) {
        super(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: 〺つふすそ */
    public Context mo4938() {
        return ((Fragment) this.f10524).m525();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: げつ〴ぬぐ */
    public void mo4939(int i, String... strArr) {
        Fragment fragment = (Fragment) this.f10524;
        AbstractC1784 abstractC1784 = fragment.f1192;
        if (abstractC1784 == null) {
            throw new IllegalStateException(C2098.m4193("Fragment ", fragment, " not attached to Activity"));
        }
        abstractC1784.mo546(fragment, strArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2832
    /* renamed from: なぎぱいぢぎ */
    public AbstractC1780 mo4940() {
        return ((Fragment) this.f10524).m530();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p244.p245.p246.p247.AbstractC2834
    /* renamed from: びぐびあび */
    public boolean mo4941(String str) {
        AbstractC1784 abstractC1784 = ((Fragment) this.f10524).f1192;
        if (abstractC1784 != null) {
            return abstractC1784.mo549(str);
        }
        return false;
    }
}
