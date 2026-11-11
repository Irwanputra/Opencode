package p131.p161.p162.p163.p172;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉざぅち〻.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2159 extends AnimatorListenerAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ActionMenuView f9030;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f9031;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f9032;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ BottomAppBar f9033;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ boolean f9034;

    public C2159(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f9033 = bottomAppBar;
        this.f9030 = actionMenuView;
        this.f9031 = i;
        this.f9034 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f9032 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f9032) {
            return;
        }
        BottomAppBar bottomAppBar = this.f9033;
        ActionMenuView actionMenuView = this.f9030;
        int i = this.f9031;
        boolean z = this.f9034;
        int i2 = BottomAppBar.f3003;
        actionMenuView.setTranslationX(bottomAppBar.m1321(actionMenuView, i, z));
    }
}
