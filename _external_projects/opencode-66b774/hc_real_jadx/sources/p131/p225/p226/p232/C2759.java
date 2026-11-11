package p131.p225.p226.p232;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2759 extends Thread {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C2773 f10358 = new C2773(C2759.class);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2761 f10359;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Socket f10360;

    public C2759(C2761 c2761, String str, int i) {
        this.f10359 = c2761;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C2765 c2765;
        try {
            C2761 c2761 = this.f10359;
            c2761.f10374.m4732(c2761);
            C2761 c27612 = this.f10359;
            C2769 c2769 = c27612.f10380;
            C2757 c2757 = c27612.f10389.f10395;
            byte[] bArr = new byte[6];
            if (c2757.read(bArr) != 6) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e09\u0019djM0=H0;IciOgh@c<Jgk\u001adnA4jJ6iO")));
            }
            if (bArr[0] != 66 && bArr[0] != 108) {
                throw new IOException(Crypt.a(Crypt.xrc("MfnAai@ehJeg\u001bg;\u00196m\u001ebnL`o\u001bkiAcoH`nN7o\u001damNgf\u001cgo\u001ejjLc9\u0019g;@bm\u001b0l\u00197oLe:I0oM7kOb<N0iN`oJ6fN0m\u001b`n\u001b1hAfm")));
            }
            int i = bArr[0] == 66 ? 0 : 1;
            byte[] bArr2 = new byte[6];
            if (c2757.read(bArr2) != 6) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e09\u0019djM0=H0;IciOgh@c<Jgk\u001adnA4jJ6iO")));
            }
            int i2 = ((bArr2[i] & Base64.BASELENGTH) << 8) | (bArr2[1 - i] & Base64.BASELENGTH);
            int i3 = (bArr2[3 - i] & Base64.BASELENGTH) | ((bArr2[i + 2] & Base64.BASELENGTH) << 8);
            if (i2 > 256 || i3 > 256) {
                throw new IOException(Crypt.a(Crypt.xrc("OjjJ1h\u001eb<Oc<IfnAd=H6m\u001cbnI`mNj<\u001ad<NkiKkkO7fKc>@7;M0nI7=Ne>\u001c0<\u0019dhI")));
            }
            int i4 = (4 - (i2 % 4)) % 4;
            int i5 = (4 - (i3 % 4)) % 4;
            byte[] bArr3 = new byte[i2];
            byte[] bArr4 = new byte[i3];
            byte[] bArr5 = new byte[4];
            if (c2757.read(bArr3) != i2) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e0>Ncj\u001d`kHamHj=@ch\u001d`mKjfN7j\u001b0:I0;H0h@`i\u001dj<\u001bd9\u001cd>Ae>\u001e`m\u001c4=L`o\u0019ckH6o\u001e0;@fjJbk\u001dgn\u0019akK7iH`kI0:Ma:\u001e4kK`")));
            }
            if (c2757.read(bArr5, 0, i4) != i4) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e0>Ncj\u001d`kHamHj=@ch\u001d`mKjfN7j\u001b0:I0;H0h@`i\u001dj<\u001bd9\u001cd>Ae>\u001e`m\u001c4=L`o\u0019ckH6o\u001b3<\u001ecn\u001b0hLc>K6f\u001e1oK`hKefM6<Hkj\u001eb")));
            }
            if (c2757.read(bArr4) != i3) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e0>Ncj\u001d`kHamHj=@ch\u001d`mKjfN7j\u001b0:I0;H1=\u001aajJ0kLdj\u001b3<Mg;Hg9@bhKd9K69Nah\u0019f:Of;\u001c6nKflA1=Le>\u001aan\u001b7jI1k\u001a69Nj")));
            }
            if (c2757.read(bArr5, 0, i5) != i5) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001c7=\u001bbfLd:K7hM6;A1h\u0019gm\u001cckAk<\u0019bf\u001e0>Ncj\u001d`kHamHj=@ch\u001d`mKjfN7j\u001b0:I0;H1=\u001aajJ0kLdj\u001b3<Mg;Hg9@bhKd9K69NahNkj\u001a4mN1h\u001dj:@bmA`gJ1o\u0019a<Ic=M3<\u001a6")));
            }
            if (!Crypt.a(Crypt.xrc("Je=Oeh\u001d1<\u001ce>Lf<@efJgl\u001b1nMagKch@g;\u001a4g\u001ek:A3<\u001cj>J`gH4kAb:H7mJc<\u001ba9\u0019")).equals(new String(bArr3, Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"))))) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001de;Mei\u0019b;O6m\u001d`=\u001cj;\u001c0:MefAg>\u001cglN7n\u001a4=HgoK`j\u001cgl\u001bcmJgfIckLdmJff@gnOafO7oM6>\u001aenJe9\u001b3>\u001e6i\u001b`9N0g\u001a4>\u001d4=")));
            }
            if (i3 != 16) {
                throw new IOException(Crypt.a(Crypt.xrc("M`=Ak>\u001aen\u001e`hLg<@1oLj:Aj<Jb:Hck\u001d4mL`9LjhH0lMjm\u001cj9Mgi\u0019c>\u0019cmMkhKc<If:Jk9M`nHci\u001af:\u001cc=HkoAa>O4mJd:\u001ejm")));
            }
            StringBuffer stringBuffer = new StringBuffer(32);
            for (int i6 = 0; i6 < i3; i6++) {
                String hexString = Integer.toHexString(bArr4[i6] & 255);
                if (hexString.length() != 2) {
                    hexString = Crypt.a(Crypt.xrc("\u001b6kN0k\u001d3mL1=\u001e0>M3f\u001ekfK49Kcm\u001bg;Ig")) + hexString;
                }
                stringBuffer.append(hexString);
            }
            String stringBuffer2 = stringBuffer.toString();
            synchronized (this.f10359) {
                this.f10359.getClass();
            }
            C2760 c2760 = this.f10359.f10374;
            synchronized (c2760.f10366) {
                c2765 = stringBuffer2 != null ? (C2765) c2760.f10366.get(stringBuffer2) : null;
            }
            if (c2765 == null) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001d7;Jf;Hfi\u001cagHgiK1>J1:\u001edo\u001ejiO4jO0oHfm\u001b`m\u001cgnIdn\u001c`=A6iLejN7n\u001dk9\u001ek<\u001c")));
            }
            Socket socket = new Socket((String) null, 0);
            this.f10360 = socket;
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = this.f10360.getInputStream();
            outputStream.write(bArr);
            outputStream.write(new byte[6]);
            outputStream.flush();
            C2771 c2771 = new C2771(this.f10359, null, null, c2757, outputStream, Crypt.a(Crypt.xrc("\u00190=Hgj\u001e1g\u001b7o\u001bgo\u001e7:I7<\u0019b9@1m\u001ckg\u001dj")));
            C2771 c27712 = new C2771(this.f10359, null, null, inputStream, c2769, Crypt.a(Crypt.xrc("Hgh@c>\u001adgA7lHfgH1hJkjAkmAf=N`=\u001ef")));
            c2771.setDaemon(true);
            c2771.start();
            c27712.run();
            while (c2771.isAlive()) {
                try {
                    c2771.join();
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            C2761 c27613 = this.f10359;
            c27613.f10374.m4739(c27613, Crypt.a(Crypt.xrc("H7:A7l\u001a6<\u001b6gAeh\u001ajhKc=\u001bboIg<K0h\u001e0k\u001ebfMglLgj\u0019j;\u0019bmA1jO7i\u001c6>\u001d`lK0o\u00197o\u001c`<IjlLf=\u001a0kMb>A3n\u001d0>H`fMf=M`i")), true);
            this.f10360.close();
        } catch (IOException e) {
            f10358.m4753(50, Crypt.a(Crypt.xrc("Hg>\u001c1mIj>\u00190kM`m\u001e6n\u001ed>@4g\u001cefIbm\u0019a=McgI6;\u001c0;HjgOa9Iak\u001b1fMkmN3iLj=J")), e);
            try {
                C2761 c27614 = this.f10359;
                c27614.f10374.m4739(c27614, Crypt.a(Crypt.xrc("Hg>\u001c1mIj>\u00190kM`m\u001e6n\u001ed>@4g\u001cefIbm\u0019a<\u001c7kMe;@cnK7i\u001da<\u0019b;KbiAj=J4>LdfL")) + e.getMessage() + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")), true);
            } catch (IOException unused2) {
            }
            try {
                Socket socket2 = this.f10360;
                if (socket2 != null) {
                    socket2.close();
                }
            } catch (IOException unused3) {
            }
        }
    }
}
