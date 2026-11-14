package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.L12240044716294895599;
import dev.epro.r0.O5354877807466160604;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
        String strR = rm2Var.r().r();
        boolean zIsEmpty = TextUtils.isEmpty(strR);
        vi3 vi3Var = this.e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file3 = this.b;
            L12240044716294895599.g(file3);
            file3.mkdirs();
            if (TextUtils.isEmpty(strR)) {
                file = null;
            } else {
                file = new File(file3, strR);
                L12240044716294895599.f(file, false);
            }
            file.getClass();
            file.mkdirs();
            File fileD = L12240044716294895599.d(file3, strR, "pcam.jar");
            fileD.getClass();
            if (bArr == null || bArr.length <= 0 || L12240044716294895599.h(fileD, bArr)) {
                File fileD2 = L12240044716294895599.d(file3, strR, "pcbc");
                fileD2.getClass();
                if (L12240044716294895599.h(fileD2, bArr2)) {
                    String strR2 = rm2Var.r().r();
                    if (!TextUtils.isEmpty(strR2)) {
                        File fileD3 = L12240044716294895599.d(file3, strR2, "pcam.jar");
                        fileD3.getClass();
                        File fileD4 = L12240044716294895599.d(file3, strR2, "pcbc");
                        fileD4.getClass();
                        File fileD5 = L12240044716294895599.d(a(), strR2, "pcam.jar");
                        fileD5.getClass();
                        File fileD6 = L12240044716294895599.d(a(), strR2, "pcbc");
                        fileD6.getClass();
                        if (fileD3.exists() && !fileD3.renameTo(fileD5)) {
                            vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_VM_RENAME_FAILED);
                        } else if (fileD4.exists() && fileD4.renameTo(fileD6)) {
                            rm2 rm2VarA = a(1);
                            SharedPreferences.Editor editorEdit = this.c.edit();
                            A8094652504661216977 a8094652504661216977 = this.d;
                            if (rm2VarA != null && !rm2Var.r().r().equals(rm2VarA.r().r())) {
                                editorEdit.putString("FBAMTD" + ((int) ((fk) a8094652504661216977.get()).a), O5354877807466160604.A(rm2VarA.a()));
                            }
                            editorEdit.putString("LATMTD" + ((int) ((fk) a8094652504661216977.get()).a), O5354877807466160604.A(rm2Var.a()));
                            if (!editorEdit.commit()) {
                                vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PUSH_METADATA_FAILURE);
                            }
                        } else {
                            vi3Var.b(yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PROGRAM_BYTECODE_RENAME_FAILED);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    rm2 rm2VarA2 = a(1);
                    if (rm2VarA2 != null) {
                        hashSet.add(rm2VarA2.r().r());
                    }
                    rm2 rm2VarA3 = a(2);
                    if (rm2VarA3 != null) {
                        hashSet.add(rm2VarA3.r().r());
                    }
                    File[] fileArrListFiles = a().listFiles();
                    if (fileArrListFiles == null) {
                        return;
                    }
                    for (File file4 : fileArrListFiles) {
                        String name = file4.getName();
                        if (!hashSet.contains(name)) {
                            File fileA = a();
                            if (TextUtils.isEmpty(name)) {
                                file2 = null;
                            } else {
                                file2 = new File(fileA, name);
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
        File fileD = L12240044716294895599.d(a(), str, "pcam.jar");
        fileD.getClass();
        if (!fileD.exists()) {
            fileD = L12240044716294895599.d(a(), str, "pcam");
            fileD.getClass();
        }
        File fileD2 = L12240044716294895599.d(a(), str, "pcbc");
        fileD2.getClass();
        return fileD.exists() && fileD2.exists();
    }

    public final rm2 a(int i) {
        String string;
        A8094652504661216977 a8094652504661216977 = this.d;
        SharedPreferences sharedPreferences = this.c;
        if (i == 1) {
            string = sharedPreferences.getString("LATMTD" + ((int) ((fk) a8094652504661216977.get()).a), null);
        } else if (i == 2) {
            string = sharedPreferences.getString("FBAMTD" + ((int) ((fk) a8094652504661216977.get()).a), null);
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                int length = string.length();
                if (length % 2 == 0) {
                    int i2 = length / 2;
                    byte[] bArr = new byte[i2];
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = i3 + 2;
                        bArr[i3 / 2] = (byte) Integer.parseInt(string.substring(i3, i4), 16);
                        i3 = i4;
                    }
                    rm2 rm2VarA = rm2.a(sq.a(0, bArr, i2));
                    if (a(rm2VarA.r().r())) {
                        return rm2VarA;
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
