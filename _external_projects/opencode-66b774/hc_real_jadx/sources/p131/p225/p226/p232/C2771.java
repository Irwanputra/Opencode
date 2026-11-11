package p131.p225.p226.p232;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2771 extends Thread {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String f10416;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public OutputStream f10417;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Socket f10418;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InputStream f10419;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2761 f10420;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2771 f10421;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] f10422 = new byte[8192];

    public C2771(C2761 c2761, C2771 c2771, Socket socket, InputStream inputStream, OutputStream outputStream, String str) {
        this.f10419 = inputStream;
        this.f10417 = outputStream;
        this.f10416 = str;
        this.f10420 = c2761;
        this.f10421 = c2771;
        this.f10418 = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C2771 c2771;
        boolean isAlive;
        Socket socket;
        String a = Crypt.a(Crypt.xrc("LjkHdoL69Nf>\u001b6=\u001e`o\u0019jgH1n\u001cak\u001b6k\u001bc=\u001a6;\u001cghLg<LgmKdg\u0019g<O3=J4=\u001b7iNkhI"));
        String a2 = Crypt.a(Crypt.xrc("\u001dclM6<\u001cehHjf\u0019giJ4o\u0019aoJcfLcm\u001dbmO3:A4;Nbf\u001a6j\u0019c>\u001edgI6g\u001d3iIak\u001akgMjfO"));
        while (true) {
            try {
                try {
                    try {
                        int read = this.f10419.read(this.f10422);
                        if (read <= 0) {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        } else {
                            this.f10417.write(this.f10422, 0, read);
                            this.f10417.flush();
                        }
                    } catch (IOException e) {
                        try {
                            C2761 c2761 = this.f10420;
                            c2761.f10374.m4739(c2761, Crypt.a(Crypt.xrc("NfiHe9\u001dfmNjk\u001ee9ObkI7:O7iL1gAe:I6>Afh\u001d`k@dm\u001a`iO4n\u001a`:Ie<\u00196jA3fK6o\u001d6fM1o\u001d4f\u001d6:L1j\u001c7:Ne>\u001a`=\u001aa<\u001bk=Akg")) + this.f10416 + Crypt.a(Crypt.xrc("\u001a6>M`mHam\u001d7o\u001dafHjgNbhOf>\u0019`mOjhJf")) + e.getMessage(), true);
                        } catch (IOException unused2) {
                        }
                        try {
                            this.f10417.close();
                        } catch (IOException unused3) {
                        }
                        try {
                            this.f10419.close();
                        } catch (IOException unused4) {
                        }
                        if (this.f10421 == null) {
                            return;
                        }
                        while (this.f10421.isAlive()) {
                            try {
                                this.f10421.join();
                            } catch (InterruptedException unused5) {
                            }
                        }
                        try {
                            C2761 c27612 = this.f10420;
                            c27612.f10374.m4739(c27612, a2 + this.f10416 + a, true);
                        } catch (IOException unused6) {
                        }
                        socket = this.f10418;
                        if (socket == null) {
                            return;
                        }
                    }
                } catch (IOException unused7) {
                    return;
                }
            } finally {
                if (c2771 != null) {
                    while (true) {
                        if (!isAlive) {
                            try {
                                break;
                            } catch (IOException unused8) {
                            }
                        }
                    }
                }
            }
        }
        this.f10417.close();
        try {
            this.f10419.close();
        } catch (IOException unused9) {
        }
        if (this.f10421 != null) {
            while (this.f10421.isAlive()) {
                try {
                    this.f10421.join();
                } catch (InterruptedException unused10) {
                }
            }
            try {
                C2761 c27613 = this.f10420;
                c27613.f10374.m4739(c27613, a2 + this.f10416 + a, true);
            } catch (IOException unused11) {
            }
            socket = this.f10418;
            if (socket == null) {
                return;
            }
            socket.close();
        }
    }
}
