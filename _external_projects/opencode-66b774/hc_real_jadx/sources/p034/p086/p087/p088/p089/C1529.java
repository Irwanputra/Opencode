package p034.p086.p087.p088.p089;

import java.util.Iterator;
import p034.p086.p087.p088.C1519;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.p089.C1536;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1529 extends AbstractC1530 {
    public C1529(C1544 c1544) {
        super(c1544);
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530, p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3374(InterfaceC1539 interfaceC1539) {
        C1519 c1519 = (C1519) this.f7095;
        int i = c1519.f7012;
        int i2 = 0;
        Iterator<C1536> it = this.f7094.f7129.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f7124;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f7094.mo3373(i3 + c1519.f7013);
        } else {
            this.f7094.mo3373(i2 + c1519.f7013);
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo3375() {
        C1544 c1544 = this.f7095;
        if (c1544 instanceof C1519) {
            int i = ((C1519) c1544).f7012;
            if (i == 0 || i == 1) {
                c1544.f7234 = this.f7094.f7124;
            } else {
                c1544.f7216 = this.f7094.f7124;
            }
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo3376() {
        this.f7098 = null;
        this.f7094.m3398();
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m3377(C1536 c1536) {
        this.f7094.f7133.add(c1536);
        c1536.f7129.add(this.f7094);
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo3378() {
        AbstractC1530 abstractC1530;
        C1544 c1544 = this.f7095;
        if (c1544 instanceof C1519) {
            C1536 c1536 = this.f7094;
            c1536.f7123 = true;
            C1519 c1519 = (C1519) c1544;
            int i = c1519.f7012;
            boolean z = c1519.f7015;
            int i2 = 0;
            if (i == 0) {
                c1536.f7128 = C1536.EnumC1537.LEFT;
                while (i2 < c1519.f7242) {
                    C1544 c15442 = c1519.f7243[i2];
                    if (z || c15442.f7217 != 8) {
                        C1536 c15362 = c15442.f7225.f7094;
                        c15362.f7133.add(this.f7094);
                        this.f7094.f7129.add(c15362);
                    }
                    i2++;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        c1536.f7128 = C1536.EnumC1537.TOP;
                        while (i2 < c1519.f7242) {
                            C1544 c15443 = c1519.f7243[i2];
                            if (z || c15443.f7217 != 8) {
                                C1536 c15363 = c15443.f7205.f7094;
                                c15363.f7133.add(this.f7094);
                                this.f7094.f7129.add(c15363);
                            }
                            i2++;
                        }
                    } else {
                        if (i != 3) {
                            return;
                        }
                        c1536.f7128 = C1536.EnumC1537.BOTTOM;
                        while (i2 < c1519.f7242) {
                            C1544 c15444 = c1519.f7243[i2];
                            if (z || c15444.f7217 != 8) {
                                C1536 c15364 = c15444.f7205.f7103;
                                c15364.f7133.add(this.f7094);
                                this.f7094.f7129.add(c15364);
                            }
                            i2++;
                        }
                    }
                    m3377(this.f7095.f7205.f7094);
                    abstractC1530 = this.f7095.f7205;
                    m3377(abstractC1530.f7103);
                }
                c1536.f7128 = C1536.EnumC1537.RIGHT;
                while (i2 < c1519.f7242) {
                    C1544 c15445 = c1519.f7243[i2];
                    if (z || c15445.f7217 != 8) {
                        C1536 c15365 = c15445.f7225.f7103;
                        c15365.f7133.add(this.f7094);
                        this.f7094.f7129.add(c15365);
                    }
                    i2++;
                }
            }
            m3377(this.f7095.f7225.f7094);
            abstractC1530 = this.f7095.f7225;
            m3377(abstractC1530.f7103);
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean mo3379() {
        return false;
    }
}
