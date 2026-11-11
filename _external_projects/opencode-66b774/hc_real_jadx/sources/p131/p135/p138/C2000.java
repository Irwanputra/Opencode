package p131.p135.p138;

import android.net.TrafficStats;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0592;
import p000.AbstractC0719;
import p000.C0586;
import p000.C0595;
import p000.C0597;
import p000.C0706;
import p000.C0712;
import p000.InterfaceC0717;
import p000.p001.C0629;
import p000.p001.p003.C0615;
import p034.p095.C1687;
import p131.p135.p137.C1978;
import p131.p135.p137.C1979;
import p131.p135.p137.C1981;
import p131.p135.p137.C1982;
import p131.p135.p143.C2026;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2000 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0706 f8720;

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.づざかべべ$〺つふすそ, reason: contains not printable characters */
    public static class C2001 implements InterfaceC0717 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ C1982 f8721;

        public C2001(C1982 c1982) {
            this.f8721 = c1982;
        }

        @Override // p000.InterfaceC0717
        /* renamed from: げつ〴ぬぐ */
        public C0712 mo1768(InterfaceC0717.InterfaceC0718 interfaceC0718) {
            C0615 c0615 = (C0615) interfaceC0718;
            C0712 m1777 = c0615.m1777(c0615.f4302);
            m1777.getClass();
            C0712.C0713 c0713 = new C0712.C0713(m1777);
            AbstractC0592 abstractC0592 = m1777.f4752;
            C1982 c1982 = this.f8721;
            c1982.getClass();
            c0713.f4767 = new C1997(abstractC0592, new C1979(c1982));
            return c0713.m1976();
        }
    }

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2002 implements InterfaceC0717 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ C1982 f8722;

        public C2002(C1982 c1982) {
            this.f8722 = c1982;
        }

        @Override // p000.InterfaceC0717
        /* renamed from: げつ〴ぬぐ */
        public C0712 mo1768(InterfaceC0717.InterfaceC0718 interfaceC0718) {
            C0615 c0615 = (C0615) interfaceC0718;
            C0712 m1777 = c0615.m1777(c0615.f4302);
            m1777.getClass();
            C0712.C0713 c0713 = new C0712.C0713(m1777);
            AbstractC0592 abstractC0592 = m1777.f4752;
            C1982 c1982 = this.f8722;
            c1982.getClass();
            c0713.f4767 = new C1997(abstractC0592, new C1979(c1982));
            return c0713.m1976();
        }
    }

    static {
        C0706 c0706 = f8720;
        if (c0706 == null) {
            C0706.C0707 c0707 = new C0706.C0707(new C0706());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c0707.m1971(60L, timeUnit);
            c0707.f4703 = C0629.m1811("timeout", 60L, timeUnit);
            c0707.f4708 = C0629.m1811("timeout", 60L, timeUnit);
            c0706 = new C0706(c0707);
        }
        f8720 = c0706;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C0712 m4109(C1982 c1982) {
        C0706 c0706;
        long mo1727;
        try {
            C0595.C0596 c0596 = new C0595.C0596();
            c0596.m1737(c1982.m4097());
            m4111(c0596, c1982);
            c0596.m1739("GET", null);
            C0595 m1734 = c0596.m1734();
            C0706 c07062 = c1982.f8623;
            if (c07062 != null) {
                C0706.C0707 c0707 = new C0706.C0707(c07062);
                f8720.getClass();
                c0707.f4705 = null;
                c0707.f4719.add(new C2002(c1982));
                c0706 = new C0706(c0707);
            } else {
                C0706 c07063 = f8720;
                c07063.getClass();
                C0706.C0707 c07072 = new C0706.C0707(c07063);
                c07072.f4719.add(new C2001(c1982));
                c0706 = new C0706(c07072);
            }
            c1982.f8633 = c0706.m1969(m1734);
            long currentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            C0712 m1724 = ((C0586) c1982.f8633).m1724();
            C1687.m3733(m1724, c1982.f8628, c1982.f8625);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (m1724.f4755 == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                if (totalRxBytes != -1 && totalRxBytes2 != -1) {
                    mo1727 = totalRxBytes2 - totalRxBytes;
                    C1981.m4091().m4092(mo1727, currentTimeMillis2);
                    C1687.m3664(null, currentTimeMillis2, -1L, m1724.f4752.mo1727(), false);
                }
                mo1727 = m1724.f4752.mo1727();
                C1981.m4091().m4092(mo1727, currentTimeMillis2);
                C1687.m3664(null, currentTimeMillis2, -1L, m1724.f4752.mo1727(), false);
            }
            return m1724;
        } catch (IOException e) {
            try {
                File file = new File(c1982.f8628 + File.separator + c1982.f8625);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            throw new C2026(e);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C0712 m4110(C1982 c1982) {
        AbstractC0719 m4102;
        C0706 c0706;
        long mo1727;
        try {
            C0595.C0596 c0596 = new C0595.C0596();
            c0596.m1737(c1982.m4097());
            m4111(c0596, c1982);
            switch (c1982.f8630) {
                case 0:
                    c0596.m1739("GET", null);
                    m4102 = null;
                    break;
                case 1:
                    m4102 = c1982.m4102();
                    c0596.m1739("POST", m4102);
                    break;
                case 2:
                    m4102 = c1982.m4102();
                    c0596.m1739("PUT", m4102);
                    break;
                case 3:
                    m4102 = c1982.m4102();
                    c0596.m1739("DELETE", m4102);
                    break;
                case 4:
                    c0596.m1739("HEAD", null);
                    m4102 = null;
                    break;
                case 5:
                    m4102 = c1982.m4102();
                    c0596.m1739("PATCH", m4102);
                    break;
                case 6:
                    c0596.m1739("OPTIONS", null);
                    m4102 = null;
                    break;
                default:
                    m4102 = null;
                    break;
            }
            C0595 m1734 = c0596.m1734();
            C0706 c07062 = c1982.f8623;
            if (c07062 != null) {
                C0706.C0707 c0707 = new C0706.C0707(c07062);
                f8720.getClass();
                c0707.f4705 = null;
                c0706 = new C0706(c0707);
            } else {
                c0706 = f8720;
            }
            c1982.f8633 = c0706.m1969(m1734);
            long currentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            C0712 m1724 = ((C0586) c1982.f8633).m1724();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (m1724.f4755 == null) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                if (totalRxBytes != -1 && totalRxBytes2 != -1) {
                    mo1727 = totalRxBytes2 - totalRxBytes;
                    C1981.m4091().m4092(mo1727, currentTimeMillis2);
                    C1687.m3664(null, currentTimeMillis2, (m4102 != null || m4102.mo1730() == 0) ? -1L : m4102.mo1730(), m1724.f4752.mo1727(), false);
                }
                mo1727 = m1724.f4752.mo1727();
                C1981.m4091().m4092(mo1727, currentTimeMillis2);
                C1687.m3664(null, currentTimeMillis2, (m4102 != null || m4102.mo1730() == 0) ? -1L : m4102.mo1730(), m1724.f4752.mo1727(), false);
            }
            return m1724;
        } catch (IOException e) {
            throw new C2026(e);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4111(C0595.C0596 c0596, C1982 c1982) {
        String str = c1982.f8634;
        if (str != null) {
            C0597.C0598 c0598 = c0596.f4253;
            c0598.m1747("User-Agent", str);
            c0598.f4258.add("User-Agent");
            c0598.f4258.add(str.trim());
        }
        C0597.C0598 c05982 = new C0597.C0598();
        try {
            HashMap<String, List<String>> hashMap = c1982.f8618;
            if (hashMap != null) {
                for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    if (value != null) {
                        Iterator<String> it = value.iterator();
                        while (it.hasNext()) {
                            c05982.m1748(key, it.next());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        List<String> list = c05982.f4258;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        C0597.C0598 c05983 = new C0597.C0598();
        Collections.addAll(c05983.f4258, strArr);
        c0596.f4253 = c05983;
        if (c1982.f8634 != null) {
            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
            int length = strArr.length / 2;
            for (int i = 0; i < length; i++) {
                treeSet.add(strArr[i * 2]);
            }
            if (Collections.unmodifiableSet(treeSet).contains("User-Agent")) {
                return;
            }
            c0596.m1736("User-Agent", c1982.f8634);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0712 m4112(C1982 c1982) {
        C0706 c0706;
        try {
            C0595.C0596 c0596 = new C0595.C0596();
            c0596.m1737(c1982.m4097());
            m4111(c0596, c1982);
            AbstractC0719 m4094 = c1982.m4094();
            m4094.mo1730();
            c0596.m1739("POST", new C1989(m4094, new C1978(c1982)));
            C0595 m1734 = c0596.m1734();
            C0706 c07062 = c1982.f8623;
            if (c07062 != null) {
                C0706.C0707 c0707 = new C0706.C0707(c07062);
                f8720.getClass();
                c0707.f4705 = null;
                c0706 = new C0706(c0707);
            } else {
                c0706 = f8720;
            }
            c1982.f8633 = c0706.m1969(m1734);
            System.currentTimeMillis();
            C0712 m1724 = ((C0586) c1982.f8633).m1724();
            System.currentTimeMillis();
            return m1724;
        } catch (IOException e) {
            throw new C2026(e);
        }
    }
}
