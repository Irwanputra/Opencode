package p131.p161.p162.p193.p194.p199.p201;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.zzaig;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.くし〴〺ぅ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2406 extends RelativeLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzaig f9736;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f9737;

    public C2406(Context context, String str, String str2) {
        super(context);
        zzaig zzaigVar = new zzaig(context, str);
        this.f9736 = zzaigVar;
        zzaigVar.zzcl(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9737) {
            return false;
        }
        this.f9736.zze(motionEvent);
        return false;
    }
}
