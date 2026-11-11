package team.dev.epro.apkcustom.activities;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p034.p050.p060.DialogInterfaceC1343;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1843;
import p107.p108.p109.p110.p113.C1860;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p244.p245.p246.InterfaceC2837;
import p244.p245.p246.InterfaceC2840;
import p244.p245.p246.p247.AbstractC2834;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ConfigImport extends AppCompatActivity implements InterfaceC2837 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Uri f3839;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Intent f3840;

    /* renamed from: team.dev.epro.apkcustom.activities.ConfigImport$〺つふすそ, reason: contains not printable characters */
    public class C0519 implements InterfaceC1838 {
        public C0519() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            try {
                Thread.sleep(2000L);
            } catch (Exception unused) {
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            ConfigImport.this.finish();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.activities.ConfigImport$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0520 implements InterfaceC1838 {

        /* renamed from: team.dev.epro.apkcustom.activities.ConfigImport$げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
        public class DialogInterfaceOnClickListenerC0521 implements DialogInterface.OnClickListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ File f3843;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public final /* synthetic */ File[] f3844;

            public DialogInterfaceOnClickListenerC0521(C0520 c0520, File file, File[] fileArr) {
                this.f3843 = file;
                this.f3844 = fileArr;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (C1860.m3980(this.f3843, this.f3844[0])) {
                    this.f3843.delete();
                } else {
                    this.f3844[0] = this.f3843;
                }
            }
        }

        /* renamed from: team.dev.epro.apkcustom.activities.ConfigImport$げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
        public class DialogInterfaceOnDismissListenerC0522 implements DialogInterface.OnDismissListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ File[] f3845;

            public DialogInterfaceOnDismissListenerC0522(File[] fileArr) {
                this.f3845 = fileArr;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ConfigImport.m1635(ConfigImport.this, this.f3845[0].getPath());
            }
        }

        /* renamed from: team.dev.epro.apkcustom.activities.ConfigImport$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class DialogInterfaceOnClickListenerC0523 implements DialogInterface.OnClickListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ File[] f3847;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public final /* synthetic */ File f3848;

            public DialogInterfaceOnClickListenerC0523(C0520 c0520, File[] fileArr, File file) {
                this.f3847 = fileArr;
                this.f3848 = file;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.f3847[0] = this.f3848;
                dialogInterface.dismiss();
            }
        }

        public C0520() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            try {
                Thread.sleep(1000L);
            } catch (Exception unused) {
            }
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            String m3956;
            ConfigImport configImport = ConfigImport.this;
            configImport.f3839 = configImport.f3840.getData();
            ConfigImport configImport2 = ConfigImport.this;
            if (C1843.m3956(configImport2, configImport2.f3839) == null) {
                m3956 = ConfigImport.this.f3839.getPath();
            } else {
                ConfigImport configImport3 = ConfigImport.this;
                m3956 = C1843.m3956(configImport3, configImport3.f3839);
            }
            File file = new File(m3956);
            File file2 = new File(Environment.getExternalStorageDirectory() + File.separator + ConfigImport.this.getString(2131820626));
            File[] fileArr = {new File(file2, file.getName())};
            if (!file2.exists()) {
                file2.mkdir();
            }
            if (fileArr[0].exists()) {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(ConfigImport.this.getString(2131820626));
                StringBuilder sb = new StringBuilder();
                String name = file.getName();
                String a = Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"));
                if (name.indexOf(a) > 0) {
                    name = name.substring(0, name.lastIndexOf(a));
                }
                sb.append(name);
                sb.append(Crypt.a(Crypt.xrc("\u001c6lK0lN6oJc:\u0019e>Ma>\u001calHko\u001e1m\u001e7kJf")));
                sb.append(UUID.randomUUID());
                sb.append(Crypt.a(Crypt.xrc("\u001b3;M`iM0n@1j\u001df=O6iK7:M1gAj;Ib<\u0019g")));
                fileArr[0] = new File(externalStoragePublicDirectory, sb.toString());
            }
            try {
                if (file.getCanonicalPath().equals(new File(file2, file.getName()).getCanonicalPath())) {
                    fileArr[0] = file;
                    ConfigImport.m1635(ConfigImport.this, fileArr[0].getPath());
                    return;
                }
                DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(ConfigImport.this, 2131886321);
                String a2 = Crypt.a(Crypt.xrc("MbhMfj\u001aci\u001bgj\u001e1>\u0019cm\u001agjAghL4fM3h\u0019a"));
                AlertController.C0038 c0038 = c1344.f6452;
                c0038.f174 = a2;
                c0038.f172 = Crypt.a(Crypt.xrc("Nj<L0n\u001cjfN0=J4j\u001adnA6i@7nN`nAj:I6fL1jLc>\u0019ajA09@a>\u001d3hJ6lIkk\u001b3lL7kM"));
                c0038.f177 = false;
                c0038.f171 = new DialogInterfaceOnDismissListenerC0522(fileArr);
                String a3 = Crypt.a(Crypt.xrc("J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"));
                DialogInterfaceOnClickListenerC0521 dialogInterfaceOnClickListenerC0521 = new DialogInterfaceOnClickListenerC0521(this, file, fileArr);
                c0038.f162 = a3;
                c0038.f160 = dialogInterfaceOnClickListenerC0521;
                String a4 = Crypt.a(Crypt.xrc("M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"));
                DialogInterfaceOnClickListenerC0523 dialogInterfaceOnClickListenerC0523 = new DialogInterfaceOnClickListenerC0523(this, fileArr, file);
                c0038.f176 = a4;
                c0038.f163 = dialogInterfaceOnClickListenerC0523;
                c1344.m3032();
            } catch (IOException unused) {
                ConfigImport.m1635(ConfigImport.this, file.getPath());
            }
        }
    }

    @InterfaceC2840(1922)
    private void methodRequiresReadWrite() {
        boolean z = false;
        String[] strArr = {Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j")), Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="))};
        if (C1687.m3712(this, strArr)) {
            m1637();
            return;
        }
        AbstractC2834<? extends Activity> m4943 = AbstractC2834.m4943(this);
        String string = m4943.mo4938().getString(R.string.ok);
        String string2 = m4943.mo4938().getString(R.string.cancel);
        String[] strArr2 = (String[]) strArr.clone();
        if (C1687.m3712(m4943.mo4938(), (String[]) strArr2.clone())) {
            Object obj = m4943.f10524;
            String[] strArr3 = (String[]) strArr2.clone();
            int[] iArr = new int[strArr3.length];
            for (int i = 0; i < strArr3.length; i++) {
                iArr[i] = 0;
            }
            C1687.m3721(1922, strArr3, iArr, obj);
            return;
        }
        String[] strArr4 = (String[]) strArr2.clone();
        int length = strArr4.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (m4943.mo4941(strArr4[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            m4943.mo4942(Crypt.a(Crypt.xrc("\u001b`oKe9Ic=Kk=@ai\u001b4>\u001ecj\u001c3j\u001bd>Af9NggKd:Me<\u001dbgK3h\u001a0>Iah\u001eciLe;\u001af9\u001dk=\u001ba9\u00190<\u001dd<\u001agjJa:\u001a`jI1kJ49\u001bg=I0l@cn")), string, string2, -1, 1922, strArr4);
        } else {
            m4943.mo4939(1922, strArr4);
        }
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static void m1635(ConfigImport configImport, String str) {
        View rootView;
        C1216 c1216;
        String a;
        configImport.getClass();
        if (C0753.m2042()) {
            InterfaceC1837 interfaceC1837 = App.f3760;
            rootView = configImport.getWindow().getDecorView().getRootView();
            c1216 = (C1216) interfaceC1837;
            a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
        } else {
            if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                App.f3762.edit().putString(Crypt.a(Crypt.xrc("\u001ce=\u001cg>\u001b4hHgfNenH1hI1>Jem@jiIjiKa")), new File(str).getParent()).apply();
                Intent intent = new Intent(configImport, (Class<?>) MainActivity.class);
                intent.putExtra(new String(((C1216) App.f3760).m2772(5, 0)), str);
                intent.addFlags(268468224);
                configImport.startActivity(intent);
                configImport.overridePendingTransition(0, 0);
                configImport.finish();
            }
            InterfaceC1837 interfaceC18372 = App.f3760;
            rootView = configImport.getWindow().getDecorView().getRootView();
            c1216 = (C1216) interfaceC18372;
            a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
        }
        c1216.m2766(rootView, a, -65536);
        configImport.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492892);
        this.f3840 = getIntent();
        methodRequiresReadWrite();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, p034.p035.p041.C1043.InterfaceC1044
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C1687.m3721(i, strArr, iArr, this);
    }

    @Override // p244.p245.p246.InterfaceC2837
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void mo1636(int i, List<String> list) {
        m1637();
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1637() {
        if (Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4fNj<Hkh\u001d4mJjkKb>Lg=A0>\u001c19Jb:\u001ed;\u0019")).equals(this.f3840.getAction())) {
            new AsyncTaskC1840(new C0520()).execute(new Void[0]);
        }
    }

    @Override // p244.p245.p246.InterfaceC2837
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo1638(int i, List<String> list) {
        ((C1216) App.f3760).m2790(Crypt.a(Crypt.xrc("\u001b`oKe9Ic=Kk=@ai\u001b4>\u001ecj\u001c3j\u001bd>Af9NggKd:Me<\u001dbgK3h\u001a0>Iah\u001eciLe;\u001af9\u001dk=\u001ba9\u00190<\u001dd<\u001agjJa:\u001a`jI1kJ49\u001bg=I0l@cn")), -65536);
        new AsyncTaskC1840(new C0519()).execute(new Void[0]);
    }
}
