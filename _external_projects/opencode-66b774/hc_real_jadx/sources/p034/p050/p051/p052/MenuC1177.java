package p034.p050.p051.p052;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p034.p035.p036.p037.InterfaceMenuC1002;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p036.p037.InterfaceSubMenuC1001;
import p034.p080.C1493;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class MenuC1177 extends AbstractC1178 implements Menu {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceMenuC1002 f5822;

    public MenuC1177(Context context, InterfaceMenuC1002 interfaceMenuC1002) {
        super(context);
        if (interfaceMenuC1002 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f5822 = interfaceMenuC1002;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m2646(this.f5822.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m2646(this.f5822.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m2646(this.f5822.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m2646(this.f5822.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f5822.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m2646(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m2647(this.f5822.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m2647(this.f5822.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m2647(this.f5822.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m2647(this.f5822.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        C1493<InterfaceMenuItemC1000, MenuItem> c1493 = this.f5823;
        if (c1493 != null) {
            c1493.clear();
        }
        C1493<InterfaceSubMenuC1001, SubMenu> c14932 = this.f5824;
        if (c14932 != null) {
            c14932.clear();
        }
        this.f5822.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f5822.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m2646(this.f5822.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m2646(this.f5822.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f5822.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f5822.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f5822.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f5822.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f5823 != null) {
            int i2 = 0;
            while (true) {
                C1493<InterfaceMenuItemC1000, MenuItem> c1493 = this.f5823;
                if (i2 >= c1493.f6910) {
                    break;
                }
                if (c1493.m3246(i2).getGroupId() == i) {
                    this.f5823.m3254(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f5822.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f5823 != null) {
            int i2 = 0;
            while (true) {
                C1493<InterfaceMenuItemC1000, MenuItem> c1493 = this.f5823;
                if (i2 >= c1493.f6910) {
                    break;
                }
                if (c1493.m3246(i2).getItemId() == i) {
                    this.f5823.m3254(i2);
                    break;
                }
                i2++;
            }
        }
        this.f5822.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f5822.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f5822.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f5822.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5822.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5822.size();
    }
}
