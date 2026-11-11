package p034.p050.p051.p052;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p036.p037.InterfaceSubMenuC1001;
import p034.p080.C1493;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1178 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1493<InterfaceMenuItemC1000, MenuItem> f5823;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1493<InterfaceSubMenuC1001, SubMenu> f5824;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f5825;

    public AbstractC1178(Context context) {
        this.f5825 = context;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final MenuItem m2646(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1000)) {
            return menuItem;
        }
        InterfaceMenuItemC1000 interfaceMenuItemC1000 = (InterfaceMenuItemC1000) menuItem;
        if (this.f5823 == null) {
            this.f5823 = new C1493<>();
        }
        MenuItem orDefault = this.f5823.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemC1167 menuItemC1167 = new MenuItemC1167(this.f5825, interfaceMenuItemC1000);
        this.f5823.put(interfaceMenuItemC1000, menuItemC1167);
        return menuItemC1167;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final SubMenu m2647(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC1001)) {
            return subMenu;
        }
        InterfaceSubMenuC1001 interfaceSubMenuC1001 = (InterfaceSubMenuC1001) subMenu;
        if (this.f5824 == null) {
            this.f5824 = new C1493<>();
        }
        SubMenu subMenu2 = this.f5824.get(interfaceSubMenuC1001);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC1188 subMenuC1188 = new SubMenuC1188(this.f5825, interfaceSubMenuC1001);
        this.f5824.put(interfaceSubMenuC1001, subMenuC1188);
        return subMenuC1188;
    }
}
