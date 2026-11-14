package dev.epro.r0;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G5446205426701161097 {
    public static final V9316690655140275436 d = V9316690655140275436.r(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    public final Application a;
    public final SharedPreferences b;
    public final HashSet c;

    public G5446205426701161097(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String str;
        int i = V9316690655140275436.f;
        Set<String> stringSet = this.b.getStringSet("stored_info", A14883423086378219798.m);
        if (stringSet.isEmpty()) {
            stringSet = d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.a;
            B18059876494342031474 u = E2166724654553415323.u(application, str2);
            if (u == null) {
                "Fetching request info: failed for key: ".concat(String.valueOf(str2));
            } else {
                Object obj = application.getSharedPreferences(u.a, 0).getAll().get(u.b);
                if (obj == null) {
                    "Stored info not exists: ".concat(String.valueOf(str2));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        "Failed to fetch stored info: ".concat(String.valueOf(str2));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }
}
