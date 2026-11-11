package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamw implements com.google.android.gms.ads.internal.gmsg.zzt<zzamp> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzamp zzampVar, Map map) {
        zzamp zzampVar2 = zzampVar;
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbna)).booleanValue()) {
            zzaoa zzsg = zzampVar2.zzsg();
            if (zzsg == null) {
                try {
                    zzaoa zzaoaVar = new zzaoa(zzampVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    zzampVar2.zza(zzaoaVar);
                    zzsg = zzaoaVar;
                } catch (NullPointerException e) {
                    e = e;
                    zzakb.zzb("Unable to parse videoMeta message.", e);
                    zzbs.zzem().zza(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e2) {
                    e = e2;
                    zzakb.zzb("Unable to parse videoMeta message.", e);
                    zzbs.zzem().zza(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (zzakb.zzae(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                zzakb.zzbx(sb.toString());
            }
            zzsg.zza(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
