package dev.epro.r0;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class R13227154569034155950 extends T17336508261397230716 implements P11323103762586676051 {
    public boolean w;
    public boolean x;
    public L9687083612725928934 z;
    public final F6942723054099263096 u = new F6942723054099263096((Object) new C10994625127000459680(this), (byte) 9);
    public final I1283052979100930176 v = new I1283052979100930176(this, true);
    public boolean y = true;

    public R13227154569034155950() {
        final byte b = 1;
        ((V10300877997588547986) this.d.c).y("android:support:lifecycle", new N8459270538234465343(this, (byte) 2));
        final byte b2 = 0;
        this.i.add(new R9757436368382764378(this) { // from class: dev.epro.r0.K671519825715396405
            public final /* synthetic */ R13227154569034155950 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b3 = b2;
                R13227154569034155950 r13227154569034155950 = this.b;
                switch (b3) {
                    case 0:
                        r13227154569034155950.u.i();
                        break;
                    default:
                        r13227154569034155950.u.i();
                        break;
                }
            }
        });
        this.k.add(new R9757436368382764378(this) { // from class: dev.epro.r0.K671519825715396405
            public final /* synthetic */ R13227154569034155950 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.R9757436368382764378
            public final void accept(Object obj) {
                byte b3 = b;
                R13227154569034155950 r13227154569034155950 = this.b;
                switch (b3) {
                    case 0:
                        r13227154569034155950.u.i();
                        break;
                    default:
                        r13227154569034155950.u.i();
                        break;
                }
            }
        });
        k(new O7267920176496495291(this, b));
    }

    public static boolean o(P14575954172000745949 p14575954172000745949) {
        boolean z = false;
        for (C13374971588771233833 c13374971588771233833 : p14575954172000745949.c.G()) {
            if (c13374971588771233833 != null) {
                C10994625127000459680 c10994625127000459680 = c13374971588771233833.s;
                if ((c10994625127000459680 == null ? null : c10994625127000459680.u) != null) {
                    z |= o(c13374971588771233833.e());
                }
                if (c13374971588771233833.L.h.compareTo(Q14196755420833223976.d) >= 0) {
                    c13374971588771233833.L.g(Q14196755420833223976.c);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        l9687083612725928934.u();
        ((ViewGroup) l9687083612725928934.z.findViewById(R.id.content)).addView(view, layoutParams);
        l9687083612725928934.m.a(l9687083612725928934.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        l9687083612725928934.M = true;
        int i9 = l9687083612725928934.Q;
        if (i9 == -100) {
            i9 = V16233589191250258052.b;
        }
        int A = l9687083612725928934.A(context, i9);
        if (V16233589191250258052.a(context) && V16233589191250258052.a(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (V16233589191250258052.i) {
                    try {
                        J10695037395247619504 j10695037395247619504 = V16233589191250258052.c;
                        if (j10695037395247619504 == null) {
                            J10695037395247619504 j106950373952476195042 = V16233589191250258052.d;
                            if (j106950373952476195042 == null) {
                                j106950373952476195042 = J10695037395247619504.a(B5998207562248239613.J(context));
                                V16233589191250258052.d = j106950373952476195042;
                            }
                            if (!j106950373952476195042.a.a.isEmpty()) {
                                V16233589191250258052.c = V16233589191250258052.d;
                            }
                        } else if (!j10695037395247619504.equals(V16233589191250258052.d)) {
                            J10695037395247619504 j106950373952476195043 = V16233589191250258052.c;
                            V16233589191250258052.d = j106950373952476195043;
                            B5998207562248239613.H(context, j106950373952476195043.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!V16233589191250258052.f) {
                V16233589191250258052.a.execute(new C10246743001969768588(context, (byte) 1));
            }
        }
        J10695037395247619504 n = L9687083612725928934.n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(L9687083612725928934.r(context, A, n, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof H16785758874348248089) {
            try {
                ((H16785758874348248089) context).a(L9687083612725928934.r(context, A, n, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (L9687083612725928934.h0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i14 = configuration3.touchscreen;
                    int i15 = configuration4.touchscreen;
                    if (i14 != i15) {
                        configuration.touchscreen = i15;
                    }
                    int i16 = configuration3.keyboard;
                    int i17 = configuration4.keyboard;
                    if (i16 != i17) {
                        configuration.keyboard = i17;
                    }
                    int i18 = configuration3.keyboardHidden;
                    int i19 = configuration4.keyboardHidden;
                    if (i18 != i19) {
                        configuration.keyboardHidden = i19;
                    }
                    int i20 = configuration3.navigation;
                    int i21 = configuration4.navigation;
                    if (i20 != i21) {
                        configuration.navigation = i21;
                    }
                    int i22 = configuration3.navigationHidden;
                    int i23 = configuration4.navigationHidden;
                    if (i22 != i23) {
                        configuration.navigationHidden = i23;
                    }
                    int i24 = configuration3.orientation;
                    int i25 = configuration4.orientation;
                    if (i24 != i25) {
                        configuration.orientation = i25;
                    }
                    int i26 = configuration3.screenLayout & 15;
                    int i27 = configuration4.screenLayout & 15;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 192;
                    int i29 = configuration4.screenLayout & 192;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 48;
                    int i31 = configuration4.screenLayout & 48;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 768;
                    int i33 = configuration4.screenLayout & 768;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = configuration3.colorMode;
                        int i34 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i34 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i35 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i35 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i36 = configuration3.uiMode & 15;
                    int i37 = configuration4.uiMode & 15;
                    if (i36 != i37) {
                        configuration.uiMode |= i37;
                    }
                    int i38 = configuration3.uiMode & 48;
                    int i39 = configuration4.uiMode & 48;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.screenWidthDp;
                    int i41 = configuration4.screenWidthDp;
                    if (i40 != i41) {
                        configuration.screenWidthDp = i41;
                    }
                    int i42 = configuration3.screenHeightDp;
                    int i43 = configuration4.screenHeightDp;
                    if (i42 != i43) {
                        configuration.screenHeightDp = i43;
                    }
                    int i44 = configuration3.smallestScreenWidthDp;
                    int i45 = configuration4.smallestScreenWidthDp;
                    if (i44 != i45) {
                        configuration.smallestScreenWidthDp = i45;
                    }
                    int i46 = configuration3.densityDpi;
                    int i47 = configuration4.densityDpi;
                    if (i46 != i47) {
                        configuration.densityDpi = i47;
                    }
                }
            }
            Configuration r = L9687083612725928934.r(context, A, n, configuration, true);
            H16785758874348248089 h16785758874348248089 = new H16785758874348248089(context, net.zetetic.database.R.style.Theme_AppCompat_Empty);
            h16785758874348248089.a(r);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = h16785758874348248089.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        N13459929895848246258.l(theme);
                    } else {
                        synchronized (U16229988784104357932.h) {
                            if (!U16229988784104357932.j) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    U16229988784104357932.i = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                U16229988784104357932.j = true;
                            }
                            Method method = U16229988784104357932.i;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    U16229988784104357932.i = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = h16785758874348248089;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((L9687083612725928934) n()).y();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // dev.epro.r0.A13924955594853091425, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((L9687083612725928934) n()).y();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R13227154569034155950.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        l9687083612725928934.u();
        return l9687083612725928934.l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        C8081513896840795204 c8081513896840795204 = l9687083612725928934.f354o;
        if (c8081513896840795204 == null) {
            l9687083612725928934.y();
            I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
            c8081513896840795204 = new C8081513896840795204(i6301446377683660838 != null ? i6301446377683660838.b() : l9687083612725928934.k);
            l9687083612725928934.f354o = c8081513896840795204;
        }
        return c8081513896840795204;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        if (l9687083612725928934.n != null) {
            l9687083612725928934.y();
            l9687083612725928934.n.getClass();
            l9687083612725928934.z(0);
        }
    }

    public final V16233589191250258052 n() {
        L9687083612725928934 l9687083612725928934 = this.z;
        if (l9687083612725928934 != null) {
            return l9687083612725928934;
        }
        V15499216873564893116 v15499216873564893116 = V16233589191250258052.a;
        L9687083612725928934 l96870836127259289342 = new L9687083612725928934(this, null, this, this);
        this.z = l96870836127259289342;
        return l96870836127259289342;
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.u.i();
        super.onActivityResult(i, i2, intent);
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        if (l9687083612725928934.D && l9687083612725928934.y) {
            l9687083612725928934.y();
            I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
            if (i6301446377683660838 != null) {
                i6301446377683660838.e(i6301446377683660838.a.getResources().getBoolean(net.zetetic.database.R.bool.abc_action_bar_embed_tabs));
            }
        }
        D6070089955350435999 a = D6070089955350435999.a();
        Context context = l9687083612725928934.k;
        synchronized (a) {
            B5275173104802412095 b5275173104802412095 = a.a;
            synchronized (b5275173104802412095) {
                A18377563779865231301 a18377563779865231301 = (A18377563779865231301) b5275173104802412095.b.get(context);
                if (a18377563779865231301 != null) {
                    a18377563779865231301.a();
                }
            }
        }
        l9687083612725928934.P = new Configuration(l9687083612725928934.k.getResources().getConfiguration());
        l9687083612725928934.k(false, false);
    }

    @Override // dev.epro.r0.T17336508261397230716, dev.epro.r0.A13924955594853091425, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v.e(P72364327365747079.ON_CREATE);
        P14575954172000745949 p14575954172000745949 = ((C10994625127000459680) this.u.b).t;
        p14575954172000745949.E = false;
        p14575954172000745949.F = false;
        p14575954172000745949.L.g = false;
        p14575954172000745949.s(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C10994625127000459680) this.u.b).t.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        p();
        n().c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent N;
        if (!q(i, menuItem)) {
            L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
            l9687083612725928934.y();
            I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
            if (menuItem.getItemId() != 16908332 || i6301446377683660838 == null || (((X97881583022885904) i6301446377683660838.e).b & 4) == 0 || (N = T18016951143603335921.N(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(N)) {
                navigateUpTo(N);
                return true;
            }
            E1113567452991644141 e1113567452991644141 = new E1113567452991644141(this);
            Intent N2 = T18016951143603335921.N(this);
            if (N2 == null) {
                N2 = T18016951143603335921.N(this);
            }
            if (N2 != null) {
                ComponentName component = N2.getComponent();
                if (component == null) {
                    component = N2.resolveActivity(((Context) e1113567452991644141.c).getPackageManager());
                }
                e1113567452991644141.a(component);
                ((ArrayList) e1113567452991644141.b).add(N2);
            }
            e1113567452991644141.b();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.x = false;
        ((C10994625127000459680) this.u.b).t.s(5);
        this.v.e(P72364327365747079.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((L9687083612725928934) n()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        r();
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        l9687083612725928934.y();
        I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
        if (i6301446377683660838 != null) {
            i6301446377683660838.t = true;
        }
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.u.i();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        F6942723054099263096 f6942723054099263096 = this.u;
        f6942723054099263096.i();
        super.onResume();
        this.x = true;
        ((C10994625127000459680) f6942723054099263096.b).t.x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        s();
        ((L9687083612725928934) n()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.u.i();
    }

    @Override // android.app.Activity
    public final void onStop() {
        t();
        L9687083612725928934 l9687083612725928934 = (L9687083612725928934) n();
        l9687083612725928934.y();
        I6301446377683660838 i6301446377683660838 = l9687083612725928934.n;
        if (i6301446377683660838 != null) {
            i6301446377683660838.t = false;
            Y15061126039216380234 y15061126039216380234 = i6301446377683660838.s;
            if (y15061126039216380234 != null) {
                y15061126039216380234.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        n().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((L9687083612725928934) n()).y();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onDestroy();
        ((C10994625127000459680) this.u.b).t.j();
        this.v.e(P72364327365747079.ON_DESTROY);
    }

    public final boolean q(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C10994625127000459680) this.u.b).t.h();
        }
        return false;
    }

    public final void r() {
        super.onPostResume();
        this.v.e(P72364327365747079.ON_RESUME);
        P14575954172000745949 p14575954172000745949 = ((C10994625127000459680) this.u.b).t;
        p14575954172000745949.E = false;
        p14575954172000745949.F = false;
        p14575954172000745949.L.g = false;
        p14575954172000745949.s(7);
    }

    public final void s() {
        F6942723054099263096 f6942723054099263096 = this.u;
        f6942723054099263096.i();
        C10994625127000459680 c10994625127000459680 = (C10994625127000459680) f6942723054099263096.b;
        super.onStart();
        this.y = false;
        if (!this.w) {
            this.w = true;
            P14575954172000745949 p14575954172000745949 = c10994625127000459680.t;
            p14575954172000745949.E = false;
            p14575954172000745949.F = false;
            p14575954172000745949.L.g = false;
            p14575954172000745949.s(4);
        }
        c10994625127000459680.t.x(true);
        this.v.e(P72364327365747079.ON_START);
        P14575954172000745949 p145759541720007459492 = c10994625127000459680.t;
        p145759541720007459492.E = false;
        p145759541720007459492.F = false;
        p145759541720007459492.L.g = false;
        p145759541720007459492.s(5);
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void setContentView(int i) {
        l();
        n().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((L9687083612725928934) n()).R = i;
    }

    public final void t() {
        F6942723054099263096 f6942723054099263096;
        super.onStop();
        this.y = true;
        do {
            f6942723054099263096 = this.u;
        } while (o(((C10994625127000459680) f6942723054099263096.b).t));
        P14575954172000745949 p14575954172000745949 = ((C10994625127000459680) f6942723054099263096.b).t;
        p14575954172000745949.F = true;
        p14575954172000745949.L.g = true;
        p14575954172000745949.s(4);
        this.v.e(P72364327365747079.ON_STOP);
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public void setContentView(View view) {
        l();
        n().h(view);
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        n().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C10994625127000459680) this.u.b).t.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
