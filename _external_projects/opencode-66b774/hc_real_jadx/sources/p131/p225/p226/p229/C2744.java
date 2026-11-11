package p131.p225.p226.p229;

import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.おぐぴう〸ず.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2744 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[] f10316 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10315 = 0;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4705(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7")));
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m4713(bytes.length);
        m4710(bytes, 0, bytes.length);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4706(int i) {
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.f10316;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f10316 = bArr;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m4707(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(strArr[i]);
        }
        m4705(stringBuffer.toString());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4708(boolean z) {
        int i = this.f10315 + 1;
        byte[] bArr = this.f10316;
        if (i > bArr.length) {
            m4706(bArr.length + 32);
        }
        byte[] bArr2 = this.f10316;
        int i2 = this.f10315;
        this.f10315 = i2 + 1;
        bArr2[i2] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[] m4709() {
        int i = this.f10315;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f10316, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4710(byte[] bArr, int i, int i2) {
        int i3 = this.f10315 + i2;
        byte[] bArr2 = this.f10316;
        if (i3 > bArr2.length) {
            m4706(bArr2.length + i2 + 32);
        }
        System.arraycopy(bArr, i, this.f10316, this.f10315, i2);
        this.f10315 += i2;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m4711(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 && byteArray[0] == 0) {
            m4713(0);
            return;
        }
        int length = byteArray.length;
        m4713(length);
        m4710(byteArray, 0, length);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4712(int i) {
        int i2 = this.f10315;
        if (i2 + 1 > this.f10316.length) {
            m4706(i2 + 32);
        }
        this.f10316[i2] = (byte) i;
        this.f10315++;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4713(int i) {
        int i2 = this.f10315;
        if (i2 + 4 > this.f10316.length) {
            m4706(i2 + 32);
        }
        byte[] bArr = this.f10316;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >> 16);
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
        this.f10315 += 4;
    }
}
