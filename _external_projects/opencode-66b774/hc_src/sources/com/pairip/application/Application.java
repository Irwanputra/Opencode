package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import dev.epro.httpcustom.HTTPCustomApp;

/* loaded from: classes.dex */
public class Application extends HTTPCustomApp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dev.epro.httpcustom.HTTPCustomApp, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
