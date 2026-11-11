package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzzv;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p131.p161.p162.p193.p194.p199.p202.RunnableC2414;

@Keep
@zzzv
@KeepName
/* loaded from: /tmp/opencode/hc_real.dex */
public class HttpClient implements zzt<com.google.android.gms.ads.internal.js.zza> {
    private final Context mContext;
    private final zzakd zzapr;

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$〺つふすそ, reason: contains not printable characters */
    public static class C0374 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final URL f2583;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ArrayList<C0376> f2584;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f2585;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final String f2586;

        public C0374(String str, URL url, ArrayList<C0376> arrayList, String str2) {
            this.f2585 = str;
            this.f2583 = url;
            this.f2584 = arrayList;
            this.f2586 = str2;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ, reason: contains not printable characters */
    public class C0375 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final boolean f2587;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final String f2588;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C0377 f2589;

        public C0375(boolean z, C0377 c0377, String str) {
            this.f2587 = z;
            this.f2589 = c0377;
            this.f2588 = str;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0376 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final String f2590;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f2591;

        public C0376(String str, String str2) {
            this.f2591 = str;
            this.f2590 = str2;
        }
    }

    @zzzv
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$びぐびあび, reason: contains not printable characters */
    public static class C0377 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f2592;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final List<C0376> f2593;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f2594;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final String f2595;

        public C0377(String str, int i, List<C0376> list, String str2) {
            this.f2594 = str;
            this.f2592 = i;
            this.f2593 = list;
            this.f2595 = str2;
        }
    }

    public HttpClient(Context context, zzakd zzakdVar) {
        this.mContext = context;
        this.zzapr = zzakdVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00e9: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x00e9 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.C0375 zza(com.google.android.gms.ads.internal.gmsg.HttpClient.C0374 r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.f2583     // Catch: java.lang.Throwable -> Ld5 java.lang.Exception -> Ld7
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> Ld5 java.lang.Exception -> Ld7
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> Ld5 java.lang.Exception -> Ld7
            com.google.android.gms.internal.zzahn r3 = com.google.android.gms.ads.internal.zzbs.zzei()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            android.content.Context r4 = r12.mContext     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            com.google.android.gms.internal.zzakd r5 = r12.zzapr     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r5 = r5.zzcv     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r3.zza(r4, r5, r0, r2)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.ArrayList<com.google.android.gms.ads.internal.gmsg.HttpClient$げつ〴ぬぐ> r3 = r13.f2584     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            int r4 = r3.size()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5 = 0
        L1e:
            if (r5 >= r4) goto L30
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            int r5 = r5 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$げつ〴ぬぐ r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.C0376) r6     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r7 = r6.f2591     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r6 = r6.f2590     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r2.addRequestProperty(r7, r6)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            goto L1e
        L30:
            java.lang.String r3 = r13.f2586     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r4 = 1
            if (r3 != 0) goto L56
            r2.setDoOutput(r4)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r3 = r13.f2586     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            int r5 = r3.length     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r2.setFixedLengthStreamingMode(r5)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.<init>(r6)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.write(r3)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.close()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            goto L57
        L56:
            r3 = r1
        L57:
            com.google.android.gms.internal.zzajv r5 = new com.google.android.gms.internal.zzajv     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.<init>()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.zza(r2, r3)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r3.<init>()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.Map r6 = r2.getHeaderFields()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            if (r6 == 0) goto La7
            java.util.Map r6 = r2.getHeaderFields()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
        L76:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            if (r7 == 0) goto La7
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
        L8c:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            if (r9 == 0) goto L76
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            com.google.android.gms.ads.internal.gmsg.HttpClient$げつ〴ぬぐ r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$げつ〴ぬぐ     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.Object r11 = r7.getKey()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r10.<init>(r11, r9)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r3.add(r10)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            goto L8c
        La7:
            com.google.android.gms.ads.internal.gmsg.HttpClient$びぐびあび r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$びぐびあび     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r13 = r13.f2585     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            int r7 = r2.getResponseCode()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            com.google.android.gms.ads.internal.zzbs.zzei()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.io.InputStream r9 = r2.getInputStream()     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r8.<init>(r9)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r8 = com.google.android.gms.internal.zzahn.zza(r8)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r6.<init>(r13, r7, r3, r8)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.zza(r2, r7)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            java.lang.String r13 = r6.f2595     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r5.zzcr(r13)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r13.<init>(r4, r6, r1)     // Catch: java.lang.Exception -> Ld3 java.lang.Throwable -> Le8
            r2.disconnect()
            return r13
        Ld3:
            r13 = move-exception
            goto Ld9
        Ld5:
            r13 = move-exception
            goto Lea
        Ld7:
            r13 = move-exception
            r2 = r1
        Ld9:
            com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ     // Catch: java.lang.Throwable -> Le8
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Le8
            r3.<init>(r0, r1, r13)     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto Le7
            r2.disconnect()
        Le7:
            return r3
        Le8:
            r13 = move-exception
            r1 = r2
        Lea:
            if (r1 == 0) goto Lef
            r1.disconnect()
        Lef:
            goto Lf1
        Lf0:
            throw r13
        Lf1:
            goto Lf0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$〺つふすそ):com.google.android.gms.ads.internal.gmsg.HttpClient$くし〴〺ぅ");
    }

    private static C0374 zzd(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            zzakb.zzb("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C0376(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C0374(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        try {
            str = jSONObject.optString("http_request_id");
            C0375 zza = zza(zzd(jSONObject));
            if (zza.f2587) {
                jSONObject2.put("response", zza(zza.f2589));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.f2588);
            }
        } catch (Exception e) {
            zzakb.zzb("Error executing http request.", e);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e.toString());
            } catch (JSONException e2) {
                zzakb.zzb("Error executing http request.", e2);
            }
        }
        return jSONObject2;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(com.google.android.gms.ads.internal.js.zza zzaVar, Map map) {
        zzahh.zza(new RunnableC2414(this, map, zzaVar));
    }

    private static JSONObject zza(C0377 c0377) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c0377.f2594);
            String str = c0377.f2595;
            if (str != null) {
                jSONObject.put("body", str);
            }
            JSONArray jSONArray = new JSONArray();
            for (C0376 c0376 : c0377.f2593) {
                jSONArray.put(new JSONObject().put("key", c0376.f2591).put("value", c0376.f2590));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c0377.f2592);
        } catch (JSONException e) {
            zzakb.zzb("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }
}
