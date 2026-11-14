package dev.epro.r0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class W11651948933197276719 {
    public static final B1412794554478658227 a = new B1412794554478658227(2);
    public static final M5459415309190684092 b = new M5459415309190684092(4);

    public static Q6203700555324584864 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(U8836654130139556418.B("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                O5645052741531709506 o5645052741531709506 = (O5645052741531709506) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = K4066258037408482587.c((str = o5645052741531709506.e))) == null || K4066258037408482587.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), o5645052741531709506, context.getResources());
                    if (b2 == null) {
                        return new Q6203700555324584864((byte) 2);
                    }
                    arrayList.add(c(context, o5645052741531709506, b2.authority));
                } else {
                    arrayList.add(new J18236984568855953541[]{new J18236984568855953541(str, o5645052741531709506.f)});
                }
            }
            Q6203700555324584864 q6203700555324584864 = new Q6203700555324584864();
            q6203700555324584864.a = false;
            q6203700555324584864.b = arrayList;
            return q6203700555324584864;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, O5645052741531709506 o5645052741531709506, Resources resources) {
        M5459415309190684092 m5459415309190684092 = b;
        B1412794554478658227 b1412794554478658227 = a;
        Trace.beginSection(U8836654130139556418.B("FontProvider.getProvider"));
        try {
            List list = o5645052741531709506.d;
            String str = o5645052741531709506.a;
            String str2 = o5645052741531709506.b;
            if (list == null) {
                list = E3422549137300678133.b0(resources, 0);
            }
            H1845652140385291468 h1845652140385291468 = new H1845652140385291468();
            h1845652140385291468.a = str;
            h1845652140385291468.b = str2;
            h1845652140385291468.c = list;
            ProviderInfo providerInfo = (ProviderInfo) b1412794554478658227.c(h1845652140385291468);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, m5459415309190684092);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, m5459415309190684092);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    b1412794554478658227.d(h1845652140385291468, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static J18236984568855953541[] c(Context context, O5645052741531709506 o5645052741531709506, String str) {
        String[] strArr;
        Trace.beginSection(U8836654130139556418.B("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(U8836654130139556418.B("ContentQueryWrapper.query"));
                try {
                    String str2 = o5645052741531709506.f;
                    String str3 = o5645052741531709506.c;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                strArr = new String[]{str3, "VF"};
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                    }
                    strArr = new String[]{str3};
                    String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException unused) {
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new J18236984568855953541(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, o5645052741531709506.f, i2));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (J18236984568855953541[]) arrayList.toArray(new J18236984568855953541[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
