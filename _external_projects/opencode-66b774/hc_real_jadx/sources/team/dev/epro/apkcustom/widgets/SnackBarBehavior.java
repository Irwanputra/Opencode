package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SnackBarBehavior extends CoordinatorLayout.Behavior<FloatingActionMenu> {
    public SnackBarBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: 〳ぜぞぜべっ */
    public void mo343(CoordinatorLayout coordinatorLayout, FloatingActionMenu floatingActionMenu, View view) {
        floatingActionMenu.setTranslationY(Math.min(0, coordinatorLayout.getBottom() - r2.getBottom()));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: ぁごぐすすぃ */
    public boolean mo346(CoordinatorLayout coordinatorLayout, FloatingActionMenu floatingActionMenu, View view) {
        floatingActionMenu.setTranslationY(Math.min(0.0f, view.getTranslationY() - view.getHeight()));
        return false;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean m1714(View view) {
        return view instanceof Snackbar$SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びぐびあび */
    public /* bridge */ /* synthetic */ boolean mo365(CoordinatorLayout coordinatorLayout, FloatingActionMenu floatingActionMenu, View view) {
        return m1714(view);
    }
}
