package p107.p108.p109.p110.p119;

import p131.p135.p142.InterfaceC2025;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1927 implements InterfaceC2025 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1867 f8404;

    public C1927(C1867 c1867) {
        this.f8404 = c1867;
    }

    @Override // p131.p135.p142.InterfaceC2025
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4014(long j, long j2) {
        if (j2 < 0) {
            j2 = 1300000;
        }
        C1867 c1867 = this.f8404;
        c1867.f8301 = (int) ((j * 100) / j2);
        c1867.f8283.setVisibility(8);
        C1867 c18672 = this.f8404;
        c18672.m3995(1, 2131820789, c18672.f8301);
        this.f8404.f8282++;
    }
}
