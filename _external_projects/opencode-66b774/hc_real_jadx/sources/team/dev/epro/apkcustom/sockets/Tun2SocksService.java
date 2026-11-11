package team.dev.epro.apkcustom.sockets;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.bugs4u.proxyserver.core.Tun2Socks;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1842;
import p107.p108.p109.p110.p121.C1935;
import p107.p108.p109.p110.p121.C1944;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Tun2SocksService extends VpnService {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final String f4076 = Tun2SocksService.class.getSimpleName();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public SimpleDateFormat f4077;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Thread f4078;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Locale f4079;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f4080 = App.f3759.getString(2131820626);

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C0770 f4081;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public VpnService.Builder f4082;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ParcelFileDescriptor f4083;

    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("Of=\u001ce9@b9Ac:\u001dkl\u001cfl\u001ca:\u0019aoAeoJ7f\u0019f")));
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String[] m1680(Tun2SocksService tun2SocksService, String str) {
        tun2SocksService.getClass();
        try {
            if (!str.trim().isEmpty()) {
                File file = new File(str);
                if (!file.exists()) {
                    ((C1216) App.f3760).m2794();
                }
                String m2789 = ((C1216) App.f3760).m2789(file);
                if (!m2789.isEmpty() && m2789.contains(Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok")))) {
                    return m2789.split("\\[splitConfig\\]");
                }
            }
            return C1842.f8212;
        } catch (Exception unused) {
            return C1842.f8212;
        }
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7"));
        C2098.m4182(sharedPreferences, a, false);
        SharedPreferences sharedPreferences2 = App.f3762;
        String a2 = Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"));
        if (sharedPreferences2.getBoolean(a2, false) && !App.f3762.getBoolean(a, false)) {
            Intent intent = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
            intent.setAction(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")));
            App.f3759.startService(intent);
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
            C2098.m4182(App.f3762, a2, false);
        }
        m1685();
        super.onRevoke();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f4081 = new C0770();
        this.f4079 = Locale.getDefault();
        this.f4082 = new VpnService.Builder(this);
        this.f4077 = new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault());
        if (intent != null) {
            String action = intent.getAction();
            if (action.equals(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")))) {
                Thread thread = this.f4078;
                if (thread == null || !thread.isAlive()) {
                    C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), true);
                    synchronized (this) {
                        if (VpnService.prepare(this) != null) {
                            App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false).apply();
                            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false) && !App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false)) {
                                Intent intent2 = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                                intent2.setAction(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")));
                                App.f3759.startService(intent2);
                                App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false).apply();
                                App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false).apply();
                            }
                            String str = f4076;
                            C1687.m3697(str, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4077.format(new Date()) + "] <font color=#FF0000>VPNService can't establish, any 2 ways to fix it choose one of both");
                            C1687.m3697(str, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4077.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gk\u001eb9KjgAbk\u001akoOaf\u001cjoMgoH3k\u001d3h\u0019jl\u001ce:O4nNcn\u001adg\u001afhI4i\u001dcgMbhA7hM1m\u001e1h")));
                            C1687.m3697(str, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4077.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g:N4l\u001d1fI1>N4n\u0019ah\u001bbfAcgL7h\u001eai\u001c`>\u001ek>A6i\u001c3m\u001dj;\u001c`mKcmKk>\u001ae;\u001cdi\u001defJ`fH4h\u001c7iM6j\u001c`n@d=\u0019ah\u001def\u0019d:\u001b7f\u001979\u001akhNc9L6mN3lH6h@ci\u001c6:@`<\u001d3l\u00191lM`=\u001b0:Le<OakKkj\u001b7;\u001e3gIkjMbmAa:M`9\u001c0i\u001cfkK3;Odo\u001e7jLa<\u001agn\u00193h\u001a3mMk9Ajn\u001ad")));
                            m1685();
                        } else {
                            Locale.setDefault(new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"))));
                            C1944 c1944 = new C1944(this);
                            this.f4078 = c1944;
                            c1944.start();
                        }
                    }
                }
            } else if (action.equals(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")))) {
                App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false).apply();
                m1685();
            }
        }
        return 1;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public PendingIntent m1684() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        intent.addFlags(131072);
        return activity;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1685() {
        ParcelFileDescriptor parcelFileDescriptor = this.f4083;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.f4083 = null;
            } catch (Exception e) {
                String str = f4076;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(this.f4077.format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                m4207.append(e.getMessage());
                C1687.m3697(str, m4207.toString());
            }
        }
        Tun2Socks.Stop();
        Thread thread = this.f4078;
        if (thread != null) {
            thread.interrupt();
            this.f4078 = null;
        }
        C1935.f8428 = null;
        SSHTunnelService.f4032 = null;
        stopSelf();
    }
}
