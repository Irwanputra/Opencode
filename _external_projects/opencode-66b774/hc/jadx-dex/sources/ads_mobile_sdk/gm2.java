package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gm2 {
    public final java.io.File a;
    public final java.io.File b;
    public final android.content.SharedPreferences c;
    public final dev.epro.r0.A8094652504661216977 d;
    public final ads_mobile_sdk.vi3 e;

    public gm2(android.content.Context context, android.content.SharedPreferences sharedPreferences, dev.epro.r0.A8094652504661216977 a8094652504661216977, ads_mobile_sdk.vi3 vi3Var) {
        this.c = sharedPreferences;
        java.io.File dir = context.getDir("pccache2", 0);
        dev.epro.r0.L12240044716294895599.f(dir, false);
        this.a = dir;
        java.io.File dir2 = context.getDir("tmppccache2", 0);
        dev.epro.r0.L12240044716294895599.f(dir2, true);
        this.b = dir2;
        this.d = a8094652504661216977;
        this.e = vi3Var;
    }

    public final void a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        java.io.File file;
        java.io.File file2;
        java.lang.String strR = rm2Var.r().r();
        boolean zIsEmpty = android.text.TextUtils.isEmpty(strR);
        ads_mobile_sdk.vi3 vi3Var = this.e;
        if (!zIsEmpty && bArr2.length != 0) {
            java.io.File file3 = this.b;
            dev.epro.r0.L12240044716294895599.g(file3);
            file3.mkdirs();
            if (android.text.TextUtils.isEmpty(strR)) {
                file = null;
            } else {
                file = new java.io.File(file3, strR);
                dev.epro.r0.L12240044716294895599.f(file, false);
            }
            file.getClass();
            file.mkdirs();
            java.io.File fileD = dev.epro.r0.L12240044716294895599.d(file3, strR, "pcam.jar");
            fileD.getClass();
            if (bArr == null || bArr.length <= 0 || dev.epro.r0.L12240044716294895599.h(fileD, bArr)) {
                java.io.File fileD2 = dev.epro.r0.L12240044716294895599.d(file3, strR, "pcbc");
                fileD2.getClass();
                if (dev.epro.r0.L12240044716294895599.h(fileD2, bArr2)) {
                    java.lang.String strR2 = rm2Var.r().r();
                    if (!android.text.TextUtils.isEmpty(strR2)) {
                        java.io.File fileD3 = dev.epro.r0.L12240044716294895599.d(file3, strR2, "pcam.jar");
                        fileD3.getClass();
                        java.io.File fileD4 = dev.epro.r0.L12240044716294895599.d(file3, strR2, "pcbc");
                        fileD4.getClass();
                        java.io.File fileD5 = dev.epro.r0.L12240044716294895599.d(a(), strR2, "pcam.jar");
                        fileD5.getClass();
                        java.io.File fileD6 = dev.epro.r0.L12240044716294895599.d(a(), strR2, "pcbc");
                        fileD6.getClass();
                        if (fileD3.exists() && !fileD3.renameTo(fileD5)) {
                            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_VM_RENAME_FAILED);
                        } else if (fileD4.exists() && fileD4.renameTo(fileD6)) {
                            ads_mobile_sdk.rm2 rm2VarA = a(1);
                            android.content.SharedPreferences.Editor editorEdit = this.c.edit();
                            dev.epro.r0.A8094652504661216977 a8094652504661216977 = this.d;
                            if (rm2VarA != null && !rm2Var.r().r().equals(rm2VarA.r().r())) {
                                editorEdit.putString("FBAMTD" + ((int) ((ads_mobile_sdk.fk) a8094652504661216977.get()).a), dev.epro.r0.O5354877807466160604.A(rm2VarA.a()));
                            }
                            editorEdit.putString("LATMTD" + ((int) ((ads_mobile_sdk.fk) a8094652504661216977.get()).a), dev.epro.r0.O5354877807466160604.A(rm2Var.a()));
                            if (!editorEdit.commit()) {
                                vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PUSH_METADATA_FAILURE);
                            }
                        } else {
                            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PROGRAM_BYTECODE_RENAME_FAILED);
                        }
                    }
                    java.util.HashSet hashSet = new java.util.HashSet();
                    ads_mobile_sdk.rm2 rm2VarA2 = a(1);
                    if (rm2VarA2 != null) {
                        hashSet.add(rm2VarA2.r().r());
                    }
                    ads_mobile_sdk.rm2 rm2VarA3 = a(2);
                    if (rm2VarA3 != null) {
                        hashSet.add(rm2VarA3.r().r());
                    }
                    java.io.File[] fileArrListFiles = a().listFiles();
                    if (fileArrListFiles == null) {
                        return;
                    }
                    for (java.io.File file4 : fileArrListFiles) {
                        java.lang.String name = file4.getName();
                        if (!hashSet.contains(name)) {
                            java.io.File fileA = a();
                            if (android.text.TextUtils.isEmpty(name)) {
                                file2 = null;
                            } else {
                                file2 = new java.io.File(fileA, name);
                                dev.epro.r0.L12240044716294895599.f(file2, false);
                            }
                            file2.getClass();
                            dev.epro.r0.L12240044716294895599.g(file2);
                        }
                    }
                    return;
                }
            }
        }
        vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_SAVE_TEMP_PROGRAM_FAILURE);
    }

    public final boolean a(java.lang.String str) {
        java.io.File fileD = dev.epro.r0.L12240044716294895599.d(a(), str, "pcam.jar");
        fileD.getClass();
        if (!fileD.exists()) {
            fileD = dev.epro.r0.L12240044716294895599.d(a(), str, "pcam");
            fileD.getClass();
        }
        java.io.File fileD2 = dev.epro.r0.L12240044716294895599.d(a(), str, "pcbc");
        fileD2.getClass();
        return fileD.exists() && fileD2.exists();
    }

    public final ads_mobile_sdk.rm2 a(int i) {
        java.lang.String string;
        dev.epro.r0.A8094652504661216977 a8094652504661216977 = this.d;
        android.content.SharedPreferences sharedPreferences = this.c;
        if (i == 1) {
            string = sharedPreferences.getString("LATMTD" + ((int) ((ads_mobile_sdk.fk) a8094652504661216977.get()).a), null);
        } else if (i == 2) {
            string = sharedPreferences.getString("FBAMTD" + ((int) ((ads_mobile_sdk.fk) a8094652504661216977.get()).a), null);
        } else {
            string = null;
        }
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                int length = string.length();
                if (length % 2 == 0) {
                    int i2 = length / 2;
                    byte[] bArr = new byte[i2];
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = i3 + 2;
                        bArr[i3 / 2] = (byte) java.lang.Integer.parseInt(string.substring(i3, i4), 16);
                        i3 = i4;
                    }
                    ads_mobile_sdk.rm2 rm2VarA = ads_mobile_sdk.rm2.a(ads_mobile_sdk.sq.a(0, bArr, i2));
                    if (a(rm2VarA.r().r())) {
                        return rm2VarA;
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("Hex string has odd number of characters");
                }
            } catch (ads_mobile_sdk.yi1 unused) {
                this.e.b(ads_mobile_sdk.yk0.EVENT_ID_DG_STORAGE_PROGRAM_CACHE_PARSE_METADATA_EXCEPTION);
                return null;
            }
        }
        return null;
    }

    public final java.io.File a() {
        java.io.File file = new java.io.File(this.a, java.lang.Integer.toString(((ads_mobile_sdk.fk) this.d.get()).a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
