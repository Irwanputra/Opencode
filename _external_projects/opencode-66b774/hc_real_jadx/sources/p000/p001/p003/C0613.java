package p000.p001.p003;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import p000.AbstractC0719;
import p000.C0595;
import p000.C0597;
import p000.C0695;
import p000.C0712;
import p000.C0723;
import p000.InterfaceC0590;
import p000.InterfaceC0717;
import p000.p001.C0629;
import p243.C2810;
import p243.C2817;
import p243.C2821;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぁごぐすすぃ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0613 implements InterfaceC0717 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC0590 f4293;

    public C0613(InterfaceC0590 interfaceC0590) {
        this.f4293 = interfaceC0590;
    }

    @Override // p000.InterfaceC0717
    /* renamed from: げつ〴ぬぐ */
    public C0712 mo1768(InterfaceC0717.InterfaceC0718 interfaceC0718) {
        boolean z;
        C0615 c0615 = (C0615) interfaceC0718;
        C0595 c0595 = c0615.f4302;
        C0595.C0596 c0596 = new C0595.C0596(c0595);
        AbstractC0719 abstractC0719 = c0595.f4251;
        if (abstractC0719 != null) {
            C0695 mo1729 = abstractC0719.mo1729();
            if (mo1729 != null) {
                c0596.m1735("Content-Type", mo1729.f4630);
            }
            long mo1730 = abstractC0719.mo1730();
            if (mo1730 != -1) {
                c0596.m1735("Content-Length", Long.toString(mo1730));
                c0596.f4253.m1749("Transfer-Encoding");
            } else {
                C0597.C0598 c0598 = c0596.f4253;
                c0598.m1747("Transfer-Encoding", "chunked");
                c0598.m1749("Transfer-Encoding");
                c0598.f4258.add("Transfer-Encoding");
                c0598.f4258.add("chunked");
                c0596.f4253.m1749("Content-Length");
            }
        }
        if (c0595.f4247.m1743("Host") == null) {
            c0596.m1735("Host", C0629.m1824(c0595.f4248, false));
        }
        if (c0595.f4247.m1743("Connection") == null) {
            C0597.C0598 c05982 = c0596.f4253;
            c05982.m1747("Connection", "Keep-Alive");
            c05982.m1749("Connection");
            c05982.f4258.add("Connection");
            c05982.f4258.add("Keep-Alive");
        }
        if (c0595.f4247.m1743("Accept-Encoding") == null && c0595.f4247.m1743("Range") == null) {
            C0597.C0598 c05983 = c0596.f4253;
            c05983.m1747("Accept-Encoding", "gzip");
            c05983.m1749("Accept-Encoding");
            c05983.f4258.add("Accept-Encoding");
            c05983.f4258.add("gzip");
            z = true;
        } else {
            z = false;
        }
        ((InterfaceC0590.C0591) this.f4293).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C0723 c0723 = (C0723) emptyList.get(i);
                sb.append(c0723.f4794);
                sb.append('=');
                sb.append(c0723.f4791);
            }
            c0596.m1735("Cookie", sb.toString());
        }
        if (c0595.f4247.m1743("User-Agent") == null) {
            C0597.C0598 c05984 = c0596.f4253;
            c05984.m1747("User-Agent", "okhttp/3.10.0");
            c05984.m1749("User-Agent");
            c05984.f4258.add("User-Agent");
            c05984.f4258.add("okhttp/3.10.0");
        }
        C0712 m1776 = c0615.m1776(c0596.m1734(), c0615.f4295, c0615.f4298, c0615.f4303);
        C0614.m1775(this.f4293, c0595.f4248, m1776.f4754);
        C0712.C0713 c0713 = new C0712.C0713(m1776);
        c0713.f4770 = c0595;
        if (z) {
            String m1743 = m1776.f4754.m1743("Content-Encoding");
            if (m1743 == null) {
                m1743 = null;
            }
            if ("gzip".equalsIgnoreCase(m1743) && C0614.m1771(m1776)) {
                C2821 c2821 = new C2821(m1776.f4752.mo1728());
                C0597.C0598 m1742 = m1776.f4754.m1742();
                m1742.m1749("Content-Encoding");
                m1742.m1749("Content-Length");
                List<String> list = m1742.f4258;
                String[] strArr = (String[]) list.toArray(new String[list.size()]);
                C0597.C0598 c05985 = new C0597.C0598();
                Collections.addAll(c05985.f4258, strArr);
                c0713.f4773 = c05985;
                String m17432 = m1776.f4754.m1743("Content-Type");
                String str = m17432 != null ? m17432 : null;
                Logger logger = C2810.f10480;
                c0713.f4767 = new C0611(str, -1L, new C2817(c2821));
            }
        }
        return c0713.m1976();
    }
}
