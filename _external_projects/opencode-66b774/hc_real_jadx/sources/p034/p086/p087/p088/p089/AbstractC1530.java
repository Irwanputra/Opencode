package p034.p086.p087.p088.p089;

import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1544;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1530 implements InterfaceC1539 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1544 f7095;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1535 f7098;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f7099;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1544.EnumC1545 f7102;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1528 f7100 = new C1528(this);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7101 = 0;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f7096 = false;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1536 f7094 = new C1536(this);

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1536 f7103 = new C1536(this);

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public EnumC1531 f7097 = EnumC1531.NONE;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1531 {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC1530(C1544 c1544) {
        this.f7095 = c1544;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C1536 m3380(C1517 c1517) {
        AbstractC1530 abstractC1530;
        AbstractC1530 abstractC15302;
        C1517 c15172 = c1517.f6999;
        if (c15172 == null) {
            return null;
        }
        C1544 c1544 = c15172.f7000;
        int ordinal = c15172.f6998.ordinal();
        if (ordinal == 1) {
            abstractC1530 = c1544.f7225;
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    abstractC15302 = c1544.f7225;
                } else {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return c1544.f7205.f7144;
                    }
                    abstractC15302 = c1544.f7205;
                }
                return abstractC15302.f7103;
            }
            abstractC1530 = c1544.f7205;
        }
        return abstractC1530.f7094;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3381(C1536 c1536, C1536 c15362, int i) {
        c1536.f7129.add(c15362);
        c1536.f7130 = i;
        c15362.f7133.add(c1536);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int m3382(int i, int i2) {
        int max;
        if (i2 == 0) {
            C1544 c1544 = this.f7095;
            int i3 = c1544.f7174;
            max = Math.max(c1544.f7181, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C1544 c15442 = this.f7095;
            int i4 = c15442.f7219;
            max = Math.max(c15442.f7196, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public long mo3383() {
        if (this.f7100.f7125) {
            return r0.f7124;
        }
        return 0L;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m3384(C1536 c1536, C1536 c15362, int i, C1528 c1528) {
        c1536.f7129.add(c15362);
        c1536.f7129.add(this.f7100);
        c1536.f7122 = i;
        c1536.f7132 = c1528;
        c15362.f7133.add(c1536);
        c1528.f7133.add(c1536);
    }

    @Override // p034.p086.p087.p088.p089.InterfaceC1539
    /* renamed from: げつ〴ぬぐ */
    public void mo3374(InterfaceC1539 interfaceC1539) {
    }

    /* renamed from: づざかべべ */
    public abstract void mo3375();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r14.f7099 == 3) goto L52;
     */
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3385(p034.p086.p087.p088.C1517 r18, p034.p086.p087.p088.C1517 r19, int r20) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.p088.p089.AbstractC1530.m3385(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.くし〴〺ぅ, づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.くし〴〺ぅ, int):void");
    }

    /* renamed from: なぎぱいぢぎ */
    public abstract void mo3376();

    /* renamed from: びぐびあび */
    public abstract void mo3378();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1536 m3386(C1517 c1517, int i) {
        C1517 c15172 = c1517.f6999;
        if (c15172 == null) {
            return null;
        }
        C1544 c1544 = c15172.f7000;
        AbstractC1530 abstractC1530 = i == 0 ? c1544.f7225 : c1544.f7205;
        int ordinal = c15172.f6998.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC1530.f7094;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC1530.f7103;
        }
        return null;
    }

    /* renamed from: ぺふねづ〺 */
    public abstract boolean mo3379();
}
