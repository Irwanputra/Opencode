package de.blinkt.openvpn.core;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.VpnService;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import de.blinkt.openvpn.api.ConfirmDialog;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0749;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.C0770;
import p010.p011.p012.p013.InterfaceC0737;
import p010.p011.p012.p013.InterfaceC0761;
import p010.p011.p012.p013.RunnableC0772;
import p034.p095.C1687;
import p107.p108.p109.p110.p121.C1935;
import p107.p108.p109.p110.p121.C1943;
import p107.p108.p109.p110.p121.p125.p126.RunnableC1945;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OpenVPNService extends VpnService implements C0753.InterfaceC0757, Handler.Callback, C0753.InterfaceC0756, InterfaceC0761 {

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static boolean f3695;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C0775 f3696;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C1943 f3701;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public long f3702;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public RunnableC1945 f3703;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public InterfaceC0737 f3704;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public String f3707;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Handler f3708;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Toast f3712;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f3713;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public PowerManager.WakeLock f3714;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public DeviceStateReceiver f3715;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public String f3716;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public PowerManager f3717;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Runnable f3719;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3722;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Vector<String> f3697 = new Vector<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0770 f3706 = new C0770();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0770 f3718 = new C0770();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Object f3710 = new Object();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Thread f3699 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f3721 = null;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C0749 f3700 = null;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String f3711 = null;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f3720 = false;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f3705 = false;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final IBinder f3709 = new BinderC0497();

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public C1935 f3698 = null;

    /* renamed from: de.blinkt.openvpn.core.OpenVPNService$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0495 implements Runnable {
        public RunnableC0495() {
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x02a7 A[LOOP:1: B:81:0x00af->B:107:0x02a7, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0178 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 712
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.RunnableC0495.run():void");
        }
    }

    /* renamed from: de.blinkt.openvpn.core.OpenVPNService$くし〴〺ぅ, reason: contains not printable characters */
    public class BinderC0496 extends Binder {
        public BinderC0496(BinderC0497 binderC0497) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            OpenVPNService.this.onRevoke();
            return true;
        }
    }

    /* renamed from: de.blinkt.openvpn.core.OpenVPNService$げつ〴ぬぐ, reason: contains not printable characters */
    public class BinderC0497 extends InterfaceC0761.AbstractBinderC0762 {
        public BinderC0497() {
        }

        @Override // p010.p011.p012.p013.InterfaceC0761.AbstractBinderC0762, android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            OpenVPNService.this.onRevoke();
            return true;
        }

        @Override // p010.p011.p012.p013.InterfaceC0761
        /* renamed from: ぉざぅち〻 */
        public void mo1585(String str) {
            OpenVPNService.this.mo1585(str);
        }

        @Override // p010.p011.p012.p013.InterfaceC0761
        /* renamed from: げつ〴ぬぐ */
        public boolean mo1589(boolean z) {
            return OpenVPNService.this.mo1589(z);
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static String m1579(long j, boolean z, Resources resources) {
        if (z) {
            j *= 8;
        }
        double d = j;
        double d2 = z ? 1000 : 1024;
        int max = Math.max(0, Math.min((int) (Math.log(d) / Math.log(d2)), 3));
        double pow = Math.pow(d2, max);
        Double.isNaN(d);
        float f = (float) (d / pow);
        return z ? max != 0 ? max != 1 ? max != 2 ? resources.getString(2131820877, Float.valueOf(f)) : resources.getString(2131820965, Float.valueOf(f)) : resources.getString(2131820939, Float.valueOf(f)) : resources.getString(2131820656, Float.valueOf(f)) : max != 0 ? max != 1 ? max != 2 ? resources.getString(2131821410, Float.valueOf(f)) : resources.getString(2131821412, Float.valueOf(f)) : resources.getString(2131821411, Float.valueOf(f)) : resources.getString(2131821409, Float.valueOf(f));
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f3709;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback == null) {
            return false;
        }
        callback.run();
        return true;
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao")))) ? new BinderC0496(null) : this.f3709;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId")), true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C1943 c1943;
        PowerManager.WakeLock wakeLock;
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId")), false);
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true) && (wakeLock = this.f3714) != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.f3714.release();
                    C1687.m3666(OpenVPNService.class.getSimpleName(), Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN")));
                }
            } catch (Exception unused) {
            }
        }
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001d1iL7:J1n\u001dkmAj9Jc>\u0019g=\u001b0=@jn\u001ealL6")), false)) {
                RunnableC1945 runnableC1945 = this.f3703;
                if (runnableC1945 != null) {
                    runnableC1945.m4038();
                    this.f3703 = null;
                }
            } else {
                C1935 c1935 = this.f3698;
                if (c1935 != null && (c1935.isAlive() || this.f3698.f8450)) {
                    this.f3698.getClass();
                    this.f3698.m4028();
                    this.f3698 = null;
                }
            }
        }
        if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && (c1943 = this.f3701) != null) {
            c1943.m4034();
            this.f3701 = null;
        }
        synchronized (this.f3710) {
            if (this.f3699 != null) {
                this.f3704.mo2007(true);
            }
        }
        DeviceStateReceiver deviceStateReceiver = this.f3715;
        if (deviceStateReceiver != null) {
            unregisterReceiver(deviceStateReceiver);
        }
        C0753.m2040(this);
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        try {
            mo1589(true);
        } catch (RemoteException unused) {
        }
        C0753.m2027(2131821113);
        this.f3704.mo2007(false);
        m1586();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0441  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.onStartCommand(android.content.Intent, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01ac A[Catch: ParseException | Exception -> 0x021a, TryCatch #0 {ParseException | Exception -> 0x021a, blocks: (B:19:0x0175, B:21:0x01ac, B:23:0x0212), top: B:18:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // p010.p011.p012.p013.C0753.InterfaceC0756
    /* renamed from: 〺つふすそ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1569(long r14, long r16, long r18, long r20) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.mo1569(long, long, long, long):void");
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final boolean m1580(String str) {
        return str != null && (str.startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197"))) || Crypt.a(Crypt.xrc("\u001d6n\u001ba>@`h\u001cg<\u001a3hOkm@egH3lA1fLa>@`")).equals(str) || Crypt.a(Crypt.xrc("\u0019kmK`fI6l\u001eclL1oOf<O3:\u001b4lJjg\u001d`m@c")).equals(str));
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public synchronized void m1581() {
        DeviceStateReceiver deviceStateReceiver = this.f3715;
        if (deviceStateReceiver != null) {
            try {
                C0753.m2047(deviceStateReceiver);
                unregisterReceiver(this.f3715);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f3715 = null;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public void m1582(String str, String str2, String str3, String str4) {
        C0749 c0749 = new C0749(str, str2);
        boolean m1580 = m1580(str4);
        C0770.C0771 c0771 = new C0770.C0771(new C0749(str3, 32), false);
        C0749 c07492 = this.f3700;
        if (c07492 == null) {
            C0753.m2031(Crypt.a(Crypt.xrc("I0nOaiMbh@ffM6kK7;Nk<OfjJd<Nf=O1k\u001b1o\u001e3i@0o\u0019b=\u001b6o\u001d19\u001eb<\u0019f9H`m\u001caiJam\u001c4:Lj:\u001d0>ObgLakNdiA6hLjf\u001b3n\u001e6=O7<A1<Adj\u001e0fNdg\u001aglOjgO6lL0=KcfAj;H1:\u001cfo\u00197kN7nH1:Ic:\u0019fj\u001aa>O3mN7hL0lI1h\u001ejh\u001eb=MdmK6nJe=Nd;O19\u001cjk\u001e`<Hkk\u001b3:\u001b3h\u001c6i@k9A`=Mkf\u001bafIjkL4:IciIjhJ0hN3k@0=\u00191i\u001eblNb=LkgA39\u001bfmL1<@g9H3gAdnL1g\u001ac<Na<AenIag\u0019fn\u001dbnK6f@0kN3:He>HanLklNafA0fIbj\u001d6nN3")));
            return;
        }
        if (new C0770.C0771(c07492, true).m2084(c0771)) {
            m1580 = true;
        }
        String a = Crypt.a(Crypt.xrc("\u0019b=\u001cgl\u001d4n\u001dblOk=L7iAb:IcjL7l\u001cai@f"));
        if (str3 != null && (str3.equals(a) || str3.equals(this.f3707))) {
            m1580 = true;
        }
        if (c0749.f4862 == 32 && !str2.equals(a)) {
            C0753.m2033(2131821208, str, str2);
        }
        if (c0749.m2025()) {
            C0753.m2033(2131821209, str, Integer.valueOf(c0749.f4862), c0749.f4863);
        }
        C2098.m4181(c0749, m1580, this.f3706.f4931);
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void mo1583(String str) {
    }

    @TargetApi(16)
    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m1584(int i, Notification.Builder builder) {
        if (i != 0) {
            try {
                builder.getClass().getMethod(Crypt.a(Crypt.xrc("\u001a`gO6;M7iAfl\u001d3kKchOdoIcgLbm\u001b4:J7")), Integer.TYPE).invoke(builder, Integer.valueOf(i));
                builder.getClass().getMethod(Crypt.a(Crypt.xrc("J69\u001d3n\u001d1mJb>H6fM0h\u001dfjH`9\u001b0;H7j@cgAehLeh\u001cg:\u001e3gIa;@1<Ifh@bo\u0019am\u001b1g\u001c")), Boolean.TYPE).invoke(builder, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                LinkedList<LogItem> linkedList = C0753.f4875;
            }
        }
    }

    @Override // p010.p011.p012.p013.InterfaceC0761
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo1585(String str) {
        SharedPreferences m3670 = C1687.m3670(this);
        HashSet hashSet = new HashSet();
        String a = Crypt.a(Crypt.xrc("A7;\u001b7o\u001d`gMeh\u001c1;\u001ejl\u001b1oKej\u001cg=\u001ed>\u0019f"));
        Set<String> stringSet = m3670.getStringSet(a, hashSet);
        stringSet.add(str);
        SharedPreferences m36702 = C1687.m3670(this);
        SharedPreferences.Editor edit = m36702.edit();
        edit.putStringSet(a, stringSet);
        String a2 = Crypt.a(Crypt.xrc("Jj9K39\u001a4fH`<\u001d69\u001bfg\u001d0jJcj\u0019d;\u001bg<\u0019k"));
        edit.putInt(a2, m36702.getInt(a2, 0) + 1);
        edit.apply();
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final void m1586() {
        synchronized (this.f3710) {
            this.f3699 = null;
        }
        C0753.m2047(this);
        m1581();
        C0765.m2061(this);
        this.f3719 = null;
        if (this.f3705) {
            return;
        }
        stopForeground(!f3695);
        if (f3695) {
            return;
        }
        stopSelf();
        C0753.m2040(this);
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean m1587(String str) {
        if (str == null) {
            str = Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bg\u001d4mI6nNd:O1hO0gOel\u001dk:OfmNj>LcgLdl\u0019ah\u001eci\u0019ek\u001b`9O7k\u001ab>\u001e4f\u001d7=\u001e49\u001c6n"));
        }
        if (C1687.m3670(this).getStringSet(Crypt.a(Crypt.xrc("A7;\u001b7o\u001d`gMeh\u001c1;\u001ejl\u001b1oKej\u001cg=\u001ed>\u0019f")), new HashSet()).contains(str)) {
            return true;
        }
        Intent intent = new Intent(this, (Class<?>) ConfirmDialog.class);
        intent.addFlags(268435456);
        intent.putExtra(Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3=A4m\u001b7m\u001ckkOf:\u001e6h\u001ak<Kcl@km\u001ejg\u00196kNk>Kbi\u00191hOghJ7hH`=K4i\u001cfo\u001a4j\u001c`9M1l")), str);
        startActivity(intent);
        return false;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final boolean m1588() {
        return ((UiModeManager) getSystemService(Crypt.a(Crypt.xrc("OfiI3jM6lOajI`>\u001cfiK0<Mcf\u0019alNe=\u0019e")))).getCurrentModeType() == 4;
    }

    @Override // p010.p011.p012.p013.InterfaceC0761
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo1589(boolean z) {
        C1943 c1943;
        PowerManager.WakeLock wakeLock;
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId")), false);
        if (this.f3704 == null) {
            return false;
        }
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), true) && (wakeLock = this.f3714) != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.f3714.release();
                    C1687.m3666(OpenVPNService.class.getSimpleName(), Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("O0l\u001c`nKgjO3f\u00193;O0=K7g@g=\u001e49Ock@df\u001bjn\u001ea=LdgJ1gMek\u00196:L3=@4:HdoHjoN")));
                }
            } catch (Exception unused) {
            }
        }
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false)) {
            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001d1iL7:J1n\u001dkmAj9Jc>\u0019g=\u001b0=@jn\u001ealL6")), false)) {
                RunnableC1945 runnableC1945 = this.f3703;
                if (runnableC1945 != null) {
                    runnableC1945.m4038();
                    this.f3703 = null;
                }
            } else {
                C1935 c1935 = this.f3698;
                if (c1935 != null && (c1935.isAlive() || this.f3698.f8450)) {
                    this.f3698.getClass();
                    this.f3698.m4028();
                    this.f3698 = null;
                }
            }
        }
        if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && (c1943 = this.f3701) != null) {
            c1943.m4034();
            this.f3701 = null;
        }
        return this.f3704.mo2007(z);
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void m1590(String str, boolean z) {
        String[] split = str.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")));
        try {
            this.f3718.f4931.add(new C0770.C0771((Inet6Address) InetAddress.getAllByName(split[0])[0], Integer.parseInt(split[1]), z));
        } catch (UnknownHostException unused) {
            LinkedList<LogItem> linkedList = C0753.f4875;
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public PendingIntent m1591() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        return PendingIntent.getActivity(this, 0, intent, 0);
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final void m1592(String str, String str2, String str3, long j, ConnectionStatus connectionStatus) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193")));
        int ordinal = connectionStatus.ordinal();
        int i = ordinal != 0 ? ordinal != 1 ? (ordinal == 4 || ordinal == 5 || ordinal == 7) ? 2131231153 : 2131231152 : 2131231134 : 2131231150;
        Notification.Builder builder = new Notification.Builder(this);
        int i2 = str3.equals(Crypt.a(Crypt.xrc("L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"))) ? -2 : str3.equals(Crypt.a(Crypt.xrc("Kdl\u001cdiH0:AfnJ6kJemI4oAfmN6f@0j\u001af"))) ? 2 : 0;
        builder.setContentTitle(getString(this.f3696 != null ? 2131820626 : 2131821062));
        builder.setContentText(str);
        builder.setOnlyAlertOnce(true);
        builder.setOngoing(true);
        builder.setSmallIcon(i);
        builder.setContentIntent(m1591());
        if (j != 0) {
            builder.setWhen(j);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 16) {
            m1584(i2, builder);
        }
        if (i3 >= 21) {
            builder.setCategory(Crypt.a(Crypt.xrc("\u001bkh@4n\u001deh\u001cgiIc9Oj=L09OjgO3>N7h\u001b3")));
            builder.setLocalOnly(true);
        }
        if (i3 >= 26) {
            builder.setChannelId(str3);
            C0775 c0775 = this.f3696;
            if (c0775 != null) {
                builder.setShortcutId(c0775.m2102());
            }
        }
        if (str2 != null && !str2.equals("")) {
            builder.setTicker(str2);
        }
        Notification notification = builder.getNotification();
        int hashCode = str3.hashCode();
        notificationManager.notify(hashCode, notification);
        startForeground(hashCode, notification);
        String str4 = this.f3713;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.f3713.hashCode());
        }
        this.f3713 = str3;
        if (!m1588() || i2 < 0) {
            return;
        }
        this.f3708.post(new RunnableC0772(this, str));
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final String m1593() {
        C0749 c0749 = this.f3700;
        String a = Crypt.a(Crypt.xrc("\u001ej=@0:\u001d`g\u001ddhH1nH1<MeiMbn\u001c1>\u00197nN3hN0<J1:I`9\u001ad<\u00191>H4oLjmA0fIdn\u001bfjM"));
        if (c0749 != null) {
            StringBuilder m4207 = C2098.m4207(a);
            m4207.append(this.f3700.toString());
            a = m4207.toString();
        }
        if (this.f3711 != null) {
            StringBuilder m42072 = C2098.m4207(a);
            m42072.append(this.f3711);
            a = m42072.toString();
        }
        StringBuilder m4179 = C2098.m4179(a, Crypt.a(Crypt.xrc("LggOa:K3l\u001ag;K7=\u0019f;Oe=\u0019e;@f>\u001bfl@1")));
        Collection<C0770.C0771> m2078 = this.f3706.m2078(true);
        String a2 = Crypt.a(Crypt.xrc("\u001dan@cn\u001cjkN3:\u001c`9Afm\u001c6:Ib:\u00194iJ69Hg"));
        m4179.append(TextUtils.join(a2, m2078));
        m4179.append(TextUtils.join(a2, this.f3718.m2078(true)));
        StringBuilder m41792 = C2098.m4179(m4179.toString(), Crypt.a(Crypt.xrc("\u00191g\u00194g\u001b4l@4oOfg\u001b6<K4<\u001c19\u001ccgHghI1")));
        m41792.append(TextUtils.join(a2, this.f3706.m2078(false)));
        m41792.append(TextUtils.join(a2, this.f3718.m2078(false)));
        StringBuilder m41793 = C2098.m4179(m41792.toString(), Crypt.a(Crypt.xrc("Ka=Mf;Kcl\u001e`oNb9\u001ckoNfhAcmOjfJjh\u0019d")));
        m41793.append(TextUtils.join(a2, this.f3697));
        StringBuilder m41794 = C2098.m4179(m41793.toString(), Crypt.a(Crypt.xrc("\u0019ckKe=Lbm\u001d7m\u001cd>M`;\u001bamOef@`9\u001c6gJc")));
        m41794.append(this.f3721);
        StringBuilder m41795 = C2098.m4179(m41794.toString(), Crypt.a(Crypt.xrc("\u001djnNb=MdfN4kM7<N1j\u001c3iI4<Ja:@a;\u001ea")));
        m41795.append(this.f3722);
        return m41795.toString();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m1594(String str) {
        if (this.f3704 != null) {
            this.f3704.mo2008(Base64.encodeToString(str.getBytes(Charset.forName(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")))), 0));
        }
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo1595(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019blN`l\u001dcl\u001a7j\u001ebn\u0019k:\u001b4nIb:Ial\u001d19@7f\u001eek\u001cj9\u001c3nH6jJk;@a9Je9\u001c3>L6i\u001ach\u001eeo")));
        intent2.putExtra(Crypt.a(Crypt.xrc("LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1")), connectionStatus.toString());
        intent2.putExtra(Crypt.a(Crypt.xrc("\u0019giH6>\u001b4h\u001d0g\u001cd:\u001ce:\u001dc;\u001dcmKcf\u0019d<N3")), str);
        sendBroadcast(intent2, Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9J4lO69Jc:\u001d3:\u00193oOcoLfoKf:Lf;L3lI79\u001e7oLk:\u001d7hM0fMjnNjhAei\u001afgI6=@`g")));
        if (this.f3699 != null || f3695) {
            String a = Crypt.a(Crypt.xrc("K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj"));
            if (connectionStatus == ConnectionStatus.f3662) {
                C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("I`=N6o\u001eaf\u001ea;Ng=\u001b1mLjo\u001da9\u001e`fLbfId")), true);
                this.f3720 = true;
                this.f3702 = System.currentTimeMillis();
                if (!m1588()) {
                    a = Crypt.a(Crypt.xrc("L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"));
                }
                if ((App.f3762.getBoolean(Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4")), false) || App.f3762.getBoolean(Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1")), false)) && this.f3701 == null) {
                    C1943 c1943 = new C1943();
                    this.f3701 = c1943;
                    c1943.m4033();
                }
            } else {
                this.f3720 = false;
            }
            m1592(C0753.m2037(this), C0753.m2037(this), a, 0L, connectionStatus);
        }
    }
}
