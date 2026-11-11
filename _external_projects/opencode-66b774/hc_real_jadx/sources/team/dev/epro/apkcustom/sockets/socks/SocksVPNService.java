package team.dev.epro.apkcustom.sockets.socks;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.VpnService;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.bugs4u.proxyserver.core.Tun2Socks;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p121.p122.RunnableC1934;
import p107.p108.p109.p110.p121.p125.p126.RunnableC1945;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SocksVPNService extends VpnService {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public SimpleDateFormat f4100;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Thread f4101;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Locale f4102;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String f4103;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f4104 = Crypt.a(Crypt.xrc("N4iOgj\u0019d=\u00197;M39N`jHb=\u0019aiJ7fIkh\u001ce"));

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C0770 f4105;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public VpnService.Builder f4106;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ParcelFileDescriptor f4107;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public RunnableC1945 f4108;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f4109;

    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("Of=\u001ce9@b9Ac:\u001dkl\u001cfl\u001ca:\u0019aoAeoJ7f\u0019f")));
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        m1699();
        super.onRevoke();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        String str3;
        String m2753;
        this.f4105 = new C0770();
        this.f4102 = Locale.getDefault();
        this.f4106 = new VpnService.Builder(this);
        this.f4100 = new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault());
        if (intent != null) {
            String action = intent.getAction();
            if (action.equals(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")))) {
                if (this.f4108 == null) {
                    Boolean bool = Boolean.FALSE;
                    try {
                        InterfaceC1837 interfaceC1837 = App.f3760;
                        bool = Boolean.valueOf(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[9]);
                    } catch (IndexOutOfBoundsException | Exception unused) {
                    }
                    InterfaceC1837 interfaceC18372 = App.f3760;
                    if (((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[1].isEmpty()) {
                        str = ((C1216) App.f3760).m2753();
                    } else {
                        InterfaceC1837 interfaceC18373 = App.f3760;
                        str = ((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[1];
                    }
                    if (bool.booleanValue()) {
                        if (((C1216) App.f3760).m2753().isEmpty()) {
                            InterfaceC1837 interfaceC18374 = App.f3760;
                            m2753 = ((C1216) interfaceC18374).m2744(((C1216) interfaceC18374).m2739())[1];
                        } else {
                            m2753 = ((C1216) App.f3760).m2753();
                        }
                        str = m2753;
                    }
                    String[] split = str.split(Crypt.a(Crypt.xrc("\u00190nLkj\u001b3;\u00190g@d>LcnLf<M6;Nk;@k<\u001c0")));
                    if (split.length > 1) {
                        String str4 = split[1];
                        String a = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
                        String str5 = str4.split(a)[0];
                        String a2 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
                        String str6 = str5.split(a2)[0];
                        int parseInt = split[1].split(a2).length > 1 ? Integer.parseInt(split[1].split(a)[0].split(a2)[1]) : 80;
                        this.f4103 = str6;
                        this.f4109 = parseInt;
                        if (split[0].startsWith(Crypt.a(Crypt.xrc("I`>\u0019`<\u001abgH0kN7gHgj\u001bkg\u001cdhJ0h\u001bbm\u00190")))) {
                            String[] split2 = split[1].split(a);
                            if (split2.length > 1) {
                                String str7 = split2[1].split(a2)[0];
                                str3 = split2[1].split(a2).length > 1 ? split2[1].split(a2)[1] : null;
                                str2 = str7;
                            } else {
                                str2 = split[1].contains(a) ? split2[1].split(a2)[0] : null;
                                str3 = str2;
                            }
                            RunnableC1945 runnableC1945 = new RunnableC1945(1082, true, this.f4103, this.f4109, str2, str3, split[0]);
                            this.f4108 = runnableC1945;
                            runnableC1945.m4036();
                        }
                    }
                }
                Thread thread = this.f4101;
                if (thread == null || !thread.isAlive()) {
                    NotificationManager notificationManager = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193")));
                    int i3 = Build.VERSION.SDK_INT;
                    String a3 = Crypt.a(Crypt.xrc("M4>Ma;\u001c6hO4>Jd:\u00190j@1m\u001dklKafNdf@j9\u001c6<N0:\u00193;Ie=H7i\u001e`f\u001cdfHfnIf>MdjI"));
                    if (i3 >= 26) {
                        NotificationChannel notificationChannel = new NotificationChannel(a3, getString(2131820626), 2);
                        notificationChannel.setDescription("");
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, a3);
                    DhcpInfo dhcpInfo = ((WifiManager) getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7")))).getDhcpInfo();
                    Locale.setDefault(new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"))));
                    startForeground(2131820626, builder.setContentTitle(Crypt.a(Crypt.xrc("\u001c7hK6>\u001bdkO4jKeiA`n\u0019a:\u001eg9H4<\u001calIb9Ab<KjoOkg\u001a1>HgmIc:Jkg\u00193oL7mObnN"))).setContentText(Crypt.a(Crypt.xrc("Hcf\u00193mOcgJc=\u001a0:\u0019eoN1>I6o\u001e4mI6k\u001bgnH1h\u001dgjHe<@dn\u001cb<Odj\u001e1=\u001b4lIe<L7k\u001b"))).setPriority(-2).setSmallIcon(2131231157).setContentIntent(m1700()).build());
                    Thread thread2 = new Thread(new RunnableC1934(this, dhcpInfo));
                    this.f4101 = thread2;
                    thread2.start();
                }
            } else if (action.equals(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")))) {
                m1699();
                RunnableC1945 runnableC19452 = this.f4108;
                if (runnableC19452 != null) {
                    runnableC19452.m4038();
                    this.f4108 = null;
                }
            }
        }
        return 1;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1699() {
        ParcelFileDescriptor parcelFileDescriptor = this.f4107;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.f4107 = null;
            } catch (Exception unused) {
            }
        }
        Tun2Socks.Stop();
        ((C1216) App.f3760).m2777(SSHTunnelService.f4040 + Crypt.a(Crypt.xrc("J`j\u0019k;\u001e4k\u001dkkIj<KbhN3kM6m\u001d7k\u001defLdiK1fMd<N6fN4nK0k\u001afh\u00194m\u001ajfIfnO4<@1m@cfNa9\u001dki\u001a4<\u00194:A0nAknOc=\u001ebiMk9")) + SSHTunnelService.f4033 + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + SSHTunnelService.f4037);
        Thread thread = this.f4101;
        if (thread != null) {
            thread.interrupt();
            this.f4101 = null;
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(this.f4100.format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
        m4207.append(getString(2131820607));
        C1687.m3666(Crypt.a(Crypt.xrc("O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4")), m4207.toString());
        App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001cc:\u001c`lH7jMj;IdiLf;\u001ajmH7<\u001a1i\u001cjf\u001b4")), false).apply();
        stopForeground(true);
        stopSelf();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public PendingIntent m1700() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        intent.addFlags(131072);
        return activity;
    }
}
