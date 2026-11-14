package com.pairip.application;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class Application extends dev.epro.httpcustom.HTTPCustomApp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dev.epro.httpcustom.HTTPCustomApp, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
