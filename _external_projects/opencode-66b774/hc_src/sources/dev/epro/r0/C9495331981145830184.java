package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C9495331981145830184 {
    public static final Pattern b = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final Pattern c = Pattern.compile("^([-+]?(?:[0-9][0-9_]*)\\.[0-9_]*(?:[eE][-+]?[0-9]+)?|[-+]?(?:[0-9][0-9_]*)(?:[eE][-+]?[0-9]+)|[-+]?\\.[0-9_]+(?:[eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final Pattern d = Pattern.compile("^(?:[-+]?0b_*[0-1][0-1_]*|[-+]?0_*[0-7][0-7_]*|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x_*[0-9a-fA-F][0-9a-fA-F_]*|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final Pattern e = Pattern.compile("^(?:<<)$");
    public static final Pattern f = Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final Pattern g = Pattern.compile("^$");
    public static final Pattern h = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final Pattern i;
    public HashMap a;

    static {
        Pattern.compile("^(?:=)$");
        i = Pattern.compile("^(?:!|&|\\*)$");
    }

    public final void a(Q3622318280241842965 q3622318280241842965, Pattern pattern, String str, int i2) {
        HashMap hashMap = this.a;
        if (pattern == null) {
            Q11088980322693754445.m("No pattern provided for Tag=", q3622318280241842965);
            return;
        }
        if (str == null) {
            List list = (List) hashMap.get(null);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(null, list);
            }
            list.add(new M3063085266142123894(q3622318280241842965, pattern, i2));
            return;
        }
        for (char c2 : str.toCharArray()) {
            Character valueOf = Character.valueOf(c2);
            if (c2 == 0) {
                valueOf = null;
            }
            List list2 = (List) hashMap.get(valueOf);
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap.put(valueOf, list2);
            }
            list2.add(new M3063085266142123894(q3622318280241842965, pattern, i2));
        }
    }

    public final Q3622318280241842965 b(Q2936994053173258289 q2936994053173258289, String str, boolean z) {
        HashMap hashMap = this.a;
        if (q2936994053173258289 == Q2936994053173258289.a && z) {
            List<M3063085266142123894> list = str.isEmpty() ? (List) hashMap.get((char) 0) : (List) hashMap.get(Character.valueOf(str.charAt(0)));
            if (list != null) {
                for (M3063085266142123894 m3063085266142123894 : list) {
                    Q3622318280241842965 q3622318280241842965 = m3063085266142123894.a;
                    Pattern pattern = m3063085266142123894.b;
                    if (str.length() <= m3063085266142123894.c && pattern.matcher(str).matches()) {
                        return q3622318280241842965;
                    }
                }
            }
            if (hashMap.containsKey(null)) {
                for (M3063085266142123894 m30630852661421238942 : (List) hashMap.get(null)) {
                    Q3622318280241842965 q36223182802418429652 = m30630852661421238942.a;
                    Pattern pattern2 = m30630852661421238942.b;
                    if (str.length() <= m30630852661421238942.c && pattern2.matcher(str).matches()) {
                        return q36223182802418429652;
                    }
                }
            }
        }
        int ordinal = q2936994053173258289.ordinal();
        return ordinal != 0 ? ordinal != 1 ? Q3622318280241842965.p : Q3622318280241842965.f452o : Q3622318280241842965.n;
    }
}
