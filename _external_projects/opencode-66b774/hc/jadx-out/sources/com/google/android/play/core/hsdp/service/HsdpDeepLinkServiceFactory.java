package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import dev.epro.r0.E17835566830149380994;
import dev.epro.r0.J6457333644812339360;
import dev.epro.r0.K8888766238980911980;
import dev.epro.r0.P13747563277035175218;
import dev.epro.r0.Q6203700555324584864;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.U9296548531947164180;
import dev.epro.r0.V9493494307739248620;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static K8888766238980911980 create(Context context) {
        return createInternal(context, false, true);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z) {
        return z ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static K8888766238980911980 createInternal(Context context, boolean z, boolean z2) {
        if (!z2 && !(context instanceof Activity)) {
            S10973172697741180971.j("Context must be an Activity when using activity-based HSDP.");
            return null;
        }
        if (z && !(context instanceof Activity)) {
            S10973172697741180971.j("Context must be an Activity when enabling loading panel.");
            return null;
        }
        boolean z3 = false;
        boolean z4 = ActivityManager.isRunningInTestHarness() || (Build.VERSION.SDK_INT >= 29 && ActivityManager.isRunningInUserTestHarness());
        return new J6457333644812339360(context, P13747563277035175218.o(new Q6203700555324584864(context, z4)), P13747563277035175218.o(new U9296548531947164180(context, z3)), z4, z2, z);
    }

    public static /* synthetic */ E17835566830149380994 lambda$createInternal$0(Context context, boolean z) {
        return new V9493494307739248620(createHpoaServiceIntent(context, z), (Activity) context);
    }

    public static K8888766238980911980 create(Activity activity, boolean z) {
        return create(activity, z, false);
    }

    public static K8888766238980911980 create(Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2);
    }

    public static K8888766238980911980 create(Activity activity) {
        return create(activity, false);
    }
}
