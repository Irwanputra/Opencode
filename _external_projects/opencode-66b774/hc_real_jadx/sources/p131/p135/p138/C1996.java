package p131.p135.p138;

import p131.p135.p136.C1973;
import p243.AbstractC2829;
import p243.C2819;
import p243.InterfaceC2822;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1996 extends AbstractC2829 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f8709;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ C1989 f8710;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public long f8711;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1996(C1989 c1989, InterfaceC2822 interfaceC2822) {
        super(interfaceC2822);
        this.f8710 = c1989;
        this.f8709 = 0L;
        this.f8711 = 0L;
    }

    @Override // p243.InterfaceC2822
    /* renamed from: びぐびあび */
    public void mo1765(C2819 c2819, long j) {
        this.f10522.mo1765(c2819, j);
        if (this.f8711 == 0) {
            this.f8711 = this.f8710.mo1730();
        }
        long j2 = this.f8709 + j;
        this.f8709 = j2;
        HandlerC2007 handlerC2007 = this.f8710.f8688;
        if (handlerC2007 != null) {
            handlerC2007.obtainMessage(1, new C1973(j2, this.f8711)).sendToTarget();
        }
    }
}
