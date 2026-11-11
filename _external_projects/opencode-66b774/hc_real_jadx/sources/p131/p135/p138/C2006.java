package p131.p135.p138;

import p131.p135.p136.C1973;
import p243.AbstractC2806;
import p243.C2819;
import p243.InterfaceC2827;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2006 extends AbstractC2806 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f8729;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1997 f8730;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2006(C1997 c1997, InterfaceC2827 interfaceC2827) {
        super(interfaceC2827);
        this.f8730 = c1997;
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        long mo1762 = this.f10474.mo1762(c2819, j);
        long j2 = this.f8729 + (mo1762 != -1 ? mo1762 : 0L);
        this.f8729 = j2;
        C1997 c1997 = this.f8730;
        HandlerC2005 handlerC2005 = c1997.f8714;
        if (handlerC2005 != null) {
            handlerC2005.obtainMessage(1, new C1973(j2, c1997.f8712.mo1727())).sendToTarget();
        }
        return mo1762;
    }
}
