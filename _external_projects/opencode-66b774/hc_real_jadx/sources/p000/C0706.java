package p000;

import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p000.AbstractC0714;
import p000.C0597;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p000.p001.p004.C0626;
import p000.p001.p005.InterfaceC0635;
import p000.p001.p006.AbstractC0638;
import p000.p001.p006.C0641;
import p000.p001.p007.C0643;
import p000.p001.p007.C0645;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0706 implements Cloneable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final AbstractC0714.InterfaceC0715 f4675;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0725 f4676;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final int f4677;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final List<InterfaceC0717> f4678;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final InterfaceC0590 f4679;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final int f4680;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final C0702 f4681;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final int f4682;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final InterfaceC0584 f4683;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final HostnameVerifier f4684;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    @Nullable
    public final Proxy f4685;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final InterfaceC0704 f4686;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final boolean f4687;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final InterfaceC0584 f4688;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<C0582> f4689;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final SocketFactory f4690;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final boolean f4691;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final List<InterfaceC0717> f4692;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    @Nullable
    public final SSLSocketFactory f4693;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final C0588 f4694;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final int f4695;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final List<EnumC0721> f4696;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final boolean f4697;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    @Nullable
    public final AbstractC0638 f4698;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final ProxySelector f4699;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    @Nullable
    public final InterfaceC0635 f4700;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final List<EnumC0721> f4674 = C0629.m1808(EnumC0721.HTTP_2, EnumC0721.HTTP_1_1);

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final List<C0582> f4673 = C0629.m1808(C0582.f4213, C0582.f4210);

    /* renamed from: 〳ぜぞぜべっ.でどあくず$〺つふすそ, reason: contains not printable characters */
    public static final class C0707 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public ProxySelector f4701;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        @Nullable
        public Proxy f4702;

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public int f4703;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public AbstractC0714.InterfaceC0715 f4704;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        @Nullable
        public InterfaceC0635 f4705;

        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        public int f4706;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public InterfaceC0584 f4707;

        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public int f4708;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public InterfaceC0584 f4709;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public C0702 f4710;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public List<EnumC0721> f4711;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0725 f4712;

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public boolean f4713;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public boolean f4714;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public C0588 f4715;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final List<InterfaceC0717> f4716;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        @Nullable
        public SSLSocketFactory f4717;

        /* renamed from: でどあくず, reason: contains not printable characters */
        public boolean f4718;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final List<InterfaceC0717> f4719;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        @Nullable
        public AbstractC0638 f4720;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public InterfaceC0704 f4721;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public List<C0582> f4722;

        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public int f4723;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public HostnameVerifier f4724;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public InterfaceC0590 f4725;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public SocketFactory f4726;

        public C0707() {
            this.f4716 = new ArrayList();
            this.f4719 = new ArrayList();
            this.f4712 = new C0725();
            this.f4711 = C0706.f4674;
            this.f4722 = C0706.f4673;
            this.f4704 = new C0722(AbstractC0714.f4777);
            this.f4701 = ProxySelector.getDefault();
            this.f4725 = InterfaceC0590.f4237;
            this.f4726 = SocketFactory.getDefault();
            this.f4724 = C0641.f4366;
            this.f4710 = C0702.f4669;
            InterfaceC0584 interfaceC0584 = InterfaceC0584.f4222;
            this.f4707 = interfaceC0584;
            this.f4709 = interfaceC0584;
            this.f4715 = new C0588();
            this.f4721 = InterfaceC0704.f4672;
            this.f4713 = true;
            this.f4714 = true;
            this.f4718 = true;
            this.f4723 = 10000;
            this.f4703 = 10000;
            this.f4708 = 10000;
            this.f4706 = 0;
        }

        public C0707(C0706 c0706) {
            ArrayList arrayList = new ArrayList();
            this.f4716 = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f4719 = arrayList2;
            this.f4712 = c0706.f4676;
            this.f4702 = c0706.f4685;
            this.f4711 = c0706.f4696;
            this.f4722 = c0706.f4689;
            arrayList.addAll(c0706.f4692);
            arrayList2.addAll(c0706.f4678);
            this.f4704 = c0706.f4675;
            this.f4701 = c0706.f4699;
            this.f4725 = c0706.f4679;
            this.f4705 = c0706.f4700;
            this.f4726 = c0706.f4690;
            this.f4717 = c0706.f4693;
            this.f4720 = c0706.f4698;
            this.f4724 = c0706.f4684;
            this.f4710 = c0706.f4681;
            this.f4707 = c0706.f4683;
            this.f4709 = c0706.f4688;
            this.f4715 = c0706.f4694;
            this.f4721 = c0706.f4686;
            this.f4713 = c0706.f4687;
            this.f4714 = c0706.f4691;
            this.f4718 = c0706.f4697;
            this.f4723 = c0706.f4677;
            this.f4703 = c0706.f4682;
            this.f4708 = c0706.f4680;
            this.f4706 = c0706.f4695;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0707 m1970(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            this.f4717 = sSLSocketFactory;
            C0626 c0626 = C0626.f4331;
            X509TrustManager mo1785 = c0626.mo1785(sSLSocketFactory);
            if (mo1785 != null) {
                this.f4720 = c0626.mo1788(mo1785);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + c0626 + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0707 m1971(long j, TimeUnit timeUnit) {
            this.f4723 = C0629.m1811("timeout", j, timeUnit);
            return this;
        }
    }

    /* renamed from: 〳ぜぞぜべっ.でどあくず$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0708 extends AbstractC0631 {
        @Override // p000.p001.AbstractC0631
        /* renamed from: 〺つふすそ */
        public Socket mo1827(C0588 c0588, C0694 c0694, C0643 c0643) {
            for (C0645 c0645 : c0588.f4235) {
                if (c0645.m1858(c0694, null) && c0645.m1856() && c0645 != c0643.m1848()) {
                    if (c0643.f4382 != null || c0643.f4374.f4397.size() != 1) {
                        throw new IllegalStateException();
                    }
                    Reference<C0643> reference = c0643.f4374.f4397.get(0);
                    Socket m1850 = c0643.m1850(true, false, false);
                    c0643.f4374 = c0645;
                    c0645.f4397.add(reference);
                    return m1850;
                }
            }
            return null;
        }

        @Override // p000.p001.AbstractC0631
        /* renamed from: くし〴〺ぅ */
        public C0645 mo1828(C0588 c0588, C0694 c0694, C0643 c0643, C0701 c0701) {
            for (C0645 c0645 : c0588.f4235) {
                if (c0645.m1858(c0694, c0701)) {
                    c0643.m1851(c0645, true);
                    return c0645;
                }
            }
            return null;
        }

        @Override // p000.p001.AbstractC0631
        /* renamed from: げつ〴ぬぐ */
        public void mo1829(C0597.C0598 c0598, String str, String str2) {
            c0598.f4258.add(str);
            c0598.f4258.add(str2.trim());
        }
    }

    static {
        AbstractC0631.f4356 = new C0708();
    }

    public C0706() {
        this(new C0707());
    }

    public C0706(C0707 c0707) {
        boolean z;
        AbstractC0638 abstractC0638;
        this.f4676 = c0707.f4712;
        this.f4685 = c0707.f4702;
        this.f4696 = c0707.f4711;
        List<C0582> list = c0707.f4722;
        this.f4689 = list;
        this.f4692 = C0629.m1810(c0707.f4716);
        this.f4678 = C0629.m1810(c0707.f4719);
        this.f4675 = c0707.f4704;
        this.f4699 = c0707.f4701;
        this.f4679 = c0707.f4725;
        this.f4700 = c0707.f4705;
        this.f4690 = c0707.f4726;
        Iterator<C0582> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().f4216;
            }
        }
        SSLSocketFactory sSLSocketFactory = c0707.f4717;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    C0626 c0626 = C0626.f4331;
                    SSLContext mo1782 = c0626.mo1782();
                    mo1782.init(null, new TrustManager[]{x509TrustManager}, null);
                    this.f4693 = mo1782.getSocketFactory();
                    abstractC0638 = c0626.mo1788(x509TrustManager);
                } catch (GeneralSecurityException e) {
                    throw C0629.m1812("No System TLS", e);
                }
            } catch (GeneralSecurityException e2) {
                throw C0629.m1812("No System TLS", e2);
            }
        } else {
            this.f4693 = sSLSocketFactory;
            abstractC0638 = c0707.f4720;
        }
        this.f4698 = abstractC0638;
        this.f4684 = c0707.f4724;
        C0702 c0702 = c0707.f4710;
        this.f4681 = C0629.m1817(c0702.f4670, abstractC0638) ? c0702 : new C0702(c0702.f4671, abstractC0638);
        this.f4683 = c0707.f4707;
        this.f4688 = c0707.f4709;
        this.f4694 = c0707.f4715;
        this.f4686 = c0707.f4721;
        this.f4687 = c0707.f4713;
        this.f4691 = c0707.f4714;
        this.f4697 = c0707.f4718;
        this.f4677 = c0707.f4723;
        this.f4682 = c0707.f4703;
        this.f4680 = c0707.f4708;
        this.f4695 = c0707.f4706;
        if (this.f4692.contains(null)) {
            StringBuilder m4207 = C2098.m4207("Null interceptor: ");
            m4207.append(this.f4692);
            throw new IllegalStateException(m4207.toString());
        }
        if (this.f4678.contains(null)) {
            StringBuilder m42072 = C2098.m4207("Null network interceptor: ");
            m42072.append(this.f4678);
            throw new IllegalStateException(m42072.toString());
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC0720 m1969(C0595 c0595) {
        C0586 c0586 = new C0586(this, c0595, false);
        c0586.f4228 = ((C0722) this.f4675).f4785;
        return c0586;
    }
}
