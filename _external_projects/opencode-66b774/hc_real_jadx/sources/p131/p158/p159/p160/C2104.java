package p131.p158.p159.p160;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.github.clans.fab.FloatingActionMenu;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2104 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f8903;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f8904;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ int f8905;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8906;

    public C2104(FloatingActionMenu floatingActionMenu, int i, int i2, int i3) {
        this.f8906 = floatingActionMenu;
        this.f8905 = i;
        this.f8903 = i2;
        this.f8904 = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8906.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f8905, this.f8903, this.f8904));
    }
}
