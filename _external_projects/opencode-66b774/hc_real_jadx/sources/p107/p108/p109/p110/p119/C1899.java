package p107.p108.p109.p110.p119;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.textfield.TextInputLayout;
import dev.epro.v2ray.util.Result;
import dev.epro.v2ray.util.Utils;
import dev.epro.v2ray.util.V2rayConfigUtil;
import java.io.File;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0761;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1842;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.activities.PsiphonSettings;
import team.dev.epro.apkcustom.activities.V2raySettings;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1899 extends Fragment {

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public static final String f8349 = C1899.class.getSimpleName();

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public CheckBox f8350;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public EditText f8351;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public CheckBox f8352;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public RelativeLayout f8353;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public BroadcastReceiver f8354;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public CheckBox f8355;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public RelativeLayout f8356;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public CheckBox f8357;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public CheckBox f8359;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public CheckBox f8360;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public CheckBox f8361;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public TextInputLayout f8362;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public InterstitialAd f8363;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public CheckBox f8364;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public InterfaceC0761 f8365;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public CheckBox f8366;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public AdView f8367;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public InterfaceC1905 f8368;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public CheckBox f8369;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public CheckBox f8370;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public Button f8371;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public TextView f8372;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public AdRequest f8373;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public String f8374 = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public ServiceConnection f8358 = new ServiceConnectionC1900();

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$〳ぜぞぜべっ, reason: contains not printable characters */
    public class ServiceConnectionC1900 implements ServiceConnection {
        public ServiceConnectionC1900() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1899.this.f8365 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1899.this.f8365 = null;
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$〺つふすそ, reason: contains not printable characters */
    public class C1901 implements CompoundButton.OnCheckedChangeListener {
        public C1901() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            if (z && !C1899.this.f8370.isChecked()) {
                C1899.this.f8370.setChecked(true);
            }
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab")), z);
            if (C1899.this.f8355.isChecked()) {
                C1216 c1216 = (C1216) App.f3760;
                if (Boolean.parseBoolean(c1216.m2744(c1216.m2739())[2])) {
                    return;
                }
                V2rayConfigUtil.PREF_LOCAL_DNS_ENABLED = z;
                C1216 c12162 = (C1216) App.f3760;
                boolean parseBoolean = Boolean.parseBoolean(c12162.m2744(c12162.m2739())[2]);
                String a = Crypt.a(Crypt.xrc("NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI"));
                if (parseBoolean) {
                    try {
                        InterfaceC1837 interfaceC1837 = App.f3760;
                        str = ((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[26];
                    } catch (IndexOutOfBoundsException unused) {
                        str = "";
                    }
                } else {
                    str = App.f3762.getString(a, "");
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
                if (!str.isEmpty() && V2rayConfigUtil.isValidConfig(str)) {
                    V2rayConfigUtil.DNS_AGENT = App.f3762.getString(Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1")), Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"))) + Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3")) + App.f3762.getString(Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba")), Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf")));
                    V2rayConfigUtil.parseTypeProtocol(str);
                    Result v2rayConfig = V2rayConfigUtil.getV2rayConfig(C1899.this.m525(), Utils.jsonToVmess(str), "");
                    if (v2rayConfig.getContent() == null || v2rayConfig.getContent().isEmpty()) {
                        return;
                    }
                    App.f3762.edit().putString(a, v2rayConfig.getContent()).apply();
                    InterfaceC1837 interfaceC18373 = App.f3760;
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("H3=Kei\u001a7h\u001akkH1iL1j\u001b6hKc<Je;A4kIjlIbhO4=Oc>\u0019biKkg\u001c7;J39HcgKc:\u00194;L")));
                    m4207.append(C1899.this.m490(2131820626));
                    ((C1216) interfaceC18373).m2790(m4207.toString(), -256);
                }
            }
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$ぁごぐすすぃ, reason: contains not printable characters */
    public class C1902 implements InterfaceC1838 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Intent f8378;

        public C1902(Intent intent) {
            this.f8378 = intent;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            boolean z;
            String str;
            String m2753;
            String a = Crypt.a(Crypt.xrc("\u00190nLkj\u001b3;\u00190g@d>LcnLf<M6;Nk;@k<\u001c0"));
            SharedPreferences sharedPreferences = App.f3762;
            String a2 = Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`"));
            String string = sharedPreferences.getString(a2, "");
            String a3 = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
            String str2 = string.split(a3)[0];
            String a4 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
            if (str2.split(a4)[0].matches(SSHTunnelService.f4039)) {
                try {
                    this.f8378.putExtra(Crypt.a(Crypt.xrc("Hk=@ehNk9\u001dfhJ`g\u001d4jKcm@cjLe>O7g\u001dg")), Inet4Address.getByName(App.f3762.getString(a2, "").split(a3)[0].split(a4)[0]).getHostAddress());
                } catch (UnknownHostException unused) {
                }
            }
            try {
                InterfaceC1837 interfaceC1837 = App.f3760;
                z = Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[9]);
            } catch (IndexOutOfBoundsException unused2) {
                z = false;
            }
            InterfaceC1837 interfaceC18372 = App.f3760;
            if (((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[1].isEmpty()) {
                str = ((C1216) App.f3760).m2753();
            } else {
                InterfaceC1837 interfaceC18373 = App.f3760;
                str = ((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[1];
            }
            if (z) {
                if (((C1216) App.f3760).m2753().isEmpty()) {
                    InterfaceC1837 interfaceC18374 = App.f3760;
                    m2753 = ((C1216) interfaceC18374).m2744(((C1216) interfaceC18374).m2739())[1];
                } else {
                    m2753 = ((C1216) App.f3760).m2753();
                }
                str = m2753;
            }
            if (str.trim().split(a3)[0].split(a4)[0].matches(SSHTunnelService.f4039)) {
                try {
                    this.f8378.putExtra(Crypt.a(Crypt.xrc("Ia:JagL`nA09M7gKdfA`jO3k\u001cjh@jhNb")), Inet4Address.getByName(str.split(a).length > 1 ? str.trim().split(a)[1].split(a3)[0].split(a4)[0] : str.trim().split(a3)[0].split(a4)[0]).getHostAddress());
                } catch (UnknownHostException unused3) {
                }
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            this.f8378.setAction(Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4")));
            if (Build.VERSION.SDK_INT >= 26) {
                C1899.this.m525().startForegroundService(this.f8378);
            } else {
                C1899.this.m525().startService(this.f8378);
            }
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$いいにぽつ, reason: contains not printable characters */
    public class C1903 implements CompoundButton.OnCheckedChangeListener {
        public C1903() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferences.Editor putBoolean;
            String a = Crypt.a(Crypt.xrc("Mef\u001bg;He>NbnNglI0mNe<M`g\u0019k>@1;\u001c`"));
            if (z) {
                if (((C1216) App.f3760).m2723()) {
                    putBoolean = App.f3762.edit().putBoolean(a, true);
                    putBoolean.commit();
                } else {
                    InterfaceC1837 interfaceC1837 = App.f3760;
                    C1899 c1899 = C1899.this;
                    ((C1216) interfaceC1837).m2766(c1899.f1186, c1899.m490(2131821430), -65536);
                    compoundButton.setChecked(false);
                }
            }
            putBoolean = App.f3762.edit().putBoolean(a, false);
            putBoolean.commit();
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$ぇぬぎばつ, reason: contains not printable characters */
    public class C1904 implements CompoundButton.OnCheckedChangeListener {
        public C1904(C1899 c1899) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("IklHkjK7m@b=LdoM1k\u001cjlOf<J`;LahKk")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$ぉざぅち〻, reason: contains not printable characters */
    public interface InterfaceC1905 {
        /* renamed from: 〺つふすそ */
        void mo1612();

        /* renamed from: げつ〴ぬぐ */
        void mo1618();
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$おぐぴう〸ず, reason: contains not printable characters */
    public class C1906 implements CompoundButton.OnCheckedChangeListener {
        public C1906() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCheckedChanged(android.widget.CompoundButton r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 413
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1899.C1906.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$くし〴〺ぅ, reason: contains not printable characters */
    public class C1907 implements CompoundButton.OnCheckedChangeListener {
        public C1907() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            String a = Crypt.a(Crypt.xrc("\u001d1lNagIglL3oNdo\u001ea:I0>\u001dajH`lKfo\u001c0"));
            String a2 = Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"));
            if (C0753.m2042()) {
                C1899.this.f8360.setChecked(!z);
                ((C1216) App.f3760).m2766(C1899.this.f1186, Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg")), -65536);
                return;
            }
            if (SSHTunnelService.f4041 || SSHTunnelService.f4034 || SSHTunnelService.f4038) {
                C1899.this.f8360.setChecked(!z);
                ((C1216) App.f3760).m2766(C1899.this.f1186, Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o")), -65536);
                return;
            }
            if (z) {
                try {
                    str = C1899.this.m4011(((C1216) App.f3760).m2739())[12];
                } catch (Exception unused) {
                    str = "";
                }
                if (str.isEmpty() && App.f3762.getString(Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), "").isEmpty()) {
                    try {
                        InterfaceC1837 interfaceC1837 = App.f3760;
                        if (!Boolean.valueOf(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2]).booleanValue()) {
                            InterfaceC1837 interfaceC18372 = App.f3760;
                            if (!Boolean.valueOf(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[15]).booleanValue()) {
                                Intent intent = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                                intent.putExtra(a2, a);
                                C1899.this.m492(intent, 17);
                            }
                        }
                    } catch (Exception unused2) {
                        C1216 c1216 = (C1216) App.f3760;
                        if (!Boolean.valueOf(c1216.m2744(c1216.m2739())[2]).booleanValue()) {
                            Intent intent2 = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                            intent2.putExtra(a2, a);
                            C1899.this.m492(intent2, 17);
                        }
                    }
                }
            }
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1908 implements CompoundButton.OnCheckedChangeListener {
        public C1908() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z && C1899.this.f8350.isChecked()) {
                C1899.this.f8350.setChecked(false);
            }
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$づざかべべ, reason: contains not printable characters */
    public class C1909 extends AdListener {
        public C1909() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            C1899 c1899 = C1899.this;
            if (c1899.f8367 != null) {
                c1899.f8356.setVisibility(0);
            }
            super.onAdLoaded();
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$てぜきぽく, reason: contains not printable characters */
    public class C1910 implements CompoundButton.OnCheckedChangeListener {
        public C1910(C1899 c1899) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$なぎぱいぢぎ, reason: contains not printable characters */
    public class ViewOnClickListenerC1911 implements View.OnClickListener {
        public ViewOnClickListenerC1911() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor edit;
            String trim;
            String a;
            String str;
            String str2;
            String str3;
            boolean isChecked = C1899.this.f8369.isChecked();
            String a2 = Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`"));
            String a3 = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
            if (isChecked) {
                C1899 c1899 = C1899.this;
                c1899.getClass();
                App.f3762.edit().putString(a2, c1899.f8351.getText().toString().trim()).apply();
                try {
                    if (Boolean.parseBoolean(c1899.m4011(((C1216) App.f3760).m2739())[19])) {
                        String str4 = c1899.m4011(((C1216) App.f3760).m2739())[7].trim().split(a3)[0];
                        if (c1899.f8351.getText().toString().trim().contains(a3)) {
                            str3 = c1899.f8351.getText().toString().trim();
                        } else {
                            str3 = a3 + c1899.f8351.getText().toString().trim();
                        }
                        App.f3762.edit().putString(a2, str4 + str3).apply();
                    }
                } catch (Exception unused) {
                }
                Intent prepare = VpnService.prepare(c1899.m525());
                if (prepare != null) {
                    c1899.m492(prepare, 100);
                    return;
                } else {
                    c1899.m525();
                    c1899.mo532(100, -1, null);
                    return;
                }
            }
            if (C1899.this.f8355.isChecked()) {
                C1899 c18992 = C1899.this;
                c18992.getClass();
                App.f3762.edit().putString(a2, c18992.f8351.getText().toString().trim()).apply();
                try {
                    if (Boolean.parseBoolean(c18992.m4011(((C1216) App.f3760).m2739())[19])) {
                        String str5 = c18992.m4011(((C1216) App.f3760).m2739())[7].trim().split(a3)[0];
                        if (c18992.f8351.getText().toString().trim().contains(a3)) {
                            str2 = c18992.f8351.getText().toString().trim();
                        } else {
                            str2 = a3 + c18992.f8351.getText().toString().trim();
                        }
                        App.f3762.edit().putString(a2, str5 + str2).apply();
                    }
                } catch (Exception unused2) {
                }
                Intent prepare2 = VpnService.prepare(c18992.m525());
                if (prepare2 != null) {
                    c18992.m492(prepare2, 101);
                    return;
                } else {
                    c18992.m525();
                    c18992.mo532(101, -1, null);
                    return;
                }
            }
            C1899 c18993 = C1899.this;
            c18993.getClass();
            C2098.m4201(c18993.f8361, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")));
            C2098.m4201(c18993.f8364, App.f3762.edit(), Crypt.a(Crypt.xrc("Mef\u001bg;He>NbnNglI0mNe<M`g\u0019k>@1;\u001c`")));
            C2098.m4201(c18993.f8357, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")));
            C2098.m4191(c18993.f8366, App.f3762.edit(), Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")));
            C2098.m4191(c18993.f8359, App.f3762.edit(), Crypt.a(Crypt.xrc("KkgK3gIg<H4l\u00197hN6=I1fMcl\u001e4hIg<\u001df")));
            C2098.m4191(c18993.f8369, App.f3762.edit(), Crypt.a(Crypt.xrc("Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1")));
            C2098.m4191(c18993.f8355, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001a3h\u001ado@6iAch\u001bbl\u001ab>Oa9Lj:Je;\u0019jfK3")));
            C2098.m4201(c18993.f8352, App.f3762.edit(), Crypt.a(Crypt.xrc("IklHkjK7m@b=LdoM1k\u001cjlOf<J`;LahKk")));
            C2098.m4201(c18993.f8370, App.f3762.edit(), Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")));
            C2098.m4201(c18993.f8350, App.f3762.edit(), Crypt.a(Crypt.xrc("HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab")));
            C2098.m4201(c18993.f8360, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")));
            App.f3762.edit().putString(a2, c18993.f8351.getText().toString().trim()).commit();
            try {
                if (Boolean.valueOf(c18993.m4011(((C1216) App.f3760).m2739())[19]).booleanValue()) {
                    String str6 = c18993.m4011(((C1216) App.f3760).m2739())[7].trim().split(a3)[0];
                    if (c18993.f8351.getText().toString().trim().contains(a3)) {
                        str = c18993.f8351.getText().toString().trim();
                    } else {
                        str = a3 + c18993.f8351.getText().toString().trim();
                    }
                    App.f3762.edit().putString(a2, str6 + str).commit();
                }
            } catch (Exception unused3) {
            }
            if (((C1216) App.f3760).m2739().isEmpty()) {
                edit = App.f3762.edit();
                trim = c18993.f8351.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"));
            } else {
                edit = App.f3762.edit();
                trim = c18993.f8351.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"));
            }
            edit.putString(a, trim).commit();
            boolean m2701 = ((C1216) App.f3760).m2701(c18993.m525(), SSHTunnelService.class);
            String a4 = Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"));
            String a5 = Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"));
            if (m2701 || c18993.f8371.getText().equals(c18993.m490(2131820598)) || c18993.f8371.getText().equals(c18993.m490(2131820669))) {
                c18993.f8371.setText(2131820670);
                C2098.m4184(App.f3762, a5, false);
                C2098.m4184(App.f3762, a4, false);
                if (c18993.f8364.isChecked()) {
                    Boolean bool = Boolean.FALSE;
                    try {
                        bool = Boolean.valueOf(c18993.m4011(((C1216) App.f3760).m2739())[9]);
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                    String m2753 = c18993.m4011(((C1216) App.f3760).m2739())[1].isEmpty() ? ((C1216) App.f3760).m2753() : c18993.m4011(((C1216) App.f3760).m2739())[1];
                    if (bool.booleanValue()) {
                        m2753 = ((C1216) App.f3760).m2753().isEmpty() ? c18993.m4011(((C1216) App.f3760).m2739())[1] : ((C1216) App.f3760).m2753();
                    }
                    if (!m2753.isEmpty() && ((C1216) App.f3760).m2723()) {
                        new AsyncTaskC1840(new C1887(c18993, m2753)).execute(new Void[0]);
                    }
                }
                Intent intent = new Intent(c18993.m525(), (Class<?>) SSHTunnelService.class);
                intent.setAction(Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf")));
                int i = Build.VERSION.SDK_INT;
                FragmentActivity m525 = c18993.m525();
                if (i >= 26) {
                    m525.startForegroundService(intent);
                } else {
                    m525.startService(intent);
                }
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe")), 0);
                return;
            }
            if (c18993.f8351.getText().toString().trim().isEmpty()) {
                C2098.m4197(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"))), Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g:Hgl\u001dc<M4<\u0019aiNcf\u001b7o@aoO0l\u001a1nHbiKkn\u00196nL4fI4;HcoAjfMckI3:JklA7n\u0019c>")), C1899.f8349);
                ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("\u001ab;Kg<Ldm\u001c3l\u0019`f\u001d1<LknId:LjhKfiL79@j>@a<\u001c6k\u001c`mAa:M6kIe<I0hI0>JdfO")), -65536);
                return;
            }
            if (SSHTunnelService.f4038) {
                ((C1216) App.f3760).m2766(c18993.f1186, Crypt.a(Crypt.xrc("@eg\u001bc:N3n\u001ed9NkgJkgIfi\u0019cg\u001dd>Hbk\u001dj;\u001d1>\u0019jo\u001c7n\u001dbl\u00196iK1;I4f\u001efm\u001dfn\u001be;A")), -65536);
                return;
            }
            c18993.f8371.setText(2131820669);
            InterfaceC1905 interfaceC1905 = c18993.f8368;
            if (interfaceC1905 != null) {
                interfaceC1905.mo1618();
            }
            c18993.f8363.loadAd(c18993.f8373);
            App.f3762.edit().putBoolean(a5, true).commit();
            c18993.m4007();
            App.f3762.edit().putBoolean(a4, true).commit();
            if (C0753.m2042()) {
                C0765.m2061(c18993.m525());
                InterfaceC0761 interfaceC0761 = c18993.f8365;
                if (interfaceC0761 != null) {
                    try {
                        interfaceC0761.mo1589(false);
                    } catch (RemoteException unused5) {
                    }
                }
            }
            if (c18993.f8364.isChecked()) {
                Boolean bool2 = Boolean.FALSE;
                try {
                    bool2 = Boolean.valueOf(c18993.m4011(((C1216) App.f3760).m2739())[9]);
                } catch (IndexOutOfBoundsException unused6) {
                }
                String m27532 = c18993.m4011(((C1216) App.f3760).m2739())[1].isEmpty() ? ((C1216) App.f3760).m2753() : c18993.m4011(((C1216) App.f3760).m2739())[1];
                if (bool2.booleanValue()) {
                    m27532 = ((C1216) App.f3760).m2753().isEmpty() ? c18993.m4011(((C1216) App.f3760).m2739())[1] : ((C1216) App.f3760).m2753();
                }
                if (!m27532.isEmpty()) {
                    if (((C1216) App.f3760).m2723()) {
                        new AsyncTaskC1840(new C1919(c18993, m27532)).execute(new Void[0]);
                    } else {
                        ((C1216) App.f3760).m2766(c18993.f1186, c18993.m490(2131821430), -65536);
                    }
                }
            }
            Intent prepare3 = VpnService.prepare(c18993.m525());
            if (prepare3 != null) {
                c18993.m492(prepare3, 1111);
            } else {
                c18993.m525();
                c18993.mo532(1111, -1, null);
            }
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$のぷのちつ, reason: contains not printable characters */
    public class C1912 implements CompoundButton.OnCheckedChangeListener {
        public C1912(C1899 c1899) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("KkgK3gIg<H4l\u00197hN6=I1fMcl\u001e4hIg<\u001df")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$びぐびあび, reason: contains not printable characters */
    public class C1913 extends BroadcastReceiver {

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC1914 implements Runnable {
            public RunnableC1914() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Button button;
                int i;
                if (SSHTunnelService.f4041 && SSHTunnelService.f4036 && !SSHTunnelService.f4038) {
                    C1899.this.f8371.setText(2131820598);
                    C1899.this.m4007();
                    InterstitialAd interstitialAd = C1899.this.f8363;
                    if (interstitialAd == null || !interstitialAd.isLoaded()) {
                        return;
                    }
                    C1899.this.f8363.show();
                    return;
                }
                if (SSHTunnelService.f4031 && !SSHTunnelService.f4036) {
                    C1899.this.f8371.setText(2131820597);
                    C1899.this.m4013();
                    return;
                }
                if (SSHTunnelService.f4034) {
                    button = C1899.this.f8371;
                    i = 2131820669;
                } else {
                    if (!SSHTunnelService.f4038) {
                        return;
                    }
                    button = C1899.this.f8371;
                    i = 2131820670;
                }
                button.setText(i);
                C1899.this.m4007();
            }
        }

        public C1913() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C1899.this.m525().runOnUiThread(new RunnableC1914());
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$へぬ〴づぞ, reason: contains not printable characters */
    public class C1915 implements CompoundButton.OnCheckedChangeListener {
        public C1915() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1899 c1899 = C1899.this;
            if (!z) {
                if (!c1899.f8355.isChecked()) {
                    if (!Boolean.valueOf(C1899.this.m4011(((C1216) App.f3760).m2739())[2]).booleanValue()) {
                        C1899.this.f8362.setVisibility(0);
                    }
                }
                C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1")), z);
            }
            c1899.f8355.setChecked(false);
            C1899.this.f8362.setVisibility(8);
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$ぺぁあねじ, reason: contains not printable characters */
    public class C1916 implements CompoundButton.OnCheckedChangeListener {
        public C1916() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            View view;
            C1216 c1216;
            String a;
            Intent intent;
            if (C0753.m2042()) {
                C1899.this.f8361.setChecked(!z);
                InterfaceC1837 interfaceC1837 = App.f3760;
                view = C1899.this.f1186;
                c1216 = (C1216) interfaceC1837;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
            } else {
                if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                    String a2 = Crypt.a(Crypt.xrc("Hef\u001cj<Jc>L3f\u001eblJ7lA1>@dfK`;\u001akf\u001d6"));
                    String a3 = Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"));
                    if (!z) {
                        C2098.m4184(App.f3762, a3, false);
                        C2098.m4182(App.f3762, a2, false);
                        return;
                    }
                    C2098.m4184(App.f3762, a3, true);
                    boolean isEmpty = C1899.this.m4011(((C1216) App.f3760).m2739())[0].isEmpty();
                    String a4 = Crypt.a(Crypt.xrc("Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f"));
                    String a5 = Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"));
                    if (isEmpty && ((C1216) App.f3760).m2783().isEmpty()) {
                        try {
                            InterfaceC1837 interfaceC18372 = App.f3760;
                            if (Boolean.valueOf(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[2]).booleanValue()) {
                                return;
                            }
                            InterfaceC1837 interfaceC18373 = App.f3760;
                            if (Boolean.valueOf(((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[15]).booleanValue()) {
                                return;
                            }
                            Intent intent2 = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                            intent2.putExtra(a5, a4);
                            C1899.this.m492(intent2, 21);
                            return;
                        } catch (Exception unused) {
                            C1216 c12162 = (C1216) App.f3760;
                            if (Boolean.valueOf(c12162.m2744(c12162.m2739())[2]).booleanValue()) {
                                return;
                            } else {
                                intent = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                            }
                        }
                    } else {
                        String trim = C1899.this.m4011(((C1216) App.f3760).m2739())[0].trim();
                        String a6 = Crypt.a(Crypt.xrc("\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4"));
                        if ((!trim.equals(a6) && !((C1216) App.f3760).m2783().trim().equals(a6)) || App.f3762.getBoolean(a2, false)) {
                            return;
                        }
                        try {
                            InterfaceC1837 interfaceC18374 = App.f3760;
                            if (Boolean.valueOf(((C1216) interfaceC18374).m2744(((C1216) interfaceC18374).m2739())[2]).booleanValue()) {
                                return;
                            }
                            InterfaceC1837 interfaceC18375 = App.f3760;
                            if (Boolean.valueOf(((C1216) interfaceC18375).m2744(((C1216) interfaceC18375).m2739())[15]).booleanValue()) {
                                return;
                            }
                            Intent intent3 = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                            intent3.putExtra(a5, a4);
                            C1899.this.m492(intent3, 21);
                            return;
                        } catch (Exception unused2) {
                            C1216 c12163 = (C1216) App.f3760;
                            if (Boolean.valueOf(c12163.m2744(c12163.m2739())[2]).booleanValue()) {
                                return;
                            } else {
                                intent = new Intent(C1899.this.m525(), (Class<?>) RequestBlock.class);
                            }
                        }
                    }
                    intent.putExtra(a5, a4);
                    C1899.this.m492(intent, 21);
                    return;
                }
                C1899.this.f8361.setChecked(!z);
                InterfaceC1837 interfaceC18376 = App.f3760;
                view = C1899.this.f1186;
                c1216 = (C1216) interfaceC18376;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
            }
            c1216.m2766(view, a, -65536);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.づざかべべ$ぺふねづ〺, reason: contains not printable characters */
    public class C1917 implements CompoundButton.OnCheckedChangeListener {
        public C1917(C1899 c1899) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")), z);
        }
    }

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public void m4002() {
        if (m525() != null) {
            this.f8360.setChecked(false);
        }
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m4003() {
        if (m525() != null) {
            this.f8369.setChecked(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぃぜぶの〸ぃ */
    public boolean mo483(MenuItem menuItem) {
        InterfaceC1837 interfaceC1837;
        Class<?> cls;
        int itemId = menuItem.getItemId();
        if (itemId == 2131296330) {
            interfaceC1837 = App.f3760;
            cls = PsiphonSettings.class;
        } else {
            if (itemId != 2131296335) {
                return false;
            }
            interfaceC1837 = App.f3760;
            cls = V2raySettings.class;
        }
        ((C1216) interfaceC1837).m2716(cls);
        return false;
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public void m4004() {
        if (m525() != null) {
            this.f8360.setChecked(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
        this.f8368 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        if (context instanceof InterfaceC1905) {
            this.f8368 = (InterfaceC1905) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: おかぷせ〱 */
    public void mo494() {
        try {
            m525().unregisterReceiver(this.f8354);
        } catch (Exception unused) {
        }
        try {
            m525().unbindService(this.f8358);
        } catch (Exception unused2) {
        }
        AdView adView = this.f8367;
        if (adView != null) {
            adView.destroy();
        }
        this.f1196 = true;
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public void m4005() {
        if (m525() != null) {
            this.f8369.setChecked(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492941, viewGroup, false);
        this.f8356 = (RelativeLayout) inflate.findViewById(2131296346);
        AdView adView = new AdView(m525());
        this.f8367 = adView;
        adView.setAdSize(AdSize.BANNER);
        this.f8367.setAdUnitId(Crypt.a(Crypt.xrc("@g>\u001eaj\u001aknAgo\u001bjo\u001afg@dfHbiJa:\u001e4nLbi\u001dd9J4<\u0019k;N`mI6f\u001b79AchK`j@f:Iko\u001e1:L4<\u001djiMaoH1=@dl\u001db;\u001ajiO1;I`kOem")));
        this.f8367.setAdListener(new C1909());
        this.f8356.setVisibility(8);
        this.f8356.addView(this.f8367);
        AdRequest build = new AdRequest.Builder().addTestDevice(Crypt.a(Crypt.xrc("IdnO0fHcoMdj\u001d6nMj<I0=@bjIdh\u001d4:KajMj;A4h\u001bejLk:Ob>\u001b1m\u0019kf\u001a7nN0iO4<Nfk\u00193iO1oOam\u001e0gJ7;I`:@7;@d:K4kO1i"))).addTestDevice(Crypt.a(Crypt.xrc("H6nLa:Na;\u0019k9\u001abkH`mI4iKal@j9Jd9N4oA`9Mch\u001eji@0<\u001bbm\u001ec<\u0019c;M6o\u001d49\u001bfjH0f@3o\u001cg;\u0019a>@7:Ie9A4;Oek\u001a4f\u001ce;Ig;"))).addTestDevice(Crypt.a(Crypt.xrc("NciA0k\u001b0n\u001cefLk>\u001c6mK49@7fK4gI3j\u001d1:KfjO4o\u001e79J1lL1>\u001ak9JgkIb:\u001ag;Lfh\u001bji\u00190<M3:IdiL1>\u00194=\u001b1k\u001a0l\u001dglIcnN3;"))).build();
        this.f8373 = build;
        this.f8367.loadAd(build);
        InterstitialAd interstitialAd = new InterstitialAd(App.f3759);
        this.f8363 = interstitialAd;
        interstitialAd.setAdUnitId(Crypt.a(Crypt.xrc("@g>\u001eaj\u001aknAgo\u001bjo\u001afg@dfHbiJa:\u001e4nLb:HfmMehO4<A7=\u001b4iLcgL4l\u001e7nK6nMak\u001dk<J4h\u001d0i\u001b0l\u0019g9\u0019g:Le=\u001cclIgj\u001bfmI0<")));
        this.f8353 = (RelativeLayout) inflate.findViewById(2131296392);
        this.f8372 = (TextView) inflate.findViewById(2131296877);
        this.f8362 = (TextInputLayout) inflate.findViewById(2131296615);
        this.f8351 = (EditText) inflate.findViewById(2131296598);
        this.f8361 = (CheckBox) inflate.findViewById(2131296428);
        CheckBox checkBox = (CheckBox) inflate.findViewById(2131296429);
        this.f8364 = checkBox;
        checkBox.setEnabled(false);
        this.f8357 = (CheckBox) inflate.findViewById(2131296424);
        this.f8366 = (CheckBox) inflate.findViewById(2131296434);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(2131296433);
        this.f8359 = checkBox2;
        checkBox2.setVisibility(8);
        this.f8359.setChecked(true);
        this.f8369 = (CheckBox) inflate.findViewById(2131296427);
        this.f8355 = (CheckBox) inflate.findViewById(2131296432);
        CheckBox checkBox3 = (CheckBox) inflate.findViewById(2131296431);
        this.f8352 = checkBox3;
        checkBox3.setEnabled(false);
        this.f8370 = (CheckBox) inflate.findViewById(2131296425);
        this.f8350 = (CheckBox) inflate.findViewById(2131296426);
        this.f8360 = (CheckBox) inflate.findViewById(2131296430);
        Button button = (Button) inflate.findViewById(2131296380);
        this.f8371 = button;
        button.setOnClickListener(new ViewOnClickListenerC1911());
        this.f8362.setVisibility(8);
        mo511();
        return inflate;
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public void m4006() {
        if (m525() != null) {
            this.f8361.setChecked(false);
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public final void m4007() {
        this.f8351.setEnabled(false);
        this.f8361.setEnabled(false);
        this.f8364.setEnabled(false);
        this.f8357.setEnabled(false);
        this.f8366.setEnabled(false);
        this.f8359.setEnabled(false);
        this.f8369.setEnabled(false);
        this.f8355.setEnabled(false);
        this.f8352.setEnabled(false);
        this.f8370.setEnabled(false);
        this.f8350.setEnabled(false);
        this.f8360.setEnabled(false);
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public void m4008() {
        if (m525() != null) {
            this.f8355.setChecked(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        m498(true);
        Bundle bundle2 = this.f1176;
        if (bundle2 != null) {
            bundle2.getString(Crypt.a(Crypt.xrc("Nbn\u0019dl\u001e3f\u001cgjJgfHciAchKg=J49K`:@3")));
            this.f1176.getString(Crypt.a(Crypt.xrc("N3<O3>Ng;J09M7mOjiN4jObnNdfA0fMf")));
        }
        this.f8354 = new C1913();
        m525().registerReceiver(this.f8354, new IntentFilter(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019b9I`fMc:IchOgm\u001a19AkhLj;\u001bggA0n\u001ea>If9A`oO0nLg9\u001ba=Ogg\u001cd9N3;@4m\u001c0;\u001deh"))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0209, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.f3760).m2701(m525(), team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService.class) != false) goto L51;
     */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ち〴みぎ〻び */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo511() {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1899.mo511():void");
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public void m4009() {
        SharedPreferences.Editor edit;
        String trim;
        String a;
        if (m525() != null) {
            C2098.m4201(this.f8361, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")));
            C2098.m4201(this.f8364, App.f3762.edit(), Crypt.a(Crypt.xrc("Mef\u001bg;He>NbnNglI0mNe<M`g\u0019k>@1;\u001c`")));
            C2098.m4201(this.f8357, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")));
            C2098.m4191(this.f8366, App.f3762.edit(), Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")));
            C2098.m4191(this.f8359, App.f3762.edit(), Crypt.a(Crypt.xrc("KkgK3gIg<H4l\u00197hN6=I1fMcl\u001e4hIg<\u001df")));
            C2098.m4191(this.f8369, App.f3762.edit(), Crypt.a(Crypt.xrc("Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1")));
            C2098.m4191(this.f8355, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001a3h\u001ado@6iAch\u001bbl\u001ab>Oa9Lj:Je;\u0019jfK3")));
            C2098.m4201(this.f8352, App.f3762.edit(), Crypt.a(Crypt.xrc("IklHkjK7m@b=LdoM1k\u001cjlOf<J`;LahKk")));
            C2098.m4201(this.f8370, App.f3762.edit(), Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")));
            C2098.m4201(this.f8350, App.f3762.edit(), Crypt.a(Crypt.xrc("HfgLdi\u001d4kAfn\u001deh\u001eco\u001dbnNa>\u001a`>\u001c6j\u001ab")));
            C2098.m4201(this.f8360, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")));
            if (((C1216) App.f3760).m2739().isEmpty()) {
                edit = App.f3762.edit();
                trim = this.f8351.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"));
            } else {
                edit = App.f3762.edit();
                trim = this.f8351.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"));
            }
            edit.putString(a, trim).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ておぞぞはね */
    public void mo512() {
        m4009();
        AdView adView = this.f8367;
        if (adView != null) {
            adView.pause();
        }
        this.f1196 = true;
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public void m4010() {
        SharedPreferences.Editor edit;
        String a;
        if (m525() == null) {
            return;
        }
        this.f8351.setText("");
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`")), "");
        if (((C1216) App.f3760).m2739().isEmpty()) {
            edit = App.f3762.edit();
            a = Crypt.a(Crypt.xrc("\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"));
        } else {
            edit = App.f3762.edit();
            a = Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"));
        }
        edit.putString(a, "").commit();
        this.f8353.setVisibility(8);
        m4013();
        this.f8362.setVisibility(0);
        this.f8369.setChecked(false);
        this.f8355.setChecked(false);
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public final String[] m4011(String str) {
        try {
            if (str.trim().isEmpty()) {
                return C1842.f8212;
            }
            File file = new File(str);
            boolean exists = file.exists();
            String a = Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"));
            String a2 = Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`"));
            if (!exists) {
                this.f8351.setText("");
                App.f3762.edit().putString(a2, "").commit();
                App.f3762.edit().putString(a, "").commit();
                this.f8353.setVisibility(8);
                ((C1216) App.f3760).m2794();
                return C1842.f8212;
            }
            String m2789 = ((C1216) App.f3760).m2789(file);
            if (m2789.isEmpty()) {
                this.f8351.setText("");
                App.f3762.edit().putString(a2, "").commit();
                App.f3762.edit().putString(a, "").commit();
                this.f8353.setVisibility(8);
                return C1842.f8212;
            }
            if (m2789.contains(Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok")))) {
                return m2789.split("\\[splitConfig\\]");
            }
            this.f8351.setText("");
            App.f3762.edit().putString(a2, "").commit();
            App.f3762.edit().putString(a, "").commit();
            this.f8353.setVisibility(8);
            return C1842.f8212;
        } catch (Exception unused) {
            return C1842.f8212;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぷぞてのほき */
    public void mo528(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558405, menu);
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public void m4012() {
        if (m525() != null) {
            this.f8361.setChecked(true);
        }
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public final void m4013() {
        if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false)) {
            return;
        }
        this.f8351.setEnabled(true);
        this.f8361.setEnabled(true);
        this.f8357.setEnabled(true);
        this.f8366.setEnabled(true);
        this.f8359.setEnabled(true);
        try {
            if (!Boolean.valueOf(m4011(((C1216) App.f3760).m2739())[2]).booleanValue() && !Boolean.valueOf(m4011(((C1216) App.f3760).m2739())[19]).booleanValue()) {
                this.f8369.setEnabled(true);
            }
        } catch (Exception unused) {
            if (!Boolean.valueOf(m4011(((C1216) App.f3760).m2739())[2]).booleanValue()) {
                this.f8369.setEnabled(true);
            }
        }
        this.f8369.setEnabled(true);
        this.f8355.setEnabled(true);
        this.f8370.setEnabled(true);
        this.f8350.setEnabled(true);
        this.f8360.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぺづげぺが */
    public void mo532(int i, int i2, Intent intent) {
        String str;
        if (i == 17) {
            m525();
            if (i2 == -1) {
                try {
                    str = m4011(((C1216) App.f3760).m2739())[12];
                } catch (Exception unused) {
                    str = "";
                }
                if (str.isEmpty() && App.f3762.getString(Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), "").isEmpty()) {
                    return;
                }
                m4004();
                return;
            }
            return;
        }
        if (i == 21) {
            m525();
            if (i2 == -1) {
                if (m4011(((C1216) App.f3760).m2739())[0].isEmpty() && ((C1216) App.f3760).m2783().isEmpty() && m4011(((C1216) App.f3760).m2739())[1].isEmpty()) {
                    return;
                }
                m4012();
                return;
            }
            return;
        }
        if (i == 1111) {
            m525();
            if (i2 == -1) {
                new AsyncTaskC1840(new C1902(new Intent(m525(), (Class<?>) SSHTunnelService.class))).execute(new Void[0]);
                return;
            }
            this.f8371.setText(2131820597);
            m4013();
            String str2 = f8349;
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
            m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
            m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
            m4207.append(m490(2131821420));
            C1687.m3697(str2, m4207.toString());
            return;
        }
        String a = Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"));
        String a2 = Crypt.a(Crypt.xrc("IcfKjg\u001cj9@`:\u0019egKk:K6=\u001a1mIjh\u001c1n@4"));
        if (i == 100) {
            m525();
            if (i2 == -1) {
                Intent intent2 = new Intent(m525(), (Class<?>) PsiphonVPNService.class);
                if (((C1216) App.f3760).m2701(m525(), PsiphonVPNService.class)) {
                    intent2.setAction(a);
                    this.f8371.setText(2131820670);
                } else {
                    this.f8363.loadAd(this.f8373);
                    intent2.setAction(a2);
                    this.f8371.setText(2131820669);
                    m4007();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    m525().startForegroundService(intent2);
                    return;
                } else {
                    m525().startService(intent2);
                    return;
                }
            }
            return;
        }
        if (i != 101) {
            return;
        }
        m525();
        if (i2 == -1) {
            Intent intent3 = new Intent(m525(), (Class<?>) V2RayVpnService.class);
            if (((C1216) App.f3760).m2701(m525(), V2RayVpnService.class)) {
                intent3.setAction(a);
                if (Build.VERSION.SDK_INT >= 26) {
                    m525().startForegroundService(intent3);
                } else {
                    m525().startService(intent3);
                }
                this.f8371.setText(2131820597);
                return;
            }
            intent3.setAction(a2);
            if (Build.VERSION.SDK_INT >= 26) {
                m525().startForegroundService(intent3);
            } else {
                m525().startService(intent3);
            }
            this.f8371.setText(2131820598);
        }
    }
}
