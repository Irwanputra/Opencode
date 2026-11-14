package dev.epro.r0;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X11123940576545591343 extends G14026964626121631668 {
    public static final Object c = new Object();
    public static final X11123940576545591343 d = new X11123940576545591343();

    public static AlertDialog d(Activity activity, int i, Q12898595865065577357 q12898595865065577357, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(E4057283238781867196.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(net.zetetic.database.R.string.common_google_play_services_enable_button) : resources.getString(net.zetetic.database.R.string.common_google_play_services_update_button) : resources.getString(net.zetetic.database.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, q12898595865065577357);
        }
        String c2 = E4057283238781867196.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof R13227154569034155950) {
                P14575954172000745949 p14575954172000745949 = ((C10994625127000459680) ((R13227154569034155950) activity).u.b).t;
                V928555117064567183 v928555117064567183 = new V928555117064567183();
                M18113111391818111737.w("Cannot display null dialog", alertDialog);
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                v928555117064567183.g0 = alertDialog;
                if (onCancelListener != null) {
                    v928555117064567183.h0 = onCancelListener;
                }
                v928555117064567183.d0 = false;
                v928555117064567183.e0 = true;
                W10130330342449691688 w10130330342449691688 = new W10130330342449691688(p14575954172000745949);
                w10130330342449691688.f550o = true;
                w10130330342449691688.e(0, v928555117064567183, str);
                w10130330342449691688.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        K14349477394530667312 k14349477394530667312 = new K14349477394530667312();
        M18113111391818111737.w("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        k14349477394530667312.a = alertDialog;
        if (onCancelListener != null) {
            k14349477394530667312.b = onCancelListener;
        }
        k14349477394530667312.show(fragmentManager, str);
    }

    @Override // dev.epro.r0.G14026964626121631668
    public final Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new X145756483795779377(super.a(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new F2270256964876566002(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e = i == 6 ? E4057283238781867196.e(context, "common_google_play_services_resolution_required_title") : E4057283238781867196.c(context, i);
        if (e == null) {
            e = context.getResources().getString(net.zetetic.database.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? E4057283238781867196.d(context, "common_google_play_services_resolution_required_text", E4057283238781867196.a(context)) : E4057283238781867196.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        M18113111391818111737.v(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        J16704254777695610861 j16704254777695610861 = new J16704254777695610861(context, null);
        j16704254777695610861.l = true;
        j16704254777695610861.c(16, true);
        j16704254777695610861.e = J16704254777695610861.b(e);
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((byte) 8, false);
        v10300877997588547986.c = J16704254777695610861.b(d2);
        j16704254777695610861.d(v10300877997588547986);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = Y582199805280922215.x;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            Y582199805280922215.x = bool;
        }
        if (bool.booleanValue()) {
            j16704254777695610861.p.icon = context.getApplicationInfo().icon;
            j16704254777695610861.h = (byte) 2;
            if (Y582199805280922215.G(context)) {
                j16704254777695610861.b.add(new J936157209208926409(resources.getString(net.zetetic.database.R.string.common_open_on_phone), pendingIntent));
            } else {
                j16704254777695610861.g = pendingIntent;
            }
        } else {
            j16704254777695610861.p.icon = R.drawable.stat_sys_warning;
            j16704254777695610861.p.tickerText = J16704254777695610861.b(resources.getString(net.zetetic.database.R.string.common_google_play_services_notification_ticker));
            j16704254777695610861.p.when = System.currentTimeMillis();
            j16704254777695610861.g = pendingIntent;
            j16704254777695610861.f = J16704254777695610861.b(d2);
        }
        if (M2066880349381062048.G()) {
            if (!M2066880349381062048.G()) {
                Z3383101362411723454.r();
                return;
            }
            synchronized (c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(net.zetetic.database.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            j16704254777695610861.n = "com.google.android.gms.availability";
        }
        Notification a = j16704254777695610861.a();
        if (i == 1 || i == 2 || i == 3) {
            Y2177079631878275493.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a);
    }

    public final void g(Activity activity, U7958403488571092328 u7958403488571092328, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new K5337842719176152428(super.a(activity, i, "d"), u7958403488571092328), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
