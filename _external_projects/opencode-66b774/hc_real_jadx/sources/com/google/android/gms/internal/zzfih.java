package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfih {
    public static String zzbc(zzfes zzfesVar) {
        String str;
        zzfii zzfiiVar = new zzfii(zzfesVar);
        StringBuilder sb = new StringBuilder(zzfiiVar.size());
        for (int i = 0; i < zzfiiVar.size(); i++) {
            int zzkn = zzfiiVar.zzkn(i);
            if (zzkn == 34) {
                str = "\\\"";
            } else if (zzkn == 39) {
                str = "\\'";
            } else if (zzkn != 92) {
                switch (zzkn) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zzkn < 32 || zzkn > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzkn >>> 6) & 3) + 48));
                            sb.append((char) (((zzkn >>> 3) & 7) + 48));
                            zzkn = (zzkn & 7) + 48;
                        }
                        sb.append((char) zzkn);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
