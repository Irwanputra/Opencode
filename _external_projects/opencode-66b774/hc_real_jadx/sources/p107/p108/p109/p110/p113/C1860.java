package p107.p108.p109.p110.p113;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1860 {
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m3978(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean m3979(String str) {
        List asList = Arrays.asList(Crypt.a(Crypt.xrc("\u00191lA`<Kf;Lkn\u00193<@coLb=\u001e3nO3=O3h\u00196")), Crypt.a(Crypt.xrc("H0mLe<@f:N0o@`kH7:J6nK7<N6k\u001ejm\u001e`")), Crypt.a(Crypt.xrc("\u001d6>\u001bk;Ja9M3nKa=O0=@ai\u001e0mLbh\u001d1mM6")), Crypt.a(Crypt.xrc("J6hLblMakJ3<M7k\u001dehAk9\u001cegL3i\u001bdn\u001e4")), Crypt.a(Crypt.xrc("L0hMdoIk9@jo\u001eglIa>\u001b1=\u001edlM1m\u001cf>\u001ej")), Crypt.a(Crypt.xrc("J49\u001d7;H7;N3iNgm\u001aa9\u001cjg\u001adhJe=\u00194oIg")), Crypt.a(Crypt.xrc("L7hAfi\u001cbf@3gJeg\u001c1jMjk\u001b4<O6lKj>Lf")), Crypt.a(Crypt.xrc("Oc<\u001af=O6jA1:KaoOgk\u001dg<\u00196hH4h\u001cfg\u001dd;McoJd>Kdk\u001cjo\u001c4:OkjL0jN0oLdi\u0019dk@")), Crypt.a(Crypt.xrc("Hfk\u001bfk\u001de=Od:JdiIafN1>\u0019dnMgmOj>@b")), Crypt.a(Crypt.xrc("\u001caiH4iOjn\u001dk:\u001bag\u001ccj\u001aa=\u001e0mA7<K4lMb")), Crypt.a(Crypt.xrc("AbkH0kAkoAbi\u001a4lH1kNjjJ0=\u001a6jH1:\u001aa")), Crypt.a(Crypt.xrc("Hjj\u001adlMgkLd:\u0019k9\u001edm\u001b4<\u001beoAe:Nk;\u001ae")), Crypt.a(Crypt.xrc("AjoIcj@7k\u001be=J0>\u0019e=\u001bjgA1oJc9\u001aei@6")), Crypt.a(Crypt.xrc("Mk9Ijh\u001dj9I1h@3gNgk@0jA4i\u001d6n\u001a7kAk")));
        for (int i = 0; i < asList.size(); i++) {
            if (str.equals(asList.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m3980(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
