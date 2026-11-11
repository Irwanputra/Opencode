package p034.p050.p051.p052;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p034.p035.p036.p037.InterfaceMenuC1002;
import p034.p035.p043.C1067;
import p034.p035.p045.C1115;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1164 implements InterfaceMenuC1002 {

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final int[] f5764 = {1, 4, 5, 3, 2, 0};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f5765;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Resources f5766;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f5767;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ArrayList<C1197> f5768;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ArrayList<C1197> f5769;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public View f5772;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f5773;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f5774;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC1166 f5778;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C1197 f5780;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<C1197> f5781;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public CharSequence f5782;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f5784;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Drawable f5786;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ArrayList<C1197> f5787;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f5788;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f5779 = 0;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f5770 = false;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f5771 = false;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f5777 = false;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f5783 = false;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public ArrayList<C1197> f5775 = new ArrayList<>();

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public CopyOnWriteArrayList<WeakReference<InterfaceC1186>> f5776 = new CopyOnWriteArrayList<>();

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean f5785 = false;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1165 {
        /* renamed from: げつ〴ぬぐ */
        boolean mo92(C1197 c1197);
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1166 {
        /* renamed from: 〺つふすそ */
        void mo141(C1164 c1164);

        /* renamed from: げつ〴ぬぐ */
        boolean mo142(C1164 c1164, MenuItem menuItem);
    }

    public C1164(Context context) {
        boolean z;
        boolean z2 = false;
        this.f5774 = context;
        Resources resources = context.getResources();
        this.f5766 = resources;
        this.f5781 = new ArrayList<>();
        this.f5768 = new ArrayList<>();
        this.f5765 = true;
        this.f5787 = new ArrayList<>();
        this.f5769 = new ArrayList<>();
        this.f5788 = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C1115.f5613;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f5784 = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo2620(0, 0, 0, this.f5766.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2620(i, i2, i3, this.f5766.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2620(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo2620(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f5774.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = mo2620(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f5766.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f5766.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1197 c1197 = (C1197) mo2620(i, i2, i3, charSequence);
        SubMenuC1180 subMenuC1180 = new SubMenuC1180(this.f5774, this, c1197);
        c1197.f5920 = subMenuC1180;
        subMenuC1180.setHeaderTitle(c1197.f5926);
        return subMenuC1180;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        C1197 c1197 = this.f5780;
        if (c1197 != null) {
            mo2633(c1197);
        }
        this.f5781.clear();
        mo2617(true);
    }

    public void clearHeader() {
        this.f5786 = null;
        this.f5782 = null;
        this.f5772 = null;
        mo2617(false);
    }

    @Override // android.view.Menu
    public void close() {
        m2619(true);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1197 c1197 = this.f5781.get(i2);
            if (c1197.f5922 == i) {
                return c1197;
            }
            if (c1197.hasSubMenu() && (findItem = c1197.f5920.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f5781.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f5767) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f5781.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m2612(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m2623(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1197 m2612 = m2612(i, keyEvent);
        boolean m2631 = m2612 != null ? m2631(m2612, null, i2) : false;
        if ((i2 & 2) != 0) {
            m2619(true);
        }
        return m2631;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f5781.get(i2).f5911 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f5781.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f5781.get(i2).f5911 != i) {
                    break;
                }
                m2621(i2, false);
                i3 = i4;
            }
            mo2617(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f5781.get(i2).f5922 == i) {
                break;
            } else {
                i2++;
            }
        }
        m2621(i2, true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f5781.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1197 c1197 = this.f5781.get(i2);
            if (c1197.f5911 == i) {
                c1197.m2672(z2);
                c1197.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f5785 = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f5781.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1197 c1197 = this.f5781.get(i2);
            if (c1197.f5911 == i) {
                c1197.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f5781.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1197 c1197 = this.f5781.get(i2);
            if (c1197.f5911 == i && c1197.m2668(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo2617(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5773 = z;
        mo2617(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5781.size();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2609(List<C1197> list, int i, KeyEvent keyEvent) {
        boolean mo2635 = mo2635();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f5781.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1197 c1197 = this.f5781.get(i2);
                if (c1197.hasSubMenu()) {
                    c1197.f5920.m2609(list, i, keyEvent);
                }
                char c = mo2635 ? c1197.f5914 : c1197.f5910;
                if (((modifiers & 69647) == ((mo2635 ? c1197.f5939 : c1197.f5938) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (mo2635 && c == '\b' && i == 67)) && c1197.isEnabled()) {
                        list.add(c1197);
                    }
                }
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2610(InterfaceC1186 interfaceC1186, Context context) {
        this.f5776.add(new WeakReference<>(interfaceC1186));
        interfaceC1186.mo122(context, this);
        this.f5788 = true;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m2611(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1180) item.getSubMenu()).m2611(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2613(), sparseArray);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1197 m2612(int i, KeyEvent keyEvent) {
        ArrayList<C1197> arrayList = this.f5775;
        arrayList.clear();
        m2609(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo2635 = mo2635();
        for (int i2 = 0; i2 < size; i2++) {
            C1197 c1197 = arrayList.get(i2);
            char c = mo2635 ? c1197.f5914 : c1197.f5910;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (mo2635 && c == '\b' && i == 67))) {
                return c1197;
            }
        }
        return null;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String mo2613() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void mo2614(InterfaceC1166 interfaceC1166) {
        this.f5778 = interfaceC1166;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void m2615() {
        this.f5788 = true;
        mo2617(true);
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m2616(Bundle bundle) {
        Parcelable mo129;
        if (this.f5776.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC1186 = next.get();
            if (interfaceC1186 == null) {
                this.f5776.remove(next);
            } else {
                int id = interfaceC1186.getId();
                if (id > 0 && (mo129 = interfaceC1186.mo129()) != null) {
                    sparseArray.put(id, mo129);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo2617(boolean z) {
        if (this.f5770) {
            this.f5771 = true;
            if (z) {
                this.f5777 = true;
                return;
            }
            return;
        }
        if (z) {
            this.f5765 = true;
            this.f5788 = true;
        }
        if (this.f5776.isEmpty()) {
            return;
        }
        m2627();
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC1186 = next.get();
            if (interfaceC1186 == null) {
                this.f5776.remove(next);
            } else {
                interfaceC1186.mo119(z);
            }
        }
        m2629();
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean mo2618() {
        return this.f5784;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2619(boolean z) {
        if (this.f5783) {
            return;
        }
        this.f5783 = true;
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC1186 = next.get();
            if (interfaceC1186 == null) {
                this.f5776.remove(next);
            } else {
                interfaceC1186.mo123(this, z);
            }
        }
        this.f5783 = false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public MenuItem mo2620(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f5764;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C1197 c1197 = new C1197(this, i, i2, i3, i6, charSequence, this.f5779);
                ArrayList<C1197> arrayList = this.f5781;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).f5935 <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, c1197);
                mo2617(true);
                return c1197;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final void m2621(int i, boolean z) {
        if (i < 0 || i >= this.f5781.size()) {
            return;
        }
        this.f5781.remove(i);
        if (z) {
            mo2617(true);
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m2622(InterfaceC1186 interfaceC1186) {
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC11862 = next.get();
            if (interfaceC11862 == null || interfaceC11862 == interfaceC1186) {
                this.f5776.remove(next);
            }
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m2623(MenuItem menuItem, int i) {
        return m2631(menuItem, null, i);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo2624(C1164 c1164, MenuItem menuItem) {
        InterfaceC1166 interfaceC1166 = this.f5778;
        return interfaceC1166 != null && interfaceC1166.mo142(c1164, menuItem);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ArrayList<C1197> m2625() {
        if (!this.f5765) {
            return this.f5768;
        }
        this.f5768.clear();
        int size = this.f5781.size();
        for (int i = 0; i < size; i++) {
            C1197 c1197 = this.f5781.get(i);
            if (c1197.isVisible()) {
                this.f5768.add(c1197);
            }
        }
        this.f5765 = false;
        this.f5788 = true;
        return this.f5768;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public void m2626(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2613());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1180) item.getSubMenu()).m2626(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public void m2627() {
        if (this.f5770) {
            return;
        }
        this.f5770 = true;
        this.f5771 = false;
        this.f5777 = false;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean mo2628(C1197 c1197) {
        boolean z = false;
        if (this.f5776.isEmpty()) {
            return false;
        }
        m2627();
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC1186 = next.get();
            if (interfaceC1186 == null) {
                this.f5776.remove(next);
            } else {
                z = interfaceC1186.mo243(this, c1197);
                if (z) {
                    break;
                }
            }
        }
        m2629();
        if (z) {
            this.f5780 = c1197;
        }
        return z;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public void m2629() {
        this.f5770 = false;
        if (this.f5771) {
            this.f5771 = false;
            mo2617(this.f5777);
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean mo2630() {
        return this.f5785;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        m2619(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if ((r9 & 1) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2631(android.view.MenuItem r7, p034.p050.p051.p052.InterfaceC1186 r8, int r9) {
        /*
            r6 = this;
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぺぁあねじ r7 = (p034.p050.p051.p052.C1197) r7
            r0 = 0
            if (r7 == 0) goto Lc6
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc6
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f5917
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L21
        L19:
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r1 = r7.f5937
            boolean r1 = r1.mo2624(r1, r7)
            if (r1 == 0) goto L23
        L21:
            r1 = 1
            goto L3c
        L23:
            android.content.Intent r1 = r7.f5913
            if (r1 == 0) goto L30
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r3 = r7.f5937     // Catch: android.content.ActivityNotFoundException -> L2f
            android.content.Context r3 = r3.f5774     // Catch: android.content.ActivityNotFoundException -> L2f
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2f
            goto L21
        L2f:
        L30:
            づざかべべ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ r1 = r7.f5934
            if (r1 == 0) goto L3b
            boolean r1 = r1.mo2413()
            if (r1 == 0) goto L3b
            goto L21
        L3b:
            r1 = 0
        L3c:
            づざかべべ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ r3 = r7.f5934
            if (r3 == 0) goto L48
            boolean r4 = r3.mo2412()
            if (r4 == 0) goto L48
            r4 = 1
            goto L49
        L48:
            r4 = 0
        L49:
            boolean r5 = r7.m2667()
            if (r5 == 0) goto L5b
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc5
        L56:
            r6.m2619(r2)
            goto Lc5
        L5b:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L69
            if (r4 == 0) goto L64
            goto L69
        L64:
            r7 = r9 & 1
            if (r7 != 0) goto Lc5
            goto L56
        L69:
            r9 = r9 & 4
            if (r9 != 0) goto L70
            r6.m2619(r0)
        L70:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L84
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ざとぅぼこ〺 r9 = new づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ざとぅぼこ〺
            android.content.Context r5 = r6.f5774
            r9.<init>(r5, r6, r7)
            r7.f5920 = r9
            java.lang.CharSequence r5 = r7.f5926
            r9.setHeaderTitle(r5)
        L84:
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ざとぅぼこ〺 r7 = r7.f5920
            if (r4 == 0) goto L8b
            r3.mo2414(r7)
        L8b:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ>> r9 = r6.f5776
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L94
            goto Lc1
        L94:
            if (r8 == 0) goto L9a
            boolean r0 = r8.mo124(r7)
        L9a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ>> r8 = r6.f5776
            java.util.Iterator r8 = r8.iterator()
        La0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc1
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ r3 = (p034.p050.p051.p052.InterfaceC1186) r3
            if (r3 != 0) goto Lba
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ>> r3 = r6.f5776
            r3.remove(r9)
            goto La0
        Lba:
            if (r0 != 0) goto La0
            boolean r0 = r3.mo124(r7)
            goto La0
        Lc1:
            r1 = r1 | r0
            if (r1 != 0) goto Lc5
            goto L56
        Lc5:
            return r1
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p051.p052.C1164.m2631(android.view.MenuItem, づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.のぷのちつ, int):boolean");
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final void m2632(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f5766;
        if (view != null) {
            this.f5772 = view;
            this.f5782 = null;
            this.f5786 = null;
        } else {
            if (i > 0) {
                this.f5782 = resources.getText(i);
            } else if (charSequence != null) {
                this.f5782 = charSequence;
            }
            if (i2 > 0) {
                this.f5786 = C1067.m2406(this.f5774, i2);
            } else if (drawable != null) {
                this.f5786 = drawable;
            }
            this.f5772 = null;
        }
        mo2617(false);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo2633(C1197 c1197) {
        boolean z = false;
        if (!this.f5776.isEmpty() && this.f5780 == c1197) {
            m2627();
            Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC1186> next = it.next();
                InterfaceC1186 interfaceC1186 = next.get();
                if (interfaceC1186 == null) {
                    this.f5776.remove(next);
                } else {
                    z = interfaceC1186.mo242(this, c1197);
                    if (z) {
                        break;
                    }
                }
            }
            m2629();
            if (z) {
                this.f5780 = null;
            }
        }
        return z;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public void m2634(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f5776.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC1186> next = it.next();
            InterfaceC1186 interfaceC1186 = next.get();
            if (interfaceC1186 == null) {
                this.f5776.remove(next);
            } else {
                int id = interfaceC1186.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC1186.mo127(parcelable);
                }
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean mo2635() {
        return this.f5773;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2636() {
        ArrayList<C1197> m2625 = m2625();
        if (this.f5788) {
            Iterator<WeakReference<InterfaceC1186>> it = this.f5776.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC1186> next = it.next();
                InterfaceC1186 interfaceC1186 = next.get();
                if (interfaceC1186 == null) {
                    this.f5776.remove(next);
                } else {
                    z |= interfaceC1186.mo117();
                }
            }
            if (z) {
                this.f5787.clear();
                this.f5769.clear();
                int size = m2625.size();
                for (int i = 0; i < size; i++) {
                    C1197 c1197 = m2625.get(i);
                    (c1197.m2663() ? this.f5787 : this.f5769).add(c1197);
                }
            } else {
                this.f5787.clear();
                this.f5769.clear();
                this.f5769.addAll(m2625());
            }
            this.f5788 = false;
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1164 mo2637() {
        return this;
    }
}
