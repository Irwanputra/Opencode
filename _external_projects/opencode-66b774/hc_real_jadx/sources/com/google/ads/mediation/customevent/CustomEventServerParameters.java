package com.google.ads.mediation.customevent;

import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import org.jasypt.digest.StandardStringDigester;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class CustomEventServerParameters extends MediationServerParameters {

    @MediationServerParameters.Parameter(name = "class_name", required = true)
    public String className;

    @MediationServerParameters.Parameter(name = "label", required = true)
    public String label;

    @MediationServerParameters.Parameter(name = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, required = StandardStringDigester.DEFAULT_UNICODE_NORMALIZATION_IGNORED)
    public String parameter = null;
}
