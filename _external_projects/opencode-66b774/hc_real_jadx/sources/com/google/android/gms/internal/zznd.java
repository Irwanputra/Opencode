package com.google.android.gms.internal;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznd {
    private final Collection<zzmx<?>> zzbhd = new ArrayList();
    private final Collection<zzmx<String>> zzbhe = new ArrayList();
    private final Collection<zzmx<String>> zzbhf = new ArrayList();

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzmx<?> zzmxVar : this.zzbhd) {
            if (zzmxVar.getSource() == 1) {
                zzmxVar.zza(editor, (SharedPreferences.Editor) zzmxVar.zzc(jSONObject));
            }
        }
    }

    public final void zza(zzmx zzmxVar) {
        this.zzbhd.add(zzmxVar);
    }

    public final void zzb(zzmx<String> zzmxVar) {
        this.zzbhe.add(zzmxVar);
    }

    public final void zzc(zzmx<String> zzmxVar) {
        this.zzbhf.add(zzmxVar);
    }

    public final List<String> zziw() {
        ArrayList arrayList = new ArrayList();
        Iterator<zzmx<String>> it = this.zzbhe.iterator();
        while (it.hasNext()) {
            String str = (String) zzkb.zzif().zzd(it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<String> zzix() {
        List<String> zziw = zziw();
        Iterator<zzmx<String>> it = this.zzbhf.iterator();
        while (it.hasNext()) {
            String str = (String) zzkb.zzif().zzd(it.next());
            if (str != null) {
                zziw.add(str);
            }
        }
        return zziw;
    }
}
