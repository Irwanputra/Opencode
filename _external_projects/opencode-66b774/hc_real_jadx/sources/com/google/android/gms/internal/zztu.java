package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.jasypt.digest.StandardStringDigester;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zztu {
    private static final Charset UTF_8 = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);
    public static final zztt<JSONObject> zzccb = new zztw();
    private static zztr<InputStream> zzccc = zztv.zzccd;

    public static final /* synthetic */ InputStream zzg(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(UTF_8));
    }
}
