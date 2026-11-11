package p034.p050.p051.p052;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.app.NotificationCompat;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p043.C1067;
import p034.p035.p045.AbstractC1069;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1179 implements InterfaceMenuItemC1000 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Drawable f5826;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public CharSequence f5827;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public CharSequence f5829;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Intent f5832;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public CharSequence f5833;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public char f5836;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public char f5838;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Context f5840;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f5841;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f5834 = NotificationCompat.FLAG_BUBBLE;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f5828 = NotificationCompat.FLAG_BUBBLE;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ColorStateList f5835 = null;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public PorterDuff.Mode f5837 = null;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f5839 = false;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f5831 = false;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f5830 = 16;

    public C1179(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f5840 = context;
        this.f5833 = charSequence;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5828;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5836;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5829;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5826;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5835;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5837;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5832;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5834;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5838;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5833;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5827;
        return charSequence != null ? charSequence : this.f5833;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5841;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f5830 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f5830 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f5830 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f5830 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f5836 = Character.toLowerCase(c);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f5836 = Character.toLowerCase(c);
        this.f5828 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f5830 = (z ? 1 : 0) | (this.f5830 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f5830 = (z ? 2 : 0) | (this.f5830 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5829 = charSequence;
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public InterfaceMenuItemC1000 setContentDescription(CharSequence charSequence) {
        this.f5829 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f5830 = (z ? 16 : 0) | (this.f5830 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f5826 = C1067.m2406(this.f5840, i);
        m2648();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5826 = drawable;
        m2648();
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5835 = colorStateList;
        this.f5839 = true;
        m2648();
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5837 = mode;
        this.f5831 = true;
        m2648();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5832 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f5838 = c;
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f5838 = c;
        this.f5834 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f5838 = c;
        this.f5836 = Character.toLowerCase(c2);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5838 = c;
        this.f5834 = KeyEvent.normalizeMetaState(i);
        this.f5836 = Character.toLowerCase(c2);
        this.f5828 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f5833 = this.f5840.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5833 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5827 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5841 = charSequence;
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public InterfaceMenuItemC1000 setTooltipText(CharSequence charSequence) {
        this.f5841 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f5830 = (this.f5830 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000
    /* renamed from: 〺つふすそ */
    public AbstractC1069 mo2327() {
        return null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2648() {
        Drawable drawable = this.f5826;
        if (drawable != null) {
            if (this.f5839 || this.f5831) {
                Drawable m4758 = C2786.m4758(drawable);
                this.f5826 = m4758;
                Drawable mutate = m4758.mutate();
                this.f5826 = mutate;
                if (this.f5839) {
                    C2786.m4788(mutate, this.f5835);
                }
                if (this.f5831) {
                    C2786.m4802(this.f5826, this.f5837);
                }
            }
        }
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000
    /* renamed from: げつ〴ぬぐ */
    public InterfaceMenuItemC1000 mo2328(AbstractC1069 abstractC1069) {
        throw new UnsupportedOperationException();
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
