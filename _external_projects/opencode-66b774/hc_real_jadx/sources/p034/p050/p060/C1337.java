package p034.p050.p060;

import android.view.View;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1121;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1337 implements InterfaceC1121 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C1320 f6440;

    public C1337(LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320) {
        this.f6440 = layoutInflaterFactory2C1320;
    }

    @Override // p034.p035.p045.InterfaceC1121
    /* renamed from: げつ〴ぬぐ */
    public C1072 mo370(View view, C1072 c1072) {
        int m2424 = c1072.m2424();
        int m2985 = this.f6440.m2985(c1072, null);
        if (m2424 != m2985) {
            c1072 = c1072.m2427(c1072.m2422(), m2985, c1072.m2426(), c1072.m2420());
        }
        return C1096.m2511(view, c1072);
    }
}
