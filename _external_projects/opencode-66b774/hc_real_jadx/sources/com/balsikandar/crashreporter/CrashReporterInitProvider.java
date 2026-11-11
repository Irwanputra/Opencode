package com.balsikandar.crashreporter;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.FileProvider;
import p131.p150.p151.C2085;
import p131.p150.p151.p154.C2095;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CrashReporterInitProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            throw new NullPointerException("CrashReporterInitProvider ProviderInfo cannot be null.");
        }
        if ("com.balsikandar.crashreporter.CrashReporterInitProvider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        C2085.f8887 = getContext();
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof C2095) {
            return true;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C2095());
        return true;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
