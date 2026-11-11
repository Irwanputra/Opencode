package p107.p108.p109.p110.p113;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1843 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Uri f8213;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static boolean m3953(String str) {
        return new File(str).exists();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m3954(Context context, Uri uri, String str, String[] strArr) {
        String a = Crypt.a(Crypt.xrc("I3i\u001aa:\u0019kh\u001cc=\u001e0>\u001ae;Iam\u001a3=\u001dc=\u001cjjOe"));
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{a}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(a));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m3955(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex(Crypt.a(Crypt.xrc("\u001e7<Iek\u001d3l@e:\u001b4f\u001be=I1n\u001bb>\u001ef;J7>Hc")));
        int columnIndex2 = query.getColumnIndex(Crypt.a(Crypt.xrc("N4m\u001b4h\u001d`fN4o\u0019ahAflMc:\u001ek<Lb9N4hNb")));
        query.moveToFirst();
        String string = query.getString(columnIndex);
        Long.toString(query.getLong(columnIndex2));
        File file = new File(context.getFilesDir(), string);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(openInputStream.available(), 1048576)];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file.getPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if (m3953(r15) != false) goto L21;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: づざかべべ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3956(android.content.Context r14, android.net.Uri r15) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p113.C1843.m3956(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static boolean m3957(Uri uri) {
        if (!Crypt.a(Crypt.xrc("\u001a0;\u001c3<\u001cb<L3mAgl\u00190>H0j\u001cck\u0019clK7<H7<A3gI1>\u00193;\u001d`<@ajI4iKemMk:\u001ajmLgo\u0019d>HkfKf:KgnH7j\u001cc<I1;NgnI7j\u001e09@do")).equals(uri.getAuthority())) {
            if (!Crypt.a(Crypt.xrc("\u001a0;\u001c3<\u001cb<L3mAgl\u00190>H0j\u001cck\u0019clK7<H7<A3gI1>\u00193;\u001d`<@ajI4iKemMk:\u001ajmLgo\u0019cn\u001e1kJ0mMco\u001e`>\u001baf@7o\u001a6;\u001ebn\u001dfo\u001bb:")).equals(uri.getAuthority())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static String m3958(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex(Crypt.a(Crypt.xrc("\u001e7<Iek\u001d3l@e:\u001b4f\u001be=I1n\u001bb>\u001ef;J7>Hc")));
        int columnIndex2 = query.getColumnIndex(Crypt.a(Crypt.xrc("N4m\u001b4h\u001d`fN4o\u0019ahAflMc:\u001ek<Lb9N4hNb")));
        query.moveToFirst();
        String string = query.getString(columnIndex);
        Long.toString(query.getLong(columnIndex2));
        File file = new File(context.getCacheDir(), string);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(openInputStream.available(), 1048576)];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
        return file.getPath();
    }
}
