package ads_mobile_sdk;

import android.app.Activity;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import dev.epro.r0.E4880248942576735123;
import dev.epro.r0.H5336160545165318150;
import dev.epro.r0.H6918874287707076857;
import dev.epro.r0.H8032588520594078423;
import dev.epro.r0.I3566570148522791385;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.M7968841747429118896;
import dev.epro.r0.M8927913404651150384;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V11146580314972738611;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Z13168519540281190457;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class rw0 {
    public static final P5733283974459951585 f = new P5733283974459951585(11);
    public static final AtomicReference g;
    public static final H5336160545165318150 h;
    public static final H5336160545165318150 i;
    public final Context a;
    public final g0 b;
    public final jr0 c;
    public final l0 d;
    public final Class e;

    static {
        K5751602218013079365.V("/aclk", "/pcs/click", "/dbm/clk");
        g = new AtomicReference(null);
        h = new H5336160545165318150("^(ca-app-pub-[0-9]{16})~([0-9]{10})$");
        i = new H5336160545165318150("^(ca-app-pub-[a-zA-Z0-9\\-]+)/([a-zA-Z0-9_\\-]+)(/.*)?$");
    }

    public rw0(Context context, g0 g0Var, jr0 jr0Var, l0 l0Var, Class cls) {
        context.getClass();
        g0Var.getClass();
        jr0Var.getClass();
        l0Var.getClass();
        cls.getClass();
        this.a = context;
        this.b = g0Var;
        this.c = jr0Var;
        this.d = l0Var;
        this.e = cls;
    }

    public static qw0 a(Context context) {
        Configuration configuration;
        LocaleList locales;
        context.getClass();
        qw0 qw0Var = new qw0(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT >= 33) {
            LocaleManager a = H6918874287707076857.a(context.getSystemService(H6918874287707076857.f()));
            if (a != null) {
                locales = a.getSystemLocales();
            }
            locales = null;
        } else {
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                locales = configuration.getLocales();
            }
            locales = null;
        }
        if (locales == null || locales.isEmpty()) {
            return qw0Var;
        }
        Locale locale = locales.get(0);
        return new qw0(locale.getLanguage(), locale.getCountry());
    }

    public final boolean b(Uri uri) {
        uri.getClass();
        String host = uri.getHost();
        if (host != null) {
            jr0 jr0Var = this.c;
            jr0Var.getClass();
            List list = (List) jr0Var.a("gads:google_ad_domain_suffixes", K5751602218013079365.V(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"), ao.a$23);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Z13168519540281190457.z(host, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        if (!b(uri)) {
            return false;
        }
        String uri2 = uri.toString();
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        List<String> list = (List) jr0Var.a("gads:impression_url_pattern_match", K5751602218013079365.U("^[^?]*(/adview|/pcs/view).*"), ao.a$23);
        if (list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            str.getClass();
            Pattern compile = Pattern.compile(str);
            compile.getClass();
            uri2.getClass();
            if (compile.matcher(uri2).find()) {
                return true;
            }
        }
        return false;
    }

    public final Map d(Uri uri) {
        String encodedQuery;
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        if (!((Boolean) jr0Var.a("gads:uri_query_to_map:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            if (uri.isOpaque()) {
                return X9852054718446117252.a;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            queryParameterNames.getClass();
            E4880248942576735123 e4880248942576735123 = new E4880248942576735123(new V11146580314972738611(queryParameterNames, (byte) 1), true, ao.a$9);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            M7968841747429118896 m7968841747429118896 = new M7968841747429118896(e4880248942576735123);
            while (m7968841747429118896.hasNext()) {
                Object next = m7968841747429118896.next();
                linkedHashMap.put(next, uri.getQueryParameter((String) next));
            }
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int length = encodedQuery.length();
            int i2 = 0;
            while (true) {
                int V = M8927913404651150384.V(encodedQuery, '&', i2, 4);
                int i3 = V != -1 ? V : length;
                int V2 = M8927913404651150384.V(encodedQuery, '=', i2, 4);
                if (V2 > i3 || V2 == -1) {
                    V2 = i3;
                }
                String decode = Uri.decode(encodedQuery.substring(i2, V2));
                String decode2 = V2 == i3 ? "" : Uri.decode(encodedQuery.substring(V2 + 1, i3));
                decode.getClass();
                decode2.getClass();
                linkedHashMap2.put(decode, decode2);
                if (V == -1) {
                    break;
                }
                i2 = V + 1;
            }
        }
        return linkedHashMap2;
    }

    public final boolean c() {
        boolean isInstantApp;
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 >= 26) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            isInstantApp = packageManager.isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Intent a(Context context, H8032588520594078423 h8032588520594078423) {
        context.getClass();
        h8032588520594078423.getClass();
        Intent intent = new Intent(context, (Class<?>) this.e);
        Bundle bundle = new Bundle();
        l0 l0Var = this.d;
        l0Var.getClass();
        int andIncrement = l0Var.c.getAndIncrement();
        W5797197595347441198 w5797197595347441198 = l0Var.a;
        R4833348786910499294 r4833348786910499294 = null;
        byte b = 1;
        I3566570148522791385 i3566570148522791385 = new I3566570148522791385(l0Var, andIncrement, r4833348786910499294, b);
        w5797197595347441198.getClass();
        X7175349259954592591 E = R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(i3566570148522791385, r4833348786910499294, b), 2);
        l0Var.d.put(Integer.valueOf(andIncrement), new j0(h8032588520594078423, E));
        bundle.putInt("ad_activity_delegate", andIncrement);
        intent.putExtra("ad_activity_delegate_bundle", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        return intent;
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        if (!b(uri)) {
            return false;
        }
        String uri2 = uri.toString();
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        List<String> list = (List) jr0Var.a("gads:click_url_pattern_match", K5751602218013079365.U("^[^?]*(/aclk|/pcs/click|/dbm/clk).*"), ao.a$23);
        if (list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            str.getClass();
            Pattern compile = Pattern.compile(str);
            compile.getClass();
            uri2.getClass();
            if (compile.matcher(uri2).find()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Context b = this.b.b();
        if (b == null) {
            b = this.a;
        }
        if (!(b instanceof Activity)) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        try {
            b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            zi3.a(6, "Exception starting Activity: " + e, null);
            return false;
        }
    }
}
