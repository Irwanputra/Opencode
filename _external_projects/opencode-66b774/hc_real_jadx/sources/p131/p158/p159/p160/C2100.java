package p131.p158.p159.p160;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.github.clans.fab.FloatingActionMenu;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2100 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f8898;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f8899;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ int f8900;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8901;

    public C2100(FloatingActionMenu floatingActionMenu, int i, int i2, int i3) {
        this.f8901 = floatingActionMenu;
        this.f8900 = i;
        this.f8898 = i2;
        this.f8899 = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8901.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f8900, this.f8898, this.f8899));
    }
}
