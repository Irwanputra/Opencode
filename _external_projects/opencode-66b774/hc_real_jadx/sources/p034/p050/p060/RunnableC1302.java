package p034.p050.p060;

import android.view.View;
import p034.p035.p045.C1096;
import p034.p035.p045.C1104;
import p034.p035.p045.C1112;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1302 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C1320 f6307;

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1303 extends C1112 {
        public C1303() {
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            RunnableC1302.this.f6307.f6361.setAlpha(1.0f);
            RunnableC1302.this.f6307.f6389.m2538(null);
            RunnableC1302.this.f6307.f6389 = null;
        }

        @Override // p034.p035.p045.C1112, p034.p035.p045.InterfaceC1108
        /* renamed from: くし〴〺ぅ */
        public void mo2540(View view) {
            RunnableC1302.this.f6307.f6361.setVisibility(0);
        }
    }

    public RunnableC1302(LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320) {
        this.f6307 = layoutInflaterFactory2C1320;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320 = this.f6307;
        layoutInflaterFactory2C1320.f6364.showAtLocation(layoutInflaterFactory2C1320.f6361, 55, 0, 0);
        this.f6307.m2983();
        if (!this.f6307.m2987()) {
            this.f6307.f6361.setAlpha(1.0f);
            this.f6307.f6361.setVisibility(0);
            return;
        }
        this.f6307.f6361.setAlpha(0.0f);
        LayoutInflaterFactory2C1320 layoutInflaterFactory2C13202 = this.f6307;
        C1104 m2495 = C1096.m2495(layoutInflaterFactory2C13202.f6361);
        m2495.m2535(1.0f);
        layoutInflaterFactory2C13202.f6389 = m2495;
        this.f6307.f6389.m2538(new C1303());
    }
}
