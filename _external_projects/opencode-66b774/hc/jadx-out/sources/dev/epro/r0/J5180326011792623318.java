package dev.epro.r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J5180326011792623318 {
    public static final W8823188230031025271 a = new W8823188230031025271();
    public static final Object b = new Object();
    public static T15504973625601650233 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? T3623367008917729099.c(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static T15504973625601650233 b() {
        T15504973625601650233 t15504973625601650233 = new T15504973625601650233((byte) 22);
        c = t15504973625601650233;
        a.i(t15504973625601650233);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J5180326011792623318.c(android.content.Context, boolean):void");
    }
}
