package p034.p086.p087.p088;

import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1544;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1516 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean[] f6992 = new boolean[3];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final boolean m3321(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m3322(C1520 c1520, C1558 c1558, C1544 c1544) {
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_PARENT;
        c1544.f7167 = -1;
        c1544.f7236 = -1;
        C1544.EnumC1545 enumC15452 = c1520.f7206[0];
        C1544.EnumC1545 enumC15453 = C1544.EnumC1545.WRAP_CONTENT;
        if (enumC15452 != enumC15453 && c1544.f7206[0] == enumC1545) {
            int i = c1544.f7235.f6995;
            int m3438 = c1520.m3438() - c1544.f7202.f6995;
            C1517 c1517 = c1544.f7235;
            c1517.f7001 = c1558.m3489(c1517);
            C1517 c15172 = c1544.f7202;
            c15172.f7001 = c1558.m3489(c15172);
            c1558.m3488(c1544.f7235.f7001, i);
            c1558.m3488(c1544.f7202.f7001, m3438);
            c1544.f7167 = 2;
            c1544.f7234 = i;
            int i2 = m3438 - i;
            c1544.f7175 = i2;
            int i3 = c1544.f7157;
            if (i2 < i3) {
                c1544.f7175 = i3;
            }
        }
        if (c1520.f7206[1] == enumC15453 || c1544.f7206[1] != enumC1545) {
            return;
        }
        int i4 = c1544.f7179.f6995;
        int m3418 = c1520.m3418() - c1544.f7228.f6995;
        C1517 c15173 = c1544.f7179;
        c15173.f7001 = c1558.m3489(c15173);
        C1517 c15174 = c1544.f7228;
        c15174.f7001 = c1558.m3489(c15174);
        c1558.m3488(c1544.f7179.f7001, i4);
        c1558.m3488(c1544.f7228.f7001, m3418);
        if (c1544.f7182 > 0 || c1544.f7217 == 8) {
            C1517 c15175 = c1544.f7189;
            c15175.f7001 = c1558.m3489(c15175);
            c1558.m3488(c1544.f7189.f7001, c1544.f7182 + i4);
        }
        c1544.f7236 = 2;
        c1544.f7216 = i4;
        int i5 = m3418 - i4;
        c1544.f7221 = i5;
        int i6 = c1544.f7220;
        if (i5 < i6) {
            c1544.f7221 = i6;
        }
    }
}
