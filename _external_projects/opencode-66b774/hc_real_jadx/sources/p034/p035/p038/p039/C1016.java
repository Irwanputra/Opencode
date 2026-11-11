package p034.p035.p038.p039;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.てぜきぽく.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1016 extends Drawable.ConstantState {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Drawable.ConstantState f5399;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ColorStateList f5400;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f5401;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public PorterDuff.Mode f5402;

    public C1016(C1016 c1016) {
        this.f5400 = null;
        this.f5402 = C1014.f5392;
        if (c1016 != null) {
            this.f5401 = c1016.f5401;
            this.f5399 = c1016.f5399;
            this.f5400 = c1016.f5400;
            this.f5402 = c1016.f5402;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f5401;
        Drawable.ConstantState constantState = this.f5399;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C1017(this, resources) : new C1014(this, resources);
    }
}
