package p000.p001.p007;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC0714;
import p000.C0582;
import p000.C0588;
import p000.C0594;
import p000.C0595;
import p000.C0597;
import p000.C0694;
import p000.C0698;
import p000.C0701;
import p000.C0702;
import p000.C0706;
import p000.C0712;
import p000.EnumC0721;
import p000.InterfaceC0717;
import p000.InterfaceC0720;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p000.p001.p002.C0599;
import p000.p001.p003.C0614;
import p000.p001.p003.C0615;
import p000.p001.p003.InterfaceC0612;
import p000.p001.p004.C0626;
import p000.p001.p006.C0641;
import p000.p001.p008.C0654;
import p000.p001.p008.C0663;
import p000.p001.p008.C0667;
import p000.p001.p008.C0673;
import p000.p001.p008.C0677;
import p000.p001.p008.C0679;
import p000.p001.p008.EnumC0653;
import p131.p155.p156.p157.C2098;
import p243.C2803;
import p243.C2809;
import p243.C2810;
import p243.C2817;
import p243.InterfaceC2805;
import p243.InterfaceC2823;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0645 extends C0654.AbstractC0660 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C0654 f4386;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0588 f4387;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public EnumC0721 f4388;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC2823 f4389;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0701 f4391;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Socket f4392;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f4393;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C0594 f4394;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Socket f4396;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC2805 f4398;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f4399;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f4395 = 1;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final List<Reference<C0643>> f4397 = new ArrayList();

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public long f4390 = Long.MAX_VALUE;

    public C0645(C0588 c0588, C0701 c0701) {
        this.f4387 = c0588;
        this.f4391 = c0701;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Connection{");
        m4207.append(this.f4391.f4668.f4620.f4650);
        m4207.append(":");
        m4207.append(this.f4391.f4668.f4620.f4648);
        m4207.append(", proxy=");
        m4207.append(this.f4391.f4666);
        m4207.append(" hostAddress=");
        m4207.append(this.f4391.f4667);
        m4207.append(" cipherSuite=");
        C0594 c0594 = this.f4394;
        m4207.append(c0594 != null ? c0594.f4242 : "none");
        m4207.append(" protocol=");
        m4207.append(this.f4388);
        m4207.append('}');
        return m4207.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m1856() {
        return this.f4386 != null;
    }

    @Override // p000.p001.p008.C0654.AbstractC0660
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo1857(C0663 c0663) {
        c0663.m1886(EnumC0653.REFUSED_STREAM);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m1858(C0694 c0694, @Nullable C0701 c0701) {
        if (this.f4397.size() < this.f4395 && !this.f4399) {
            AbstractC0631 abstractC0631 = AbstractC0631.f4356;
            C0694 c06942 = this.f4391.f4668;
            ((C0706.C0708) abstractC0631).getClass();
            if (!c06942.m1943(c0694)) {
                return false;
            }
            if (c0694.f4620.f4650.equals(this.f4391.f4668.f4620.f4650)) {
                return true;
            }
            if (this.f4386 == null || c0701 == null || c0701.f4666.type() != Proxy.Type.DIRECT || this.f4391.f4666.type() != Proxy.Type.DIRECT || !this.f4391.f4667.equals(c0701.f4667) || c0701.f4668.f4618 != C0641.f4366 || !m1859(c0694.f4620)) {
                return false;
            }
            try {
                c0694.f4625.m1968(c0694.f4620.f4650, this.f4394.f4243);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m1859(C0698 c0698) {
        int i = c0698.f4648;
        C0698 c06982 = this.f4391.f4668.f4620;
        if (i != c06982.f4648) {
            return false;
        }
        if (c0698.f4650.equals(c06982.f4650)) {
            return true;
        }
        C0594 c0594 = this.f4394;
        return c0594 != null && C0641.f4366.m1845(c0698.f4650, (X509Certificate) c0594.f4243.get(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1860(int r16, int r17, int r18, int r19, boolean r20, p000.InterfaceC0720 r21, p000.AbstractC0714 r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p007.C0645.m1860(int, int, int, int, boolean, 〳ぜぞぜべっ.びぐびあび, 〳ぜぞぜべっ.のぷのちつ):void");
    }

    @Override // p000.p001.p008.C0654.AbstractC0660
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1861(C0654 c0654) {
        synchronized (this.f4387) {
            this.f4395 = c0654.m1879();
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1862(int i, int i2, int i3, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714) {
        C0595.C0596 c0596 = new C0595.C0596();
        c0596.m1738(this.f4391.f4668.f4620);
        c0596.m1735("Host", C0629.m1824(this.f4391.f4668.f4620, true));
        C0597.C0598 c0598 = c0596.f4253;
        c0598.m1747("Proxy-Connection", "Keep-Alive");
        c0598.m1749("Proxy-Connection");
        c0598.f4258.add("Proxy-Connection");
        c0598.f4258.add("Keep-Alive");
        C0597.C0598 c05982 = c0596.f4253;
        c05982.m1747("User-Agent", "okhttp/3.10.0");
        c05982.m1749("User-Agent");
        c05982.f4258.add("User-Agent");
        c05982.f4258.add("okhttp/3.10.0");
        C0595 m1734 = c0596.m1734();
        C0698 c0698 = m1734.f4248;
        m1864(i, i2, interfaceC0720, abstractC0714);
        String str = "CONNECT " + C0629.m1824(c0698, true) + " HTTP/1.1";
        InterfaceC2805 interfaceC2805 = this.f4398;
        C0599 c0599 = new C0599(null, null, interfaceC2805, this.f4389);
        C2803 mo1761 = interfaceC2805.mo1761();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo1761.mo4857(j, timeUnit);
        this.f4389.mo1764().mo4857(i3, timeUnit);
        c0599.m1760(m1734.f4247, str);
        c0599.f4264.flush();
        C0712.C0713 mo1757 = c0599.mo1757(false);
        mo1757.f4770 = m1734;
        C0712 m1976 = mo1757.m1976();
        long m1773 = C0614.m1773(m1976);
        if (m1773 == -1) {
            m1773 = 0;
        }
        InterfaceC2827 m1750 = c0599.m1750(m1773);
        C0629.m1814(m1750, Integer.MAX_VALUE, timeUnit);
        ((C0599.C0605) m1750).close();
        int i4 = m1976.f4761;
        if (i4 == 200) {
            if (!this.f4398.mo4868().mo4874() || !this.f4389.mo4888().mo4874()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i4 == 407) {
                this.f4391.f4668.f4623.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder m4207 = C2098.m4207("Unexpected response code for CONNECT: ");
            m4207.append(m1976.f4761);
            throw new IOException(m4207.toString());
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1863(C0642 c0642, int i, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714) {
        SSLSocket sSLSocket;
        EnumC0721 enumC0721 = EnumC0721.HTTP_1_1;
        if (this.f4391.f4668.f4624 == null) {
            this.f4388 = enumC0721;
            this.f4392 = this.f4396;
            return;
        }
        abstractC0714.getClass();
        C0694 c0694 = this.f4391.f4668;
        SSLSocketFactory sSLSocketFactory = c0694.f4624;
        try {
            try {
                Socket socket = this.f4396;
                C0698 c0698 = c0694.f4620;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, c0698.f4650, c0698.f4648, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            C0582 m1846 = c0642.m1846(sSLSocket);
            if (m1846.f4214) {
                C0626.f4331.mo1784(sSLSocket, c0694.f4620.f4650, c0694.f4621);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (!(("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) ? false : true)) {
                throw new IOException("a valid ssl session was not established");
            }
            C0594 m1732 = C0594.m1732(session);
            if (!c0694.f4618.verify(c0694.f4620.f4650, session)) {
                X509Certificate x509Certificate = (X509Certificate) m1732.f4243.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + c0694.f4620.f4650 + " not verified:\n    certificate: " + C0702.m1967(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C0641.m1844(x509Certificate));
            }
            c0694.f4625.m1968(c0694.f4620.f4650, m1732.f4243);
            String mo1781 = m1846.f4214 ? C0626.f4331.mo1781(sSLSocket) : null;
            this.f4392 = sSLSocket;
            this.f4398 = new C2817(C2810.m4896(sSLSocket));
            this.f4389 = new C2809(C2810.m4893(this.f4392));
            this.f4394 = m1732;
            if (mo1781 != null) {
                enumC0721 = EnumC0721.m1980(mo1781);
            }
            this.f4388 = enumC0721;
            C0626.f4331.mo1802(sSLSocket);
            if (this.f4388 == EnumC0721.HTTP_2) {
                this.f4392.setSoTimeout(0);
                C0654.C0656 c0656 = new C0654.C0656(true);
                Socket socket2 = this.f4392;
                String str = this.f4391.f4668.f4620.f4650;
                InterfaceC2805 interfaceC2805 = this.f4398;
                InterfaceC2823 interfaceC2823 = this.f4389;
                c0656.f4458 = socket2;
                c0656.f4456 = str;
                c0656.f4457 = interfaceC2805;
                c0656.f4461 = interfaceC2823;
                c0656.f4459 = this;
                c0656.f4460 = i;
                C0654 c0654 = new C0654(c0656);
                this.f4386 = c0654;
                C0667 c0667 = c0654.f4448;
                synchronized (c0667) {
                    if (c0667.f4505) {
                        throw new IOException("closed");
                    }
                    if (c0667.f4503) {
                        Logger logger = C0667.f4500;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(C0629.m1820(">> CONNECTION %s", C0677.f4539.mo4844()));
                        }
                        c0667.f4501.mo4886(C0677.f4539.mo4853());
                        c0667.f4501.flush();
                    }
                }
                C0667 c06672 = c0654.f4448;
                C0673 c0673 = c0654.f4439;
                synchronized (c06672) {
                    if (c06672.f4505) {
                        throw new IOException("closed");
                    }
                    c06672.m1899(0, Integer.bitCount(c0673.f4528) * 6, (byte) 4, (byte) 0);
                    int i2 = 0;
                    while (i2 < 10) {
                        if (((1 << i2) & c0673.f4528) != 0) {
                            c06672.f4501.mo4882(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                            c06672.f4501.mo4883(c0673.f4527[i2]);
                        }
                        i2++;
                    }
                    c06672.f4501.flush();
                }
                if (c0654.f4439.m1918() != 65535) {
                    c0654.f4448.m1897(0, r9 - 65535);
                }
                new Thread(c0654.f4441).start();
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!C0629.m1821(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                C0626.f4331.mo1802(sSLSocket);
            }
            C0629.m1819(sSLSocket);
            throw th;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1864(int i, int i2, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714) {
        C0701 c0701 = this.f4391;
        Proxy proxy = c0701.f4666;
        this.f4396 = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? c0701.f4668.f4619.createSocket() : new Socket(proxy);
        InetSocketAddress inetSocketAddress = this.f4391.f4667;
        abstractC0714.getClass();
        this.f4396.setSoTimeout(i2);
        try {
            C0626.f4331.mo1790(this.f4396, this.f4391.f4667, i);
            try {
                this.f4398 = new C2817(C2810.m4896(this.f4396));
                this.f4389 = new C2809(C2810.m4893(this.f4396));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder m4207 = C2098.m4207("Failed to connect to ");
            m4207.append(this.f4391.f4667);
            ConnectException connectException = new ConnectException(m4207.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC0612 m1865(C0706 c0706, InterfaceC0717.InterfaceC0718 interfaceC0718, C0643 c0643) {
        if (this.f4386 != null) {
            return new C0679(c0706, interfaceC0718, c0643, this.f4386);
        }
        C0615 c0615 = (C0615) interfaceC0718;
        this.f4392.setSoTimeout(c0615.f4297);
        C2803 mo1761 = this.f4398.mo1761();
        long j = c0615.f4297;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo1761.mo4857(j, timeUnit);
        this.f4389.mo1764().mo4857(c0615.f4305, timeUnit);
        return new C0599(c0706, c0643, this.f4398, this.f4389);
    }
}
