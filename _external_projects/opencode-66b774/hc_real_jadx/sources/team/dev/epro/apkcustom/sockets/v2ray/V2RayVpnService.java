package team.dev.epro.apkcustom.sockets.v2ray;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.StrictMode;
import androidx.core.app.NotificationCompat;
import dev.epro.v2ray.model.V2Ray;
import dev.epro.v2ray.model.dns.DnsObject;
import dev.epro.v2ray.model.inbounds.InboundObject;
import dev.epro.v2ray.model.inbounds.SniffingObject;
import dev.epro.v2ray.model.log.LogObject;
import dev.epro.v2ray.model.outbounds.OutboundObject;
import dev.epro.v2ray.model.outbounds.ProxySettingsObject;
import dev.epro.v2ray.model.protocols.http.OutboundConfigurationObject;
import dev.epro.v2ray.model.protocols.http.ServerObject;
import dev.epro.v2ray.model.protocols.socks.InboundConfigurationObject;
import dev.epro.v2ray.util.EConfigType;
import dev.epro.v2ray.util.GuardProcess;
import dev.epro.v2ray.util.Utils;
import dev.epro.v2ray.util.V2rayConfigUtil;
import dev.epro.v2ray.util.VmessBean;
import java.io.File;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import libv2ray.Libv2ray;
import libv2ray.V2RayPoint;
import libv2ray.V2RayVPNServiceSupportsSet;
import p010.p011.p012.p013.C0749;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p121.C1935;
import p107.p108.p109.p110.p121.C1943;
import p107.p108.p109.p110.p121.p124.C1939;
import p107.p108.p109.p110.p121.p124.C1941;
import p107.p108.p109.p110.p121.p124.RunnableC1940;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.C2654;
import p131.p161.p211.C2673;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class V2RayVpnService extends VpnService implements V2RayVPNServiceSupportsSet, Handler.Callback {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final /* synthetic */ int f4110 = 0;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public NotificationCompat.Builder f4111;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ParcelFileDescriptor f4112;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public NotificationManager f4113;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public PowerManager f4114;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public HttpURLConnection f4115;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Handler f4116;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public V2RayPoint f4117;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Thread f4118;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1935 f4119;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Context f4120;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f4121;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0770 f4122;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public GuardProcess f4123;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1943 f4124;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public PowerManager.WakeLock f4125;

    /* renamed from: team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService$げつ〴ぬぐ, reason: contains not printable characters */
    public class BinderC0563 extends Binder {
        public BinderC0563(C1941 c1941) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            V2RayVpnService.this.onRevoke();
            return true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Intent intent;
        int i = message.what;
        String a = Crypt.a(Crypt.xrc("K4l@gkL`jHb9L7oH3lKch\u001dj>\u001a3f\u001cj;Jk"));
        String a2 = Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"));
        if (i != 1) {
            if (i == 2) {
                String string = getString(2131821264);
                C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId")), true);
                this.f4111.setAutoCancel(true);
                this.f4111.setContentTitle(getString(2131820629));
                this.f4111.setContentText(string);
                this.f4111.setSmallIcon(2131231153);
                this.f4111.setContentIntent(m1703());
                this.f4113.notify(2131820629, this.f4111.build());
                this.f4113.cancel(2131820629);
                SSHTunnelService.f4034 = false;
                SSHTunnelService.f4041 = false;
                SSHTunnelService.f4038 = false;
                SSHTunnelService.f4031 = true;
                SSHTunnelService.f4036 = false;
                App.f3762.edit().putBoolean(a, false).apply();
                intent = new Intent();
            } else if (i == 3) {
                SSHTunnelService.f4034 = true;
                SSHTunnelService.f4041 = false;
                SSHTunnelService.f4038 = false;
                SSHTunnelService.f4031 = false;
                SSHTunnelService.f4036 = false;
                intent = new Intent();
            }
            intent.setAction(a2);
            sendBroadcast(intent);
        } else {
            String string2 = getString(2131820626);
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
            m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
            m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
            m4207.append(getString(2131820632));
            C1687.m3666(string2, m4207.toString());
            m1701(2131231150, getString(2131821404), true);
            ((C1216) App.f3760).m2790(getString(2131820632), -256);
            SSHTunnelService.f4034 = false;
            SSHTunnelService.f4041 = true;
            SSHTunnelService.f4038 = false;
            SSHTunnelService.f4031 = false;
            SSHTunnelService.f4036 = true;
            App.f3762.edit().putBoolean(a, true).apply();
            Intent intent2 = new Intent();
            intent2.setAction(a2);
            sendBroadcast(intent2);
            if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && this.f4124 == null) {
                C1943 c1943 = new C1943();
                this.f4124 = c1943;
                c1943.m4033();
            }
        }
        return false;
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC0563(null);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        this.f4121 = App.f3762.getBoolean(Crypt.a(Crypt.xrc("HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab")), false);
        this.f4116 = new Handler(this);
        this.f4122 = new C0770();
        System.loadLibrary(Crypt.a(Crypt.xrc("\u001ed<\u00197gI4kMkmA4lA`<\u001aao\u001de>Od;\u001e3i\u001aa")));
        this.f4117 = Libv2ray.newV2RayPoint(this);
        Context applicationContext = getApplicationContext();
        this.f4120 = applicationContext;
        if (applicationContext != null) {
            this.f4117.setPackageName(applicationContext.getFilesDir().toString().replace(Crypt.a(Crypt.xrc("JdfJgkObh\u001b7:Lb=\u001e4hN3:Nd;Akk\u001af9\u001e1")), ""));
            this.f4117.setPackageCodePath(this.f4120.getApplicationInfo().nativeLibraryDir + Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")));
        }
        Libv2ray.initV2Env(Utils.userAssetPath(this));
        NotificationManager notificationManager = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193")));
        this.f4113 = notificationManager;
        int i = Build.VERSION.SDK_INT;
        String a = Crypt.a(Crypt.xrc("J3k\u001a3h\u001e6jH`gI0i\u001a1hO`>A3hJjiKdf\u0019amMfg\u00191jA`iN`<\u001e0iL6>\u001dbf\u001d3lJ4>\u001abn\u001c"));
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(a, getString(2131820626), 2);
            notificationChannel.setDescription("");
            notificationManager.createNotificationChannel(notificationChannel);
        }
        this.f4111 = new NotificationCompat.Builder(this, a);
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true)) {
            PowerManager powerManager = (PowerManager) getSystemService(Crypt.a(Crypt.xrc("\u001b`<\u0019ah@fiObfJ4mH`:O1<@bmLj:LdnKe")));
            this.f4114 = powerManager;
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, getString(2131820626) + Crypt.a(Crypt.xrc("\u001e6j\u001e6n\u001cfn\u001adhA`:If<\u0019c;A7i\u001ekn\u001a4>\u001dalIkjNc;AenIa>\u001a7l\u001ebj\u001d0:\u001a0<Ibh\u001cbfJ")));
            this.f4125 = newWakeLock;
            newWakeLock.acquire();
            C2098.m4197(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"))), Crypt.a(Crypt.xrc("Oaf\u001e1kAk>Oan\u001ediN0i\u001dc;HkoJgf\u001bemL4=A`gKg>\u001adfJglOagI3k\u0019el\u0019dmK0i\u00190:\u001b")), getString(2131820626));
        }
    }

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public long onEmitStatus(long j, String str) {
        C1943 c1943;
        PowerManager.WakeLock wakeLock;
        if (str.toLowerCase().equals(Crypt.a(Crypt.xrc("Ij:\u001edmIcmJko\u0019j>\u001c3;K3f\u001c`j@kjJbfL0"))) || !str.toLowerCase().equals(Crypt.a(Crypt.xrc("Jgg\u00191f\u0019`f\u001af;\u001cdj\u001dk=JdnKfmL4oJb=\u001c1")))) {
            return 0L;
        }
        boolean z = App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true);
        String a = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (z && (wakeLock = this.f4125) != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.f4125.release();
                    C1687.m3666(getString(2131820626), a2 + new SimpleDateFormat(a, Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN")));
                }
            } catch (Exception unused) {
            }
        }
        if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && (c1943 = this.f4124) != null) {
            c1943.m4034();
            this.f4124 = null;
        }
        String string = getString(2131820626);
        StringBuilder m4207 = C2098.m4207(a2);
        m4207.append(new SimpleDateFormat(a, Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
        m4207.append(getString(2131820633));
        C1687.m3666(string, m4207.toString());
        return 0L;
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk")), false).apply();
        m1704(true);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        boolean z;
        boolean z2;
        String a;
        OutboundObject next;
        ProxySettingsObject proxySettings;
        List<Object> list;
        DnsObject dnsObject;
        this.f4116.sendEmptyMessage(3);
        m1701(2131231152, getString(2131820646), false);
        boolean z3 = true;
        if (intent == null) {
            return 1;
        }
        String action = intent.getAction();
        boolean equals = action.equals(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")));
        String a2 = Crypt.a(Crypt.xrc("L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk"));
        if (equals) {
            C2098.m4182(App.f3762, a2, true);
            if (this.f4117.getIsRunning()) {
                return 1;
            }
            ((C1216) App.f3760).m2708();
            SharedPreferences sharedPreferences = App.f3762;
            String a3 = Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"));
            boolean z4 = sharedPreferences.getBoolean(a3, false);
            String a4 = Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"));
            if (z4 || App.f3762.getBoolean(a4, false)) {
                C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Jeo@alI4<\u001aagNb:\u001ejk\u001efjOenI1>\u001ae;\u001aa")), true);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe")), 0);
                if (this.f4119 == null) {
                    C1935 c1935 = new C1935();
                    this.f4119 = c1935;
                    if (!c1935.isAlive() || !this.f4119.f8450) {
                        this.f4119.m4026();
                    }
                }
            }
            C1216 c1216 = (C1216) App.f3760;
            String str2 = "";
            if (Boolean.parseBoolean(c1216.m2744(c1216.m2739())[2])) {
                try {
                    InterfaceC1837 interfaceC1837 = App.f3760;
                    str = ((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[26];
                } catch (IndexOutOfBoundsException unused) {
                    str = "";
                }
            } else {
                str = App.f3762.getString(Crypt.a(Crypt.xrc("NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI")), "");
                if (str.isEmpty()) {
                    try {
                        InterfaceC1837 interfaceC18372 = App.f3760;
                        str = ((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[26];
                    } catch (IndexOutOfBoundsException unused2) {
                    }
                }
            }
            if (str.isEmpty()) {
                str = App.f3762.getString(Crypt.a(Crypt.xrc("Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7")), str);
            }
            try {
                if (V2rayConfigUtil.isValidConfig(str)) {
                    VmessBean vmessBean = new VmessBean();
                    vmessBean.setConfigType(EConfigType.CUSTOM.getValue());
                    String content = V2rayConfigUtil.getV2rayConfig(this, vmessBean, str).getContent();
                    C2654 c2654 = new C2654();
                    c2654.m4633(Double.class, new C1939(this));
                    c2654.f10109 = true;
                    C2673 m4634 = c2654.m4634();
                    V2Ray v2Ray = (V2Ray) m4634.m4644(content, V2Ray.class);
                    LogObject logObject = new LogObject();
                    logObject.setLoglevel(Crypt.a(Crypt.xrc("Kd=Ld<\u001eaiHkf@c;\u001dakOj=L`>HggJbfOc")));
                    v2Ray.setLog(logObject);
                    ArrayList arrayList = new ArrayList();
                    List<InboundObject> inbounds = v2Ray.getInbounds();
                    String a5 = Crypt.a(Crypt.xrc("\u001b0:O7h\u001c3;HckJc=If=Ke9Jf=KgfK1<\u001cc"));
                    String a6 = Crypt.a(Crypt.xrc("\u001d`nKam\u001bd;Af<M0n\u001bjf\u001e79\u001b4jAek\u001dei\u001dj"));
                    if (inbounds != null) {
                        z = false;
                        for (InboundObject inboundObject : v2Ray.getInbounds()) {
                            String protocol = inboundObject.getProtocol();
                            if (protocol == null || !protocol.equals(a6)) {
                                arrayList.add(inboundObject);
                            } else {
                                inboundObject.setPort(a5);
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    String a7 = Crypt.a(Crypt.xrc("Hg=L0o@`l\u001a1i@4kL0nHdfA0;@6lK`>@c"));
                    String a8 = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
                    if (!z) {
                        InboundObject inboundObject2 = new InboundObject();
                        inboundObject2.setPort(a5);
                        inboundObject2.setListen(a8);
                        inboundObject2.setProtocol(a6);
                        inboundObject2.setTag(a6);
                        InboundConfigurationObject inboundConfigurationObject = new InboundConfigurationObject();
                        inboundConfigurationObject.setAuth(Crypt.a(Crypt.xrc("\u001e6mKb>\u001dan\u001a1=\u001b1<AjjO1;@ffIai\u001a1nMf")));
                        inboundConfigurationObject.setUdp(true);
                        inboundConfigurationObject.setUserLevel(8);
                        inboundObject2.setSettings(inboundConfigurationObject);
                        SniffingObject sniffingObject = new SniffingObject();
                        sniffingObject.setEnabled(true);
                        sniffingObject.setDestOverride(Arrays.asList(a7, Crypt.a(Crypt.xrc("\u001b4mKc;M0jN`:@c>\u001b0g\u001cciK1<\u001d`kJ4:A1"))));
                        inboundObject2.setSniffing(sniffingObject);
                        arrayList.add(inboundObject2);
                        v2Ray.setInbounds(arrayList);
                    }
                    if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), false)) {
                        ArrayList arrayList2 = new ArrayList();
                        DnsObject dns = v2Ray.getDns();
                        String a9 = Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"));
                        String a10 = Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"));
                        if (dns != null) {
                            List<Object> servers = dns.getServers();
                            for (Object obj : servers) {
                                if ((obj instanceof String) && (obj.equals(a10) || obj.equals(a9))) {
                                    arrayList2.add((String) obj);
                                }
                            }
                            dnsObject = dns;
                            list = servers;
                            if (arrayList2.size() < 2) {
                                if (!arrayList2.contains(a10)) {
                                    servers.add(a10);
                                }
                                dnsObject = dns;
                                list = servers;
                                if (!arrayList2.contains(a9)) {
                                    servers.add(a9);
                                    dnsObject = dns;
                                    list = servers;
                                }
                            }
                        } else {
                            DnsObject dnsObject2 = new DnsObject();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(a10);
                            arrayList3.add(a9);
                            dnsObject = dnsObject2;
                            list = arrayList3;
                        }
                        dnsObject.setServers(list);
                        v2Ray.setDns(dnsObject);
                    }
                    if (App.f3762.getBoolean(a3, false) || App.f3762.getBoolean(a4, false)) {
                        List<OutboundObject> outbounds = v2Ray.getOutbounds();
                        Iterator<OutboundObject> it = outbounds.iterator();
                        loop2: while (true) {
                            z2 = false;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                a = Crypt.a(Crypt.xrc("A69\u001ac:LdmJdkMblAamHglH0;Nf>Hbf\u001d`"));
                                if (!hasNext) {
                                    break loop2;
                                }
                                next = it.next();
                                proxySettings = next.getProxySettings();
                                if (proxySettings == null) {
                                    proxySettings = new ProxySettingsObject();
                                }
                                proxySettings.setTag(a);
                                String protocol2 = next.getProtocol();
                                if (protocol2 != null && protocol2.equals(a7)) {
                                    for (ServerObject serverObject : ((OutboundConfigurationObject) m4634.m4644(m4634.m4645(next.getSettings()), OutboundConfigurationObject.class)).getServers()) {
                                        if (serverObject.getAddress().equals(a8) && serverObject.getPort() == 8888) {
                                            next.setTag(a);
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            next.setProxySettings(proxySettings);
                        }
                        if (!z2) {
                            ServerObject serverObject2 = new ServerObject();
                            serverObject2.setAddress(a8);
                            serverObject2.setPort(8888);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(serverObject2);
                            OutboundConfigurationObject outboundConfigurationObject = new OutboundConfigurationObject();
                            outboundConfigurationObject.setServers(arrayList4);
                            OutboundObject outboundObject = new OutboundObject();
                            outboundObject.setProtocol(a7);
                            outboundObject.setSettings(outboundConfigurationObject);
                            outboundObject.setTag(a);
                            outbounds.add(outboundObject);
                            v2Ray.setOutbounds(outbounds);
                        }
                    }
                    str = m4634.m4645(v2Ray);
                    z3 = true;
                } else {
                    m1704(true);
                }
                if (str.contains(Crypt.a(Crypt.xrc("\u0019do@4gIkiO6k\u001aao\u001b`:K`m\u001ajj\u001c0n\u001df=H6")))) {
                    this.f4121 = z3;
                } else {
                    this.f4121 = false;
                }
                this.f4117.setConfigureFileContent(str);
                this.f4117.setEnableLocalDNS(App.f3762.getBoolean(Crypt.a(Crypt.xrc("HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab")), false));
                this.f4117.setForwardIpv6(false);
                this.f4117.setDomainName(V2rayConfigUtil.PREF_CURR_CONFIG_DOMAIN);
                this.f4117.setProxyOnly(false);
                this.f4117.runLoop();
            } catch (Exception e) {
                str2 = e.getLocalizedMessage();
                m1704(true);
            }
            if (this.f4117.getIsRunning()) {
                C2098.m4197(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"))), Crypt.a(Crypt.xrc("Mk;Jef\u001agm\u001aan\u00197gJak\u001e3>IejJeg\u001af=Oc")), getString(2131820626));
            } else {
                this.f4116.sendEmptyMessage(2);
                if (str2 != null && str2.startsWith(Crypt.a(Crypt.xrc("\u0019k;\u0019al\u001e7;\u001a1h\u001a3kMcfK7m\u001aj;\u0019bnI`=\u001ak")))) {
                    String[] split = str2.split(Crypt.a(Crypt.xrc("ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g")));
                    String str3 = split[0];
                    String a11 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
                    new Handler(getMainLooper()).post(new RunnableC1940(this, str3.split(a11), split[1].split(a11)));
                }
            }
        } else if (action.equals(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")))) {
            App.f3762.edit().putBoolean(a2, false).apply();
            m1704(true);
            return 1;
        }
        return 1;
    }

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public long prepare() {
        return 0L;
    }

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public long protect(long j) {
        return protect((int) j) ? 0L : 1L;
    }

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public long setup(String str) {
        try {
            m1702(str);
            return 0L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public long shutdown() {
        try {
            m1704(true);
            return 0L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1701(int i, String str, boolean z) {
        this.f4111.setAutoCancel(false);
        this.f4111.setContentTitle(getString(2131820626));
        this.f4111.setContentText(str);
        this.f4111.setSmallIcon(i);
        this.f4111.setContentIntent(m1703());
        String a = Crypt.a(Crypt.xrc("\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId"));
        if (z) {
            C2098.m4182(App.f3762, a, false);
            this.f4111.setUsesChronometer(true);
            this.f4111.setShowWhen(true);
            this.f4111.setWhen(System.currentTimeMillis());
        } else {
            C2098.m4182(App.f3762, a, true);
            this.f4111.setUsesChronometer(false);
            this.f4111.setShowWhen(false);
        }
        Notification build = this.f4111.build();
        this.f4113.notify(2131820629, build);
        startForeground(2131820629, build);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1702(String str) {
        if (VpnService.prepare(this) != null) {
            m1704(true);
            return;
        }
        VpnService.Builder builder = new VpnService.Builder(this);
        for (String str2 : str.split(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")))) {
            String[] split = str2.split(Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3")));
            if (split[0].equals(Crypt.a(Crypt.xrc("O`k\u001edjNc9@jj@`<LefA`n@dl\u001agjOfnA3")))) {
                builder.setMtu(Integer.parseInt(split[1]));
            }
            if (split[0].equals(Crypt.a(Crypt.xrc("\u00196lLc;\u001d`hAffMji\u001d1o@egMag\u001acnL4:Ja")))) {
                builder.addSearchDomain(split[1]);
            }
            if (split[0].equals(Crypt.a(Crypt.xrc("H3;HjlL0jN4k\u001ac<\u00194=L1<\u001c6;\u001c`f\u001a3hJc")))) {
                builder.addAddress(split[1], Integer.parseInt(split[2]));
            }
            if (split[0].equals(Crypt.a(Crypt.xrc("MkkOd:\u001b`:\u001df:\u001bfl\u001ag=Kfn\u001b6o\u001a0=K4l\u001dk")))) {
                C2098.m4181(new C0749(Crypt.a(Crypt.xrc("\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af")), 0), true, this.f4122.f4931);
                C2098.m4181(new C0749(Crypt.a(Crypt.xrc("JjoLdjMdkI3nL3=\u001e7g\u001aalNe<\u001c`m\u001c6>I4")), 8), false, this.f4122.f4931);
                C2098.m4181(new C0749(Crypt.a(Crypt.xrc("K4k@1;NboOemH0l\u001eemOei\u00191gKcg\u001e4gJa")), 12), false, this.f4122.f4931);
                C2098.m4181(new C0749(Crypt.a(Crypt.xrc("\u00197o\u001ea:\u001bd9Nkg\u0019fl@go\u001eef@c=I4f\u001c`g\u001c3")), 16), false, this.f4122.f4931);
                boolean z = App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false);
                String a = Crypt.a(Crypt.xrc("@cmNkmH3kHbl\u001c6fAbmK3h\u001daoHbk\u001cbkMj"));
                if (z || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
                    if (split[1].contains(a)) {
                        builder.addRoute(Crypt.a(Crypt.xrc("Le9Le=KchA`oJcoOjn\u001echKe>\u001benJbf\u001de")), 3);
                    } else {
                        Iterator it = ((Vector) this.f4122.m2079()).iterator();
                        while (it.hasNext()) {
                            C0770.C0771 c0771 = (C0770.C0771) it.next();
                            try {
                                builder.addRoute(c0771.m2083(), c0771.f4934);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                } else if (split[1].contains(a)) {
                    builder.addRoute(a, 0);
                } else {
                    builder.addRoute(split[1], Integer.parseInt(split[2]));
                }
            }
            if (split[0].equals(Crypt.a(Crypt.xrc("A`o\u001affH`:\u001b4;\u001c19Adi\u001ck=Ij:M7oMjg@0")))) {
                builder.addDnsServer(split[1]);
            }
        }
        if (!this.f4121 && App.f3762.getBoolean(Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), false)) {
            builder.addDnsServer(App.f3762.getString(Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1")), Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"))));
            builder.addDnsServer(App.f3762.getString(Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba")), Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"))));
        }
        builder.setSession(App.f3759.getString(2131820626));
        try {
            this.f4112.close();
        } catch (Exception unused2) {
        }
        try {
            this.f4112 = builder.establish();
        } catch (Exception unused3) {
            m1704(true);
        }
        C2098.m4197(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"))), Crypt.a(Crypt.xrc("\u001e1f\u001ceiNemI4lOeo\u001cj;Mb=JagO`h\u001b4;\u001cgf\u0019eh\u001a19OknJj=Ojl\u001d4oO0o\u001e`gKf9\u001c6kH")), getString(2131820626));
        String a2 = Crypt.a(Crypt.xrc("\u001bgkAb<K7=Oc<\u00197=L`nI3hA1jMdjAkj\u001bd"));
        String[] strArr = {new File(this.f4120.getApplicationInfo().nativeLibraryDir, Crypt.a(Crypt.xrc("Mk9Ijh\u001dj9I1h@3gNgk@0jA4i\u001d6n\u001a7kAk"))).getAbsolutePath(), Crypt.a(Crypt.xrc("\u001de<NeiA6:\u001a79@69Kj=Iaj\u00197:\u001e4nLe9\u001a4")), Crypt.a(Crypt.xrc("LcoKjnMbkJ4nA1hO6j\u001e7;O7<@b=@`;\u001d3")), Crypt.a(Crypt.xrc("A3=I4nJ0lNfk\u00190<@`>H7iKdhK4lA0lMk")), Crypt.a(Crypt.xrc("Hg>\u001ek:\u001bdhAf>\u001e4;O6f\u001e`mN7oO7;\u001d19N`")), Crypt.a(Crypt.xrc("\u001bghN`j\u001c`>O3k\u001b1<HkfI79OjlN4=IafHgfKdiH4gJjm@7jI6n\u00191fN6<\u001e0:NgfJcmK")), Crypt.a(Crypt.xrc("AejKcjNd:LjiJa=I4<\u001c`:Id;A7;N1;Aj")), Crypt.a(Crypt.xrc("@fn\u001bdfJ0lL7o\u001eb>\u001bchHj=\u001d3nH6n\u001eeo@4")), Crypt.a(Crypt.xrc("O4i\u001a7fAg<Nj;\u0019fgM`=Jg=Kbm\u001eai\u001ec:I`")), Crypt.a(Crypt.xrc("KfgAe>Kf<N3kNcoK1fLjfHg9O3;\u001b7gA7")), a2, Crypt.a(Crypt.xrc("\u001e4:Jd9@`oJ09K4kHeh\u001ecjHfgOajAegK6=H0>Odo\u001dj;\u001dg:Lgl\u001a1kN`:MegLdkKg:I")), Crypt.a(Crypt.xrc("NbkN3:\u001c6i\u0019`j\u001c3n@bg@ek\u001edh\u00191=\u001ca=Og")), Crypt.a(Crypt.xrc("J`;@cgHd=OklIboLejJc<H4iI0lKckKf"))};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 14; i++) {
            arrayList.add(strArr[i]);
        }
        if (this.f4121) {
            arrayList.add(Crypt.a(Crypt.xrc("\u001dj>@4>Mcg@4nAe9Jg;K3o\u001ek=\u001dekI7:\u001aj")));
            arrayList.add(Crypt.a(Crypt.xrc("Jk;Ie<Jf;\u001ccgHbjKcg\u001bj<JkhMagKblN6")));
        }
        this.f4123 = new GuardProcess(arrayList).start(null, this);
        C1941 c1941 = new C1941(this, new File(this.f4120.getFilesDir(), a2).getAbsolutePath(), this.f4112.getFileDescriptor());
        this.f4118 = c1941;
        c1941.start();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final PendingIntent m1703() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        intent.addFlags(131072);
        return activity;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1704(boolean z) {
        C1935 c1935;
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("L1oLen\u001dbgL3fNal@fnA4=\u001befI1jOdi\u001dk")), false);
        if (this.f4117.getIsRunning()) {
            try {
                this.f4117.stopLoop();
            } catch (Exception unused) {
            }
        }
        this.f4116.sendEmptyMessage(2);
        if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) && (c1935 = this.f4119) != null && (c1935.isAlive() || this.f4119.f8450)) {
            this.f4119.m4028();
            this.f4119 = null;
        }
        Thread thread = this.f4118;
        if (thread != null) {
            thread.interrupt();
            this.f4118 = null;
        }
        HttpURLConnection httpURLConnection = this.f4115;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f4115 = null;
        }
        GuardProcess guardProcess = this.f4123;
        if (guardProcess != null) {
            guardProcess.destroy();
            this.f4123 = null;
        }
        if (z) {
            try {
                this.f4112.close();
            } catch (Exception unused2) {
            }
            stopSelf();
        }
    }
}
