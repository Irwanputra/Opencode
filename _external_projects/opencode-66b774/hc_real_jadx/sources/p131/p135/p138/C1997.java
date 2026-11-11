package p131.p135.p138;

import java.util.logging.Logger;
import p000.AbstractC0592;
import p131.p135.p142.InterfaceC2025;
import p243.C2810;
import p243.C2817;
import p243.InterfaceC2805;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1997 extends AbstractC0592 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC0592 f8712;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC2805 f8713;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public HandlerC2005 f8714;

    public C1997(AbstractC0592 abstractC0592, InterfaceC2025 interfaceC2025) {
        this.f8712 = abstractC0592;
        this.f8714 = new HandlerC2005(interfaceC2025);
    }

    @Override // p000.AbstractC0592
    /* renamed from: じぜこほぱ */
    public long mo1727() {
        return this.f8712.mo1727();
    }

    @Override // p000.AbstractC0592
    /* renamed from: ぺづげぺが */
    public InterfaceC2805 mo1728() {
        if (this.f8713 == null) {
            C2006 c2006 = new C2006(this, this.f8712.mo1728());
            Logger logger = C2810.f10480;
            this.f8713 = new C2817(c2006);
        }
        return this.f8713;
    }
}
