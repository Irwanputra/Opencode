package com.google.android.play.core.hsdp.service;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class HsdpShimActivity extends android.app.Activity {
    public java.lang.String a = null;
    public boolean b = false;

    public final void a(boolean z) {
        java.util.HashMap map;
        dev.epro.r0.S9286526287894964911 s9286526287894964911;
        android.os.IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            dev.epro.r0.S10973172697741180971.m("windowToken is null");
            return;
        }
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("target_package_name");
        if (stringExtra == null) {
            dev.epro.r0.S10973172697741180971.m("targetPackageName is null");
            return;
        }
        dev.epro.r0.R2847330884077978889 r2847330884077978889V = dev.epro.r0.Z860808776098365610.V(this, com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        if (z || !stringExtra.equals(this.a) || (s9286526287894964911 = (dev.epro.r0.S9286526287894964911) r2847330884077978889V.c.get(stringExtra)) == null || s9286526287894964911.a != 2) {
            this.a = stringExtra;
            this.b = false;
            java.lang.String stringExtra2 = intent.getStringExtra("referrer");
            if (stringExtra2 == null) {
                dev.epro.r0.S10973172697741180971.m("referrer is null");
                return;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("deeplink_url");
            if (stringExtra3 == null) {
                dev.epro.r0.S10973172697741180971.m("deeplinkUrl is null");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
            android.os.Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
            if (bundleExtra != null) {
                map = new java.util.HashMap();
                for (java.lang.String str : bundleExtra.keySet()) {
                    java.lang.String string = bundleExtra.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    map.put(str, string);
                }
            } else {
                map = null;
            }
            r2847330884077978889V.a(stringExtra, stringExtra3, windowToken, dev.epro.r0.T13998044911588922055.o(this, getResources().getConfiguration().screenWidthDp), dev.epro.r0.T13998044911588922055.p(this), booleanExtra, new dev.epro.r0.J15730374346044043770(this, stringExtra, stringExtra2, map));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492911);
        android.view.Window window = getWindow();
        window.setLayout(-1, -1);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            dev.epro.r0.V5057341886547923963.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
