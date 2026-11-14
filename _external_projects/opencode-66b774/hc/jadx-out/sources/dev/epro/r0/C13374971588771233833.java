package dev.epro.r0;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class C13374971588771233833 implements ComponentCallbacks, View.OnCreateContextMenuListener, I4293432593871965076, J5715778638296486773, M14569441752665048396, F18341548724281518495 {
    public static final Object R = new Object();
    public boolean A;
    public boolean C;
    public ViewGroup D;
    public boolean E;
    public J6694999111306656479 G;
    public boolean H;
    public boolean I;
    public String J;
    public I1283052979100930176 L;
    public E15463216210730020934 N;
    public V10300877997588547986 O;
    public final ArrayList P;
    public final X6729807414707112278 Q;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Bundle f;
    public C13374971588771233833 g;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f181o;
    public boolean p;
    public int q;
    public P14575954172000745949 r;
    public C10994625127000459680 s;
    public C13374971588771233833 u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String h = null;
    public Boolean j = null;
    public P14575954172000745949 t = new P14575954172000745949();
    public final boolean B = true;
    public boolean F = true;
    public Q14196755420833223976 K = Q14196755420833223976.e;
    public final I1378617920849948703 M = new I1378617920849948703();

    public C13374971588771233833() {
        new AtomicInteger();
        this.P = new ArrayList();
        this.Q = new X6729807414707112278(this);
        l();
    }

    public final void A(int i, int i2, int i3, int i4) {
        if (this.G == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        d().b = i;
        d().c = i2;
        d().d = i3;
        d().e = i4;
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        return (V10300877997588547986) this.O.c;
    }

    public abstract C775827382551829194 c();

    public final J6694999111306656479 d() {
        J6694999111306656479 j6694999111306656479 = this.G;
        if (j6694999111306656479 != null) {
            return j6694999111306656479;
        }
        J6694999111306656479 j66949991113066564792 = new J6694999111306656479();
        Object obj = R;
        j66949991113066564792.f = obj;
        j66949991113066564792.g = obj;
        j66949991113066564792.h = obj;
        j66949991113066564792.i = null;
        this.G = j66949991113066564792;
        return j66949991113066564792;
    }

    public final P14575954172000745949 e() {
        if (this.s != null) {
            return this.t;
        }
        Q11088980322693754445.j("Fragment ", this, " has not been attached yet.");
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // dev.epro.r0.M14569441752665048396
    public final Q15796038708469204840 f() {
        Application application = null;
        if (this.r == null) {
            S10973172697741180971.m("Can't access ViewModels from detached fragment");
            return null;
        }
        E15463216210730020934 e15463216210730020934 = this.N;
        if (e15463216210730020934 != null) {
            return e15463216210730020934;
        }
        Context applicationContext = z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        E15463216210730020934 e154632162107300209342 = new E15463216210730020934(application, this, this.f);
        this.N = e154632162107300209342;
        return e154632162107300209342;
    }

    @Override // dev.epro.r0.M14569441752665048396
    public final X8580441079827879338 g() {
        Application application;
        Context applicationContext = z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        X8580441079827879338 x8580441079827879338 = new X8580441079827879338(0);
        LinkedHashMap linkedHashMap = x8580441079827879338.a;
        if (application != null) {
            linkedHashMap.put(T977856106332750807.d, application);
        }
        linkedHashMap.put(C775827382551829194.j, this);
        linkedHashMap.put(C775827382551829194.k, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(C775827382551829194.l, bundle);
        }
        return x8580441079827879338;
    }

    public final int h() {
        Q14196755420833223976 q14196755420833223976 = this.K;
        return (q14196755420833223976 == Q14196755420833223976.b || this.u == null) ? q14196755420833223976.ordinal() : Math.min(q14196755420833223976.ordinal(), this.u.h());
    }

    @Override // dev.epro.r0.J5715778638296486773
    public final L3530692241870850490 i() {
        if (this.r == null) {
            S10973172697741180971.m("Can't access ViewModels from detached fragment");
            return null;
        }
        if (h() == 1) {
            S10973172697741180971.m("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.r.L.d;
        L3530692241870850490 l3530692241870850490 = (L3530692241870850490) map.get(this.e);
        if (l3530692241870850490 != null) {
            return l3530692241870850490;
        }
        L3530692241870850490 l35306922418708504902 = new L3530692241870850490();
        map.put(this.e, l35306922418708504902);
        return l35306922418708504902;
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return this.L;
    }

    public final P14575954172000745949 k() {
        P14575954172000745949 p14575954172000745949 = this.r;
        if (p14575954172000745949 != null) {
            return p14575954172000745949;
        }
        Q11088980322693754445.j("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    public final void l() {
        this.L = new I1283052979100930176(this, true);
        this.O = new V10300877997588547986(new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14)));
        this.N = null;
        ArrayList arrayList = this.P;
        X6729807414707112278 x6729807414707112278 = this.Q;
        if (arrayList.contains(x6729807414707112278)) {
            return;
        }
        if (this.a < 0) {
            arrayList.add(x6729807414707112278);
            return;
        }
        C13374971588771233833 c13374971588771233833 = x6729807414707112278.a;
        ((U8000365519789522238) c13374971588771233833.O.b).a();
        C775827382551829194.J(c13374971588771233833);
    }

    public final void m() {
        l();
        this.J = this.e;
        this.e = UUID.randomUUID().toString();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.f181o = false;
        this.q = 0;
        this.r = null;
        this.t = new P14575954172000745949();
        this.s = null;
        this.v = 0;
        this.w = 0;
        this.x = null;
        this.y = false;
        this.z = false;
    }

    public final boolean n() {
        if (this.y) {
            return true;
        }
        P14575954172000745949 p14575954172000745949 = this.r;
        if (p14575954172000745949 != null) {
            C13374971588771233833 c13374971588771233833 = this.u;
            p14575954172000745949.getClass();
            if (c13374971588771233833 == null ? false : c13374971588771233833.n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return this.q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C10994625127000459680 c10994625127000459680 = this.s;
        R13227154569034155950 r13227154569034155950 = c10994625127000459680 == null ? null : c10994625127000459680.q;
        if (r13227154569034155950 != null) {
            r13227154569034155950.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            Q11088980322693754445.j("Fragment ", this, " not attached to an activity.");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.C = true;
    }

    public void q(R13227154569034155950 r13227154569034155950) {
        this.C = true;
        C10994625127000459680 c10994625127000459680 = this.s;
        if ((c10994625127000459680 == null ? null : c10994625127000459680.q) != null) {
            this.C = true;
        }
    }

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t();

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" tag=");
            sb.append(this.x);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        C10994625127000459680 c10994625127000459680 = this.s;
        if (c10994625127000459680 == null) {
            S10973172697741180971.m("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        R13227154569034155950 r13227154569034155950 = c10994625127000459680.u;
        LayoutInflater layoutInflaterCloneInContext = r13227154569034155950.getLayoutInflater().cloneInContext(r13227154569034155950);
        layoutInflaterCloneInContext.setFactory2(this.t.f);
        return layoutInflaterCloneInContext;
    }

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();

    public void y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t.I();
        this.p = true;
        i();
    }

    public final Context z() {
        C10994625127000459680 c10994625127000459680 = this.s;
        R13227154569034155950 r13227154569034155950 = c10994625127000459680 == null ? null : c10994625127000459680.r;
        if (r13227154569034155950 != null) {
            return r13227154569034155950;
        }
        Q11088980322693754445.j("Fragment ", this, " not attached to a context.");
        return null;
    }

    public void p(int i, int i2, Intent intent) {
    }
}
