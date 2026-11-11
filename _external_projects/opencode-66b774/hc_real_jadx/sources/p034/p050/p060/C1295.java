package p034.p050.p060;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p034.p035.p045.C1096;
import p034.p035.p045.C1104;
import p034.p035.p045.C1112;
import p034.p035.p045.InterfaceC1108;
import p034.p035.p045.InterfaceC1118;
import p034.p050.C1146;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.AbstractC1154;
import p034.p050.p051.C1151;
import p034.p050.p051.C1158;
import p034.p050.p051.p052.C1164;
import p034.p050.p053.InterfaceC1218;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1295 extends ActionBar implements ActionBarOverlayLayout.InterfaceC0048 {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final Interpolator f6269 = new AccelerateInterpolator();

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final Interpolator f6270 = new DecelerateInterpolator();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6271;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f6272;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final InterfaceC1108 f6273;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public View f6274;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AbstractC1154 f6275;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f6276;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final InterfaceC1118 f6277;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f6278;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f6279;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ActionBarOverlayLayout f6280;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Context f6281;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public C1151 f6282;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f6283;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f6284;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC1218 f6285;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f6286;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f6287;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ActionBarContextView f6288;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ArrayList<ActionBar.InterfaceC0037> f6289;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f6290;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ActionBarContainer f6291;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final InterfaceC1108 f6292;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f6293;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1299 f6294;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public AbstractC1154.InterfaceC1155 f6295;

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻$〺つふすそ, reason: contains not printable characters */
    public class C1296 extends C1112 {
        public C1296() {
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            C1295 c1295 = C1295.this;
            c1295.f6282 = null;
            c1295.f6291.requestLayout();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻$くし〴〺ぅ, reason: contains not printable characters */
    public class C1297 implements InterfaceC1118 {
        public C1297() {
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1298 extends C1112 {
        public C1298() {
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            View view2;
            C1295 c1295 = C1295.this;
            if (c1295.f6276 && (view2 = c1295.f6274) != null) {
                view2.setTranslationY(0.0f);
                C1295.this.f6291.setTranslationY(0.0f);
            }
            C1295.this.f6291.setVisibility(8);
            C1295.this.f6291.setTransitioning(false);
            C1295 c12952 = C1295.this;
            c12952.f6282 = null;
            AbstractC1154.InterfaceC1155 interfaceC1155 = c12952.f6295;
            if (interfaceC1155 != null) {
                interfaceC1155.mo2597(c12952.f6275);
                c12952.f6275 = null;
                c12952.f6295 = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C1295.this.f6280;
            if (actionBarOverlayLayout != null) {
                C1096.m2518(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.〻ぞまぎな〻$びぐびあび, reason: contains not printable characters */
    public class C1299 extends AbstractC1154 implements C1164.InterfaceC1166 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public WeakReference<View> f6300;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final C1164 f6301;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public AbstractC1154.InterfaceC1155 f6302;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Context f6303;

        public C1299(Context context, AbstractC1154.InterfaceC1155 interfaceC1155) {
            this.f6303 = context;
            this.f6302 = interfaceC1155;
            C1164 c1164 = new C1164(context);
            c1164.f5779 = 1;
            this.f6301 = c1164;
            c1164.f5778 = this;
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: 〳ぜぞぜべっ */
        public CharSequence mo2583() {
            return C1295.this.f6288.getTitle();
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: 〺つふすそ */
        public void mo141(C1164 c1164) {
            if (this.f6302 == null) {
                return;
            }
            mo2595();
            ActionMenuPresenter actionMenuPresenter = C1295.this.f6288.f6031;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.m120();
            }
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: ぁごぐすすぃ */
        public CharSequence mo2584() {
            return C1295.this.f6288.getSubtitle();
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: いいにぽつ */
        public boolean mo2585() {
            return C1295.this.f6288.f230;
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: ぇぬぎばつ */
        public void mo2586(boolean z) {
            this.f5698 = z;
            C1295.this.f6288.setTitleOptional(z);
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: おぐぴう〸ず */
        public void mo2587(CharSequence charSequence) {
            C1295.this.f6288.setTitle(charSequence);
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: くし〴〺ぅ */
        public void mo2588() {
            C1295 c1295 = C1295.this;
            if (c1295.f6294 != this) {
                return;
            }
            if (!c1295.f6278) {
                this.f6302.mo2597(this);
            } else {
                c1295.f6275 = this;
                c1295.f6295 = this.f6302;
            }
            this.f6302 = null;
            C1295.this.m2958(false);
            ActionBarContextView actionBarContextView = C1295.this.f6288;
            if (actionBarContextView.f228 == null) {
                actionBarContextView.m97();
            }
            C1295.this.f6285.mo2825().sendAccessibilityEvent(32);
            C1295 c12952 = C1295.this;
            c12952.f6280.setHideOnContentScrollEnabled(c12952.f6287);
            C1295.this.f6294 = null;
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: げつ〴ぬぐ */
        public boolean mo142(C1164 c1164, MenuItem menuItem) {
            AbstractC1154.InterfaceC1155 interfaceC1155 = this.f6302;
            if (interfaceC1155 != null) {
                return interfaceC1155.mo2598(this, menuItem);
            }
            return false;
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: づざかべべ */
        public Menu mo2589() {
            return this.f6301;
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: てぜきぽく */
        public void mo2590(int i) {
            C1295.this.f6288.setSubtitle(C1295.this.f6281.getResources().getString(i));
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: なぎぱいぢぎ */
        public MenuInflater mo2591() {
            return new C1158(this.f6303);
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: のぷのちつ */
        public void mo2592(CharSequence charSequence) {
            C1295.this.f6288.setSubtitle(charSequence);
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: びぐびあび */
        public View mo2593() {
            WeakReference<View> weakReference = this.f6300;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: へぬ〴づぞ */
        public void mo2594(int i) {
            C1295.this.f6288.setTitle(C1295.this.f6281.getResources().getString(i));
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: ぺぁあねじ */
        public void mo2595() {
            if (C1295.this.f6294 != this) {
                return;
            }
            this.f6301.m2627();
            try {
                this.f6302.mo2599(this, this.f6301);
            } finally {
                this.f6301.m2629();
            }
        }

        @Override // p034.p050.p051.AbstractC1154
        /* renamed from: ぺふねづ〺 */
        public void mo2596(View view) {
            C1295.this.f6288.setCustomView(view);
            this.f6300 = new WeakReference<>(view);
        }
    }

    public C1295(Activity activity, boolean z) {
        new ArrayList();
        this.f6289 = new ArrayList<>();
        this.f6279 = 0;
        this.f6276 = true;
        this.f6290 = true;
        this.f6292 = new C1298();
        this.f6273 = new C1296();
        this.f6277 = new C1297();
        View decorView = activity.getWindow().getDecorView();
        m2959(decorView);
        if (z) {
            return;
        }
        this.f6274 = decorView.findViewById(R.id.content);
    }

    public C1295(Dialog dialog) {
        new ArrayList();
        this.f6289 = new ArrayList<>();
        this.f6279 = 0;
        this.f6276 = true;
        this.f6290 = true;
        this.f6292 = new C1298();
        this.f6273 = new C1296();
        this.f6277 = new C1297();
        m2959(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: 〺つふすそ */
    public boolean mo43() {
        InterfaceC1218 interfaceC1218 = this.f6285;
        if (interfaceC1218 == null || !interfaceC1218.mo2826()) {
            return false;
        }
        this.f6285.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぁごぐすすぃ */
    public void mo44(Configuration configuration) {
        m2960(this.f6281.getResources().getBoolean(C1146.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぇぬぎばつ */
    public void mo46(boolean z) {
        C1151 c1151;
        this.f6283 = z;
        if (z || (c1151 = this.f6282) == null) {
            return;
        }
        c1151.m2580();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぉざぅち〻 */
    public void mo47(CharSequence charSequence) {
        this.f6285.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: おぐぴう〸ず */
    public void mo48(Drawable drawable) {
        this.f6285.mo2815(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: くし〴〺ぅ */
    public void mo49(boolean z) {
        if (z == this.f6286) {
            return;
        }
        this.f6286 = z;
        int size = this.f6289.size();
        for (int i = 0; i < size; i++) {
            this.f6289.get(i).m66(z);
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m2958(boolean z) {
        C1104 mo2816;
        C1104 m2832;
        if (z) {
            if (!this.f6284) {
                this.f6284 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6280;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2961(false);
            }
        } else if (this.f6284) {
            this.f6284 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6280;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2961(false);
        }
        if (!C1096.m2517(this.f6291)) {
            if (z) {
                this.f6285.setVisibility(4);
                this.f6288.setVisibility(0);
                return;
            } else {
                this.f6285.setVisibility(0);
                this.f6288.setVisibility(8);
                return;
            }
        }
        if (z) {
            m2832 = this.f6285.mo2816(4, 100L);
            mo2816 = this.f6288.m2832(0, 200L);
        } else {
            mo2816 = this.f6285.mo2816(0, 200L);
            m2832 = this.f6288.m2832(8, 100L);
        }
        C1151 c1151 = new C1151();
        c1151.f5685.add(m2832);
        View view = m2832.f5597.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = mo2816.f5597.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c1151.f5685.add(mo2816);
        c1151.m2579();
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final void m2959(View view) {
        InterfaceC1218 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1268.decor_content_parent);
        this.f6280 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C1268.action_bar);
        if (findViewById instanceof InterfaceC1218) {
            wrapper = (InterfaceC1218) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder m4207 = C2098.m4207("Can't make a decor toolbar out of ");
                m4207.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(m4207.toString());
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f6285 = wrapper;
        this.f6288 = (ActionBarContextView) view.findViewById(C1268.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1268.action_bar_container);
        this.f6291 = actionBarContainer;
        InterfaceC1218 interfaceC1218 = this.f6285;
        if (interfaceC1218 == null || this.f6288 == null || actionBarContainer == null) {
            throw new IllegalStateException(C1295.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f6281 = interfaceC1218.getContext();
        boolean z = (this.f6285.mo2821() & 4) != 0;
        if (z) {
            this.f6271 = true;
        }
        Context context = this.f6281;
        this.f6285.mo2808((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m2960(context.getResources().getBoolean(C1146.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f6281.obtainStyledAttributes(null, C1148.ActionBar, C1264.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1148.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6280;
            if (!actionBarOverlayLayout2.f263) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f6287 = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1148.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            C1096.m2509(this.f6291, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ざとぅぼこ〺 */
    public void mo51(CharSequence charSequence) {
        this.f6285.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: づざかべべ */
    public Context mo52() {
        if (this.f6272 == null) {
            TypedValue typedValue = new TypedValue();
            this.f6281.getTheme().resolveAttribute(C1264.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f6272 = new ContextThemeWrapper(this.f6281, i);
            } else {
                this.f6272 = this.f6281;
            }
        }
        return this.f6272;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: てぜきぽく */
    public void mo53(boolean z) {
        if (this.f6271) {
            return;
        }
        mo55(z);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final void m2960(boolean z) {
        this.f6293 = z;
        if (z) {
            this.f6291.setTabContainer(null);
            this.f6285.mo2805(null);
        } else {
            this.f6285.mo2805(null);
            this.f6291.setTabContainer(null);
        }
        boolean z2 = this.f6285.mo2810() == 2;
        this.f6285.mo2819(!this.f6293 && z2);
        this.f6280.setHasNonEmbeddedTabs(!this.f6293 && z2);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: のぷのちつ */
    public void mo55(boolean z) {
        int i = z ? 4 : 0;
        int mo2821 = this.f6285.mo2821();
        this.f6271 = true;
        this.f6285.mo2818((i & 4) | ((-5) & mo2821));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: は〲ぱなで */
    public AbstractC1154 mo56(AbstractC1154.InterfaceC1155 interfaceC1155) {
        C1299 c1299 = this.f6294;
        if (c1299 != null) {
            c1299.mo2588();
        }
        this.f6280.setHideOnContentScrollEnabled(false);
        this.f6288.m97();
        C1299 c12992 = new C1299(this.f6288.getContext(), interfaceC1155);
        c12992.f6301.m2627();
        try {
            if (!c12992.f6302.mo2600(c12992, c12992.f6301)) {
                return null;
            }
            this.f6294 = c12992;
            c12992.mo2595();
            this.f6288.m99(c12992);
            m2958(true);
            this.f6288.sendAccessibilityEvent(32);
            return c12992;
        } finally {
            c12992.f6301.m2629();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: びぐびあび */
    public int mo57() {
        return this.f6285.mo2821();
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final void m2961(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f6284 || !this.f6278)) {
            if (this.f6290) {
                this.f6290 = false;
                C1151 c1151 = this.f6282;
                if (c1151 != null) {
                    c1151.m2580();
                }
                if (this.f6279 != 0 || (!this.f6283 && !z)) {
                    this.f6292.mo2539(null);
                    return;
                }
                this.f6291.setAlpha(1.0f);
                this.f6291.setTransitioning(true);
                C1151 c11512 = new C1151();
                float f = -this.f6291.getHeight();
                if (z) {
                    this.f6291.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                C1104 m2495 = C1096.m2495(this.f6291);
                m2495.m2533(f);
                m2495.m2537(this.f6277);
                if (!c11512.f5686) {
                    c11512.f5685.add(m2495);
                }
                if (this.f6276 && (view = this.f6274) != null) {
                    C1104 m24952 = C1096.m2495(view);
                    m24952.m2533(f);
                    if (!c11512.f5686) {
                        c11512.f5685.add(m24952);
                    }
                }
                Interpolator interpolator = f6269;
                boolean z2 = c11512.f5686;
                if (!z2) {
                    c11512.f5684 = interpolator;
                }
                if (!z2) {
                    c11512.f5683 = 250L;
                }
                InterfaceC1108 interfaceC1108 = this.f6292;
                if (!z2) {
                    c11512.f5688 = interfaceC1108;
                }
                this.f6282 = c11512;
                c11512.m2579();
                return;
            }
            return;
        }
        if (this.f6290) {
            return;
        }
        this.f6290 = true;
        C1151 c11513 = this.f6282;
        if (c11513 != null) {
            c11513.m2580();
        }
        this.f6291.setVisibility(0);
        if (this.f6279 == 0 && (this.f6283 || z)) {
            this.f6291.setTranslationY(0.0f);
            float f2 = -this.f6291.getHeight();
            if (z) {
                this.f6291.getLocationInWindow(new int[]{0, 0});
                f2 -= r9[1];
            }
            this.f6291.setTranslationY(f2);
            C1151 c11514 = new C1151();
            C1104 m24953 = C1096.m2495(this.f6291);
            m24953.m2533(0.0f);
            m24953.m2537(this.f6277);
            if (!c11514.f5686) {
                c11514.f5685.add(m24953);
            }
            if (this.f6276 && (view3 = this.f6274) != null) {
                view3.setTranslationY(f2);
                C1104 m24954 = C1096.m2495(this.f6274);
                m24954.m2533(0.0f);
                if (!c11514.f5686) {
                    c11514.f5685.add(m24954);
                }
            }
            Interpolator interpolator2 = f6270;
            boolean z3 = c11514.f5686;
            if (!z3) {
                c11514.f5684 = interpolator2;
            }
            if (!z3) {
                c11514.f5683 = 250L;
            }
            InterfaceC1108 interfaceC11082 = this.f6273;
            if (!z3) {
                c11514.f5688 = interfaceC11082;
            }
            this.f6282 = c11514;
            c11514.m2579();
        } else {
            this.f6291.setAlpha(1.0f);
            this.f6291.setTranslationY(0.0f);
            if (this.f6276 && (view2 = this.f6274) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f6273.mo2539(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6280;
        if (actionBarOverlayLayout != null) {
            C1096.m2518(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: へぬ〴づぞ */
    public void mo58(int i) {
        this.f6285.mo2809(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: ぺぁあねじ */
    public boolean mo59(int i, KeyEvent keyEvent) {
        C1164 c1164;
        C1299 c1299 = this.f6294;
        if (c1299 == null || (c1164 = c1299.f6301) == null) {
            return false;
        }
        c1164.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c1164.performShortcut(i, keyEvent, 0);
    }
}
