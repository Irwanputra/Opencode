package dev.epro.r0;

import android.net.ConnectivityManager;
import android.net.Network;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class U1304231070282229830 implements R5909351061398077004 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Z11821137052809198413 b;

    public /* synthetic */ U1304231070282229830(Z11821137052809198413 z11821137052809198413, byte b) {
        this.a = b;
        this.b = z11821137052809198413;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.nio.channels.FileChannel] */
    @Override // dev.epro.r0.R5909351061398077004
    /* renamed from: run */
    public final void mo18run() {
        List list;
        HttpURLConnection httpURLConnection;
        Network network = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                Z11821137052809198413 z11821137052809198413 = this.b;
                R9704326227384281667 r9704326227384281667 = z11821137052809198413.a;
                if (z11821137052809198413.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String str = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = z11821137052809198413.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        int responseCode = z11821137052809198413.q.getResponseCode();
                        N12175049621887677679 n12175049621887677679 = new N12175049621887677679(new ArrayList(z11821137052809198413.e), responseCode, z11821137052809198413.q.getResponseMessage(), Collections.unmodifiableList(arrayList), str);
                        if (responseCode >= 300 && responseCode < 400 && (list = (List) n12175049621887677679.g.getAsMap().get("location")) != null) {
                            z11821137052809198413.f(1, 2, new E138661690457992157(z11821137052809198413, (String) list.get(0), n12175049621887677679, (byte) 3));
                            return;
                        }
                        z11821137052809198413.f598o = n12175049621887677679;
                        z11821137052809198413.d();
                        HttpURLConnection httpURLConnection2 = z11821137052809198413.q;
                        byte b2 = 5;
                        if (responseCode >= 400) {
                            InputStream errorStream = httpURLConnection2.getErrorStream();
                            z11821137052809198413.n = errorStream != null ? errorStream instanceof FileInputStream ? ((FileInputStream) errorStream).getChannel() : new R7728994933712354398(errorStream) : null;
                            r9704326227384281667.getClass();
                            r9704326227384281667.b(new L4980660535418402690(r9704326227384281667, b2), "onResponseStarted");
                            return;
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        z11821137052809198413.n = inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new R7728994933712354398(inputStream);
                        r9704326227384281667.getClass();
                        r9704326227384281667.b(new L4980660535418402690(r9704326227384281667, b2), "onResponseStarted");
                        return;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        str = z11821137052809198413.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, z11821137052809198413.q.getHeaderField(i)));
                    }
                    i++;
                }
            default:
                Z11821137052809198413 z118211370528091984132 = this.b;
                if (z118211370528091984132.f.get() == 8) {
                    return;
                }
                URL url = new URL(z118211370528091984132.m);
                HttpURLConnection httpURLConnection3 = z118211370528091984132.q;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                    z118211370528091984132.q = null;
                }
                long j = z118211370528091984132.v;
                if (j == -1) {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    z118211370528091984132.q = httpURLConnection;
                } else {
                    Network[] allNetworks = ((ConnectivityManager) z118211370528091984132.s.g.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            Network network2 = allNetworks[i2];
                            if (network2.getNetworkHandle() == j) {
                                network = network2;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (network == null) {
                        throw new U12617334649348278515();
                    }
                    httpURLConnection = (HttpURLConnection) network.openConnection(url);
                    z118211370528091984132.q = httpURLConnection;
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                if (!z118211370528091984132.d.containsKey("User-Agent")) {
                    z118211370528091984132.d.put("User-Agent", z118211370528091984132.c);
                }
                for (Map.Entry entry : z118211370528091984132.d.entrySet()) {
                    z118211370528091984132.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                z118211370528091984132.q.setRequestMethod(z118211370528091984132.i);
                P15983149023236604271 p15983149023236604271 = z118211370528091984132.j;
                if (p15983149023236604271 != null) {
                    W7359389094007644644 w7359389094007644644 = new W7359389094007644644(z118211370528091984132, z118211370528091984132.k, z118211370528091984132.b, z118211370528091984132.q, p15983149023236604271);
                    z118211370528091984132.r = w7359389094007644644;
                    w7359389094007644644.b(new T15299836306962536625(w7359389094007644644, z118211370528091984132.e.size() == 1, b), "start");
                    return;
                } else {
                    z118211370528091984132.l = 10;
                    z118211370528091984132.q.connect();
                    z118211370528091984132.l = 13;
                    z118211370528091984132.c(new S8612901348883321174(z118211370528091984132, new U1304231070282229830(z118211370528091984132, b), (byte) 2), "fireGetHeaders");
                    return;
                }
        }
    }
}
