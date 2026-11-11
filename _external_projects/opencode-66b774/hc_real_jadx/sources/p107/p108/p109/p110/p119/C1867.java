package p107.p108.p109.p110.p119;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.VpnService;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.textfield.TextInputLayout;
import de.blinkt.openvpn.core.ConnectionStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import p000.C0582;
import p000.C0706;
import p000.C0710;
import p000.p001.C0629;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0761;
import p034.p050.p053.C1216;
import p034.p065.p066.C1412;
import p034.p095.C1687;
import p107.p108.p109.p110.p112.C1831;
import p107.p108.p109.p110.p113.C1842;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1839;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p107.p108.p109.p110.p129.C1961;
import p107.p108.p109.p110.p129.C1962;
import p131.p135.p137.C1982;
import p131.p135.p137.EnumC1975;
import p131.p135.p138.C1998;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.dialogs.RequestBlock;
import team.dev.epro.apkcustom.models.VPNServer;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.Tun2SocksService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.FreshDownloadView;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1867 extends Fragment implements SeekBar.OnSeekBarChangeListener, C0753.InterfaceC0757 {

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public static final String f8270 = C1867.class.getSimpleName();

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public List<VPNServer> f8271;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public ScrollView f8273;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public RecyclerView f8274;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public TextView f8275;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public TextView f8276;

    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public boolean f8277;

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public AdRequest f8278;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public TextView f8280;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public C1831 f8281;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public TextView f8283;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public CheckBox f8284;

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public InterstitialAd f8285;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public CheckBox f8286;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public FreshDownloadView f8287;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public SeekBar f8288;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public CheckBox f8289;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public EditText f8290;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public SwipeRefreshLayout f8291;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public C1962 f8292;

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public RelativeLayout f8293;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public CheckBox f8294;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public LinearLayout f8295;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public Button f8296;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public InterfaceC0761 f8297;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public CheckBox f8298;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public CheckBox f8299;

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public AdView f8300;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public CheckBox f8302;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public TextInputLayout f8303;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public C0775 f8304;

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public RelativeLayout f8305;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public CheckBox f8306;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public TextView f8308;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public TextView f8309;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public InterfaceC1877 f8310;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public int f8301 = 0;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public ServiceConnection f8307 = new ServiceConnectionC1878();

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public String f8272 = "";

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public int f8282 = 0;

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public boolean f8279 = false;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C1868 implements InterfaceC1838 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ String f8312;

        public C1868(String str) {
            this.f8312 = str;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            InterfaceC1837 interfaceC1837 = App.f3760;
            String a = Crypt.a(Crypt.xrc("\u001ckmK4fJ6j\u001aam\u001bd:K1hO6;@jn\u001dj:A1kAj"));
            StringBuilder m4207 = C2098.m4207(a);
            String trim = this.f8312.trim();
            String a2 = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
            String str = trim.split(a2)[0];
            String a3 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
            m4207.append(str.split(a3)[0]);
            String a4 = Crypt.a(Crypt.xrc("\u001db:NkmN7iOeg\u001e6j\u001bfk\u001ejkOfkIa<OffKc"));
            m4207.append(a4);
            m4207.append(((C1216) App.f3760).m2758());
            String a5 = Crypt.a(Crypt.xrc("\u001b6=\u001d`=L1k\u001cah\u001b`;\u001ca;Oe=\u0019c9M1nIemKe"));
            m4207.append(a5);
            m4207.append(((C1216) App.f3760).m2742());
            ((C1216) interfaceC1837).m2765(m4207.toString());
            C0753.m2046(a + this.f8312.trim().split(a2)[0].split(a3)[0] + a4 + ((C1216) App.f3760).m2758() + a5 + ((C1216) App.f3760).m2742());
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            InterfaceC1837 interfaceC1837 = App.f3760;
            C1867 c1867 = C1867.this;
            ((C1216) interfaceC1837).m2766(c1867.f1186, c1867.m490(2131821206), -256);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public class C1869 implements SwipeRefreshLayout.InterfaceC0246 {
        public C1869() {
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ぁごぐすすぃ, reason: contains not printable characters */
    public class C1870 implements InterfaceC1838 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f8315;

        public C1870(boolean z) {
            this.f8315 = z;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            C1867 c1867;
            if (this.f8315) {
                c1867 = C1867.this;
            } else {
                C1867 c18672 = C1867.this;
                if (c18672.f8271 != null || c18672.f8295.isShown()) {
                    return;
                } else {
                    c1867 = C1867.this;
                }
            }
            c1867.f8271 = c1867.f8281.m3946(Crypt.a(Crypt.xrc("\u001b0lJf=\u001ek;Oj9\u001d4=\u001a6mLfo\u001dbl\u001een\u001939\u001af")));
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            TextView textView;
            int i;
            if (C1867.this.f8271.size() == 0) {
                if (C1867.this.f8291.isShown()) {
                    textView = C1867.this.f8283;
                    i = 0;
                }
                C1867 c1867 = C1867.this;
                C1962 c1962 = new C1962(c1867.m525(), c1867.f8271);
                c1867.f8292 = c1962;
                c1962.f8567 = c1867;
                c1867.f8274.setAdapter(c1962);
            }
            textView = C1867.this.f8283;
            i = 8;
            textView.setVisibility(i);
            C1867 c18672 = C1867.this;
            C1962 c19622 = new C1962(c18672.m525(), c18672.f8271);
            c18672.f8292 = c19622;
            c19622.f8567 = c18672;
            c18672.f8274.setAdapter(c19622);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$いいにぽつ, reason: contains not printable characters */
    public class C1871 implements CompoundButton.OnCheckedChangeListener {
        public C1871() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferences.Editor edit;
            boolean z2;
            if (z) {
                C1867.this.f8288.setVisibility(0);
                C1867.this.f8308.setVisibility(0);
                edit = App.f3762.edit();
                z2 = true;
            } else {
                C1867.this.f8288.setVisibility(8);
                C1867.this.f8308.setVisibility(8);
                edit = App.f3762.edit();
                z2 = false;
            }
            edit.putBoolean(Crypt.a(Crypt.xrc("\u0019b>M`o\u001b6oHk=MdgJchA7=\u001b`o\u001d0>Ha>Nf")), z2).commit();
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ぇぬぎばつ, reason: contains not printable characters */
    public class C1872 implements CompoundButton.OnCheckedChangeListener {
        public C1872() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            View view;
            C1216 c1216;
            String a;
            String str;
            String a2 = Crypt.a(Crypt.xrc("\u001d1lNagIglL3oNdo\u001ea:I0>\u001dajH`lKfo\u001c0"));
            String a3 = Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"));
            if (C0753.m2042()) {
                C1867.this.f8299.setChecked(!z);
                InterfaceC1837 interfaceC1837 = App.f3760;
                view = C1867.this.f1186;
                c1216 = (C1216) interfaceC1837;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
            } else {
                if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                    if (z) {
                        try {
                            str = C1867.this.m3996(((C1216) App.f3760).m2739())[12];
                        } catch (Exception unused) {
                            str = "";
                        }
                        if (str.isEmpty() && App.f3762.getString(Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), "").isEmpty()) {
                            try {
                                InterfaceC1837 interfaceC18372 = App.f3760;
                                if (!Boolean.valueOf(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[2]).booleanValue()) {
                                    InterfaceC1837 interfaceC18373 = App.f3760;
                                    if (!Boolean.valueOf(((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[15]).booleanValue()) {
                                        Intent intent = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                        intent.putExtra(a3, a2);
                                        C1867.this.m492(intent, 17);
                                    }
                                }
                            } catch (Exception unused2) {
                                InterfaceC1837 interfaceC18374 = App.f3760;
                                if (!Boolean.valueOf(((C1216) interfaceC18374).m2744(((C1216) interfaceC18374).m2739())[2]).booleanValue()) {
                                    Intent intent2 = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                    intent2.putExtra(a3, a2);
                                    C1867.this.m492(intent2, 17);
                                }
                            }
                        }
                        C1867.this.f8302.setChecked(false);
                    }
                    C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), z);
                    SharedPreferences sharedPreferences = App.f3762;
                    String a4 = Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"));
                    if (sharedPreferences.getString(a4, "").isEmpty()) {
                        C1867.this.f8277 = false;
                        return;
                    } else {
                        C1867 c1867 = C1867.this;
                        c1867.f8277 = c1867.m3984(App.f3762.getString(a4, "").getBytes());
                        return;
                    }
                }
                C1867.this.f8299.setChecked(!z);
                InterfaceC1837 interfaceC18375 = App.f3760;
                view = C1867.this.f1186;
                c1216 = (C1216) interfaceC18375;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
            }
            c1216.m2766(view, a, -65536);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ぉざぅち〻, reason: contains not printable characters */
    public class C1873 implements CompoundButton.OnCheckedChangeListener {
        public C1873() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SharedPreferences.Editor putBoolean;
            String a = Crypt.a(Crypt.xrc("If;@1kLalL7<J4;J`;H`;\u001bb:\u00190m\u001ddf\u001ef"));
            if (z) {
                C1867 c1867 = C1867.this;
                c1867.f8280.setVisibility(0);
                c1867.f8309.setVisibility(0);
                putBoolean = App.f3762.edit().putBoolean(a, true);
            } else {
                C1867 c18672 = C1867.this;
                c18672.f8280.setVisibility(8);
                c18672.f8309.setVisibility(8);
                putBoolean = App.f3762.edit().putBoolean(a, false);
            }
            putBoolean.commit();
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$おぐぴう〸ず, reason: contains not printable characters */
    public class C1874 implements CompoundButton.OnCheckedChangeListener {
        public C1874() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1867 c1867;
            boolean m3984;
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), z);
            SharedPreferences sharedPreferences = App.f3762;
            String a = Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"));
            if (sharedPreferences.getString(a, "").isEmpty()) {
                c1867 = C1867.this;
                m3984 = false;
            } else {
                c1867 = C1867.this;
                m3984 = c1867.m3984(App.f3762.getString(a, "").getBytes());
            }
            c1867.f8277 = m3984;
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
    public class C1875 extends AdListener {
        public C1875() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            C1867 c1867 = C1867.this;
            if (c1867.f8300 != null) {
                c1867.f8305.setVisibility(0);
            }
            super.onAdLoaded();
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1876 extends RecyclerView.AbstractC0206 {
        public C1876() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
        /* renamed from: 〺つふすそ */
        public void mo760(RecyclerView recyclerView, int i, int i2) {
            InterfaceC1877 interfaceC1877;
            int i3;
            InterfaceC1877 interfaceC18772 = C1867.this.f8310;
            if (interfaceC18772 != null) {
                if (i2 > 0) {
                    interfaceC18772.mo1622(false);
                    interfaceC1877 = C1867.this.f8310;
                    i3 = 2131231103;
                } else {
                    if (i2 > 0) {
                        return;
                    }
                    if (i2 < 0) {
                        interfaceC18772.mo1622(false);
                    }
                    interfaceC1877 = C1867.this.f8310;
                    i3 = 2131231142;
                }
                interfaceC1877.mo1611(i3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0206
        /* renamed from: げつ〴ぬぐ */
        public void mo761(RecyclerView recyclerView, int i) {
            InterfaceC1877 interfaceC1877;
            if (i != 0 || (interfaceC1877 = C1867.this.f8310) == null) {
                return;
            }
            interfaceC1877.mo1622(true);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ざとぅぼこ〺, reason: contains not printable characters */
    public interface InterfaceC1877 {
        /* renamed from: 〳ぜぞぜべっ */
        void mo1611(int i);

        /* renamed from: 〺つふすそ */
        void mo1612();

        /* renamed from: げつ〴ぬぐ */
        void mo1618();

        /* renamed from: ざとぅぼこ〺 */
        void mo1622(boolean z);
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$づざかべべ, reason: contains not printable characters */
    public class ServiceConnectionC1878 implements ServiceConnection {
        public ServiceConnectionC1878() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1867.this.f8297 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1867.this.f8297 = null;
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$てぜきぽく, reason: contains not printable characters */
    public class C1879 implements CompoundButton.OnCheckedChangeListener {
        public C1879() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            View view;
            C1216 c1216;
            String a;
            Intent intent;
            if (C0753.m2042()) {
                C1867.this.f8302.setChecked(!z);
                InterfaceC1837 interfaceC1837 = App.f3760;
                view = C1867.this.f1186;
                c1216 = (C1216) interfaceC1837;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
            } else {
                if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                    String a2 = Crypt.a(Crypt.xrc("Hef\u001cj<Jc>L3f\u001eblJ7lA1>@dfK`;\u001akf\u001d6"));
                    String a3 = Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"));
                    if (z) {
                        C2098.m4184(App.f3762, a3, true);
                        boolean isEmpty = C1867.this.m3996(((C1216) App.f3760).m2739())[1].isEmpty();
                        String a4 = Crypt.a(Crypt.xrc("Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f"));
                        String a5 = Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"));
                        if (isEmpty && ((C1216) App.f3760).m2753().isEmpty()) {
                            try {
                                InterfaceC1837 interfaceC18372 = App.f3760;
                                if (!Boolean.valueOf(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[2]).booleanValue()) {
                                    InterfaceC1837 interfaceC18373 = App.f3760;
                                    if (!Boolean.valueOf(((C1216) interfaceC18373).m2744(((C1216) interfaceC18373).m2739())[15]).booleanValue()) {
                                        Intent intent2 = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                        intent2.putExtra(a5, a4);
                                        C1867.this.m492(intent2, 18);
                                    }
                                }
                            } catch (Exception unused) {
                                InterfaceC1837 interfaceC18374 = App.f3760;
                                if (!Boolean.valueOf(((C1216) interfaceC18374).m2744(((C1216) interfaceC18374).m2739())[2]).booleanValue()) {
                                    intent = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                    intent.putExtra(a5, a4);
                                    C1867.this.m492(intent, 18);
                                }
                            }
                            C1867.this.f8299.setChecked(false);
                        } else {
                            if (((C1216) App.f3760).m2753().isEmpty() && !App.f3762.getBoolean(a2, false)) {
                                try {
                                    InterfaceC1837 interfaceC18375 = App.f3760;
                                    if (!Boolean.valueOf(((C1216) interfaceC18375).m2744(((C1216) interfaceC18375).m2739())[2]).booleanValue()) {
                                        InterfaceC1837 interfaceC18376 = App.f3760;
                                        if (!Boolean.valueOf(((C1216) interfaceC18376).m2744(((C1216) interfaceC18376).m2739())[15]).booleanValue() && C1867.this.m3996(((C1216) App.f3760).m2739())[1].isEmpty()) {
                                            Intent intent3 = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                            intent3.putExtra(a5, a4);
                                            C1867.this.m492(intent3, 18);
                                        }
                                    }
                                } catch (Exception unused2) {
                                    InterfaceC1837 interfaceC18377 = App.f3760;
                                    if (!Boolean.valueOf(((C1216) interfaceC18377).m2744(((C1216) interfaceC18377).m2739())[2]).booleanValue() && C1867.this.m3996(((C1216) App.f3760).m2739())[1].isEmpty()) {
                                        intent = new Intent(C1867.this.m525(), (Class<?>) RequestBlock.class);
                                        intent.putExtra(a5, a4);
                                        C1867.this.m492(intent, 18);
                                    }
                                }
                            }
                            C1867.this.f8299.setChecked(false);
                        }
                    } else {
                        C2098.m4184(App.f3762, a3, false);
                        C2098.m4182(App.f3762, a2, false);
                    }
                    SharedPreferences sharedPreferences = App.f3762;
                    String a6 = Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"));
                    if (sharedPreferences.getString(a6, "").isEmpty()) {
                        C1867.this.f8277 = false;
                        return;
                    } else {
                        C1867 c1867 = C1867.this;
                        c1867.f8277 = c1867.m3984(App.f3762.getString(a6, "").getBytes());
                        return;
                    }
                }
                C1867.this.f8302.setChecked(!z);
                InterfaceC1837 interfaceC18378 = App.f3760;
                view = C1867.this.f1186;
                c1216 = (C1216) interfaceC18378;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
            }
            c1216.m2766(view, a, -65536);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$なぎぱいぢぎ, reason: contains not printable characters */
    public class C1880 implements InterfaceC1838 {
        public C1880() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            C1867.this.m3995(4, 2131821331, 100);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$のぷのちつ, reason: contains not printable characters */
    public class C1881 implements CompoundButton.OnCheckedChangeListener {
        public C1881(C1867 c1867) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$びぐびあび, reason: contains not printable characters */
    public class ViewOnClickListenerC1882 implements View.OnClickListener {
        public ViewOnClickListenerC1882() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor edit;
            String a;
            C1867 c1867 = C1867.this;
            c1867.getClass();
            C2098.m4201(c1867.f8298, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019b>M`o\u001b6oHk=MdgJchA7=\u001b`o\u001d0>Ha>Nf")));
            C2098.m4201(c1867.f8289, App.f3762.edit(), Crypt.a(Crypt.xrc("Mef\u001bg;He>NbnNglI0mNe<M`g\u0019k>@1;\u001c`")));
            C2098.m4201(c1867.f8302, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")));
            C2098.m4201(c1867.f8284, App.f3762.edit(), Crypt.a(Crypt.xrc("If;@1kLalL7<J4;J`;H`;\u001bb:\u00190m\u001ddf\u001ef")));
            C2098.m4201(c1867.f8306, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")));
            C2098.m4191(c1867.f8294, App.f3762.edit(), Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")));
            C2098.m4201(c1867.f8286, App.f3762.edit(), Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")));
            C2098.m4201(c1867.f8299, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")));
            if (((C1216) App.f3760).m2739().isEmpty()) {
                edit = App.f3762.edit();
                a = Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6"));
            } else {
                edit = App.f3762.edit();
                a = Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"));
            }
            edit.putString(a, c1867.f8290.getText().toString().trim()).commit();
            if (C0753.m2042()) {
                c1867.f8296.setText(2131820670);
                c1867.m3997();
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("K1kIgi\u001aj>J3:Mg9\u001eeo\u001acgAg:HcjMdo\u001be")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u0019doA4:\u001e3:\u001c1jAf9Mf>A0=Jd>Ne>\u001a3;N1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001dgk@bh\u001dd;Abh\u00194hLjiK4=Kb<A3:LfjMd")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("I`g\u001cdgA4lOal\u001e4:O6fHf9\u001e3>\u001c1o\u001ck;\u001a1")), 0);
                C2098.m4195(App.f3762, Crypt.a(Crypt.xrc("\u001b1=Nal@bfA`:NfiK0f\u001c4hOgl\u001eg=@fgOe")), 0);
                return;
            }
            if (App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001d1>\u001cc>@dn\u001e1mMclMbl\u001ad;H3j\u0019d>\u001bbhMf")), false) && c1867.f8290.getText().toString().trim().isEmpty()) {
                C2098.m4197(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"))), Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g;LdgKdi\u001agkL4iK6:\u001d`9\u001d7:\u001bkkAkiA6f\u001a1>AcnL3;\u001dehLbo@1fHd<\u0019fo\u001eki\u001dciOd9")), C1867.f8270);
                ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("\u001c6<H0kKel\u001c`=N0=\u001e6=O4=\u001dk<\u001e4h\u001edgK`n\u001ea:LcgAch\u0019a;\u001e6fM4:Nc9\u001c3<\u001b`n\u0019c9L")), -65536);
                return;
            }
            if (c1867.f8296.getText().equals(c1867.m490(2131820670)) || c1867.f8296.getText().equals(c1867.m490(2131820669))) {
                ((C1216) App.f3760).m2766(c1867.f1186, Crypt.a(Crypt.xrc("@eg\u001bc:N3n\u001ed9NkgJkgIfi\u0019cg\u001dd>Hbk\u001dj;\u001d1>\u0019jo\u001c7n\u001dbl\u00196iK1;I4f\u001efm\u001dfn\u001be;A")), -65536);
                return;
            }
            try {
                if (c1867.f8304 != null) {
                    C0765.m2062(c1867.m525()).m2065(c1867.m525(), c1867.f8304);
                }
            } catch (Exception unused) {
            }
            if (App.f3762.getString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "").isEmpty()) {
                c1867.f8277 = false;
            } else {
                c1867.f8277 = c1867.m3984(App.f3762.getString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "").getBytes());
            }
            if (!c1867.f8277) {
                ((C1216) App.f3760).m2790(c1867.m490(2131821257), -65536);
                return;
            }
            synchronized (C0753.class) {
                C0753.f4875.clear();
                C0753.m2051();
            }
            InterfaceC1877 interfaceC1877 = c1867.f8310;
            if (interfaceC1877 != null) {
                interfaceC1877.mo1618();
            }
            c1867.f8296.setText(2131820669);
            c1867.f8285.loadAd(c1867.f8278);
            c1867.m4000();
            C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk")), true);
            boolean m2701 = ((C1216) App.f3760).m2701(c1867.m525(), SSHTunnelService.class);
            String a2 = Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"));
            if (m2701) {
                Intent intent = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                intent.setAction(a2);
                App.f3759.startService(intent);
                C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k")), false);
                C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk")), false);
            }
            if (((C1216) App.f3760).m2701(c1867.m525(), Tun2SocksService.class)) {
                Intent intent2 = new Intent(App.f3759, (Class<?>) Tun2SocksService.class);
                intent2.setAction(a2);
                c1867.m525().startService(intent2);
            }
            if (((C1216) App.f3760).m2701(App.f3759, PsiphonVPNService.class)) {
                Intent intent3 = new Intent(App.f3759, (Class<?>) PsiphonVPNService.class);
                intent3.setAction(a2);
                App.f3759.startService(intent3);
            }
            if (((C1216) App.f3760).m2701(App.f3759, V2RayVpnService.class)) {
                Intent intent4 = new Intent(App.f3759, (Class<?>) V2RayVpnService.class);
                intent4.setAction(a2);
                App.f3759.startService(intent4);
            }
            Boolean bool = Boolean.FALSE;
            try {
                bool = Boolean.valueOf(c1867.m3996(((C1216) App.f3760).m2739())[9]);
            } catch (IndexOutOfBoundsException unused2) {
            }
            String m2753 = c1867.m3996(((C1216) App.f3760).m2739())[1].isEmpty() ? ((C1216) App.f3760).m2753() : c1867.m3996(((C1216) App.f3760).m2739())[1];
            if (bool.booleanValue()) {
                m2753 = ((C1216) App.f3760).m2753().isEmpty() ? c1867.m3996(((C1216) App.f3760).m2739())[1] : ((C1216) App.f3760).m2753();
            }
            if (!m2753.isEmpty() && c1867.f8289.isChecked()) {
                if (((C1216) App.f3760).m2723()) {
                    new AsyncTaskC1840(new C1894(c1867, m2753)).execute(new Void[0]);
                } else {
                    ((C1216) App.f3760).m2766(c1867.f1186, c1867.m490(2131821430), -65536);
                }
            }
            Intent prepare = VpnService.prepare(c1867.m525());
            if (prepare == null) {
                c1867.m525();
                c1867.mo532(70, -1, null);
            } else {
                C0753.m2032(Crypt.a(Crypt.xrc("\u0019`mJbmAjl\u001ea;N`oKfiI4nHklAjo@7k@ckKck\u001aciMe=\u001eao\u001a4=\u00197:\u001e`:AgnI19KfhO")), "", 2131821320, ConnectionStatus.f3664);
                try {
                    c1867.m492(prepare, 70);
                } catch (ActivityNotFoundException unused3) {
                    C0753.m2027(2131821057);
                }
            }
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$へぬ〴づぞ, reason: contains not printable characters */
    public class C1883 implements CompoundButton.OnCheckedChangeListener {
        public C1883(C1867 c1867) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")), z);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ぺぁあねじ, reason: contains not printable characters */
    public class C1884 implements InterfaceC1838 {
        public C1884() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            C1867 c1867;
            ArrayList arrayList;
            SharedPreferences sharedPreferences = App.f3762;
            String a = Crypt.a(Crypt.xrc("@fhM7jNk9\u001d4i\u0019a>Nj9M`nOk:\u001efoK`k@`"));
            int i = sharedPreferences.getInt(a, 0);
            String a2 = Crypt.a(Crypt.xrc("\u001b0lJf=\u001ek;Oj9\u001d4=\u001a6mLfo\u001dbl\u001een\u001939\u001af"));
            String a3 = Crypt.a(Crypt.xrc("\u001d1<@ki@0h\u001d1oLe<H4m\u001ek;\u001c3nHbjH7hOb"));
            if (i == 0) {
                C1867 c18672 = C1867.this;
                c18672.f8271 = c18672.f8281.m3946(App.f3762.getString(a3, a2));
                return;
            }
            int i2 = 5;
            int i3 = 3;
            if (App.f3762.getInt(a, 0) == 1) {
                c1867 = C1867.this;
                C1831 c1831 = c1867.f8281;
                String string = App.f3762.getString(Crypt.a(Crypt.xrc("\u001eanOk>\u0019e=\u001e6=O6mNcnL39\u001b09Kgh\u001a0l@j")), Crypt.a(Crypt.xrc("Igl\u001ea;H1iOagA0=N7jJc9I0lH69\u0019boN1")));
                String string2 = App.f3762.getString(a3, a2);
                c1831.getClass();
                arrayList = new ArrayList();
                SQLiteDatabase writableDatabase = c1831.getWritableDatabase();
                Cursor query = writableDatabase.query(Crypt.a(Crypt.xrc("L1h\u001ejiO6g\u001ea<\u001ckmOb<\u0019aoO7j\u001djnH6m\u001c`")), null, Crypt.a(Crypt.xrc("L4nKb;Hj=\u001aj;\u001ck=Aa>\u001cb9Jb9HgnO6jMf")), new String[]{string}, null, null, C2098.m4205(Crypt.a(Crypt.xrc("\u001af<\u001bfgAe:I39\u001ba<J1fHdkKj<\u001b0hOj;Lg")), string2));
                if (query.moveToFirst()) {
                    while (true) {
                        arrayList.add(new VPNServer(query.getString(1), query.getString(2), query.getString(3), query.getString(4), query.getString(i2), query.getString(6), query.getString(7), query.getString(8), query.getString(9), query.getString(10), query.getString(11), query.getString(12), query.getString(13), query.getString(14), query.getString(15), query.getString(16)));
                        if (!query.moveToNext()) {
                            break;
                        } else {
                            i2 = 5;
                        }
                    }
                }
                query.close();
                writableDatabase.close();
            } else {
                c1867 = C1867.this;
                C1831 c18312 = c1867.f8281;
                String string3 = App.f3762.getString(Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj")), Crypt.a(Crypt.xrc("Kf=N6;\u001cf;\u001cemKfj\u001b`>Aa<\u001cb;\u001efo\u001cfo\u001bd")));
                String string4 = App.f3762.getString(a3, a2);
                c18312.getClass();
                arrayList = new ArrayList();
                SQLiteDatabase writableDatabase2 = c18312.getWritableDatabase();
                Cursor rawQuery = writableDatabase2.rawQuery("SELECT * FROM vpn_server WHERE proto = '" + string3 + "' ORDER BY " + Crypt.a(Crypt.xrc("\u001e6nJ6iIg;\u001cdmK0i\u001ben\u001ej:\u001dd<LjgHc>\u001a7")) + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + string4, null);
                if (rawQuery.moveToFirst()) {
                    int i4 = 5;
                    while (true) {
                        arrayList.add(new VPNServer(rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(i3), rawQuery.getString(4), rawQuery.getString(i4), rawQuery.getString(6), rawQuery.getString(7), rawQuery.getString(8), rawQuery.getString(9), rawQuery.getString(10), rawQuery.getString(11), rawQuery.getString(12), rawQuery.getString(13), rawQuery.getString(14), rawQuery.getString(15), rawQuery.getString(16)));
                        if (!rawQuery.moveToNext()) {
                            break;
                        }
                        i4 = 5;
                        i3 = 3;
                    }
                }
                rawQuery.close();
                writableDatabase2.close();
            }
            c1867.f8271 = arrayList;
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            C1867 c1867 = C1867.this;
            C1962 c1962 = new C1962(c1867.m525(), c1867.f8271);
            c1867.f8292 = c1962;
            c1962.f8567 = c1867;
            c1867.f8274.setAdapter(c1962);
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〳ぜぞぜべっ$ぺふねづ〺, reason: contains not printable characters */
    public class C1885 implements CompoundButton.OnCheckedChangeListener {
        public C1885() {
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
                    C1867 c1867 = C1867.this;
                    ((C1216) interfaceC1837).m2766(c1867.f1186, c1867.m490(2131821430), -65536);
                    compoundButton.setChecked(false);
                }
            }
            putBoolean = App.f3762.edit().putBoolean(a, false);
            putBoolean.commit();
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public static boolean m3981(C1867 c1867, String str) {
        BufferedReader bufferedReader;
        c1867.f8287.m1709();
        try {
            bufferedReader = new BufferedReader(new FileReader(App.f3759.getCacheDir().getPath().concat(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"))).concat(str)));
        } catch (IOException unused) {
            if (str.equals(Crypt.a(Crypt.xrc("\u0019cfJgnLf9Me9Lkn\u001c7mOd=I7nLdf\u001a4lAj")))) {
                c1867.m3995(0, 2131820742, 100);
            } else {
                c1867.m3995(3, 2131821333, 100);
            }
            bufferedReader = null;
        }
        if (bufferedReader == null) {
            return false;
        }
        try {
            SQLiteDatabase writableDatabase = c1867.f8281.getWritableDatabase();
            writableDatabase.delete(Crypt.a(Crypt.xrc("L1h\u001ejiO6g\u001ea<\u001ckmOb<\u0019aoO7j\u001djnH6m\u001c`")), null, null);
            writableDatabase.close();
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (i == 100) {
                    i = 0;
                }
                if (c1867.m525() != null) {
                    c1867.m525().runOnUiThread(new RunnableC1918(c1867, i));
                }
                if (i >= 2) {
                    c1867.f8281.m3944(readLine);
                }
                i++;
            }
            int i2 = c1867.f8282;
            if (i2 < 100) {
                while (i2 <= 100) {
                    if (c1867.m525() != null) {
                        c1867.m525().runOnUiThread(new RunnableC1920(c1867, i2));
                    }
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException unused2) {
                    }
                    i2++;
                }
            }
            if (c1867.m525() != null) {
                c1867.m525().runOnUiThread(new RunnableC1925(c1867));
            }
            return true;
        } catch (Exception unused3) {
            if (c1867.m525() == null) {
                return false;
            }
            c1867.m525().runOnUiThread(new RunnableC1895(c1867, str));
            return false;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f8288.setProgress(i);
        App.f3762.edit().putInt(Crypt.a(Crypt.xrc("H4=\u001cd>Je:@b:Ab:O`9\u001bdm\u001dgf\u001a4;Ag=A0")), i + 1).commit();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public void m3982() {
        if (m525() == null) {
            return;
        }
        C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4")), false);
        this.f8273.setVisibility(0);
        this.f8291.setVisibility(8);
        this.f8283.setVisibility(8);
        this.f8295.setVisibility(8);
        InterfaceC1877 interfaceC1877 = this.f8310;
        if (interfaceC1877 != null) {
            interfaceC1877.mo1612();
            this.f8310.mo1622(true);
        }
    }

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public void m3983() {
        SharedPreferences.Editor edit;
        String trim;
        String a;
        if (m525() != null) {
            if (((C1216) App.f3760).m2739().isEmpty()) {
                edit = App.f3762.edit();
                trim = this.f8290.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6"));
            } else {
                edit = App.f3762.edit();
                trim = this.f8290.getText().toString().trim();
                a = Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"));
            }
            edit.putString(a, trim).apply();
            C2098.m4201(this.f8298, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019b>M`o\u001b6oHk=MdgJchA7=\u001b`o\u001d0>Ha>Nf")));
            C2098.m4201(this.f8289, App.f3762.edit(), Crypt.a(Crypt.xrc("Mef\u001bg;He>NbnNglI0mNe<M`g\u0019k>@1;\u001c`")));
            C2098.m4201(this.f8302, App.f3762.edit(), Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")));
            C2098.m4201(this.f8284, App.f3762.edit(), Crypt.a(Crypt.xrc("If;@1kLalL7<J4;J`;H`;\u001bb:\u00190m\u001ddf\u001ef")));
            C2098.m4201(this.f8306, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc")));
            C2098.m4191(this.f8294, App.f3762.edit(), Crypt.a(Crypt.xrc("Lai\u001b7lJ79\u0019b=O3iJjhO7l\u001beo@`lA`gKj")));
            C2098.m4201(this.f8286, App.f3762.edit(), Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")));
            C2098.m4201(this.f8299, App.f3762.edit(), Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:2|3|(3:5|(1:7)(1:126)|8)(2:127|(2:129|(3:131|(1:133)(1:135)|134)(1:136)))|9|(1:11)|12|13|(6:22|(2:30|31)|24|25|26|27)|34|(6:39|(2:42|43)|41|25|26|27)|46|47|48|49|(1:51)(1:123)|52|(3:54|(1:56)(1:58)|57)|59|(4:64|(4:68|(2:71|72)|70|25)|26|27)|75|(4:79|80|(4:82|(1:84)|85|(1:92))(2:93|(1:95))|91)|96|(1:100)|101|102|(7:104|105|(1:107)(1:116)|108|109|(2:112|113)|111)|117|(3:119|(1:121)|122)|26|27) */
    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3984(byte[] r13) {
        /*
            Method dump skipped, instructions count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1867.m3984(byte[]):boolean");
    }

    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public void m3985() {
        new AsyncTaskC1839(new C1884(), m525()).execute(new Void[0]);
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public final void m3986() {
        this.f8290.setEnabled(true);
        this.f8302.setEnabled(true);
        this.f8284.setEnabled(true);
        this.f8306.setEnabled(true);
        this.f8294.setEnabled(true);
        this.f8286.setEnabled(true);
        this.f8299.setEnabled(true);
        this.f8298.setEnabled(true);
        this.f8288.setEnabled(true);
        if (!Boolean.valueOf(m3996(((C1216) App.f3760).m2739())[2]).booleanValue()) {
            if (C0753.m2042()) {
                m4000();
                return;
            } else {
                this.f8288.setEnabled(true);
                return;
            }
        }
        try {
            if (m3996(((C1216) App.f3760).m2739())[10].isEmpty()) {
                return;
            }
            this.f8288.setEnabled(false);
            this.f8288.setProgress(0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public void m3987() {
        if (m525() == null) {
            return;
        }
        C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001b0n\u001ddl\u001bgl\u001aen\u001ef:Kj=McgJ7nIjiL1o\u001e4")), true);
        this.f8273.setVisibility(8);
        this.f8291.setVisibility(0);
        InterfaceC1877 interfaceC1877 = this.f8310;
        if (interfaceC1877 != null) {
            interfaceC1877.mo1612();
            this.f8310.mo1622(true);
            if (this.f8295.isShown()) {
                this.f8310.mo1622(false);
            }
        }
        if (this.f8271 == null) {
            this.f8271 = this.f8281.m3946(Crypt.a(Crypt.xrc("\u001b0lJf=\u001ek;Oj9\u001d4=\u001a6mLfo\u001dbl\u001een\u001939\u001af")));
        }
        if (this.f8271.size() != 0) {
            m3991(false);
            return;
        }
        if (this.f8291.isShown()) {
            this.f8283.setVisibility(0);
        } else {
            this.f8283.setVisibility(8);
        }
        if (this.f8295.isShown()) {
            this.f8283.setVisibility(8);
            InterfaceC1877 interfaceC18772 = this.f8310;
            if (interfaceC18772 != null) {
                interfaceC18772.mo1622(false);
            }
        }
    }

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public final void m3988(int i) {
        this.f8280.setVisibility(i);
        this.f8309.setVisibility(i);
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public void m3989() {
        if (m525() != null) {
            this.f8299.setChecked(true);
        }
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぇ〳〲〺すっ */
    public void mo1583(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぇとしたべど */
    public void mo487() {
        this.f1196 = true;
        this.f8310 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぉひのべい */
    public void mo493(Context context) {
        super.mo493(context);
        if (context instanceof InterfaceC1877) {
            this.f8310 = (InterfaceC1877) context;
            return;
        }
        throw new RuntimeException(context.toString() + Crypt.a(Crypt.xrc("N4<\u001ab=\u001b4hJjoA3lI7i\u001ef;\u0019cfNe<M4lJ6oL7m\u001ebk\u001e0nIdgMagLafJcj\u001d3k\u0019j9\u001b0jI3mI`>Iff\u0019kkN1;Lfn\u001c0nJ4f@j;LejA6h")));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: おかぷせ〱 */
    public void mo494() {
        try {
            m525().unbindService(this.f8307);
        } catch (Exception unused) {
        }
        AdView adView = this.f8300;
        if (adView != null) {
            adView.destroy();
        }
        C0753.m2040(this);
        this.f1196 = true;
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public void m3990() {
        if (m525() != null) {
            this.f8299.setChecked(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131492942, viewGroup, false);
        this.f8278 = new AdRequest.Builder().addTestDevice(Crypt.a(Crypt.xrc("IdnO0fHcoMdj\u001d6nMj<I0=@bjIdh\u001d4:KajMj;A4h\u001bejLk:Ob>\u001b1m\u0019kf\u001a7nN0iO4<Nfk\u00193iO1oOam\u001e0gJ7;I`:@7;@d:K4kO1i"))).addTestDevice(Crypt.a(Crypt.xrc("H6nLa:Na;\u0019k9\u001abkH`mI4iKal@j9Jd9N4oA`9Mch\u001eji@0<\u001bbm\u001ec<\u0019c;M6o\u001d49\u001bfjH0f@3o\u001cg;\u0019a>@7:Ie9A4;Oek\u001a4f\u001ce;Ig;"))).addTestDevice(Crypt.a(Crypt.xrc("NciA0k\u001b0n\u001cefLk>\u001c6mK49@7fK4gI3j\u001d1:KfjO4o\u001e79J1lL1>\u001ak9JgkIb:\u001ag;Lfh\u001bji\u00190<M3:IdiL1>\u00194=\u001b1k\u001a0l\u001dglIcnN3;"))).build();
        this.f8305 = (RelativeLayout) inflate.findViewById(2131296346);
        AdView adView = new AdView(m525());
        this.f8300 = adView;
        adView.setAdSize(AdSize.BANNER);
        this.f8300.setAdUnitId(Crypt.a(Crypt.xrc("@g>\u001eaj\u001aknAgo\u001bjo\u001afg@dfHbiJa:\u001e4nLbi\u001dd9J4<\u0019k;N`mI6f\u001b79AchK`j@f:Iko\u001e1:L4<\u001djiMaoH1=@dl\u001db;\u001ajiO1;I`kOem")));
        this.f8300.setAdListener(new C1875());
        this.f8305.setVisibility(8);
        this.f8305.addView(this.f8300);
        this.f8300.loadAd(this.f8278);
        InterstitialAd interstitialAd = new InterstitialAd(App.f3759);
        this.f8285 = interstitialAd;
        interstitialAd.setAdUnitId(Crypt.a(Crypt.xrc("@g>\u001eaj\u001aknAgo\u001bjo\u001afg@dfHbiJa:\u001e4nLb:HfmMehO4<A7=\u001b4iLcgL4l\u001e7nK6nMak\u001dk<J4h\u001d0i\u001b0l\u0019g9\u0019g:Le=\u001cclIgj\u001bfmI0<")));
        this.f8291 = (SwipeRefreshLayout) inflate.findViewById(2131296846);
        this.f8274 = (RecyclerView) inflate.findViewById(2131296753);
        this.f8283 = (TextView) inflate.findViewById(2131296947);
        this.f8295 = (LinearLayout) inflate.findViewById(2131296341);
        this.f8287 = (FreshDownloadView) inflate.findViewById(2131296710);
        this.f8275 = (TextView) inflate.findViewById(2131296443);
        this.f8293 = (RelativeLayout) inflate.findViewById(2131296392);
        this.f8276 = (TextView) inflate.findViewById(2131296877);
        this.f8273 = (ScrollView) inflate.findViewById(2131296720);
        this.f8303 = (TextInputLayout) inflate.findViewById(2131296621);
        this.f8290 = (EditText) inflate.findViewById(2131296888);
        this.f8302 = (CheckBox) inflate.findViewById(2131296940);
        this.f8284 = (CheckBox) inflate.findViewById(2131296808);
        this.f8306 = (CheckBox) inflate.findViewById(2131296369);
        this.f8294 = (CheckBox) inflate.findViewById(2131296434);
        this.f8286 = (CheckBox) inflate.findViewById(2131296514);
        this.f8299 = (CheckBox) inflate.findViewById(2131296430);
        this.f8298 = (CheckBox) inflate.findViewById(2131296370);
        CheckBox checkBox = (CheckBox) inflate.findViewById(2131296768);
        this.f8289 = checkBox;
        checkBox.setEnabled(false);
        this.f8309 = (TextView) inflate.findViewById(2131296802);
        this.f8308 = (TextView) inflate.findViewById(2131296887);
        this.f8280 = (TextView) inflate.findViewById(2131296916);
        this.f8296 = (Button) inflate.findViewById(2131296385);
        this.f8288 = (SeekBar) inflate.findViewById(2131296797);
        this.f8281 = new C1831(App.f3759);
        C1962 c1962 = new C1962(m525(), this.f8271);
        this.f8292 = c1962;
        c1962.f8567 = this;
        this.f8274.setLayoutManager(new GridLayoutManager(m525(), 2));
        this.f8274.m697(new C1961(2, Math.round(TypedValue.applyDimension(1, 5, m504().getDisplayMetrics())), false));
        this.f8274.setItemAnimator(new C1412());
        this.f8274.setAdapter(this.f8292);
        this.f8287.m1709();
        m504().getStringArray(2130903056);
        this.f8288.setMax(3);
        this.f8288.setProgress(App.f3762.getInt(Crypt.a(Crypt.xrc("H4=\u001cd>Je:@b:Ab:O`9\u001bdm\u001dgf\u001a4;Ag=A0")), 1) - 1);
        this.f8288.setOnSeekBarChangeListener(this);
        this.f8296.setOnClickListener(new ViewOnClickListenerC1882());
        this.f8303.setVisibility(8);
        mo511();
        return inflate;
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public final void m3991(boolean z) {
        new AsyncTaskC1839(new C1870(z), m525()).execute(new Void[0]);
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public void m3992() {
        if (m525() == null) {
            return;
        }
        this.f8290.setText("");
        this.f8293.setVisibility(8);
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "");
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6")), "");
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db")), "");
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6")), "");
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e")), "").commit();
        m3986();
        this.f8303.setVisibility(0);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("O1jMk<\u001ag>\u001b`j@dl@g>\u001d7<M6j\u001e3>HjhO4kM3jId>\u001e`i@0g\u001cemOamA7h\u001a1g@kl\u001e4g\u001c")), false);
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public void m3993() {
        if (m525() != null) {
            this.f8302.setChecked(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        Bundle bundle2 = this.f1176;
        if (bundle2 != null) {
            bundle2.getString(Crypt.a(Crypt.xrc("Nbn\u0019dl\u001e3f\u001cgjJgfHciAchKg=J49K`:@3")));
            this.f1176.getString(Crypt.a(Crypt.xrc("N3<O3>Ng;J09M7mOjiN4jObnNdfA0fMf")));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a5, code lost:
    
        if (team.dev.epro.apkcustom.App.f3762.getString(r6, "").isEmpty() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0399, code lost:
    
        if (team.dev.epro.apkcustom.App.f3762.getBoolean(xyz.easypro.ecrypt.utils.Crypt.a(xyz.easypro.ecrypt.utils.Crypt.xrc("\u001d1>\u001cc>@dn\u001e1mMclMbl\u001ad;H3j\u0019d>\u001bbhMf")), false) != false) goto L73;
     */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: ち〴みぎ〻び */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo511() {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1867.mo511():void");
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public void m3994(String str) {
        FileInputStream fileInputStream;
        long length;
        if (m525() == null) {
            InterfaceC1837 interfaceC1837 = App.f3760;
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001b6h\u001a7k\u001can@3<J39O3;\u001bkgHb=L4:Hkk\u001dc<\u00196k\u001a`:OcmO`;\u001a7lA7lO7=\u001a`;Mbn\u001acl\u001d")));
            m4207.append(App.f3759.getString(2131820810));
            ((C1216) interfaceC1837).m2790(m4207.toString(), -65536);
            return;
        }
        this.f8290.setText("");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6")), "");
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e")), "").apply();
        File file = new File(str);
        try {
            fileInputStream = new FileInputStream(file);
            length = file.length();
        } catch (IOException unused) {
            ((C1216) App.f3760).m2790(m490(2131820810), -65536);
        }
        if (length > 2097152) {
            throw new IOException(Crypt.a(Crypt.xrc("Nel\u001969\u001ab;Aci@boLcjI6f\u001aajI4mJ`f\u001cc=\u001bgn\u001e3kIdlLfl\u001e6;\u0019kfN1:\u001a6;\u00197=\u001dbfNbm\u001eeoNf:NcgMk=\u001d4:HgmLejJakH39Ndg")));
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = fileInputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            } else {
                i2 += read;
            }
        }
        fileInputStream.close();
        if (!((C1216) App.f3760).m2800(bArr).isEmpty()) {
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), new String(bArr, Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")))).commit();
        }
        this.f8277 = m3984(bArr);
        this.f8303.setVisibility(0);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("O1jMk<\u001ag>\u001b`j@dl@g>\u001d7<M6j\u001e3>HjhO4kM3jId>\u001e`i@0g\u001cemOamA7h\u001a1g@kl\u001e4g\u001c")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Oj:Oe=Aal\u001bfjAbj\u001eao\u001cg;AboJb>K1f@0i@a;AkkKj:\u001e0j\u00190mJd:KafKfi\u0019giNc<L")), true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ておぞぞはね */
    public void mo512() {
        m3983();
        AdView adView = this.f8300;
        if (adView != null) {
            adView.pause();
        }
        this.f1196 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        if (r12 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01ce, code lost:
    
        r12.mo1622(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01cc, code lost:
    
        if (r12 != null) goto L23;
     */
    /* renamed from: のかまじえ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3995(int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p119.C1867.m3995(int, int, int):void");
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public final String[] m3996(String str) {
        try {
            if (str.trim().isEmpty()) {
                return C1842.f8212;
            }
            File file = new File(str);
            boolean exists = file.exists();
            String a = Crypt.a(Crypt.xrc("O1jMk<\u001ag>\u001b`j@dl@g>\u001d7<M6j\u001e3>HjhO4kM3jId>\u001e`i@0g\u001cemOamA7h\u001a1g@kl\u001e4g\u001c"));
            String a2 = Crypt.a(Crypt.xrc("H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e"));
            String a3 = Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6"));
            String a4 = Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"));
            String a5 = Crypt.a(Crypt.xrc("H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6"));
            String a6 = Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"));
            String a7 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
            String a8 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
            if (!exists) {
                C1687.m3697(f8270, a8 + new SimpleDateFormat(a7, Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019goK1l\u001cdf\u001d`=Ag<\u001bglL6=\u001d`oLc9\u0019bj@4h\u001aj9Ig>\u001a3=\u0019cfO3m\u001c`l\u001efo\u001e4:Lak@jkM`kOjjHgl\u001ec:A`oM`g\u001c7kK1f\u001bdmAjn\u001c`nHe")));
                this.f8290.setText("");
                this.f8293.setVisibility(8);
                App.f3762.edit().putString(a6, "").commit();
                App.f3762.edit().putString(a5, "").commit();
                App.f3762.edit().putString(a4, "").commit();
                App.f3762.edit().putString(a3, "").commit();
                App.f3762.edit().putString(a2, "").commit();
                this.f8303.setVisibility(0);
                App.f3762.edit().putBoolean(a, false).apply();
                ((C1216) App.f3760).m2794();
                return C1842.f8212;
            }
            String m2789 = ((C1216) App.f3760).m2789(file);
            if (m2789.isEmpty()) {
                C1687.m3697(f8270, a8 + new SimpleDateFormat(a7, Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019goK1l\u001cdf\u001d`=Ag<\u001bglL6=\u001d`oLc9\u0019bj@4h\u001a1:A4fM6iHkk\u001akhJ1f\u0019amLj>Le>@cl\u001ee<K69@7hAc>Leo\u001dbfJ7n\u001a7lI6jOdm@0m\u001d1")));
                this.f8290.setText("");
                this.f8293.setVisibility(8);
                App.f3762.edit().putString(a6, "").commit();
                App.f3762.edit().putString(a5, "").commit();
                App.f3762.edit().putString(a4, "").commit();
                App.f3762.edit().putString(a3, "").commit();
                App.f3762.edit().putString(a2, "").commit();
                this.f8303.setVisibility(0);
                App.f3762.edit().putBoolean(a, false).apply();
                return C1842.f8212;
            }
            if (m2789.contains(Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok")))) {
                return m2789.split("\\[splitConfig\\]");
            }
            C1687.m3697(f8270, a8 + new SimpleDateFormat(a7, Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019goK1l\u001cdf\u001d`=Ag<\u001bglL6=\u001d`oLc9\u0019bj@4h\u001aff\u001b3jIdm\u001eg<Oe:M`gJb;M3;\u001d0oKbmIkm@0jAe<AdmK`gOcoJeoKglJ1mL7l@0=Ie")));
            this.f8290.setText("");
            this.f8293.setVisibility(8);
            App.f3762.edit().putString(a6, "").commit();
            App.f3762.edit().putString(a5, "").commit();
            App.f3762.edit().putString(a4, "").commit();
            App.f3762.edit().putString(a3, "").commit();
            App.f3762.edit().putString(a2, "").commit();
            this.f8303.setVisibility(0);
            App.f3762.edit().putBoolean(a, false).apply();
            return C1842.f8212;
        } catch (Exception unused) {
            return C1842.f8212;
        }
    }

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public final void m3997() {
        m3986();
        C2098.m4184(App.f3762, Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk")), false);
        Boolean bool = Boolean.FALSE;
        try {
            bool = Boolean.valueOf(m3996(((C1216) App.f3760).m2739())[9]);
        } catch (IndexOutOfBoundsException unused) {
        }
        String m2753 = m3996(((C1216) App.f3760).m2739())[1].isEmpty() ? ((C1216) App.f3760).m2753() : m3996(((C1216) App.f3760).m2739())[1];
        if (bool.booleanValue()) {
            m2753 = ((C1216) App.f3760).m2753().isEmpty() ? m3996(((C1216) App.f3760).m2739())[1] : ((C1216) App.f3760).m2753();
        }
        if (!m2753.isEmpty() && this.f8289.isChecked() && ((C1216) App.f3760).m2723()) {
            new AsyncTaskC1840(new C1868(m2753)).execute(new Void[0]);
        }
        InterfaceC0761 interfaceC0761 = this.f8297;
        if (interfaceC0761 != null) {
            try {
                interfaceC0761.mo1589(false);
                C0765.m2061(App.f3759);
            } catch (RemoteException e) {
                String str = f8270;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                m4207.append(e.getMessage());
                C1687.m3666(str, m4207.toString());
            }
        }
    }

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public final void m3998() {
        this.f8287.m1709();
        m3995(1, 2131820789, 0);
        this.f8291.setEnabled(false);
        this.f8295.setVisibility(0);
        this.f8274.setVisibility(8);
        this.f8283.setVisibility(8);
        InterfaceC1877 interfaceC1877 = this.f8310;
        if (interfaceC1877 != null) {
            interfaceC1877.mo1622(false);
        }
        String str = f8270;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
        m4207.append(m490(2131820949));
        C1687.m3666(str, m4207.toString());
        this.f8287.m1709();
        C0706.C0707 c0707 = new C0706.C0707(new C0706());
        c0707.m1971(10L, TimeUnit.SECONDS);
        new C0706(c0707);
        C1982.C1984 c1984 = new C1982.C1984(Crypt.a(Crypt.xrc("@3i\u001cck\u001eg;J0<@k;\u001da>\u001a6iNbk\u001c`=Ijk\u0019b=\u001ckiO0f\u001cghKckMd<Ja<\u001ce;H0hAklH7hN4n\u001e3=AbnHal@dk\u001bkkK`k\u0019kjAa;K49\u0019dj")), App.f3759.getCacheDir().getPath(), Crypt.a(Crypt.xrc("\u0019cfJgnLf9Me9Lkn\u001c7mOd=I7nLdf\u001a4lAj")));
        c1984.f8655 = EnumC1975.LOW;
        try {
            TrustManager[] trustManagerArr = {new C1926()};
            C0582.C0583 c0583 = new C0582.C0583(C0582.f4211);
            if (!c0583.f4220) {
                throw new IllegalStateException(Crypt.a(Crypt.xrc("Kd>\u001a3=@fn\u001afkNk=\u001cfo\u001ejn\u001bbl\u0019ko\u001bdnAc:IcoAgoNk>HkfHcmKg=\u001b39Ojm\u001cjf\u0019cnIfk\u0019f>Iai\u00197mMfi@1h\u001a3mI0iKghH0nHko")));
            }
            c0583.f4219 = null;
            c0583.m1719(C0710.f4736, C0710.f4738, C0710.f4746, C0710.f4750, C0710.f4732, C0710.f4734, C0710.f4733, C0710.f4735, C0710.f4743, C0710.f4742, C0710.f4745);
            C0582 c0582 = new C0582(c0583);
            SSLContext sSLContext = SSLContext.getInstance(Crypt.a(Crypt.xrc("\u001be>\u001bejO3m\u001ca>\u001d6i\u001c1>J3>Mgj@7lHej\u001a1")));
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            C0706.C0707 c07072 = new C0706.C0707();
            c07072.m1970(socketFactory);
            c07072.f4722 = C0629.m1810(Collections.singletonList(c0582));
            c07072.f4724 = new HostnameVerifier() { // from class: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.〺つふすそ
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str2, SSLSession sSLSession) {
                    String str3 = C1867.f8270;
                    return true;
                }
            };
            c1984.f8651 = new C0706(c07072);
            C1982 c1982 = new C1982(c1984);
            c1982.f8620 = new C1927(this);
            c1982.f8626 = new C1888(this);
            C1998.m4107().m4108(c1982);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public void m3999() {
        if (m525() == null || this.f8299.isChecked()) {
            return;
        }
        this.f8302.setChecked(true);
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public final void m4000() {
        this.f8290.setEnabled(false);
        this.f8302.setEnabled(false);
        this.f8284.setEnabled(false);
        this.f8306.setEnabled(false);
        this.f8294.setEnabled(false);
        this.f8286.setEnabled(false);
        this.f8299.setEnabled(false);
        this.f8298.setEnabled(false);
        this.f8289.setEnabled(false);
        this.f8288.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ぺづげぺが */
    public void mo532(int i, int i2, Intent intent) {
        String str;
        if (i == 17) {
            m525();
            if (i2 == -1) {
                try {
                    str = m3996(((C1216) App.f3760).m2739())[12];
                } catch (Exception unused) {
                    str = "";
                }
                if (str.isEmpty()) {
                    App.f3762.getString(Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), "").isEmpty();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 18) {
            m525();
            if (i2 == -1) {
                if (((C1216) App.f3760).m2783().isEmpty() && m3996(((C1216) App.f3760).m2739())[0].isEmpty() && m3996(((C1216) App.f3760).m2739())[1].isEmpty()) {
                    return;
                }
                m3999();
                return;
            }
            return;
        }
        if (i != 70) {
            return;
        }
        m525();
        if (i2 == -1) {
            C0765.m2064(m525(), this.f8304);
            C1687.m3684(this.f8304, m525());
            return;
        }
        this.f8296.setText(2131820597);
        m3986();
        String str2 = f8270;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
        m4207.append(m490(2131821420));
        C1687.m3697(str2, m4207.toString());
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぺふねづ〺 */
    public void mo1595(String str, final String str2, int i, final ConnectionStatus connectionStatus, Intent intent) {
        if (m518()) {
            m525().runOnUiThread(new Runnable() { // from class: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.げつ〴ぬぐ
                @Override // java.lang.Runnable
                public final void run() {
                    C1867 c1867 = C1867.this;
                    ConnectionStatus connectionStatus2 = connectionStatus;
                    String str3 = str2;
                    if (!c1867.m518() || c1867.f8309 == null) {
                        return;
                    }
                    int ordinal = connectionStatus2.ordinal();
                    String a = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
                    String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
                    if (ordinal == 0) {
                        c1867.f8296.setText(2131820598);
                        c1867.m4000();
                        InterstitialAd interstitialAd = c1867.f8285;
                        if (interstitialAd != null && interstitialAd.isLoaded()) {
                            c1867.f8285.show();
                        }
                    } else if (ordinal == 7) {
                        String str4 = C1867.f8270;
                        StringBuilder m4207 = C2098.m4207(a2);
                        m4207.append(new SimpleDateFormat(a, Locale.getDefault()).format(new Date()));
                        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
                        m4207.append(c1867.m490(2131820838));
                        m4207.append(Crypt.a(Crypt.xrc("HblJanI0lI`gNjh\u001afoL6i@ffNdoHd>M4")));
                        C1687.m3697(str4, m4207.toString());
                        ((C1216) App.f3760).m2790(c1867.m490(2131820639), -65536);
                        c1867.m3997();
                        c1867.f8296.setText(2131820597);
                    }
                    if (str3.equals(Crypt.a(Crypt.xrc("\u001denJeg\u0019anO1;M`nKbgN3=AfhIfi@0;Lc9Lj=\u00191n\u001cfmIf9\u001bd9\u001c0oOb>He9@fjIe;\u001d")))) {
                        String str5 = C1867.f8270;
                        StringBuilder m42072 = C2098.m4207(a2);
                        m42072.append(new SimpleDateFormat(a, Locale.getDefault()).format(new Date()));
                        m42072.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
                        m42072.append(c1867.m490(2131820633));
                        C1687.m3666(str5, m42072.toString());
                    }
                    if (!C0753.m2037(App.f3759).isEmpty()) {
                        c1867.f8309.setText(C0753.m2037(App.f3759));
                    }
                    if (c1867.f8309.getText().toString().trim().contains(Crypt.a(Crypt.xrc("\u001denJeg\u0019anO1;M`nKbgN3=AfhIfi@0;Lc>@6<@j=@1jK3i\u0019a9J3hOk9Kbf\u001a6l\u001eg<M"))) || c1867.f8309.getText().toString().trim().isEmpty()) {
                        c1867.f8296.setText(2131820597);
                        c1867.m3986();
                    }
                    boolean startsWith = c1867.f8309.getText().toString().trim().startsWith(Crypt.a(Crypt.xrc("AdiMehOah\u0019bj@4=\u001b3nOgmJe:K`iJ6=\u001dc")));
                    String a3 = Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk"));
                    if ((startsWith || c1867.f8309.getText().toString().trim().startsWith(Crypt.a(Crypt.xrc("@dn\u001afhH7g\u001d6i\u001eei\u00191hAf9\u001d39\u001ck;H`:\u001d4"))) || c1867.f8309.getText().toString().trim().startsWith(Crypt.a(Crypt.xrc("M0iNbnLa9IeoLah\u001b1o\u001a7nL6l\u001cdg\u001e`n\u001c3"))) || c1867.f8309.getText().toString().trim().startsWith(Crypt.a(Crypt.xrc("Oa;KajL1g\u001bbmNk9Mbi\u001da=HkiM1h\u001e4iKd")))) && App.f3762.getBoolean(a3, false)) {
                        c1867.f8296.setText(2131820669);
                        c1867.m4000();
                    }
                    if (!App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u0019b>M`o\u001b6oHk=MdgJchA7=\u001b`o\u001d0>Ha>Nf")), true) && !c1867.f8272.equals(C0753.m2037(App.f3759))) {
                        String str6 = C1867.f8270;
                        StringBuilder m42073 = C2098.m4207(a2);
                        C2098.m4199(new SimpleDateFormat(a, Locale.getDefault()), m42073, Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
                        m42073.append(C0753.m2037(App.f3759));
                        C1687.m3666(str6, m42073.toString());
                    }
                    if (!App.f3762.getBoolean(a3, false) && C0753.m2042()) {
                        c1867.m3997();
                    }
                    c1867.f8272 = C0753.m2037(App.f3759);
                }
            });
        }
    }
}
