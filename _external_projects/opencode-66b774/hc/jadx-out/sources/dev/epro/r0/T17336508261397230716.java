package dev.epro.r0;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T17336508261397230716 extends A13924955594853091425 implements J5715778638296486773, M14569441752665048396, F18341548724281518495, U11782692406915154495, N8244753885299370799, H5360721299395888827 {
    public final X11800206338020414760 b = new X11800206338020414760();
    public final Q7316561721656982910 c;
    public final V10300877997588547986 d;
    public L3530692241870850490 e;
    public final O10642937410579854520 f;
    public final O12494175665883759871 g;
    public final J6160233934771378283 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f500o;
    public boolean p;
    public boolean q;
    public final O12494175665883759871 r;
    public final O12494175665883759871 s;
    public final O12494175665883759871 t;

    public T17336508261397230716() {
        final byte b = 1;
        this.c = new Q7316561721656982910(new Runnable(this) { // from class: dev.epro.r0.O8210649400435230593
            public final /* synthetic */ T17336508261397230716 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                T17336508261397230716 t17336508261397230716 = this.b;
                switch (b2) {
                    case 0:
                        T17336508261397230716.m(t17336508261397230716);
                        break;
                    default:
                        t17336508261397230716.invalidateOptionsMenu();
                        break;
                }
            }
        });
        U8000365519789522238 u8000365519789522238 = new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14));
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(u8000365519789522238);
        this.d = v10300877997588547986;
        this.f = new O10642937410579854520(this);
        this.g = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.C16994757487362130356
            public final /* synthetic */ T17336508261397230716 b;

            static {
                izmyclvb.oeynnivvrnts0(1171);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
        new AtomicInteger();
        this.h = new J6160233934771378283(this);
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.f500o = new CopyOnWriteArrayList();
        final byte b2 = 2;
        this.r = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.C16994757487362130356
            public final /* synthetic */ T17336508261397230716 b;

            static {
                izmyclvb.oeynnivvrnts0(1171);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
        I1283052979100930176 i1283052979100930176 = this.a;
        if (i1283052979100930176 == null) {
            S10973172697741180971.m("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final byte b3 = 0;
        i1283052979100930176.a(new I2388620560486547149(this) { // from class: dev.epro.r0.N11963151266407031492
            public final /* synthetic */ T17336508261397230716 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.I2388620560486547149
            public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
                Window window;
                View viewPeekDecorView;
                byte b4 = b3;
                T17336508261397230716 t17336508261397230716 = this.b;
                switch (b4) {
                    case 0:
                        if (p72364327365747079 == P72364327365747079.ON_STOP && (window = t17336508261397230716.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (p72364327365747079 == P72364327365747079.ON_DESTROY) {
                            t17336508261397230716.b.b = null;
                            if (!t17336508261397230716.isChangingConfigurations()) {
                                t17336508261397230716.i().a();
                            }
                            O10642937410579854520 o10642937410579854520 = t17336508261397230716.f;
                            T17336508261397230716 t173365082613972307162 = o10642937410579854520.d;
                            t173365082613972307162.getWindow().getDecorView().removeCallbacks(o10642937410579854520);
                            t173365082613972307162.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(o10642937410579854520);
                        }
                        break;
                }
            }
        });
        this.a.a(new I2388620560486547149(this) { // from class: dev.epro.r0.N11963151266407031492
            public final /* synthetic */ T17336508261397230716 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.I2388620560486547149
            public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
                Window window;
                View viewPeekDecorView;
                byte b4 = b;
                T17336508261397230716 t17336508261397230716 = this.b;
                switch (b4) {
                    case 0:
                        if (p72364327365747079 == P72364327365747079.ON_STOP && (window = t17336508261397230716.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (p72364327365747079 == P72364327365747079.ON_DESTROY) {
                            t17336508261397230716.b.b = null;
                            if (!t17336508261397230716.isChangingConfigurations()) {
                                t17336508261397230716.i().a();
                            }
                            O10642937410579854520 o10642937410579854520 = t17336508261397230716.f;
                            T17336508261397230716 t173365082613972307162 = o10642937410579854520.d;
                            t173365082613972307162.getWindow().getDecorView().removeCallbacks(o10642937410579854520);
                            t173365082613972307162.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(o10642937410579854520);
                        }
                        break;
                }
            }
        });
        this.a.a(new E13936048342664803406(this, b));
        u8000365519789522238.a();
        C775827382551829194.J(this);
        ((V10300877997588547986) v10300877997588547986.c).y("android:support:activity-result", new N8459270538234465343(this, b3));
        k(new O7267920176496495291(this, b3));
        final byte b4 = 3;
        this.s = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.C16994757487362130356
            public final /* synthetic */ T17336508261397230716 b;

            static {
                izmyclvb.oeynnivvrnts0(1171);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
        final byte b5 = 4;
        this.t = new O12494175665883759871(new B13729205492206812220(this) { // from class: dev.epro.r0.C16994757487362130356
            public final /* synthetic */ T17336508261397230716 b;

            static {
                izmyclvb.oeynnivvrnts0(1171);
            }

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final native Object invoke();
        });
    }

    public static final void m(T17336508261397230716 t17336508261397230716) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!S10823041268949770285.t(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!S10823041268949770285.t(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // dev.epro.r0.U11782692406915154495
    public final U6333859635337865127 a() {
        return (U6333859635337865127) this.t.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        return (V10300877997588547986) this.d.c;
    }

    @Override // dev.epro.r0.N8244753885299370799
    public final J15730374346044043770 c() {
        return a().b().c;
    }

    public Q15796038708469204840 f() {
        return (Q15796038708469204840) this.s.getValue();
    }

    @Override // dev.epro.r0.M14569441752665048396
    public final X8580441079827879338 g() {
        X8580441079827879338 x8580441079827879338 = new X8580441079827879338(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = x8580441079827879338.a;
        if (application != null) {
            linkedHashMap.put(T977856106332750807.d, getApplication());
        }
        linkedHashMap.put(C775827382551829194.j, this);
        linkedHashMap.put(C775827382551829194.k, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(C775827382551829194.l, extras);
        }
        return x8580441079827879338;
    }

    @Override // dev.epro.r0.H5360721299395888827
    public final J6160233934771378283 h() {
        return this.h;
    }

    @Override // dev.epro.r0.J5715778638296486773
    public final L3530692241870850490 i() {
        if (getApplication() == null) {
            S10973172697741180971.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        L3530692241870850490 l3530692241870850490 = this.e;
        if (l3530692241870850490 == null) {
            N7489524014411144583 n7489524014411144583 = (N7489524014411144583) getLastNonConfigurationInstance();
            if (n7489524014411144583 != null) {
                this.e = n7489524014411144583.a;
            }
            l3530692241870850490 = this.e;
            if (l3530692241870850490 == null) {
                l3530692241870850490 = new L3530692241870850490();
                this.e = l3530692241870850490;
            }
        }
        l3530692241870850490.getClass();
        return l3530692241870850490;
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return this.a;
    }

    public final void k(J10468299281676710423 j10468299281676710423) {
        X11800206338020414760 x11800206338020414760 = this.b;
        x11800206338020414760.getClass();
        T17336508261397230716 t17336508261397230716 = x11800206338020414760.b;
        if (t17336508261397230716 != null) {
            j10468299281676710423.a(t17336508261397230716);
        }
        x11800206338020414760.a.add(j10468299281676710423);
    }

    public final void l() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((A3218799297244048918) this.r.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(configuration);
        }
    }

    @Override // dev.epro.r0.A13924955594853091425, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.v(bundle);
        X11800206338020414760 x11800206338020414760 = this.b;
        x11800206338020414760.getClass();
        x11800206338020414760.b = this;
        Iterator it = x11800206338020414760.a.iterator();
        while (it.hasNext()) {
            ((J10468299281676710423) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = R11891371385360051901.b;
        T4867633725758960939.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((F5958934288633973125) it.next()).a.i();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
            while (it.hasNext()) {
                if (((F5958934288633973125) it.next()).a.n()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((R9757436368382764378) it.next()).accept(new H9171223753206057471(z));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((F5958934288633973125) it.next()).a.o();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.m.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((R9757436368382764378) it.next()).accept(new T1971145964501728936(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        E17149812035295265804 e17149812035295265804;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        byte b = 19;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            e17149812035295265804 = new E17149812035295265804(b);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            e17149812035295265804 = new E17149812035295265804(b);
        } else {
            e17149812035295265804 = new E17149812035295265804(b);
        }
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(e17149812035295265804);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((F5958934288633973125) it.next()).a.r();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        N7489524014411144583 n7489524014411144583;
        L3530692241870850490 l3530692241870850490 = this.e;
        if (l3530692241870850490 == null && (n7489524014411144583 = (N7489524014411144583) getLastNonConfigurationInstance()) != null) {
            l3530692241870850490 = n7489524014411144583.a;
        }
        if (l3530692241870850490 == null) {
            return null;
        }
        N7489524014411144583 n74895240144111445832 = new N7489524014411144583();
        n74895240144111445832.a = l3530692241870850490;
        return n74895240144111445832;
    }

    @Override // dev.epro.r0.A13924955594853091425, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        I1283052979100930176 i1283052979100930176 = this.a;
        if (i1283052979100930176 != null) {
            i1283052979100930176.g(Q14196755420833223976.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.w(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f500o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (U8836654130139556418.p()) {
                Trace.beginSection(U8836654130139556418.B("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            M1224903511523771423 m1224903511523771423 = (M1224903511523771423) this.g.getValue();
            synchronized (m1224903511523771423.a) {
                try {
                    m1224903511523771423.b = true;
                    ArrayList arrayList = m1224903511523771423.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((B13729205492206812220) obj).invoke();
                    }
                    m1224903511523771423.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        l();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        l();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(new H9171223753206057471(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((R9757436368382764378) it.next()).accept(new T1971145964501728936(z));
        }
    }
}
