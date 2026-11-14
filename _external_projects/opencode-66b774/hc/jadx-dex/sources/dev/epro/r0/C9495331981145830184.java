package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C9495331981145830184 {
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^([-+]?(?:[0-9][0-9_]*)\\.[0-9_]*(?:[eE][-+]?[0-9]+)?|[-+]?(?:[0-9][0-9_]*)(?:[eE][-+]?[0-9]+)|[-+]?\\.[0-9_]+(?:[eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^(?:[-+]?0b_*[0-1][0-1_]*|[-+]?0_*[0-7][0-7_]*|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x_*[0-9a-fA-F][0-9a-fA-F_]*|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("^(?:<<)$");
    public static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("^$");
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final java.util.regex.Pattern i;
    public java.util.HashMap a;

    static {
        java.util.regex.Pattern.compile("^(?:=)$");
        i = java.util.regex.Pattern.compile("^(?:!|&|\\*)$");
    }

    public final void a(dev.epro.r0.Q3622318280241842965 q3622318280241842965, java.util.regex.Pattern pattern, java.lang.String str, int i2) {
        java.util.HashMap map = this.a;
        if (pattern == null) {
            dev.epro.r0.Q11088980322693754445.m("No pattern provided for Tag=", q3622318280241842965);
            return;
        }
        if (str == null) {
            java.util.List arrayList = (java.util.List) map.get(null);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map.put(null, arrayList);
            }
            arrayList.add(new dev.epro.r0.M3063085266142123894(q3622318280241842965, pattern, i2));
            return;
        }
        for (char c2 : str.toCharArray()) {
            java.lang.Character chValueOf = java.lang.Character.valueOf(c2);
            if (c2 == 0) {
                chValueOf = null;
            }
            java.util.List arrayList2 = (java.util.List) map.get(chValueOf);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                map.put(chValueOf, arrayList2);
            }
            arrayList2.add(new dev.epro.r0.M3063085266142123894(q3622318280241842965, pattern, i2));
        }
    }

    public final dev.epro.r0.Q3622318280241842965 b(dev.epro.r0.Q2936994053173258289 q2936994053173258289, java.lang.String str, boolean z) {
        java.util.HashMap map = this.a;
        if (q2936994053173258289 == dev.epro.r0.Q2936994053173258289.a && z) {
            java.util.List<dev.epro.r0.M3063085266142123894> list = str.isEmpty() ? (java.util.List) map.get((char) 0) : (java.util.List) map.get(java.lang.Character.valueOf(str.charAt(0)));
            if (list != null) {
                for (dev.epro.r0.M3063085266142123894 m3063085266142123894 : list) {
                    dev.epro.r0.Q3622318280241842965 q3622318280241842965 = m3063085266142123894.a;
                    java.util.regex.Pattern pattern = m3063085266142123894.b;
                    if (str.length() <= m3063085266142123894.c && pattern.matcher(str).matches()) {
                        return q3622318280241842965;
                    }
                }
            }
            if (map.containsKey(null)) {
                for (dev.epro.r0.M3063085266142123894 m30630852661421238942 : (java.util.List) map.get(null)) {
                    dev.epro.r0.Q3622318280241842965 q36223182802418429652 = m30630852661421238942.a;
                    java.util.regex.Pattern pattern2 = m30630852661421238942.b;
                    if (str.length() <= m30630852661421238942.c && pattern2.matcher(str).matches()) {
                        return q36223182802418429652;
                    }
                }
            }
        }
        int iOrdinal = q2936994053173258289.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? dev.epro.r0.Q3622318280241842965.p : dev.epro.r0.Q3622318280241842965.o : dev.epro.r0.Q3622318280241842965.n;
    }
}
