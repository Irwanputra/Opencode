package p034.p086.p087.p088.p089;

import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.p089.C1536;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1538 extends AbstractC1530 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1528 f7143;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1536 f7144;

    public C1538(C1544 c1544) {
        super(c1544);
        C1536 c1536 = new C1536(this);
        this.f7144 = c1536;
        this.f7143 = null;
        this.f7094.f7128 = C1536.EnumC1537.TOP;
        this.f7103.f7128 = C1536.EnumC1537.BOTTOM;
        c1536.f7128 = C1536.EnumC1537.BASELINE;
        this.f7101 = 1;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("VerticalRun ");
        m4207.append(this.f7095.f7172);
        return m4207.toString();
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530, p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ */
    public void mo3374(InterfaceC1539 interfaceC1539) {
        float f;
        float f2;
        float f3;
        int i;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        int ordinal = this.f7097.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            C1544 c1544 = this.f7095;
            m3385(c1544.f7179, c1544.f7228, 1);
            return;
        }
        C1528 c1528 = this.f7100;
        if (c1528.f7126 && !c1528.f7125 && this.f7102 == enumC1545) {
            C1544 c15442 = this.f7095;
            int i2 = c15442.f7218;
            if (i2 == 2) {
                C1544 c15443 = c15442.f7203;
                if (c15443 != null) {
                    C1528 c15282 = c15443.f7205.f7100;
                    if (c15282.f7125) {
                        f = c15442.f7193;
                        f2 = c15282.f7124;
                        f3 = f2 * f;
                    }
                }
            } else if (i2 == 3) {
                C1528 c15283 = c15442.f7225.f7100;
                if (c15283.f7125) {
                    int i3 = c15442.f7192;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f2 = c15283.f7124;
                            f = c15442.f7194;
                            f3 = f2 * f;
                        } else if (i3 != 1) {
                            i = 0;
                            c1528.mo3373(i);
                        }
                    }
                    f3 = c15283.f7124 / c15442.f7194;
                }
            }
            i = (int) (f3 + 0.5f);
            c1528.mo3373(i);
        }
        C1536 c1536 = this.f7094;
        if (c1536.f7126) {
            C1536 c15362 = this.f7103;
            if (c15362.f7126) {
                if (c1536.f7125 && c15362.f7125 && this.f7100.f7125) {
                    return;
                }
                if (!this.f7100.f7125 && this.f7102 == enumC1545) {
                    C1544 c15444 = this.f7095;
                    if (c15444.f7207 == 0 && !c15444.m3431()) {
                        C1536 c15363 = this.f7094.f7129.get(0);
                        C1536 c15364 = this.f7103.f7129.get(0);
                        int i4 = c15363.f7124;
                        C1536 c15365 = this.f7094;
                        int i5 = i4 + c15365.f7130;
                        int i6 = c15364.f7124 + this.f7103.f7130;
                        c15365.mo3373(i5);
                        this.f7103.mo3373(i6);
                        this.f7100.mo3373(i6 - i5);
                        return;
                    }
                }
                if (!this.f7100.f7125 && this.f7102 == enumC1545 && this.f7099 == 1 && this.f7094.f7129.size() > 0 && this.f7103.f7129.size() > 0) {
                    C1536 c15366 = this.f7094.f7129.get(0);
                    int i7 = (this.f7103.f7129.get(0).f7124 + this.f7103.f7130) - (c15366.f7124 + this.f7094.f7130);
                    C1528 c15284 = this.f7100;
                    int i8 = c15284.f7093;
                    if (i7 < i8) {
                        c15284.mo3373(i7);
                    } else {
                        c15284.mo3373(i8);
                    }
                }
                if (this.f7100.f7125 && this.f7094.f7129.size() > 0 && this.f7103.f7129.size() > 0) {
                    C1536 c15367 = this.f7094.f7129.get(0);
                    C1536 c15368 = this.f7103.f7129.get(0);
                    int i9 = c15367.f7124;
                    C1536 c15369 = this.f7094;
                    int i10 = c15369.f7130 + i9;
                    int i11 = c15368.f7124;
                    int i12 = this.f7103.f7130 + i11;
                    float f4 = this.f7095.f7185;
                    if (c15367 == c15368) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c15369.mo3373((int) ((((i11 - i9) - this.f7100.f7124) * f4) + i9 + 0.5f));
                    this.f7103.mo3373(this.f7094.f7124 + this.f7100.f7124);
                }
            }
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: づざかべべ */
    public void mo3375() {
        C1536 c1536 = this.f7094;
        if (c1536.f7125) {
            this.f7095.f7216 = c1536.f7124;
        }
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: なぎぱいぢぎ */
    public void mo3376() {
        this.f7098 = null;
        this.f7094.m3398();
        this.f7103.m3398();
        this.f7144.m3398();
        this.f7100.m3398();
        this.f7096 = false;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m3399() {
        this.f7096 = false;
        this.f7094.m3398();
        this.f7094.f7125 = false;
        this.f7103.m3398();
        this.f7103.f7125 = false;
        this.f7144.m3398();
        this.f7144.f7125 = false;
        this.f7100.f7125 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x031c, code lost:
    
        if (r10.f7095.f7224 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031e, code lost:
    
        r0 = r10.f7144;
        r1 = r10.f7094;
        r2 = r10.f7143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0378, code lost:
    
        if (r0.f7102 == r2) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0421, code lost:
    
        r0.f7100.f7133.add(r10.f7100);
        r10.f7100.f7129.add(r10.f7095.f7225.f7100);
        r10.f7100.f7127 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03b1, code lost:
    
        if (r10.f7095.f7224 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x041f, code lost:
    
        if (r0.f7102 == r2) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: びぐびあび */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3378() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.p088.p089.C1538.mo3378():void");
    }

    @Override // p034.p086.p087.p088.p089.AbstractC1530
    /* renamed from: ぺふねづ〺 */
    public boolean mo3379() {
        return this.f7102 != C1544.EnumC1545.MATCH_CONSTRAINT || this.f7095.f7218 == 0;
    }
}
