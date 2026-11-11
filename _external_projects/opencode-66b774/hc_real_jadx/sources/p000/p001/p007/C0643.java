package p000.p001.p007;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import p000.AbstractC0714;
import p000.C0588;
import p000.C0694;
import p000.C0698;
import p000.C0701;
import p000.C0706;
import p000.InterfaceC0704;
import p000.InterfaceC0720;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p000.p001.p003.InterfaceC0612;
import p000.p001.p007.C0648;
import p000.p001.p008.C0654;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0643 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C0648 f4371;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0648.C0649 f4372;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Object f4373;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C0645 f4374;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C0701 f4375;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0694 f4376;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final InterfaceC0720 f4377;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f4378;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final AbstractC0714 f4379;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f4380;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0588 f4381;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public InterfaceC0612 f4382;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f4383;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f4384;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0644 extends WeakReference<C0643> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f4385;

        public C0644(C0643 c0643, Object obj) {
            super(c0643);
            this.f4385 = obj;
        }
    }

    public C0643(C0588 c0588, C0694 c0694, InterfaceC0720 interfaceC0720, AbstractC0714 abstractC0714, Object obj) {
        this.f4381 = c0588;
        this.f4376 = c0694;
        this.f4377 = interfaceC0720;
        this.f4379 = abstractC0714;
        ((C0706.C0708) AbstractC0631.f4356).getClass();
        this.f4371 = new C0648(c0694, c0588.f4233, interfaceC0720, abstractC0714);
        this.f4373 = obj;
    }

    public String toString() {
        C0645 m1848 = m1848();
        return m1848 != null ? m1848.toString() : this.f4376.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x005e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0012, B:10:0x0019, B:14:0x0042, B:16:0x004c, B:20:0x0052, B:28:0x003d, B:30:0x001e, B:32:0x0022, B:34:0x0028, B:36:0x002c, B:38:0x0032, B:41:0x0038), top: B:3:0x0003 }] */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1847(java.io.IOException r7) {
        /*
            r6 = this;
            〳ぜぞぜべっ.ぁごぐすすぃ r0 = r6.f4381
            monitor-enter(r0)
            boolean r1 = r7 instanceof p000.p001.p008.C0674     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1e
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ざっざへづ r7 = (p000.p001.p008.C0674) r7     // Catch: java.lang.Throwable -> L5e
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.〺つふすそ r7 = r7.f4529     // Catch: java.lang.Throwable -> L5e
            〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.〺つふすそ r1 = p000.p001.p008.EnumC0653.REFUSED_STREAM     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L17
            int r5 = r6.f4383     // Catch: java.lang.Throwable -> L5e
            int r5 = r5 + r4
            r6.f4383 = r5     // Catch: java.lang.Throwable -> L5e
        L17:
            if (r7 != r1) goto L3d
            int r7 = r6.f4383     // Catch: java.lang.Throwable -> L5e
            if (r7 <= r4) goto L41
            goto L3d
        L1e:
            〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.くし〴〺ぅ r1 = r6.f4374     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L41
            boolean r1 = r1.m1856()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L2c
            boolean r1 = r7 instanceof p000.p001.p008.C0672     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L41
        L2c:
            〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.くし〴〺ぅ r1 = r6.f4374     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.f4393     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L3f
            〳ぜぞぜべっ.じぜこほぱ r1 = r6.f4375     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L3d
            if (r7 == 0) goto L3d
            〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.なぎぱいぢぎ r5 = r6.f4371     // Catch: java.lang.Throwable -> L5e
            r5.m1868(r1, r7)     // Catch: java.lang.Throwable -> L5e
        L3d:
            r6.f4375 = r3     // Catch: java.lang.Throwable -> L5e
        L3f:
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.くし〴〺ぅ r1 = r6.f4374     // Catch: java.lang.Throwable -> L5e
            java.net.Socket r7 = r6.m1850(r7, r2, r4)     // Catch: java.lang.Throwable -> L5e
            〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.くし〴〺ぅ r2 = r6.f4374     // Catch: java.lang.Throwable -> L5e
            if (r2 != 0) goto L52
            boolean r2 = r6.f4384     // Catch: java.lang.Throwable -> L5e
            if (r2 != 0) goto L51
            goto L52
        L51:
            r3 = r1
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            p000.p001.C0629.m1819(r7)
            if (r3 == 0) goto L5d
            〳ぜぞぜべっ.のぷのちつ r7 = r6.f4379
            r7.getClass()
        L5d:
            return
        L5e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p007.C0643.m1847(java.io.IOException):void");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public synchronized C0645 m1848() {
        return this.f4374;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m1849() {
        C0645 c0645;
        Socket m1850;
        synchronized (this.f4381) {
            c0645 = this.f4374;
            m1850 = m1850(false, true, false);
            if (this.f4374 != null) {
                c0645 = null;
            }
        }
        C0629.m1819(m1850);
        if (c0645 != null) {
            this.f4379.getClass();
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Socket m1850(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f4382 = null;
        }
        boolean z4 = true;
        if (z2) {
            this.f4378 = true;
        }
        C0645 c0645 = this.f4374;
        if (c0645 == null) {
            return null;
        }
        if (z) {
            c0645.f4399 = true;
        }
        if (this.f4382 != null) {
            return null;
        }
        if (!this.f4378 && !c0645.f4399) {
            return null;
        }
        int size = c0645.f4397.size();
        for (int i = 0; i < size; i++) {
            if (c0645.f4397.get(i).get() == this) {
                c0645.f4397.remove(i);
                if (this.f4374.f4397.isEmpty()) {
                    this.f4374.f4390 = System.nanoTime();
                    AbstractC0631 abstractC0631 = AbstractC0631.f4356;
                    C0588 c0588 = this.f4381;
                    C0645 c06452 = this.f4374;
                    ((C0706.C0708) abstractC0631).getClass();
                    c0588.getClass();
                    if (c06452.f4399 || c0588.f4232 == 0) {
                        c0588.f4235.remove(c06452);
                    } else {
                        c0588.notifyAll();
                        z4 = false;
                    }
                    if (z4) {
                        socket = this.f4374.f4392;
                        this.f4374 = null;
                        return socket;
                    }
                }
                socket = null;
                this.f4374 = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1851(C0645 c0645, boolean z) {
        if (this.f4374 != null) {
            throw new IllegalStateException();
        }
        this.f4374 = c0645;
        this.f4384 = z;
        c0645.f4397.add(new C0644(this, this.f4373));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0645 m1852(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            C0645 m1854 = m1854(i, i2, i3, i4, z);
            synchronized (this.f4381) {
                if (m1854.f4393 == 0) {
                    return m1854;
                }
                boolean z4 = false;
                if (!m1854.f4392.isClosed() && !m1854.f4392.isInputShutdown() && !m1854.f4392.isOutputShutdown()) {
                    C0654 c0654 = m1854.f4386;
                    if (c0654 != null) {
                        synchronized (c0654) {
                            z3 = c0654.f4433;
                        }
                        z4 = !z3;
                    } else {
                        if (z2) {
                            try {
                                int soTimeout = m1854.f4392.getSoTimeout();
                                try {
                                    m1854.f4392.setSoTimeout(1);
                                    if (m1854.f4398.mo4874()) {
                                        m1854.f4392.setSoTimeout(soTimeout);
                                    } else {
                                        m1854.f4392.setSoTimeout(soTimeout);
                                    }
                                } catch (Throwable th) {
                                    m1854.f4392.setSoTimeout(soTimeout);
                                    throw th;
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException unused2) {
                            }
                        }
                        z4 = true;
                    }
                }
                if (z4) {
                    return m1854;
                }
                m1853();
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m1853() {
        C0645 c0645;
        Socket m1850;
        synchronized (this.f4381) {
            c0645 = this.f4374;
            m1850 = m1850(true, false, false);
            if (this.f4374 != null) {
                c0645 = null;
            }
        }
        C0629.m1819(m1850);
        if (c0645 != null) {
            this.f4379.getClass();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0645 m1854(int i, int i2, int i3, int i4, boolean z) {
        C0645 c0645;
        C0701 c0701;
        Socket m1850;
        C0645 c06452;
        boolean z2;
        boolean z3;
        Socket socket;
        C0648.C0649 c0649;
        String str;
        int i5;
        boolean contains;
        synchronized (this.f4381) {
            if (this.f4378) {
                throw new IllegalStateException("released");
            }
            if (this.f4382 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f4380) {
                throw new IOException("Canceled");
            }
            c0645 = this.f4374;
            c0701 = null;
            m1850 = (c0645 == null || !c0645.f4399) ? null : m1850(false, false, true);
            C0645 c06453 = this.f4374;
            if (c06453 != null) {
                c0645 = null;
            } else {
                c06453 = null;
            }
            if (!this.f4384) {
                c0645 = null;
            }
            if (c06453 == null) {
                AbstractC0631.f4356.mo1828(this.f4381, this.f4376, this, null);
                c06452 = this.f4374;
                if (c06452 != null) {
                    z2 = true;
                } else {
                    c0701 = this.f4375;
                }
            }
            c06452 = c06453;
            z2 = false;
        }
        C0629.m1819(m1850);
        if (c0645 != null) {
            this.f4379.getClass();
        }
        if (z2) {
            this.f4379.getClass();
        }
        if (c06452 != null) {
            return c06452;
        }
        if (c0701 != null || ((c0649 = this.f4372) != null && c0649.m1869())) {
            z3 = false;
        } else {
            C0648 c0648 = this.f4371;
            if (!c0648.m1866()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList = new ArrayList();
            while (c0648.m1867()) {
                if (!c0648.m1867()) {
                    StringBuilder m4207 = C2098.m4207("No route to ");
                    m4207.append(c0648.f4407.f4620.f4650);
                    m4207.append("; exhausted proxy configurations: ");
                    m4207.append(c0648.f4408);
                    throw new SocketException(m4207.toString());
                }
                List<Proxy> list = c0648.f4408;
                int i6 = c0648.f4409;
                c0648.f4409 = i6 + 1;
                Proxy proxy = list.get(i6);
                c0648.f4405 = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    C0698 c0698 = c0648.f4407.f4620;
                    str = c0698.f4650;
                    i5 = c0698.f4648;
                } else {
                    SocketAddress address = proxy.address();
                    if (!(address instanceof InetSocketAddress)) {
                        StringBuilder m42072 = C2098.m4207("Proxy.address() is not an InetSocketAddress: ");
                        m42072.append(address.getClass());
                        throw new IllegalArgumentException(m42072.toString());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    i5 = inetSocketAddress.getPort();
                }
                if (i5 < 1 || i5 > 65535) {
                    throw new SocketException("No route to " + str + ":" + i5 + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    c0648.f4405.add(InetSocketAddress.createUnresolved(str, i5));
                } else {
                    c0648.f4410.getClass();
                    ((InterfaceC0704.C0705) c0648.f4407.f4616).getClass();
                    if (str == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        if (asList.isEmpty()) {
                            throw new UnknownHostException(c0648.f4407.f4616 + " returned no addresses for " + str);
                        }
                        c0648.f4410.getClass();
                        int size = asList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            c0648.f4405.add(new InetSocketAddress((InetAddress) asList.get(i7), i5));
                        }
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException(C2098.m4205("Broken system behaviour for dns lookup of ", str));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                int size2 = c0648.f4405.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C0701 c07012 = new C0701(c0648.f4407, proxy, c0648.f4405.get(i8));
                    C0650 c0650 = c0648.f4404;
                    synchronized (c0650) {
                        contains = c0650.f4413.contains(c07012);
                    }
                    if (contains) {
                        c0648.f4403.add(c07012);
                    } else {
                        arrayList.add(c07012);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(c0648.f4403);
                c0648.f4403.clear();
            }
            this.f4372 = new C0648.C0649(arrayList);
            z3 = true;
        }
        synchronized (this.f4381) {
            if (this.f4380) {
                throw new IOException("Canceled");
            }
            if (z3) {
                C0648.C0649 c06492 = this.f4372;
                c06492.getClass();
                ArrayList arrayList2 = new ArrayList(c06492.f4412);
                int size3 = arrayList2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size3) {
                        break;
                    }
                    C0701 c07013 = (C0701) arrayList2.get(i9);
                    AbstractC0631.f4356.mo1828(this.f4381, this.f4376, this, c07013);
                    C0645 c06454 = this.f4374;
                    if (c06454 != null) {
                        this.f4375 = c07013;
                        z2 = true;
                        c06452 = c06454;
                        break;
                    }
                    i9++;
                }
            }
            if (!z2) {
                if (c0701 == null) {
                    C0648.C0649 c06493 = this.f4372;
                    if (!c06493.m1869()) {
                        throw new NoSuchElementException();
                    }
                    List<C0701> list2 = c06493.f4412;
                    int i10 = c06493.f4411;
                    c06493.f4411 = i10 + 1;
                    c0701 = list2.get(i10);
                }
                this.f4375 = c0701;
                this.f4383 = 0;
                c06452 = new C0645(this.f4381, c0701);
                m1851(c06452, false);
            }
        }
        if (!z2) {
            c06452.m1860(i, i2, i3, i4, z, this.f4377, this.f4379);
            AbstractC0631 abstractC0631 = AbstractC0631.f4356;
            C0588 c0588 = this.f4381;
            ((C0706.C0708) abstractC0631).getClass();
            c0588.f4233.m1870(c06452.f4391);
            synchronized (this.f4381) {
                this.f4384 = true;
                AbstractC0631 abstractC06312 = AbstractC0631.f4356;
                C0588 c05882 = this.f4381;
                ((C0706.C0708) abstractC06312).getClass();
                if (!c05882.f4234) {
                    c05882.f4234 = true;
                    C0588.f4229.execute(c05882.f4231);
                }
                c05882.f4235.add(c06452);
                if (c06452.m1856()) {
                    socket = AbstractC0631.f4356.mo1827(this.f4381, this.f4376, this);
                    c06452 = this.f4374;
                } else {
                    socket = null;
                }
            }
            C0629.m1819(socket);
        }
        this.f4379.getClass();
        return c06452;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1855(boolean z, InterfaceC0612 interfaceC0612, long j, IOException iOException) {
        C0645 c0645;
        Socket m1850;
        boolean z2;
        this.f4379.getClass();
        synchronized (this.f4381) {
            if (interfaceC0612 != null) {
                if (interfaceC0612 == this.f4382) {
                    if (!z) {
                        this.f4374.f4393++;
                    }
                    c0645 = this.f4374;
                    m1850 = m1850(z, false, true);
                    if (this.f4374 != null) {
                        c0645 = null;
                    }
                    z2 = this.f4378;
                }
            }
            throw new IllegalStateException("expected " + this.f4382 + " but was " + interfaceC0612);
        }
        C0629.m1819(m1850);
        if (c0645 != null) {
            this.f4379.getClass();
        }
        if (iOException != null) {
            this.f4379.getClass();
        } else if (z2) {
            this.f4379.getClass();
        }
    }
}
