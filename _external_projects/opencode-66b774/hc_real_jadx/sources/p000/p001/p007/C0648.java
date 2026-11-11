package p000.p001.p007;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC0714;
import p000.C0694;
import p000.C0698;
import p000.C0701;
import p000.InterfaceC0720;
import p000.p001.C0629;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0648 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0650 f4404;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC0720 f4406;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0694 f4407;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public List<Proxy> f4408;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f4409;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final AbstractC0714 f4410;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public List<InetSocketAddress> f4405 = Collections.emptyList();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final List<C0701> f4403 = new ArrayList();

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0649 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f4411 = 0;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<C0701> f4412;

        public C0649(List<C0701> list) {
            this.f4412 = list;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m1869() {
            return this.f4411 < this.f4412.size();
        }
    }

    public C0648(C0694 c0694, C0650 c0650, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714) {
        List<Proxy> m1808;
        this.f4408 = Collections.emptyList();
        this.f4407 = c0694;
        this.f4404 = c0650;
        this.f4406 = interfaceC0720;
        this.f4410 = abstractC0714;
        C0698 c0698 = c0694.f4620;
        Proxy proxy = c0694.f4615;
        if (proxy != null) {
            m1808 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = c0694.f4617.select(c0698.m1957());
            m1808 = (select == null || select.isEmpty()) ? C0629.m1808(Proxy.NO_PROXY) : C0629.m1810(select);
        }
        this.f4408 = m1808;
        this.f4409 = 0;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m1866() {
        return m1867() || !this.f4403.isEmpty();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m1867() {
        return this.f4409 < this.f4408.size();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1868(C0701 c0701, IOException iOException) {
        C0694 c0694;
        ProxySelector proxySelector;
        if (c0701.f4666.type() != Proxy.Type.DIRECT && (proxySelector = (c0694 = this.f4407).f4617) != null) {
            proxySelector.connectFailed(c0694.f4620.m1957(), c0701.f4666.address(), iOException);
        }
        C0650 c0650 = this.f4404;
        synchronized (c0650) {
            c0650.f4413.add(c0701);
        }
    }
}
