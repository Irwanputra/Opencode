package p107.p108.p109.p110.p121;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1943 extends Thread {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final String f8470 = C1943.class.getSimpleName();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public volatile boolean f8471;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8472 = 0;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f8473;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ConnectivityManager f8474;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f8475;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4032(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getState() != null) {
            NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) App.f3759.getSystemService(Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf")))).getActiveNetworkInfo();
            if (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected() && activeNetworkInfo2.getType() == 0) {
                return activeNetworkInfo.getState().equals(NetworkInfo.State.CONNECTED);
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i;
        while (this.f8471) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            this.f8474 = (ConnectivityManager) App.f3759.getSystemService(Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf")));
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(Crypt.a(Crypt.xrc("J`>\u001e7f\u001cff\u001bg9Kf<N1hMek@ff\u001d`mHa<\u00194oI1hAj>IdjN3f\u001cbmJb;\u001ed:NdoL0gM7>\u001c"))).openConnection();
                httpsURLConnection.setRequestMethod(Crypt.a(Crypt.xrc("Kfj\u001b19\u001d6;J3n@6>H0jIef\u00191hN6fK0o\u001d`")));
                httpsURLConnection.setConnectTimeout(App.f3762.getInt(Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b")), 10) * 1000);
                httpsURLConnection.setRequestProperty(Crypt.a(Crypt.xrc("HjnHbn@1l@1>N3>Nf;\u001cdfLdnOdm\u001ceoKk")), App.f3761);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        stringBuffer.append(readLine);
                    }
                }
                bufferedReader.close();
                this.f8473 = httpsURLConnection.getResponseMessage();
                i = httpsURLConnection.getResponseCode();
            } catch (Exception unused2) {
                i = 0;
            }
            this.f8475 = i;
            String str = f8470;
            SharedPreferences sharedPreferences = App.f3762;
            String a = Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"));
            boolean z = sharedPreferences.getBoolean(a, false);
            String a2 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
            String a3 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
            if (z && this.f8472 == 4) {
                this.f8472 = 0;
                if (m4032(this.f8474) && (SSHTunnelService.f4041 || C0753.m2042())) {
                    C2098.m4197(new SimpleDateFormat(a2, Locale.getDefault()), C2098.m4207(a3), Crypt.a(Crypt.xrc("J`;Ac>Ak=\u001aj>Ibm@0n\u001e7gMjiMk<\u001c0jIcf\u001a6kHjo\u001db=\u001af;\u001dbhLghKejAe:\u001eej\u001a`m@")), str);
                    ((C1216) App.f3760).m2722(false);
                }
            }
            int i2 = this.f8475;
            if (200 > i2 || i2 > 399) {
                C2098.m4197(new SimpleDateFormat(a2, Locale.getDefault()), C2098.m4207(a3), Crypt.a(Crypt.xrc("\u001dam\u001a6f@k9K69MknA`=LfiN`9H0>HgfNaj\u001a4<O0iAkiHd9L4>H1oLk9\u001cg9O4mLg9A")), str);
                this.f8472++;
            } else {
                StringBuilder m4207 = C2098.m4207(a3);
                C2098.m4199(new SimpleDateFormat(a2, Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("Ndk@`=M7iJkhNgi\u001dkmAcf\u001dd:Na;If>\u001b3kJdmAeiJg9\u001cdlNg9Ikh\u001dk;M0<\u001d79Jfo@")));
                m4207.append(this.f8475);
                m4207.append(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")));
                m4207.append(this.f8473);
                C1687.m3666(str, m4207.toString());
            }
            if (App.f3762.getBoolean(a, false)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused3) {
                }
                if (!m4032(this.f8474)) {
                    C2098.m4197(new SimpleDateFormat(a2, Locale.getDefault()), C2098.m4207(a3), Crypt.a(Crypt.xrc("\u001beh@f;K3>\u001bj;Oa=L3:\u001a`=\u001c`l@ej\u00191mKfnA1kJk:Mf9HdgK`<\u001b`fIj=N1iJ`j@ei\u001d")), f8470);
                    ((C1216) App.f3760).m2722(true);
                }
            } else {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused4) {
                }
            }
        }
        interrupt();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4033() {
        this.f8471 = true;
        start();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4034() {
        this.f8471 = false;
        if (isAlive()) {
            interrupt();
        }
    }
}
