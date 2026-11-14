package com.trilead.ssh2;

import com.trilead.ssh2.crypto.CryptoWishList;
import dev.epro.r0.A4620944990041811311;
import dev.epro.r0.C16667689525325095505;
import dev.epro.r0.D10990946933839330193;
import dev.epro.r0.D14731132657808549702;
import dev.epro.r0.I13897573759869141187;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.I3863025946240164840;
import dev.epro.r0.L11657701423026125920;
import dev.epro.r0.L18233974379278055712;
import dev.epro.r0.M11115334227134251595;
import dev.epro.r0.O7793501798836965517;
import dev.epro.r0.P10351157897044641494;
import dev.epro.r0.Q16121916119380275638;
import dev.epro.r0.S5658423376814904854;
import dev.epro.r0.T1177712003054613961;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class Connection {
    public SecureRandom a;
    public D10990946933839330193 b;
    private I13897573759869141187 cm;
    public final String e;
    public final int f;
    protected T1177712003054613961 tm;
    private boolean authenticated = false;
    public final CryptoWishList c = new CryptoWishList();
    public final A4620944990041811311 d = new A4620944990041811311();
    public boolean g = false;
    protected S5658423376814904854 proxyData = null;
    public final Vector h = new Vector();

    public Connection(String str, int i) {
        this.e = str;
        this.f = i;
    }

    public final synchronized void a(L11657701423026125920 l11657701423026125920) {
        if (l11657701423026125920 == null) {
            throw new IllegalArgumentException("cmon argument is null");
        }
        this.h.addElement(l11657701423026125920);
        T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            Vector vector = this.h;
            synchronized (t1177712003054613961) {
                t1177712003054613961.l = (Vector) vector.clone();
            }
        }
    }

    public final synchronized boolean b(String str, String str2) {
        boolean c;
        try {
            if (this.tm == null) {
                throw new IllegalStateException("Connection is not established!");
            }
            if (this.authenticated) {
                throw new IllegalStateException("Connection is already authenticated!");
            }
            if (this.b == null) {
                T1177712003054613961 t1177712003054613961 = this.tm;
                D10990946933839330193 d10990946933839330193 = new D10990946933839330193();
                d10990946933839330193.b = new Vector();
                d10990946933839330193.c = false;
                d10990946933839330193.d = new ArrayList();
                d10990946933839330193.e = new String[0];
                d10990946933839330193.f = false;
                d10990946933839330193.a = t1177712003054613961;
                this.b = d10990946933839330193;
            }
            if (this.cm == null) {
                this.cm = new I13897573759869141187(this.tm);
            }
            c = this.b.c(str, str2);
            this.authenticated = c;
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public final synchronized void c() {
        d(new Throwable("Closed due to user request."));
    }

    public final void d(Throwable th) {
        Vector vector;
        I13897573759869141187 i13897573759869141187 = this.cm;
        if (i13897573759869141187 != null) {
            synchronized (i13897573759869141187.c) {
                vector = (Vector) i13897573759869141187.c.clone();
            }
            for (int i = 0; i < vector.size(); i++) {
                try {
                    i13897573759869141187.d((C16667689525325095505) vector.elementAt(i), "Closing all channels");
                } catch (IOException unused) {
                }
            }
        }
        T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            t1177712003054613961.b(th, true);
            this.tm = null;
        }
        this.b = null;
        this.cm = null;
        this.authenticated = false;
    }

    public final synchronized P10351157897044641494 e(M11115334227134251595 m11115334227134251595, int i, int i2) {
        P10351157897044641494 e;
        if (this.tm != null) {
            throw new IOException("Connection to " + this.e + " is already in connected state!");
        }
        if (i < 0) {
            throw new IllegalArgumentException("connectTimeout must be non-negative!");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("kexTimeout must be non-negative!");
        }
        L18233974379278055712 l18233974379278055712 = new L18233974379278055712();
        boolean z = false;
        l18233974379278055712.b = false;
        l18233974379278055712.c = false;
        I1632105416032993715 i1632105416032993715 = new I1632105416032993715(this.e);
        T1177712003054613961 t1177712003054613961 = new T1177712003054613961(this.e, this.f);
        this.tm = t1177712003054613961;
        Vector vector = this.h;
        synchronized (t1177712003054613961) {
            t1177712003054613961.l = (Vector) vector.clone();
        }
        synchronized (this.tm) {
        }
        O7793501798836965517 o7793501798836965517 = null;
        try {
            if (i2 > 0) {
                try {
                    I3863025946240164840 i3863025946240164840 = new I3863025946240164840((Object) this, (Object) l18233974379278055712, z, (byte) 6);
                    long currentTimeMillis = System.currentTimeMillis() + i2;
                    O7793501798836965517 o77935017988369655172 = new O7793501798836965517();
                    o77935017988369655172.b = false;
                    o77935017988369655172.a = i3863025946240164840;
                    long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                    if (currentTimeMillis2 < 0) {
                        currentTimeMillis2 = 0;
                    }
                    i1632105416032993715.b = ((ScheduledExecutorService) i1632105416032993715.d).schedule(o77935017988369655172, currentTimeMillis2, TimeUnit.MILLISECONDS);
                    o7793501798836965517 = o77935017988369655172;
                } catch (Throwable th) {
                    if (o7793501798836965517 == null) {
                        throw th;
                    }
                    o7793501798836965517.b = true;
                    ((ScheduledFuture) i1632105416032993715.b).cancel(true);
                    ((ScheduledExecutorService) i1632105416032993715.d).shutdownNow();
                    synchronized (l18233974379278055712) {
                        try {
                            if (l18233974379278055712.c) {
                                throw new IOException("This exception will be replaced by the one below =)");
                            }
                            l18233974379278055712.b = true;
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            try {
                T1177712003054613961 t11777120030546139612 = this.tm;
                CryptoWishList cryptoWishList = this.c;
                A4620944990041811311 a4620944990041811311 = this.d;
                SecureRandom secureRandom = this.a;
                if (secureRandom == null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG");
                    } catch (NoSuchAlgorithmException unused) {
                        secureRandom = new SecureRandom();
                    }
                    this.a = secureRandom;
                }
                t11777120030546139612.f(cryptoWishList, m11115334227134251595, a4620944990041811311, i, secureRandom, this.proxyData);
                this.tm.d.setTcpNoDelay(this.g);
                e = this.tm.e();
                if (o7793501798836965517 != null) {
                    o7793501798836965517.b = true;
                    ((ScheduledFuture) i1632105416032993715.b).cancel(true);
                    ((ScheduledExecutorService) i1632105416032993715.d).shutdownNow();
                    synchronized (l18233974379278055712) {
                        try {
                            if (l18233974379278055712.c) {
                                throw new IOException("This exception will be replaced by the one below =)");
                            }
                            l18233974379278055712.b = true;
                        } finally {
                        }
                    }
                }
            } catch (SocketTimeoutException e2) {
                throw ((SocketTimeoutException) new SocketTimeoutException("The connect() operation on the socket timed out.").initCause(e2));
            }
        } catch (SocketTimeoutException e3) {
            throw e3;
        } catch (IOException e4) {
            d(new Throwable("There was a problem during connect.").initCause(e4));
            synchronized (l18233974379278055712) {
                if (l18233974379278055712.c) {
                    throw new SocketTimeoutException("The kexTimeout (" + i2 + " ms) expired.");
                }
                if (e4 instanceof Q16121916119380275638) {
                    throw e4;
                }
                throw ((IOException) new IOException("There was a problem while connecting to " + this.e + ":" + this.f).initCause(e4));
            }
        }
        return e;
    }

    public final synchronized P10351157897044641494 f() {
        T1177712003054613961 t1177712003054613961;
        t1177712003054613961 = this.tm;
        if (t1177712003054613961 == null) {
            throw new IllegalStateException("Cannot get details of connection, you need to establish a connection first.");
        }
        return t1177712003054613961.e();
    }

    public final synchronized D14731132657808549702 g() {
        T1177712003054613961 t1177712003054613961;
        t1177712003054613961 = this.tm;
        if (t1177712003054613961 == null) {
            throw new IllegalStateException("Cannot get details of connection, you need to establish a connection first.");
        }
        return t1177712003054613961.n;
    }

    public final synchronized void h() {
        if (this.tm == null) {
            throw new IllegalStateException("You need to establish a connection first.");
        }
        if (!this.authenticated) {
            throw new IllegalStateException("The connection is not authenticated.");
        }
        this.cm.q();
    }

    public final synchronized void i(boolean z) {
        try {
            String[] strArr = z ? new String[]{"zlib@openssh.com", "zlib", "none"} : new String[]{"none"};
            CryptoWishList cryptoWishList = this.c;
            cryptoWishList.c2s_comp_algos = strArr;
            cryptoWishList.s2c_comp_algos = strArr;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(S5658423376814904854 s5658423376814904854) {
        this.proxyData = s5658423376814904854;
    }

    public final synchronized void k(boolean z) {
        this.g = z;
        T1177712003054613961 t1177712003054613961 = this.tm;
        if (t1177712003054613961 != null) {
            t1177712003054613961.d.setTcpNoDelay(z);
        }
    }
}
