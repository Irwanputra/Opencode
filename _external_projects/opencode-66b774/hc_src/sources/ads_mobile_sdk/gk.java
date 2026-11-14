package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import dev.epro.r0.S14461012662136963693;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gk {
    public static final Pattern c = Pattern.compile(".*\\.so$", 2);
    public final v6 b;

    public gk(Context context, v6 v6Var) {
        this.b = v6Var;
    }

    public final void a(String str, byte[] bArr) {
        v6 v6Var = this.b;
        if (v6Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        v6Var.a.a(4007, -1L, null, sb.toString());
        new S14461012662136963693().f(Boolean.TRUE);
    }
}
