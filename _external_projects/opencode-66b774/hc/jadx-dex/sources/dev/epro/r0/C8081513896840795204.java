package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C8081513896840795204 extends android.view.MenuInflater {
    public static final java.lang.Class[] e;
    public static final java.lang.Class[] f;
    public final java.lang.Object[] a;
    public final java.lang.Object[] b;
    public final android.content.Context c;
    public java.lang.Object d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        e = clsArr;
        f = clsArr;
    }

    public C8081513896840795204(android.content.Context context) {
        super(context);
        this.c = context;
        java.lang.Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        org.xmlpull.v1.XmlPullParser xmlPullParser2;
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        dev.epro.r0.E15122330601368464269 e15122330601368464269 = new dev.epro.r0.E15122330601368464269(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    dev.epro.r0.K2042933864045806308.i("Expecting menu, got ".concat(name));
                    return;
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
        java.lang.String str = null;
        while (!z) {
            if (eventType == 1) {
                dev.epro.r0.K2042933864045806308.i("Unexpected end of document");
                return;
            }
            android.view.Menu menu2 = e15122330601368464269.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            e15122330601368464269.b = 0;
                            e15122330601368464269.c = 0;
                            e15122330601368464269.d = 0;
                            e15122330601368464269.e = 0;
                            e15122330601368464269.f = true;
                            e15122330601368464269.g = true;
                        } else if (name2.equals("item")) {
                            if (!e15122330601368464269.h) {
                                dev.epro.r0.M12354959812914331817 m12354959812914331817 = e15122330601368464269.z;
                                if (m12354959812914331817 == null || !m12354959812914331817.b.hasSubMenu()) {
                                    e15122330601368464269.h = true;
                                    e15122330601368464269.b(menu2.add(e15122330601368464269.b, e15122330601368464269.i, e15122330601368464269.j, e15122330601368464269.k));
                                } else {
                                    e15122330601368464269.h = true;
                                    e15122330601368464269.b(menu2.addSubMenu(e15122330601368464269.b, e15122330601368464269.i, e15122330601368464269.j, e15122330601368464269.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    java.lang.String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    android.content.Context context = this.c;
                    if (zEquals) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.p);
                        e15122330601368464269.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        e15122330601368464269.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        e15122330601368464269.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        e15122330601368464269.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        e15122330601368464269.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        e15122330601368464269.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Y17304307076558258116.q);
                            e15122330601368464269.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            e15122330601368464269.j = (typedArrayObtainStyledAttributes2.getInt(5, e15122330601368464269.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, e15122330601368464269.d) & 65535);
                            e15122330601368464269.k = typedArrayObtainStyledAttributes2.getText(7);
                            e15122330601368464269.l = typedArrayObtainStyledAttributes2.getText(8);
                            e15122330601368464269.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            java.lang.String string = typedArrayObtainStyledAttributes2.getString(9);
                            e15122330601368464269.n = string == null ? (char) 0 : string.charAt(0);
                            e15122330601368464269.f215o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            java.lang.String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            e15122330601368464269.p = string2 == null ? (char) 0 : string2.charAt(0);
                            e15122330601368464269.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                e15122330601368464269.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                e15122330601368464269.r = e15122330601368464269.e;
                            }
                            e15122330601368464269.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            e15122330601368464269.t = typedArrayObtainStyledAttributes2.getBoolean(4, e15122330601368464269.f);
                            e15122330601368464269.u = typedArrayObtainStyledAttributes2.getBoolean(1, e15122330601368464269.g);
                            e15122330601368464269.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            e15122330601368464269.y = typedArrayObtainStyledAttributes2.getString(12);
                            e15122330601368464269.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            e15122330601368464269.x = typedArrayObtainStyledAttributes2.getString(15);
                            java.lang.String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            if (string3 != null && e15122330601368464269.w == 0 && e15122330601368464269.x == null) {
                                e15122330601368464269.z = (dev.epro.r0.M12354959812914331817) e15122330601368464269.a(string3, f, this.b);
                            } else {
                                e15122330601368464269.z = null;
                            }
                            e15122330601368464269.A = typedArrayObtainStyledAttributes2.getText(17);
                            e15122330601368464269.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                e15122330601368464269.D = dev.epro.r0.T11496100853119631009.b(typedArrayObtainStyledAttributes2.getInt(19, -1), e15122330601368464269.D);
                            } else {
                                e15122330601368464269.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = dev.epro.r0.B5998207562248239613.r(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                e15122330601368464269.C = colorStateList;
                            } else {
                                e15122330601368464269.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            e15122330601368464269.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            e15122330601368464269.h = true;
                            android.view.SubMenu subMenuAddSubMenu = menu2.addSubMenu(e15122330601368464269.b, e15122330601368464269.i, e15122330601368464269.j, e15122330601368464269.k);
                            e15122330601368464269.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof dev.epro.r0.T8605657386197958581)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(layout);
                if (menu instanceof dev.epro.r0.T8605657386197958581) {
                    dev.epro.r0.T8605657386197958581 t8605657386197958581 = (dev.epro.r0.T8605657386197958581) menu;
                    if (!t8605657386197958581.p) {
                        t8605657386197958581.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((dev.epro.r0.T8605657386197958581) menu).v();
                }
                layout.close();
            } catch (java.io.IOException e2) {
                throw new android.view.InflateException("Error inflating menu XML", e2);
            } catch (org.xmlpull.v1.XmlPullParserException e3) {
                throw new android.view.InflateException("Error inflating menu XML", e3);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                ((dev.epro.r0.T8605657386197958581) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
