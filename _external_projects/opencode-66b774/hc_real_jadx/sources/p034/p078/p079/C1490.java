package p034.p078.p079;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1490 extends Animation {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ SwipeRefreshLayout f6873;

    public C1490(SwipeRefreshLayout swipeRefreshLayout) {
        this.f6873 = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f6873;
        float f2 = swipeRefreshLayout.f1660;
        swipeRefreshLayout.setAnimationProgress(((-f2) * f) + f2);
        this.f6873.m981(f);
    }
}
