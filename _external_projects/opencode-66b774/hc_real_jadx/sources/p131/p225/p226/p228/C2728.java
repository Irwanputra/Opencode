package p131.p225.p226.p228;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.crypto.cipher.CipherInputStream;
import com.trilead.ssh2.crypto.cipher.CipherOutputStream;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.digest.MAC;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import p131.p225.p226.p229.C2741;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2728 {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final C2773 f10216 = new C2773(C2728.class);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public byte[] f10219;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public byte[] f10220;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final SecureRandom f10222;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public CipherInputStream f10224;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public MAC f10228;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public CipherOutputStream f10230;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public MAC f10232;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public byte[] f10233;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f10225 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10218 = 0;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f10226 = false;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f10217 = 8;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f10227 = 8;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final byte[] f10229 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final byte[] f10231 = new byte[5];

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final byte[] f10223 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final byte[] f10221 = new byte[5];

    public C2728(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.f10224 = new CipherInputStream(new NullCipher(), inputStream);
        this.f10230 = new CipherOutputStream(new NullCipher(), outputStream);
        this.f10222 = secureRandom;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4664(byte[] bArr) {
        int length = bArr.length;
        int i = length + 5;
        int i2 = 4 + i;
        int i3 = this.f10217;
        int i4 = i2 % i3;
        if (i4 != 0) {
            i2 += i3 - i4;
        }
        if (i2 < 16) {
            i2 = 16;
        }
        int i5 = i2 - i;
        if (this.f10226) {
            for (int i6 = 0; i6 < i5; i6 += 4) {
                int nextInt = this.f10222.nextInt();
                byte[] bArr2 = this.f10229;
                bArr2[i6] = (byte) nextInt;
                bArr2[i6 + 1] = (byte) (nextInt >> 8);
                bArr2[i6 + 2] = (byte) (nextInt >> 16);
                bArr2[i6 + 3] = (byte) (nextInt >> 24);
            }
        } else {
            for (int i7 = 0; i7 < i5; i7++) {
                this.f10229[i7] = 0;
            }
        }
        byte[] bArr3 = this.f10231;
        int i8 = i2 - 4;
        bArr3[0] = (byte) (i8 >> 24);
        bArr3[1] = (byte) (i8 >> 16);
        bArr3[2] = (byte) (i8 >> 8);
        bArr3[3] = (byte) i8;
        bArr3[4] = (byte) i5;
        this.f10230.write(bArr3, 0, 5);
        this.f10230.write(bArr, 0, length);
        this.f10230.write(this.f10229, 0, i5);
        MAC mac = this.f10228;
        if (mac != null) {
            mac.initMac(this.f10225);
            this.f10228.update(this.f10231, 0, 5);
            this.f10228.update(bArr, 0, length);
            this.f10228.update(this.f10229, 0, i5);
            this.f10228.getMac(this.f10219, 0);
            CipherOutputStream cipherOutputStream = this.f10230;
            byte[] bArr4 = this.f10219;
            cipherOutputStream.writePlain(bArr4, 0, bArr4.length);
        }
        this.f10230.flush();
        C2773 c2773 = f10216;
        c2773.getClass();
        c2773.m4754(90, Crypt.a(Crypt.xrc("\u001aeoKjiMb=Ie:LffJ1lJfoJco@an\u001a7l\u001e6")) + C2741.m4691(bArr[0] & 255) + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + length + Crypt.a(Crypt.xrc("J1jHgf\u001bck\u001d1fN0gM0:\u001bklO0<A3iNd>@6")));
        this.f10225 = this.f10225 + 1;
    }
}
