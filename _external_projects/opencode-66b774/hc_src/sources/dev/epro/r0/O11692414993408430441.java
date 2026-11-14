package dev.epro.r0;

import ads_mobile_sdk.az1;
import ads_mobile_sdk.b;
import ads_mobile_sdk.c90;
import ads_mobile_sdk.er0;
import ads_mobile_sdk.fa;
import ads_mobile_sdk.g8;
import ads_mobile_sdk.gj0;
import ads_mobile_sdk.gq1;
import ads_mobile_sdk.hb1;
import ads_mobile_sdk.i9;
import ads_mobile_sdk.is;
import ads_mobile_sdk.m3;
import ads_mobile_sdk.o3;
import ads_mobile_sdk.og;
import ads_mobile_sdk.qg;
import ads_mobile_sdk.r;
import ads_mobile_sdk.r33;
import ads_mobile_sdk.r80;
import ads_mobile_sdk.sb3;
import ads_mobile_sdk.z0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.view.View;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O11692414993408430441 {
    public static O11692414993408430441 j;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public O11692414993408430441(Application application) {
        this.a = this;
        Z6787503239643758223 z6787503239643758223 = new Z6787503239643758223(application);
        this.b = z6787503239643758223;
        byte b = 1;
        D9201356603168736774 a = D9201356603168736774.a(new V2629913480010334566(z6787503239643758223, b));
        this.c = a;
        D9201356603168736774 a2 = D9201356603168736774.a(D15445857918358799638.m);
        this.d = a2;
        D9201356603168736774 a3 = D9201356603168736774.a(new M204440408817344908(new C7482541032955929215(this), (byte) 15));
        this.e = a3;
        V5098515201292188072 v5098515201292188072 = new V5098515201292188072(z6787503239643758223, a, b);
        D9201356603168736774 a4 = D9201356603168736774.a(new U11450443558875589191((byte) 17));
        this.f = a4;
        byte b2 = 0;
        M1458640882343060544 m1458640882343060544 = new M1458640882343060544(z6787503239643758223, a, D9201356603168736774.a(new V5098515201292188072(z6787503239643758223, D9201356603168736774.a(new V2629913480010334566(z6787503239643758223, b2)), b2)));
        this.i = m1458640882343060544;
        D9201356603168736774 a5 = D9201356603168736774.a(new I1632105416032993715(a2, z6787503239643758223, D9201356603168736774.a(new V2629913480010334566(z6787503239643758223, (byte) 2)), (byte) 23));
        this.g = a5;
        this.h = D9201356603168736774.a(new J15730374346044043770(a, new C4341747165502163559(z6787503239643758223, a2, a, a3, v5098515201292188072, new J15730374346044043770(a4, m1458640882343060544, a, a5, (byte) 24), a4, a5), a3, a5, (byte) 28));
    }

    public static O11692414993408430441 b(Context context) {
        O11692414993408430441 o11692414993408430441;
        synchronized (O11692414993408430441.class) {
            try {
                o11692414993408430441 = j;
                if (o11692414993408430441 == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    o11692414993408430441 = new O11692414993408430441(application);
                    j = o11692414993408430441;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o11692414993408430441;
    }

    public c90 a() {
        Z14316276734425062790.d((Context) this.c, Context.class);
        Z14316276734425062790.d((HashMap) this.g, Map.class);
        Z14316276734425062790.d((V5431423861497278836) this.h, V5431423861497278836.class);
        Z14316276734425062790.d((sb3) this.i, sb3.class);
        r80 r80Var = (r80) this.a;
        m3 m3Var = (m3) this.b;
        Context context = (Context) this.c;
        View view = (View) this.d;
        Activity activity = (Activity) this.e;
        String str = (String) this.f;
        HashMap hashMap = (HashMap) this.g;
        V5431423861497278836 v5431423861497278836 = (V5431423861497278836) this.h;
        sb3 sb3Var = (sb3) this.i;
        c90 c90Var = new c90();
        c90Var.c = hb1.a(sb3Var);
        hb1 hb1Var = hb1.b;
        c90Var.d = str == null ? hb1Var : new hb1(str);
        hb1 a = hb1.a(v5431423861497278836);
        c90Var.e = a;
        V2597580950516131749 v2597580950516131749 = (V2597580950516131749) m3Var.c;
        hb1 hb1Var2 = r80Var.b;
        V2597580950516131749 v25975809505161317492 = r80Var.s;
        c90Var.f = new qg(a, v2597580950516131749, hb1Var2, v25975809505161317492, (byte) 1);
        c90Var.g = new az1(a, v2597580950516131749, v25975809505161317492, (byte) 14);
        hb1 a2 = hb1.a(hashMap);
        c90Var.h = a2;
        hb1 hb1Var3 = c90Var.e;
        V2597580950516131749 v25975809505161317493 = (V2597580950516131749) m3Var.c;
        V2597580950516131749 v25975809505161317494 = r80Var.s;
        c90Var.i = new z0((V2597580950516131749) hb1Var3, v25975809505161317493, a2, v25975809505161317494, (byte) 1);
        c90Var.j = new z0((V2597580950516131749) hb1Var3, v25975809505161317493, r80Var.j, v25975809505161317494, (byte) 6);
        c90Var.k = new er0(hb1Var3, v25975809505161317493, c90Var.c, a2, v25975809505161317494, (byte) 1);
        c90Var.l = new o3(hb1Var3, v25975809505161317493, v25975809505161317494, (byte) 1);
        hb1 a3 = hb1.a(context);
        c90Var.m = a3;
        hb1 hb1Var4 = c90Var.e;
        V2597580950516131749 v25975809505161317495 = (V2597580950516131749) m3Var.c;
        hb1 hb1Var5 = c90Var.c;
        hb1 hb1Var6 = c90Var.h;
        V2597580950516131749 v25975809505161317496 = r80Var.s;
        c90Var.n = new g8((V2597580950516131749) hb1Var4, v25975809505161317495, (V2597580950516131749) hb1Var5, a3, (V2597580950516131749) hb1Var6, v25975809505161317496, (byte) 4);
        hb1 hb1Var7 = r80Var.b;
        hb1 hb1Var8 = r80Var.j;
        c90Var.f16o = new og((V2597580950516131749) hb1Var4, v25975809505161317495, (V2597580950516131749) hb1Var6, hb1Var7, (V2597580950516131749) hb1Var5, hb1Var8, v25975809505161317496);
        c90Var.p = new z0((V2597580950516131749) hb1Var4, v25975809505161317495, hb1Var7, v25975809505161317496, (byte) 9);
        c90Var.q = new er0(hb1Var4, v25975809505161317495, hb1Var6, hb1Var7, v25975809505161317496, (byte) 6);
        c90Var.r = new z0((V2597580950516131749) hb1Var4, (V2597580950516131749) hb1Var6, hb1Var8, v25975809505161317496, (byte) 0);
        int i = r33.c;
        List j2 = O14838623545224379975.j(11);
        List j3 = O14838623545224379975.j(0);
        j2.add(c90Var.f);
        j2.add(c90Var.g);
        j2.add(c90Var.i);
        j2.add(c90Var.j);
        j2.add(c90Var.k);
        j2.add(c90Var.l);
        j2.add(c90Var.n);
        j2.add(c90Var.f16o);
        j2.add(c90Var.p);
        j2.add(c90Var.q);
        j2.add(c90Var.r);
        c90Var.s = new r33(j2, j3);
        hb1 hb1Var9 = view == null ? hb1Var : new hb1(view);
        if (activity != null) {
            hb1Var = new hb1(activity);
        }
        hb1 hb1Var10 = hb1Var;
        hb1 hb1Var11 = c90Var.e;
        V2597580950516131749 v25975809505161317497 = (V2597580950516131749) m3Var.c;
        V2597580950516131749 v25975809505161317498 = r80Var.s;
        c90Var.u = new r((V2597580950516131749) hb1Var11, v25975809505161317497, hb1Var9, hb1Var10, v25975809505161317498);
        hb1 hb1Var12 = hb1Var9;
        gj0 gj0Var = new gj0(new b(c90Var.m, (byte) 18));
        c90Var.v = gj0Var;
        c90Var.w = new er0(hb1Var11, v25975809505161317497, gj0Var, hb1Var12, v25975809505161317498, (byte) 3);
        c90Var.x = new i9(hb1Var11, v25975809505161317497, c90Var.h, v25975809505161317498, (byte) 1);
        List j4 = O14838623545224379975.j(12);
        List j5 = O14838623545224379975.j(0);
        j4.add(c90Var.f);
        j4.add(c90Var.g);
        j4.add(c90Var.j);
        j4.add(c90Var.u);
        j4.add(c90Var.w);
        j4.add(c90Var.k);
        j4.add(c90Var.l);
        j4.add(c90Var.n);
        j4.add(c90Var.f16o);
        j4.add(c90Var.p);
        j4.add(c90Var.q);
        j4.add(c90Var.x);
        c90Var.y = new r33(j4, j5);
        hb1 hb1Var13 = c90Var.e;
        V2597580950516131749 v25975809505161317499 = (V2597580950516131749) m3Var.c;
        hb1 hb1Var14 = c90Var.h;
        V2597580950516131749 v259758095051613174910 = c90Var.v;
        V2597580950516131749 v259758095051613174911 = r80Var.s;
        c90Var.z = new gq1(hb1Var13, v25975809505161317499, hb1Var14, v259758095051613174910, v259758095051613174911, (byte) 2);
        c90Var.A = new is(hb1Var13, v25975809505161317499, hb1Var14, c90Var.m, v259758095051613174911);
        List j6 = O14838623545224379975.j(13);
        List j7 = O14838623545224379975.j(0);
        j6.add(c90Var.f);
        j6.add(c90Var.g);
        j6.add(c90Var.j);
        j6.add(c90Var.u);
        j6.add(c90Var.w);
        j6.add(c90Var.k);
        j6.add(c90Var.l);
        j6.add(c90Var.n);
        j6.add(c90Var.f16o);
        j6.add(c90Var.p);
        j6.add(c90Var.q);
        j6.add(c90Var.z);
        j6.add(c90Var.A);
        c90Var.B = new gj0(new fa(r80Var.u, r80Var.B, (V2597580950516131749) m3Var.c, c90Var.c, c90Var.d, c90Var.e, c90Var.s, c90Var.y, new r33(j6, j7), r80Var.s));
        return c90Var;
    }

    public D1357656567758640121 c(O11692414993408430441 o11692414993408430441) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) o11692414993408430441.a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    X17233818480995046658 x17233818480995046658 = (X17233818480995046658) o11692414993408430441.b;
                    if (x17233818480995046658 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        byte b = x17233818480995046658.c;
                        if (b != 1) {
                            jsonWriter.name("os_type");
                            int i = b - 1;
                            if (i == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = x17233818480995046658.a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = x17233818480995046658.b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) o11692414993408430441.c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) o11692414993408430441.d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) o11692414993408430441.e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    J15730374346044043770 j15730374346044043770 = (J15730374346044043770) o11692414993408430441.f;
                    if (j15730374346044043770 != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) j15730374346044043770.b;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) j15730374346044043770.c;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) j15730374346044043770.d;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<N16024463839079875704> list = (List) j15730374346044043770.e;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (N16024463839079875704 n16024463839079875704 : list) {
                                jsonWriter.beginObject();
                                Integer num4 = n16024463839079875704.a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = n16024463839079875704.b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = n16024463839079875704.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = n16024463839079875704.d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    I1632105416032993715 i1632105416032993715 = (I1632105416032993715) o11692414993408430441.g;
                    if (i1632105416032993715 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) i1632105416032993715.c;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) i1632105416032993715.d;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) i1632105416032993715.b;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((Y2677586711477821327) o11692414993408430441.h) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("4.0.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) o11692414993408430441.i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((Y2165537903987834679) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        D1357656567758640121 a = D1357656567758640121.a(new JsonReader(new StringReader(headerField)));
                        a.a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            D1357656567758640121 a2 = D1357656567758640121.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return a2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new I10210771329789820200(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new I10210771329789820200(2, "Error making request.", e2);
        }
    }

    public /* synthetic */ O11692414993408430441(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }
}
