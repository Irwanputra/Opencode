package dev.epro.r0;

import ads_mobile_sdk.pd;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L9687083612725928934 extends V16233589191250258052 implements S17787728937930228535, LayoutInflater.Factory2 {
    public static final W929662112881511578 f0 = new W929662112881511578(0);
    public static final int[] g0 = {R.attr.windowBackground};
    public static final boolean h0 = !"robolectric".equals(Build.FINGERPRINT);
    public TextView A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Z6779776290352300882[] J;
    public Z6779776290352300882 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Configuration P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public G17662402151818006683 U;
    public G17662402151818006683 V;
    public boolean W;
    public int X;
    public boolean Z;
    public Rect a0;
    public Rect b0;
    public U5561144831620908833 c0;
    public OnBackInvokedDispatcher d0;
    public J614522193061423954 e0;
    public final Object j;
    public final Context k;
    public Window l;
    public G18438633296416354980 m;
    public I6301446377683660838 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C8081513896840795204 f354o;
    public CharSequence p;
    public ActionBarOverlayLayout q;
    public I11105136999178551542 r;
    public I11105136999178551542 s;
    public F3205875925450835131 t;
    public ActionBarContextView u;
    public PopupWindow v;
    public W15073550463345577671 w;
    public boolean y;
    public ViewGroup z;
    public Q1445202285683234142 x = null;
    public final W15073550463345577671 Y = new W15073550463345577671(this, 0);

    public L9687083612725928934(Context context, Window window, P11323103762586676051 p11323103762586676051, Object obj) {
        R13227154569034155950 r13227154569034155950 = null;
        this.Q = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof R13227154569034155950)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        r13227154569034155950 = (R13227154569034155950) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (r13227154569034155950 != null) {
                this.Q = ((L9687083612725928934) r13227154569034155950.n()).Q;
            }
        }
        if (this.Q == -100) {
            String name = this.j.getClass().getName();
            W929662112881511578 w929662112881511578 = f0;
            Integer num = (Integer) w929662112881511578.get(name);
            if (num != null) {
                this.Q = num.intValue();
                w929662112881511578.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        D6070089955350435999.c();
    }

    public static J10695037395247619504 n(Context context) {
        J10695037395247619504 j10695037395247619504;
        J10695037395247619504 j106950373952476195042;
        if (Build.VERSION.SDK_INT >= 33 || (j10695037395247619504 = V16233589191250258052.c) == null) {
            return null;
        }
        Z13811601408893342202 z13811601408893342202 = j10695037395247619504.a;
        J10695037395247619504 j10695037395247619504A = J10695037395247619504.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (z13811601408893342202.a.isEmpty()) {
            j106950373952476195042 = J10695037395247619504.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < j10695037395247619504A.a.a.size() + z13811601408893342202.a.size()) {
                Locale localeB = i < z13811601408893342202.a.size() ? j10695037395247619504.b(i) : j10695037395247619504A.b(i - z13811601408893342202.a.size());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            j106950373952476195042 = new J10695037395247619504(new Z13811601408893342202(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return j106950373952476195042.a.a.isEmpty() ? j10695037395247619504A : j106950373952476195042;
    }

    public static Configuration r(Context context, int i, J10695037395247619504 j10695037395247619504, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (j10695037395247619504 != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(j10695037395247619504.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final int A(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            S10973172697741180971.m("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        G17662402151818006683 g17662402151818006683 = this.V;
                        if (g17662402151818006683 == null) {
                            g17662402151818006683 = new G17662402151818006683(this, context);
                            this.V = g17662402151818006683;
                        }
                        return g17662402151818006683.j();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).j();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean B() {
        G7891994592490973475 g7891994592490973475;
        J17018592638074147698 j17018592638074147698;
        boolean z = this.L;
        this.L = false;
        Z6779776290352300882 z6779776290352300882X = x(0);
        if (!z6779776290352300882X.m) {
            F3205875925450835131 f3205875925450835131 = this.t;
            if (f3205875925450835131 != null) {
                f3205875925450835131.a();
                return true;
            }
            y();
            I6301446377683660838 i6301446377683660838 = this.n;
            if (i6301446377683660838 == null || (g7891994592490973475 = i6301446377683660838.e) == null || (j17018592638074147698 = ((X97881583022885904) g7891994592490973475).a.L) == null || j17018592638074147698.b == null) {
                return false;
            }
            J17018592638074147698 j170185926380741476982 = ((X97881583022885904) g7891994592490973475).a.L;
            I4217019646703278835 i4217019646703278835 = j170185926380741476982 == null ? null : j170185926380741476982.b;
            if (i4217019646703278835 != null) {
                i4217019646703278835.collapseActionView();
            }
        } else if (!z) {
            q(z6779776290352300882X, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(dev.epro.r0.Z6779776290352300882 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.C(dev.epro.r0.Z6779776290352300882, android.view.KeyEvent):void");
    }

    public final boolean D(Z6779776290352300882 z6779776290352300882, int i, KeyEvent keyEvent) {
        T8605657386197958581 t8605657386197958581;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((z6779776290352300882.k || E(z6779776290352300882, keyEvent)) && (t8605657386197958581 = z6779776290352300882.h) != null) {
            return t8605657386197958581.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[PHI: r6
      0x00ce: PHI (r6v2 dev.epro.r0.T8605657386197958581) = (r6v1 dev.epro.r0.T8605657386197958581), (r6v8 dev.epro.r0.T8605657386197958581) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(dev.epro.r0.Z6779776290352300882 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.E(dev.epro.r0.Z6779776290352300882, android.view.KeyEvent):boolean");
    }

    public final void F() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        J614522193061423954 j614522193061423954;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.d0 != null && (x(0).m || this.t != null)) {
                z = true;
            }
            if (z && this.e0 == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.d0;
                J614522193061423954 j6145221930614239542 = new J614522193061423954(this, (byte) 1);
                P12992571626612557236.p(onBackInvokedDispatcher).registerOnBackInvokedCallback(1000000, j6145221930614239542);
                this.e0 = j6145221930614239542;
                return;
            }
            if (z || (j614522193061423954 = this.e0) == null) {
                return;
            }
            P12992571626612557236.p(this.d0).unregisterOnBackInvokedCallback(P12992571626612557236.l(j614522193061423954));
            this.e0 = null;
        }
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final void b() {
        String strO;
        this.M = true;
        k(false, true);
        v();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strO = T18016951143603335921.O(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strO = null;
            }
            if (strO != null) {
                I6301446377683660838 i6301446377683660838 = this.n;
                if (i6301446377683660838 == null) {
                    this.Z = true;
                } else {
                    i6301446377683660838.d(true);
                }
            }
            synchronized (V16233589191250258052.h) {
                V16233589191250258052.d(this);
                V16233589191250258052.g.add(new WeakReference(this));
            }
        }
        this.P = new Configuration(this.k.getResources().getConfiguration());
        this.N = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // dev.epro.r0.V16233589191250258052
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = dev.epro.r0.V16233589191250258052.h
            monitor-enter(r0)
            dev.epro.r0.V16233589191250258052.d(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.W
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            dev.epro.r0.W15073550463345577671 r1 = r3.Y
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.O = r0
            int r0 = r3.Q
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            dev.epro.r0.W929662112881511578 r0 = dev.epro.r0.L9687083612725928934.f0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            dev.epro.r0.W929662112881511578 r0 = dev.epro.r0.L9687083612725928934.f0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            dev.epro.r0.G17662402151818006683 r0 = r3.U
            if (r0 == 0) goto L63
            r0.g()
        L63:
            dev.epro.r0.G17662402151818006683 r3 = r3.V
            if (r3 == 0) goto L6a
            r3.g()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.c():void");
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final boolean e(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.H && i == 108) {
            return false;
        }
        if (this.D && i == 1) {
            this.D = false;
        }
        if (i == 1) {
            F();
            this.H = true;
            return true;
        }
        if (i == 2) {
            F();
            this.B = true;
            return true;
        }
        if (i == 5) {
            F();
            this.C = true;
            return true;
        }
        if (i == 10) {
            F();
            this.F = true;
            return true;
        }
        if (i == 108) {
            F();
            this.D = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        F();
        this.E = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // dev.epro.r0.S17787728937930228535
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(dev.epro.r0.T8605657386197958581 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.f(dev.epro.r0.T8605657386197958581):void");
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final void g(int i) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final void h(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // dev.epro.r0.V16233589191250258052
    public final void j(CharSequence charSequence) {
        this.p = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        I6301446377683660838 i6301446377683660838 = this.n;
        if (i6301446377683660838 == null) {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        X97881583022885904 x97881583022885904 = (X97881583022885904) i6301446377683660838.e;
        if (x97881583022885904.g) {
            return;
        }
        Toolbar toolbar = x97881583022885904.a;
        x97881583022885904.h = charSequence;
        if ((x97881583022885904.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x97881583022885904.g) {
                W10240872260424387225.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.k(boolean, boolean):boolean");
    }

    @Override // dev.epro.r0.S17787728937930228535
    public final boolean l(T8605657386197958581 t8605657386197958581, MenuItem menuItem) {
        Z6779776290352300882 z6779776290352300882;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.O) {
            T8605657386197958581 t8605657386197958581K = t8605657386197958581.k();
            Z6779776290352300882[] z6779776290352300882Arr = this.J;
            int length = z6779776290352300882Arr != null ? z6779776290352300882Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    z6779776290352300882 = z6779776290352300882Arr[i];
                    if (z6779776290352300882 != null && z6779776290352300882.h == t8605657386197958581K) {
                        break;
                    }
                    i++;
                } else {
                    z6779776290352300882 = null;
                    break;
                }
            }
            if (z6779776290352300882 != null) {
                return callback.onMenuItemSelected(z6779776290352300882.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.l
            if (r1 != 0) goto L86
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof dev.epro.r0.G18438633296416354980
            if (r2 != 0) goto L82
            dev.epro.r0.G18438633296416354980 r0 = new dev.epro.r0.G18438633296416354980
            r0.<init>(r7, r1)
            r7.m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.k
            int[] r1 = dev.epro.r0.L9687083612725928934.g0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            dev.epro.r0.D6070089955350435999 r4 = dev.epro.r0.D6070089955350435999.a()
            monitor-enter(r4)
            dev.epro.r0.B5275173104802412095 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.e(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L81
            android.window.OnBackInvokedDispatcher r8 = r7.d0
            if (r8 != 0) goto L81
            java.lang.Object r0 = r7.j
            if (r8 == 0) goto L69
            dev.epro.r0.J614522193061423954 r1 = r7.e0
            if (r1 == 0) goto L69
            android.window.OnBackInvokedCallback r1 = dev.epro.r0.P12992571626612557236.l(r1)
            android.window.OnBackInvokedDispatcher r8 = dev.epro.r0.P12992571626612557236.p(r8)
            dev.epro.r0.P12992571626612557236.s(r8, r1)
            r7.e0 = r2
        L69:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L7c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L7c
            android.window.OnBackInvokedDispatcher r8 = dev.epro.r0.P12992571626612557236.m(r0)
            r7.d0 = r8
            goto L7e
        L7c:
            r7.d0 = r2
        L7e:
            r7.G()
        L81:
            return
        L82:
            dev.epro.r0.S10973172697741180971.m(r0)
            return
        L86:
            dev.epro.r0.S10973172697741180971.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.m(android.view.Window):void");
    }

    public final void o(int i, Z6779776290352300882 z6779776290352300882, T8605657386197958581 t8605657386197958581) {
        if (t8605657386197958581 == null) {
            if (z6779776290352300882 == null && i >= 0) {
                Z6779776290352300882[] z6779776290352300882Arr = this.J;
                if (i < z6779776290352300882Arr.length) {
                    z6779776290352300882 = z6779776290352300882Arr[i];
                }
            }
            if (z6779776290352300882 != null) {
                t8605657386197958581 = z6779776290352300882.h;
            }
        }
        if ((z6779776290352300882 == null || z6779776290352300882.m) && !this.O) {
            G18438633296416354980 g18438633296416354980 = this.m;
            Window.Callback callback = this.l.getCallback();
            g18438633296416354980.getClass();
            try {
                g18438633296416354980.d = true;
                callback.onPanelClosed(i, t8605657386197958581);
            } finally {
                g18438633296416354980.d = false;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        U5561144831620908833 u5561144831620908833;
        Context h16785758874348248089;
        View d11138356156783438498;
        u5561144831620908833 = this.c0;
        View view2 = null;
        if (u5561144831620908833 == null) {
            int[] iArr = Y17304307076558258116.j;
            Context context2 = this.k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                u5561144831620908833 = new U5561144831620908833();
                this.c0 = u5561144831620908833;
            } else {
                try {
                    u5561144831620908833 = (U5561144831620908833) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.c0 = u5561144831620908833;
                } catch (Throwable unused) {
                    u5561144831620908833 = new U5561144831620908833();
                    this.c0 = u5561144831620908833;
                }
            }
        }
        u5561144831620908833.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Y17304307076558258116.x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        h16785758874348248089 = (resourceId == 0 || ((context instanceof H16785758874348248089) && ((H16785758874348248089) context).a == resourceId)) ? context : new H16785758874348248089(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                d11138356156783438498 = new D11138356156783438498(h16785758874348248089, attributeSet);
                break;
            case "CheckedTextView":
                d11138356156783438498 = new Q4556812619972923007(h16785758874348248089, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                d11138356156783438498 = new H1116075490871970444(h16785758874348248089, attributeSet);
                break;
            case "TextView":
                d11138356156783438498 = u5561144831620908833.e(h16785758874348248089, attributeSet);
                break;
            case "ImageButton":
                d11138356156783438498 = new V13302460013598267156(h16785758874348248089, attributeSet, net.zetetic.database.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                d11138356156783438498 = new O16724885495886488743(h16785758874348248089, attributeSet);
                break;
            case "Spinner":
                d11138356156783438498 = new T4056244775750501969(h16785758874348248089, attributeSet);
                break;
            case "RadioButton":
                d11138356156783438498 = u5561144831620908833.d(h16785758874348248089, attributeSet);
                break;
            case "ToggleButton":
                d11138356156783438498 = new T12691272802380151635(h16785758874348248089, attributeSet);
                break;
            case "ImageView":
                d11138356156783438498 = new R11798632102026936588(h16785758874348248089, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                d11138356156783438498 = u5561144831620908833.a(h16785758874348248089, attributeSet);
                break;
            case "CheckBox":
                d11138356156783438498 = u5561144831620908833.c(h16785758874348248089, attributeSet);
                break;
            case "EditText":
                d11138356156783438498 = new B6584454571824948275(h16785758874348248089, attributeSet);
                break;
            case "Button":
                d11138356156783438498 = u5561144831620908833.b(h16785758874348248089, attributeSet);
                break;
            default:
                d11138356156783438498 = null;
                break;
        }
        if (d11138356156783438498 == null && context != h16785758874348248089) {
            Object[] objArr = u5561144831620908833.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = h16785758874348248089;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = U5561144831620908833.g;
                        if (i < 3) {
                            View viewF = u5561144831620908833.f(h16785758874348248089, str, strArr[i]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = u5561144831620908833.f(h16785758874348248089, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            d11138356156783438498 = view2;
        }
        if (d11138356156783438498 != null) {
            Context context3 = d11138356156783438498.getContext();
            if ((context3 instanceof ContextWrapper) && d11138356156783438498.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, U5561144831620908833.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    d11138356156783438498.setOnClickListener(new Q2471165540749930110(d11138356156783438498, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = h16785758874348248089.obtainStyledAttributes(attributeSet, U5561144831620908833.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    new F5719092837822460436(net.zetetic.database.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(d11138356156783438498, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = h16785758874348248089.obtainStyledAttributes(attributeSet, U5561144831620908833.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    W10240872260424387225.k(d11138356156783438498, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = h16785758874348248089.obtainStyledAttributes(attributeSet, U5561144831620908833.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = W10240872260424387225.a;
                    new F5719092837822460436(net.zetetic.database.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(d11138356156783438498, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return d11138356156783438498;
    }

    public final void p(T8605657386197958581 t8605657386197958581) {
        T1878852318042345820 t1878852318042345820;
        if (this.I) {
            return;
        }
        this.I = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        actionBarOverlayLayout.j();
        ActionMenuView actionMenuView = ((X97881583022885904) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (t1878852318042345820 = actionMenuView.t) != null) {
            t1878852318042345820.e();
            H10500197361170225543 h10500197361170225543 = t1878852318042345820.t;
            if (h10500197361170225543 != null && h10500197361170225543.b()) {
                h10500197361170225543.i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.O) {
            callback.onPanelClosed(pd.i1, t8605657386197958581);
        }
        this.I = false;
    }

    public final void q(Z6779776290352300882 z6779776290352300882, boolean z) {
        A3453968838033651878 a3453968838033651878;
        ActionBarOverlayLayout actionBarOverlayLayout;
        T1878852318042345820 t1878852318042345820;
        if (z && z6779776290352300882.a == 0 && (actionBarOverlayLayout = this.q) != null) {
            actionBarOverlayLayout.j();
            ActionMenuView actionMenuView = ((X97881583022885904) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (t1878852318042345820 = actionMenuView.t) != null && t1878852318042345820.g()) {
                p(z6779776290352300882.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && z6779776290352300882.m && (a3453968838033651878 = z6779776290352300882.e) != null) {
            windowManager.removeView(a3453968838033651878);
            if (z) {
                o(z6779776290352300882.a, z6779776290352300882, null);
            }
        }
        z6779776290352300882.k = false;
        z6779776290352300882.l = false;
        z6779776290352300882.m = false;
        z6779776290352300882.f = null;
        z6779776290352300882.n = true;
        if (this.K == z6779776290352300882) {
            this.K = null;
        }
        if (z6779776290352300882.a == 0) {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9687083612725928934.s(android.view.KeyEvent):boolean");
    }

    public final void t(int i) {
        Z6779776290352300882 z6779776290352300882X = x(i);
        if (z6779776290352300882X.h != null) {
            Bundle bundle = new Bundle();
            z6779776290352300882X.h.t(bundle);
            if (bundle.size() > 0) {
                z6779776290352300882X.p = bundle;
            }
            z6779776290352300882X.h.w();
            z6779776290352300882X.h.clear();
        }
        z6779776290352300882X.f605o = true;
        z6779776290352300882X.n = true;
        if ((i == 108 || i == 0) && this.q != null) {
            Z6779776290352300882 z6779776290352300882X2 = x(0);
            z6779776290352300882X2.k = false;
            E(z6779776290352300882X2, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        if (this.y) {
            return;
        }
        Context context = this.k;
        int[] iArr = Y17304307076558258116.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            S10973172697741180971.m("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        byte b = 0;
        byte b2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            e(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            e(pd.i1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            e(pd.j1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            e(10);
        }
        this.G = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        v();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.H) {
            viewGroup = this.F ? (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.G) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(net.zetetic.database.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.E = false;
            this.D = false;
        } else if (this.D) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(net.zetetic.database.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new H16785758874348248089(context, typedValue.resourceId) : context).inflate(net.zetetic.database.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(net.zetetic.database.R.id.decor_content_parent);
            this.q = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.E) {
                this.q.h(pd.j1);
            }
            if (this.B) {
                this.q.h(2);
            }
            if (this.C) {
                this.q.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.D);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.E);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.G);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.F);
            sb.append(", windowNoTitle: ");
            S10973172697741180971.j(E12098517352909843120.o(sb, this.H, " }"));
            return;
        }
        I11105136999178551542 i11105136999178551542 = new I11105136999178551542(this, b);
        WeakHashMap weakHashMap = W10240872260424387225.a;
        Q5747078841744593420.c(viewGroup, i11105136999178551542);
        if (this.q == null) {
            this.A = (TextView) viewGroup.findViewById(net.zetetic.database.R.id.title);
        }
        boolean z = G17670069693736004358.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(net.zetetic.database.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new I11105136999178551542(this, b2));
        this.z = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.p;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                I6301446377683660838 i6301446377683660838 = this.n;
                if (i6301446377683660838 != null) {
                    X97881583022885904 x97881583022885904 = (X97881583022885904) i6301446377683660838.e;
                    if (!x97881583022885904.g) {
                        Toolbar toolbar = x97881583022885904.a;
                        x97881583022885904.h = title;
                        if ((x97881583022885904.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (x97881583022885904.g) {
                                W10240872260424387225.k(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.z.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.y = true;
        Z6779776290352300882 z6779776290352300882X = x(0);
        if (this.O || z6779776290352300882X.h != null) {
            return;
        }
        z(pd.i1);
    }

    public final void v() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        S10973172697741180971.m("We have not been given a Window");
    }

    public final R4239627874707364917 w(Context context) {
        G17662402151818006683 g17662402151818006683 = this.U;
        if (g17662402151818006683 == null) {
            I1632105416032993715 i1632105416032993715 = I1632105416032993715.e;
            if (i1632105416032993715 == null) {
                Context applicationContext = context.getApplicationContext();
                i1632105416032993715 = new I1632105416032993715(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                I1632105416032993715.e = i1632105416032993715;
            }
            g17662402151818006683 = new G17662402151818006683(this, i1632105416032993715);
            this.U = g17662402151818006683;
        }
        return g17662402151818006683;
    }

    public final Z6779776290352300882 x(int i) {
        Z6779776290352300882[] z6779776290352300882Arr = this.J;
        if (z6779776290352300882Arr == null || z6779776290352300882Arr.length <= i) {
            Z6779776290352300882[] z6779776290352300882Arr2 = new Z6779776290352300882[i + 1];
            if (z6779776290352300882Arr != null) {
                System.arraycopy(z6779776290352300882Arr, 0, z6779776290352300882Arr2, 0, z6779776290352300882Arr.length);
            }
            this.J = z6779776290352300882Arr2;
            z6779776290352300882Arr = z6779776290352300882Arr2;
        }
        Z6779776290352300882 z6779776290352300882 = z6779776290352300882Arr[i];
        if (z6779776290352300882 != null) {
            return z6779776290352300882;
        }
        Z6779776290352300882 z67797762903523008822 = new Z6779776290352300882();
        z67797762903523008822.a = i;
        z67797762903523008822.n = false;
        z6779776290352300882Arr[i] = z67797762903523008822;
        return z67797762903523008822;
    }

    public final void y() {
        I6301446377683660838 i6301446377683660838;
        u();
        if (this.D && (i6301446377683660838 = this.n) == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                i6301446377683660838 = new I6301446377683660838((Activity) obj, this.E);
                this.n = i6301446377683660838;
            } else if (obj instanceof Dialog) {
                i6301446377683660838 = new I6301446377683660838((Dialog) obj);
                this.n = i6301446377683660838;
            }
            if (i6301446377683660838 != null) {
                i6301446377683660838.d(this.Z);
            }
        }
    }

    public final void z(int i) {
        this.X = (1 << i) | this.X;
        if (this.W) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = W10240872260424387225.a;
        decorView.postOnAnimation(this.Y);
        this.W = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
