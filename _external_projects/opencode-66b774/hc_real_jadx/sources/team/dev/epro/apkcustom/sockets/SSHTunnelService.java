package team.dev.epro.apkcustom.sockets;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
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
import com.trilead.ssh2.crypto.digest.MD5;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.bugs4u.proxyserver.core.Tun2Socks;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p107.p108.p109.p110.p118.C1862;
import p107.p108.p109.p110.p121.C1935;
import p107.p108.p109.p110.p121.C1943;
import p107.p108.p109.p110.p121.C1957;
import p107.p108.p109.p110.p121.p125.p126.RunnableC1945;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.C2746;
import p131.p225.p226.C2753;
import p131.p225.p226.C2755;
import p131.p225.p226.C2774;
import p131.p225.p226.InterfaceC2700;
import p131.p225.p226.InterfaceC2745;
import p131.p225.p226.InterfaceC2775;
import p131.p225.p226.p227.AbstractC2723;
import p131.p225.p226.p227.C2724;
import p131.p225.p226.p232.C2763;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SSHTunnelService extends VpnService implements InterfaceC2775, InterfaceC2745, Handler.Callback {

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static volatile String f4032;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C2746 f4043;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public NotificationCompat.Builder f4044;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public String f4045;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public RunnableC1945 f4047;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f4049;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ParcelFileDescriptor f4052;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Thread f4053;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public NotificationManager f4054;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public Locale f4055;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public AsyncTaskC1840 f4056;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C0770 f4057;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public PendingIntent f4059;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1943 f4060;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public String f4061;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public SimpleDateFormat f4063;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public PowerManager f4065;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public VpnService.Builder f4066;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Intent f4068;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public String f4069;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public PowerManager.WakeLock f4070;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Handler f4071;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1935 f4072;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final String f4042 = SSHTunnelService.class.getSimpleName();

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static volatile boolean f4034 = false;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static volatile boolean f4038 = false;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static volatile boolean f4041 = false;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static volatile boolean f4036 = false;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static volatile boolean f4035 = false;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static volatile boolean f4031 = true;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static String f4033 = App.f3759.getFilesDir().getPath();

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static String f4037 = App.f3759.getCacheDir().getPath();

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static String f4040 = App.f3759.getFilesDir().getPath() + Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"));

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static String f4039 = "([A-Za-z0-9-]{1,63}\\.)+[A-Za-z]{2,6}";

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2753 f4046 = null;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public String f4050 = App.f3759.getString(2131820626);

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public String f4051 = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f4067 = 80;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public Process f4064 = null;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public File f4062 = null;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public String f4048 = "(((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}|localhost|(([0-9]{1,3}\\.){3})[0-9]{1,3}):[0-9]+";

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public String f4058 = "(((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}|localhost|(([0-9]{1,3}\\.){3})[0-9]{1,3})";

    /* renamed from: team.dev.epro.apkcustom.sockets.SSHTunnelService$〺つふすそ, reason: contains not printable characters */
    public class C0558 implements InterfaceC1838 {
        public C0558() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            SSHTunnelService.f4034 = true;
            SSHTunnelService.f4031 = false;
            Intent intent = new Intent();
            String a = Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"));
            intent.setAction(a);
            SSHTunnelService.this.sendBroadcast(intent);
            SSHTunnelService.f4035 = false;
            int i = 1;
            while (SSHTunnelService.f4034 && !SSHTunnelService.this.m1666()) {
                boolean z = App.f3762.getBoolean(Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
                String a2 = Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"));
                String a3 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
                if (!z) {
                    if (!SSHTunnelService.f4035) {
                        SSHTunnelService.f4041 = false;
                        SSHTunnelService.f4035 = true;
                        String str = SSHTunnelService.f4042;
                        String str2 = SSHTunnelService.f4042;
                        StringBuilder m4207 = C2098.m4207(a3);
                        C2098.m4199(SSHTunnelService.this.f4063, m4207, a2);
                        m4207.append(SSHTunnelService.this.getString(2131821298));
                        m4207.append("");
                        C1687.m3666(str2, m4207.toString());
                        StringBuilder sb = new StringBuilder();
                        sb.append(a3);
                        C2098.m4199(SSHTunnelService.this.f4063, sb, a2);
                        sb.append(SSHTunnelService.this.getString(2131821291));
                        C1687.m3666(str2, sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a3);
                        C2098.m4199(SSHTunnelService.this.f4063, sb2, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
                        sb2.append(SSHTunnelService.this.getString(2131820633));
                        C1687.m3666(str2, sb2.toString());
                    }
                    SSHTunnelService.f4034 = false;
                    SSHTunnelService.f4036 = false;
                    SSHTunnelService.f4031 = true;
                    SSHTunnelService sSHTunnelService = SSHTunnelService.this;
                    sSHTunnelService.m1665(sSHTunnelService.getString(2131821262));
                    Intent intent2 = new Intent();
                    intent2.setAction(a);
                    SSHTunnelService.this.sendBroadcast(intent2);
                    SSHTunnelService.this.m1669();
                    return;
                }
                String str3 = SSHTunnelService.f4042;
                String str4 = SSHTunnelService.f4042;
                StringBuilder m42072 = C2098.m4207(a3);
                C2098.m4199(SSHTunnelService.this.f4063, m42072, a2);
                m42072.append(SSHTunnelService.this.getString(2131821296));
                m42072.append(Crypt.a(Crypt.xrc("\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3")));
                m42072.append(i);
                m42072.append("");
                C1687.m3666(str4, m42072.toString());
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused) {
                }
                i++;
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
        }
    }

    /* renamed from: team.dev.epro.apkcustom.sockets.SSHTunnelService$くし〴〺ぅ, reason: contains not printable characters */
    public class BinderC0559 extends Binder {
        public BinderC0559(C0560 c0560) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            SSHTunnelService.this.onRevoke();
            return true;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.sockets.SSHTunnelService$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0560 implements InterfaceC1838 {
        public C0560() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            SSHTunnelService sSHTunnelService = SSHTunnelService.this;
            String str = SSHTunnelService.f4042;
            sSHTunnelService.m1662();
            SSHTunnelService.this.m1668();
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            SSHTunnelService.f4038 = false;
            SSHTunnelService.f4031 = true;
            SSHTunnelService.f4036 = false;
            if (SSHTunnelService.f4041 || !SSHTunnelService.f4035) {
                SSHTunnelService.f4041 = false;
                SSHTunnelService.f4035 = true;
                String str = SSHTunnelService.f4042;
                String str2 = SSHTunnelService.f4042;
                String a = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
                StringBuilder m4207 = C2098.m4207(a);
                SimpleDateFormat simpleDateFormat = SSHTunnelService.this.f4063;
                String a2 = Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"));
                C2098.m4199(simpleDateFormat, m4207, a2);
                m4207.append(SSHTunnelService.this.getString(2131821299));
                C1687.m3666(str2, m4207.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                C2098.m4199(SSHTunnelService.this.f4063, sb, a2);
                sb.append(SSHTunnelService.this.getString(2131821291));
                C1687.m3666(str2, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                C2098.m4199(SSHTunnelService.this.f4063, sb2, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
                sb2.append(SSHTunnelService.this.getString(2131820633));
                C1687.m3666(str2, sb2.toString());
            }
            Intent intent = new Intent();
            intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh")));
            SSHTunnelService.this.sendBroadcast(intent);
            SSHTunnelService sSHTunnelService = SSHTunnelService.this;
            sSHTunnelService.m1665(sSHTunnelService.getString(2131821262));
            if (Build.VERSION.SDK_INT >= 26) {
                SSHTunnelService.this.stopForeground(true);
            }
        }
    }

    static {
        System.loadLibrary(Crypt.a(Crypt.xrc("Of=\u001ce9@b9Ac:\u001dkl\u001cfl\u001ca:\u0019aoAeoJ7f\u0019f")));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        InterfaceC1837 interfaceC1837;
        String string;
        int i;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                String str = f4042;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(this.f4063.format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
                m4207.append(getString(2131820632));
                C1687.m3666(str, m4207.toString());
                interfaceC1837 = App.f3760;
                string = getString(2131820632);
                i = -256;
            }
            return true;
        }
        interfaceC1837 = App.f3760;
        string = getString(2131820639);
        i = -65536;
        ((C1216) interfaceC1837).m2790(string, i);
        return true;
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC0559(null);
    }

    @Override // android.app.Service
    public void onCreate() {
        String str;
        super.onCreate();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        this.f4063 = new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault());
        this.f4054 = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193")));
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        this.f4068 = intent;
        intent.setFlags(67108864);
        this.f4059 = PendingIntent.getActivity(this, 0, this.f4068, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            synchronized (this) {
                String string = getString(2131820626);
                this.f4054.createNotificationChannel(new NotificationChannel(string + Crypt.a(Crypt.xrc("\u001bbjKg:I7>\u001dj:\u001d3<\u00190fN4=KdiI6;\u001ekkIa")), string, 2));
                str = string + Crypt.a(Crypt.xrc("\u001bbjKg:I7>\u001dj:\u001d3<\u00190fN4=KdiI6;\u001ekkIa"));
            }
        } else {
            str = "";
        }
        this.f4044 = new NotificationCompat.Builder(this, str);
        this.f4071 = new Handler(this);
        Notification m1664 = m1664(2131231152, getString(2131820646));
        if (i >= 26) {
            startForeground(2131820628, m1664);
        }
        this.f4057 = new C0770();
        this.f4055 = Locale.getDefault();
        this.f4066 = new VpnService.Builder(this);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId")), true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C1943 c1943;
        PowerManager.WakeLock wakeLock;
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true) && (wakeLock = this.f4070) != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.f4070.release();
                    C1687.m3666(f4042, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4063.format(new Date()) + Crypt.a(Crypt.xrc("O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN")));
                }
            } catch (Exception unused) {
            }
        }
        C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("K4l@gkL`jHb9L7oH3lKch\u001dj>\u001a3f\u001cj;Jk")), false);
        f4038 = true;
        f4034 = false;
        Intent intent = new Intent();
        intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh")));
        sendBroadcast(intent);
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
            C1935 c1935 = this.f4072;
            if (c1935 != null && (c1935.isAlive() || this.f4072.f8450)) {
                this.f4072.m4028();
                this.f4072 = null;
            }
            RunnableC1945 runnableC1945 = this.f4047;
            if (runnableC1945 != null) {
                runnableC1945.m4038();
                this.f4047 = null;
            }
        }
        if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && (c1943 = this.f4060) != null) {
            c1943.m4034();
            this.f4060 = null;
        }
        new AsyncTaskC1840(new C0560()).execute(new Void[0]);
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
        App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false).apply();
        m1662();
        m1668();
        m1669();
        super.onRevoke();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if (action.equals(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")))) {
                String a = Crypt.a(Crypt.xrc("Hk=@ehNk9\u001dfhJ`g\u001d4jKcm@cjLe>O7g\u001dg"));
                if (intent.getStringExtra(a) != null) {
                    f4032 = intent.getStringExtra(a);
                }
                boolean z = App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true);
                String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
                if (z) {
                    PowerManager powerManager = (PowerManager) getSystemService(Crypt.a(Crypt.xrc("\u001b`<\u0019ah@fiObfJ4mH`:O1<@bmLj:LdnKe")));
                    this.f4065 = powerManager;
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, getString(2131820626) + Crypt.a(Crypt.xrc("\u001e6j\u001e6n\u001cfn\u001adhA`:If<\u0019c;A7i\u001ekn\u001a4>\u001dalIkjNc;AenIa>\u001a7l\u001ebj\u001d0:\u001a0<Ibh\u001cbfJ")));
                    this.f4070 = newWakeLock;
                    newWakeLock.acquire();
                    C2098.m4197(this.f4063, C2098.m4207(a2), Crypt.a(Crypt.xrc("Oaf\u001e1kAk>Oan\u001ediN0i\u001dc;HkoJgf\u001bemL4=A`gKg>\u001adfJglOagI3k\u0019el\u0019dmK0i\u00190:\u001b")), f4042);
                }
                if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
                    C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Jeo@alI4<\u001aagNb:\u001ejk\u001efjOenI1>\u001ae;\u001aa")), true);
                    C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be")), 0);
                    C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1")), 0);
                    C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd")), 0);
                    C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1")), 0);
                    C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe")), 0);
                    if (this.f4072 == null) {
                        C1935 c1935 = new C1935();
                        this.f4072 = c1935;
                        if (!c1935.isAlive() || !this.f4072.f8450) {
                            if (f4032 != null) {
                                this.f4072.f8434 = f4032;
                            }
                            String a3 = Crypt.a(Crypt.xrc("Ia:JagL`nA09M7gKdfA`jO3k\u001cjh@jhNb"));
                            if (intent.getStringExtra(a3) != null) {
                                this.f4072.f8449 = intent.getStringExtra(a3);
                            }
                            this.f4072.m4026();
                        }
                    }
                }
                String str = f4042;
                StringBuilder m4207 = C2098.m4207(a2);
                m4207.append(this.f4063.format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
                m4207.append(getString(2131821297));
                C1687.m3666(str, m4207.toString());
                m1664(2131231152, getString(2131820646));
                m1674();
                AsyncTaskC1840 asyncTaskC1840 = new AsyncTaskC1840(new C0558());
                this.f4056 = asyncTaskC1840;
                asyncTaskC1840.execute(new Void[0]);
            } else if (action.equals(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")))) {
                m1669();
            }
        }
        return 1;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m1662() {
        C2753 c2753 = this.f4046;
        if (c2753 != null) {
            C2763 c2763 = c2753.f10337;
            c2763.getClass();
            try {
                c2763.f10397.close();
            } catch (IOException unused) {
            }
            this.f4046 = null;
        }
        C2746 c2746 = this.f4043;
        if (c2746 != null) {
            synchronized (c2746) {
                c2746.m4717(new Throwable(Crypt.a(Crypt.xrc("\u001c3>M`9LjnI4=\u00196oN7hH7iId9\u001cjlAbk\u001aefN0iNef\u001b49\u001ed;A4mI6;K1>@joL1jAkjO"))), false);
            }
            this.f4043 = null;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1663() {
        boolean z;
        try {
            C2746 c2746 = this.f4043;
            String str = App.f3762.getString(Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`")), "").split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
            String a = Crypt.a(Crypt.xrc("M3kN3kJ7mJ6m\u001akm\u0019bj\u0019j;K6o@jjH3;\u0019c"));
            synchronized (c2746) {
                String[] m4716 = c2746.m4716(str);
                int i = 0;
                while (true) {
                    if (i >= m4716.length) {
                        z = false;
                        break;
                    } else {
                        if (m4716[i].compareTo(a) == 0) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            }
            if (z && this.f4043.m4715(App.f3762.getString(Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`")), "").split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0], App.f3762.getString(Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`")), "").split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1])) {
                C1687.m3666(f4042, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4063.format(new Date()) + Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")) + getString(2131820643) + "");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Notification m1664(int i, String str) {
        this.f4044.setAutoCancel(false);
        this.f4044.setContentTitle(getString(2131820626));
        this.f4044.setContentText(str);
        this.f4044.setSmallIcon(i);
        this.f4044.setContentIntent(this.f4059);
        if (f4041) {
            this.f4044.setUsesChronometer(true);
            this.f4044.setShowWhen(true);
            this.f4044.setWhen(System.currentTimeMillis());
        } else {
            this.f4044.setUsesChronometer(false);
            this.f4044.setShowWhen(false);
        }
        Notification build = this.f4044.build();
        this.f4054.notify(2131820628, build);
        return build;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m1665(String str) {
        this.f4044.setAutoCancel(true);
        this.f4044.setContentTitle(getString(2131820628));
        this.f4044.setContentText(str);
        this.f4044.setSmallIcon(2131231153);
        this.f4044.setContentIntent(this.f4059);
        this.f4054.notify(2131820628, this.f4044.build());
        this.f4054.cancel(2131820628);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m1666() {
        String str;
        String str2;
        C2746 c2746;
        InterfaceC2700 c2755;
        String str3;
        String str4;
        String str5;
        String str6;
        String m2753;
        boolean z;
        boolean z2;
        m1662();
        try {
            String[] split = App.f3762.getString(Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`")), "").split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[0].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
            String a = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
            int i = 22;
            if (split.length > 1) {
                a = split[0].trim();
                try {
                    i = Integer.parseInt(split[1].trim());
                } catch (NumberFormatException unused) {
                }
            }
            if (f4032 != null) {
                a = f4032;
            }
            this.f4045 = a;
            this.f4049 = i;
            this.f4043 = new C2746(a, i);
            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
                Boolean bool = Boolean.FALSE;
                try {
                    InterfaceC1837 interfaceC1837 = App.f3760;
                    bool = Boolean.valueOf(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[9]);
                } catch (IndexOutOfBoundsException | Exception unused2) {
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
                InterfaceC1837 interfaceC18375 = App.f3760;
                if (((C1216) interfaceC18375).m2744(((C1216) interfaceC18375).m2739())[0].isEmpty()) {
                    str2 = ((C1216) App.f3760).m2783().isEmpty() ? Crypt.a(Crypt.xrc("\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4")) : ((C1216) App.f3760).m2783();
                } else {
                    InterfaceC1837 interfaceC18376 = App.f3760;
                    str2 = ((C1216) interfaceC18376).m2744(((C1216) interfaceC18376).m2739())[0];
                }
                if (str2.equals(Crypt.a(Crypt.xrc("\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4")))) {
                    String[] split2 = str.split(Crypt.a(Crypt.xrc("\u00190nLkj\u001b3;\u00190g@d>LcnLf<M6;Nk;@k<\u001c0")));
                    if (split2.length <= 1) {
                        String str7 = str.split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
                        int parseInt = str.split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"))).length > 1 ? Integer.parseInt(str.split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1]) : 80;
                        this.f4051 = str7;
                        this.f4067 = parseInt;
                        if (!a.equals(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")))) {
                            c2746 = this.f4043;
                            c2755 = new C2755(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), 8888);
                            c2746.m4714(c2755);
                        }
                    } else if (!a.equals(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")))) {
                        String str8 = split2[1].split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[0].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
                        int parseInt2 = split2[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"))).length > 1 ? Integer.parseInt(split2[1].split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")))[0].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1]) : 80;
                        this.f4051 = str8;
                        this.f4067 = parseInt2;
                        if (!split2[0].startsWith(Crypt.a(Crypt.xrc("\u001d`nKam\u001bd;Af<M0n\u001bjf\u001e79\u001b4jAek\u001dei\u001dj"))) && !split2[0].startsWith(Crypt.a(Crypt.xrc("I`>\u0019`<\u001abgH0kN7gHgj\u001bkg\u001cdhJ0h\u001bbm\u00190"))) && !split2[0].startsWith(Crypt.a(Crypt.xrc("N3=JahMdkJeiH7l\u001dg=L4<KdnKfl\u001d69J0")))) {
                            c2746 = this.f4043;
                            c2755 = new C2755(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), 8888);
                            c2746.m4714(c2755);
                        }
                        if (split2[1].contains(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"))) && split2[0].startsWith(Crypt.a(Crypt.xrc("\u001d`nKam\u001bd;Af<M0n\u001bjf\u001e79\u001b4jAek\u001dei\u001dj")))) {
                            String[] split3 = split2[1].split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")));
                            if (split3.length > 1) {
                                str6 = split3[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
                                str5 = split3[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"))).length > 1 ? split3[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1] : null;
                            } else {
                                str5 = split3[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
                                str6 = str5;
                            }
                            this.f4043.m4714(new C1862(str8, parseInt2, str6, str5, split2[0]));
                        } else {
                            if (!split2[0].startsWith(Crypt.a(Crypt.xrc("I`>\u0019`<\u001abgH0kN7gHgj\u001bkg\u001cdhJ0h\u001bbm\u00190"))) && !split2[0].startsWith(Crypt.a(Crypt.xrc("N3=JahMdkJeiH7l\u001dg=L4<KdnKfl\u001d69J0")))) {
                                this.f4043.m4714(new C1862(str8, parseInt2, null, null, split2[0]));
                            }
                            String[] split4 = split2[1].split(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc")));
                            if (split4.length > 1) {
                                String str9 = split4[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0];
                                str4 = split4[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"))).length > 1 ? split4[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[1] : null;
                                str3 = str9;
                            } else {
                                str3 = split2[1].contains(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"))) ? split4[1].split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")))[0] : null;
                                str4 = str3;
                            }
                            if (this.f4047 == null) {
                                RunnableC1945 runnableC1945 = new RunnableC1945(1082, split2[0].startsWith(Crypt.a(Crypt.xrc("I`>\u0019`<\u001abgH0kN7gHgj\u001bkg\u001cdhJ0h\u001bbm\u00190"))), str8, parseInt2, str3, str4, split2[0]);
                                this.f4047 = runnableC1945;
                                runnableC1945.m4036();
                            }
                            c2746 = this.f4043;
                            c2755 = new C1862(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), 1082, null, null, null);
                            c2746.m4714(c2755);
                        }
                    }
                } else if (!a.equals(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")))) {
                    C2746 c27462 = this.f4043;
                    C2755 c27552 = new C2755(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), 8888);
                    synchronized (c27462) {
                        c27462.f10320 = c27552;
                    }
                }
            }
            this.f4043.m4718(this);
            int i2 = App.f3762.getInt(Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b")), 10);
            C2746 c27463 = this.f4043;
            int i3 = i2 * 1000;
            synchronized (c27463) {
                c27463.m4721(this, i3, 0, i3);
            }
            f4041 = true;
            Intent intent = new Intent();
            intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh")));
            sendBroadcast(intent);
            int i4 = 0;
            while (this.f4043 != null && f4041) {
                try {
                    C2746 c27464 = this.f4043;
                    synchronized (c27464) {
                        z2 = c27464.f10321;
                    }
                    if (!z2) {
                        int i5 = i4 + 1;
                        if (i4 < 1) {
                            m1663();
                            Thread.sleep(1000L);
                            i4 = i5;
                        }
                    }
                } catch (Exception unused3) {
                    return false;
                }
            }
            try {
                C2746 c27465 = this.f4043;
                if (c27465 != null) {
                    synchronized (c27465) {
                        z = c27465.f10321;
                    }
                    if (z) {
                        try {
                            if (this.f4046 == null) {
                                this.f4046 = this.f4043.m4719(1080);
                            }
                        } catch (Exception unused4) {
                        }
                        if (!f4038) {
                            m1672();
                            m1664(2131231150, getString(2131821261));
                            C1687.m3666(f4042, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + this.f4063.format(new Date()) + Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")) + getString(2131821290));
                            Thread thread = this.f4053;
                            if (thread != null && thread.isAlive()) {
                                this.f4071.sendEmptyMessage(1);
                                f4034 = false;
                                f4031 = false;
                                f4036 = true;
                                Intent intent2 = new Intent();
                                intent2.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh")));
                                sendBroadcast(intent2);
                                if ((!App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && this.f4060 == null) {
                                    C1943 c1943 = new C1943();
                                    this.f4060 = c1943;
                                    c1943.m4033();
                                }
                            }
                            C1957 c1957 = new C1957(this);
                            this.f4053 = c1957;
                            c1957.start();
                            f4034 = false;
                            f4031 = false;
                            f4036 = true;
                            Intent intent22 = new Intent();
                            intent22.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh")));
                            sendBroadcast(intent22);
                            if (!App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false)) {
                            }
                            C1943 c19432 = new C1943();
                            this.f4060 = c19432;
                            c19432.m4033();
                        }
                        return true;
                    }
                }
                if (this.f4043 != null && !f4038) {
                    String str10 = f4042;
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                    m4207.append(this.f4063.format(new Date()));
                    m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                    m4207.append(getString(2131820838));
                    m4207.append(Crypt.a(Crypt.xrc("K3g\u001ccg\u001e`=H7<Mbf\u001c7m\u00194<\u001a7h@blJkiHa")));
                    C1687.m3697(str10, m4207.toString());
                    this.f4071.sendEmptyMessage(0);
                    C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
                    C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false);
                }
                return false;
            } catch (Exception unused5) {
                if (this.f4043 != null && !f4038) {
                    String str11 = f4042;
                    StringBuilder m42072 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                    m42072.append(this.f4063.format(new Date()));
                    m42072.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                    m42072.append(getString(2131820839));
                    C1687.m3697(str11, m42072.toString());
                }
                return false;
            }
        } catch (Exception unused6) {
            return false;
        }
    }

    @Override // p131.p225.p226.InterfaceC2745
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1667(Throwable th) {
        String str;
        String sb;
        StringBuilder sb2;
        String replaceAll;
        String a = Crypt.a(Crypt.xrc("\u001ejjJ6fOgfLc;Obm\u001d`nMdfA3lJ6:@g;Na"));
        String a2 = Crypt.a(Crypt.xrc("LklA0gK4nNa=A6l@diIbjOgo\u001aek@fgK`"));
        boolean z = f4031;
        String a3 = Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"));
        String a4 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (!z && !f4038) {
            String str2 = f4042;
            StringBuilder m4207 = C2098.m4207(a4);
            m4207.append(this.f4063.format(new Date()));
            m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gfOa<\u001c09@cnK3o\u001be9\u0019ciHcoNakJ0>K`g@kj\u001dggHcjKe<Hc=Ma9Ma9M0<\u001b3g\u001b0iNjf")));
            m4207.append(th.getMessage());
            C1687.m3697(str2, m4207.toString());
            Throwable cause = th.getCause();
            String a5 = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@"));
            if (cause != null) {
                try {
                    InterfaceC1837 interfaceC1837 = App.f3760;
                    if (!Boolean.valueOf(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2]).booleanValue()) {
                        InterfaceC1837 interfaceC18372 = App.f3760;
                        if (!Boolean.valueOf(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[15]).booleanValue()) {
                            sb2 = new StringBuilder();
                            sb2.append(a4);
                            sb2.append(this.f4063.format(new Date()));
                            sb2.append(a5);
                            replaceAll = th.getCause().getMessage();
                            sb2.append(replaceAll);
                            C1687.m3697(str2, sb2.toString());
                        }
                    }
                    if (this.f4045 != null && !th.getCause().getMessage().contains(this.f4045)) {
                        if (!th.getCause().getMessage().contains(this.f4049 + "") && !th.getCause().getMessage().contains(this.f4051)) {
                            if (!th.getCause().getMessage().contains(this.f4067 + "") && !th.getCause().getMessage().contains(a)) {
                                sb2 = new StringBuilder();
                                sb2.append(a4);
                                sb2.append(this.f4063.format(new Date()));
                                sb2.append(a5);
                                replaceAll = th.getCause().getMessage().replaceAll(this.f4048, a2).replaceAll(this.f4058, a2);
                                sb2.append(replaceAll);
                                C1687.m3697(str2, sb2.toString());
                            }
                        }
                    }
                } catch (Exception unused) {
                    InterfaceC1837 interfaceC18373 = App.f3760;
                    if (!Boolean.valueOf(((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[2]).booleanValue()) {
                        str = f4042;
                        StringBuilder m42072 = C2098.m4207(a4);
                        m42072.append(this.f4063.format(new Date()));
                        m42072.append(a5);
                        m42072.append(th.getCause().getMessage());
                        sb = m42072.toString();
                    } else if (this.f4045 != null && !th.getCause().getMessage().contains(this.f4045)) {
                        if (!th.getCause().getMessage().contains(this.f4049 + "") && !th.getCause().getMessage().contains(this.f4051)) {
                            if (!th.getCause().getMessage().contains(this.f4067 + "") && !th.getCause().getMessage().contains(a)) {
                                str = f4042;
                                StringBuilder m42073 = C2098.m4207(a4);
                                m42073.append(this.f4063.format(new Date()));
                                m42073.append(a5);
                                m42073.append(th.getCause().getMessage().replaceAll(this.f4048, a2).replaceAll(this.f4058, a2));
                                sb = m42073.toString();
                            }
                        }
                    }
                    C1687.m3697(str, sb);
                }
            }
            if (App.f3762.getBoolean(a3, false)) {
                String str3 = f4042;
                StringBuilder m42074 = C2098.m4207(a4);
                m42074.append(this.f4063.format(new Date()));
                m42074.append(a5);
                m42074.append(getString(2131820814));
                C1687.m3697(str3, m42074.toString());
            }
        }
        if (f4034 || f4038 || !App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false)) {
            return;
        }
        f4041 = false;
        f4034 = true;
        f4031 = false;
        Intent intent = new Intent();
        String a6 = Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"));
        intent.setAction(a6);
        sendBroadcast(intent);
        m1664(2131231152, getString(2131820646));
        String str4 = f4042;
        StringBuilder m42075 = C2098.m4207(a4);
        m42075.append(this.f4063.format(new Date()));
        String a7 = Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"));
        m42075.append(a7);
        m42075.append(getString(2131821294));
        C1687.m3666(str4, m42075.toString());
        int i = 1;
        while (!m1666()) {
            if (!App.f3762.getBoolean(a3, false)) {
                if (!f4035) {
                    f4041 = false;
                    f4035 = true;
                    String str5 = f4042;
                    StringBuilder m42076 = C2098.m4207(a4);
                    m42076.append(this.f4063.format(new Date()));
                    m42076.append(a7);
                    m42076.append(getString(2131821298));
                    C1687.m3666(str5, m42076.toString());
                    C1687.m3666(str5, a4 + this.f4063.format(new Date()) + a7 + getString(2131821291));
                    C1687.m3666(str5, a4 + this.f4063.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")) + getString(2131820633));
                }
                f4034 = false;
                f4036 = false;
                f4031 = true;
                m1665(getString(2131821262));
                Intent intent2 = new Intent();
                intent2.setAction(a6);
                sendBroadcast(intent2);
                m1669();
                return;
            }
            String str6 = f4042;
            StringBuilder m42077 = C2098.m4207(a4);
            m42077.append(this.f4063.format(new Date()));
            m42077.append(a7);
            m42077.append(getString(2131821296));
            m42077.append(Crypt.a(Crypt.xrc("Og;\u001aahMcnA1iA`lJ4>\u001cdi\u00190gNknN0lH4")));
            m42077.append(i);
            m42077.append("");
            C1687.m3666(str6, m42077.toString());
            try {
                Thread.sleep(1000L);
            } catch (Exception unused2) {
            }
            i++;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1668() {
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), false)) {
            m1673(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")), Crypt.a(Crypt.xrc("\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af")), App.f3762.getString(Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1")), Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"))), 53, App.f3762.getString(Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba")), Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"))), 53, f4033, f4037);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m1669() {
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001de:Idk\u001c6=H3:O4mLe:\u001eelJ79\u001d6<\u001bcn\u001b7")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false);
        AsyncTaskC1840 asyncTaskC1840 = this.f4056;
        if (asyncTaskC1840 != null) {
            asyncTaskC1840.cancel(true);
        }
        ParcelFileDescriptor parcelFileDescriptor = this.f4052;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.f4052 = null;
            } catch (Exception e) {
                String str = f4042;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(this.f4063.format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                m4207.append(e.getMessage());
                C1687.m3697(str, m4207.toString());
            }
        }
        Tun2Socks.Stop();
        Thread thread = this.f4053;
        if (thread != null) {
            thread.interrupt();
            this.f4053 = null;
        }
        C1935.f8428 = null;
        f4032 = null;
        stopSelf();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public PendingIntent m1670() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        intent.addFlags(131072);
        return activity;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean m1671(String str, int i, String str2, byte[] bArr) {
        int i2;
        boolean z;
        int i3 = C2774.f10424;
        MD5 md5 = new MD5();
        Iterator<AbstractC2723<PublicKey, PrivateKey>> it = C2724.f10215.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (it.next().f10212.equals(str2)) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(C2098.m4205(Crypt.a(Crypt.xrc("Lbi\u001cao\u001bkkHfi\u001eki@kn\u001a4m\u001e4iM1kJ0l\u001a0:J6g\u001ae:A4i\u0019dfAbj\u001b7;Je<\u001ejf\u001eciL3hO")), str2));
        }
        if (bArr == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("M0iI3g\u001bjlN0=H1fK`g\u00196=Laj@f=L4gLj")));
        }
        md5.update(bArr);
        int digestLength = md5.getDigestLength();
        byte[] bArr2 = new byte[digestLength];
        md5.digest(bArr2);
        char[] charArray = Crypt.a(Crypt.xrc("\u00194hAjm\u001edh@4kAj=\u001dbjK4o\u001d1oN0<Mfh\u001b39@c;\u00190fH`m\u001ecoHkfAc<\u001c4j\u0019bm\u0019jiL3j\u001c")).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (i2 = 0; i2 < digestLength; i2++) {
            if (i2 != 0) {
                sb.append(':');
            }
            int i4 = bArr2[i2] & 255;
            sb.append(charArray[i4 >> 4]);
            sb.append(charArray[i4 & 15]);
        }
        String sb2 = sb.toString();
        String str3 = f4042;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("M1oJ6:@cgLei\u001bg;Hd:\u001a6l\u001ee:\u001cbh\u001969@7hA1i\u0019cnN6i@an\u001ckn\u001bcg\u001d39\u001c0=\u001ack\u0019cgM")));
        m4207.append(sb2);
        C1687.m3666(str3, m4207.toString());
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("Jfo\u001bk:\u001e7m\u001b6k\u0019e9\u001agjAj<O7;Nk<N0nAgfNd:\u001d3iA1m\u001bf;@7gA6h\u001cdj\u001aj>\u001efhMa<N"));
        boolean equals = sharedPreferences.getString(a, "").equals(str2);
        String a2 = Crypt.a(Crypt.xrc("J`fMbn\u001ebhNf>HdkK69J0fKdmI1j\u001c4fKb"));
        if (equals && App.f3762.getString(a2, "").equals(sb2)) {
            return true;
        }
        C2098.m4186(App.f3762, a, str2);
        C2098.m4186(App.f3762, a2, sb2);
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1672() {
        C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("K4l@gkL`jHb9L7oH3lKch\u001dj>\u001a3f\u001cj;Jk")), true);
        String str = f4042;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(this.f4063.format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
        m4207.append(getString(2131821292));
        C1687.m3666(str, m4207.toString());
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), false)) {
            m1673(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")), Crypt.a(Crypt.xrc("\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af")), App.f3762.getString(Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1")), Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"))), 53, App.f3762.getString(Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba")), Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"))), 53, f4033, f4037);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m1673(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6) {
        boolean z;
        String str7 = "global {\n perm_cache = 1024;\n cache_dir = \"" + str6 + "\";\n server_port = 8091;\n server_ip = " + str2 + ";\n query_method = tcp_only;\n min_ttl = 15m;\n max_ttl = 1w;\n timeout = 10;\n daemon = on;\n}\n\nserver {\n label = dns1;\n ip = " + str3 + ";\n port = " + i + ";\n uptest = none;\n}\n\nserver {\n label = dns2;\n ip = " + str4 + ";\n port = " + i2 + ";\n uptest = none;\n}\n\nrr {\n name=localhost;\n reverse=on;\n a=127.0.0.1;\n owner=localhost;\n soa=localhost,root.localhost,42,86400,900,86400,86400;\n}";
        if (!str.equals(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")))) {
            if (str.equals(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")))) {
                Process process = this.f4064;
                if (process != null) {
                    process.destroy();
                    this.f4064 = null;
                }
                File file = this.f4062;
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            }
            return;
        }
        File file2 = new File(C2098.m4205(str5, Crypt.a(Crypt.xrc("Lkl\u001e19\u0019egL0<\u001ejo\u001c3=\u0019ciH6>O39\u001bd>Mj"))));
        this.f4062 = file2;
        try {
            PrintWriter printWriter = new PrintWriter(file2);
            printWriter.println(str7);
            printWriter.flush();
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            try {
                this.f4064 = new ProcessBuilder(new String[0]).command(new File(getApplicationInfo().nativeLibraryDir, Crypt.a(Crypt.xrc("J6hLblMakJ3<M7k\u001dehAk9\u001cegL3i\u001bdn\u001e4"))).getAbsolutePath(), Crypt.a(Crypt.xrc("L7=Akh\u0019g:Hj=O6<Ad:\u00197lJ7;\u001e4mAbg\u0019g")), this.f4062.getAbsolutePath()).redirectErrorStream(true).start();
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(6:7|8|9|(5:109|110|111|112|113)(3:11|12|13)|14|15)|(19:17|18|19|20|21|22|23|(1:25)(1:95)|26|(3:28|(1:30)(1:32)|31)|33|(2:35|(1:37)(2:85|39))(2:86|(1:88)(5:89|(1:91)(1:94)|92|93|39))|40|(3:42|(1:44)|45)(1:84)|46|(2:47|(5:49|50|51|58|59)(1:61))|62|63|(8:65|66|67|68|69|70|71|72)(6:78|79|(1:81)|82|56|57))(3:101|102|(2:104|105)(8:106|40|(0)(0)|46|(3:47|(0)(0)|59)|62|63|(0)(0)))|38|39|40|(0)(0)|46|(3:47|(0)(0)|59)|62|63|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0580, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x024a A[Catch: Exception -> 0x019e, all -> 0x0588, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0272 A[Catch: Exception -> 0x019e, all -> 0x0588, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02bc A[Catch: Exception -> 0x019e, all -> 0x0588, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03b2 A[Catch: Exception -> 0x019e, all -> 0x0588, TRY_ENTER, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x048b A[Catch: Exception -> 0x019e, all -> 0x0588, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x049d A[EDGE_INSN: B:61:0x049d->B:62:0x049d BREAK  A[LOOP:0: B:47:0x0485->B:59:0x0485], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04a5 A[Catch: Exception -> 0x0582, all -> 0x0588, TRY_LEAVE, TryCatch #6 {all -> 0x0588, blocks: (B:8:0x007f, B:110:0x010b, B:113:0x010f, B:14:0x01b8, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:40:0x03a8, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:46:0x0436, B:47:0x0485, B:49:0x048b, B:51:0x0491, B:62:0x049d, B:65:0x04a5, B:68:0x04c1, B:70:0x04d2, B:55:0x058f, B:79:0x0562, B:81:0x0566, B:82:0x057d, B:84:0x0427, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:102:0x0364, B:104:0x0368, B:106:0x0378, B:13:0x01b3), top: B:7:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0427 A[Catch: Exception -> 0x0582, all -> 0x0588, TRY_ENTER, TryCatch #6 {all -> 0x0588, blocks: (B:8:0x007f, B:110:0x010b, B:113:0x010f, B:14:0x01b8, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:40:0x03a8, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:46:0x0436, B:47:0x0485, B:49:0x048b, B:51:0x0491, B:62:0x049d, B:65:0x04a5, B:68:0x04c1, B:70:0x04d2, B:55:0x058f, B:79:0x0562, B:81:0x0566, B:82:0x057d, B:84:0x0427, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:102:0x0364, B:104:0x0368, B:106:0x0378, B:13:0x01b3), top: B:7:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0303 A[Catch: Exception -> 0x019e, all -> 0x0588, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0255 A[Catch: Exception -> 0x019e, all -> 0x0588, TryCatch #2 {Exception -> 0x019e, blocks: (B:113:0x010f, B:17:0x0204, B:19:0x0206, B:22:0x0216, B:23:0x022b, B:25:0x024a, B:26:0x026c, B:28:0x0272, B:30:0x0282, B:32:0x029a, B:33:0x02a5, B:35:0x02bc, B:37:0x02c0, B:38:0x02cc, B:42:0x03b2, B:44:0x03be, B:45:0x03ea, B:49:0x048b, B:51:0x0491, B:85:0x02d1, B:86:0x0303, B:88:0x0307, B:89:0x0314, B:91:0x031c, B:92:0x0333, B:93:0x034a, B:94:0x0338, B:95:0x0255, B:104:0x0368), top: B:112:0x010f }] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1674() {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.sockets.SSHTunnelService.m1674():void");
    }
}
