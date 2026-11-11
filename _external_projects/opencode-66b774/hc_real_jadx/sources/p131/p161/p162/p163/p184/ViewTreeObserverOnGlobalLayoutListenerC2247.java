package p131.p161.p162.p163.p184;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;
import p131.p161.p162.p163.p185.C2272;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.どぇぞほだ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC2247 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ NavigationView f9364;

    public ViewTreeObserverOnGlobalLayoutListenerC2247(NavigationView navigationView) {
        this.f9364 = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f9364;
        navigationView.getLocationOnScreen(navigationView.f3358);
        NavigationView navigationView2 = this.f9364;
        boolean z = navigationView2.f3358[1] == 0;
        C2272 c2272 = navigationView2.f3352;
        if (c2272.f9471 != z) {
            c2272.f9471 = z;
            c2272.m4443();
        }
        this.f9364.setDrawTopInsetForeground(z);
        Context context = this.f9364.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.f9364.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == this.f9364.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
    }
}
