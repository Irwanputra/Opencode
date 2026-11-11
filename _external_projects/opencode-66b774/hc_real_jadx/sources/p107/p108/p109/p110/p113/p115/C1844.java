package p107.p108.p109.p110.p113.p115;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1844 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1845 f8214 = new C1845();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static byte[] m3959(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((bArr.length + 2) / 3) * 4);
        try {
            f8214.m3961(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(Crypt.a(Crypt.xrc("H4=\u001a6hIehKj9\u0019ff@fgKkj\u001d4mK0oHf9Ne<\u00194g\u001b`lAcfI4:\u001e7:O`iM`iHgf\u001e`lO1oK7j\u0019f>\u001ca:OciKa=H`oH6m\u001a7<LclJch\u001bdk")) + e);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static byte[] m3960(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            f8214.m3963(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(Crypt.a(Crypt.xrc("AfoIelAdf\u001dg=L6:OciL6:M4=Lb>Lf=Kk:\u001cbjM4kL0n\u001d6lN`o@3hI1lOehLji\u001be;\u0019`:Jci\u00191>@e;L`=Kjo\u001dkiLff\u0019c;\u001ajgK`l")) + e);
        }
    }
}
