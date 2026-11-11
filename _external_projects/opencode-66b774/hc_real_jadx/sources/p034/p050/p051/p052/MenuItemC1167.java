package p034.p050.p051.p052;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p045.AbstractC1069;
import p034.p050.p051.InterfaceC1150;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class MenuItemC1167 extends AbstractC1178 implements MenuItem {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Method f5789;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceMenuItemC1000 f5790;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public class ActionProviderVisibilityListenerC1168 extends C1170 implements ActionProvider.VisibilityListener {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public AbstractC1069.InterfaceC1070 f5791;

        public ActionProviderVisibilityListenerC1168(MenuItemC1167 menuItemC1167, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC1069.InterfaceC1070 interfaceC1070 = this.f5791;
            if (interfaceC1070 != null) {
                C1164 c1164 = C1197.this.f5937;
                c1164.f5765 = true;
                c1164.mo2617(true);
            }
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: 〳ぜぞぜべっ */
        public void mo2408(AbstractC1069.InterfaceC1070 interfaceC1070) {
            this.f5791 = interfaceC1070;
            this.f5793.setVisibilityListener(this);
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: 〺つふすそ */
        public boolean mo2409() {
            return this.f5793.isVisible();
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: ぁごぐすすぃ */
        public boolean mo2410() {
            return this.f5793.overridesItemVisibility();
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: びぐびあび */
        public View mo2415(MenuItem menuItem) {
            return this.f5793.onCreateActionView(menuItem);
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1169 extends FrameLayout implements InterfaceC1150 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final CollapsibleActionView f5792;

        /* JADX WARN: Multi-variable type inference failed */
        public C1169(View view) {
            super(view.getContext());
            this.f5792 = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p034.p050.p051.InterfaceC1150
        /* renamed from: くし〴〺ぅ */
        public void mo196() {
            this.f5792.onActionViewExpanded();
        }

        @Override // p034.p050.p051.InterfaceC1150
        /* renamed from: づざかべべ */
        public void mo202() {
            this.f5792.onActionViewCollapsed();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1170 extends AbstractC1069 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ActionProvider f5793;

        public C1170(Context context, ActionProvider actionProvider) {
            super(context);
            this.f5793 = actionProvider;
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: くし〴〺ぅ */
        public View mo2411() {
            return this.f5793.onCreateActionView();
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2412() {
            return this.f5793.hasSubMenu();
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: づざかべべ */
        public boolean mo2413() {
            return this.f5793.onPerformDefaultAction();
        }

        @Override // p034.p035.p045.AbstractC1069
        /* renamed from: なぎぱいぢぎ */
        public void mo2414(SubMenu subMenu) {
            this.f5793.onPrepareSubMenu(MenuItemC1167.this.m2647(subMenu));
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ$づざかべべ, reason: contains not printable characters */
    public class MenuItemOnMenuItemClickListenerC1171 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final MenuItem.OnMenuItemClickListener f5796;

        public MenuItemOnMenuItemClickListenerC1171(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5796 = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5796.onMenuItemClick(MenuItemC1167.this.m2646(menuItem));
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.いいにぽつ$びぐびあび, reason: contains not printable characters */
    public class MenuItemOnActionExpandListenerC1172 implements MenuItem.OnActionExpandListener {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final MenuItem.OnActionExpandListener f5798;

        public MenuItemOnActionExpandListenerC1172(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5798 = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5798.onMenuItemActionCollapse(MenuItemC1167.this.m2646(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5798.onMenuItemActionExpand(MenuItemC1167.this.m2646(menuItem));
        }
    }

    public MenuItemC1167(Context context, InterfaceMenuItemC1000 interfaceMenuItemC1000) {
        super(context);
        if (interfaceMenuItemC1000 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f5790 = interfaceMenuItemC1000;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f5790.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f5790.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1069 mo2327 = this.f5790.mo2327();
        if (mo2327 instanceof C1170) {
            return ((C1170) mo2327).f5793;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f5790.getActionView();
        return actionView instanceof C1169 ? (View) ((C1169) actionView).f5792 : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5790.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5790.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5790.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5790.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5790.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5790.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5790.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5790.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5790.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5790.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5790.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5790.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5790.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m2647(this.f5790.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5790.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f5790.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5790.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5790.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5790.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f5790.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f5790.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f5790.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f5790.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC1069 actionProviderVisibilityListenerC1168 = Build.VERSION.SDK_INT >= 16 ? new ActionProviderVisibilityListenerC1168(this, this.f5825, actionProvider) : new C1170(this.f5825, actionProvider);
        InterfaceMenuItemC1000 interfaceMenuItemC1000 = this.f5790;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC1168 = null;
        }
        interfaceMenuItemC1000.mo2328(actionProviderVisibilityListenerC1168);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f5790.setActionView(i);
        View actionView = this.f5790.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f5790.setActionView(new C1169(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1169(view);
        }
        this.f5790.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f5790.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5790.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f5790.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f5790.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5790.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f5790.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f5790.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5790.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5790.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5790.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5790.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f5790.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f5790.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5790.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC1172(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5790.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC1171(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f5790.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5790.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f5790.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f5790.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f5790.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5790.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5790.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5790.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f5790.setVisible(z);
    }
}
