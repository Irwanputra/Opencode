package p131.p225.p226.p232;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2756 extends Thread {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C2773 f10350 = new C2773(C2756.class);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2761 f10351;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f10352 = null;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Socket f10353;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f10354;

    public C2756(C2761 c2761, String str, int i, String str2, int i2, String str3, int i3) {
        this.f10351 = c2761;
        this.f10354 = i3;
        C2773 c2773 = f10350;
        c2773.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(Crypt.a(Crypt.xrc("Lkj@e;M3;@4iNcg\u001d0hK1oH0>\u0019gm\u001c3h\u001bdf\u00191iNgh\u001cjn\u001c1g@6fH`mIf9AciJ1fKciL")));
        sb.append(str);
        String a = Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"));
        sb.append(a);
        sb.append(i);
        sb.append(Crypt.a(Crypt.xrc("\u001dalIejO7hLdg\u001e0jMf<\u001ccg@ej@3lAak\u001a4")));
        sb.append(str2);
        sb.append(a);
        sb.append(i2);
        c2773.m4754(30, sb.toString());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            C2761 c2761 = this.f10351;
            c2761.f10374.m4732(c2761);
            Socket socket = new Socket(this.f10352, this.f10354);
            this.f10353 = socket;
            C2761 c27612 = this.f10351;
            C2771 c2771 = new C2771(c27612, null, null, c27612.f10389.f10395, socket.getOutputStream(), Crypt.a(Crypt.xrc("O3o\u00193iN3>N6g\u001dj9\u001aeiLam\u001ee9Md>A3l\u001bj")));
            C2771 c27712 = new C2771(this.f10351, null, null, this.f10353.getInputStream(), this.f10351.f10380, Crypt.a(Crypt.xrc("Lal\u001a`kI6m\u001ccj\u001cb;\u001e79\u001e0f\u001c6:M7>O0:Ng")));
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
            C2761 c27613 = this.f10351;
            c27613.f10374.m4739(c27613, Crypt.a(Crypt.xrc("\u0019f>\u001d1>O`f\u001c7j\u001aa>@bf\u001bf:\u001eek\u001bc;Jah\u0019d<\u001ck9\u001eem\u001c4>\u001cc>LfoHanKfoI7>KcmN3>\u001c")), true);
            this.f10353.close();
        } catch (IOException e) {
            f10350.m4753(50, Crypt.a(Crypt.xrc("\u001a7fJb9K1n\u001dk;Ngn\u001bgiL7=I1lNek\u001bcoMdh\u001cc>\u0019cm@0<\u001b4iO1gA7=Jfh\u001ako\u001dk<Hc=\u0019")), e);
            try {
                C2761 c27614 = this.f10351;
                c27614.f10374.m4739(c27614, Crypt.a(Crypt.xrc("\u001a7fJb9K1n\u001dk;Ngn\u001bgiL7=I1lNek\u001bcoMdl\u00191:\u001c4<\u001a`mI`gK6=Hfg\u001eb9\u001b0g\u001bd>\u001ebl\u001b")) + e.getMessage() + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")), true);
            } catch (IOException unused2) {
            }
            try {
                Socket socket2 = this.f10353;
                if (socket2 != null) {
                    socket2.close();
                }
            } catch (IOException unused3) {
            }
        }
    }
}
