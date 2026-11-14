package com.google.android.play.core.hsdp.service;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final java.lang.String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final java.lang.String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final java.lang.String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static dev.epro.r0.K8888766238980911980 create(android.content.Context context) {
        return createInternal(context, false, true);
    }

    private static android.content.Intent createHpoaServiceIntent(android.content.Context context, boolean z) {
        return z ? new android.content.Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new android.content.Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static android.content.Intent createHsdpServiceIntent() {
        return new android.content.Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static dev.epro.r0.K8888766238980911980 createInternal(android.content.Context context, boolean z, boolean z2) {
        if (!z2 && !(context instanceof android.app.Activity)) {
            dev.epro.r0.S10973172697741180971.j("Context must be an Activity when using activity-based HSDP.");
            return null;
        }
        if (!z || (context instanceof android.app.Activity)) {
            boolean z3 = android.app.ActivityManager.isRunningInTestHarness() || (android.os.Build.VERSION.SDK_INT >= 29 && dev.epro.r0.I9104972935492198939.s());
            return new dev.epro.r0.J6457333644812339360(context, dev.epro.r0.P13747563277035175218.o(new dev.epro.r0.Q6203700555324584864(context, z3)), dev.epro.r0.P13747563277035175218.o(new dev.epro.r0.U9296548531947164180(context, false)), z3, z2, z);
        }
        dev.epro.r0.S10973172697741180971.j("Context must be an Activity when enabling loading panel.");
        return null;
    }

    public static /* synthetic */ dev.epro.r0.E17835566830149380994 lambda$createInternal$0(android.content.Context context, boolean z) {
        return new dev.epro.r0.V9493494307739248620(createHpoaServiceIntent(context, z), (android.app.Activity) context);
    }

    public static dev.epro.r0.K8888766238980911980 create(android.app.Activity activity, boolean z) {
        return create(activity, z, false);
    }

    public static dev.epro.r0.K8888766238980911980 create(android.app.Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2);
    }

    public static dev.epro.r0.K8888766238980911980 create(android.app.Activity activity) {
        return create(activity, false);
    }
}
