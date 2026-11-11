package p107.p108.p109.p110.p121.p125.p126.p127;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p107.p108.p109.p110.p121.p125.p126.p127.C1950;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.なぎぱいぢぎ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1953 implements InterfaceC1955 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1950 f8531;

    public C1953(C1950 c1950) {
        this.f8531 = c1950;
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.p127.InterfaceC1955
    /* renamed from: げつ〴ぬぐ */
    public void mo4070(Socket socket, String str, int i, int i2) {
        C1950.EnumC1951 enumC1951 = C1950.EnumC1951.f8526;
        C1950 c1950 = this.f8531;
        String str2 = c1950.f8521;
        int i3 = c1950.f8519;
        String str3 = c1950.f8520;
        socket.connect(new InetSocketAddress(str2, i3), i2);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        OutputStream outputStream = socket.getOutputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i & Base64.BASELENGTH);
        byteArrayOutputStream.write(InetAddress.getByName(str).getAddress());
        if (str3 != null) {
            byteArrayOutputStream.write(Build.VERSION.SDK_INT >= 19 ? str3.getBytes(StandardCharsets.UTF_8) : str3.getBytes());
        }
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.writeTo(outputStream);
        byteArrayOutputStream.reset();
        outputStream.flush();
        byte[] bArr = new byte[6];
        dataInputStream.readFully(bArr);
        if (bArr[0] != 0) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("@4;IkoI0nA0<\u0019j;K0i\u001bko\u001bji\u001bbhIc=M4hA0<Ic;A3nJfo\u001eblJ6j\u001eb<\u001cefJ0jIc9\u0019")));
            m4207.append((int) bArr[0]);
            throw new C1949(enumC1951, m4207.toString());
        }
        if (bArr[1] == 90) {
            dataInputStream.readFully(new byte[2]);
        } else {
            StringBuilder m42072 = C2098.m4207(Crypt.a(Crypt.xrc("\u001dk:\u001ba<\u001bfjM`fLf<@jg\u001c`gM0:\u001a4nAj<Kdi@6iMd;\u00193kO69\u001eai\u001d`fHelJ4g\u001a7>\u001ec:\u001c")));
            m42072.append((int) bArr[1]);
            throw new C1949(enumC1951, m42072.toString());
        }
    }
}
