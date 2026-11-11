package p107.p108.p109.p110.p121.p122;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1852;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.〳ぜぞぜべっ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1932 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InputStream f8419;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Socket f8420;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public OutputStream f8421;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Socket f8423;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f8424 = 102400;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f8422 = true;

    public C1932(InputStream inputStream, OutputStream outputStream, Socket socket, Socket socket2) {
        this.f8419 = inputStream;
        this.f8421 = outputStream;
        this.f8423 = socket;
        this.f8420 = socket2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[this.f8424];
        int i = 0;
        while (this.f8422 && i != -1) {
            try {
                i = this.f8419.read(bArr, 0, this.f8424);
                if (i > 0) {
                    m4015(i);
                    this.f8421.write(bArr, 0, i);
                }
                this.f8421.flush();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4015(int i) {
        if (!this.f8422 || this.f8423 == null) {
            return;
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
        m4207.append(App.f3759.getString(2131820626));
        m4207.append(Crypt.a(Crypt.xrc("\u001ak<MekM4n\u001c4i\u001bekLalLbi\u001c7:\u001afg\u0019bn@knLj:\u001b4;Ijf\u001d4m\u001cg=\u001be;Jgm\u001abkAjfO7mO")));
        m4207.append(this.f8420.getInetAddress().getHostName());
        m4207.append(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")));
        m4207.append(this.f8420.getInetAddress().getHostAddress());
        m4207.append(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
        m4207.append(this.f8420.getPort());
        m4207.append(Crypt.a(Crypt.xrc("\u00197oId;@j;\u001a7k\u001a0nNg>\u001eef\u001b`n\u001ednK6l\u001cb")));
        m4207.append(this.f8423.getInetAddress().getHostAddress());
        m4207.append(Crypt.a(Crypt.xrc("NdkJ3m\u001bgoIdgA1k@b=\u001dcmAgg\u001dbi\u001d7m\u0019b")));
        m4207.append(C1852.m3975(i, new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3")))));
        C1687.m3666(Crypt.a(Crypt.xrc("O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4")), m4207.toString());
    }
}
