package dev.epro.r0;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class L4980660535418402690 implements N12800445656637864660, H4563649114871566866, C2811124483977556747, R5909351061398077004, WebViewCompat.WebViewStartUpCallback, androidx.sqlite.db.Z11244019023321623390 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L4980660535418402690(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.N12800445656637864660
    public void a(Object obj) {
        ((F4096073349764486348) ((W1972671267364756056) this.b).getValue()).invoke(obj);
    }

    @Override // dev.epro.r0.C2811124483977556747
    public boolean b(F6942723054099263096 f6942723054099263096, int i, Bundle bundle) {
        G17207421659529280019 g17207421659529280019;
        B6584454571824948275 b6584454571824948275 = (B6584454571824948275) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((S4170173850086311843) f6942723054099263096.b).d();
                Parcelable parcelable = (Parcelable) ((S4170173850086311843) f6942723054099263096.b).a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        S4170173850086311843 s4170173850086311843 = (S4170173850086311843) f6942723054099263096.b;
        ClipData clipData = new ClipData(s4170173850086311843.getDescription(), new ClipData.Item(s4170173850086311843.b()));
        if (i2 >= 31) {
            g17207421659529280019 = new H12843822278061842084(clipData, 2);
        } else {
            E11375389548855090952 e11375389548855090952 = new E11375389548855090952();
            e11375389548855090952.b = clipData;
            e11375389548855090952.c = (byte) 2;
            g17207421659529280019 = e11375389548855090952;
        }
        g17207421659529280019.q(s4170173850086311843.e());
        g17207421659529280019.setExtras(bundle);
        return W10240872260424387225.h(b6584454571824948275, g17207421659529280019.build()) == null;
    }

    @Override // dev.epro.r0.H4563649114871566866
    public Object c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
                    Z3383101362411723454.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + P15002231639878788228.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    Z3383101362411723454.m("Failed to invoke constructor '" + P15002231639878788228.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return A1090523267393268132.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // androidx.sqlite.db.Z11244019023321623390
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        Context context = (Context) this.b;
        String str = configuration.b;
        T17032536773975598836 t17032536773975598836 = configuration.c;
        t17032536773975598836.getClass();
        if (str == null || str.length() == 0) {
            S10973172697741180971.j("Must set a non-null database name to a configuration that uses the no backup directory.");
            return null;
        }
        new SupportSQLiteOpenHelper.Configuration(context, str, t17032536773975598836, true, true);
        return new O10473963520269069706(context, str, t17032536773975598836, true, true);
    }

    public void d() {
        L12639328004344855510 l12639328004344855510 = (L12639328004344855510) this.b;
        synchronized (D459204867321966484.c) {
            List list = D459204867321966484.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(Z115818233709597990.k0(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && S10823041268949770285.t(obj, l12639328004344855510)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            D459204867321966484.h = arrayList;
        }
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat.WebViewStartUpCallback webViewStartUpCallback = (WebViewCompat.WebViewStartUpCallback) this.b;
        Uri uri = WebViewCompat.a;
        new Handler(Looper.getMainLooper()).post(new Q9622116641457785369(webViewStartUpCallback, webViewStartUpResult, (byte) 17));
    }

    @Override // dev.epro.r0.R5909351061398077004
    /* renamed from: run */
    public void mo18run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((P15983149023236604271) obj).close();
                break;
            default:
                R9704326227384281667 r9704326227384281667 = (R9704326227384281667) obj;
                Z11821137052809198413 z11821137052809198413 = r9704326227384281667.d;
                if (z11821137052809198413.f.compareAndSet(1, 4)) {
                    r9704326227384281667.a.onResponseStarted(z11821137052809198413, z11821137052809198413.f598o);
                    break;
                }
                break;
        }
    }
}
