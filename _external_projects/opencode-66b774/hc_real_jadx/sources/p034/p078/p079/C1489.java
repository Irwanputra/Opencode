package p034.p078.p079;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1489 extends Animation {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ SwipeRefreshLayout f6872;

    public C1489(SwipeRefreshLayout swipeRefreshLayout) {
        this.f6872 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f6872.setAnimationProgress(f);
    }
}
