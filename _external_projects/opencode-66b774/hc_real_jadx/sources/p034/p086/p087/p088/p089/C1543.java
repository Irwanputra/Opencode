package p034.p086.p087.p088.p089;

import java.util.List;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.InterfaceC1513;
import p034.p086.p087.p088.p089.AbstractC1530;
import p034.p086.p087.p088.p089.C1536;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1543 extends AbstractC1530 {

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static int[] f7151 = new int[2];

    public C1543(C1544 c1544) {
        super(c1544);
        this.f7094.f7128 = C1536.EnumC1537.LEFT;
        this.f7103.f7128 = C1536.EnumC1537.RIGHT;
        this.f7101 = 0;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HorizontalRun ");
        m4207.append(this.f7095.f7172);
        return m4207.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x026c, code lost:
    
        if (r15 != 1) goto L133;
     */
    @Override // p034.p086.p087.p088.p089.AbstractC1530, p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3374(p034.p086.p087.p088.p089.InterfaceC1539 r18) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.p088.p089.C1543.mo3374(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.びぐびあび):void");
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: づざかべべ */
    public void mo3375() {
        C1536 c1536 = this.f7094;
        if (c1536.f7125) {
            this.f7095.f7234 = c1536.f7124;
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: なぎぱいぢぎ */
    public void mo3376() {
        this.f7098 = null;
        this.f7094.m3398();
        this.f7103.m3398();
        this.f7100.m3398();
        this.f7096 = false;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m3405(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: びぐびあび */
    public void mo3378() {
        C1544 c1544;
        C1544 c15442;
        C1536 c1536;
        C1517 c1517;
        List<InterfaceC1539> list;
        InterfaceC1539 interfaceC1539;
        C1536 c15362;
        C1536 c15363;
        C1536 c15364;
        int i;
        C1544 c15443;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        C1544.EnumC1545 enumC15452 = C1544.EnumC1545.MATCH_PARENT;
        C1544.EnumC1545 enumC15453 = C1544.EnumC1545.FIXED;
        C1544 c15444 = this.f7095;
        if (c15444.f7191) {
            this.f7100.mo3373(c15444.m3438());
        }
        if (!this.f7100.f7125) {
            C1544.EnumC1545 m3424 = this.f7095.m3424();
            this.f7102 = m3424;
            if (m3424 != enumC1545) {
                if (m3424 == enumC15452 && (((c15443 = this.f7095.f7203) != null && c15443.m3424() == enumC15453) || c15443.m3424() == enumC15452)) {
                    int m3438 = (c15443.m3438() - this.f7095.f7235.m3329()) - this.f7095.f7202.m3329();
                    m3381(this.f7094, c15443.f7225.f7094, this.f7095.f7235.m3329());
                    m3381(this.f7103, c15443.f7225.f7103, -this.f7095.f7202.m3329());
                    this.f7100.mo3373(m3438);
                    return;
                }
                if (this.f7102 == enumC15453) {
                    this.f7100.mo3373(this.f7095.m3438());
                }
            }
        } else if (this.f7102 == enumC15452 && (((c1544 = this.f7095.f7203) != null && c1544.m3424() == enumC15453) || c1544.m3424() == enumC15452)) {
            m3381(this.f7094, c1544.f7225.f7094, this.f7095.f7235.m3329());
            m3381(this.f7103, c1544.f7225.f7103, -this.f7095.f7202.m3329());
            return;
        }
        C1528 c1528 = this.f7100;
        if (c1528.f7125) {
            C1544 c15445 = this.f7095;
            if (c15445.f7191) {
                C1517[] c1517Arr = c15445.f7190;
                if (c1517Arr[0].f6999 != null && c1517Arr[1].f6999 != null) {
                    if (c15445.m3433()) {
                        this.f7094.f7130 = this.f7095.f7190[0].m3329();
                        c1536 = this.f7103;
                        c1517 = this.f7095.f7190[1];
                        c1536.f7130 = -c1517.m3329();
                        return;
                    }
                    C1536 m3380 = m3380(this.f7095.f7190[0]);
                    if (m3380 != null) {
                        C1536 c15365 = this.f7094;
                        int m3329 = this.f7095.f7190[0].m3329();
                        c15365.f7129.add(m3380);
                        c15365.f7130 = m3329;
                        m3380.f7133.add(c15365);
                    }
                    C1536 m33802 = m3380(this.f7095.f7190[1]);
                    if (m33802 != null) {
                        C1536 c15366 = this.f7103;
                        int i2 = -this.f7095.f7190[1].m3329();
                        c15366.f7129.add(m33802);
                        c15366.f7130 = i2;
                        m33802.f7133.add(c15366);
                    }
                    this.f7094.f7123 = true;
                    this.f7103.f7123 = true;
                    return;
                }
                if (c1517Arr[0].f6999 != null) {
                    C1536 m33803 = m3380(c1517Arr[0]);
                    if (m33803 == null) {
                        return;
                    }
                    C1536 c15367 = this.f7094;
                    int m33292 = this.f7095.f7190[0].m3329();
                    c15367.f7129.add(m33803);
                    c15367.f7130 = m33292;
                    m33803.f7133.add(c15367);
                } else {
                    if (c1517Arr[1].f6999 != null) {
                        C1536 m33804 = m3380(c1517Arr[1]);
                        if (m33804 != null) {
                            C1536 c15368 = this.f7103;
                            int i3 = -this.f7095.f7190[1].m3329();
                            c15368.f7129.add(m33804);
                            c15368.f7130 = i3;
                            m33804.f7133.add(c15368);
                            c15363 = this.f7094;
                            c15364 = this.f7103;
                            i = -this.f7100.f7124;
                            m3381(c15363, c15364, i);
                            return;
                        }
                        return;
                    }
                    if ((c15445 instanceof InterfaceC1513) || c15445.f7203 == null || c15445.mo3317(C1517.EnumC1518.CENTER).f6999 != null) {
                        return;
                    }
                    C1544 c15446 = this.f7095;
                    m3381(this.f7094, c15446.f7203.f7225.f7094, c15446.m3409());
                }
                c15363 = this.f7103;
                c15364 = this.f7094;
                i = this.f7100.f7124;
                m3381(c15363, c15364, i);
                return;
            }
        }
        if (this.f7102 == enumC1545) {
            C1544 c15447 = this.f7095;
            int i4 = c15447.f7207;
            if (i4 == 2) {
                C1544 c15448 = c15447.f7203;
                if (c15448 != null) {
                    C1528 c15282 = c15448.f7205.f7100;
                    c1528.f7129.add(c15282);
                    c15282.f7133.add(this.f7100);
                    C1528 c15283 = this.f7100;
                    c15283.f7123 = true;
                    c15283.f7133.add(this.f7094);
                    list = this.f7100.f7133;
                    interfaceC1539 = this.f7103;
                    list.add(interfaceC1539);
                }
            } else if (i4 == 3) {
                if (c15447.f7218 == 3) {
                    this.f7094.f7127 = this;
                    this.f7103.f7127 = this;
                    C1538 c1538 = c15447.f7205;
                    c1538.f7094.f7127 = this;
                    c1538.f7103.f7127 = this;
                    c1528.f7127 = this;
                    if (c15447.m3431()) {
                        this.f7100.f7129.add(this.f7095.f7205.f7100);
                        this.f7095.f7205.f7100.f7133.add(this.f7100);
                        C1538 c15382 = this.f7095.f7205;
                        c15382.f7100.f7127 = this;
                        this.f7100.f7129.add(c15382.f7094);
                        this.f7100.f7129.add(this.f7095.f7205.f7103);
                        this.f7095.f7205.f7094.f7133.add(this.f7100);
                        list = this.f7095.f7205.f7103.f7133;
                        interfaceC1539 = this.f7100;
                        list.add(interfaceC1539);
                    } else if (this.f7095.m3433()) {
                        this.f7095.f7205.f7100.f7129.add(this.f7100);
                        list = this.f7100.f7133;
                        interfaceC1539 = this.f7095.f7205.f7100;
                        list.add(interfaceC1539);
                    } else {
                        c15362 = this.f7095.f7205.f7100;
                    }
                } else {
                    C1528 c15284 = c15447.f7205.f7100;
                    c1528.f7129.add(c15284);
                    c15284.f7133.add(this.f7100);
                    this.f7095.f7205.f7094.f7133.add(this.f7100);
                    this.f7095.f7205.f7103.f7133.add(this.f7100);
                    C1528 c15285 = this.f7100;
                    c15285.f7123 = true;
                    c15285.f7133.add(this.f7094);
                    this.f7100.f7133.add(this.f7103);
                    this.f7094.f7129.add(this.f7100);
                    c15362 = this.f7103;
                }
                list = c15362.f7129;
                interfaceC1539 = this.f7100;
                list.add(interfaceC1539);
            }
            c1536.f7130 = -c1517.m3329();
            return;
        }
        C1544 c15449 = this.f7095;
        C1517[] c1517Arr2 = c15449.f7190;
        if (c1517Arr2[0].f6999 != null && c1517Arr2[1].f6999 != null) {
            if (c15449.m3433()) {
                this.f7094.f7130 = this.f7095.f7190[0].m3329();
                c1536 = this.f7103;
                c1517 = this.f7095.f7190[1];
                c1536.f7130 = -c1517.m3329();
                return;
            }
            C1536 m33805 = m3380(this.f7095.f7190[0]);
            C1536 m33806 = m3380(this.f7095.f7190[1]);
            m33805.f7133.add(this);
            if (m33805.f7125) {
                mo3374(this);
            }
            m33806.f7133.add(this);
            if (m33806.f7125) {
                mo3374(this);
            }
            this.f7097 = AbstractC1530.EnumC1531.CENTER;
            return;
        }
        if (c1517Arr2[0].f6999 != null) {
            C1536 m33807 = m3380(c1517Arr2[0]);
            if (m33807 == null) {
                return;
            }
            C1536 c15369 = this.f7094;
            int m33293 = this.f7095.f7190[0].m3329();
            c15369.f7129.add(m33807);
            c15369.f7130 = m33293;
            m33807.f7133.add(c15369);
        } else {
            if (c1517Arr2[1].f6999 != null) {
                C1536 m33808 = m3380(c1517Arr2[1]);
                if (m33808 != null) {
                    C1536 c153610 = this.f7103;
                    int i5 = -this.f7095.f7190[1].m3329();
                    c153610.f7129.add(m33808);
                    c153610.f7130 = i5;
                    m33808.f7133.add(c153610);
                    m3384(this.f7094, this.f7103, -1, this.f7100);
                    return;
                }
                return;
            }
            if ((c15449 instanceof InterfaceC1513) || (c15442 = c15449.f7203) == null) {
                return;
            } else {
                m3381(this.f7094, c15442.f7225.f7094, c15449.m3409());
            }
        }
        m3384(this.f7103, this.f7094, 1, this.f7100);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m3406() {
        this.f7096 = false;
        this.f7094.m3398();
        this.f7094.f7125 = false;
        this.f7103.m3398();
        this.f7103.f7125 = false;
        this.f7100.f7125 = false;
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: ぺふねづ〺 */
    public boolean mo3379() {
        return this.f7102 != C1544.EnumC1545.MATCH_CONSTRAINT || this.f7095.f7207 == 0;
    }
}
