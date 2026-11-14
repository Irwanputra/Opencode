package dev.epro.r0;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D1357656567758640121 {
    public String a;
    public String b;
    public String c;
    public List d;
    public List e;
    public String f;
    public int g;
    public int h;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static D1357656567758640121 a(JsonReader jsonReader) {
        int i;
        D1357656567758640121 d1357656567758640121 = new D1357656567758640121();
        d1357656567758640121.g = 1;
        List list = Collections.EMPTY_LIST;
        d1357656567758640121.d = list;
        d1357656567758640121.e = list;
        d1357656567758640121.h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i2 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 5;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 7;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 1;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                d1357656567758640121.g = i2;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 8;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 4;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 2;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                } else {
                                    i2 = 6;
                                    d1357656567758640121.g = i2;
                                }
                                break;
                            default:
                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
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
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            d1357656567758640121.h = i2;
                        } else if (iHashCode == 389487519) {
                            if (!strNextString2.equals("REQUIRED")) {
                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            } else {
                                i2 = 2;
                                d1357656567758640121.h = i2;
                            }
                        } else if (iHashCode == 433141802 && strNextString2.equals("UNKNOWN")) {
                            i2 = 1;
                            d1357656567758640121.h = i2;
                        } else {
                            Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                        }
                    }
                    break;
                case -1161803523:
                    if (!strNextName.equals("actions")) {
                        jsonReader.skipValue();
                    } else {
                        d1357656567758640121.e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            O15088527058212365015 o15088527058212365015 = new O15088527058212365015();
                            o15088527058212365015.b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 == 64208429) {
                                            if (!strNextString3.equals("CLEAR")) {
                                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            } else {
                                                i = 3;
                                                o15088527058212365015.b = i;
                                            }
                                        } else if (iHashCode3 == 82862015) {
                                            if (!strNextString3.equals("WRITE")) {
                                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            } else {
                                                i = 2;
                                                o15088527058212365015.b = i;
                                            }
                                        } else if (iHashCode3 == 1856333582 && strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                            i = 1;
                                            o15088527058212365015.b = i;
                                        } else {
                                            Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
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
                        d1357656567758640121.d = new ArrayList();
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
