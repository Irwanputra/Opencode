package p131.p132.p133;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: なぎぱいぢぎ.〳ぜぞぜべっ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1971 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final String[] f8590 = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final String[] f8588 = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final String[] f8589 = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String[] m4090() {
        Object[] array;
        ArrayList arrayList = new ArrayList(Arrays.asList(f8588));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            array = arrayList.toArray(new String[0]);
        } else {
            String[] split = str.split(":");
            int length = split.length;
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                if (!str2.endsWith("/")) {
                    str2 = str2 + '/';
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            array = arrayList.toArray(new String[0]);
        }
        return (String[]) array;
    }
}
