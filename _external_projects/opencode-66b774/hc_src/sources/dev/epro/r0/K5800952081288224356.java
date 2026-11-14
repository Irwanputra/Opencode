package dev.epro.r0;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K5800952081288224356 extends AppComponentFactory {
    public static final K5800952081288224356 a;
    public static final int b = 0;

    static {
        int zhmrogajtckn;
        izmyclvb.dpqpjfpoanwt1(1863);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                zhmrogajtckn = zhmrogajtckn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (zhmrogajtckn != 0) {
                switch (zhmrogajtckn) {
                    case 1:
                        a = (K5800952081288224356) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private final native void a();

    private native void rlxthcgncobl();

    private static native int zhmrogajtckn(Object[] objArr);

    public native Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent);

    public native Application instantiateApplication(ClassLoader classLoader, String str);

    public native ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo);

    public native ContentProvider instantiateProvider(ClassLoader classLoader, String str);

    public native BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent);

    public native Service instantiateService(ClassLoader classLoader, String str, Intent intent);

    private K5800952081288224356() {
        rlxthcgncobl();
    }
}
