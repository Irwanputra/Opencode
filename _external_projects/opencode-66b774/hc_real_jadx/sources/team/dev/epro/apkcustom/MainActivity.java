package team.dev.epro.apkcustom;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.VpnService;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0761;
import p034.p035.p041.C1043;
import p034.p035.p043.C1067;
import p034.p050.p053.C1216;
import p034.p050.p060.C1290;
import p034.p050.p060.DialogInterfaceC1343;
import p034.p095.C1687;
import p034.p105.p106.AbstractC1780;
import p034.p105.p106.AbstractC1792;
import p107.p108.p109.p110.C1829;
import p107.p108.p109.p110.C1864;
import p107.p108.p109.p110.C1930;
import p107.p108.p109.p110.p113.C1842;
import p107.p108.p109.p110.p113.C1852;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p107.p108.p109.p110.p113.p117.C1858;
import p107.p108.p109.p110.p113.p117.DialogInterfaceOnClickListenerC1857;
import p107.p108.p109.p110.p113.p117.InterfaceC1859;
import p107.p108.p109.p110.p119.C1867;
import p107.p108.p109.p110.p119.C1896;
import p107.p108.p109.p110.p119.C1899;
import p107.p108.p109.p110.p119.C1921;
import p107.p108.p109.p110.p121.p122.C1931;
import p107.p108.p109.p110.p121.p122.C1932;
import p107.p108.p109.p110.p121.p122.RunnableC1933;
import p107.p108.p109.p110.p121.p128.C1958;
import p131.p150.p151.C2079;
import p131.p155.p156.p157.C2098;
import p131.p158.p159.p160.RunnableC2106;
import team.dev.epro.apkcustom.activities.GeneratedConfig;
import team.dev.epro.apkcustom.activities.SmartGuide;
import team.dev.epro.apkcustom.dialogs.GroupSort;
import team.dev.epro.apkcustom.dialogs.TimeOut;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MainActivity extends AppCompatActivity implements NavigationView.InterfaceC0454, C1899.InterfaceC1905, C1867.InterfaceC1877, C1921.InterfaceC1923, C1043.InterfaceC1044, InterfaceC1859 {

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public static C1958 f3764;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public static final String f3765 = MainActivity.class.getSimpleName();

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public WifiP2pManager f3766;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public boolean f3767;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public DialogInterfaceC1343 f3768;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public FloatingActionButton f3769;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public View f3770;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public Intent f3772;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public C1896 f3773;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public TextView f3774;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public Date f3777;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public TextView f3778;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Toolbar f3779;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean f3781;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public FloatingActionButton f3782;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public boolean f3783;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public boolean f3784;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public int f3785;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public ArrayList<String> f3786;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public boolean f3787;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public FloatingActionButton f3788;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public int f3789;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public TabLayout f3791;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public DrawerLayout f3793;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C0515 f3794;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public LogView f3796;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public C1858 f3797;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public FloatingActionMenu f3798;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public boolean f3799;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public boolean f3800;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C1290 f3801;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public C1921 f3802;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public ProgressDialog f3803;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public C1867 f3805;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public boolean f3806;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public boolean f3807;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public boolean f3808;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ViewPager f3809;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public WifiP2pManager.Channel f3810;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public BroadcastReceiver f3811;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public C1899 f3812;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public NavigationView f3814;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public FloatingActionButton f3815;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public InterfaceC0761 f3816;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean f3817;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean f3818;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public int f3776 = 1;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public String f3804 = "";

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public String f3792 = "";

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public String f3790 = "";

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public String f3775 = Crypt.a(Crypt.xrc("\u001bdh\u001b4lM6>\u001eb=\u001c`9\u001ediIb>Hg;NcfJc>@cf\u001aj<\u001bgi\u0019fh\u001b4gNjk\u001af>J1mM`hI7l\u001a3jN"));

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public String f3813 = "com.android.settings.Settings\\$TetherSettingsActivity";

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public String f3780 = Crypt.a(Crypt.xrc("\u001bdh\u001b4lM6>\u001eb=\u001c`9\u001ediIb>Hg;NcfJc>@c;Jaf\u001c7=\u001bdgNjjKe>Keg\u001c4f\u00194hNbnOao\u0019b:J1j\u001b`kLg;\u00190n@j<L`f\u001c3:NehAf<Jb>"));

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public View.OnClickListener f3795 = new ViewOnClickListenerC0514();

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public ServiceConnection f3771 = new ServiceConnectionC0508();

    /* renamed from: team.dev.epro.apkcustom.MainActivity$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0506 extends C1290 {
        public C0506(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
            super(activity, drawerLayout, toolbar, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x01b0  */
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0165
        /* renamed from: びぐびあび */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo474(android.view.View r6) {
            /*
                Method dump skipped, instructions count: 455
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.C0506.mo474(android.view.View):void");
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$〺つふすそ, reason: contains not printable characters */
    public class C0507 implements InterfaceC1838 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ String[] f3820;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ String[][] f3821;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ int f3822;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ MenuItem f3824;

        public C0507(int i, String[] strArr, String[][] strArr2, MenuItem menuItem) {
            this.f3822 = i;
            this.f3820 = strArr;
            this.f3821 = strArr2;
            this.f3824 = menuItem;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1630() {
            if (this.f3822 != 2131296862 || App.f3762.getBoolean(Crypt.a(Crypt.xrc("@ef@1:\u001c6gK0jAcmAbg\u001c0>Ifo\u001adhO1l\u0019anOj=\u0019fo\u001eeiN1mL7;\u001b1=\u001a4o\u001c3g@foH`9H")), false)) {
                return;
            }
            MainActivity.m1610(MainActivity.this, false);
            while (!MainActivity.this.f3784) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0664 A[LOOP:0: B:28:0x065d->B:30:0x0664, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0671  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x06dc  */
        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1631() {
            /*
                Method dump skipped, instructions count: 1895
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.C0507.mo1631():void");
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$ぁごぐすすぃ, reason: contains not printable characters */
    public class ServiceConnectionC0508 implements ServiceConnection {
        public ServiceConnectionC0508() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MainActivity.this.f3816 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MainActivity.this.f3816 = null;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$いいにぽつ, reason: contains not printable characters */
    public class ViewOnClickListenerC0509 implements View.OnClickListener {
        public ViewOnClickListenerC0509() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity;
            C1867 c1867;
            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true) || (c1867 = (mainActivity = MainActivity.this).f3805) == null || mainActivity.f3789 != 0) {
                return;
            }
            if (mainActivity.f3776 == 0) {
                c1867.f8274.m745(0);
                C1867.InterfaceC1877 interfaceC1877 = c1867.f8310;
                if (interfaceC1877 != null) {
                    interfaceC1877.mo1611(2131231142);
                    return;
                }
                return;
            }
            if (c1867.m525() == null) {
                return;
            }
            SwipeRefreshLayout swipeRefreshLayout = c1867.f8291;
            if (swipeRefreshLayout.f1689) {
                return;
            }
            swipeRefreshLayout.setEnabled(false);
            c1867.m3998();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$くし〴〺ぅ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0510 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0510() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4i\u001d0k\u001bjgO6iIf=K4>\u001dbnI4oH49O6fOg<O")));
            intent.addCategory(Crypt.a(Crypt.xrc("IgjO3=JgkOgfJ1j@fhKkkNfn@j9Hef\u001ag9Lgg\u001ak=J1o\u001e7k\u0019giAg;Hc>\u001dcjAj9A6:L")));
            intent.setFlags(268435456);
            MainActivity.this.startActivity(intent);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0511 implements InterfaceC1838 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ String[] f3828;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ String[][] f3829;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ int f3830;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ MenuItem f3832;

        public C0511(int i, String[] strArr, String[][] strArr2, MenuItem menuItem) {
            this.f3830 = i;
            this.f3828 = strArr;
            this.f3829 = strArr2;
            this.f3832 = menuItem;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            int i = this.f3830;
            String a = Crypt.a(Crypt.xrc("\u001bdfAjmH7o\u001ac;Mef\u0019a;L0nOdn\u001d7=JejHa"));
            String a2 = Crypt.a(Crypt.xrc("K`lKc:\u001ek:O1>ObkA09\u001cff\u001acoOgmJb:Ka<\u001bklO3:Af=O0k\u001e`mOa:Hji\u001a3gJfm\u001abjN1kOei\u0019blJ09Ogn@jf@jjIdhLf:MaiJf;"));
            String a3 = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
            String a4 = Crypt.a(Crypt.xrc("\u0019fj\u001ek>\u001a`oNfl@7iOjoLd;Lg;A1=Nfi@3"));
            String a5 = Crypt.a(Crypt.xrc("LbfHg9Iaj\u0019aj\u001bgnL1;I`fKalAag\u001b`:\u001c`"));
            String a6 = Crypt.a(Crypt.xrc("Ien\u001bc=AckN1l\u001d0=M6;@d9AbgLgk\u001cfjJd"));
            if (i != 2131296862) {
                if (((C1216) App.f3760).m2718().trim().equals(a3)) {
                    str = a3;
                    str2 = "  priority 17900\niptables -t nat -D vpnhotspot_masquerade -s ";
                    str3 = a2;
                    str4 = " -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd\niptables -X vpnhotspot_fwd";
                    str5 = " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -i ";
                } else {
                    String[] strArr = this.f3828;
                    str = a3;
                    StringBuilder m4207 = C2098.m4207(a2);
                    str3 = a2;
                    C2098.m4189((C1216) App.f3760, m4207, a6);
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\niptables -t nat -D PREROUTING -i ");
                    C2098.m4189((C1216) App.f3760, m4207, a5);
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\nip rule del to 8.8.8.8 iif ");
                    C2098.m4189((C1216) App.f3760, m4207, "  priority 17700\niptables -t nat -D PREROUTING -i ");
                    C2098.m4189((C1216) App.f3760, m4207, a6);
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\niptables -t nat -D PREROUTING -i ");
                    C2098.m4189((C1216) App.f3760, m4207, a5);
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\nip rule del to 8.8.4.4 iif ");
                    C2098.m4189((C1216) App.f3760, m4207, "  priority 17701\nip rule del  iif ");
                    C2098.m4189((C1216) App.f3760, m4207, " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade -s ");
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(a4);
                    m4207.append(MainActivity.this.f3804);
                    m4207.append(" -j MASQUERADE\nip rule del  iif ");
                    C2098.m4189((C1216) App.f3760, m4207, "  priority 17900\niptables -t nat -D vpnhotspot_masquerade -s ");
                    m4207.append(((C1216) App.f3760).m2718());
                    m4207.append(a4);
                    C2098.m4196((C1216) App.f3760, m4207, " -j MASQUERADE\nip rule del  iif ");
                    str2 = "  priority 17900\niptables -t nat -D vpnhotspot_masquerade -s ";
                    C2098.m4189((C1216) App.f3760, m4207, "  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade\niptables -t filter -D vpnhotspot_fwd -i ");
                    C2098.m4189((C1216) App.f3760, m4207, a);
                    C2098.m4189((C1216) App.f3760, m4207, " -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -o ");
                    str5 = " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -i ";
                    C2098.m4189((C1216) App.f3760, m4207, str5);
                    m4207.append(((C1216) App.f3760).m2780());
                    str4 = " -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd\niptables -X vpnhotspot_fwd";
                    m4207.append(str4);
                    strArr[0] = m4207.toString();
                }
                String str9 = str;
                if (((C1216) App.f3760).m2724().trim().equals(str9)) {
                    str6 = str9;
                    str7 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade -s ";
                    str8 = " -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -o ";
                } else {
                    String[] strArr2 = this.f3828;
                    str6 = str9;
                    StringBuilder m42072 = C2098.m4207(str3);
                    C2098.m4204((C1216) App.f3760, m42072, a6);
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\niptables -t nat -D PREROUTING -i ");
                    C2098.m4204((C1216) App.f3760, m42072, a5);
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\nip rule del to 8.8.8.8 iif ");
                    C2098.m4204((C1216) App.f3760, m42072, "  priority 17700\niptables -t nat -D PREROUTING -i ");
                    C2098.m4204((C1216) App.f3760, m42072, a6);
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\niptables -t nat -D PREROUTING -i ");
                    C2098.m4204((C1216) App.f3760, m42072, a5);
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\nip rule del to 8.8.4.4 iif ");
                    C2098.m4204((C1216) App.f3760, m42072, "  priority 17701\nip rule del  iif ");
                    C2098.m4204((C1216) App.f3760, m42072, " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade -s ");
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(a4);
                    m42072.append(MainActivity.this.f3804);
                    m42072.append(" -j MASQUERADE\nip rule del  iif ");
                    str7 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade -s ";
                    C2098.m4204((C1216) App.f3760, m42072, str2);
                    m42072.append(((C1216) App.f3760).m2724());
                    m42072.append(a4);
                    C2098.m4196((C1216) App.f3760, m42072, " -j MASQUERADE\nip rule del  iif ");
                    C2098.m4204((C1216) App.f3760, m42072, "  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade\niptables -t filter -D vpnhotspot_fwd -i ");
                    C2098.m4204((C1216) App.f3760, m42072, a);
                    str8 = " -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -o ";
                    C2098.m4204((C1216) App.f3760, m42072, str8);
                    C2098.m4204((C1216) App.f3760, m42072, str5);
                    m42072.append(((C1216) App.f3760).m2735());
                    m42072.append(str4);
                    strArr2[0] = m42072.toString();
                }
                if (!((C1216) App.f3760).m2714(MainActivity.this) && !((C1216) App.f3760).m2796().equals(str6)) {
                    String[] strArr3 = this.f3828;
                    StringBuilder m42073 = C2098.m4207(str3);
                    C2098.m4190((C1216) App.f3760, m42073, a6);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\niptables -t nat -D PREROUTING -i ");
                    C2098.m4190((C1216) App.f3760, m42073, a5);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\nip rule del to 8.8.8.8 iif ");
                    C2098.m4190((C1216) App.f3760, m42073, "  priority 17700\niptables -t nat -D PREROUTING -i ");
                    C2098.m4190((C1216) App.f3760, m42073, a6);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\niptables -t nat -D PREROUTING -i ");
                    C2098.m4190((C1216) App.f3760, m42073, a5);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\nip rule del to 8.8.4.4 iif ");
                    C2098.m4190((C1216) App.f3760, m42073, "  priority 17701\nip rule del  iif ");
                    C2098.m4190((C1216) App.f3760, m42073, str7);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(a4);
                    m42073.append(MainActivity.this.f3804);
                    m42073.append(" -j MASQUERADE\nip rule del  iif ");
                    C2098.m4190((C1216) App.f3760, m42073, str2);
                    m42073.append(((C1216) App.f3760).m2796());
                    m42073.append(a4);
                    C2098.m4196((C1216) App.f3760, m42073, " -j MASQUERADE\nip rule del  iif ");
                    C2098.m4190((C1216) App.f3760, m42073, "  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade\niptables -t filter -D vpnhotspot_fwd -i ");
                    C2098.m4190((C1216) App.f3760, m42073, a);
                    C2098.m4190((C1216) App.f3760, m42073, str8);
                    C2098.m4190((C1216) App.f3760, m42073, str5);
                    m42073.append(((C1216) App.f3760).m2727());
                    m42073.append(str4);
                    strArr3[0] = m42073.toString();
                }
            } else if (!((C1216) App.f3760).m2761().trim().equals(a3)) {
                String[] strArr4 = this.f3828;
                StringBuilder m42074 = C2098.m4207(a2);
                C2098.m4183((C1216) App.f3760, m42074, a6);
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\niptables -t nat -D PREROUTING -i ");
                C2098.m4183((C1216) App.f3760, m42074, a5);
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(" --dport 53 -j DNAT --to-destination 8.8.8.8\nip rule del to 8.8.8.8 iif ");
                C2098.m4183((C1216) App.f3760, m42074, "  priority 17700\niptables -t nat -D PREROUTING -i ");
                C2098.m4183((C1216) App.f3760, m42074, a6);
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\niptables -t nat -D PREROUTING -i ");
                C2098.m4183((C1216) App.f3760, m42074, a5);
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(" --dport 53 -j DNAT --to-destination 8.8.4.4\nip rule del to 8.8.4.4 iif ");
                C2098.m4183((C1216) App.f3760, m42074, "  priority 17701\nip rule del  iif ");
                C2098.m4183((C1216) App.f3760, m42074, " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade -s ");
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(a4);
                m42074.append(MainActivity.this.f3804);
                m42074.append(" -j MASQUERADE\nip rule del  iif ");
                C2098.m4183((C1216) App.f3760, m42074, "  priority 17900\niptables -t nat -D vpnhotspot_masquerade -s ");
                m42074.append(((C1216) App.f3760).m2761());
                m42074.append(a4);
                C2098.m4196((C1216) App.f3760, m42074, " -j MASQUERADE\nip rule del  iif ");
                C2098.m4183((C1216) App.f3760, m42074, "  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade\niptables -t filter -D vpnhotspot_fwd -i ");
                C2098.m4183((C1216) App.f3760, m42074, a);
                C2098.m4183((C1216) App.f3760, m42074, " -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -o ");
                C2098.m4183((C1216) App.f3760, m42074, " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd -i ");
                m42074.append(((C1216) App.f3760).m2776());
                m42074.append(" -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd\niptables -X vpnhotspot_fwd");
                strArr4[0] = m42074.toString();
            }
            ((C1216) App.f3760).m2707(this.f3828[0]);
            this.f3829[0] = this.f3828[0].split("\\n");
            for (int i2 = 0; i2 < this.f3829[0].length; i2++) {
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            SharedPreferences.Editor edit;
            String a;
            if (this.f3830 == 2131296862) {
                MainActivity mainActivity = MainActivity.this;
                if (mainActivity.f3808) {
                    MainActivity.m1609(mainActivity, false);
                }
            }
            if (!this.f3828[0].isEmpty()) {
                this.f3832.setChecked(false);
                if (this.f3830 == 2131296862) {
                    edit = App.f3762.edit();
                    a = Crypt.a(Crypt.xrc("\u0019a=\u0019`m\u00196g\u001ck<\u0019e;\u001bkkAc=\u001ef>I3j\u001d4mKa"));
                } else {
                    edit = App.f3762.edit();
                    a = Crypt.a(Crypt.xrc("Le=\u001969I7=J7nNbkH4=J19HfkM`;I3mHd"));
                }
                edit.putBoolean(a, false).apply();
                String str = MainActivity.f3765;
                String str2 = MainActivity.f3765;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glN1k\u001d39A0>O`>\u0019`jJcnAd;LemI09@bl\u001e`j@4n\u001d4f\u001bk=KbjK0fL6l\u001aa:M1:M4nO3:")));
                C1687.m3697(str2, m4207.toString());
            }
            this.f3828[0] = "";
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$づざかべべ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0512 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0512() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MainActivity.this.finish();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$てぜきぽく, reason: contains not printable characters */
    public static class C0513 extends Fragment {
        @Override // androidx.fragment.app.Fragment
        /* renamed from: けときぜと */
        public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(2131492912, viewGroup, false);
            ((TextView) inflate.findViewById(2131296796)).setText(m504().getString(2131821241, Integer.valueOf(this.f1176.getInt(Crypt.a(Crypt.xrc("K6m\u0019ahIk9A1=\u00197n\u001ce9I0fLai\u001can\u001ea:I3"))))));
            return inflate;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$なぎぱいぢぎ, reason: contains not printable characters */
    public class ViewOnClickListenerC0514 implements View.OnClickListener {
        public ViewOnClickListenerC0514() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity;
            String a;
            int id = view.getId();
            String a2 = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
            String a3 = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
            switch (id) {
                case 2131296535:
                    if (!C0753.m2042()) {
                        if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                            MainActivity.this.f3798.m1188(true);
                            mainActivity = MainActivity.this;
                            a = Crypt.a(Crypt.xrc("\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"));
                            break;
                        } else {
                            ((C1216) App.f3760).m2766(MainActivity.this.getWindow().getDecorView().getRootView(), a2, -65536);
                            return;
                        }
                    } else {
                        ((C1216) App.f3760).m2766(MainActivity.this.getWindow().getDecorView().getRootView(), a3, -65536);
                        return;
                    }
                case 2131296536:
                    MainActivity.this.f3798.m1188(true);
                    MainActivity.this.f3772.putExtra(Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij")), Crypt.a(Crypt.xrc("KjmA6hM7>JjkA`nH3=\u001bj<Lan\u001b6mKfh\u00190")));
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.startActivity(mainActivity2.f3772);
                    return;
                case 2131296537:
                default:
                    return;
                case 2131296538:
                    if (!C0753.m2042()) {
                        if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                            MainActivity.this.f3798.m1188(true);
                            mainActivity = MainActivity.this;
                            a = Crypt.a(Crypt.xrc("H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`"));
                            break;
                        } else {
                            ((C1216) App.f3760).m2766(MainActivity.this.getWindow().getDecorView().getRootView(), a2, -65536);
                            return;
                        }
                    } else {
                        ((C1216) App.f3760).m2766(MainActivity.this.getWindow().getDecorView().getRootView(), a3, -65536);
                        return;
                    }
            }
            MainActivity.m1607(mainActivity, a);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$のぷのちつ, reason: contains not printable characters */
    public class C0515 extends AbstractC1792 {
        public C0515(AbstractC1780 abstractC1780) {
            super(abstractC1780);
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: くし〴〺ぅ */
        public int mo1135() {
            return 2;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public CharSequence mo1632(int i) {
            if (i == 0) {
                return App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true) ? Crypt.a(Crypt.xrc("\u001ed=J`mKfoLk<\u001ee;\u001cfm\u001dflA6fIko\u001c1l\u001c`")) : Crypt.a(Crypt.xrc("HkkNbm@ekKegI6>J1mJf:M`=Hfo\u001e4nJ`"));
            }
            if (i == 1) {
                return Crypt.a(Crypt.xrc("\u001bb:A3<\u001bg9@j=J7i\u0019dm\u0019bhK0>\u001eak\u001dbhOe"));
            }
            if (i != 2) {
                return null;
            }
            return Crypt.a(Crypt.xrc("@ji\u001ec;\u0019dnH1iHb;I69H7:\u001bd<KfkOgo\u001ck"));
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int mo1633(Object obj) {
            return -2;
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$びぐびあび, reason: contains not printable characters */
    public class C0516 implements FloatingActionMenu.InterfaceC0361 {
        public C0516() {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m1634(boolean z) {
            if (z) {
                if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true)) {
                    MainActivity.this.f3815.setVisibility(0);
                    MainActivity.this.f3782.setVisibility(8);
                    return;
                }
                MainActivity mainActivity = MainActivity.this;
                String m2739 = ((C1216) App.f3760).m2739();
                String str = MainActivity.f3765;
                if (Boolean.valueOf(mainActivity.m1619(m2739)[2]).booleanValue()) {
                    return;
                }
                MainActivity.this.f3782.setVisibility(0);
                try {
                    if (Boolean.valueOf(MainActivity.this.m1619(((C1216) App.f3760).m2739())[19]).booleanValue()) {
                        MainActivity.this.f3782.setVisibility(8);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$ぺぁあねじ, reason: contains not printable characters */
    public class C0517 implements ViewPager.InterfaceC0308 {
        public C0517() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: 〺つふすそ */
        public void mo1059(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: くし〴〺ぅ */
        public void mo1060(int i) {
            MainActivity.this.f3789 = i;
            App.f3762.edit().putInt(Crypt.a(Crypt.xrc("JkgJ1>\u001beh\u001ddnLe;IcmMdmLbhL`h\u001b`9K`")), MainActivity.this.f3789).commit();
            String a = Crypt.a(Crypt.xrc("\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4"));
            String a2 = Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"));
            if (i == 0) {
                if (App.f3762.getBoolean(a2, true) || !App.f3762.getBoolean(a, false)) {
                    MainActivity.this.f3769.m1185(false);
                    MainActivity.this.f3798.m1187(true);
                    return;
                } else {
                    MainActivity.this.f3769.m1184(true);
                    MainActivity.this.f3805.m3987();
                    return;
                }
            }
            if (!App.f3762.getBoolean(a2, true) && App.f3762.getBoolean(a, false)) {
                MainActivity.this.f3769.m1185(true);
                return;
            }
            FloatingActionMenu floatingActionMenu = MainActivity.this.f3798;
            if ((floatingActionMenu.getVisibility() == 4) || floatingActionMenu.f2456) {
                return;
            }
            floatingActionMenu.f2456 = true;
            if (floatingActionMenu.f2469) {
                floatingActionMenu.m1188(true);
                floatingActionMenu.f2457.postDelayed(new RunnableC2106(floatingActionMenu, true), floatingActionMenu.f2436 * floatingActionMenu.f2420);
            } else {
                floatingActionMenu.startAnimation(floatingActionMenu.f2467);
                floatingActionMenu.setVisibility(4);
                floatingActionMenu.f2456 = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
        /* renamed from: げつ〴ぬぐ */
        public void mo1061(int i, float f, int i2) {
        }
    }

    /* renamed from: team.dev.epro.apkcustom.MainActivity$ぺふねづ〺, reason: contains not printable characters */
    public class C0518 extends BroadcastReceiver {
        public C0518() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x031c, code lost:
        
            if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2702(r13.f3838) != false) goto L90;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x04ff  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0561  */
        /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x04f5  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0330  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0312  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0427  */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r0v73 */
        /* JADX WARN: Type inference failed for: r0v74 */
        /* JADX WARN: Type inference failed for: r0v75 */
        /* JADX WARN: Type inference failed for: r0v76 */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r14, android.content.Intent r15) {
            /*
                Method dump skipped, instructions count: 1382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.C0518.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static String m1606(MainActivity mainActivity, int i) {
        mainActivity.getClass();
        return i != 1 ? i != 2 ? i != 3 ? Crypt.a(Crypt.xrc("\u001ak9\u0019c9HdnJ7lHjkAah@agLgmJ0f\u00194o\u001a0gN0k\u001c1g\u001e3f\u001c0<@`gKfl\u001cb<A0=\u001e6oIgf\u001d")) : Crypt.a(Crypt.xrc("\u001e`9J7n\u001b3k\u001edo\u001ee<\u0019k9\u001ca=Oc:J4l\u001eekMkjK1lI7;\u001b4nI3g@3=OaoN7:Og;K49\u001c`g\u001e")) : Crypt.a(Crypt.xrc("\u001aahLdjNkkIji\u001afn\u001bj=LjhKa=O7jI4=Ka")) : Crypt.a(Crypt.xrc("@f;Mk>\u001b4f\u001ejl\u001e3>LdfO7gKe>\u00196;AboI0"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r11.equals(r9) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        r10.startActivityForResult(r4, 21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.startActivityForResult(r4, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r11.equals(r9) != false) goto L23;
     */
    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1607(team.dev.epro.apkcustom.MainActivity r10, java.lang.String r11) {
        /*
            r10.getClass()
            java.lang.String r0 = "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="
            java.lang.String r0 = xyz.easypro.ecrypt.utils.Crypt.xrc(r0)
            java.lang.String r0 = xyz.easypro.ecrypt.utils.Crypt.a(r0)
            int r1 = p034.p035.p043.C1067.m2407(r10, r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r10.f3818 = r1
            java.lang.String r1 = "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j"
            java.lang.String r1 = xyz.easypro.ecrypt.utils.Crypt.xrc(r1)
            java.lang.String r1 = xyz.easypro.ecrypt.utils.Crypt.a(r1)
            int r4 = p034.p035.p043.C1067.m2407(r10, r1)
            if (r4 == 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r10.f3781 = r4
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<team.dev.epro.apkcustom.widgets.FileChooser> r5 = team.dev.epro.apkcustom.widgets.FileChooser.class
            r4.<init>(r10, r5)
            java.lang.String r5 = "\u001bknOgj\u001djgM1=Ng>\u0019f9OfgOjiM0<JjkJ`"
            java.lang.String r5 = xyz.easypro.ecrypt.utils.Crypt.xrc(r5)
            java.lang.String r5 = xyz.easypro.ecrypt.utils.Crypt.a(r5)
            r4.putExtra(r5, r11)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            r7 = 20
            r8 = 21
            java.lang.String r9 = "\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"
            java.lang.String r9 = xyz.easypro.ecrypt.utils.Crypt.xrc(r9)
            java.lang.String r9 = xyz.easypro.ecrypt.utils.Crypt.a(r9)
            if (r5 < r6) goto L74
            boolean r5 = r10.f3818
            if (r5 != 0) goto L67
            boolean r5 = r10.f3781
            if (r5 == 0) goto L60
            goto L67
        L60:
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L7e
            goto L7a
        L67:
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r3] = r1
            r11[r2] = r0
            r0 = 1920(0x780, float:2.69E-42)
            r10.requestPermissions(r11, r0)
            goto L81
        L74:
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L7e
        L7a:
            r10.startActivityForResult(r4, r7)
            goto L81
        L7e:
            r10.startActivityForResult(r4, r8)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.m1607(team.dev.epro.apkcustom.MainActivity, java.lang.String):void");
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static void m1608(MainActivity mainActivity, boolean z) {
        mainActivity.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            String a = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckm\u0019eoId;I6:@3:\u001eakOj=Lf;\u001e1k\u001ajfMjhN7gNbmHb>JchKjm@1jM1g\u001cchKf>AjoN1l"));
            if (C1067.m2407(mainActivity, a) != 0) {
                mainActivity.requestPermissions(new String[]{a}, 2020);
                return;
            }
        }
        mainActivity.f3766.createGroup(mainActivity.f3810, new C1864(mainActivity, z));
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static void m1609(MainActivity mainActivity, boolean z) {
        mainActivity.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            String a = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckm\u0019eoId;I6:@3:\u001eakOj=Lf;\u001e1k\u001ajfMjhN7gNbmHb>JchKjm@1jM1g\u001cchKf>AjoN1l"));
            if (C1067.m2407(mainActivity, a) != 0) {
                mainActivity.requestPermissions(new String[]{a}, 2020);
                return;
            }
        }
        mainActivity.f3766.removeGroup(mainActivity.f3810, new C1930(mainActivity, z));
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static void m1610(MainActivity mainActivity, boolean z) {
        mainActivity.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            String a = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckm\u0019eoId;I6:@3:\u001eakOj=Lf;\u001e1k\u001ajfMjhN7gNbmHb>JchKjm@1jM1g\u001cchKf>AjoN1l"));
            if (C1067.m2407(mainActivity, a) != 0) {
                mainActivity.requestPermissions(new String[]{a}, 2020);
                return;
            }
        }
        try {
            Method method = mainActivity.f3766.getClass().getMethod(Crypt.a(Crypt.xrc("\u001cjfI6mA19\u001aji\u001b6gL6l\u001acoM7fIgh\u001c1j\u001ad")), WifiP2pManager.Channel.class, String.class, WifiP2pManager.ActionListener.class);
            method.setAccessible(true);
            method.invoke(mainActivity.f3766, mainActivity.f3810, Crypt.a(Crypt.xrc("\u0019k<\u001dcj\u001bfjO1o\u001eb9\u001d7=K0>Nb<Lc>KakJ0")), new C1829(mainActivity, z));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (Build.VERSION.SDK_INT >= 21) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x04d1, code lost:
    
        if (m1619(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2739())[12].isEmpty() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x059c, code lost:
    
        if (m1619(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2739())[12].isEmpty() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018e, code lost:
    
        if (m1619(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2739())[12].isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fb, code lost:
    
        if (m1619(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2739())[12].isEmpty() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03f1 A[Catch: Exception -> 0x0603, TryCatch #9 {Exception -> 0x0603, blocks: (B:37:0x03d8, B:39:0x03f1, B:41:0x03f9, B:42:0x03ff, B:43:0x0417, B:45:0x042f, B:146:0x04bd, B:148:0x04d3, B:149:0x05f5, B:165:0x0573, B:167:0x0588, B:172:0x05c8, B:174:0x05dd, B:139:0x046b, B:141:0x047f, B:143:0x0494, B:144:0x04a9, B:150:0x04da, B:152:0x04ee, B:154:0x0502, B:156:0x0516, B:158:0x052a, B:161:0x053f, B:162:0x054b, B:164:0x0560), top: B:23:0x00f4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x042f A[Catch: Exception -> 0x0603, TRY_LEAVE, TryCatch #9 {Exception -> 0x0603, blocks: (B:37:0x03d8, B:39:0x03f1, B:41:0x03f9, B:42:0x03ff, B:43:0x0417, B:45:0x042f, B:146:0x04bd, B:148:0x04d3, B:149:0x05f5, B:165:0x0573, B:167:0x0588, B:172:0x05c8, B:174:0x05dd, B:139:0x046b, B:141:0x047f, B:143:0x0494, B:144:0x04a9, B:150:0x04da, B:152:0x04ee, B:154:0x0502, B:156:0x0516, B:158:0x052a, B:161:0x053f, B:162:0x054b, B:164:0x0560), top: B:23:0x00f4, inners: #0 }] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f3793.m454(8388611)) {
            this.f3793.m435(8388611);
            return;
        }
        FloatingActionMenu floatingActionMenu = this.f3798;
        if (floatingActionMenu.f2469) {
            floatingActionMenu.m1188(true);
            return;
        }
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true) || !App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4")), false) || this.f3805 == null) {
            m1625();
            return;
        }
        this.f3798.setVisibility(0);
        this.f3769.setVisibility(8);
        this.f3805.m3982();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x060e A[Catch: Exception -> 0x083e, TryCatch #0 {Exception -> 0x083e, blocks: (B:30:0x05f5, B:32:0x060e, B:33:0x062d, B:35:0x0645, B:142:0x06de, B:144:0x06f4, B:145:0x06f6, B:146:0x0832, B:162:0x07a4, B:164:0x07b9, B:166:0x07d1, B:170:0x0803, B:172:0x0818, B:174:0x082e, B:135:0x0688, B:137:0x069e, B:139:0x06b3, B:140:0x06c8, B:147:0x06fd, B:149:0x0713, B:151:0x0729, B:153:0x073f, B:155:0x0757, B:158:0x0770, B:159:0x077c, B:161:0x0791), top: B:16:0x02c6, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0645 A[Catch: Exception -> 0x083e, TRY_LEAVE, TryCatch #0 {Exception -> 0x083e, blocks: (B:30:0x05f5, B:32:0x060e, B:33:0x062d, B:35:0x0645, B:142:0x06de, B:144:0x06f4, B:145:0x06f6, B:146:0x0832, B:162:0x07a4, B:164:0x07b9, B:166:0x07d1, B:170:0x0803, B:172:0x0818, B:174:0x082e, B:135:0x0688, B:137:0x069e, B:139:0x06b3, B:140:0x06c8, B:147:0x06fd, B:149:0x0713, B:151:0x0729, B:153:0x073f, B:155:0x0757, B:158:0x0770, B:159:0x077c, B:161:0x0791), top: B:16:0x02c6, inners: #2 }] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @android.annotation.SuppressLint({"ResourceType"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 2566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558404, menu);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            unbindService(this.f3771);
        } catch (Exception unused) {
        }
        try {
            unregisterReceiver(this.f3811);
        } catch (Exception unused2) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        InterfaceC1837 interfaceC1837;
        View rootView;
        int i;
        String string;
        C1216 c1216;
        InterfaceC1837 interfaceC18372;
        Class<?> cls;
        SharedPreferences.Editor putBoolean;
        int itemId = menuItem.getItemId();
        if (itemId == 2131296322) {
            m1625();
            return true;
        }
        if (itemId != 2131296862 && itemId != 2131296863) {
            String a = Crypt.a(Crypt.xrc("Idk@chI`9Kkk\u00196k\u001eejA`9\u0019ck\u001e0i\u001ccfH1"));
            String a2 = Crypt.a(Crypt.xrc("O3oLf<\u0019d>\u001edjO1m\u001a3gJbfK7=Kb<\u001b3>\u001b4"));
            if (itemId == 2131296367) {
                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                    putBoolean = App.f3762.edit().putBoolean(a2, false);
                } else if (Build.VERSION.SDK_INT < 21 || ((C1216) App.f3760).m2723()) {
                    menuItem.setChecked(true);
                    C2098.m4184(App.f3762, a2, true);
                    putBoolean = App.f3762.edit().putBoolean(a, false);
                } else {
                    InterfaceC1837 interfaceC18373 = App.f3760;
                    rootView = getWindow().getDecorView().getRootView();
                    c1216 = (C1216) interfaceC18373;
                    string = Crypt.a(Crypt.xrc("@d:Ng<\u001be>AknHgf\u001aklNc;N0g\u001ag<@`:\u001dkk\u001e0g\u001b3;\u001b0m\u001bbmKefI`kLj>\u001b3lNjh\u001bbl\u001eg:KcjJc9\u0019e<\u001ackL`hKjm@do\u001dbjH6<N`;Ae;\u001e69\u001cegJ0f\u001cdgJc>MejHakO6i@f<Hd"));
                    c1216.m2766(rootView, string, -65536);
                }
            } else if (itemId != 2131296368) {
                if (itemId == 2131296402) {
                    interfaceC18372 = App.f3760;
                    cls = GeneratedConfig.class;
                } else if (itemId == 2131296946) {
                    if (!App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true) && this.f3805 != null) {
                        this.f3798.setVisibility(8);
                        this.f3769.setVisibility(0);
                        this.f3805.m3987();
                    }
                } else if (itemId == 2131296317) {
                    boolean z = SSHTunnelService.f4041;
                    String a3 = Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe"));
                    String a4 = Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1"));
                    String a5 = Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd"));
                    String a6 = Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1"));
                    String a7 = Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be"));
                    if (z || SSHTunnelService.f4034 || SSHTunnelService.f4038) {
                        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false);
                        C2098.m4195(App.f3762, a7, 0);
                        C2098.m4195(App.f3762, a6, 0);
                        C2098.m4195(App.f3762, a5, 0);
                        C2098.m4195(App.f3762, a4, 0);
                        App.f3762.edit().putInt(a3, 0).apply();
                        Intent intent = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                        intent.setAction(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")));
                        App.f3759.startService(intent);
                    }
                    if (C0753.m2042()) {
                        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk")), false);
                        C2098.m4195(App.f3762, a7, 0);
                        C2098.m4195(App.f3762, a6, 0);
                        C2098.m4195(App.f3762, a5, 0);
                        C2098.m4195(App.f3762, a4, 0);
                        App.f3762.edit().putInt(a3, 0).apply();
                        C0765.m2061(this);
                        try {
                            this.f3816.mo1589(false);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f3806 = true;
                } else if (itemId == 2131296562) {
                    startActivityForResult(new Intent(this, (Class<?>) GroupSort.class), 18);
                } else {
                    String a8 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
                    String a9 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
                    if (itemId == 2131296331) {
                        if (f3764 == null) {
                            f3764 = new C1958();
                        }
                        boolean isAlive = f3764.isAlive();
                        String a10 = Crypt.a(Crypt.xrc("Oa>NciMbn\u001c6i\u001e7;I3:A7:H7i@0<\u001dkkA0"));
                        if (isAlive) {
                            C1958 c1958 = f3764;
                            if (c1958.f8544) {
                                if (c1958.isAlive() || f3764.f8544) {
                                    C2098.m4182(App.f3762, a10, false);
                                    C2098.m4197(new SimpleDateFormat(a8, Locale.getDefault()), C2098.m4207(a9), Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g>\u001ac;\u001dgm\u001a0>\u001e7f\u001e`;\u001a7nO4kIfo\u001dk>\u001cemJ`m\u001c7h\u001dclL3:@1o\u001ec>LehOj;@0<\u00190h\u001ed=")), f3765);
                                    C1958 c19582 = f3764;
                                    c19582.f8544 = false;
                                    try {
                                        c19582.f8545.close();
                                    } catch (Exception unused2) {
                                    }
                                    while (C1958.f8542.size() > 0) {
                                        C1958.f8542.get(0).m4081();
                                    }
                                    C1931 c1931 = c19582.f8547;
                                    if (c1931 != null) {
                                        try {
                                            Socket socket = c1931.f8416;
                                            if (socket != null) {
                                                socket.close();
                                            }
                                        } catch (IOException unused3) {
                                        }
                                        try {
                                            ServerSocket serverSocket = c1931.f8415;
                                            if (serverSocket != null) {
                                                serverSocket.close();
                                            }
                                        } catch (IOException unused4) {
                                        }
                                        RunnableC1933 runnableC1933 = c1931.f8417;
                                        if (runnableC1933 != null) {
                                            try {
                                                Socket socket2 = runnableC1933.f8425;
                                                if (socket2 != null) {
                                                    socket2.close();
                                                }
                                            } catch (IOException unused5) {
                                            }
                                            C1932 c1932 = runnableC1933.f8426;
                                            if (c1932 != null) {
                                                try {
                                                    InputStream inputStream = c1932.f8419;
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                } catch (IOException unused6) {
                                                }
                                                try {
                                                    OutputStream outputStream = c1932.f8421;
                                                    if (outputStream != null) {
                                                        outputStream.close();
                                                    }
                                                } catch (IOException unused7) {
                                                }
                                                c1932.f8422 = false;
                                                runnableC1933.f8426.interrupt();
                                            }
                                        }
                                        Thread thread = c1931.f8418;
                                        if (thread != null) {
                                            thread.interrupt();
                                        }
                                        c19582.f8547 = null;
                                    }
                                    f3764 = null;
                                }
                            }
                        }
                        C2098.m4182(App.f3762, a10, true);
                        C2098.m4197(new SimpleDateFormat(a8, Locale.getDefault()), C2098.m4207(a9), Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g>\u001ac;\u001dgm\u001a0>\u001e7f\u001e`;\u001a7nO4kIfo\u001dk>\u001cemJjhMd9Ajh\u001egiN`k\u001cb9H6h\u001cck\u001bdnA09\u001d4m")), f3765);
                        f3764.setDaemon(true);
                        f3764.start();
                    } else if (itemId == 2131296332) {
                        if (((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class) || C0753.m2042()) {
                            ((C1216) App.f3760).m2766(getWindow().getDecorView().getRootView(), getString(2131820818), -65536);
                            String str = f3765;
                            StringBuilder m4207 = C2098.m4207(a9);
                            m4207.append(new SimpleDateFormat(a8, Locale.getDefault()).format(new Date()));
                            m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                            m4207.append(getString(2131820818));
                            C1687.m3697(str, m4207.toString());
                        } else {
                            Intent prepare = VpnService.prepare(this);
                            if (prepare != null) {
                                startActivityForResult(prepare, 2323);
                            } else {
                                onActivityResult(2323, -1, null);
                            }
                            if (menuItem.isChecked()) {
                                menuItem.setChecked(false);
                            } else {
                                menuItem.setChecked(true);
                            }
                        }
                    } else if (itemId == 2131296334) {
                        interfaceC18372 = App.f3760;
                        cls = TimeOut.class;
                    } else if (itemId == 2131296323) {
                        interfaceC18372 = App.f3760;
                        cls = SmartGuide.class;
                    }
                }
                ((C1216) interfaceC18372).m2716(cls);
            } else if (menuItem.isChecked()) {
                menuItem.setChecked(false);
                putBoolean = App.f3762.edit().putBoolean(a, false);
            } else {
                menuItem.setChecked(true);
                C2098.m4184(App.f3762, a, true);
                putBoolean = App.f3762.edit().putBoolean(a2, false);
            }
            putBoolean.commit();
        } else {
            if (itemId == 2131296862 && !m1620()) {
                ((C1216) App.f3760).m2766(getWindow().getDecorView().getRootView(), Crypt.a(Crypt.xrc("\u001bkf\u001dfjH1mL4nAcl\u001dbg\u001e3>\u001ck9\u001cb<\u001ef<\u001c1o@7g\u001ab:\u001a6fNak@eoKjnI`jHb;\u001ecl\u0019ghJ")), -65536);
                return super.onOptionsItemSelected(menuItem);
            }
            String[] strArr = {""};
            String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, 1, 1);
            if (menuItem.isChecked()) {
                new AsyncTaskC1840(new C0511(itemId, strArr, strArr2, menuItem)).execute(new Void[0]);
            } else {
                if (!((C1216) App.f3760).m2706()) {
                    interfaceC1837 = App.f3760;
                    rootView = getWindow().getDecorView().getRootView();
                    i = 2131820816;
                } else if (((C1216) App.f3760).m2723()) {
                    new AsyncTaskC1840(new C0507(itemId, strArr, strArr2, menuItem)).execute(new Void[0]);
                } else {
                    interfaceC1837 = App.f3760;
                    rootView = getWindow().getDecorView().getRootView();
                    i = 2131820817;
                }
                string = getString(i);
                c1216 = (C1216) interfaceC1837;
                c1216.m2766(rootView, string, -65536);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        if (this.f3806) {
            this.f3806 = false;
            m1617(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.f3798.m1188(true);
        LogView logView = this.f3796;
        if (logView != null) {
            C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("MamA7kOcgJ1<AfkA1=A6:\u001ca9\u001a0mIem\u001db")), new JSONArray((Collection) logView.getArrayList()).toString());
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareOptionsMenu(android.view.Menu r8) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, p034.p035.p041.C1043.InterfaceC1044
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intent intent;
        super.onRequestPermissionsResult(i, strArr, iArr);
        C1858 c1858 = this.f3797;
        c1858.getClass();
        if (i == 1 && iArr.length > 0) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(iArr[i2]));
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < c1858.f8249.size(); i3++) {
                if (((Integer) hashMap.get(c1858.f8249.get(i3))).intValue() != 0) {
                    if (C1043.m2380(c1858.f8245, c1858.f8249.get(i3))) {
                        arrayList.add(c1858.f8249.get(i3));
                    } else {
                        boolean equals = c1858.f8249.get(i3).equals(Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9K0j@4gJggHb>\u001daf\u001eki\u001e7;M0j\u001c3o\u001c4mA0:N3lKbkMkh\u001c7gA6iMeo@fnMfj\u001e0hNj:")));
                        String a = Crypt.a(Crypt.xrc("\u001d`:\u001b4l\u001e7g\u001echN6=H3hK7=\u001e4oK3oNgi\u001dgmKe:I3fLdlM3>K1hJaiOdfIc=JefMe:@"));
                        String a2 = Crypt.a(Crypt.xrc("IgjO3=JgkOgfJ1j@fhKkkNfn@j9Hef\u001agnJ4:M0j\u001e4=LjhJ1o\u001d4m\u001edi\u001a3fNdiHg<\u001d"));
                        if (equals) {
                            if (Build.VERSION.SDK_INT >= 23 && !Settings.System.canWrite(c1858.f8248)) {
                                intent = new Intent(Crypt.a(Crypt.xrc("KcfLgn@b>L1kJ`kA4<Ia9\u001b3oNc<A0gLk;\u001cf;\u001b3:K7i\u001d`iKcmAji\u001e1lJb:ObjMklAahAboJgl@cf\u00194l\u001d69Ocn\u001ag;\u00196=\u001bc<H`9")));
                                intent.addCategory(a2);
                                intent.setData(Uri.parse(a));
                                intent.addFlags(268435456);
                                intent.addFlags(1073741824);
                                intent.addFlags(8388608);
                                c1858.f8248.startActivity(intent);
                                return;
                            }
                        } else if (!c1858.f8249.get(i3).equals(Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckhAa=\u001ecoLdgHg>\u001ccjKefL7:A1nMd<Jdh\u001d7g\u001df9KcmL3g\u001aji\u001a`fH0o\u001ccgJclKdn\u001cc:")))) {
                            c1858.f8247.mo1626(c1858.f8246);
                            ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("Jc=LgkA`iI`:Nf=JakLgiLam\u001bf:N3:\u00196i\u001ablHgnMciKcj\u001bkoIak\u001c4lA4;\u00196l@`l\u001c`kJ39Nkg\u001eckA3f\u001d19JaoA4>Mdn\u001a7=Hjn")), -65536);
                            return;
                        } else if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(c1858.f8248)) {
                            intent = new Intent(Crypt.a(Crypt.xrc("KcfLgn@b>L1kJ`kA4<Ia9\u001b3oNc<A0gLkn\u001da=J4oM1kL7n@a;If:\u001dk;\u001a4<A6jLfk@b=M4i\u001canMc;\u001d`<\u001bdg\u001d3oNg<\u001cjkHajA3kNk>Nk=IgmKg;H1jAc9\u001e0j\u001ad9Ig<OanKj")));
                            intent.addCategory(a2);
                            intent.setData(Uri.parse(a));
                            intent.addFlags(268435456);
                            intent.addFlags(1073741824);
                            intent.addFlags(8388608);
                            c1858.f8248.startActivity(intent);
                            return;
                        }
                    }
                }
            }
            if (arrayList.size() <= 0) {
                c1858.f8247.mo1628(c1858.f8246);
                return;
            }
            DialogInterfaceOnClickListenerC1857 dialogInterfaceOnClickListenerC1857 = new DialogInterfaceOnClickListenerC1857(c1858, arrayList);
            String str = "";
            for (int i4 = 0; i4 < c1858.f8249.size(); i4++) {
                str = C2098.m4198(C2098.m4179(str, Crypt.a(Crypt.xrc("@gi\u001bcmNe;\u001ac>\u001dfm\u001cjnOgg@19Oe<\u001e4i\u001b4"))), c1858.f8249.get(i4), Crypt.a(Crypt.xrc("\u00193>\u001b3k\u0019k>Jej\u0019k9\u001ajh\u001dc>\u001bjkMg<J0m\u001ac")));
            }
            DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(c1858.f8245, 2131886321);
            c1344.f6452.f174 = c1858.f8245.getString(2131821109);
            c1344.f6452.f172 = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
            c1344.m3030(c1858.f8245.getString(C2079.ok), dialogInterfaceOnClickListenerC1857);
            c1344.m3029(c1858.f8245.getString(C2079.cancel), dialogInterfaceOnClickListenerC1857);
            DialogInterfaceC1343 m3031 = c1344.m3031();
            m3031.show();
            ((TextView) m3031.findViewById(R.id.message)).setTextSize(11.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ab A[Catch: ParseException | Exception -> 0x0489, TryCatch #2 {ParseException | Exception -> 0x0489, blocks: (B:93:0x0377, B:95:0x03ab, B:97:0x03f8, B:100:0x03ff, B:100:0x03ff, B:103:0x0402, B:103:0x0402, B:106:0x041a, B:106:0x041a, B:107:0x042b, B:107:0x042b, B:109:0x0439, B:109:0x0439, B:110:0x044a, B:110:0x044a, B:112:0x0458, B:112:0x0458, B:113:0x0469, B:113:0x0469, B:115:0x0477, B:115:0x0477), top: B:92:0x0377 }] */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @android.annotation.SuppressLint({"ResourceType"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.onResume():void");
    }

    @Override // p107.p108.p109.p110.p119.C1867.InterfaceC1877
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void mo1611(int i) {
        this.f3776 = i == 2131231142 ? 1 : 0;
        this.f3769.setImageResource(i);
    }

    @Override // p107.p108.p109.p110.p119.C1899.InterfaceC1905, p107.p108.p109.p110.p119.C1867.InterfaceC1877, p107.p108.p109.p110.p119.C1921.InterfaceC1923
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo1612() {
        invalidateOptionsMenu();
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true)) {
            return;
        }
        this.f3782.setVisibility(8);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public int m1613(SubscriptionManager subscriptionManager) {
        int defaultDataSubscriptionId;
        if (Build.VERSION.SDK_INT >= 24 && (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) != -1) {
            return defaultDataSubscriptionId;
        }
        try {
            return ((Integer) Class.forName(subscriptionManager.getClass().getName()).getMethod(Crypt.a(Crypt.xrc("Jb;Lgh@3lH`<Ljo\u001e1lOdlM3nJa9\u001bklOamKg=Mg:Kgg\u00194lKbfM1mJel\u0019dhOj>Mb<M")), new Class[0]).invoke(subscriptionManager, new Object[0])).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
            return -1;
        }
    }

    @Override // p107.p108.p109.p110.p119.C1921.InterfaceC1923
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo1614(LogView logView) {
        this.f3796 = logView;
        m1627();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Crypt.a(Crypt.xrc("Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bfh\u001c0<\u001be=\u001e0;Id<K7lAc;\u001e0gA7;\u001d4hN1gJ3=\u001b7lJcj\u001d3i\u0019bkO6f\u001dfhIenOk9OjfMc9")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>JelM3k\u001b3f\u001d3h\u001dekH1gIa=\u001bbnOa=\u001c3:Lf=Ja9\u001bg;He;HkfO7>HeoN4l\u001d7mN3iHefIg;")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je9LkgH`hIbiL6m\u001af;\u001dcm\u001dakIb>\u001demN3=La<\u001b7<LjiLdo\u001c4nI1jA1g@do\u001egm\u001b4=Nk>")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je:\u001c1o@3n\u0019`9\u001adhIfjHk<M1h\u00193fMalI`jN`i\u001dbhK3;I3:\u001cjgK4mKflKknMb9\u001b4:Ke:")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je>IejMc9Le>\u0019j=\u001ebnOen\u001a1iO79O4:Oj<K6:\u001dggHciMbm\u001d3o\u001b7>\u001ek=\u001ebi\u001dfm\u001ajl\u0019b;")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je9\u001cb9\u001bbo@6;M6mM7:Na=A1o\u001bgkO7hLdhKg;J0k\u001d6fO7jL4>J`=\u001bc>HbhLf=I3oIdg")));
        intentFilter.addAction(Crypt.a(Crypt.xrc("I4>Jbo@flJb;N4jAblOjmJgmJc=K6>JejKf>J`g@fiJkk\u001cak@ko\u001efjHaiA7l\u001d`f\u001d39\u0019c9\u001aflJ3kH1nL7>\u00193:Mj>M6kOfh\u00197=")));
        registerReceiver(this.f3811, intentFilter);
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public final String m1615() {
        if (C1067.m2407(this, Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9Nbo\u0019afLb<\u00197kHbmO69\u001e7;LjnAa=JbmN1lHdoI0jH7<LjhLdoOfkJ6lKekHbg\u001ec<"))) != 0) {
            return Crypt.a(Crypt.xrc("L0:A`hN3hMe<Jb:\u001ckfL3oA7j\u001b4f\u001ej<\u001dd"));
        }
        int i = Build.VERSION.SDK_INT;
        String a = Crypt.a(Crypt.xrc("K3m\u001a7o\u001aj:\u001a3k\u0019k>\u001c1nKkk\u001d`>I7k\u001b4gNc"));
        if (i < 22) {
            return ((TelephonyManager) getBaseContext().getSystemService(a)).getSimOperatorName();
        }
        SubscriptionManager from = SubscriptionManager.from(this);
        return from.getActiveSubscriptionInfoCount() > 1 ? from.getActiveSubscriptionInfo(m1613((SubscriptionManager) getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("A4jLclL`;LagA0k@6<O1<\u001bboHb9Jgg\u001ad9Hf>Le:J0;\u001acjA4>Lkk\u001dk;M6hNa>I6fM"))))).getDisplayName().toString() : ((TelephonyManager) getBaseContext().getSystemService(a)).getSimOperatorName();
    }

    @Override // p107.p108.p109.p110.p113.p117.InterfaceC1859
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo1616(int i, ArrayList<String> arrayList) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x04cb  */
    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1617(boolean r24) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.m1617(boolean):void");
    }

    @Override // p107.p108.p109.p110.p119.C1899.InterfaceC1905, p107.p108.p109.p110.p119.C1867.InterfaceC1877, p107.p108.p109.p110.p119.C1921.InterfaceC1923
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1618() {
        this.f3796.m1716();
        m1627();
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public final String[] m1619(String str) {
        try {
            if (str.trim().isEmpty()) {
                return C1842.f8212;
            }
            File file = new File(str);
            if (file.exists()) {
                String m2789 = ((C1216) App.f3760).m2789(file);
                if (m2789.isEmpty()) {
                    ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("Ic=\u001d49\u001bdf\u001bg=Lb<K0;\u001af=A79\u001bd:\u001d1h\u001ed")), -65536);
                    m1617(false);
                    return C1842.f8212;
                }
                if (m2789.contains(Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok")))) {
                    return m2789.split("\\[splitConfig\\]");
                }
                ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("@`m\u00194lNglLdh@3m\u001bd9\u001b`gOgj\u0019c<HemH1=\u001e4;Kj>\u001d`;\u001aai\u001da;O3gN4o\u001ccf\u001cc>\u001c1mK")), -65536);
                m1617(false);
                return C1842.f8212;
            }
            ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("L4=Me;JafNcg\u001cf:J7=A6;@0mM0o@g:\u001cb=\u001d39Kd:\u001d7m\u001ebjI39L0j\u001cg9HaiOalN6:\u001d")) + str + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")), -65536);
            boolean z = SSHTunnelService.f4041;
            String a = Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe"));
            String a2 = Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1"));
            String a3 = Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd"));
            String a4 = Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1"));
            String a5 = Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be"));
            if (z || SSHTunnelService.f4034 || SSHTunnelService.f4038) {
                App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false).apply();
                App.f3762.edit().putInt(a5, 0).apply();
                App.f3762.edit().putInt(a4, 0).apply();
                App.f3762.edit().putInt(a3, 0).apply();
                App.f3762.edit().putInt(a2, 0).apply();
                App.f3762.edit().putInt(a, 0).apply();
                Intent intent = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                intent.setAction(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")));
                App.f3759.startService(intent);
            }
            if (C0753.m2042()) {
                App.f3762.edit().putBoolean(Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk")), false).apply();
                App.f3762.edit().putInt(a5, 0).apply();
                App.f3762.edit().putInt(a4, 0).apply();
                App.f3762.edit().putInt(a3, 0).apply();
                App.f3762.edit().putInt(a2, 0).apply();
                App.f3762.edit().putInt(a, 0).apply();
                C0765.m2061(this);
                try {
                    this.f3816.mo1589(false);
                } catch (RemoteException unused) {
                }
            }
            m1617(false);
            ((C1216) App.f3760).m2794();
            return C1842.f8212;
        } catch (Exception unused2) {
            return C1842.f8212;
        }
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public final boolean m1620() {
        String str;
        StringBuilder m4207;
        String a;
        boolean hasSystemFeature = getPackageManager().hasSystemFeature(Crypt.a(Crypt.xrc("Jc:\u001e6l\u001b0kAk=\u001c7o\u001d7=OelLejJkl\u001c`i\u001eb>\u001d7lH1;L4;N`>\u001bc=Na<Kg<A0k\u001b1iJjoH")));
        String a2 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a3 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (hasSystemFeature) {
            WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7")));
            if (wifiManager == null) {
                str = f3765;
                m4207 = C2098.m4207(a3);
                m4207.append(new SimpleDateFormat(a2, Locale.getDefault()).format(new Date()));
                a = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gj\u001ckoId;M6hNdoAa<\u001ad;\u00196j\u00191g\u001bek\u001ckmNaoN3:\u001cdiJcgJ3oMem\u001cc>J0hJg=JemHe=KeiL4g\u001d7i\u001c7i\u001dgf\u001d`m\u001c4kNg;J4;A7jK1"));
            } else if (Build.VERSION.SDK_INT < 21 || wifiManager.isP2pSupported() || ((C1216) App.f3760).m2714(this)) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) getSystemService(Crypt.a(Crypt.xrc("\u001a7;OjhNgj\u001afm\u001dkkI`9MfoJdkKc;\u001cb9Aj")));
                this.f3766 = wifiP2pManager;
                if (wifiP2pManager == null) {
                    str = f3765;
                    m4207 = C2098.m4207(a3);
                    m4207.append(new SimpleDateFormat(a2, Locale.getDefault()).format(new Date()));
                    a = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gj\u001ckoId;M6hNdoAa<\u001ad;\u00196j\u00191g\u001bek\u001ckmNalO0jLe<AekHciK4;H3f\u001bc9L0>M3fL7kA69LbhLk<N4gK4>HenLkjLbi@dl\u001b4;\u001cf"));
                } else {
                    WifiP2pManager.Channel initialize = wifiP2pManager.initialize(this, getMainLooper(), null);
                    this.f3810 = initialize;
                    if (initialize != null) {
                        return true;
                    }
                    str = f3765;
                    m4207 = C2098.m4207(a3);
                    m4207.append(new SimpleDateFormat(a2, Locale.getDefault()).format(new Date()));
                    a = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gmKf=@flIf<K3j\u001aj:\u001a0;H1nK6m@0;\u001ek9\u001a1l\u001d6k\u001bcmIb:A`jJ7>M6n@kj\u0019e9\u001bjm@b<\u001aei\u001d3oO7j\u001eblK1gJd<Maf@jmAk>\u0019kn\u001bk"));
                }
            } else {
                str = f3765;
                m4207 = C2098.m4207(a3);
                m4207.append(new SimpleDateFormat(a2, Locale.getDefault()).format(new Date()));
                a = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g9\u001a1fL6g@0<I0i\u001ad:\u001ejmMei\u001dd>\u0019foAjf\u001b0iA0fObi@c9@1>\u001ed=\u001d7g\u001e3<\u001eg9\u001e7:K4lKb>H4n\u0019a<\u001cb<Lcf\u001bb=\u001a7l\u0019joL6:LalLe<\u001c7j\u001e69I09Kf:@79\u001a7<\u001cd;JkiOgk\u001delH"));
            }
        } else {
            str = f3765;
            m4207 = C2098.m4207(a3);
            m4207.append(new SimpleDateFormat(a2, Locale.getDefault()).format(new Date()));
            a = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggKjlJa>A3o\u001bko\u001dcg\u0019fh\u001e0h\u00191oO4;\u0019a=L4:\u001abmHdfOg>AahAdhN7nNjo\u001d49\u001abgH1hO1oIbhMg=L3lMbmIen\u001c7k\u001be;Lg=H`gOdhHj;Ng:\u001ce9I0jMj=\u001eemJ4nHc=NdiA`iK"));
        }
        m4207.append(a);
        C1687.m3697(str, m4207.toString());
        return false;
    }

    @Override // p107.p108.p109.p110.p113.p117.InterfaceC1859
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void mo1621(int i) {
    }

    @Override // p107.p108.p109.p110.p119.C1867.InterfaceC1877
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo1622(boolean z) {
        if (!App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4")), false)) {
            if (this.f3789 == 0) {
                this.f3798.setVisibility(0);
                this.f3769.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f3789 == 0) {
            this.f3798.setVisibility(8);
            this.f3769.setVisibility(0);
            if (z) {
                this.f3769.m1184(false);
            } else {
                this.f3769.m1185(false);
            }
        }
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public final String m1623() {
        if (C1067.m2407(this, Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9Nbo\u0019afLb<\u00197kHbmO69\u001e7;LjnAa=JbmN1lHdoI0jH7<LjhLdoOfkJ6lKekHbg\u001ec<"))) != 0) {
            return Crypt.a(Crypt.xrc("\u001d79ObhH6jH4i\u001a4=K69IcoA3fJbm\u001b4n\u001bc"));
        }
        int i = Build.VERSION.SDK_INT;
        String a = Crypt.a(Crypt.xrc("K3m\u001a7o\u001aj:\u001a3k\u0019k>\u001c1nKkk\u001d`>I7k\u001b4gNc"));
        if (i >= 22) {
            SubscriptionManager from = SubscriptionManager.from(this);
            if (from.getActiveSubscriptionInfoCount() > 1) {
                String countryIso = from.getActiveSubscriptionInfo(m1613((SubscriptionManager) getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("A4jLclL`;LagA0k@6<O1<\u001bboHb9Jgg\u001ad9Hf>Le:J0;\u001acjA4>Lkk\u001dk;M6hNa>I6fM"))))).getCountryIso();
                return countryIso.isEmpty() ? ((TelephonyManager) getBaseContext().getSystemService(a)).getSimCountryIso() : countryIso;
            }
        }
        return ((TelephonyManager) getBaseContext().getSystemService(a)).getSimCountryIso();
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public final String m1624() {
        TelephonyManager telephonyManager;
        StringBuilder sb;
        Method method;
        Object[] objArr;
        String string = Settings.Secure.getString(getContentResolver(), Crypt.a(Crypt.xrc("@bm\u001ebjN`l\u001e`;M3<Ad=@alO3h\u001bgmKdgMk")));
        String str = Build.SERIAL;
        TelephonyManager telephonyManager2 = (TelephonyManager) getSystemService(Crypt.a(Crypt.xrc("K3m\u001a7o\u001aj:\u001a3k\u0019k>\u001c1nKkk\u001d`>I7k\u001b4gNc")));
        int m2407 = C1067.m2407(this, Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck9Nbo\u0019afLb<\u00197kHbmO69\u001e7;LjnAa=JbmN1lHdoI0jH7<LjhLdoOfkJ6lKekHbg\u001ec<")));
        String a = Crypt.a(Crypt.xrc("Nc;\u001cejK3jO7mOfgLggN6oMek\u001d`k\u001ckf\u001cd"));
        if (m2407 != 0) {
            sb = new StringBuilder();
        } else {
            try {
                method = Class.forName(telephonyManager2.getClass().getName()).getMethod(Crypt.a(Crypt.xrc("Aem@ej\u001cdi\u001bfiMfnO7>\u001e6<\u001c0jI7i\u001a3fOf")), Integer.TYPE);
                objArr = new Object[]{0};
                telephonyManager = (TelephonyManager) method.invoke(null, objArr);
            } catch (Exception unused) {
            }
            try {
                telephonyManager.getDeviceId();
                telephonyManager.getSimState();
                telephonyManager.getNetworkOperator();
                telephonyManager.getNetworkOperatorName();
                objArr[0] = 1;
                TelephonyManager telephonyManager3 = (TelephonyManager) method.invoke(null, objArr);
                telephonyManager3.getDeviceId();
                telephonyManager3.getSimState();
                telephonyManager3.getNetworkOperator();
                telephonyManager3.getNetworkOperatorName();
            } catch (Exception unused2) {
                telephonyManager2 = telephonyManager;
                telephonyManager = telephonyManager2;
                a = telephonyManager.getDeviceId();
                sb = new StringBuilder();
                sb.append(string);
                sb.append(str);
                sb.append(a);
                return C1852.m3976(sb.toString());
            }
            try {
                a = telephonyManager.getDeviceId();
            } catch (Exception unused3) {
            }
            sb = new StringBuilder();
        }
        sb.append(string);
        sb.append(str);
        sb.append(a);
        return C1852.m3976(sb.toString());
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final void m1625() {
        C1899 c1899 = this.f3812;
        String a = Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"));
        if (c1899 != null && App.f3762.getBoolean(a, true)) {
            this.f3812.m4009();
        }
        if (this.f3805 != null && !App.f3762.getBoolean(a, true)) {
            this.f3805.m3983();
        }
        DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(this, 2131886321);
        AlertController.C0038 c0038 = c1344.f6452;
        c0038.f174 = Crypt.a(Crypt.xrc("\u001b6gL7;\u001eglN3kKdlLkm\u0019kj\u001akj\u001b0;Oj;\u001d1"));
        c0038.f172 = Crypt.a(Crypt.xrc("Igk\u001ba<\u001e7mHgmO`:Nb<K`9\u001c6f\u001c`fH1h\u0019gmMg>O7=@f:A7fH6;H`hAc>Lfl\u001ekmNah\u0019"));
        DialogInterfaceOnClickListenerC0512 dialogInterfaceOnClickListenerC0512 = new DialogInterfaceOnClickListenerC0512();
        c0038.f162 = Crypt.a(Crypt.xrc("A7:A7fL4:N`<@e:Oa9Oaj\u001ak:O4:\u001cbmJ0"));
        c0038.f160 = dialogInterfaceOnClickListenerC0512;
        DialogInterfaceOnClickListenerC0510 dialogInterfaceOnClickListenerC0510 = new DialogInterfaceOnClickListenerC0510();
        c0038.f176 = Crypt.a(Crypt.xrc("Ic;NdiLa<J6;\u001admNfo\u001dkn\u001cj;Lc<Mj9\u001e`"));
        c0038.f163 = dialogInterfaceOnClickListenerC0510;
        c1344.m3032();
    }

    @Override // p107.p108.p109.p110.p113.p117.InterfaceC1859
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void mo1626(int i) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:107:0x074e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public final void m1627() {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.m1627():void");
    }

    @Override // p107.p108.p109.p110.p113.p117.InterfaceC1859
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void mo1628(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x02e8 A[Catch: IndexOutOfBoundsException -> 0x04f3, TryCatch #0 {IndexOutOfBoundsException -> 0x04f3, blocks: (B:27:0x0183, B:29:0x0192, B:31:0x01a1, B:32:0x01ca, B:33:0x01b6, B:34:0x01d1, B:37:0x036d, B:39:0x037e, B:41:0x0388, B:43:0x03dc, B:45:0x03e0, B:46:0x03fa, B:49:0x03ee, B:51:0x03f2, B:68:0x04b2, B:79:0x02b1, B:81:0x02e8, B:83:0x033e, B:85:0x0342, B:86:0x035c, B:88:0x0350, B:90:0x0354), top: B:26:0x0183 }] */
    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1629(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.MainActivity.m1629(java.lang.String):void");
    }
}
