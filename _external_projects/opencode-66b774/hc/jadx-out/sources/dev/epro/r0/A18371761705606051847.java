package dev.epro.r0;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A18371761705606051847 {
    public final S10719162835224151221 a;
    public final P5601053304583610420 b;
    public final P5601053304583610420 c;
    public final View d;

    public A18371761705606051847(S10719162835224151221 s10719162835224151221, P5601053304583610420 p5601053304583610420, P5601053304583610420 p56010533045836104202, View view) {
        this.a = s10719162835224151221;
        this.b = p5601053304583610420;
        this.c = p56010533045836104202;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        N3331004317457690805 n3331004317457690805 = (N3331004317457690805) this.b.invoke();
        final byte b = 0;
        if (S10823041268949770285.t(n3331004317457690805, null)) {
            return false;
        }
        menu.clear();
        List list = n3331004317457690805.a;
        int size = list.size();
        final byte b2 = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < size) {
            F4266814510741967107 f4266814510741967107 = (F4266814510741967107) list.get(i2);
            if (f4266814510741967107 instanceof M15272139858142996533) {
                i = i3 + 1;
                Object obj = f4266814510741967107.a;
                final M15272139858142996533 m15272139858142996533 = (M15272139858142996533) f4266814510741967107;
                MenuItem menuItemAdd = menu.add(i4, S10823041268949770285.t(obj, U16229988784104357932.k) ? R.id.cut : S10823041268949770285.t(obj, U16229988784104357932.l) ? R.id.copy : S10823041268949770285.t(obj, U16229988784104357932.m) ? R.id.paste : S10823041268949770285.t(obj, U16229988784104357932.n) ? R.id.selectAll : S10823041268949770285.t(obj, U16229988784104357932.f523o) ? R.id.autofill : i3, i3, m15272139858142996533.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dev.epro.r0.C18348103023435563415
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        byte b3 = b;
                        Object obj2 = this;
                        Object obj3 = m15272139858142996533;
                        switch (b3) {
                            case 0:
                                ((M15272139858142996533) obj3).d.invoke(((A18371761705606051847) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                int i5 = Build.VERSION.SDK_INT;
                                if (i5 < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                        if (i5 >= 36) {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                        } else {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                        }
                                        activity.send(activityOptionsMakeBasic.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Objects.toString(activity);
                                        e.toString();
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (f4266814510741967107 instanceof L1522958525456855662) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i3 + 1;
                        final Context context = this.d.getContext();
                        L1522958525456855662 l1522958525456855662 = (L1522958525456855662) f4266814510741967107;
                        final TextClassification textClassification = l1522958525456855662.b;
                        int i5 = l1522958525456855662.c;
                        Drawable drawable = l1522958525456855662.d;
                        if (i5 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i3, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dev.epro.r0.C18348103023435563415
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    byte b3 = b2;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (b3) {
                                        case 0:
                                            ((M15272139858142996533) obj3).d.invoke(((A18371761705606051847) obj2).a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            int i52 = Build.VERSION.SDK_INT;
                                            if (i52 < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                                    if (i52 >= 36) {
                                                        activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                                    } else {
                                                        activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                                    }
                                                    activity.send(activityOptionsMakeBasic.toBundle());
                                                } catch (PendingIntent.CanceledException e) {
                                                    Objects.toString(activity);
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
                            final RemoteAction remoteActionC = M13159286552657112763.c(textClassification.getActions().get(i5));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, b3 != 0 ? 16908353 : b, i3, remoteActionC.getTitle());
                            menuItemAdd3.setShowAsAction(b3 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dev.epro.r0.R14351638176649056093
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteActionC.getActionIntent();
                                    int i6 = Build.VERSION.SDK_INT;
                                    if (i6 < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                        if (i6 >= 36) {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                        } else {
                                            activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                        }
                                        actionIntent.send(activityOptionsMakeBasic.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Objects.toString(actionIntent);
                                        e.toString();
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (f4266814510741967107 instanceof D10130052429559023062) {
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
