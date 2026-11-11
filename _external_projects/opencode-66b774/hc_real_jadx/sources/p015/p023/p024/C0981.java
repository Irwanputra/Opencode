package p015.p023.p024;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jasypt.digest.StandardStringDigester;

/* renamed from: いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0981 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final DataOutputStream f5326;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public EnumC0983 f5327;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final DataInputStream f5328;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f5329;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f5330 = -1;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InetAddress f5331;

    /* renamed from: いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public enum EnumC0982 {
        SUCCESS((byte) 0),
        GENERAL_FAILURE((byte) 1),
        RULESET_DENIED((byte) 2),
        NETWORK_UNREACHABLE((byte) 3),
        HOST_UNREACHABLE((byte) 4),
        CONNECTION_REFUSED((byte) 5),
        TTL_EXPIRED((byte) 6),
        COMMAND_NOT_SUPPORTED((byte) 7),
        ADDRESS_TYPE_NOT_SUPPORTED((byte) 8);


        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final byte f5342;

        EnumC0982(byte b) {
            this.f5342 = b;
        }
    }

    /* renamed from: いいにぽつ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC0983 {
        CONNECT(1),
        BIND(2);


        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5346;

        EnumC0983(int i) {
            this.f5346 = i;
        }
    }

    public C0981(InputStream inputStream, OutputStream outputStream) {
        this.f5328 = new DataInputStream(inputStream);
        this.f5326 = new DataOutputStream(outputStream);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m2312() {
        InetAddress byAddress;
        if (this.f5328.read() != 5) {
            throw new IOException("Unsupported protocol");
        }
        int read = this.f5328.read();
        EnumC0983 enumC0983 = EnumC0983.CONNECT;
        if (read != 1) {
            enumC0983 = EnumC0983.BIND;
            if (read != 2) {
                enumC0983 = null;
            }
        }
        this.f5327 = enumC0983;
        boolean z = false;
        boolean z2 = enumC0983 != null;
        if (this.f5328.read() != 0) {
            z2 = false;
        }
        int read2 = this.f5328.read();
        if (read2 != 1) {
            if (read2 == 3) {
                byte[] bArr = new byte[this.f5328.read()];
                this.f5328.readFully(bArr);
                this.f5329 = Charset.forName(StandardStringDigester.DIGEST_CHARSET).newDecoder().decode(ByteBuffer.wrap(bArr)).toString();
                z = z2;
                this.f5330 = (this.f5328.read() << 8) | this.f5328.read();
                return z;
            }
            if (read2 == 4) {
                byte[] bArr2 = new byte[16];
                this.f5328.readFully(bArr2);
                byAddress = InetAddress.getByAddress(bArr2);
            }
            this.f5330 = (this.f5328.read() << 8) | this.f5328.read();
            return z;
        }
        byte[] bArr3 = new byte[4];
        this.f5328.readFully(bArr3);
        byAddress = InetAddress.getByAddress(bArr3);
        this.f5331 = byAddress;
        z = z2;
        this.f5330 = (this.f5328.read() << 8) | this.f5328.read();
        return z;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m2313(EnumC0982 enumC0982) {
        this.f5326.write(new byte[]{5, enumC0982.f5342, 0, 1, 0, 0, 0, 0, 0, 0});
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m2314() {
        boolean z;
        if (this.f5328.read() != 5) {
            throw new IOException("Unsupported protocol");
        }
        int read = this.f5328.read();
        byte[] bArr = new byte[read];
        this.f5328.readFully(bArr);
        int i = 0;
        while (true) {
            if (i >= read) {
                z = false;
                break;
            }
            if (bArr[i] == 0) {
                z = true;
                break;
            }
            i++;
        }
        byte[] bArr2 = new byte[2];
        bArr2[0] = 5;
        if (z) {
            bArr2[1] = 0;
        } else {
            bArr2[1] = -1;
        }
        this.f5326.write(bArr2);
        return z;
    }
}
