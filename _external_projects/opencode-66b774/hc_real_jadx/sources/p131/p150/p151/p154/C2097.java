package p131.p150.p151.p154;

import java.io.File;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.ぺふねづ〺.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2097 {
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4174(File file) {
        boolean z = true;
        if (!(file != null && file.exists())) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File file2 : listFiles) {
            z |= m4174(file2);
        }
        return file.delete() | z;
    }
}
