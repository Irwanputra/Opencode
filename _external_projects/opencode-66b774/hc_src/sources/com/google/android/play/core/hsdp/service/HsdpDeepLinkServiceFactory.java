package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import dev.epro.r0.E17835566830149380994;
import dev.epro.r0.K8888766238980911980;
import dev.epro.r0.V9493494307739248620;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static dev.epro.r0.K8888766238980911980 createInternal(android.content.Context r10, boolean r11, boolean r12) {
        /*
            r0 = 0
            if (r12 != 0) goto Le
            boolean r1 = r10 instanceof android.app.Activity
            if (r1 == 0) goto L8
            goto Le
        L8:
            java.lang.String r10 = "Context must be an Activity when using activity-based HSDP."
            dev.epro.r0.S10973172697741180971.j(r10)
            return r0
        Le:
            if (r11 == 0) goto L1b
            boolean r1 = r10 instanceof android.app.Activity
            if (r1 == 0) goto L15
            goto L1b
        L15:
            java.lang.String r10 = "Context must be an Activity when enabling loading panel."
            dev.epro.r0.S10973172697741180971.j(r10)
            return r0
        L1b:
            boolean r0 = android.app.ActivityManager.isRunningInTestHarness()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L2f
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L31
            boolean r0 = dev.epro.r0.I9104972935492198939.s()
            if (r0 == 0) goto L31
        L2f:
            r7 = r2
            goto L32
        L31:
            r7 = r1
        L32:
            dev.epro.r0.J6457333644812339360 r3 = new dev.epro.r0.J6457333644812339360
            dev.epro.r0.Q6203700555324584864 r0 = new dev.epro.r0.Q6203700555324584864
            r0.<init>(r10, r7)
            dev.epro.r0.H3430986877638506198 r5 = dev.epro.r0.P13747563277035175218.o(r0)
            dev.epro.r0.U9296548531947164180 r0 = new dev.epro.r0.U9296548531947164180
            r0.<init>(r10, r1)
            dev.epro.r0.H3430986877638506198 r6 = dev.epro.r0.P13747563277035175218.o(r0)
            r4 = r10
            r9 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):dev.epro.r0.K8888766238980911980");
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
