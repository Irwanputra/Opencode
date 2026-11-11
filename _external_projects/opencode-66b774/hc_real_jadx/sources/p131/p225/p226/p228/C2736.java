package p131.p225.p226.p228;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2736 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f10296;

    public C2736(InputStream inputStream, OutputStream outputStream) {
        String a;
        String str;
        int i;
        String a2 = Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"));
        outputStream.write("SSH-2.0-easyPro\r\n".getBytes(a2));
        outputStream.flush();
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (true) {
            a = Crypt.a(Crypt.xrc("O3i\u001cd>Odh\u001aegL3fA4iHkl\u001cj<Ad<@knN4"));
            if (i2 >= 999999998) {
                break;
            }
            String str2 = new String(bArr, 0, m4686(inputStream, bArr), a2);
            this.f10296 = str2;
            if (str2.startsWith(a)) {
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
                m4207.append(this.f10296);
                C1687.m3666("", m4207.toString());
                break;
            }
            i2++;
        }
        if (!this.f10296.startsWith(a)) {
            throw new IOException("Malformed server identification string. There was no line starting with 'SSH-' amongst the first 50 lines.");
        }
        if (this.f10296.startsWith(Crypt.a(Crypt.xrc("\u001ae9IclAd:\u001ccg\u0019elK0gKcf\u001a1lOdnNd;A7")))) {
            str = this.f10296;
            i = 9;
        } else {
            if (!this.f10296.startsWith(Crypt.a(Crypt.xrc("Kk9J1kAd:\u001c`nHk:\u0019jm\u001a4fOb:NgnM7fMa")))) {
                throw new IOException(Crypt.a(Crypt.xrc("K`hJ4h\u001eak\u001de>N1g\u001bki\u001bd9\u001dk<Me:L`:\u0019b:Ab:\u001cgnIkoA6;@3=\u001d`l\u001cghHd:LgjI`l\u001a6k\u001bk;K1o\u001de:Jc:J39Ajg\u0019k<MamM4m\u001c1iO`9O7=Aa<K4g\u001bj;Kgl@`>N6fM`i@3=@1")));
            }
            str = this.f10296;
            i = 8;
        }
        str.substring(i);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int m4686(InputStream inputStream, byte[] bArr) {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException(Crypt.a(Crypt.xrc("N`gN3n\u001ajfOen@c<\u001d0gLao\u0019ko\u001e0=Ka;Mb9KgmM4:Me<Ib<\u001d0jNg:A`kKc9\u001c0:Lj<K")));
            }
            int i3 = i + 1;
            bArr[i] = (byte) read;
            if (read == 13) {
                z = true;
            } else {
                if (read == 10) {
                    return i2;
                }
                if (z) {
                    throw new IOException(Crypt.a(Crypt.xrc("\u001d0<M6m\u001ej9JehJc;\u001d6kN3;Kd9\u001c1i\u001eaf\u001bbgM`fH`l\u001ekjHkfM4f\u001eefLfk\u001ccf\u001a4f\u001e`i\u001e4gI3l@bh\u001aegKbm\u001eflA7mAgjA1n@4fJ4j\u001ck>Mel\u001cg=Abg\u001cd;L1iIeh\u001e3f\u001cfoLdjLbfOeg\u001cgiHbh\u001c6=\u001ce=\u001b7:\u001a`oO7h@do\u001ck=O")));
                }
                i2++;
                if (i3 >= bArr.length) {
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u0019ffK6g@dmA4l\u001dam\u001e1>\u001ccf\u001dchNg>\u001a4<\u001c3lMdm\u001dk9I6m\u001ejgJahO1k\u001a7:O3jO4<I3=\u001e4fHk>\u001a3mN6lK0:\u0019kl\u001ccfKaf\u0019alL1<Hgi")));
                    m4207.append(bArr.length);
                    throw new IOException(m4207.toString());
                }
            }
            i = i3;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public byte[] m4687() {
        try {
            return this.f10296.getBytes(Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7")));
        } catch (UnsupportedEncodingException unused) {
            return this.f10296.getBytes();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[] m4688() {
        String a = Crypt.a(Crypt.xrc("O1l\u001ea9K6>Jf>I3<Kjm\u001eakH7o\u001aaiLc>@k"));
        try {
            return a.getBytes(Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7")));
        } catch (UnsupportedEncodingException unused) {
            return a.getBytes();
        }
    }
}
