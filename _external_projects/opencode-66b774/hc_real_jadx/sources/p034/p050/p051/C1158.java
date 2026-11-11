package p034.p050.p051;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p035.p036.p037.InterfaceMenuC1002;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p035.p045.AbstractC1069;
import p034.p050.C1148;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.MenuItemC1167;
import p034.p050.p053.C1210;
import p034.p050.p053.C1260;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1158 extends MenuInflater {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Class<?>[] f5705;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Class<?>[] f5706;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Object[] f5707;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Context f5708;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object[] f5709;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object f5710;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public class C1159 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f5711;

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public String f5713;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f5715;

        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        public String f5717;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public char f5718;

        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public String f5719;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f5720;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public int f5721;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Menu f5723;

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public boolean f5724;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public boolean f5725;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f5726;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public CharSequence f5729;

        /* renamed from: でどあくず, reason: contains not printable characters */
        public int f5730;

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public CharSequence f5731;

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public CharSequence f5733;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f5734;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public boolean f5735;

        /* renamed from: びえぁぜい, reason: contains not printable characters */
        public AbstractC1069 f5736;

        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public int f5738;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public char f5739;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f5740;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public CharSequence f5742;

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public ColorStateList f5716 = null;

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public PorterDuff.Mode f5727 = null;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f5712 = 0;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f5722 = 0;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f5737 = 0;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f5728 = 0;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f5732 = true;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f5714 = true;

        public C1159(Menu menu) {
            this.f5723 = menu;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final <T> T m2605(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1158.this.f5708.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m2606(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f5735).setVisible(this.f5724).setEnabled(this.f5725).setCheckable(this.f5726 >= 1).setTitleCondensed(this.f5729).setIcon(this.f5734);
            int i = this.f5730;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f5717 != null) {
                if (C1158.this.f5708.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C1158 c1158 = C1158.this;
                if (c1158.f5710 == null) {
                    c1158.f5710 = c1158.m2604(c1158.f5708);
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1160(c1158.f5710, this.f5717));
            }
            if (this.f5726 >= 2) {
                if (menuItem instanceof C1197) {
                    ((C1197) menuItem).m2672(true);
                } else if (menuItem instanceof MenuItemC1167) {
                    MenuItemC1167 menuItemC1167 = (MenuItemC1167) menuItem;
                    try {
                        if (menuItemC1167.f5789 == null) {
                            menuItemC1167.f5789 = menuItemC1167.f5790.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC1167.f5789.invoke(menuItemC1167.f5790, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f5713;
            if (str != null) {
                menuItem.setActionView((View) m2605(str, C1158.f5705, C1158.this.f5709));
                z = true;
            }
            int i2 = this.f5738;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            AbstractC1069 abstractC1069 = this.f5736;
            if (abstractC1069 != null && (menuItem instanceof InterfaceMenuItemC1000)) {
                ((InterfaceMenuItemC1000) menuItem).mo2328(abstractC1069);
            }
            CharSequence charSequence = this.f5733;
            boolean z2 = menuItem instanceof InterfaceMenuItemC1000;
            if (z2) {
                ((InterfaceMenuItemC1000) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f5731;
            if (z2) {
                ((InterfaceMenuItemC1000) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f5739;
            int i3 = this.f5721;
            if (z2) {
                ((InterfaceMenuItemC1000) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f5718;
            int i4 = this.f5720;
            if (z2) {
                ((InterfaceMenuItemC1000) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.f5727;
            if (mode != null) {
                if (z2) {
                    ((InterfaceMenuItemC1000) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f5716;
            if (colorStateList != null) {
                if (z2) {
                    ((InterfaceMenuItemC1000) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public SubMenu m2607() {
            this.f5711 = true;
            SubMenu addSubMenu = this.f5723.addSubMenu(this.f5712, this.f5740, this.f5715, this.f5742);
            m2606(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class MenuItemOnMenuItemClickListenerC1160 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public static final Class<?>[] f5743 = {MenuItem.class};

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Method f5744;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Object f5745;

        public MenuItemOnMenuItemClickListenerC1160(Object obj, String str) {
            this.f5745 = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5744 = cls.getMethod(str, f5743);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f5744.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f5744.invoke(this.f5745, menuItem)).booleanValue();
                }
                this.f5744.invoke(this.f5745, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f5705 = clsArr;
        f5706 = clsArr;
    }

    public C1158(Context context) {
        super(context);
        this.f5708 = context;
        Object[] objArr = {context};
        this.f5709 = objArr;
        this.f5707 = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1002)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f5708.getResources().getLayout(i);
                    m2603(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m2603(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C1159 c1159 = new C1159(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(C2098.m4205("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        c1159.f5712 = 0;
                        c1159.f5722 = 0;
                        c1159.f5737 = 0;
                        c1159.f5728 = 0;
                        c1159.f5732 = true;
                        c1159.f5714 = true;
                    } else if (name2.equals("item")) {
                        if (!c1159.f5711) {
                            AbstractC1069 abstractC1069 = c1159.f5736;
                            if (abstractC1069 == null || !abstractC1069.mo2412()) {
                                c1159.f5711 = true;
                                c1159.m2606(c1159.f5723.add(c1159.f5712, c1159.f5740, c1159.f5715, c1159.f5742));
                            } else {
                                c1159.m2607();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = C1158.this.f5708.obtainStyledAttributes(attributeSet, C1148.MenuGroup);
                    c1159.f5712 = obtainStyledAttributes.getResourceId(C1148.MenuGroup_android_id, 0);
                    c1159.f5722 = obtainStyledAttributes.getInt(C1148.MenuGroup_android_menuCategory, 0);
                    c1159.f5737 = obtainStyledAttributes.getInt(C1148.MenuGroup_android_orderInCategory, 0);
                    c1159.f5728 = obtainStyledAttributes.getInt(C1148.MenuGroup_android_checkableBehavior, 0);
                    c1159.f5732 = obtainStyledAttributes.getBoolean(C1148.MenuGroup_android_visible, true);
                    c1159.f5714 = obtainStyledAttributes.getBoolean(C1148.MenuGroup_android_enabled, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    C1260 m2909 = C1260.m2909(C1158.this.f5708, attributeSet, C1148.MenuItem);
                    c1159.f5740 = m2909.m2922(C1148.MenuItem_android_id, 0);
                    c1159.f5715 = (m2909.m2914(C1148.MenuItem_android_menuCategory, c1159.f5722) & (-65536)) | (m2909.m2914(C1148.MenuItem_android_orderInCategory, c1159.f5737) & 65535);
                    c1159.f5742 = m2909.m2916(C1148.MenuItem_android_title);
                    c1159.f5729 = m2909.m2916(C1148.MenuItem_android_titleCondensed);
                    c1159.f5734 = m2909.m2922(C1148.MenuItem_android_icon, 0);
                    String m2924 = m2909.m2924(C1148.MenuItem_android_alphabeticShortcut);
                    c1159.f5739 = m2924 == null ? (char) 0 : m2924.charAt(0);
                    c1159.f5721 = m2909.m2914(C1148.MenuItem_alphabeticModifiers, NotificationCompat.FLAG_BUBBLE);
                    String m29242 = m2909.m2924(C1148.MenuItem_android_numericShortcut);
                    c1159.f5718 = m29242 == null ? (char) 0 : m29242.charAt(0);
                    c1159.f5720 = m2909.m2914(C1148.MenuItem_numericModifiers, NotificationCompat.FLAG_BUBBLE);
                    int i = C1148.MenuItem_android_checkable;
                    c1159.f5726 = m2909.m2915(i) ? m2909.m2918(i, false) : c1159.f5728;
                    c1159.f5735 = m2909.m2918(C1148.MenuItem_android_checked, false);
                    c1159.f5724 = m2909.m2918(C1148.MenuItem_android_visible, c1159.f5732);
                    c1159.f5725 = m2909.m2918(C1148.MenuItem_android_enabled, c1159.f5714);
                    c1159.f5730 = m2909.m2914(C1148.MenuItem_showAsAction, -1);
                    c1159.f5717 = m2909.m2924(C1148.MenuItem_android_onClick);
                    c1159.f5738 = m2909.m2922(C1148.MenuItem_actionLayout, 0);
                    c1159.f5713 = m2909.m2924(C1148.MenuItem_actionViewClass);
                    String m29243 = m2909.m2924(C1148.MenuItem_actionProviderClass);
                    c1159.f5719 = m29243;
                    if ((m29243 != null) && c1159.f5738 == 0 && c1159.f5713 == null) {
                        c1159.f5736 = (AbstractC1069) c1159.m2605(m29243, f5706, C1158.this.f5707);
                    } else {
                        c1159.f5736 = null;
                    }
                    c1159.f5733 = m2909.m2916(C1148.MenuItem_contentDescription);
                    c1159.f5731 = m2909.m2916(C1148.MenuItem_tooltipText);
                    int i2 = C1148.MenuItem_iconTintMode;
                    if (m2909.m2915(i2)) {
                        c1159.f5727 = C1210.m2697(m2909.m2914(i2, -1), c1159.f5727);
                    } else {
                        c1159.f5727 = null;
                    }
                    int i3 = C1148.MenuItem_iconTint;
                    if (m2909.m2915(i3)) {
                        c1159.f5716 = m2909.m2917(i3);
                    } else {
                        c1159.f5716 = null;
                    }
                    m2909.f6162.recycle();
                    c1159.f5711 = false;
                } else if (name3.equals("menu")) {
                    m2603(xmlPullParser, attributeSet, c1159.m2607());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object m2604(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2604(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
