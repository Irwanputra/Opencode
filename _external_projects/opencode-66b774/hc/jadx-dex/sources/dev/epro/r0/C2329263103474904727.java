package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class C2329263103474904727 extends dev.epro.r0.R4239627874707364917 implements android.view.Menu {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.T8605657386197958581 f185o;

    public C2329263103474904727(android.content.Context context, dev.epro.r0.T8605657386197958581 t8605657386197958581) {
        super(context);
        if (t8605657386197958581 != null) {
            this.f185o = t8605657386197958581;
        } else {
            dev.epro.r0.S10973172697741180971.j("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return k(this.f185o.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f185o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = k(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return this.f185o.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        dev.epro.r0.W929662112881511578 w929662112881511578 = (dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b;
        if (w929662112881511578 != null) {
            w929662112881511578.clear();
        }
        this.f185o.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f185o.close();
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i) {
        return k(this.f185o.findItem(i));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i) {
        return k(this.f185o.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f185o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return this.f185o.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f185o.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return this.f185o.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b) != null) {
            int i2 = 0;
            while (true) {
                dev.epro.r0.W929662112881511578 w929662112881511578 = (dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b;
                if (i2 >= w929662112881511578.c) {
                    break;
                }
                if (((dev.epro.r0.M13863035574364816451) w929662112881511578.e(i2)).getGroupId() == i) {
                    ((dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b).f(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f185o.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b) != null) {
            int i2 = 0;
            while (true) {
                dev.epro.r0.W929662112881511578 w929662112881511578 = (dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b;
                if (i2 >= w929662112881511578.c) {
                    break;
                }
                if (((dev.epro.r0.M13863035574364816451) w929662112881511578.e(i2)).getItemId() == i) {
                    ((dev.epro.r0.W929662112881511578) ((dev.epro.r0.R4239627874707364917) this).b).f(i2);
                    break;
                }
                i2++;
            }
        }
        this.f185o.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f185o.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f185o.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f185o.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f185o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f185o.f.size();
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i) {
        return this.f185o.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return this.f185o.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f185o.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i) {
        return k(this.f185o.add(i));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return k(this.f185o.a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return k(this.f185o.add(i, i2, i3, i4));
    }
}
