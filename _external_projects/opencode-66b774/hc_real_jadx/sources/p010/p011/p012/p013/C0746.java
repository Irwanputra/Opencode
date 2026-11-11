package p010.p011.p012.p013;

import p107.p108.p109.p110.p113.p114.InterfaceC1838;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0746 implements InterfaceC1838 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0767 f4843;

    public C0746(RunnableC0767 runnableC0767, int i) {
        this.f4843 = runnableC0767;
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: 〺つふすそ */
    public void mo1630() {
        this.f4843.f4915 = false;
        System.currentTimeMillis();
        this.f4843.m2072("hold release\n");
        this.f4843.m2072("bytecount 2\n");
        this.f4843.m2072("state on\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException unused) {
        }
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: げつ〴ぬぐ */
    public void mo1631() {
        C0753.m2045(2131821324, String.valueOf(2));
    }
}
