package com.pairip.licensecheck;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class TrialClient {
    public static void stopTrial(android.content.Context context) {
        com.pairip.licensecheck.LicenseClient.stopTrial(context);
    }

    public static int checkTrialStatus(android.content.Context context) {
        java.util.Objects.requireNonNull(context, "Context must not be null.");
        return com.pairip.licensecheck.LicenseClient.checkTrialStatus().getStatusCode();
    }

    private TrialClient() {
    }
}
