package p107.p108.p109.p110.p121.p125.p126;

import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1948 {
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4064(String str) {
        m4069(Crypt.a(Crypt.xrc("LbnIejLkjIaf\u001ejlH7h\u001a3<Oeh\u001cfj\u0019c<Og")) + str);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m4065(InetAddress inetAddress) {
        if (inetAddress == null) {
            return Crypt.a(Crypt.xrc("NanM4>H1j\u001edlJe<N1lO6kH7n@a>Acg\u001e7"));
        }
        return inetAddress.getHostName() + Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")) + inetAddress.getHostAddress();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4066(Exception exc) {
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001be=I`hL3oH4lO4kL4;IdnHkgAe=\u001dfm\u001b0")));
        m4207.append(exc.toString());
        m4069(m4207.toString());
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static String m4067(DatagramPacket datagramPacket) {
        if (datagramPacket == null) {
            return Crypt.a(Crypt.xrc("Jbh\u001a3iMc:\u001cf>Jek@`>\u001bf9JkjHboM6<Jg"));
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001befKkoLdkM`hA4k\u001bfiIah@biI1k\u001d0o@c")));
        m4207.append(m4065(datagramPacket.getAddress()));
        m4207.append(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
        m4207.append(datagramPacket.getPort());
        m4207.append(Crypt.a(Crypt.xrc("ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g")));
        return m4207.toString();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static String m4068(Socket socket) {
        if (socket == null) {
            return Crypt.a(Crypt.xrc("Jbh\u001a3iMc:\u001cf>Jek@`>\u001bf9JkjHboM6<Jg"));
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001befKkoLdkM`hA4k\u001bfiIah@biI1k\u001d0o@c")));
        m4207.append(m4065(socket.getInetAddress()));
        m4207.append(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
        m4207.append(socket.getPort());
        m4207.append(Crypt.a(Crypt.xrc("ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g")));
        return m4207.toString();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m4069(String str) {
        String m4205 = C2098.m4205(str, "\r\n");
        if (m4205 == null) {
            return;
        }
        PrintStream printStream = System.out;
        if (m4205.contains(Crypt.a(Crypt.xrc("L6lH`k\u001a49Ofj\u001dcf\u001bkjOekL`l\u0019anMc>Jf"))) || m4205.contains(Crypt.a(Crypt.xrc("OkoO0kNbiN1hHf:A6l\u001a7jH`jL4l\u001d09@1"))) || m4205.toLowerCase().startsWith(Crypt.a(Crypt.xrc("\u001dgn\u001bchKek\u001ej:\u001ddg@7lL0k\u001a1jL`:L3n\u001b7")))) {
            return;
        }
        try {
            InterfaceC1837 interfaceC1837 = App.f3760;
            if (Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2])) {
                return;
            }
            InterfaceC1837 interfaceC18372 = App.f3760;
            if (Boolean.parseBoolean(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[15])) {
                return;
            }
            C1687.m3666(Crypt.a(Crypt.xrc("N`hAjm\u001b39AblNc9\u001affK7h\u001cfm\u001b6mL6nAj")), Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")) + m4205.replace(Crypt.a(Crypt.xrc("\u001befKkoLdkM`hA4k\u001bfiIah@biI1k\u001d0o@c")), Crypt.a(Crypt.xrc("HbgL7h@eiM6i\u0019k9@d=\u001cglLbj@kf\u001c1n\u0019c"))).replace(Crypt.a(Crypt.xrc("ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g")), Crypt.a(Crypt.xrc("Ld;HeoMkfJb>\u001dkl\u0019g>LbiN7i\u001cg=@4m\u001bc"))).replace("\r\n", ""));
        } catch (Exception unused) {
        }
    }
}
