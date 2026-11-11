package p107.p108.p109.p110.p121.p122;

import java.net.ServerSocket;
import java.net.Socket;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.〳ぜぞぜべっ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1931 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ServerSocket f8415;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Socket f8416;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public RunnableC1933 f8417;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Thread f8418;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f8415 = new ServerSocket(1081);
            while (!this.f8415.isClosed()) {
                Socket accept = this.f8415.accept();
                this.f8416 = accept;
                if (!accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("M4:\u001d4gH0=\u001adoO0oK6>@c9\u0019`mL7j\u001bkhOg"))) && !this.f8416.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("H39\u001b3oH4fA6n\u001a`jKajMe<Og:N0oJcg\u001dg"))) && !this.f8416.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u001d1:Lgn\u001e3>Ljm\u001abnN7j\u001bcgM1:I1iI3oNc")))) {
                    if (this.f8416.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u0019b<\u001edg\u0019dhHf9M1oA7kAd:Lj=O0n\u001cd>\u001df")))) {
                        String hostAddress = this.f8416.getInetAddress().getHostAddress();
                        if (hostAddress.length() - hostAddress.replace(Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk")), "").length() == 3) {
                        }
                    }
                }
                RunnableC1933 runnableC1933 = new RunnableC1933(this.f8416);
                this.f8417 = runnableC1933;
                Thread thread = new Thread(runnableC1933);
                this.f8418 = thread;
                thread.start();
            }
        } catch (Exception unused) {
        }
    }
}
