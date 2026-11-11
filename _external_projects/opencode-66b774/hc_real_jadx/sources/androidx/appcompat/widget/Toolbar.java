package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.p051.C1158;
import p034.p050.p051.InterfaceC1150;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.SubMenuC1180;
import p034.p050.p053.C1203;
import p034.p050.p053.C1229;
import p034.p050.p053.C1260;
import p034.p050.p053.InterfaceC1218;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public CharSequence f599;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ActionMenuView f600;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public C0109 f601;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f602;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f603;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final Runnable f604;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public View f605;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f606;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public CharSequence f607;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f608;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f609;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public CharSequence f610;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f611;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final int[] f612;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public ActionMenuPresenter f613;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f614;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public TextView f615;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public C1229 f616;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public C1164.InterfaceC1166 f617;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f618;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public C1203 f619;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f620;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final ArrayList<View> f621;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public InterfaceC0108 f622;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ImageButton f623;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f624;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f625;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f626;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public boolean f627;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ImageView f628;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public ColorStateList f629;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f630;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f631;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ColorStateList f632;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public TextView f633;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f634;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final ActionMenuView.InterfaceC0060 f635;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f636;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ImageButton f637;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final ArrayList<View> f638;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Context f639;

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f640;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f640 = 0;
            this.f113 = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f640 = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f640 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f640 = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f640 = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f640 = 0;
            this.f640 = layoutParams.f640;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0104();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f641;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f642;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0104 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f642 = parcel.readInt();
            this.f641 = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f642);
            parcel.writeInt(this.f641 ? 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0105 implements Runnable {
        public RunnableC0105() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m231();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$くし〴〺ぅ, reason: contains not printable characters */
    public class ViewOnClickListenerC0106 implements View.OnClickListener {
        public ViewOnClickListenerC0106() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0109 c0109 = Toolbar.this.f601;
            C1197 c1197 = c0109 == null ? null : c0109.f647;
            if (c1197 != null) {
                c1197.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0107 implements ActionMenuView.InterfaceC0060 {
        public C0107() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC0108 {
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$びぐびあび, reason: contains not printable characters */
    public class C0109 implements InterfaceC1186 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1164 f646;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1197 f647;

        public C0109() {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        public int getId() {
            return 0;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: 〳ぜぞぜべっ */
        public boolean mo117() {
            return false;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: ぁごぐすすぃ */
        public void mo119(boolean z) {
            if (this.f647 != null) {
                C1164 c1164 = this.f646;
                boolean z2 = false;
                if (c1164 != null) {
                    int size = c1164.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f646.getItem(i) == this.f647) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo242(this.f646, this.f647);
            }
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean mo242(C1164 c1164, C1197 c1197) {
            KeyEvent.Callback callback = Toolbar.this.f605;
            if (callback instanceof InterfaceC1150) {
                ((InterfaceC1150) callback).mo202();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f605);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f637);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f605 = null;
            int size = toolbar3.f638.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f638.clear();
                    this.f647 = null;
                    Toolbar.this.requestLayout();
                    c1197.f5929 = false;
                    c1197.f5937.mo2617(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f638.get(size));
            }
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: くし〴〺ぅ */
        public void mo122(Context context, C1164 c1164) {
            C1197 c1197;
            C1164 c11642 = this.f646;
            if (c11642 != null && (c1197 = this.f647) != null) {
                c11642.mo2633(c1197);
            }
            this.f646 = c1164;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: げつ〴ぬぐ */
        public void mo123(C1164 c1164, boolean z) {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: づざかべべ */
        public boolean mo124(SubMenuC1180 subMenuC1180) {
            return false;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: びぐびあび */
        public void mo127(Parcelable parcelable) {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: ぺぁあねじ */
        public Parcelable mo129() {
            return null;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186
        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public boolean mo243(C1164 c1164, C1197 c1197) {
            Toolbar.this.m228();
            ViewParent parent = Toolbar.this.f637.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f637);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f637);
            }
            Toolbar.this.f605 = c1197.getActionView();
            this.f647 = c1197;
            ViewParent parent2 = Toolbar.this.f605.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f605);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f113 = 8388611 | (toolbar4.f614 & 112);
                generateDefaultLayoutParams.f640 = 2;
                toolbar4.f605.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f605);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).f640 != 2 && childAt != toolbar6.f600) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f638.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            c1197.f5929 = true;
            c1197.f5937.mo2617(false);
            KeyEvent.Callback callback = Toolbar.this.f605;
            if (callback instanceof InterfaceC1150) {
                ((InterfaceC1150) callback).mo196();
            }
            return true;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f602 = 8388627;
        this.f621 = new ArrayList<>();
        this.f638 = new ArrayList<>();
        this.f612 = new int[2];
        this.f635 = new C0107();
        this.f604 = new RunnableC0105();
        Context context2 = getContext();
        int[] iArr = C1148.Toolbar;
        C1260 m2910 = C1260.m2910(context2, attributeSet, iArr, i, 0);
        C1096.m2493(this, context, iArr, attributeSet, m2910.f6162, i, 0);
        this.f630 = m2910.m2922(C1148.Toolbar_titleTextAppearance, 0);
        this.f636 = m2910.m2922(C1148.Toolbar_subtitleTextAppearance, 0);
        this.f602 = m2910.m2926(C1148.Toolbar_android_gravity, this.f602);
        this.f614 = m2910.m2926(C1148.Toolbar_buttonGravity, 48);
        int m2919 = m2910.m2919(C1148.Toolbar_titleMargin, 0);
        int i2 = C1148.Toolbar_titleMargins;
        m2919 = m2910.m2915(i2) ? m2910.m2919(i2, m2919) : m2919;
        this.f618 = m2919;
        this.f631 = m2919;
        this.f620 = m2919;
        this.f611 = m2919;
        int m29192 = m2910.m2919(C1148.Toolbar_titleMarginStart, -1);
        if (m29192 >= 0) {
            this.f611 = m29192;
        }
        int m29193 = m2910.m2919(C1148.Toolbar_titleMarginEnd, -1);
        if (m29193 >= 0) {
            this.f620 = m29193;
        }
        int m29194 = m2910.m2919(C1148.Toolbar_titleMarginTop, -1);
        if (m29194 >= 0) {
            this.f631 = m29194;
        }
        int m29195 = m2910.m2919(C1148.Toolbar_titleMarginBottom, -1);
        if (m29195 >= 0) {
            this.f618 = m29195;
        }
        this.f609 = m2910.m2921(C1148.Toolbar_maxButtonHeight, -1);
        int m29196 = m2910.m2919(C1148.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m29197 = m2910.m2919(C1148.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m2921 = m2910.m2921(C1148.Toolbar_contentInsetLeft, 0);
        int m29212 = m2910.m2921(C1148.Toolbar_contentInsetRight, 0);
        m238();
        C1203 c1203 = this.f619;
        c1203.f5947 = false;
        if (m2921 != Integer.MIN_VALUE) {
            c1203.f5952 = m2921;
            c1203.f5951 = m2921;
        }
        if (m29212 != Integer.MIN_VALUE) {
            c1203.f5953 = m29212;
            c1203.f5948 = m29212;
        }
        if (m29196 != Integer.MIN_VALUE || m29197 != Integer.MIN_VALUE) {
            c1203.m2677(m29196, m29197);
        }
        this.f625 = m2910.m2919(C1148.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f634 = m2910.m2919(C1148.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f603 = m2910.m2913(C1148.Toolbar_collapseIcon);
        this.f599 = m2910.m2916(C1148.Toolbar_collapseContentDescription);
        CharSequence m2916 = m2910.m2916(C1148.Toolbar_title);
        if (!TextUtils.isEmpty(m2916)) {
            setTitle(m2916);
        }
        CharSequence m29162 = m2910.m2916(C1148.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m29162)) {
            setSubtitle(m29162);
        }
        this.f639 = getContext();
        setPopupTheme(m2910.m2922(C1148.Toolbar_popupTheme, 0));
        Drawable m2913 = m2910.m2913(C1148.Toolbar_navigationIcon);
        if (m2913 != null) {
            setNavigationIcon(m2913);
        }
        CharSequence m29163 = m2910.m2916(C1148.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m29163)) {
            setNavigationContentDescription(m29163);
        }
        Drawable m29132 = m2910.m2913(C1148.Toolbar_logo);
        if (m29132 != null) {
            setLogo(m29132);
        }
        CharSequence m29164 = m2910.m2916(C1148.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m29164)) {
            setLogoDescription(m29164);
        }
        int i3 = C1148.Toolbar_titleTextColor;
        if (m2910.m2915(i3)) {
            setTitleTextColor(m2910.m2917(i3));
        }
        int i4 = C1148.Toolbar_subtitleTextColor;
        if (m2910.m2915(i4)) {
            setSubtitleTextColor(m2910.m2917(i4));
        }
        int i5 = C1148.Toolbar_menu;
        if (m2910.m2915(i5)) {
            getMenuInflater().inflate(m2910.m2922(i5, 0), getMenu());
        }
        m2910.f6162.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C1158(getContext());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f637;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f637;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1203 c1203 = this.f619;
        if (c1203 != null) {
            return c1203.f5949 ? c1203.f5951 : c1203.f5948;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f634;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1203 c1203 = this.f619;
        if (c1203 != null) {
            return c1203.f5951;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1203 c1203 = this.f619;
        if (c1203 != null) {
            return c1203.f5948;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1203 c1203 = this.f619;
        if (c1203 != null) {
            return c1203.f5949 ? c1203.f5948 : c1203.f5951;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f625;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C1164 c1164;
        ActionMenuView actionMenuView = this.f600;
        return actionMenuView != null && (c1164 = actionMenuView.f298) != null && c1164.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f634, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C1096.m2491(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C1096.m2491(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f625, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f628;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f628;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m233();
        return this.f600.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f623;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f623;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f613;
    }

    public Drawable getOverflowIcon() {
        m233();
        return this.f600.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f639;
    }

    public int getPopupTheme() {
        return this.f624;
    }

    public CharSequence getSubtitle() {
        return this.f607;
    }

    public final TextView getSubtitleTextView() {
        return this.f633;
    }

    public CharSequence getTitle() {
        return this.f610;
    }

    public int getTitleMarginBottom() {
        return this.f618;
    }

    public int getTitleMarginEnd() {
        return this.f620;
    }

    public int getTitleMarginStart() {
        return this.f611;
    }

    public int getTitleMarginTop() {
        return this.f631;
    }

    public final TextView getTitleTextView() {
        return this.f615;
    }

    public InterfaceC1218 getWrapper() {
        if (this.f616 == null) {
            this.f616 = new C1229(this, true);
        }
        return this.f616;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f604);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f606 = false;
        }
        if (!this.f606) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f606 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f606 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0295 A[LOOP:0: B:45:0x0293->B:46:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b7 A[LOOP:1: B:49:0x02b5->B:50:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02dc A[LOOP:2: B:53:0x02da->B:54:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x032e A[LOOP:3: B:62:0x032c->B:63:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0296  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        ActionMenuView actionMenuView = this.f600;
        C1164 c1164 = actionMenuView != null ? actionMenuView.f298 : null;
        int i = savedState.f642;
        if (i != 0 && this.f601 != null && c1164 != null && (findItem = c1164.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f641) {
            removeCallbacks(this.f604);
            post(this.f604);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L9
            super.onRtlPropertiesChanged(r3)
        L9:
            r2.m238()
            づざかべべ.〺つふすそ.ぉざぅち〻.〻ぞまぎな〻 r0 = r2.f619
            r1 = 1
            if (r3 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            boolean r3 = r0.f5949
            if (r1 != r3) goto L18
            goto L46
        L18:
            r0.f5949 = r1
            boolean r3 = r0.f5947
            if (r3 == 0) goto L3e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L30
            int r1 = r0.f5954
            if (r1 == r3) goto L27
            goto L29
        L27:
            int r1 = r0.f5952
        L29:
            r0.f5951 = r1
            int r1 = r0.f5950
            if (r1 == r3) goto L42
            goto L44
        L30:
            int r1 = r0.f5950
            if (r1 == r3) goto L35
            goto L37
        L35:
            int r1 = r0.f5952
        L37:
            r0.f5951 = r1
            int r1 = r0.f5954
            if (r1 == r3) goto L42
            goto L44
        L3e:
            int r3 = r0.f5952
            r0.f5951 = r3
        L42:
            int r1 = r0.f5953
        L44:
            r0.f5948 = r1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1197 c1197;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0109 c0109 = this.f601;
        if (c0109 != null && (c1197 = c0109.f647) != null) {
            savedState.f642 = c1197.f5922;
        }
        savedState.f641 = m227();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f626 = false;
        }
        if (!this.f626) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f626 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f626 = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m228();
        }
        ImageButton imageButton = this.f637;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1266.m2928(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m228();
            this.f637.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f637;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f603);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f627 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f634) {
            this.f634 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f625) {
            this.f625 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m238();
        C1203 c1203 = this.f619;
        c1203.f5947 = false;
        if (i != Integer.MIN_VALUE) {
            c1203.f5952 = i;
            c1203.f5951 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            c1203.f5953 = i2;
            c1203.f5948 = i2;
        }
    }

    public void setContentInsetsRelative(int i, int i2) {
        m238();
        this.f619.m2677(i, i2);
    }

    public void setLogo(int i) {
        setLogo(C1266.m2928(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f628 == null) {
                this.f628 = new AppCompatImageView(getContext());
            }
            if (!m239(this.f628)) {
                m222(this.f628, true);
            }
        } else {
            ImageView imageView = this.f628;
            if (imageView != null && m239(imageView)) {
                removeView(this.f628);
                this.f638.remove(this.f628);
            }
        }
        ImageView imageView2 = this.f628;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f628 == null) {
            this.f628 = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.f628;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(C1164 c1164, ActionMenuPresenter actionMenuPresenter) {
        C1197 c1197;
        if (c1164 == null && this.f600 == null) {
            return;
        }
        m235();
        C1164 c11642 = this.f600.f298;
        if (c11642 == c1164) {
            return;
        }
        if (c11642 != null) {
            c11642.m2622(this.f613);
            c11642.m2622(this.f601);
        }
        if (this.f601 == null) {
            this.f601 = new C0109();
        }
        actionMenuPresenter.f281 = true;
        if (c1164 != null) {
            c1164.m2610(actionMenuPresenter, this.f639);
            c1164.m2610(this.f601, this.f639);
        } else {
            actionMenuPresenter.mo122(this.f639, null);
            C0109 c0109 = this.f601;
            C1164 c11643 = c0109.f646;
            if (c11643 != null && (c1197 = c0109.f647) != null) {
                c11643.mo2633(c1197);
            }
            c0109.f646 = null;
            actionMenuPresenter.mo119(true);
            this.f601.mo119(true);
        }
        this.f600.setPopupTheme(this.f624);
        this.f600.setPresenter(actionMenuPresenter);
        this.f613 = actionMenuPresenter;
    }

    public void setMenuCallbacks(InterfaceC1186.InterfaceC1187 interfaceC1187, C1164.InterfaceC1166 interfaceC1166) {
        this.f608 = interfaceC1187;
        this.f617 = interfaceC1166;
        ActionMenuView actionMenuView = this.f600;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(interfaceC1187, interfaceC1166);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m223();
        }
        ImageButton imageButton = this.f623;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1266.m2928(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m223();
            if (!m239(this.f623)) {
                m222(this.f623, true);
            }
        } else {
            ImageButton imageButton = this.f623;
            if (imageButton != null && m239(imageButton)) {
                removeView(this.f623);
                this.f638.remove(this.f623);
            }
        }
        ImageButton imageButton2 = this.f623;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m223();
        this.f623.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0108 interfaceC0108) {
        this.f622 = interfaceC0108;
    }

    public void setOverflowIcon(Drawable drawable) {
        m233();
        this.f600.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f624 != i) {
            this.f624 = i;
            if (i == 0) {
                this.f639 = getContext();
            } else {
                this.f639 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f633;
            if (textView != null && m239(textView)) {
                removeView(this.f633);
                this.f638.remove(this.f633);
            }
        } else {
            if (this.f633 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f633 = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f633.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f636;
                if (i != 0) {
                    this.f633.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f629;
                if (colorStateList != null) {
                    this.f633.setTextColor(colorStateList);
                }
            }
            if (!m239(this.f633)) {
                m222(this.f633, true);
            }
        }
        TextView textView2 = this.f633;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f607 = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f636 = i;
        TextView textView = this.f633;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f629 = colorStateList;
        TextView textView = this.f633;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f615;
            if (textView != null && m239(textView)) {
                removeView(this.f615);
                this.f638.remove(this.f615);
            }
        } else {
            if (this.f615 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f615 = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f615.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f630;
                if (i != 0) {
                    this.f615.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f632;
                if (colorStateList != null) {
                    this.f615.setTextColor(colorStateList);
                }
            }
            if (!m239(this.f615)) {
                m222(this.f615, true);
            }
        }
        TextView textView2 = this.f615;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f610 = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f611 = i;
        this.f631 = i2;
        this.f620 = i3;
        this.f618 = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f618 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f620 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f611 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f631 = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f630 = i;
        TextView textView = this.f615;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f632 = colorStateList;
        TextView textView = this.f615;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m222(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.f640 = 1;
        if (!z || this.f605 == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f638.add(view);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m223() {
        if (this.f623 == null) {
            this.f623 = new AppCompatImageButton(getContext(), null, C1264.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f113 = 8388611 | (this.f614 & 112);
            this.f623.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int m224(int i) {
        int m2491 = C1096.m2491(this);
        int m4775 = C2786.m4775(i, m2491) & 7;
        return (m4775 == 1 || m4775 == 3 || m4775 == 5) ? m4775 : m2491 == 1 ? 5 : 3;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final int m225(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m241 = m241(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m241, max + measuredWidth, view.getMeasuredHeight() + m241);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final int m226(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m241 = m241(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m241, max, view.getMeasuredHeight() + m241);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m227() {
        ActionMenuView actionMenuView = this.f600;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f300;
            if (actionMenuPresenter != null && actionMenuPresenter.m121()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m228() {
        if (this.f637 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C1264.toolbarNavigationButtonStyle);
            this.f637 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f603);
            this.f637.setContentDescription(this.f599);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f113 = 8388611 | (this.f614 & 112);
            generateDefaultLayoutParams.f640 = 2;
            this.f637.setLayoutParams(generateDefaultLayoutParams);
            this.f637.setOnClickListener(new ViewOnClickListenerC0106());
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m229(List<View> list, int i) {
        boolean z = C1096.m2491(this) == 1;
        int childCount = getChildCount();
        int m4775 = C2786.m4775(i, C1096.m2491(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f640 == 0 && m230(childAt) && m224(layoutParams.f113) == m4775) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f640 == 0 && m230(childAt2) && m224(layoutParams2.f113) == m4775) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final boolean m230(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean m231() {
        ActionMenuView actionMenuView = this.f600;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f300;
            if (actionMenuPresenter != null && actionMenuPresenter.m120()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final int m232(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m233() {
        m235();
        ActionMenuView actionMenuView = this.f600;
        if (actionMenuView.f298 == null) {
            C1164 c1164 = (C1164) actionMenuView.getMenu();
            if (this.f601 == null) {
                this.f601 = new C0109();
            }
            this.f600.setExpandedActionViewsExclusive(true);
            c1164.m2610(this.f601, this.f639);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final int m234(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C2786.m4794(marginLayoutParams) + C2786.m4785(marginLayoutParams);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m235() {
        if (this.f600 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f600 = actionMenuView;
            actionMenuView.setPopupTheme(this.f624);
            this.f600.setOnMenuItemClickListener(this.f635);
            this.f600.setMenuCallbacks(this.f608, this.f617);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f113 = 8388613 | (this.f614 & 112);
            this.f600.setLayoutParams(generateDefaultLayoutParams);
            m222(this.f600, false);
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final int m236(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final void m237(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m238() {
        if (this.f619 == null) {
            this.f619 = new C1203();
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final boolean m239(View view) {
        return view.getParent() == this || this.f638.contains(view);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ぺぁあねじ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final int m241(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f113 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f602 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }
}
