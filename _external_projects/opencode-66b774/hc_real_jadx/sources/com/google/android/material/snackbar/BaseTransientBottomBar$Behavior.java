package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p131.p161.p162.p163.p190.C2336;
import p131.p161.p162.p163.p190.C2337;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C2336 f3422 = new C2336(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: いいにぽつ */
    public boolean mo347(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3422.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C2337.f9621 == null) {
                    C2337.f9621 = new C2337();
                }
                synchronized (C2337.f9621.f9623) {
                }
            }
        } else if (coordinatorLayout.m333(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C2337.f9621 == null) {
                C2337.f9621 = new C2337();
            }
            synchronized (C2337.f9621.f9623) {
            }
        }
        return super.mo347(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: なぶひせが */
    public boolean mo1310(View view) {
        this.f3422.getClass();
        return view instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }
}
