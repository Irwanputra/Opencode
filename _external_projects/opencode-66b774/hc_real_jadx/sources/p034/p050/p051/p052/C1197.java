package p034.p050.p051.p052;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p045.AbstractC1069;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1197 implements InterfaceMenuItemC1000 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public char f5910;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f5911;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Intent f5913;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public char f5914;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public ContextMenu.ContextMenuInfo f5915;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public View f5916;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f5917;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f5918;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public CharSequence f5919;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public SubMenuC1180 f5920;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f5921;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f5922;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public CharSequence f5925;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public CharSequence f5926;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable f5927;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public CharSequence f5930;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f5931;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public AbstractC1069 f5934;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f5935;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C1164 f5937;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f5938 = NotificationCompat.FLAG_BUBBLE;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f5939 = NotificationCompat.FLAG_BUBBLE;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f5932 = 0;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ColorStateList f5933 = null;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public PorterDuff.Mode f5923 = null;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f5924 = false;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f5928 = false;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f5936 = false;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f5912 = 16;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f5929 = false;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぺぁあねじ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1198 implements AbstractC1069.InterfaceC1070 {
        public C1198() {
        }
    }

    public C1197(C1164 c1164, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f5918 = 0;
        this.f5937 = c1164;
        this.f5922 = i2;
        this.f5911 = i;
        this.f5921 = i3;
        this.f5935 = i4;
        this.f5926 = charSequence;
        this.f5918 = i5;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m2661(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f5918 & 8) == 0) {
            return false;
        }
        if (this.f5916 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5931;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5937.mo2633(this);
        }
        return false;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean expandActionView() {
        if (!m2667()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5931;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5937.mo2628(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public View getActionView() {
        View view = this.f5916;
        if (view != null) {
            return view;
        }
        AbstractC1069 abstractC1069 = this.f5934;
        if (abstractC1069 == null) {
            return null;
        }
        View mo2415 = abstractC1069.mo2415(this);
        this.f5916 = mo2415;
        return mo2415;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5939;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5914;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5919;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5911;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f5927;
        if (drawable != null) {
            return m2669(drawable);
        }
        int i = this.f5932;
        if (i == 0) {
            return null;
        }
        Drawable m2928 = C1266.m2928(this.f5937.f5774, i);
        this.f5932 = 0;
        this.f5927 = m2928;
        return m2669(m2928);
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5933;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5923;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5913;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f5922;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5915;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5938;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5910;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5921;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f5920;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f5926;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5930;
        if (charSequence == null) {
            charSequence = this.f5926;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5925;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5920 != null;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5929;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f5912 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f5912 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f5912 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1069 abstractC1069 = this.f5934;
        return (abstractC1069 == null || !abstractC1069.mo2410()) ? (this.f5912 & 8) == 0 : (this.f5912 & 8) == 0 && this.f5934.mo2409();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f5937.f5774;
        m2671(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m2671(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f5914 == c) {
            return this;
        }
        this.f5914 = Character.toLowerCase(c);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f5914 == c && this.f5939 == i) {
            return this;
        }
        this.f5914 = Character.toLowerCase(c);
        this.f5939 = KeyEvent.normalizeMetaState(i);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f5912;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f5912 = i2;
        if (i != i2) {
            this.f5937.mo2617(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f5912 & 4) != 0) {
            C1164 c1164 = this.f5937;
            c1164.getClass();
            int groupId = getGroupId();
            int size = c1164.f5781.size();
            c1164.m2627();
            for (int i = 0; i < size; i++) {
                C1197 c1197 = c1164.f5781.get(i);
                if (c1197.f5911 == groupId && c1197.m2662() && c1197.isCheckable()) {
                    c1197.m2664(c1197 == this);
                }
            }
            c1164.m2629();
        } else {
            m2664(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5919 = charSequence;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public InterfaceMenuItemC1000 setContentDescription(CharSequence charSequence) {
        this.f5919 = charSequence;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f5912 = z ? this.f5912 | 16 : this.f5912 & (-17);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f5927 = null;
        this.f5932 = i;
        this.f5936 = true;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5932 = 0;
        this.f5927 = drawable;
        this.f5936 = true;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5933 = colorStateList;
        this.f5924 = true;
        this.f5936 = true;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5923 = mode;
        this.f5928 = true;
        this.f5936 = true;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5913 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f5910 == c) {
            return this;
        }
        this.f5910 = c;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f5910 == c && this.f5938 == i) {
            return this;
        }
        this.f5910 = c;
        this.f5938 = KeyEvent.normalizeMetaState(i);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5931 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5917 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f5910 = c;
        this.f5914 = Character.toLowerCase(c2);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5910 = c;
        this.f5938 = KeyEvent.normalizeMetaState(i);
        this.f5914 = Character.toLowerCase(c2);
        this.f5939 = KeyEvent.normalizeMetaState(i2);
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5918 = i;
        this.f5937.m2615();
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f5937.f5774.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5926 = charSequence;
        this.f5937.mo2617(false);
        SubMenuC1180 subMenuC1180 = this.f5920;
        if (subMenuC1180 != null) {
            subMenuC1180.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5930 = charSequence;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5925 = charSequence;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000, android.view.MenuItem
    public InterfaceMenuItemC1000 setTooltipText(CharSequence charSequence) {
        this.f5925 = charSequence;
        this.f5937.mo2617(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m2668(z)) {
            C1164 c1164 = this.f5937;
            c1164.f5765 = true;
            c1164.mo2617(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f5926;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m2662() {
        return (this.f5912 & 4) != 0;
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000
    /* renamed from: 〺つふすそ */
    public AbstractC1069 mo2327() {
        return this.f5934;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m2663() {
        return (this.f5912 & 32) == 32;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m2664(boolean z) {
        int i = this.f5912;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f5912 = i2;
        if (i != i2) {
            this.f5937.mo2617(false);
        }
    }

    @Override // p034.p035.p036.p037.InterfaceMenuItemC1000
    /* renamed from: げつ〴ぬぐ */
    public InterfaceMenuItemC1000 mo2328(AbstractC1069 abstractC1069) {
        AbstractC1069 abstractC10692 = this.f5934;
        if (abstractC10692 != null) {
            abstractC10692.f5529 = null;
            abstractC10692.f5530 = null;
        }
        this.f5916 = null;
        this.f5934 = abstractC1069;
        this.f5937.mo2617(true);
        AbstractC1069 abstractC10693 = this.f5934;
        if (abstractC10693 != null) {
            abstractC10693.mo2408(new C1198());
        }
        return this;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public char m2665() {
        return this.f5937.mo2635() ? this.f5914 : this.f5910;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m2666(boolean z) {
        this.f5912 = z ? this.f5912 | 32 : this.f5912 & (-33);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean m2667() {
        AbstractC1069 abstractC1069;
        if ((this.f5918 & 8) == 0) {
            return false;
        }
        if (this.f5916 == null && (abstractC1069 = this.f5934) != null) {
            this.f5916 = abstractC1069.mo2415(this);
        }
        return this.f5916 != null;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean m2668(boolean z) {
        int i = this.f5912;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f5912 = i2;
        return i != i2;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Drawable m2669(Drawable drawable) {
        if (drawable != null && this.f5936 && (this.f5924 || this.f5928)) {
            drawable = C2786.m4758(drawable).mutate();
            if (this.f5924) {
                C2786.m4788(drawable, this.f5933);
            }
            if (this.f5928) {
                C2786.m4802(drawable, this.f5923);
            }
            this.f5936 = false;
        }
        return drawable;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m2670() {
        return this.f5937.mo2618() && m2665() != 0;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceMenuItemC1000 m2671(View view) {
        int i;
        this.f5916 = view;
        this.f5934 = null;
        if (view != null && view.getId() == -1 && (i = this.f5922) > 0) {
            view.setId(i);
        }
        this.f5937.m2615();
        return this;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m2672(boolean z) {
        this.f5912 = (z ? 4 : 0) | (this.f5912 & (-5));
    }
}
