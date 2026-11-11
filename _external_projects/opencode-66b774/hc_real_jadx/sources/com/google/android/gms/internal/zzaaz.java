package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaaz extends zzbfm {
    public static final Parcelable.Creator<zzaaz> CREATOR = new zzaba();
    public final boolean zzcpw;
    public final List<String> zzcpx;

    public zzaaz() {
        this(false, Collections.emptyList());
    }

    public zzaaz(boolean z, List<String> list) {
        this.zzcpw = z;
        this.zzcpx = list;
    }

    public static zzaaz zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaaz();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    zzakb.zzc("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaaz(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.zzcpw);
        zzbfp.zzb(parcel, 3, this.zzcpx, false);
        zzbfp.zzai(parcel, zze);
    }
}
