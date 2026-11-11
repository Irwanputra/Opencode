package p034.p035.p045;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1114 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Object f5612;

    public C1114(Object obj) {
        this.f5612 = obj;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1114 m2557(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new C1114(PointerIcon.getSystemIcon(context, i)) : new C1114(null);
    }
}
