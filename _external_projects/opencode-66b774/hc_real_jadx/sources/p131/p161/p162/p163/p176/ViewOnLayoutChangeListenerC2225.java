package p131.p161.p162.p163.p176;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.けときぜと.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnLayoutChangeListenerC2225 implements View.OnLayoutChangeListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ TabLayout.TabView f9239;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ View f9240;

    public ViewOnLayoutChangeListenerC2225(TabLayout.TabView tabView, View view) {
        this.f9239 = tabView;
        this.f9240 = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f9240.getVisibility() == 0) {
            TabLayout.TabView tabView = this.f9239;
            View view2 = this.f9240;
            int i9 = TabLayout.TabView.f3487;
            tabView.m1490(view2);
        }
    }
}
