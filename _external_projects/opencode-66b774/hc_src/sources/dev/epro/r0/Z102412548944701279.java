package dev.epro.r0;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z102412548944701279 implements U11179075180450893832, R3599537314284374589 {
    public final N2113054325721141872 b;
    public final H9807528374655572032 c;
    public final K12477491117444883648 d;
    public final int g;
    public final Z7373362977535421473 h;
    public boolean i;
    public final /* synthetic */ X12014589167171900524 m;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList j = new ArrayList();
    public B6867906687934285025 k = null;
    public int l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public Z102412548944701279(X12014589167171900524 x12014589167171900524, G12913592264896487192 g12913592264896487192) {
        this.m = x12014589167171900524;
        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
        Looper looper = r502132765509599220.getLooper();
        Q7316561721656982910 b = g12913592264896487192.b();
        N2113054325721141872 v = ((M2066880349381062048) g12913592264896487192.c.b).v(g12913592264896487192.a, looper, new B16853324304735504143((String) b.c, (String) b.d, (K4498948325030944807) b.b), g12913592264896487192.d, this, this);
        String str = g12913592264896487192.b;
        if (str != null && (v instanceof E1636901823844057514)) {
            ((E1636901823844057514) v).setAttributionTag(str);
        }
        if (str != null && (v instanceof G4364368128697536100)) {
            L11610354117192841236.y(v);
            throw null;
        }
        this.b = v;
        this.c = g12913592264896487192.e;
        this.d = new K12477491117444883648();
        this.g = g12913592264896487192.f;
        if (!v.requiresSignIn()) {
            this.h = null;
            return;
        }
        Context context = x12014589167171900524.e;
        Q7316561721656982910 b2 = g12913592264896487192.b();
        this.h = new Z7373362977535421473(context, r502132765509599220, new B16853324304735504143((String) b2.c, (String) b2.d, (K4498948325030944807) b2.b));
    }

    public final void a(B6867906687934285025 b6867906687934285025) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            Z3383101362411723454.s();
        } else {
            if (V1475975160983963926.t(b6867906687934285025, B6867906687934285025.i)) {
                this.b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        M18113111391818111737.t(this.m.m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        M18113111391818111737.t(this.m.m);
        if ((status == null) == (exc == null)) {
            S10973172697741180971.j("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            S9853624340567802176 s9853624340567802176 = (S9853624340567802176) it.next();
            if (!z || s9853624340567802176.a == 2) {
                if (status != null) {
                    s9853624340567802176.c(status);
                } else {
                    s9853624340567802176.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            S9853624340567802176 s9853624340567802176 = (S9853624340567802176) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (h(s9853624340567802176)) {
                linkedList.remove(s9853624340567802176);
            }
        }
    }

    public final void e() {
        X12014589167171900524 x12014589167171900524 = this.m;
        M18113111391818111737.t(x12014589167171900524.m);
        this.k = null;
        a(B6867906687934285025.i);
        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
        if (this.i) {
            H9807528374655572032 h9807528374655572032 = this.c;
            r502132765509599220.removeMessages(11, h9807528374655572032);
            r502132765509599220.removeMessages(9, h9807528374655572032);
            this.i = false;
        }
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            Z3383101362411723454.s();
        } else {
            d();
            g();
        }
    }

    public final void f(int i) {
        X12014589167171900524 x12014589167171900524 = this.m;
        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
        M18113111391818111737.t(x12014589167171900524.m);
        this.k = null;
        this.i = true;
        String lastDisconnectMessage = this.b.getLastDisconnectMessage();
        K12477491117444883648 k12477491117444883648 = this.d;
        k12477491117444883648.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        k12477491117444883648.d(true, new Status(20, sb.toString(), null, null));
        H9807528374655572032 h9807528374655572032 = this.c;
        r502132765509599220.sendMessageDelayed(Message.obtain(r502132765509599220, 9, h9807528374655572032), 5000L);
        r502132765509599220.sendMessageDelayed(Message.obtain(r502132765509599220, 11, h9807528374655572032), 120000L);
        ((SparseIntArray) x12014589167171900524.g.b).clear();
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }

    public final void g() {
        X12014589167171900524 x12014589167171900524 = this.m;
        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
        H9807528374655572032 h9807528374655572032 = this.c;
        r502132765509599220.removeMessages(12, h9807528374655572032);
        r502132765509599220.sendMessageDelayed(r502132765509599220.obtainMessage(12, h9807528374655572032), x12014589167171900524.a);
    }

    public final boolean h(S9853624340567802176 s9853624340567802176) {
        J18325703078859211263 j18325703078859211263;
        if (s9853624340567802176 == null) {
            K12477491117444883648 k12477491117444883648 = this.d;
            N2113054325721141872 n2113054325721141872 = this.b;
            s9853624340567802176.f(k12477491117444883648, n2113054325721141872.requiresSignIn());
            try {
                s9853624340567802176.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                n2113054325721141872.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        J18325703078859211263[] b = s9853624340567802176.b(this);
        if (b != null && b.length != 0) {
            J18325703078859211263[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new J18325703078859211263[0];
            }
            O827298036535440209 o827298036535440209 = new O827298036535440209(availableFeatures.length);
            for (J18325703078859211263 j183257030788592112632 : availableFeatures) {
                o827298036535440209.put(j183257030788592112632.d, Long.valueOf(j183257030788592112632.b()));
            }
            int length = b.length;
            for (int i = 0; i < length; i++) {
                j18325703078859211263 = b[i];
                Long l = (Long) o827298036535440209.get(j18325703078859211263.d);
                if (l == null || l.longValue() < j18325703078859211263.b()) {
                    break;
                }
            }
        }
        j18325703078859211263 = null;
        if (j18325703078859211263 == null) {
            K12477491117444883648 k124774911174448836482 = this.d;
            N2113054325721141872 n21130543257211418722 = this.b;
            s9853624340567802176.f(k124774911174448836482, n21130543257211418722.requiresSignIn());
            try {
                s9853624340567802176.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                n21130543257211418722.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        new StringBuilder(this.b.getClass().getName().length() + 77 + String.valueOf(j18325703078859211263.d).length());
        if (!this.m.n || !s9853624340567802176.a(this)) {
            s9853624340567802176.d(new J4932029425212811197(j18325703078859211263));
            return true;
        }
        V4742515998328533943 v4742515998328533943 = new V4742515998328533943(this.c, j18325703078859211263);
        int indexOf = this.j.indexOf(v4742515998328533943);
        ArrayList arrayList = this.j;
        if (indexOf >= 0) {
            V4742515998328533943 v47425159983285339432 = (V4742515998328533943) arrayList.get(indexOf);
            this.m.m.removeMessages(15, v47425159983285339432);
            R502132765509599220 r502132765509599220 = this.m.m;
            r502132765509599220.sendMessageDelayed(Message.obtain(r502132765509599220, 15, v47425159983285339432), 5000L);
            return false;
        }
        arrayList.add(v4742515998328533943);
        R502132765509599220 r5021327655095992202 = this.m.m;
        r5021327655095992202.sendMessageDelayed(Message.obtain(r5021327655095992202, 15, v4742515998328533943), 5000L);
        R502132765509599220 r5021327655095992203 = this.m.m;
        r5021327655095992203.sendMessageDelayed(Message.obtain(r5021327655095992203, 16, v4742515998328533943), 120000L);
        B6867906687934285025 b6867906687934285025 = new B6867906687934285025(2, null, null);
        if (!i(b6867906687934285025)) {
            this.m.b(b6867906687934285025, this.g);
        }
        return false;
    }

    public final boolean i(B6867906687934285025 b6867906687934285025) {
        synchronized (X12014589167171900524.q) {
        }
        return false;
    }

    public final void j() {
        X12014589167171900524 x12014589167171900524 = this.m;
        M18113111391818111737.t(x12014589167171900524.m);
        N2113054325721141872 n2113054325721141872 = this.b;
        if (n2113054325721141872.isConnected() || n2113054325721141872.isConnecting()) {
            return;
        }
        try {
            M204440408817344908 m204440408817344908 = x12014589167171900524.g;
            Context context = x12014589167171900524.e;
            SparseIntArray sparseIntArray = (SparseIntArray) m204440408817344908.b;
            M18113111391818111737.v(context);
            int minApkVersion = n2113054325721141872.getMinApkVersion();
            int i = ((SparseIntArray) m204440408817344908.b).get(minApkVersion, -1);
            if (i == -1) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i == -1) {
                    i = X11123940576545591343.d.b(context, minApkVersion);
                }
                sparseIntArray.put(minApkVersion, i);
            }
            if (i != 0) {
                B6867906687934285025 b6867906687934285025 = new B6867906687934285025(i, null, null);
                new StringBuilder(n2113054325721141872.getClass().getName().length() + 35 + b6867906687934285025.toString().length());
                l(b6867906687934285025, null);
                return;
            }
            N3336634644320470588 n3336634644320470588 = new N3336634644320470588(x12014589167171900524, n2113054325721141872, this.c);
            if (n2113054325721141872.requiresSignIn()) {
                Z7373362977535421473 z7373362977535421473 = this.h;
                M18113111391818111737.v(z7373362977535421473);
                Handler handler = z7373362977535421473.k;
                B16853324304735504143 b16853324304735504143 = z7373362977535421473.n;
                D1932759943349054292 d1932759943349054292 = z7373362977535421473.f606o;
                if (d1932759943349054292 != null) {
                    d1932759943349054292.disconnect();
                }
                b16853324304735504143.a = Integer.valueOf(System.identityHashCode(z7373362977535421473));
                z7373362977535421473.f606o = (D1932759943349054292) z7373362977535421473.l.v(z7373362977535421473.j, handler.getLooper(), b16853324304735504143, (R15745234700111449188) b16853324304735504143.f, z7373362977535421473, z7373362977535421473);
                z7373362977535421473.p = n3336634644320470588;
                Set set = z7373362977535421473.m;
                if (set == null || set.isEmpty()) {
                    handler.post(new U3594978070141619353((Object) z7373362977535421473, (byte) 14));
                } else {
                    D1932759943349054292 d19327599433490542922 = z7373362977535421473.f606o;
                    d19327599433490542922.getClass();
                    d19327599433490542922.connect(new H12843822278061842084(d19327599433490542922));
                }
            }
            try {
                n2113054325721141872.connect(n3336634644320470588);
            } catch (SecurityException e) {
                l(new B6867906687934285025(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            l(new B6867906687934285025(10, null, null), e2);
        }
    }

    public final void k(S9853624340567802176 s9853624340567802176) {
        M18113111391818111737.t(this.m.m);
        boolean isConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (h(s9853624340567802176)) {
                g();
                return;
            } else {
                linkedList.add(s9853624340567802176);
                return;
            }
        }
        linkedList.add(s9853624340567802176);
        B6867906687934285025 b6867906687934285025 = this.k;
        if (b6867906687934285025 == null || b6867906687934285025.e == 0 || b6867906687934285025.f == null) {
            j();
        } else {
            l(b6867906687934285025, null);
        }
    }

    public final void l(B6867906687934285025 b6867906687934285025, RuntimeException runtimeException) {
        D1932759943349054292 d1932759943349054292;
        M18113111391818111737.t(this.m.m);
        Z7373362977535421473 z7373362977535421473 = this.h;
        if (z7373362977535421473 != null && (d1932759943349054292 = z7373362977535421473.f606o) != null) {
            d1932759943349054292.disconnect();
        }
        M18113111391818111737.t(this.m.m);
        this.k = null;
        ((SparseIntArray) this.m.g.b).clear();
        a(b6867906687934285025);
        if ((this.b instanceof Y9876475513294825521) && b6867906687934285025.e != 24) {
            X12014589167171900524 x12014589167171900524 = this.m;
            x12014589167171900524.b = true;
            R502132765509599220 r502132765509599220 = x12014589167171900524.m;
            r502132765509599220.sendMessageDelayed(r502132765509599220.obtainMessage(19), 300000L);
        }
        if (b6867906687934285025.e == 4) {
            b(X12014589167171900524.p);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = b6867906687934285025;
            return;
        }
        X12014589167171900524 x120145891671719005242 = this.m;
        if (runtimeException != null) {
            M18113111391818111737.t(x120145891671719005242.m);
            c(null, runtimeException, false);
            return;
        }
        boolean z = x120145891671719005242.n;
        H9807528374655572032 h9807528374655572032 = this.c;
        if (!z) {
            b(X12014589167171900524.c(h9807528374655572032, b6867906687934285025));
            return;
        }
        c(X12014589167171900524.c(h9807528374655572032, b6867906687934285025), null, true);
        if (this.a.isEmpty() || i(b6867906687934285025) || this.m.b(b6867906687934285025, this.g)) {
            return;
        }
        if (b6867906687934285025.e == 18) {
            this.i = true;
        }
        if (!this.i) {
            b(X12014589167171900524.c(this.c, b6867906687934285025));
        } else {
            R502132765509599220 r5021327655095992202 = this.m.m;
            r5021327655095992202.sendMessageDelayed(Message.obtain(r5021327655095992202, 9, this.c), 5000L);
        }
    }

    public final void m() {
        M18113111391818111737.t(this.m.m);
        Status status = X12014589167171900524.f568o;
        b(status);
        this.d.d(false, status);
        for (P15641210008716465954 p15641210008716465954 : (P15641210008716465954[]) this.f.keySet().toArray(new P15641210008716465954[0])) {
            k(new A8071589514042632396(new M17133811648581684718()));
        }
        a(new B6867906687934285025(4, null, null));
        N2113054325721141872 n2113054325721141872 = this.b;
        if (n2113054325721141872.isConnected()) {
            n2113054325721141872.onUserSignOut(new M204440408817344908(this, (byte) 8));
        }
    }

    @Override // dev.epro.r0.U11179075180450893832
    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        R502132765509599220 r502132765509599220 = this.m.m;
        if (myLooper == r502132765509599220.getLooper()) {
            e();
        } else {
            r502132765509599220.post(new U3594978070141619353((Object) this, (byte) 12));
        }
    }

    @Override // dev.epro.r0.R3599537314284374589
    public final void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        l(b6867906687934285025, null);
    }

    @Override // dev.epro.r0.U11179075180450893832
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        R502132765509599220 r502132765509599220 = this.m.m;
        if (myLooper == r502132765509599220.getLooper()) {
            f(i);
        } else {
            r502132765509599220.post(new F3433091394670544721(this, i));
        }
    }
}
