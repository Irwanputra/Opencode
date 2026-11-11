package p034.p050.p053;

import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1211 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f5988;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ ScrollingTabContainerView f5989;

    public RunnableC1211(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f5989 = scrollingTabContainerView;
        this.f5988 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5989.smoothScrollTo(this.f5988.getLeft() - ((this.f5989.getWidth() - this.f5988.getWidth()) / 2), 0);
        this.f5989.f466 = null;
    }
}
