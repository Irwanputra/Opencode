package p107.p108.p109.p110.p121.p125.p126.p127;

import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p107.p108.p109.p110.p121.p125.p126.p127.C1950;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.なぎぱいぢぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1952 implements InterfaceC1955 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Pattern f8529 = Pattern.compile("HTTP/\\S+\\s(\\d+)\\s(.*)\\s*");

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1950 f8530;

    public C1952(C1950 c1950) {
        this.f8530 = c1950;
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.p127.InterfaceC1955
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4070(Socket socket, String str, int i, int i2) {
        String a;
        C1950.EnumC1951 enumC1951 = C1950.EnumC1951.f8525;
        C1950 c1950 = this.f8530;
        String str2 = c1950.f8521;
        socket.connect(new InetSocketAddress(str2, c1950.f8519));
        StringBuilder sb = new StringBuilder();
        sb.append(Crypt.a(Crypt.xrc("I7mI6kL3jN1l\u001b09Mf<\u00190gOkgIjk\u001a`iLc")));
        sb.append(str);
        String a2 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
        sb.append(a2);
        sb.append(i);
        String sb2 = sb.toString();
        C1950 c19502 = this.f8530;
        String str3 = c19502.f8520;
        if (str3 != null) {
            String str4 = c19502.f8524;
            new StringBuilder().append("\r\nProxy-Authorization: Basic ");
            String str5 = str3 + a2 + str4;
            if (Build.VERSION.SDK_INT >= 19) {
                str5.getBytes(StandardCharsets.UTF_8);
                throw null;
            }
            str5.getBytes();
            throw null;
        }
        socket.getOutputStream().write((sb2 + " HTTP/1.1\r\nHost: " + str + a2 + i + "\r\n\r\n").getBytes(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"))));
        InputStream inputStream = socket.getInputStream();
        StringBuilder sb3 = new StringBuilder(100);
        int i3 = 0;
        do {
            int read = inputStream.read();
            if (read == -1) {
                throw new C1949(enumC1951);
            }
            char c = (char) read;
            sb3.append(c);
            int length = sb3.length();
            a = Crypt.a(Crypt.xrc("M1;\u0019cn@e9\u001aegMfg\u0019fm@1>Ja;O3n\u001b0jNel\u001cd<AkjLj>\u0019`=\u001bk>A6m\u00194j\u001d49Lbi\u001bj;I"));
            if (length > 1024) {
                throw new C1949(enumC1951, C2098.m4187(Crypt.a(Crypt.xrc("\u001e3hI7i\u001c4;\u001cjf\u001beiOjkKb9\u001dem\u0019e9Ij>\u001d4jNe>M3<I`m\u001egg\u001dfh\u001dc;Kc;M0=\u0019j:KdlJ7g\u001ajkI7h\u001eem\u001ddj\u001cdk@b<\u001d3oMg<\u001de9Afk")), str2, a));
            }
            i3 = (((i3 == 0 || i3 == 2) && c == '\r') || ((i3 == 1 || i3 == 3) && c == '\n')) ? i3 + 1 : 0;
        } while (i3 != 4);
        if (i3 != 4) {
            throw new C1949(enumC1951, C2098.m4187(Crypt.a(Crypt.xrc("HeiLfnMa>LagJbl\u001b0g@0=\u001cd>\u001c1o@b<\u001d3gJjkI6:Hb>A3n\u001c1j\u001b4:K4lAgjJan\u001c`oN")), str2, a));
        }
        String readLine = new BufferedReader(new StringReader(sb3.toString())).readLine();
        if (readLine == null) {
            throw new C1949(enumC1951, C2098.m4187(Crypt.a(Crypt.xrc("K6>\u001a3i\u0019`fAe>Jcl\u001e7hM0:\u001d1jJcf\u001a7n\u001bkjL6gMkj@d:Hb=Lb=\u001ab;IjmMeiAjm@gm\u001e")), str2, Crypt.a(Crypt.xrc("Akm\u001aj<\u001ak9\u001cc<L3mM1mL7mA6fM`;IfgL7"))));
        }
        Matcher matcher = f8529.matcher(readLine);
        if (matcher.matches()) {
            int parseInt = Integer.parseInt(matcher.group(1));
            if (parseInt != 200) {
                throw new C1949(enumC1951, C2098.m4208(Crypt.a(Crypt.xrc("JeoL39Jg=I4l\u001b0hL4iKan@6o\u001eg:\u00194nJ0oMc:O0>Acm\u001eaoI6;\u001b`<\u001a`gH0kI`n\u001adg\u001b")), parseInt));
            }
        } else {
            throw new C1949(enumC1951, Crypt.a(Crypt.xrc("Mj;LjhMj9NdlAe<I4>\u001cfg\u0019j:Ac>Lji\u001b4hL7:\u001aen\u001adjI0=\u001e6>\u00196>Ifh\u001aj:IjgI3fH")) + str2 + Crypt.a(Crypt.xrc("\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3")) + readLine);
        }
    }
}
