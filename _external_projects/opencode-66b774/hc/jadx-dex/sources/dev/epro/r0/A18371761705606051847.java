package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A18371761705606051847 {
    public final dev.epro.r0.S10719162835224151221 a;
    public final dev.epro.r0.P5601053304583610420 b;
    public final dev.epro.r0.P5601053304583610420 c;
    public final android.view.View d;

    public A18371761705606051847(dev.epro.r0.S10719162835224151221 s10719162835224151221, dev.epro.r0.P5601053304583610420 p5601053304583610420, dev.epro.r0.P5601053304583610420 p56010533045836104202, android.view.View view) {
        this.a = s10719162835224151221;
        this.b = p5601053304583610420;
        this.c = p56010533045836104202;
        this.d = view;
    }

    public final boolean a(android.view.Menu menu) {
        int i;
        dev.epro.r0.N3331004317457690805 n3331004317457690805 = (dev.epro.r0.N3331004317457690805) this.b.invoke();
        final byte b = 0;
        if (dev.epro.r0.S10823041268949770285.t(n3331004317457690805, (java.lang.Object) null)) {
            return false;
        }
        menu.clear();
        java.util.List list = n3331004317457690805.a;
        int size = list.size();
        final byte b2 = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < size) {
            dev.epro.r0.M15272139858142996533 m15272139858142996533 = (dev.epro.r0.F4266814510741967107) list.get(i2);
            if (m15272139858142996533 instanceof dev.epro.r0.M15272139858142996533) {
                i = i3 + 1;
                java.lang.Object obj = ((dev.epro.r0.F4266814510741967107) m15272139858142996533).a;
                final dev.epro.r0.M15272139858142996533 m152721398581429965332 = m15272139858142996533;
                android.view.MenuItem menuItemAdd = menu.add(i4, dev.epro.r0.S10823041268949770285.t(obj, dev.epro.r0.U16229988784104357932.k) ? android.R.id.cut : dev.epro.r0.S10823041268949770285.t(obj, dev.epro.r0.U16229988784104357932.l) ? android.R.id.copy : dev.epro.r0.S10823041268949770285.t(obj, dev.epro.r0.U16229988784104357932.m) ? android.R.id.paste : dev.epro.r0.S10823041268949770285.t(obj, dev.epro.r0.U16229988784104357932.n) ? android.R.id.selectAll : dev.epro.r0.S10823041268949770285.t(obj, dev.epro.r0.U16229988784104357932.o) ? android.R.id.autofill : i3, i3, m152721398581429965332.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: dev.epro.r0.C18348103023435563415
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                        byte b3 = b;
                        java.lang.Object obj2 = this;
                        java.lang.Object obj3 = m152721398581429965332;
                        switch (b3) {
                            case 0:
                                ((dev.epro.r0.M15272139858142996533) obj3).d.invoke(((dev.epro.r0.A18371761705606051847) obj2).a);
                                break;
                            default:
                                android.content.Context context = (android.content.Context) obj3;
                                android.view.textclassifier.TextClassification textClassification = (android.view.textclassifier.TextClassification) obj2;
                                java.lang.String strK = dev.epro.r0.T15589241373902147015.k(textClassification);
                                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, strK != null ? strK.hashCode() : 0, dev.epro.r0.T15589241373902147015.c(textClassification), 201326592);
                                int i5 = android.os.Build.VERSION.SDK_INT;
                                if (i5 < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
                                        if (i5 >= 36) {
                                            dev.epro.r0.J14472086795230312938.s(activityOptionsMakeBasic);
                                        } else {
                                            dev.epro.r0.J14472086795230312938.A(activityOptionsMakeBasic);
                                        }
                                        dev.epro.r0.J14472086795230312938.t(activity, activityOptionsMakeBasic.toBundle());
                                    } catch (android.app.PendingIntent.CanceledException e) {
                                        java.util.Objects.toString(activity);
                                        e.toString();
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (m15272139858142996533 instanceof dev.epro.r0.L1522958525456855662) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        i = i3 + 1;
                        final android.content.Context context = this.d.getContext();
                        dev.epro.r0.L1522958525456855662 l1522958525456855662 = (dev.epro.r0.L1522958525456855662) m15272139858142996533;
                        final android.view.textclassifier.TextClassification textClassification = l1522958525456855662.b;
                        int i5 = l1522958525456855662.c;
                        android.graphics.drawable.Drawable drawable = l1522958525456855662.d;
                        if (i5 < 0) {
                            android.view.MenuItem menuItemAdd2 = menu.add(android.R.id.textAssist, android.R.id.textAssist, i3, dev.epro.r0.M13159286552657112763.f(textClassification));
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: dev.epro.r0.C18348103023435563415
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                    byte b3 = b2;
                                    java.lang.Object obj2 = textClassification;
                                    java.lang.Object obj3 = context;
                                    switch (b3) {
                                        case 0:
                                            ((dev.epro.r0.M15272139858142996533) obj3).d.invoke(((dev.epro.r0.A18371761705606051847) obj2).a);
                                            break;
                                        default:
                                            android.content.Context context2 = (android.content.Context) obj3;
                                            android.view.textclassifier.TextClassification textClassification2 = (android.view.textclassifier.TextClassification) obj2;
                                            java.lang.String strK = dev.epro.r0.T15589241373902147015.k(textClassification2);
                                            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, strK != null ? strK.hashCode() : 0, dev.epro.r0.T15589241373902147015.c(textClassification2), 201326592);
                                            int i52 = android.os.Build.VERSION.SDK_INT;
                                            if (i52 < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
                                                    if (i52 >= 36) {
                                                        dev.epro.r0.J14472086795230312938.s(activityOptionsMakeBasic);
                                                    } else {
                                                        dev.epro.r0.J14472086795230312938.A(activityOptionsMakeBasic);
                                                    }
                                                    dev.epro.r0.J14472086795230312938.t(activity, activityOptionsMakeBasic.toBundle());
                                                } catch (android.app.PendingIntent.CanceledException e) {
                                                    java.util.Objects.toString(activity);
                                                    e.toString();
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            byte b3 = i5 == 0 ? (byte) 1 : b;
                            android.app.RemoteAction remoteActionC = dev.epro.r0.M13159286552657112763.c(dev.epro.r0.U14881866531452519068.k(textClassification).get(i5));
                            android.view.MenuItem menuItemAdd3 = menu.add(android.R.id.textAssist, b3 != 0 ? 16908353 : b, i3, dev.epro.r0.M13159286552657112763.e(remoteActionC));
                            menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new dev.epro.r0.R14351638176649056093(remoteActionC));
                        }
                    }
                } else if (m15272139858142996533 instanceof dev.epro.r0.D10130052429559023062) {
                    i4++;
                }
                i2++;
                b = 0;
            }
            i3 = i;
            i2++;
            b = 0;
        }
        return true;
    }
}
