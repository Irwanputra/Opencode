package com.trilead.ssh2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class Connection {
    public java.security.SecureRandom a;
    public dev.epro.r0.D10990946933839330193 b;
    private dev.epro.r0.I13897573759869141187 cm;
    public final java.lang.String e;
    public final int f;
    protected dev.epro.r0.T1177712003054613961 tm;
    private boolean authenticated = false;
    public final com.trilead.ssh2.crypto.CryptoWishList c = new com.trilead.ssh2.crypto.CryptoWishList();
    public final dev.epro.r0.A4620944990041811311 d = new dev.epro.r0.A4620944990041811311();
    public boolean g = false;
    protected dev.epro.r0.S5658423376814904854 proxyData = null;
    public final java.util.Vector h = new java.util.Vector();

    public Connection(java.lang.String str, int i) {
        this.e = str;
        this.f = i;
    }

    public final synchronized void a(dev.epro.r0.L11657701423026125920 l11657701423026125920) {
        if (l11657701423026125920 == null) {
            throw new java.lang.IllegalArgumentException("cmon argument is null");
        }
        this.h.addElement(l11657701423026125920);
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            java.util.Vector vector = this.h;
            synchronized (t1177712003054613961) {
                t1177712003054613961.l = (java.util.Vector) vector.clone();
            }
        }
    }

    public final synchronized boolean b(java.lang.String str, java.lang.String str2) {
        boolean zC;
        try {
            if (this.tm == null) {
                throw new java.lang.IllegalStateException("Connection is not established!");
            }
            if (this.authenticated) {
                throw new java.lang.IllegalStateException("Connection is already authenticated!");
            }
            if (this.b == null) {
                dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.tm;
                dev.epro.r0.D10990946933839330193 d10990946933839330193 = new dev.epro.r0.D10990946933839330193();
                d10990946933839330193.b = new java.util.Vector();
                d10990946933839330193.c = false;
                d10990946933839330193.d = new java.util.ArrayList();
                d10990946933839330193.e = new java.lang.String[0];
                d10990946933839330193.f = false;
                d10990946933839330193.a = t1177712003054613961;
                this.b = d10990946933839330193;
            }
            if (this.cm == null) {
                this.cm = new dev.epro.r0.I13897573759869141187(this.tm);
            }
            zC = this.b.c(str, str2);
            this.authenticated = zC;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return zC;
    }

    public final synchronized void c() {
        d(new java.lang.Throwable("Closed due to user request."));
    }

    public final void d(java.lang.Throwable th) {
        java.util.Vector vector;
        dev.epro.r0.I13897573759869141187 i13897573759869141187 = this.cm;
        if (i13897573759869141187 != null) {
            synchronized (i13897573759869141187.c) {
                vector = (java.util.Vector) i13897573759869141187.c.clone();
            }
            for (int i = 0; i < vector.size(); i++) {
                try {
                    i13897573759869141187.d((dev.epro.r0.C16667689525325095505) vector.elementAt(i), "Closing all channels");
                } catch (java.io.IOException unused) {
                }
            }
        }
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            t1177712003054613961.b(th, true);
            this.tm = null;
        }
        this.b = null;
        this.cm = null;
        this.authenticated = false;
    }

    public final synchronized dev.epro.r0.P10351157897044641494 e(dev.epro.r0.M11115334227134251595 m11115334227134251595, int i, int i2) {
        dev.epro.r0.P10351157897044641494 p10351157897044641494E;
        if (this.tm != null) {
            throw new java.io.IOException("Connection to " + this.e + " is already in connected state!");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("connectTimeout must be non-negative!");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("kexTimeout must be non-negative!");
        }
        dev.epro.r0.L18233974379278055712 l18233974379278055712 = new dev.epro.r0.L18233974379278055712();
        l18233974379278055712.b = false;
        l18233974379278055712.c = false;
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = new dev.epro.r0.I1632105416032993715(this.e);
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = new dev.epro.r0.T1177712003054613961(this.e, this.f);
        this.tm = t1177712003054613961;
        java.util.Vector vector = this.h;
        synchronized (t1177712003054613961) {
            t1177712003054613961.l = (java.util.Vector) vector.clone();
        }
        synchronized (this.tm) {
        }
        dev.epro.r0.O7793501798836965517 o7793501798836965517 = null;
        try {
            if (i2 > 0) {
                try {
                    dev.epro.r0.I3863025946240164840 i3863025946240164840 = new dev.epro.r0.I3863025946240164840(this, l18233974379278055712, false, (byte) 6);
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + ((long) i2);
                    dev.epro.r0.O7793501798836965517 o77935017988369655172 = new dev.epro.r0.O7793501798836965517();
                    o77935017988369655172.b = false;
                    o77935017988369655172.a = i3863025946240164840;
                    long jCurrentTimeMillis2 = jCurrentTimeMillis - java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis2 < 0) {
                        jCurrentTimeMillis2 = 0;
                    }
                    i1632105416032993715.b = ((java.util.concurrent.ScheduledExecutorService) i1632105416032993715.d).schedule((java.lang.Runnable) o77935017988369655172, jCurrentTimeMillis2, java.util.concurrent.TimeUnit.MILLISECONDS);
                    o7793501798836965517 = o77935017988369655172;
                } catch (java.lang.Throwable th) {
                    if (o7793501798836965517 == null) {
                        throw th;
                    }
                    o7793501798836965517.b = true;
                    ((java.util.concurrent.ScheduledFuture) i1632105416032993715.b).cancel(true);
                    ((java.util.concurrent.ScheduledExecutorService) i1632105416032993715.d).shutdownNow();
                    synchronized (l18233974379278055712) {
                        try {
                            if (l18233974379278055712.c) {
                                throw new java.io.IOException("This exception will be replaced by the one below =)");
                            }
                            l18233974379278055712.b = true;
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            try {
                dev.epro.r0.T1177712003054613961 t11777120030546139612 = this.tm;
                com.trilead.ssh2.crypto.CryptoWishList cryptoWishList = this.c;
                dev.epro.r0.A4620944990041811311 a4620944990041811311 = this.d;
                java.security.SecureRandom secureRandom = this.a;
                if (secureRandom == null) {
                    try {
                        secureRandom = java.security.SecureRandom.getInstance("SHA1PRNG");
                    } catch (java.security.NoSuchAlgorithmException unused) {
                        secureRandom = new java.security.SecureRandom();
                    }
                    this.a = secureRandom;
                }
                t11777120030546139612.f(cryptoWishList, m11115334227134251595, a4620944990041811311, i, secureRandom, this.proxyData);
                this.tm.d.setTcpNoDelay(this.g);
                p10351157897044641494E = this.tm.e();
                if (o7793501798836965517 != null) {
                    o7793501798836965517.b = true;
                    ((java.util.concurrent.ScheduledFuture) i1632105416032993715.b).cancel(true);
                    ((java.util.concurrent.ScheduledExecutorService) i1632105416032993715.d).shutdownNow();
                    synchronized (l18233974379278055712) {
                        try {
                            if (l18233974379278055712.c) {
                                throw new java.io.IOException("This exception will be replaced by the one below =)");
                            }
                            l18233974379278055712.b = true;
                        } finally {
                        }
                    }
                }
            } catch (java.net.SocketTimeoutException e) {
                throw ((java.net.SocketTimeoutException) new java.net.SocketTimeoutException("The connect() operation on the socket timed out.").initCause(e));
            }
        } catch (java.net.SocketTimeoutException e2) {
            throw e2;
        } catch (java.io.IOException e3) {
            d(new java.lang.Throwable("There was a problem during connect.").initCause(e3));
            synchronized (l18233974379278055712) {
                if (l18233974379278055712.c) {
                    throw new java.net.SocketTimeoutException("The kexTimeout (" + i2 + " ms) expired.");
                }
                if (e3 instanceof dev.epro.r0.Q16121916119380275638) {
                    throw e3;
                }
                throw ((java.io.IOException) new java.io.IOException("There was a problem while connecting to " + this.e + ":" + this.f).initCause(e3));
            }
        }
        return p10351157897044641494E;
    }

    public final synchronized dev.epro.r0.P10351157897044641494 f() {
        dev.epro.r0.T1177712003054613961 t1177712003054613961;
        t1177712003054613961 = this.tm;
        if (t1177712003054613961 == null) {
            throw new java.lang.IllegalStateException("Cannot get details of connection, you need to establish a connection first.");
        }
        return t1177712003054613961.e();
    }

    public final synchronized dev.epro.r0.D14731132657808549702 g() {
        dev.epro.r0.T1177712003054613961 t1177712003054613961;
        t1177712003054613961 = this.tm;
        if (t1177712003054613961 == null) {
            throw new java.lang.IllegalStateException("Cannot get details of connection, you need to establish a connection first.");
        }
        return t1177712003054613961.n;
    }

    public final synchronized void h() {
        if (this.tm == null) {
            throw new java.lang.IllegalStateException("You need to establish a connection first.");
        }
        if (!this.authenticated) {
            throw new java.lang.IllegalStateException("The connection is not authenticated.");
        }
        this.cm.q();
    }

    public final synchronized void i(boolean z) {
        try {
            java.lang.String[] strArr = z ? new java.lang.String[]{"zlib@openssh.com", "zlib", "none"} : new java.lang.String[]{"none"};
            com.trilead.ssh2.crypto.CryptoWishList cryptoWishList = this.c;
            cryptoWishList.c2s_comp_algos = strArr;
            cryptoWishList.s2c_comp_algos = strArr;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(dev.epro.r0.S5658423376814904854 s5658423376814904854) {
        this.proxyData = s5658423376814904854;
    }

    public final synchronized void k(boolean z) {
        this.g = z;
        dev.epro.r0.T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            t1177712003054613961.d.setTcpNoDelay(z);
        }
    }
}
