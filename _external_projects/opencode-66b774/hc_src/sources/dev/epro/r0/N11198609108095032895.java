package dev.epro.r0;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N11198609108095032895 {
    public char A;
    public short B;
    public M9197813449740923653 C;
    public M10634075818626712574 D;
    public H12843822278061842084 b;
    public Z3383101362411723454 e;
    public boolean f;
    public boolean g;
    public P2382941533350862833 h;
    public boolean i;
    public boolean j;
    public P2382941533350862833 k;
    public C1934509054487712083 l;
    public ProxySelector m;
    public P2382941533350862833 n;

    /* renamed from: o, reason: collision with root package name */
    public SocketFactory f379o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public F12905216483416502853 u;
    public M2066880349381062048 v;
    public int w;
    public int x;
    public int y;
    public int z;
    public J15730374346044043770 a = new J15730374346044043770((byte) 7);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public N11198609108095032895() {
        TimeZone timeZone = C14766148968941961570.a;
        this.e = new Z3383101362411723454((byte) 13);
        this.f = true;
        this.g = true;
        P2382941533350862833 p2382941533350862833 = P2382941533350862833.c;
        this.h = p2382941533350862833;
        this.i = true;
        this.j = true;
        this.k = P2382941533350862833.l;
        this.l = X9690969695403731552.a;
        this.n = p2382941533350862833;
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        X4422675003582389573.a.getClass();
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.f379o = socketFactory;
        this.r = K5458285210510848811.F;
        this.s = K5458285210510848811.E;
        this.t = Q14852350147222728147.a;
        this.u = F12905216483416502853.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = (char) 60000;
        this.B = (short) 1024;
    }

    public final void a(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.w = C14766148968941961570.b(j, timeUnit);
    }
}
