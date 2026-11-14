package dev.epro.r0;

import ads_mobile_sdk.ao;
import ads_mobile_sdk.yu;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S12091007627917879797 extends yu {
    public static I16631908410500040363 n(int i, String str) {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("bk", str);
        i16631908410500040363.t("sk", str);
        int i2 = 1;
        if (i == 1) {
            i2 = -1;
        } else if (i == 2) {
            i2 = 0;
        } else if (i != 3) {
            if (i != 4) {
                throw null;
            }
            i2 = 2;
        }
        i16631908410500040363.s("type", Integer.valueOf(i2));
        return i16631908410500040363;
    }

    public final String o() {
        P16422848101170923038 p16422848101170923038 = new P16422848101170923038();
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("consent_key", "gad_has_consent_for_cookies");
        i16631908410500040363.t("consent_value_match", "0");
        i16631908410500040363.s("consent_value_type", 1);
        p16422848101170923038.q(i16631908410500040363);
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        i166319084105000403632.t("consent_key", "IABTCF_gdprApplies");
        i166319084105000403632.t("consent_value_match", "1");
        i166319084105000403632.s("consent_value_type", 1);
        p16422848101170923038.q(i166319084105000403632);
        return (String) a("gads:full_consent_check_map", p16422848101170923038.toString(), ao.a$6);
    }

    public final String q() {
        P16422848101170923038 p16422848101170923038 = new P16422848101170923038();
        p16422848101170923038.q(n(2, "IABTCF_AddtlConsent"));
        p16422848101170923038.q(n(4, "IABConsent_CMPPresent"));
        p16422848101170923038.q(n(3, "IABTCF_CmpSdkID"));
        p16422848101170923038.q(n(2, "IABConsent_ConsentString"));
        p16422848101170923038.q(n(3, "IABTCF_gdprApplies"));
        p16422848101170923038.q(n(2, "IABGPP_HDR_GppString"));
        p16422848101170923038.q(n(2, "IABGPP_GppSID"));
        p16422848101170923038.q(n(3, "gad_has_consent_for_cookies"));
        p16422848101170923038.q(n(2, "IABConsent_ParsedPurposeConsents"));
        p16422848101170923038.q(n(2, "personalized_ad_status"));
        p16422848101170923038.q(n(3, "IABTCF_PolicyVersion"));
        p16422848101170923038.q(n(2, "IABUSPrivacy_String"));
        p16422848101170923038.q(n(2, "IABTCF_PurposeConsents"));
        p16422848101170923038.q(n(3, "gad_rdp"));
        p16422848101170923038.q(n(2, "IABConsent_SubjectToGDPR"));
        p16422848101170923038.q(n(2, "IABTCF_TCString"));
        p16422848101170923038.q(n(2, "IABConsent_ParsedVendorConsents"));
        p16422848101170923038.q(n(2, "UMP_eids"));
        return (String) a("gads:sp:json_string", p16422848101170923038.toString(), ao.a$6);
    }
}
