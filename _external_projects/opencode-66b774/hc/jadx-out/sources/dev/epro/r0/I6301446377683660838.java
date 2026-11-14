package dev.epro.r0;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I6301446377683660838 implements X5533554694773126879 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public G7891994592490973475 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public O9996154012702779839 i;
    public O9996154012702779839 j;
    public W8455343525638953052 k;
    public boolean l;
    public final ArrayList m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f297o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Y15061126039216380234 s;
    public boolean t;
    public boolean u;
    public final D8470282021971048884 v;
    public final D8470282021971048884 w;
    public final M204440408817344908 x;

    public I6301446377683660838(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.f297o = true;
        this.r = true;
        this.v = new D8470282021971048884(this, (byte) 0);
        this.w = new D8470282021971048884(this, (byte) 1);
        this.x = new M204440408817344908(this, (byte) 7);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        Q1445202285683234142 q1445202285683234142J;
        Q1445202285683234142 q1445202285683234142J2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        G7891994592490973475 g7891994592490973475 = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((X97881583022885904) g7891994592490973475).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((X97881583022885904) g7891994592490973475).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            X97881583022885904 x97881583022885904 = (X97881583022885904) g7891994592490973475;
            q1445202285683234142J = W10240872260424387225.a(x97881583022885904.a);
            q1445202285683234142J.a(0.0f);
            q1445202285683234142J.c(100L);
            q1445202285683234142J.d(new B17334521814410871793(x97881583022885904, 4));
            q1445202285683234142J2 = this.f.j(0, 200L);
        } else {
            X97881583022885904 x978815830228859042 = (X97881583022885904) g7891994592490973475;
            Q1445202285683234142 q1445202285683234142A = W10240872260424387225.a(x978815830228859042.a);
            q1445202285683234142A.a(1.0f);
            q1445202285683234142A.c(200L);
            q1445202285683234142A.d(new B17334521814410871793(x978815830228859042, 0));
            q1445202285683234142J = this.f.j(8, 100L);
            q1445202285683234142J2 = q1445202285683234142A;
        }
        Y15061126039216380234 y15061126039216380234 = new Y15061126039216380234();
        ArrayList arrayList = y15061126039216380234.a;
        arrayList.add(q1445202285683234142J);
        View view = (View) q1445202285683234142J.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) q1445202285683234142J2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(q1445202285683234142J2);
        y15061126039216380234.b();
    }

    public final Context b() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(net.zetetic.database.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.a;
        this.b = context2;
        return context2;
    }

    public final void c(View view) {
        G7891994592490973475 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(net.zetetic.database.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(net.zetetic.database.R.id.action_bar);
        if (callbackFindViewById instanceof G7891994592490973475) {
            wrapper = (G7891994592490973475) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(net.zetetic.database.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(net.zetetic.database.R.id.action_bar_container);
        this.d = actionBarContainer;
        G7891994592490973475 g7891994592490973475 = this.e;
        if (g7891994592490973475 == null || this.f == null || actionBarContainer == null) {
            S10973172697741180971.m(I6301446377683660838.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((X97881583022885904) g7891994592490973475).a.getContext();
        this.a = context;
        if ((((X97881583022885904) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(net.zetetic.database.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, Y17304307076558258116.a, net.zetetic.database.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                S10973172697741180971.m("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = W10240872260424387225.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        X97881583022885904 x97881583022885904 = (X97881583022885904) this.e;
        int i2 = x97881583022885904.b;
        this.h = true;
        x97881583022885904.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((X97881583022885904) this.e).getClass();
        } else {
            ((X97881583022885904) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((X97881583022885904) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final M204440408817344908 m204440408817344908 = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                Y15061126039216380234 y15061126039216380234 = this.s;
                if (y15061126039216380234 != null) {
                    y15061126039216380234.a();
                }
                int i = this.n;
                D8470282021971048884 d8470282021971048884 = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    d8470282021971048884.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                Y15061126039216380234 y150611260392163802342 = new Y15061126039216380234();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                Q1445202285683234142 q1445202285683234142A = W10240872260424387225.a(this.d);
                q1445202285683234142A.e(f);
                final View view2 = (View) q1445202285683234142A.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(m204440408817344908 != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: dev.epro.r0.V16381039540187120137
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((I6301446377683660838) this.a.b).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = y150611260392163802342.e;
                ArrayList arrayList = y150611260392163802342.a;
                if (!z5) {
                    arrayList.add(q1445202285683234142A);
                }
                if (this.f297o && view != null) {
                    Q1445202285683234142 q1445202285683234142A2 = W10240872260424387225.a(view);
                    q1445202285683234142A2.e(f);
                    if (!y150611260392163802342.e) {
                        arrayList.add(q1445202285683234142A2);
                    }
                }
                boolean z6 = y150611260392163802342.e;
                if (!z6) {
                    y150611260392163802342.c = y;
                }
                if (!z6) {
                    y150611260392163802342.b = 250L;
                }
                if (!z6) {
                    y150611260392163802342.d = d8470282021971048884;
                }
                this.s = y150611260392163802342;
                y150611260392163802342.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        Y15061126039216380234 y150611260392163802343 = this.s;
        if (y150611260392163802343 != null) {
            y150611260392163802343.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        D8470282021971048884 d84702820219710488842 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            Y15061126039216380234 y150611260392163802344 = new Y15061126039216380234();
            Q1445202285683234142 q1445202285683234142A3 = W10240872260424387225.a(this.d);
            q1445202285683234142A3.e(0.0f);
            final View view3 = (View) q1445202285683234142A3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(m204440408817344908 != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: dev.epro.r0.V16381039540187120137
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((I6301446377683660838) this.a.b).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = y150611260392163802344.e;
            ArrayList arrayList2 = y150611260392163802344.a;
            if (!z7) {
                arrayList2.add(q1445202285683234142A3);
            }
            if (this.f297o && view != null) {
                view.setTranslationY(f2);
                Q1445202285683234142 q1445202285683234142A4 = W10240872260424387225.a(view);
                q1445202285683234142A4.e(0.0f);
                if (!y150611260392163802344.e) {
                    arrayList2.add(q1445202285683234142A4);
                }
            }
            boolean z8 = y150611260392163802344.e;
            if (!z8) {
                y150611260392163802344.c = z;
            }
            if (!z8) {
                y150611260392163802344.b = 250L;
            }
            if (!z8) {
                y150611260392163802344.d = d84702820219710488842;
            }
            this.s = y150611260392163802344;
            y150611260392163802344.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f297o && view != null) {
                view.setTranslationY(0.0f);
            }
            d84702820219710488842.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = W10240872260424387225.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public I6301446377683660838(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.f297o = true;
        this.r = true;
        this.v = new D8470282021971048884(this, (byte) 0);
        this.w = new D8470282021971048884(this, (byte) 1);
        this.x = new M204440408817344908(this, (byte) 7);
        c(dialog.getWindow().getDecorView());
    }
}
