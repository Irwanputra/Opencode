package p034.p095;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: づざかべべ.は〲ぱなで.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1686 extends FrameLayout {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final /* synthetic */ int f7802 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ViewGroup f7803;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f7804;

    public C1686(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f7803 = viewGroup;
        viewGroup.setTag(C1740.ghost_view_holder, this);
        C1713.m3759(this.f7803).mo3746(this);
        this.f7804 = true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m3650(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m3650((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f7804) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f7803.setTag(C1740.ghost_view_holder, null);
            C1713.m3759(this.f7803).mo3745(this);
            this.f7804 = false;
        }
    }
}
