package dev.epro.v2ray.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import org.jasypt.digest.StandardStringDigester;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.C2673;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Utils {
    public static void clearClipboard(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("copy", null));
        }
    }

    private static boolean copyAsset(AssetManager assetManager, String str, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = assetManager.open(str);
            try {
                new File(str2).createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                try {
                    copyFile(inputStream, fileOutputStream2);
                    inputStream.close();
                    try {
                        fileOutputStream2.close();
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                            return false;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused6) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static boolean copyAssetFolder(AssetManager assetManager, String str, String str2) {
        boolean copyAssetFolder;
        try {
            String[] list = assetManager.list(str);
            new File(str2).mkdirs();
            boolean z = true;
            for (String str3 : list) {
                if (str3.contains(".")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.isEmpty() ? "" : str + "/");
                    sb.append(str3);
                    copyAssetFolder = copyAsset(assetManager, sb.toString(), str2 + "/" + str3);
                } else {
                    copyAssetFolder = copyAssetFolder(assetManager, str + "/" + str3, str2 + "/" + str3);
                }
                z &= copyAssetFolder;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static String decode(String str) {
        try {
            return new String(Base64.decode(str, 2), StandardStringDigester.MESSAGE_CHARSET);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String encode(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(V2rayConfigUtil.TYPE_PROTOCOL == null ? V2rayConfigUtil.VMESS_PROTOCOL : V2rayConfigUtil.TYPE_PROTOCOL);
            sb.append(Base64.encodeToString(str.getBytes(StandardStringDigester.MESSAGE_CHARSET), 2));
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getClipboard(Context context) {
        return ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getText().toString();
    }

    public static ArrayList<String> getDomesticDnsServers(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                if (isPureIpAddress(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static ArrayList<String> getRemoteDnsServers(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                if (isPureIpAddress(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static boolean isIpAddress(String str) {
        try {
            if (str.trim().isEmpty()) {
                return false;
            }
            if (str.indexOf("/") > 0) {
                String[] split = str.split("/");
                if (split.length == 2 && Integer.parseInt(split[1]) > 0) {
                    str = split[0];
                }
            }
            if (str.startsWith("::ffff:") && str.contains(".")) {
                str = str.substring(7);
            } else if (str.startsWith("[::ffff:") && str.contains(".")) {
                str = str.substring(8).replace("]", "");
            }
            String[] split2 = str.split("\\.");
            if (split2.length != 4) {
                return isIpv6Address(str);
            }
            if (split2[3].indexOf(":") > 0) {
                str = str.substring(0, str.indexOf(":"));
            }
            return isIpv4Address(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isIpv4Address(String str) {
        return str.matches("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
    }

    public static boolean isIpv6Address(String str) {
        if (str.indexOf("[") == 0 && str.lastIndexOf("]") > 0) {
            String substring = str.substring(1);
            str = substring.substring(substring.length() - substring.lastIndexOf("]"));
        }
        return str.matches("^((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*::((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*|((?:[0-9A-Fa-f]{1,4}))((?::[0-9A-Fa-f]{1,4})){7}$");
    }

    public static boolean isPureIpAddress(String str) {
        return isIpv4Address(str) || isIpv6Address(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        if (r9 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        r6 = r9.f10089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        r9 = r1.m4648(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        if (r9 != null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.v2ray.util.VmessBean jsonToVmess(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.v2ray.util.Utils.jsonToVmess(java.lang.String):dev.epro.v2ray.util.VmessBean");
    }

    public static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void setClipboard(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy", str));
    }

    public static int share2Clipboard(Context context, String str) {
        try {
            String shareConfig_ = shareConfig_(str);
            if (TextUtils.isEmpty(shareConfig_)) {
                return -1;
            }
            setClipboard(context, shareConfig_);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String shareConfig(String str) {
        VmessBean jsonToVmess = jsonToVmess(str);
        VmessQRCode vmessQRCode = new VmessQRCode();
        vmessQRCode.setV("2");
        vmessQRCode.setPs(UUID.randomUUID().toString().toLowerCase(Locale.ENGLISH));
        vmessQRCode.setType(jsonToVmess.getHeaderType());
        vmessQRCode.setAdd(jsonToVmess.getAddress());
        vmessQRCode.setPort(String.valueOf(jsonToVmess.getPort()));
        vmessQRCode.setId(jsonToVmess.getId());
        vmessQRCode.setAid(String.valueOf(jsonToVmess.getAlterId()));
        vmessQRCode.setHost(jsonToVmess.getRequestHost());
        vmessQRCode.setPath(jsonToVmess.getPath());
        vmessQRCode.setNet(jsonToVmess.getNetwork());
        vmessQRCode.setTls(jsonToVmess.getStreamSecurity());
        return encode(new C2673().m4645(vmessQRCode));
    }

    public static String shareConfig_(String str) {
        VmessBean jsonToVmess = jsonToVmess(str);
        int i = jsonToVmess.configType;
        if (i == EConfigType.VMESS.value) {
            VmessQRCode vmessQRCode = new VmessQRCode();
            vmessQRCode.v = String.valueOf(jsonToVmess.configVersion);
            vmessQRCode.ps = jsonToVmess.remarks;
            vmessQRCode.add = jsonToVmess.address;
            vmessQRCode.port = String.valueOf(jsonToVmess.port);
            vmessQRCode.id = jsonToVmess.id;
            vmessQRCode.aid = String.valueOf(jsonToVmess.alterId);
            vmessQRCode.f10540net = jsonToVmess.network;
            vmessQRCode.type = jsonToVmess.headerType;
            vmessQRCode.host = jsonToVmess.requestHost;
            vmessQRCode.path = jsonToVmess.path;
            vmessQRCode.tls = jsonToVmess.streamSecurity;
            String m4645 = new C2673().m4645(vmessQRCode);
            StringBuilder m4207 = C2098.m4207(V2rayConfigUtil.VMESS_PROTOCOL);
            m4207.append(encode(m4645));
            return m4207.toString();
        }
        if (i == EConfigType.SHADOWSOCKS.value) {
            StringBuilder m42072 = C2098.m4207("#");
            m42072.append(urlEncode(jsonToVmess.remarks));
            String sb = m42072.toString();
            String format = String.format("%s:%s@%s:%s", jsonToVmess.security, jsonToVmess.id, jsonToVmess.address, Integer.valueOf(jsonToVmess.port));
            StringBuilder m42073 = C2098.m4207(V2rayConfigUtil.SS_PROTOCOL);
            m42073.append(encode(format));
            m42073.append(sb);
            return m42073.toString();
        }
        if (i != EConfigType.SOCKS.value) {
            return "";
        }
        StringBuilder m42074 = C2098.m4207("#");
        m42074.append(urlEncode(jsonToVmess.remarks));
        String sb2 = m42074.toString();
        String format2 = String.format("%s:%s", jsonToVmess.address, Integer.valueOf(jsonToVmess.port));
        StringBuilder m42075 = C2098.m4207(V2rayConfigUtil.SOCKS_PROTOCOL);
        m42075.append(encode(format2));
        m42075.append(sb2);
        return m42075.toString();
    }

    public static String urlDecode(String str) {
        try {
            return URLDecoder.decode(str, StandardStringDigester.MESSAGE_CHARSET);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, StandardStringDigester.MESSAGE_CHARSET);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String userAssetPath(Context context) {
        if (context == null) {
            return "";
        }
        File externalFilesDir = context.getExternalFilesDir("assets");
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : context.getDir("assets", 0).getAbsolutePath();
    }
}
