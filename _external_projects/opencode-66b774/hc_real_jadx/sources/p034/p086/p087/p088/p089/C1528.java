package p034.p086.p087.p088.p089;

import p034.p086.p087.p088.p089.C1536;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1528 extends C1536 {

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f7093;

    public C1528(AbstractC1530 abstractC1530) {
        super(abstractC1530);
        this.f7128 = abstractC1530 instanceof C1543 ? C1536.EnumC1537.HORIZONTAL_DIMENSION : C1536.EnumC1537.VERTICAL_DIMENSION;
    }

    @Override // p034.p086.p087.p088.p089.C1536
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo3373(int i) {
        if (this.f7125) {
            return;
        }
        this.f7125 = true;
        this.f7124 = i;
        for (InterfaceC1539 interfaceC1539 : this.f7133) {
            interfaceC1539.mo3374(interfaceC1539);
        }
    }
}
