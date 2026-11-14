package dev.epro.r0;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D1357656567758640121 {
    public String a;
    public String b;
    public String c;
    public List d;
    public List e;
    public String f;
    public int g;
    public int h;

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
            String nextName = jsonReader.nextName();
            int i2 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        String nextString = jsonReader.nextString();
                        switch (nextString.hashCode()) {
                            case -2058725357:
                                if (!nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 5;
                                    d1357656567758640121.g = i2;
                                }
                            case -1969035850:
                                if (!nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 7;
                                    d1357656567758640121.g = i2;
                                }
                            case -1263695752:
                                if (!nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 1;
                                    d1357656567758640121.g = i2;
                                }
                            case -954325659:
                                if (!nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                }
                                d1357656567758640121.g = i2;
                            case -918677260:
                                if (!nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 8;
                                    d1357656567758640121.g = i2;
                                }
                            case 429411856:
                                if (!nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 4;
                                    d1357656567758640121.g = i2;
                                }
                            case 467888915:
                                if (!nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 2;
                                    d1357656567758640121.g = i2;
                                }
                            case 1725474845:
                                if (!nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 6;
                                    d1357656567758640121.g = i2;
                                }
                            default:
                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                break;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        d1357656567758640121.c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        d1357656567758640121.b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        d1357656567758640121.f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        String nextString2 = jsonReader.nextString();
                        int hashCode = nextString2.hashCode();
                        if (hashCode == -1888946261) {
                            if (!nextString2.equals("NOT_REQUIRED")) {
                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            d1357656567758640121.h = i2;
                        } else if (hashCode != 389487519) {
                            if (hashCode == 433141802 && nextString2.equals("UNKNOWN")) {
                                i2 = 1;
                                d1357656567758640121.h = i2;
                            }
                            Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            break;
                        } else if (nextString2.equals("REQUIRED")) {
                            i2 = 2;
                            d1357656567758640121.h = i2;
                        } else {
                            Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        d1357656567758640121.e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            O15088527058212365015 o15088527058212365015 = new O15088527058212365015();
                            o15088527058212365015.b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                int hashCode2 = nextName2.hashCode();
                                if (hashCode2 != -2105551094) {
                                    if (hashCode2 == 1583758243 && nextName2.equals("action_type")) {
                                        String nextString3 = jsonReader.nextString();
                                        int hashCode3 = nextString3.hashCode();
                                        if (hashCode3 != 64208429) {
                                            if (hashCode3 != 82862015) {
                                                if (hashCode3 == 1856333582 && nextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    i = 1;
                                                    o15088527058212365015.b = i;
                                                }
                                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                                break;
                                            } else if (nextString3.equals("WRITE")) {
                                                i = 2;
                                                o15088527058212365015.b = i;
                                            } else {
                                                Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                        } else if (nextString3.equals("CLEAR")) {
                                            i = 3;
                                            o15088527058212365015.b = i;
                                        } else {
                                            Q11088980322693754445.h("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (nextName2.equals("args_json")) {
                                    o15088527058212365015.a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            d1357656567758640121.e.add(o15088527058212365015);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        d1357656567758640121.d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            d1357656567758640121.d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        d1357656567758640121.a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
            return null;
        }
        jsonReader.endObject();
        return d1357656567758640121;
    }
}
