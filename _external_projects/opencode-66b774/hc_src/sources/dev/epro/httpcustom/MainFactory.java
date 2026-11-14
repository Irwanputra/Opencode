package dev.epro.httpcustom;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class MainFactory extends AppComponentFactory {
    public static final int $stable = 8;

    static {
        izmyclvb.oeynnivvrnts0(1215);
    }

    private native void zuqrzdjlskla();

    public native Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent);

    public native Application instantiateApplication(ClassLoader classLoader, String str);

    public native ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo);

    public native ContentProvider instantiateProvider(ClassLoader classLoader, String str);

    public native BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent);

    public native Service instantiateService(ClassLoader classLoader, String str, Intent intent);

    public MainFactory() {
        zuqrzdjlskla();
    }
}
