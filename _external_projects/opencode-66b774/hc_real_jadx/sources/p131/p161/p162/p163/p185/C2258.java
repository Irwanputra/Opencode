package p131.p161.p162.p163.p185;

import android.view.View;
import p034.p035.p045.C1072;
import p034.p095.C1687;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2258 implements InterfaceC2263 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9390;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9391;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9392;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2263 f9393;

    public C2258(boolean z, boolean z2, boolean z3, InterfaceC2263 interfaceC2263) {
        this.f9392 = z;
        this.f9390 = z2;
        this.f9391 = z3;
        this.f9393 = interfaceC2263;
    }

    @Override // p131.p161.p162.p163.p185.InterfaceC2263
    /* renamed from: げつ〴ぬぐ */
    public C1072 mo1327(View view, C1072 c1072, C2271 c2271) {
        if (this.f9392) {
            c2271.f9465 = c1072.m2420() + c2271.f9465;
        }
        boolean m3675 = C1687.m3675(view);
        if (this.f9390) {
            if (m3675) {
                c2271.f9463 = c1072.m2422() + c2271.f9463;
            } else {
                c2271.f9464 = c1072.m2422() + c2271.f9464;
            }
        }
        if (this.f9391) {
            if (m3675) {
                c2271.f9464 = c1072.m2426() + c2271.f9464;
            } else {
                c2271.f9463 = c1072.m2426() + c2271.f9463;
            }
        }
        c2271.m4439(view);
        InterfaceC2263 interfaceC2263 = this.f9393;
        return interfaceC2263 != null ? interfaceC2263.mo1327(view, c1072, c2271) : c1072;
    }
}
