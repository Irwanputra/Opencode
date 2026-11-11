package p034.p035.p040;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;
import p034.p035.p040.C1027;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class CallableC1022 implements Callable<C1027.C1031> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C1026 f5410;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f5411;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Context f5412;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ String f5413;

    public CallableC1022(Context context, C1026 c1026, int i, String str) {
        this.f5412 = context;
        this.f5410 = c1026;
        this.f5411 = i;
        this.f5413 = str;
    }

    @Override // java.util.concurrent.Callable
    public C1027.C1031 call() {
        C1027.C1031 m2366 = C1027.m2366(this.f5412, this.f5410, this.f5411);
        Typeface typeface = m2366.f5439;
        if (typeface != null) {
            C1027.f5428.m3284(this.f5413, typeface);
        }
        return m2366;
    }
}
