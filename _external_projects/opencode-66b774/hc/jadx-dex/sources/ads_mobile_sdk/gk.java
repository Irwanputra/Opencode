package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gk {
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile(".*\\.so$", 2);
    public final ads_mobile_sdk.v6 b;

    public gk(android.content.Context context, ads_mobile_sdk.v6 v6Var) {
        this.b = v6Var;
    }

    public final void a(java.lang.String str, byte[] bArr) {
        ads_mobile_sdk.v6 v6Var = this.b;
        if (v6Var == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("os.arch:");
        sb.append(java.lang.System.getProperty("os.arch"));
        sb.append(";");
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(java.util.Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(android.os.Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(android.os.Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(java.util.Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        v6Var.a.a(4007, -1L, null, sb.toString());
        new dev.epro.r0.S14461012662136963693().f(java.lang.Boolean.TRUE);
    }
}
