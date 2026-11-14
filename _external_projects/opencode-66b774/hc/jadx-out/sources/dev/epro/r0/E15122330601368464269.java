package dev.epro.r0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E15122330601368464269 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ C8081513896840795204 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f215o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public M12354959812914331817 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public E15122330601368464269(C8081513896840795204 c8081513896840795204, Menu menu) {
        this.E = c8081513896840795204;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        C8081513896840795204 c8081513896840795204 = this.E;
        Context context = c8081513896840795204.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                S10973172697741180971.m("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = c8081513896840795204.d;
            if (objA == null) {
                objA = C8081513896840795204.a(context);
                c8081513896840795204.d = objA;
            }
            String str = this.y;
            L14785899241461938410 l14785899241461938410 = new L14785899241461938410();
            l14785899241461938410.b = objA;
            Class<?> cls = objA.getClass();
            try {
                l14785899241461938410.c = cls.getMethod(str, L14785899241461938410.d);
                menuItem.setOnMenuItemClickListener(l14785899241461938410);
            } catch (Exception e) {
                StringBuilder sbG = X2485016533998461232.g("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbG.append(cls.getName());
                InflateException inflateException = new InflateException(sbG.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof I4217019646703278835) {
                I4217019646703278835 i4217019646703278835 = (I4217019646703278835) menuItem;
                i4217019646703278835.x = (i4217019646703278835.x & (-5)) | 4;
            } else if (menuItem instanceof H2233650693096395599) {
                H2233650693096395599 h2233650693096395599 = (H2233650693096395599) menuItem;
                M13863035574364816451 m13863035574364816451 = h2233650693096395599.f270o;
                try {
                    Method declaredMethod = h2233650693096395599.p;
                    if (declaredMethod == null) {
                        declaredMethod = m13863035574364816451.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        h2233650693096395599.p = declaredMethod;
                    }
                    declaredMethod.invoke(m13863035574364816451, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, C8081513896840795204.e, c8081513896840795204.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        M12354959812914331817 m12354959812914331817 = this.z;
        if (m12354959812914331817 != null && (menuItem instanceof M13863035574364816451)) {
            ((M13863035574364816451) menuItem).b(m12354959812914331817);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof M13863035574364816451;
        if (z2) {
            ((M13863035574364816451) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F18342544821595307642.p(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((M13863035574364816451) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F18342544821595307642.x(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.f215o;
        if (z2) {
            ((M13863035574364816451) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F18342544821595307642.n(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((M13863035574364816451) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            F18342544821595307642.t(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((M13863035574364816451) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                F18342544821595307642.s(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((M13863035574364816451) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                F18342544821595307642.r(menuItem, colorStateList);
            }
        }
    }
}
