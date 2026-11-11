package p034.p095;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import p034.p035.p045.C1096;
import p034.p095.C1702;

/* renamed from: づざかべべ.は〲ぱなで.なぶひせが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1732 extends C1702 implements InterfaceC1695 {
    public C1732(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    @Override // p034.p095.InterfaceC1695
    /* renamed from: 〺つふすそ */
    public void mo3745(View view) {
        C1702.C1703 c1703 = this.f7842;
        c1703.removeView(view);
        c1703.m3755();
    }

    @Override // p034.p095.InterfaceC1695
    /* renamed from: げつ〴ぬぐ */
    public void mo3746(View view) {
        C1702.C1703 c1703 = this.f7842;
        if (c1703.f7846) {
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != c1703.f7843 && viewGroup.getParent() != null && C1096.m2507(viewGroup)) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                c1703.f7843.getLocationOnScreen(iArr2);
                C1096.m2483(view, iArr[0] - iArr2[0]);
                C1096.m2515(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        c1703.addView(view);
    }
}
