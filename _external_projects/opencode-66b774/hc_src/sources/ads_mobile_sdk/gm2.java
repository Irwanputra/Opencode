package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.L12240044716294895599;
import dev.epro.r0.O5354877807466160604;
import java.io.File;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gm2 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final A8094652504661216977 d;
    public final vi3 e;

    public gm2(Context context, SharedPreferences sharedPreferences, A8094652504661216977 a8094652504661216977, vi3 vi3Var) {
        this.c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        L12240044716294895599.f(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        L12240044716294895599.f(dir2, true);
        this.b = dir2;
        this.d = a8094652504661216977;
        this.e = vi3Var;
    }

    public final void a(rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        File file;
        File file2;
        String r = rm2Var.r().r();
        boolean isEmpty = TextUtils.isEmpty(r);
        vi3 vi3Var = this.e;
        if (!isEmpty && bArr2.length != 0) {
            File file3 = this.b;
            L12240044716294895599.g(file3);
            file3.mkdirs();
            if (TextUtils.isEmpty(r)) {
                file = null;
            } else {
                file = new File(file3, r);
                L12240044716294895599.f(file, false);
            }
            file.getClass();
            file.mkdirs();
            File d = L12240044716294895599.d(file3, r, "pcam.jar");
            d.getClass();
            if (bArr == null || bArr.length <= 0 || L12240044716294895599.h(d, bArr)) {
                File d2 = L12240044716294895599.d(file3, r, "pcbc");
                d2.getClass();
                if (L12240044716294895599.h(d2, bArr2)) {
                    String r2 = rm2Var.r().r();
                    if (!TextUtils.isEmpty(r2)) {
                        File d3 = L12240044716294895599.d(file3, r2, "pcam.jar");
                        d3.getClass();
                        File d4 = L12240044716294895599.d(file3, r2, "pcbc");
                        d4.getClass();
                        File d5 = L12240044716294895599.d(a(), r2, "pcam.jar");
                        d5.getClass();
                        File d6 = L12240044716294895599.d(a(), r2, "pcbc");
                        d6.getClass();
                        if (d3.exists() && !d3.renameTo(d5)) {
                            vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_VM_RENAME_FAILED);
                        } else if (d4.exists() && d4.renameTo(d6)) {
                            rm2 a = a(1);
                            SharedPreferences.Editor edit = this.c.edit();
                            A8094652504661216977 a8094652504661216977 = this.d;
                            if (a != null && !rm2Var.r().r().equals(a.r().r())) {
                                edit.putString("FBAMTD" + ((int) ((fk) a8094652504661216977.get()).a), O5354877807466160604.A(a.a()));
                            }
                            edit.putString("LATMTD" + ((int) ((fk) a8094652504661216977.get()).a), O5354877807466160604.A(rm2Var.a()));
                            if (!edit.commit()) {
                                vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PUSH_METADATA_FAILURE);
                            }
                        } else {
                            vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PROGRAM_BYTECODE_RENAME_FAILED);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    rm2 a2 = a(1);
                    if (a2 != null) {
                        hashSet.add(a2.r().r());
                    }
                    rm2 a3 = a(2);
                    if (a3 != null) {
                        hashSet.add(a3.r().r());
                    }
                    File[] listFiles = a().listFiles();
                    if (listFiles == null) {
                        return;
                    }
                    for (File file4 : listFiles) {
                        String name = file4.getName();
                        if (!hashSet.contains(name)) {
                            File a4 = a();
                            if (TextUtils.isEmpty(name)) {
                                file2 = null;
                            } else {
                                file2 = new File(a4, name);
                                L12240044716294895599.f(file2, false);
                            }
                            file2.getClass();
                            L12240044716294895599.g(file2);
                        }
                    }
                    return;
                }
            }
        }
        vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_SAVE_TEMP_PROGRAM_FAILURE);
    }

    public final boolean a(String str) {
        File d = L12240044716294895599.d(a(), str, "pcam.jar");
        d.getClass();
        if (!d.exists()) {
            d = L12240044716294895599.d(a(), str, "pcam");
            d.getClass();
        }
        File d2 = L12240044716294895599.d(a(), str, "pcbc");
        d2.getClass();
        return d.exists() && d2.exists();
    }

    public final rm2 a(int i) {
        String str;
        A8094652504661216977 a8094652504661216977 = this.d;
        SharedPreferences sharedPreferences = this.c;
        if (i == 1) {
            str = sharedPreferences.getString("LATMTD" + ((int) ((fk) a8094652504661216977.get()).a), null);
        } else if (i == 2) {
            str = sharedPreferences.getString("FBAMTD" + ((int) ((fk) a8094652504661216977.get()).a), null);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                int length = str.length();
                if (length % 2 == 0) {
                    int i2 = length / 2;
                    byte[] bArr = new byte[i2];
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = i3 + 2;
                        bArr[i3 / 2] = (byte) Integer.parseInt(str.substring(i3, i4), 16);
                        i3 = i4;
                    }
                    rm2 a = rm2.a(sq.a(0, bArr, i2));
                    if (a(a.r().r())) {
                        return a;
                    }
                } else {
                    throw new IllegalArgumentException("Hex string has odd number of characters");
                }
            } catch (yi1 unused) {
                this.e.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PARSE_METADATA_EXCEPTION);
                return null;
            }
        }
        return null;
    }

    public final File a() {
        File file = new File(this.a, Integer.toString(((fk) this.d.get()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
