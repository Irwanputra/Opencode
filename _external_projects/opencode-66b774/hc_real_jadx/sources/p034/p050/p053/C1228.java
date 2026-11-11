package p034.p050.p053;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.じぜこほぱ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1228 extends C1254 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final WeakReference<Context> f6039;

    public C1228(Context context, Resources resources) {
        super(resources);
        this.f6039 = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f6142.getDrawable(i);
        Context context = this.f6039.get();
        if (drawable != null && context != null) {
            C1234.m2853().m2860(context, i, drawable);
        }
        return drawable;
    }
}
