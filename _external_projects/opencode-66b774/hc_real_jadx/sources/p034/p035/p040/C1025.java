package p034.p035.p040;

import android.os.Handler;
import p034.p035.p040.C1027;
import p034.p035.p040.C1032;
import p034.p035.p043.p044.AbstractC1059;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1025 implements C1032.InterfaceC1034<C1027.C1031> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Handler f5419;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1059 f5420;

    public C1025(AbstractC1059 abstractC1059, Handler handler) {
        this.f5420 = abstractC1059;
        this.f5419 = handler;
    }

    @Override // p034.p035.p040.C1032.InterfaceC1034
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo2365(C1027.C1031 c1031) {
        int i;
        AbstractC1059 abstractC1059;
        C1027.C1031 c10312 = c1031;
        if (c10312 == null) {
            abstractC1059 = this.f5420;
            i = 1;
        } else {
            i = c10312.f5438;
            if (i == 0) {
                this.f5420.m2397(c10312.f5439, this.f5419);
                return;
            }
            abstractC1059 = this.f5420;
        }
        abstractC1059.m2399(i, this.f5419);
    }
}
