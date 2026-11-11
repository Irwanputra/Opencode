package p131.p135.p138;

import java.util.logging.Logger;
import p000.AbstractC0719;
import p000.C0695;
import p131.p135.p142.InterfaceC2020;
import p243.C2809;
import p243.C2810;
import p243.InterfaceC2823;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1989 extends AbstractC0719 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC2823 f8687;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public HandlerC2007 f8688;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final AbstractC0719 f8689;

    public C1989(AbstractC0719 abstractC0719, InterfaceC2020 interfaceC2020) {
        this.f8689 = abstractC0719;
        this.f8688 = new HandlerC2007(interfaceC2020);
    }

    @Override // p000.AbstractC0719
    /* renamed from: 〺つふすそ */
    public C0695 mo1729() {
        return this.f8689.mo1729();
    }

    @Override // p000.AbstractC0719
    /* renamed from: げつ〴ぬぐ */
    public long mo1730() {
        return this.f8689.mo1730();
    }

    @Override // p000.AbstractC0719
    /* renamed from: づざかべべ */
    public void mo1731(InterfaceC2823 interfaceC2823) {
        if (this.f8687 == null) {
            C1996 c1996 = new C1996(this, interfaceC2823);
            Logger logger = C2810.f10480;
            this.f8687 = new C2809(c1996);
        }
        this.f8689.mo1731(this.f8687);
        this.f8687.flush();
    }
}
