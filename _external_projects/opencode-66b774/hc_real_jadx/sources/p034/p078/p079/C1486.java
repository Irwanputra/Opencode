package p034.p078.p079;

import android.animation.Animator;
import p034.p078.p079.C1491;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1486 implements Animator.AnimatorListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C1491 f6865;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1491.C1492 f6866;

    public C1486(C1491 c1491, C1491.C1492 c1492) {
        this.f6865 = c1491;
        this.f6866 = c1492;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f6865.m3241(1.0f, this.f6866, true);
        C1491.C1492 c1492 = this.f6866;
        c1492.f6903 = c1492.f6895;
        c1492.f6896 = c1492.f6897;
        c1492.f6898 = c1492.f6885;
        c1492.m3244((c1492.f6886 + 1) % c1492.f6902.length);
        C1491 c1491 = this.f6865;
        if (!c1491.f6878) {
            c1491.f6881 += 1.0f;
            return;
        }
        c1491.f6878 = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f6866.m3243(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f6865.f6881 = 0.0f;
    }
}
