package team.dev.epro.apkcustom.widgets;

import android.app.ListActivity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p034.p050.p060.AbstractC1345;
import p034.p050.p060.LayoutInflaterFactory2C1320;
import p034.p080.C1501;
import p107.p108.p109.p110.p120.C1929;
import p107.p108.p109.p110.p129.C1964;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FileChooser extends ListActivity {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final /* synthetic */ int f4132 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f4133;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public File f4134;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1345 f4135;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1964 f4136;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1706().mo2986(view, layoutParams);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m1706().mo2969();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m1706().mo3017();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1706().mo2999(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        m1706().mo2974();
        m1706().mo3006(bundle);
        super.onCreate(bundle);
        String string = App.f3762.getString(Crypt.a(Crypt.xrc("\u001ce=\u001cg>\u001b4hHgfNenH1hI1>Jem@jiIjiKa")), Environment.getExternalStorageDirectory() + File.separator + getString(2131820626));
        try {
            this.f4133 = getIntent().getExtras().getString(Crypt.a(Crypt.xrc("\u001bknOgj\u001djgM1=Ng>\u0019f9OfgOjiM0<JjkJ`")));
        } catch (Exception unused) {
            this.f4133 = Crypt.a(Crypt.xrc("\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"));
        }
        File file = new File(string);
        this.f4134 = file;
        if (!file.exists() && !this.f4134.mkdirs()) {
            ((C1216) App.f3760).m2790("Can't create directory", -65536);
        }
        m1705(this.f4134);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0154
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.app.ListActivity
    public void onListItemClick(android.widget.ListView r6, android.view.View r7, int r8, long r9) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.widgets.FileChooser.onListItemClick(android.widget.ListView, android.view.View, int, long):void");
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m1706().mo2984(bundle);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m1706().mo2978();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m1706().mo3009(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m1706().mo3000(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m1706().mo3011(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1706().mo2971(view, layoutParams);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1705(File file) {
        StringBuilder m4207;
        String a;
        C1929 c1929;
        StringBuilder sb;
        String a2;
        File[] listFiles = file.listFiles();
        String str = this.f4133;
        String a3 = Crypt.a(Crypt.xrc("H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`"));
        boolean equalsIgnoreCase = str.equalsIgnoreCase(a3);
        String a4 = Crypt.a(Crypt.xrc("\u001a7nN6:\u00190nN7>\u00191l\u001c1f@c<Ikh\u001ecmL39\u001d0"));
        if (equalsIgnoreCase) {
            m4207 = C2098.m4207(a4);
            m4207.append(file.getName());
            a = Crypt.a(Crypt.xrc("\u001b`jIj;\u001ajiN0=\u0019a=J4f\u001de=\u001c3gJfjH7:\u001da"));
        } else {
            m4207 = C2098.m4207(a4);
            m4207.append(file.getName());
            a = Crypt.a(Crypt.xrc("\u001c39\u0019k;Oj>Ib=A`=N7oM7iKkoO7:Mg>Oc"));
        }
        m4207.append(a);
        setTitle(m4207.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (File file2 : listFiles) {
                String format = new SimpleDateFormat(Crypt.a(Crypt.xrc("KkhI4;N0gMjj\u001e6k\u001e1g\u001b1<L1g\u001cdm\u001e4=\u001bcnAb;Adi\u00197g\u001eaoJ1j@e:\u001e`:Mgg\u001d7h\u001dbjM")), Locale.ENGLISH).format(new Date(file2.lastModified()));
                if (file2.isDirectory()) {
                    File[] listFiles2 = file2.listFiles();
                    int length = listFiles2 != null ? listFiles2.length : 0;
                    String valueOf = String.valueOf(length);
                    if (length == 0) {
                        sb = new StringBuilder();
                        sb.append(valueOf);
                        a2 = Crypt.a(Crypt.xrc("\u001cjf\u001cj:@c<JkgN`mHkkLjl\u001b7o\u001edjJ1oI3"));
                    } else {
                        sb = new StringBuilder();
                        sb.append(valueOf);
                        a2 = Crypt.a(Crypt.xrc("\u001a`nH3:J`>KfkH4;M0g@1fNkn\u0019fj@6o\u0019k"));
                    }
                    sb.append(a2);
                    arrayList.add(new C1929(file2.getName(), sb.toString(), format, file2.getAbsolutePath(), Crypt.a(Crypt.xrc("M0<\u001dkj\u001abi\u00193=\u001a1oMf;\u001bg=OamL`m\u001cbo\u001c4")), file2));
                } else {
                    boolean equalsIgnoreCase2 = this.f4133.equalsIgnoreCase(a3);
                    String a5 = Crypt.a(Crypt.xrc("L6oIf<A7fMfiL1:\u001efoI19O0j\u0019cn\u001bk9Ic"));
                    if (equalsIgnoreCase2) {
                        if (file2.getName().toLowerCase().endsWith(a3)) {
                            c1929 = new C1929(file2.getName(), file2.length() + a5, format, file2.getAbsolutePath(), Crypt.a(Crypt.xrc("\u001e7gO7fNgiMb;\u0019`gJ4iJ6>\u001a3l\u001c0nM6lO0")), file2);
                            arrayList2.add(c1929);
                        }
                    } else if (file2.getName().toLowerCase().endsWith(Crypt.a(Crypt.xrc("\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"))) || file2.getName().toLowerCase().endsWith(Crypt.a(Crypt.xrc("\u001d`f@1:MboK`mKbmAchL6n\u001a79\u0019j<KgnAe"))) || file2.getName().toLowerCase().endsWith(Crypt.a(Crypt.xrc("L3;LgiIgmH4;KkfJ7jHk9J4o\u001a`jJdg\u001d7")))) {
                        c1929 = new C1929(file2.getName(), file2.length() + a5, format, file2.getAbsolutePath(), Crypt.a(Crypt.xrc("I`mO0nIk:\u001a6>M4nHj>\u001c1i\u0019chK1iIf9N`")), file2);
                        arrayList2.add(c1929);
                    }
                }
            }
        } catch (Exception unused) {
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        Collections.sort(arrayList2, Collections.reverseOrder());
        arrayList.addAll(arrayList2);
        if (!file.getName().equalsIgnoreCase("")) {
            arrayList.add(0, new C1929(Crypt.a(Crypt.xrc("\u001adm\u001ec9I`i\u001bb=\u001a`k\u001bd;Ne<KjoJclJbhJ7")), Crypt.a(Crypt.xrc("@fl\u001d3m\u001ac:L0:\u001dd=Ncf\u001dfl\u00191;\u001ab9K4gI0")), "", file.getParent(), Crypt.a(Crypt.xrc("@09\u001df<M3iLk:J1=Laj@blL4hOdkMki\u001e6")), file));
        }
        C1964 c1964 = new C1964(this, 2131492938, arrayList);
        this.f4136 = c1964;
        setListAdapter(c1964);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AbstractC1345 m1706() {
        if (this.f4135 == null) {
            C1501<WeakReference<AbstractC1345>> c1501 = AbstractC1345.f6453;
            this.f4135 = new LayoutInflaterFactory2C1320(this, null, null, this);
        }
        return this.f4135;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1707(String str, String str2) {
        SharedPreferences.Editor edit;
        String str3;
        if (C0753.m2042()) {
            ((C1216) App.f3760).m2766(getWindow().getDecorView().getRootView(), Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg")), -65536);
            return;
        }
        if (SSHTunnelService.f4041 || SSHTunnelService.f4034 || SSHTunnelService.f4038) {
            ((C1216) App.f3760).m2766(getWindow().getDecorView().getRootView(), Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o")), -65536);
            return;
        }
        C2098.m4186(App.f3762, Crypt.a(Crypt.xrc("\u001ce=\u001cg>\u001b4hHgfNenH1hI1>Jem@jiIjiKa")), str2);
        if (this.f4133.equalsIgnoreCase(Crypt.a(Crypt.xrc("H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`")))) {
            edit = App.f3762.edit();
            str3 = Crypt.a(Crypt.xrc("O`m\u001eb:L1<\u001cf=J1lJ6;Kkn\u001ak<A0>@1kA1"));
        } else {
            edit = App.f3762.edit();
            str3 = new String(((C1216) App.f3760).m2772(5, 0));
        }
        edit.putString(str3, str).commit();
        setResult(-1);
        finish();
    }
}
