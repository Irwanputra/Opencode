package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B18380949320309934747 {
    public final View a;
    public boolean b;
    public Y5209789131793062978 c;
    public I4293432593871965076 d;
    public F18341548724281518495 e;
    public J5715778638296486773 f;
    public final U17891631287099220228 g;
    public final Y1947707678054676053 h;
    public final Configuration i;
    public final W1972671267364756056 j;
    public final Q5689036297424468370 k;
    public final I4934042433119983504 l;
    public final W8455343525638953052 m;
    public final L3957284589981577691 n;

    /* renamed from: o, reason: collision with root package name */
    public final F2699648658094956990 f174o;
    public final W1972671267364756056 p;
    public final I16162375839174538453 q;
    public final P5409648242778462568 r;
    public final N17396598995248644478 s;
    public final L16736062046028781057 t;
    public final G3509037795884611271 u;
    public int v;
    public final S464754454553842217 w;
    public C504193925276129802 x;
    public final F7726944745480145994 y;

    public B18380949320309934747(B18380949320309934747 b18380949320309934747, View view, Y5209789131793062978 y5209789131793062978, I4293432593871965076 i4293432593871965076, F18341548724281518495 f18341548724281518495, J5715778638296486773 j5715778638296486773) {
        U17891631287099220228 u17891631287099220228;
        Configuration configuration;
        W1972671267364756056 t;
        Q5689036297424468370 q5689036297424468370;
        I4934042433119983504 i4934042433119983504;
        W8455343525638953052 w8455343525638953052;
        L3957284589981577691 t2834513763987957608;
        F2699648658094956990 e17149812035295265804;
        W1972671267364756056 v697849047308847220;
        P5409648242778462568 p5409648242778462568;
        boolean t2 = S10823041268949770285.t(b18380949320309934747 != null ? b18380949320309934747.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = y5209789131793062978;
        this.d = i4293432593871965076;
        this.e = f18341548724281518495;
        this.f = j5715778638296486773;
        if (t2) {
            b18380949320309934747.getClass();
            u17891631287099220228 = b18380949320309934747.g;
        } else {
            u17891631287099220228 = new U17891631287099220228();
        }
        this.g = u17891631287099220228;
        this.h = b18380949320309934747 != null ? b18380949320309934747.h : new Y1947707678054676053();
        if (t2) {
            b18380949320309934747.getClass();
            configuration = b18380949320309934747.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (t2) {
            b18380949320309934747.getClass();
            t = b18380949320309934747.j;
        } else {
            t = V4416135141588678913.t(new Configuration(configuration));
        }
        this.j = t;
        if (t2) {
            b18380949320309934747.getClass();
            q5689036297424468370 = b18380949320309934747.k;
        } else {
            q5689036297424468370 = new Q5689036297424468370(view.getContext());
        }
        this.k = q5689036297424468370;
        if (t2) {
            b18380949320309934747.getClass();
            i4934042433119983504 = b18380949320309934747.l;
        } else {
            i4934042433119983504 = new I4934042433119983504(view.getContext());
        }
        this.l = i4934042433119983504;
        if (t2) {
            b18380949320309934747.getClass();
            w8455343525638953052 = b18380949320309934747.m;
        } else {
            w8455343525638953052 = new W8455343525638953052((Object) view.getContext(), (byte) 3);
        }
        this.m = w8455343525638953052;
        if (t2) {
            b18380949320309934747.getClass();
            t2834513763987957608 = b18380949320309934747.n;
        } else {
            t2834513763987957608 = new T2834513763987957608(w8455343525638953052);
        }
        this.n = t2834513763987957608;
        if (t2) {
            b18380949320309934747.getClass();
            e17149812035295265804 = b18380949320309934747.f174o;
        } else {
            view.getContext();
            e17149812035295265804 = new E17149812035295265804((byte) 0);
        }
        this.f174o = e17149812035295265804;
        if (t2) {
            b18380949320309934747.getClass();
            v697849047308847220 = b18380949320309934747.p;
        } else {
            v697849047308847220 = new V697849047308847220(B5998207562248239613.o(view.getContext()), B14824868959299866349.m);
        }
        this.p = v697849047308847220;
        this.q = view == (b18380949320309934747 != null ? b18380949320309934747.a : null) ? b18380949320309934747.q : new D1743966822371805936(view);
        if (t2) {
            b18380949320309934747.getClass();
            p5409648242778462568 = b18380949320309934747.r;
        } else {
            p5409648242778462568 = new P5409648242778462568(ViewConfiguration.get(view.getContext()));
        }
        this.r = p5409648242778462568;
        this.s = b18380949320309934747 != null ? b18380949320309934747.s : new N17396598995248644478();
        this.t = new L16736062046028781057();
        this.u = b18380949320309934747 != null ? b18380949320309934747.u : new G3509037795884611271();
        this.w = new S464754454553842217(this, (byte) 13);
        this.y = new F7726944745480145994(this);
    }

    public final void a(S7974369370986781936 s7974369370986781936, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(123858079);
        int i2 = (m3727281027331139839.h(s7974369370986781936) ? 4 : 2) | i | (m3727281027331139839.h(t15443218846549482730) ? 32 : 16) | (m3727281027331139839.h(this) ? 256 : 128);
        if (m3727281027331139839.R(i2 & 1, (i2 & 147) != 146)) {
            Object tag = s7974369370986781936.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof D14639766352081121636) && !(tag instanceof D18043721478450045610))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = s7974369370986781936.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof D14639766352081121636) || (tag2 instanceof D18043721478450045610))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(m3727281027331139839.x());
                m3727281027331139839.q = true;
                m3727281027331139839.C = true;
                m3727281027331139839.c.b();
                m3727281027331139839.H.b();
                K15438463641018513946 k15438463641018513946 = m3727281027331139839.I;
                E1092155023341394263 e1092155023341394263 = k15438463641018513946.a;
                k15438463641018513946.e = e1092155023341394263.j;
                k15438463641018513946.f = e1092155023341394263.k;
            }
            boolean f = m3727281027331139839.f(s7974369370986781936.getView());
            Object M = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (f || M == e17149812035295265804) {
                M = new H16205609518694329535(s7974369370986781936.getView());
                m3727281027331139839.k0(M);
            }
            H16205609518694329535 h16205609518694329535 = (H16205609518694329535) M;
            P11507981277033739248 a = G7911722858908282497.a.a(d());
            T5853297761459116769 t5853297761459116769 = M472386255662143721.a;
            g();
            F18341548724281518495 f18341548724281518495 = this.e;
            f18341548724281518495.getClass();
            P11507981277033739248 a2 = t5853297761459116769.a(f18341548724281518495);
            P11507981277033739248 a3 = T15795698139970521497.d.a(this.g);
            P11507981277033739248 a4 = T15795698139970521497.e.a(this.h);
            X354568553596380848 x354568553596380848 = Y238707362170117896.v;
            boolean h = m3727281027331139839.h(this);
            Object M2 = m3727281027331139839.M();
            if (h || M2 == e17149812035295265804) {
                M2 = new A6662317080022852970(this, (byte) 19);
                m3727281027331139839.k0(M2);
            }
            P11507981277033739248 c = x354568553596380848.c((F4096073349764486348) M2);
            P11507981277033739248 a5 = T15795698139970521497.b.a(s7974369370986781936.getContext());
            P11507981277033739248 a6 = G14528836375187741604.a.a(set);
            P11507981277033739248 a7 = T15795698139970521497.a.a(s7974369370986781936.getConfiguration());
            X354568553596380848 x3545685535963808482 = T1414416723643307303.a;
            boolean h2 = m3727281027331139839.h(s7974369370986781936);
            Object M3 = m3727281027331139839.M();
            if (h2 || M3 == e17149812035295265804) {
                M3 = new U15792790160341789301(s7974369370986781936, (byte) 3);
                m3727281027331139839.k0(M3);
            }
            P11507981277033739248 c2 = x3545685535963808482.c((F4096073349764486348) M3);
            P11507981277033739248 a8 = T15795698139970521497.f.a(s7974369370986781936.getView());
            X354568553596380848 x3545685535963808483 = Y238707362170117896.x;
            boolean h3 = m3727281027331139839.h(s7974369370986781936);
            Object M4 = m3727281027331139839.M();
            if (h3 || M4 == e17149812035295265804) {
                M4 = new U15792790160341789301(s7974369370986781936, (byte) 4);
                m3727281027331139839.k0(M4);
            }
            D1286559660607336098.b(new P11507981277033739248[]{a, a2, a3, a4, c, a5, a6, a7, c2, a8, x3545685535963808483.c((F4096073349764486348) M4), Y238707362170117896.t.a(s7974369370986781936.getViewConfiguration()), R6280306580460089731.a.a(h16205609518694329535)}, S10823041268949770285.T(1317454175, new L77498399994277128(s7974369370986781936, this, t15443218846549482730), m3727281027331139839), m3727281027331139839, 56);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new L77498399994277128(this, s7974369370986781936, t15443218846549482730, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            F7726944745480145994 f7726944745480145994 = this.y;
            context.unregisterComponentCallbacks(f7726944745480145994);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(f7726944745480145994);
        }
    }

    public final Y5209789131793062978 c() {
        g();
        Y5209789131793062978 y5209789131793062978 = this.c;
        y5209789131793062978.getClass();
        return y5209789131793062978;
    }

    public final I4293432593871965076 d() {
        g();
        I4293432593871965076 i4293432593871965076 = this.d;
        i4293432593871965076.getClass();
        return i4293432593871965076;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            F7726944745480145994 f7726944745480145994 = this.y;
            context.registerComponentCallbacks(f7726944745480145994);
            f(view.getResources().getConfiguration());
            this.t.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(f7726944745480145994);
        }
    }

    public final void f(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                S18102156289003884608 s18102156289003884608 = (S18102156289003884608) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (s18102156289003884608 == null || Configuration.needNewResources(updateFrom, s18102156289003884608.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            Y1947707678054676053 y1947707678054676053 = this.h;
            synchronized (y1947707678054676053) {
                y1947707678054676053.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(B5998207562248239613.o(this.a.getContext()));
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        Y5209789131793062978 y5209789131793062978 = this.c;
        View view = this.a;
        if (y5209789131793062978 == null) {
            Y5209789131793062978 b = B15311772965484989679.b(view);
            if (b == null) {
                Object parent = view.getParent();
                while (b == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    b = B15311772965484989679.b(view2);
                    parent = P13747563277035175218.g(view2);
                }
            }
            if (b == null) {
                b = B15311772965484989679.c(view);
            }
            this.c = b;
        }
        if (this.d == null) {
            I4293432593871965076 m = U8836654130139556418.m(view);
            if (m == null) {
                S10973172697741180971.m("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = m;
        }
        if (this.e == null) {
            F18341548724281518495 h = C468629748621011703.h(view);
            if (h == null) {
                S10973172697741180971.m("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = h;
        }
        if (this.f == null) {
            this.f = E10717724117948616506.k(view);
        }
    }
}
