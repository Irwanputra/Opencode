package p034.p086.p087.p088.p089;

import p034.p086.p087.p088.C1515;
import p034.p086.p087.p088.C1544;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1542 extends AbstractC1530 {
    public C1542(C1544 c1544) {
        super(c1544);
        c1544.f7225.mo3376();
        c1544.f7205.mo3376();
        this.f7101 = ((C1515) c1544).f6989;
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530, p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ */
    public void mo3374(InterfaceC1539 interfaceC1539) {
        C1536 c1536 = this.f7094;
        if (c1536.f7126 && !c1536.f7125) {
            this.f7094.mo3373((int) ((c1536.f7129.get(0).f7124 * ((C1515) this.f7095).f6988) + 0.5f));
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: づざかべべ */
    public void mo3375() {
        C1544 c1544 = this.f7095;
        if (((C1515) c1544).f6989 == 1) {
            c1544.f7234 = this.f7094.f7124;
        } else {
            c1544.f7216 = this.f7094.f7124;
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: なぎぱいぢぎ */
    public void mo3376() {
        this.f7094.m3398();
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m3404(C1536 c1536) {
        this.f7094.f7133.add(c1536);
        c1536.f7129.add(this.f7094);
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: びぐびあび */
    public void mo3378() {
        AbstractC1530 abstractC1530;
        C1544 c1544 = this.f7095;
        C1515 c1515 = (C1515) c1544;
        int i = c1515.f6986;
        int i2 = c1515.f6987;
        if (c1515.f6989 == 1) {
            C1536 c1536 = this.f7094;
            if (i != -1) {
                c1536.f7129.add(c1544.f7203.f7225.f7094);
                this.f7095.f7203.f7225.f7094.f7133.add(this.f7094);
                this.f7094.f7130 = i;
            } else if (i2 != -1) {
                c1536.f7129.add(c1544.f7203.f7225.f7103);
                this.f7095.f7203.f7225.f7103.f7133.add(this.f7094);
                this.f7094.f7130 = -i2;
            } else {
                c1536.f7123 = true;
                c1536.f7129.add(c1544.f7203.f7225.f7103);
                this.f7095.f7203.f7225.f7103.f7133.add(this.f7094);
            }
            m3404(this.f7095.f7225.f7094);
            abstractC1530 = this.f7095.f7225;
        } else {
            C1536 c15362 = this.f7094;
            if (i != -1) {
                c15362.f7129.add(c1544.f7203.f7205.f7094);
                this.f7095.f7203.f7205.f7094.f7133.add(this.f7094);
                this.f7094.f7130 = i;
            } else if (i2 != -1) {
                c15362.f7129.add(c1544.f7203.f7205.f7103);
                this.f7095.f7203.f7205.f7103.f7133.add(this.f7094);
                this.f7094.f7130 = -i2;
            } else {
                c15362.f7123 = true;
                c15362.f7129.add(c1544.f7203.f7205.f7103);
                this.f7095.f7203.f7205.f7103.f7133.add(this.f7094);
            }
            m3404(this.f7095.f7205.f7094);
            abstractC1530 = this.f7095.f7205;
        }
        m3404(abstractC1530.f7103);
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: ぺふねづ〺 */
    public boolean mo3379() {
        return false;
    }
}
