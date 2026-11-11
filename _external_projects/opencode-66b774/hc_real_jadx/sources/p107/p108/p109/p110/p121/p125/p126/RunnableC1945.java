package p107.p108.p109.p110.p121.p125.p126;

import android.content.SharedPreferences;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1945 implements Runnable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f8477;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f8479;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String f8480;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String f8483;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public RunnableC1947 f8484;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String f8485;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f8487;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f8488;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Thread f8481 = null;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ServerSocket f8486 = null;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Socket f8482 = null;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object f8478 = this;

    static {
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b"));
        sharedPreferences.getInt(a, 10);
        App.f3762.getInt(a, 10);
    }

    public RunnableC1945(int i, boolean z, String str, int i2, String str2, String str3, String str4) {
        this.f8479 = 0;
        this.f8477 = false;
        this.f8480 = null;
        this.f8488 = 0;
        this.f8479 = i;
        this.f8477 = z;
        this.f8480 = str;
        this.f8488 = i2;
        C1948.m4069(Crypt.a(Crypt.xrc("\u001egjLj9Jf:If:I6i\u0019agOeh\u001akhHdk\u00191g\u001ec9AjjOci\u001bgiIb>JjiAknNjkOkk\u001djfM`fH")));
        if (this.f8477) {
            C1948.m4069((str4.startsWith(Crypt.a(Crypt.xrc("IcnL1mA0fHff\u001c0jNfh\u001c0<Ab9\u001egh@4gM3"))) || str4.startsWith(Crypt.a(Crypt.xrc("A1:K1;O39MkkKk;\u0019`h\u001e3nO3=\u001bak@`:\u001dg")))) ? Crypt.a(Crypt.xrc("\u001e4=A0nM6o\u001beiAcgMflH0n\u001e4kJjjLc9N`gLdnN7l\u001c0l@4kK6jMf>\u001ecmIgiO0hN6jA")) : (str4.startsWith(Crypt.a(Crypt.xrc("Jdm\u001edk\u001b7nIg:KjfOj;A0hAdm\u001cd9J7lN3"))) || str4.startsWith(Crypt.a(Crypt.xrc("\u001d4;OkmL4j\u001e6l\u001bk:\u001ec:\u00194h\u001dk=\u001dd9\u001ddkN1")))) ? Crypt.a(Crypt.xrc("\u001e4=A0nM6o\u001beiAcgMflH0n\u001e4kJjjLc9N`hHef\u001e7jHgn\u001b7<\u0019cfKf:@e:KkgAbmIdiN")) : Crypt.a(Crypt.xrc("\u001e4=A0nM6o\u001beiAcgMflH0n\u001e4kJjjLc9N`>\u001bgiO3:\u001dkgN0>M4:\u001b0lK6n\u0019af\u001agl\u001aa:\u001e")));
        }
        this.f8487 = str4;
        this.f8483 = str2;
        this.f8485 = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8478 = this;
        try {
            m4035();
            while (true) {
                if (!(this.f8486 != null)) {
                    break;
                }
                synchronized (this.f8478) {
                    ServerSocket serverSocket = this.f8486;
                    if (serverSocket != null) {
                        try {
                            Socket accept = serverSocket.accept();
                            this.f8482 = accept;
                            accept.setKeepAlive(true);
                            this.f8482.setSoTimeout(0);
                            RunnableC1947 runnableC1947 = new RunnableC1947(this, this.f8482);
                            this.f8484 = runnableC1947;
                            runnableC1947.m4063();
                        } catch (InterruptedIOException | Exception unused) {
                        }
                    }
                }
                Thread.yield();
            }
        } catch (BindException | IOException unused2) {
        }
        m4037();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4035() {
        synchronized (this.f8478) {
            ServerSocket serverSocket = new ServerSocket(this.f8479);
            this.f8486 = serverSocket;
            if (this.f8479 == 0) {
                this.f8479 = serverSocket.getLocalPort();
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4036() {
        Thread thread = new Thread(this);
        this.f8481 = thread;
        thread.start();
        C1948.m4069(Crypt.a(Crypt.xrc("\u001dj<J79AagLem\u001c39\u001b6o\u001ad:\u001eclM7kL`fAa>\u001dekIdkJj>Ae:\u001b1f\u001de<\u001caf\u0019ei\u0019bi\u001a6fM")));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4037() {
        ServerSocket serverSocket = this.f8486;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f8486 = null;
        Socket socket = this.f8482;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
        }
        this.f8482 = null;
        RunnableC1947 runnableC1947 = this.f8484;
        if (runnableC1947 != null) {
            runnableC1947.m4056();
            try {
                Socket socket2 = runnableC1947.f8511;
                if (socket2 != null) {
                    socket2.close();
                }
                Socket socket3 = runnableC1947.f8513;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException unused3) {
            }
            runnableC1947.f8511 = null;
            runnableC1947.f8513 = null;
            runnableC1947.f8510.interrupt();
        }
        this.f8484 = null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4038() {
        m4037();
        C1948.m4069(Crypt.a(Crypt.xrc("\u001aen\u001d`i\u00193m\u001e`jLjmM7;\u001a0<N4hMegOd:\u001c6<O`<J7;\u001e6;AglO4f\u001acfO0k\u0019j<\u001c7g\u001befJ")));
        this.f8481.interrupt();
        C1948.m4069(Crypt.a(Crypt.xrc("\u001akk\u001ddi@1nJf9J7nJ0hIf>Kbj@ag\u00197>\u001edfAg;\u00190mJ6gJb;\u0019dkL6kL0j@kf\u001b1gH6>\u001c")));
    }
}
