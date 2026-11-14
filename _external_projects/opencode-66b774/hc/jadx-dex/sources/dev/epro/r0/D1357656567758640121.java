package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1357656567758640121 {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.util.List d;
    public java.util.List e;
    public java.lang.String f;
    public int g;
    public int h;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static dev.epro.r0.D1357656567758640121 a(android.util.JsonReader jsonReader) throws java.io.IOException {
        int i;
        dev.epro.r0.D1357656567758640121 d1357656567758640121 = new dev.epro.r0.D1357656567758640121();
        d1357656567758640121.g = 1;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        d1357656567758640121.d = list;
        d1357656567758640121.e = list;
        d1357656567758640121.h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            int i2 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        java.lang.String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 5;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 7;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 1;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                d1357656567758640121.g = i2;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 8;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 4;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 2;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 6;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            default:
                                dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                break;
                        }
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case -1938755376:
                    if (!strNextName.equals("error_message")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.c = jsonReader.nextString();
                    }
                    break;
                case -1851537225:
                    if (!strNextName.equals("consent_form_base_url")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.b = jsonReader.nextString();
                    }
                    break;
                case -1734348803:
                    if (!strNextName.equals("client_side_pingback_url")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.f = jsonReader.nextString();
                    }
                    break;
                case -1324537865:
                    if (!strNextName.equals("privacy_options_required")) {
                        jsonReader.skipValue();
                    } else {
                        java.lang.String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            d1357656567758640121.h = i2;
                        } else if (iHashCode == 389487519) {
                            if (!strNextString2.equals("REQUIRED")) {
                                dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            } else {
                                i2 = 2;
                                d1357656567758640121.h = i2;
                            }
                        } else if (iHashCode == 433141802 && strNextString2.equals("UNKNOWN")) {
                            i2 = 1;
                            d1357656567758640121.h = i2;
                        } else {
                            dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                        }
                    }
                    break;
                case -1161803523:
                    if (!strNextName.equals("actions")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.e = new java.util.ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            dev.epro.r0.O15088527058212365015 o15088527058212365015 = new dev.epro.r0.O15088527058212365015();
                            o15088527058212365015.b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                java.lang.String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        java.lang.String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 == 64208429) {
                                            if (!strNextString3.equals("CLEAR")) {
                                                dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            } else {
                                                i = 3;
                                                o15088527058212365015.b = i;
                                            }
                                        } else if (iHashCode3 == 82862015) {
                                            if (!strNextString3.equals("WRITE")) {
                                                dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            } else {
                                                i = 2;
                                                o15088527058212365015.b = i;
                                            }
                                        } else if (iHashCode3 == 1856333582 && strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                            i = 1;
                                            o15088527058212365015.b = i;
                                        } else {
                                            dev.epro.r0.Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                    break;
                                } else if (strNextName2.equals("args_json")) {
                                    o15088527058212365015.a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            d1357656567758640121.e.add(o15088527058212365015);
                        }
                        jsonReader.endArray();
                    }
                    break;
                case -986806987:
                    if (!strNextName.equals("request_info_keys")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.d = new java.util.ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            d1357656567758640121.d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    }
                    break;
                case -790907624:
                    if (!strNextName.equals("consent_form_payload")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.a = jsonReader.nextString();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            return null;
        }
        jsonReader.endObject();
        return d1357656567758640121;
    }
}
