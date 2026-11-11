package p034.p086.p087.p088.p089;

import java.util.HashSet;
import java.util.Iterator;
import p034.p086.p087.p088.C1515;
import p034.p086.p087.p088.C1517;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.p089.C1525;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1524 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1525.C1527 f7079 = new C1525.C1527();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3363(C1544 c1544, C1525.InterfaceC1526 interfaceC1526, boolean z) {
        HashSet<C1517> hashSet;
        C1517 c1517;
        C1517 c15172;
        C1517 c15173;
        C1517 c15174;
        C1517 c15175;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        if (!(c1544 instanceof C1520) && c1544.m3412() && m3366(c1544)) {
            C1520.m3339(c1544, interfaceC1526, new C1525.C1527(), 0);
        }
        C1517 mo3317 = c1544.mo3317(C1517.EnumC1518.LEFT);
        C1517 mo33172 = c1544.mo3317(C1517.EnumC1518.RIGHT);
        int m3333 = mo3317.m3333();
        int m33332 = mo33172.m3333();
        HashSet<C1517> hashSet2 = mo3317.f6997;
        if (hashSet2 != null && mo3317.f6996) {
            Iterator<C1517> it = hashSet2.iterator();
            while (it.hasNext()) {
                C1517 next = it.next();
                C1544 c15442 = next.f7000;
                boolean m3366 = m3366(c15442);
                if (c15442.m3412() && m3366) {
                    C1520.m3339(c15442, interfaceC1526, new C1525.C1527(), 0);
                }
                if (c15442.m3424() != enumC1545 || m3366) {
                    if (!c15442.m3412()) {
                        C1517 c15176 = c15442.f7235;
                        if (next == c15176 && c15442.f7202.f6999 == null) {
                            int m3329 = c15176.m3329() + m3333;
                            c15442.m3408(m3329, c15442.m3438() + m3329);
                        } else {
                            C1517 c15177 = c15442.f7202;
                            if (next == c15177 && c15176.f6999 == null) {
                                int m33292 = m3333 - c15177.m3329();
                                c15442.m3408(m33292 - c15442.m3438(), m33292);
                            } else if (next == c15176 && (c15173 = c15177.f6999) != null && c15173.f6996 && !c15442.m3433()) {
                                m3365(interfaceC1526, c15442, z);
                            }
                        }
                        m3363(c15442, interfaceC1526, z);
                    }
                } else if (c15442.m3424() == enumC1545 && c15442.f7174 >= 0 && c15442.f7181 >= 0 && (c15442.f7217 == 8 || (c15442.f7207 == 0 && c15442.f7194 == 0.0f))) {
                    if (!c15442.m3433() && !c15442.f7209) {
                        C1517 c15178 = c15442.f7235;
                        if (((next == c15178 && (c15175 = c15442.f7202.f6999) != null && c15175.f6996) || (next == c15442.f7202 && (c15174 = c15178.f6999) != null && c15174.f6996)) && !c15442.m3433()) {
                            m3369(c1544, interfaceC1526, c15442, z);
                        }
                    }
                }
            }
        }
        if ((c1544 instanceof C1515) || (hashSet = mo33172.f6997) == null || !mo33172.f6996) {
            return;
        }
        Iterator<C1517> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C1517 next2 = it2.next();
            C1544 c15443 = next2.f7000;
            boolean m33662 = m3366(c15443);
            if (c15443.m3412() && m33662) {
                C1520.m3339(c15443, interfaceC1526, new C1525.C1527(), 0);
            }
            C1517 c15179 = c15443.f7235;
            boolean z2 = (next2 == c15179 && (c15172 = c15443.f7202.f6999) != null && c15172.f6996) || (next2 == c15443.f7202 && (c1517 = c15179.f6999) != null && c1517.f6996);
            if (c15443.m3424() != enumC1545 || m33662) {
                if (!c15443.m3412()) {
                    C1517 c151710 = c15443.f7235;
                    if (next2 == c151710 && c15443.f7202.f6999 == null) {
                        int m33293 = c151710.m3329() + m33332;
                        c15443.m3408(m33293, c15443.m3438() + m33293);
                    } else {
                        C1517 c151711 = c15443.f7202;
                        if (next2 == c151711 && c151710.f6999 == null) {
                            int m33294 = m33332 - c151711.m3329();
                            c15443.m3408(m33294 - c15443.m3438(), m33294);
                        } else if (z2 && !c15443.m3433()) {
                            m3365(interfaceC1526, c15443, z);
                        }
                    }
                    m3363(c15443, interfaceC1526, z);
                }
            } else if (c15443.m3424() == enumC1545 && c15443.f7174 >= 0 && c15443.f7181 >= 0 && (c15443.f7217 == 8 || (c15443.f7207 == 0 && c15443.f7194 == 0.0f))) {
                if (!c15443.m3433() && !c15443.f7209 && z2 && !c15443.m3433()) {
                    m3369(c1544, interfaceC1526, c15443, z);
                }
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static void m3364(C1544 c1544, C1525.InterfaceC1526 interfaceC1526) {
        C1517 c1517;
        C1517 c15172;
        C1517 c15173;
        C1517 c15174;
        C1517 c15175;
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        if (!(c1544 instanceof C1520) && c1544.m3412() && m3366(c1544)) {
            C1520.m3339(c1544, interfaceC1526, new C1525.C1527(), 0);
        }
        C1517 mo3317 = c1544.mo3317(C1517.EnumC1518.TOP);
        C1517 mo33172 = c1544.mo3317(C1517.EnumC1518.BOTTOM);
        int m3333 = mo3317.m3333();
        int m33332 = mo33172.m3333();
        HashSet<C1517> hashSet = mo3317.f6997;
        if (hashSet != null && mo3317.f6996) {
            Iterator<C1517> it = hashSet.iterator();
            while (it.hasNext()) {
                C1517 next = it.next();
                C1544 c15442 = next.f7000;
                boolean m3366 = m3366(c15442);
                if (c15442.m3412() && m3366) {
                    C1520.m3339(c15442, interfaceC1526, new C1525.C1527(), 0);
                }
                if (c15442.m3430() != enumC1545 || m3366) {
                    if (!c15442.m3412()) {
                        C1517 c15176 = c15442.f7179;
                        if (next == c15176 && c15442.f7228.f6999 == null) {
                            int m3329 = c15176.m3329() + m3333;
                            c15442.m3414(m3329, c15442.m3418() + m3329);
                        } else {
                            C1517 c15177 = c15442.f7228;
                            if (next == c15177 && c15177.f6999 == null) {
                                int m33292 = m3333 - c15177.m3329();
                                c15442.m3414(m33292 - c15442.m3418(), m33292);
                            } else if (next == c15176 && (c15173 = c15177.f6999) != null && c15173.f6996) {
                                m3367(interfaceC1526, c15442);
                            }
                        }
                        m3364(c15442, interfaceC1526);
                    }
                } else if (c15442.m3430() == enumC1545 && c15442.f7219 >= 0 && c15442.f7196 >= 0 && (c15442.f7217 == 8 || (c15442.f7218 == 0 && c15442.f7194 == 0.0f))) {
                    if (!c15442.m3431() && !c15442.f7209) {
                        C1517 c15178 = c15442.f7179;
                        if (((next == c15178 && (c15175 = c15442.f7228.f6999) != null && c15175.f6996) || (next == c15442.f7228 && (c15174 = c15178.f6999) != null && c15174.f6996)) && !c15442.m3431()) {
                            m3368(c1544, interfaceC1526, c15442);
                        }
                    }
                }
            }
        }
        if (c1544 instanceof C1515) {
            return;
        }
        HashSet<C1517> hashSet2 = mo33172.f6997;
        if (hashSet2 != null && mo33172.f6996) {
            Iterator<C1517> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1517 next2 = it2.next();
                C1544 c15443 = next2.f7000;
                boolean m33662 = m3366(c15443);
                if (c15443.m3412() && m33662) {
                    C1520.m3339(c15443, interfaceC1526, new C1525.C1527(), 0);
                }
                C1517 c15179 = c15443.f7179;
                boolean z = (next2 == c15179 && (c15172 = c15443.f7228.f6999) != null && c15172.f6996) || (next2 == c15443.f7228 && (c1517 = c15179.f6999) != null && c1517.f6996);
                if (c15443.m3430() != enumC1545 || m33662) {
                    if (!c15443.m3412()) {
                        C1517 c151710 = c15443.f7179;
                        if (next2 == c151710 && c15443.f7228.f6999 == null) {
                            int m33293 = c151710.m3329() + m33332;
                            c15443.m3414(m33293, c15443.m3418() + m33293);
                        } else {
                            C1517 c151711 = c15443.f7228;
                            if (next2 == c151711 && c151710.f6999 == null) {
                                int m33294 = m33332 - c151711.m3329();
                                c15443.m3414(m33294 - c15443.m3418(), m33294);
                            } else if (z && !c15443.m3431()) {
                                m3367(interfaceC1526, c15443);
                            }
                        }
                        m3364(c15443, interfaceC1526);
                    }
                } else if (c15443.m3430() == enumC1545 && c15443.f7219 >= 0 && c15443.f7196 >= 0 && (c15443.f7217 == 8 || (c15443.f7218 == 0 && c15443.f7194 == 0.0f))) {
                    if (!c15443.m3431() && !c15443.f7209 && z && !c15443.m3431()) {
                        m3368(c1544, interfaceC1526, c15443);
                    }
                }
            }
        }
        C1517 mo33173 = c1544.mo3317(C1517.EnumC1518.BASELINE);
        if (mo33173.f6997 == null || !mo33173.f6996) {
            return;
        }
        int m33333 = mo33173.m3333();
        Iterator<C1517> it3 = mo33173.f6997.iterator();
        while (it3.hasNext()) {
            C1517 next3 = it3.next();
            C1544 c15444 = next3.f7000;
            boolean m33663 = m3366(c15444);
            if (c15444.m3412() && m33663) {
                C1520.m3339(c15444, interfaceC1526, new C1525.C1527(), 0);
            }
            if (c15444.m3430() != enumC1545 || m33663) {
                if (!c15444.m3412() && next3 == c15444.f7189) {
                    if (c15444.f7224) {
                        int i = m33333 - c15444.f7182;
                        int i2 = c15444.f7221 + i;
                        c15444.f7216 = i;
                        c15444.f7179.m3332(i);
                        c15444.f7228.m3332(i2);
                        C1517 c151712 = c15444.f7189;
                        c151712.f6994 = m33333;
                        c151712.f6996 = true;
                        c15444.f7233 = true;
                    }
                    m3364(c15444, interfaceC1526);
                }
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m3365(C1525.InterfaceC1526 interfaceC1526, C1544 c1544, boolean z) {
        float f = c1544.f7154;
        int m3333 = c1544.f7235.f6999.m3333();
        int m33332 = c1544.f7202.f6999.m3333();
        int m3329 = c1544.f7235.m3329() + m3333;
        int m33292 = m33332 - c1544.f7202.m3329();
        if (m3333 == m33332) {
            f = 0.5f;
        } else {
            m3333 = m3329;
            m33332 = m33292;
        }
        int m3438 = c1544.m3438();
        int i = (m33332 - m3333) - m3438;
        if (m3333 > m33332) {
            i = (m3333 - m33332) - m3438;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + m3333;
        int i3 = i2 + m3438;
        if (m3333 > m33332) {
            i3 = i2 - m3438;
        }
        c1544.m3408(i2, i3);
        m3363(c1544, interfaceC1526, z);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m3366(C1544 c1544) {
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
        C1544.EnumC1545 enumC15452 = C1544.EnumC1545.WRAP_CONTENT;
        C1544.EnumC1545 enumC15453 = C1544.EnumC1545.FIXED;
        C1544.EnumC1545 m3424 = c1544.m3424();
        C1544.EnumC1545 m3430 = c1544.m3430();
        C1544 c15442 = c1544.f7203;
        C1520 c1520 = c15442 != null ? (C1520) c15442 : null;
        if (c1520 != null) {
            c1520.m3424();
        }
        if (c1520 != null) {
            c1520.m3430();
        }
        boolean z = m3424 == enumC15453 || m3424 == enumC15452 || (m3424 == enumC1545 && c1544.f7207 == 0 && c1544.f7194 == 0.0f && c1544.m3413(0)) || c1544.mo3315();
        boolean z2 = m3430 == enumC15453 || m3430 == enumC15452 || (m3430 == enumC1545 && c1544.f7218 == 0 && c1544.f7194 == 0.0f && c1544.m3413(1)) || c1544.mo3319();
        if (c1544.f7194 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m3367(C1525.InterfaceC1526 interfaceC1526, C1544 c1544) {
        float f = c1544.f7185;
        int m3333 = c1544.f7179.f6999.m3333();
        int m33332 = c1544.f7228.f6999.m3333();
        int m3329 = c1544.f7179.m3329() + m3333;
        int m33292 = m33332 - c1544.f7228.m3329();
        if (m3333 == m33332) {
            f = 0.5f;
        } else {
            m3333 = m3329;
            m33332 = m33292;
        }
        int m3418 = c1544.m3418();
        int i = (m33332 - m3333) - m3418;
        if (m3333 > m33332) {
            i = (m3333 - m33332) - m3418;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = m3333 + i2;
        int i4 = i3 + m3418;
        if (m3333 > m33332) {
            i3 = m3333 - i2;
            i4 = i3 - m3418;
        }
        c1544.m3414(i3, i4);
        m3364(c1544, interfaceC1526);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m3368(C1544 c1544, C1525.InterfaceC1526 interfaceC1526, C1544 c15442) {
        float f = c15442.f7185;
        int m3329 = c15442.f7179.m3329() + c15442.f7179.f6999.m3333();
        int m3333 = c15442.f7228.f6999.m3333() - c15442.f7228.m3329();
        if (m3333 >= m3329) {
            int m3418 = c15442.m3418();
            if (c15442.f7217 != 8) {
                int i = c15442.f7218;
                if (i == 2) {
                    if (!(c1544 instanceof C1520)) {
                        c1544 = c1544.f7203;
                    }
                    m3418 = (int) (f * 0.5f * c1544.m3418());
                } else if (i == 0) {
                    m3418 = m3333 - m3329;
                }
                m3418 = Math.max(c15442.f7196, m3418);
                int i2 = c15442.f7219;
                if (i2 > 0) {
                    m3418 = Math.min(i2, m3418);
                }
            }
            int i3 = m3329 + ((int) ((f * ((m3333 - m3329) - m3418)) + 0.5f));
            c15442.m3414(i3, m3418 + i3);
            m3364(c15442, interfaceC1526);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m3369(C1544 c1544, C1525.InterfaceC1526 interfaceC1526, C1544 c15442, boolean z) {
        float f = c15442.f7154;
        int m3329 = c15442.f7235.m3329() + c15442.f7235.f6999.m3333();
        int m3333 = c15442.f7202.f6999.m3333() - c15442.f7202.m3329();
        if (m3333 >= m3329) {
            int m3438 = c15442.m3438();
            if (c15442.f7217 != 8) {
                int i = c15442.f7207;
                if (i == 2) {
                    if (!(c1544 instanceof C1520)) {
                        c1544 = c1544.f7203;
                    }
                    m3438 = (int) (c15442.f7154 * 0.5f * c1544.m3438());
                } else if (i == 0) {
                    m3438 = m3333 - m3329;
                }
                m3438 = Math.max(c15442.f7181, m3438);
                int i2 = c15442.f7174;
                if (i2 > 0) {
                    m3438 = Math.min(i2, m3438);
                }
            }
            int i3 = m3329 + ((int) ((f * ((m3333 - m3329) - m3438)) + 0.5f));
            c15442.m3408(i3, m3438 + i3);
            m3363(c15442, interfaceC1526, z);
        }
    }
}
