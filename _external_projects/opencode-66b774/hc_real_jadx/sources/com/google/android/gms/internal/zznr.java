package com.google.android.gms.internal;

import android.text.TextUtils;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznr extends zzno {
    private static String zzan(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.zzno
    public final String zze(String str, String str2) {
        String zzan = zzan(str);
        String zzan2 = zzan(str2);
        if (TextUtils.isEmpty(zzan)) {
            return zzan2;
        }
        if (TextUtils.isEmpty(zzan2)) {
            return zzan;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzan2).length() + String.valueOf(zzan).length() + 1);
        sb.append(zzan);
        sb.append(",");
        sb.append(zzan2);
        return sb.toString();
    }
}
