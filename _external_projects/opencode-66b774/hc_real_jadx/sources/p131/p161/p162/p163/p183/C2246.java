package p131.p161.p162.p163.p183;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2246 extends ViewOutlineProvider {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Chip f9363;

    public C2246(Chip chip) {
        this.f9363 = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C2244 c2244 = this.f9363.f3213;
        if (c2244 != null) {
            c2244.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
