package p131.p161.p162.p193.p194.p199.p201;

import android.graphics.drawable.Drawable;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.くし〴〺ぅ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2405 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ Drawable f9734;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ C2404 f9735;

    public RunnableC2405(C2404 c2404, Drawable drawable) {
        this.f9735 = c2404;
        this.f9734 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9735.f9733.f2637.getWindow().setBackgroundDrawable(this.f9734);
    }
}
