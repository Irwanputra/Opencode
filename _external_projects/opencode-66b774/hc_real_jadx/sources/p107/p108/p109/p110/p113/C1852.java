package p107.p108.p109.p110.p113;

import android.os.Build;
import android.webkit.WebView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1852 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int f8234 = Build.VERSION.SDK_INT;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String f8230 = Build.VERSION.RELEASE;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String f8233 = Build.MANUFACTURER;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static String f8237 = Build.MODEL;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String f8235 = Build.ID;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static String f8236 = Build.BOARD;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static String f8231 = Build.BRAND;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static String f8229 = Build.DEVICE;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static String f8238 = Build.PRODUCT;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final String[] f8232 = {Crypt.a(Crypt.xrc("Nkk\u001a4:Hb>Akm\u001bc;O7;\u001e6jLkk\u0019a9\u001dcj\u001e4")), Crypt.a(Crypt.xrc("JekAdm\u001e7=\u001eggIb;@`=@ajN4;@6fJ`9\u001c7")), Crypt.a(Crypt.xrc("Nal\u001bciM6:\u001b0l\u00190iOj>L3h\u001c39Ad=\u0019ekH1")), Crypt.a(Crypt.xrc("Abj\u001eck@ghI3>\u00194kN6fMklL3;Ngl\u001cg:@a")), Crypt.a(Crypt.xrc("\u001bkjLbkK0>\u001c19Nch\u001dfoM4=AekIk9\u001ee>\u0019a")), Crypt.a(Crypt.xrc("\u001ddo\u001b1<H7g\u001a0;\u001e7m\u001a1:\u001cc:\u001d`lKdj\u001a`;Ja")), Crypt.a(Crypt.xrc("Jj9Jgh\u001c7kA3;Hc=IbfM3;M4lJboL1jN6"))};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m3975(long j, Locale locale) {
        String[] strArr = f8232;
        if (j < 1024) {
            return j + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + strArr[0];
        }
        double d = j;
        int log = (int) (Math.log(d) / Math.log(1024.0d));
        String str = strArr[log];
        double pow = Math.pow(1024.0d, log);
        Double.isNaN(d);
        Double.isNaN(d);
        return String.format(locale, Crypt.a(Crypt.xrc("\u00196i\u001e7n\u001ddn\u001b6=\u001dk9I1:O0kKjlKa=OakM4")), Double.valueOf(d / pow), str);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m3976(String str) {
        String userAgentString = new WebView(App.f3759).getSettings().getUserAgentString();
        StringBuilder m4207 = C2098.m4207(userAgentString);
        m4207.append(f8234);
        m4207.append(f8230);
        m4207.append(f8233);
        m4207.append(f8237);
        m4207.append(f8235);
        m4207.append(f8236);
        m4207.append(f8231);
        m4207.append(f8229);
        String m4198 = C2098.m4198(m4207, f8238, str);
        if (userAgentString.contains(f8230) && userAgentString.contains(f8237) && userAgentString.contains(f8235)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001eao\u001daf\u001a`j\u001ddn\u001d4i\u001c1nOaiH6h\u001ba=O`:N7")));
                messageDigest.update(m4198.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    while (hexString.length() < 2) {
                        hexString = Crypt.a(Crypt.xrc("\u001b6kN0k\u001d3mL1=\u001e0>M3f\u001ekfK49Kcm\u001bg;Ig")) + hexString;
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return Crypt.a(Crypt.xrc("\u001adg\u001bdmAfj\u001agjJfoA4h\u001cbmNai\u001bj:\u001eb=Mb"));
    }
}
