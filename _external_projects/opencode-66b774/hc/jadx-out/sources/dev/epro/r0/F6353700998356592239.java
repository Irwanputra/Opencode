package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F6353700998356592239 implements T16404477825665144123, P6802326504044700406, P7827270438547540384, P221537849541086423, I3673563500665330592 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public F6353700998356592239(N12253737202470468561 n12253737202470468561, Q13914734507241918864 q13914734507241918864) {
        this.a = (byte) 1;
        n12253737202470468561.getClass();
        q13914734507241918864.getClass();
        this.b = n12253737202470468561;
        this.c = q13914734507241918864;
    }

    @Override // dev.epro.r0.P6802326504044700406
    public Object a() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                return new J5088046595558092892((S8093187219740136623) ((W16989069692222643684) obj2).a(), (S4549398051179645011) ((W16989069692222643684) obj).a());
            default:
                return new S8093187219740136623((Context) ((Z6787503239643758223) obj2).a, (P8755783434649014957) ((W16989069692222643684) obj).a(), new O12545633033254628644((byte) 13));
        }
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int b(int i) {
        do {
            i = ((I15162792415829416729) this.c).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((I15162792415829416729) this.c).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int d(int i) {
        do {
            i = ((I15162792415829416729) this.c).m(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    public void e(X5127101262035123109 x5127101262035123109, P5733283974459951585 p5733283974459951585) {
        x5127101262035123109.getClass();
        Q13914734507241918864 q13914734507241918864 = (Q13914734507241918864) this.c;
        q13914734507241918864.a.execute(new E138661690457992157(this, x5127101262035123109, p5733283974459951585, (byte) 9));
    }

    @Override // dev.epro.r0.P221537849541086423
    public void f(X17123927029532314696 x17123927029532314696) {
        x17123927029532314696.a((Activity) this.b, (D1625857060574188343) this.c);
    }

    public void g(X5127101262035123109 x5127101262035123109, int i) {
        x5127101262035123109.getClass();
        Q13914734507241918864 q13914734507241918864 = (Q13914734507241918864) this.c;
        q13914734507241918864.a.execute(new Y5433946636275846014((N12253737202470468561) this.b, x5127101262035123109, false, i));
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        O6655543165492094776 o6655543165492094776 = (O6655543165492094776) ((D9201356603168736774) this.b).h();
        Handler handler = L7597948271951285043.a;
        Q3791352212346016950.m(handler);
        return new A4716120536771319554(o6655543165492094776, handler, ((B16853324304735504143) this.c).h());
    }

    public S14461012662136963693 i(Object obj) {
        J5088046595558092892 j5088046595558092892 = (J5088046595558092892) this.b;
        A6599760166829839218 a6599760166829839218 = new A6599760166829839218(j5088046595558092892.b, ((D873579236909824701) this.c).a, ((Long) obj).longValue());
        S14461012662136963693 s14461012662136963693 = new S14461012662136963693();
        s14461012662136963693.f(a6599760166829839218);
        return s14461012662136963693;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    public O11692414993408430441 j(Activity activity, E17149812035295265804 e17149812035295265804) throws I10210771329789820200 {
        Bundle bundle;
        String string;
        List list;
        PackageInfo packageInfo;
        Application application = (Application) this.b;
        boolean z = false;
        boolean z2 = Y2666402291564931474.n() || new ArrayList().contains(D15913187640519482289.O(application.getApplicationContext()));
        O11692414993408430441 o11692414993408430441 = new O11692414993408430441();
        o11692414993408430441.e = Collections.EMPTY_MAP;
        o11692414993408430441.i = Collections.EMPTY_LIST;
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new I10210771329789820200(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        o11692414993408430441.a = string;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Y2165537903987834679.a);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        o11692414993408430441.i = list;
        o11692414993408430441.e = ((G5446205426701161097) this.c).a();
        o11692414993408430441.d = Boolean.FALSE;
        o11692414993408430441.c = Locale.getDefault().toLanguageTag();
        X17233818480995046658 x17233818480995046658 = new X17233818480995046658();
        x17233818480995046658.c = (byte) 1;
        int i = Build.VERSION.SDK_INT;
        x17233818480995046658.b = Integer.valueOf(i);
        x17233818480995046658.a = Build.MODEL;
        x17233818480995046658.c = (byte) 2;
        o11692414993408430441.b = x17233818480995046658;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770((byte) 27, z);
        Object arrayList2 = Collections.EMPTY_LIST;
        j15730374346044043770.e = arrayList2;
        j15730374346044043770.b = Integer.valueOf(configuration.screenWidthDp);
        j15730374346044043770.c = Integer.valueOf(configuration.screenHeightDp);
        j15730374346044043770.d = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i >= 28) {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        N16024463839079875704 n16024463839079875704 = new N16024463839079875704();
                        n16024463839079875704.b = Integer.valueOf(rect.left);
                        n16024463839079875704.c = Integer.valueOf(rect.right);
                        n16024463839079875704.a = Integer.valueOf(rect.top);
                        n16024463839079875704.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(n16024463839079875704);
                    }
                }
            }
        }
        j15730374346044043770.e = arrayList2;
        o11692414993408430441.f = j15730374346044043770;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        I1632105416032993715 i1632105416032993715 = new I1632105416032993715((byte) 22, z);
        i1632105416032993715.c = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        i1632105416032993715.d = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            i1632105416032993715.b = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        o11692414993408430441.g = i1632105416032993715;
        o11692414993408430441.h = new Y2677586711477821327((byte) 16);
        return o11692414993408430441;
    }

    @Override // dev.epro.r0.P7827270438547540384
    public void onComplete(S14461012662136963693 s14461012662136963693) {
        switch (this.a) {
            case 5:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) this.b;
                M17133811648581684718 m17133811648581684718 = (M17133811648581684718) this.c;
                synchronized (k12238100791927223227.f) {
                    k12238100791927223227.e.remove(m17133811648581684718);
                    break;
                }
                return;
            default:
                ((K12477491117444883648) this.c).b.remove((M17133811648581684718) this.b);
                return;
        }
    }

    public /* synthetic */ F6353700998356592239(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ F6353700998356592239(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public F6353700998356592239(Z6787503239643758223 z6787503239643758223, W16989069692222643684 w16989069692222643684, Y2677586711477821327 y2677586711477821327) {
        this.a = (byte) 4;
        this.b = z6787503239643758223;
        this.c = w16989069692222643684;
    }

    @Override // dev.epro.r0.T16404477825665144123
    public int a(int i) {
        do {
            i = ((I15162792415829416729) this.c).m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }
}
