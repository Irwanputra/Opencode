package dev.epro.r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G7019617308371076781 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public G7019617308371076781(P5210161598916505319 p5210161598916505319, View view) {
        this.a = (byte) 3;
        this.b = p5210161598916505319;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.k = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 3:
                ((P5210161598916505319) obj).d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                I5811816837469502949 i5811816837469502949 = (I5811816837469502949) obj;
                ArrayList arrayList = new ArrayList(i5811816837469502949.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((Q8205248782310272441) arrayList.get(i)).b.f584o;
                    if (colorStateList != null) {
                        i5811816837469502949.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                ((P5210161598916505319) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                I5811816837469502949 i5811816837469502949 = (I5811816837469502949) obj;
                ArrayList arrayList = new ArrayList(i5811816837469502949.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Y16323135829722613314 y16323135829722613314 = ((Q8205248782310272441) arrayList.get(i)).b;
                    ColorStateList colorStateList = y16323135829722613314.f584o;
                    if (colorStateList != null) {
                        i5811816837469502949.setTint(colorStateList.getColorForState(y16323135829722613314.s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                ((P5210161598916505319) obj).f();
                break;
        }
    }

    public /* synthetic */ G7019617308371076781(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
