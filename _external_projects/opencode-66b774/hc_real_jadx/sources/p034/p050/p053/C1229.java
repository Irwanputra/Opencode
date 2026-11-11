package p034.p050.p053;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import p034.p035.p045.C1096;
import p034.p035.p045.C1104;
import p034.p035.p045.C1112;
import p034.p050.C1145;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p055.p056.C1266;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.せづっ〸ちね, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1229 implements InterfaceC1218 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6040;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6041;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f6042;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public CharSequence f6043;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public Drawable f6044;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f6045;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public View f6046;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Toolbar f6047;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable f6048;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Window.Callback f6049;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Drawable f6050;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f6051;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View f6052;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ActionMenuPresenter f6053;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public CharSequence f6054;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f6055;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.せづっ〸ちね$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1230 extends C1112 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f6056;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f6058 = false;

        public C1230(int i) {
            this.f6056 = i;
        }

        @Override // p034.p035.p045.InterfaceC1108
        /* renamed from: 〺つふすそ */
        public void mo2539(View view) {
            if (this.f6058) {
                return;
            }
            C1229.this.f6047.setVisibility(this.f6056);
        }

        @Override // p034.p035.p045.C1112, p034.p035.p045.InterfaceC1108
        /* renamed from: くし〴〺ぅ */
        public void mo2540(View view) {
            C1229.this.f6047.setVisibility(0);
        }

        @Override // p034.p035.p045.C1112, p034.p035.p045.InterfaceC1108
        /* renamed from: げつ〴ぬぐ */
        public void mo2541(View view) {
            this.f6058 = true;
        }
    }

    public C1229(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = C1145.abc_action_bar_up_description;
        this.f6045 = 0;
        this.f6047 = toolbar;
        this.f6054 = toolbar.getTitle();
        this.f6043 = toolbar.getSubtitle();
        this.f6040 = this.f6054 != null;
        this.f6042 = toolbar.getNavigationIcon();
        C1260 m2910 = C1260.m2910(toolbar.getContext(), null, C1148.ActionBar, C1264.actionBarStyle, 0);
        this.f6044 = m2910.m2913(C1148.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m2916 = m2910.m2916(C1148.ActionBar_title);
            if (!TextUtils.isEmpty(m2916)) {
                setTitle(m2916);
            }
            CharSequence m29162 = m2910.m2916(C1148.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m29162)) {
                this.f6043 = m29162;
                if ((this.f6041 & 8) != 0) {
                    this.f6047.setSubtitle(m29162);
                }
            }
            Drawable m2913 = m2910.m2913(C1148.ActionBar_logo);
            if (m2913 != null) {
                this.f6050 = m2913;
                m2835();
            }
            Drawable m29132 = m2910.m2913(C1148.ActionBar_icon);
            if (m29132 != null) {
                this.f6048 = m29132;
                m2835();
            }
            if (this.f6042 == null && (drawable = this.f6044) != null) {
                this.f6042 = drawable;
                m2834();
            }
            mo2818(m2910.m2914(C1148.ActionBar_displayOptions, 0));
            int m2922 = m2910.m2922(C1148.ActionBar_customNavigationLayout, 0);
            if (m2922 != 0) {
                View inflate = LayoutInflater.from(this.f6047.getContext()).inflate(m2922, (ViewGroup) this.f6047, false);
                View view = this.f6052;
                if (view != null && (this.f6041 & 16) != 0) {
                    this.f6047.removeView(view);
                }
                this.f6052 = inflate;
                if (inflate != null && (this.f6041 & 16) != 0) {
                    this.f6047.addView(inflate);
                }
                mo2818(this.f6041 | 16);
            }
            int m2920 = m2910.m2920(C1148.ActionBar_height, 0);
            if (m2920 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f6047.getLayoutParams();
                layoutParams.height = m2920;
                this.f6047.setLayoutParams(layoutParams);
            }
            int m2919 = m2910.m2919(C1148.ActionBar_contentInsetStart, -1);
            int m29192 = m2910.m2919(C1148.ActionBar_contentInsetEnd, -1);
            if (m2919 >= 0 || m29192 >= 0) {
                this.f6047.setContentInsetsRelative(Math.max(m2919, 0), Math.max(m29192, 0));
            }
            int m29222 = m2910.m2922(C1148.ActionBar_titleTextStyle, 0);
            if (m29222 != 0) {
                Toolbar toolbar2 = this.f6047;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), m29222);
            }
            int m29223 = m2910.m2922(C1148.ActionBar_subtitleTextStyle, 0);
            if (m29223 != 0) {
                Toolbar toolbar3 = this.f6047;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), m29223);
            }
            int m29224 = m2910.m2922(C1148.ActionBar_popupTheme, 0);
            if (m29224 != 0) {
                this.f6047.setPopupTheme(m29224);
            }
        } else {
            if (this.f6047.getNavigationIcon() != null) {
                i = 15;
                this.f6044 = this.f6047.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f6041 = i;
        }
        m2910.f6162.recycle();
        if (i2 != this.f6045) {
            this.f6045 = i2;
            if (TextUtils.isEmpty(this.f6047.getNavigationContentDescription())) {
                mo2809(this.f6045);
            }
        }
        this.f6055 = this.f6047.getNavigationContentDescription();
        this.f6047.setNavigationOnClickListener(new ViewOnClickListenerC1215(this));
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void collapseActionView() {
        Toolbar.C0109 c0109 = this.f6047.f601;
        C1197 c1197 = c0109 == null ? null : c0109.f647;
        if (c1197 != null) {
            c1197.collapseActionView();
        }
    }

    @Override // p034.p050.p053.InterfaceC1218
    public Context getContext() {
        return this.f6047.getContext();
    }

    @Override // p034.p050.p053.InterfaceC1218
    public CharSequence getTitle() {
        return this.f6047.getTitle();
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setIcon(int i) {
        this.f6048 = i != 0 ? C1266.m2928(getContext(), i) : null;
        m2835();
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setIcon(Drawable drawable) {
        this.f6048 = drawable;
        m2835();
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setMenu(Menu menu, InterfaceC1186.InterfaceC1187 interfaceC1187) {
        if (this.f6053 == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f6047.getContext());
            this.f6053 = actionMenuPresenter;
            actionMenuPresenter.f5758 = C1268.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f6053;
        actionMenuPresenter2.f5761 = interfaceC1187;
        this.f6047.setMenu((C1164) menu, actionMenuPresenter2);
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setMenuPrepared() {
        this.f6051 = true;
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setTitle(CharSequence charSequence) {
        this.f6040 = true;
        this.f6054 = charSequence;
        if ((this.f6041 & 8) != 0) {
            this.f6047.setTitle(charSequence);
        }
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setVisibility(int i) {
        this.f6047.setVisibility(i);
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setWindowCallback(Window.Callback callback) {
        this.f6049 = callback;
    }

    @Override // p034.p050.p053.InterfaceC1218
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f6040) {
            return;
        }
        this.f6054 = charSequence;
        if ((this.f6041 & 8) != 0) {
            this.f6047.setTitle(charSequence);
        }
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: 〳ぜぞぜべっ */
    public void mo2805(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f6046;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f6047;
            if (parent == toolbar) {
                toolbar.removeView(this.f6046);
            }
        }
        this.f6046 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: 〺つふすそ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2806() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f6047
            androidx.appcompat.widget.ActionMenuView r0 = r0.f600
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.f300
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.ActionMenuPresenter$くし〴〺ぅ r3 = r0.f269
            if (r3 != 0) goto L19
            boolean r0 = r0.m121()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1229.mo2806():boolean");
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m2834() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f6041 & 4) != 0) {
            toolbar = this.f6047;
            drawable = this.f6042;
            if (drawable == null) {
                drawable = this.f6044;
            }
        } else {
            toolbar = this.f6047;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ぁごぐすすぃ */
    public void mo2807(InterfaceC1186.InterfaceC1187 interfaceC1187, C1164.InterfaceC1166 interfaceC1166) {
        this.f6047.setMenuCallbacks(interfaceC1187, interfaceC1166);
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: いいにぽつ */
    public void mo2808(boolean z) {
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ぇぬぎばつ */
    public void mo2809(int i) {
        this.f6055 = i == 0 ? null : getContext().getString(i);
        m2836();
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final void m2835() {
        Drawable drawable;
        int i = this.f6041;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f6050) == null) {
            drawable = this.f6048;
        }
        this.f6047.setLogo(drawable);
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ぉざぅち〻 */
    public int mo2810() {
        return 0;
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: おぐぴう〸ず */
    public void mo2811(int i) {
        this.f6050 = i != 0 ? C1266.m2928(getContext(), i) : null;
        m2835();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: くし〴〺ぅ */
    public boolean mo2812() {
        ActionMenuView actionMenuView = this.f6047.f600;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f300;
        return actionMenuPresenter != null && actionMenuPresenter.m126();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: げつ〴ぬぐ */
    public boolean mo2813() {
        return this.f6047.m227();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ごづごきえ */
    public void mo2814() {
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ざっざへづ */
    public void mo2815(Drawable drawable) {
        this.f6042 = drawable;
        m2834();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ざとぅぼこ〺 */
    public C1104 mo2816(int i, long j) {
        C1104 m2495 = C1096.m2495(this.f6047);
        m2495.m2535(i == 0 ? 1.0f : 0.0f);
        m2495.m2534(j);
        m2495.m2538(new C1230(i));
        return m2495;
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: づざかべべ */
    public boolean mo2817() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f6047;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f600) != null && actionMenuView.f299;
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: てぜきぽく */
    public void mo2818(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f6041 ^ i;
        this.f6041 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2836();
                }
                m2834();
            }
            if ((i2 & 3) != 0) {
                m2835();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f6047.setTitle(this.f6054);
                    toolbar = this.f6047;
                    charSequence = this.f6043;
                } else {
                    charSequence = null;
                    this.f6047.setTitle((CharSequence) null);
                    toolbar = this.f6047;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f6052) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f6047.addView(view);
            } else {
                this.f6047.removeView(view);
            }
        }
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: でどあくず */
    public void mo2819(boolean z) {
        this.f6047.setCollapsible(z);
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: なぎぱいぢぎ */
    public void mo2820() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f6047.f600;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f300) == null) {
            return;
        }
        actionMenuPresenter.m118();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: のぷのちつ */
    public int mo2821() {
        return this.f6041;
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: は〲ぱなで */
    public void mo2822() {
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: びぐびあび */
    public boolean mo2823() {
        return this.f6047.m231();
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final void m2836() {
        if ((this.f6041 & 4) != 0) {
            if (TextUtils.isEmpty(this.f6055)) {
                this.f6047.setNavigationContentDescription(this.f6045);
            } else {
                this.f6047.setNavigationContentDescription(this.f6055);
            }
        }
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: へぬ〴づぞ */
    public Menu mo2824() {
        return this.f6047.getMenu();
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ぺぁあねじ */
    public ViewGroup mo2825() {
        return this.f6047;
    }

    @Override // p034.p050.p053.InterfaceC1218
    /* renamed from: ぺふねづ〺 */
    public boolean mo2826() {
        Toolbar.C0109 c0109 = this.f6047.f601;
        return (c0109 == null || c0109.f647 == null) ? false : true;
    }
}
