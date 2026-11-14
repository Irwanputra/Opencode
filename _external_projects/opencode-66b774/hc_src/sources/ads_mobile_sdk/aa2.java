package ads_mobile_sdk;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import dev.epro.r0.S13562717617822485216;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class aa2 extends S13562717617822485216 {
    public final /* synthetic */ ea2 a;
    public final /* synthetic */ od1 b;

    public aa2(ea2 ea2Var, od1 od1Var) {
        this.a = ea2Var;
        this.b = od1Var;
    }

    @Override // dev.epro.r0.S13562717617822485216
    public final void a(AdActivity adActivity, LinearLayout linearLayout) {
        FrameLayout frameLayout = new FrameLayout(adActivity);
        frameLayout.setTag("layout");
        frameLayout.setBackgroundColor(-1);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ea2 ea2Var = this.a;
        String str = ea2Var.l;
        layoutParams.gravity = str.equals("TOP") ? 49 : str.equals("BOTTOM") ? 81 : 17;
        int i = ea2Var.f30o;
        if (i > 0) {
            layoutParams.width = (int) TypedValue.applyDimension(1, i, adActivity.getResources().getDisplayMetrics());
        }
        View view = this.b.m;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        frameLayout.addView(view, layoutParams);
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(frameLayout);
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onDestroy() {
        this.b.destroy();
    }
}
