package p131.p225.p226.p232;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p015.p023.p024.C0981;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2763 extends Thread implements InterfaceC2758 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2760 f10396;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ServerSocket f10397;

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2764 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Socket f10398;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public InputStream f10399;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public OutputStream f10401;

        public RunnableC2764(Socket socket) {
            this.f10398 = socket;
            C2763.this.setName(Crypt.a(Crypt.xrc("J4n\u001a1fAgjAanMj:N7j\u001da:@d9@`<\u00190>Iei\u001edmLkf@g:L7<H`>\u001afgLeo\u001c6j\u001ee:\u001c`k\u0019")));
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    m4748();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                this.f10398.close();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m4748() {
            C0981.EnumC0982 enumC0982 = C0981.EnumC0982.GENERAL_FAILURE;
            this.f10398.setSoTimeout(180000);
            this.f10399 = this.f10398.getInputStream();
            OutputStream outputStream = this.f10398.getOutputStream();
            this.f10401 = outputStream;
            C0981 c0981 = new C0981(this.f10399, outputStream);
            try {
                if (c0981.m2314()) {
                    if (c0981.m2312()) {
                        if (c0981.f5327 != C0981.EnumC0983.CONNECT) {
                            c0981.m2313(C0981.EnumC0982.COMMAND_NOT_SUPPORTED);
                            return;
                        }
                        String str = c0981.f5329;
                        if (str == null) {
                            str = c0981.f5331.getHostAddress();
                        }
                        if (this.f10398.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("M4:\u001d4gH0=\u001adoO0oK6>@c9\u0019`mL7j\u001bkhOg"))) || this.f10398.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("H39\u001b3oH4fA6n\u001a`jKajMe<Og:N0oJcg\u001dg"))) || this.f10398.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u001d1:Lgn\u001e3>Ljm\u001abnN7j\u001bcgM1:I1iI3oNc"))) || this.f10398.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u0019b<\u001edg\u0019dhHf9M1oA7kAd:Lj=O0n\u001cd>\u001df")))) {
                            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                            C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")));
                            m4207.append(App.f3759.getString(2131820626));
                            m4207.append(Crypt.a(Crypt.xrc("\u001e09L3:M3fJc9Ogf@6jI3fIbl\u001dc=\u00194oM1=J7oMjkAjl\u0019jlAd>Mc;J7<J6jNkm\u001ajm\u001b")));
                            m4207.append(c0981.f5327.toString().toLowerCase());
                            m4207.append(Crypt.a(Crypt.xrc("HgkOa>Nc;@0oHjfKc>\u001bgkJdh@`;Kg<\u001b7")));
                            m4207.append(str);
                            m4207.append(Crypt.a(Crypt.xrc("M6i@cg\u0019g<A`k\u0019go\u001abmLe9\u001e6;Men\u001edfO3")));
                            m4207.append(c0981.f5330);
                            m4207.append(Crypt.a(Crypt.xrc("\u001b7oNa:Hg>\u001ag9H1fMgf\u001ba<NfmLfgL6jJ`")));
                            m4207.append(this.f10398.getInetAddress().getHostAddress());
                            C1687.m3666(Crypt.a(Crypt.xrc("O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4")), m4207.toString());
                        }
                        try {
                            try {
                                try {
                                    C2761 m4733 = C2763.this.f10396.m4733(str, c0981.f5330, Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), 0);
                                    c0981.m2313(C0981.EnumC0982.SUCCESS);
                                    try {
                                        C2771 c2771 = new C2771(m4733, null, this.f10398, m4733.f10389.f10395, this.f10401, Crypt.a(Crypt.xrc("O3o\u00193iN3>N6g\u001dj9\u001aeiLam\u001ee9Md>A3l\u001bj")));
                                        C2771 c27712 = new C2771(m4733, c2771, this.f10398, this.f10399, m4733.f10380, Crypt.a(Crypt.xrc("Lal\u001a`kI6m\u001ccj\u001cb;\u001e79\u001e0f\u001c6:M7>O0:Ng")));
                                        c2771.setDaemon(true);
                                        c27712.setDaemon(true);
                                        c2771.start();
                                        c27712.start();
                                    } catch (IOException e) {
                                        m4733.f10374.m4739(m4733, Crypt.a(Crypt.xrc("Oj;Ljl\u001a4hIc<@ah\u001aj9K4iJfi\u001bjkJ7mOemLgfHjf\u001dj:Abm\u001ekgN0m\u001b`l\u001ba9A7:A3:\u001egmO`:@gkO7kH1fL4;Oe9J7:\u0019g=N0jAef\u001ajo\u001eaf\u001c6o\u001c`f\u001c7o@7gKjfN3mI09Ab=\u001c7")) + e.getMessage() + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")), true);
                                    }
                                } catch (IOException unused) {
                                    this.f10398.close();
                                }
                            } catch (IOException unused2) {
                                c0981.m2313(enumC0982);
                                this.f10398.close();
                            }
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (IOException unused4) {
                c0981.m2313(enumC0982);
            }
        }
    }

    public C2763(C2760 c2760, int i) {
        this.f10396 = c2760;
        setName(Crypt.a(Crypt.xrc("A7m\u001e7n\u001d3fAk:Lf<NbfHdnK7kNamLb:L1hNgg\u001a7:\u001a0;\u001e3hL`n\u001daoMdg\u001ejkK7;K`oI")));
        this.f10397 = new ServerSocket(i);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            try {
                C2760 c2760 = this.f10396;
                synchronized (c2760.f10362) {
                    if (!c2760.f10370) {
                        throw new IOException(Crypt.a(Crypt.xrc("Oj:\u001a7<\u001dej\u001b7fOkgJafLjl\u001afnOej\u0019fg\u001edi\u001cbj\u001cfkMagJ7n\u001dkmNj:\u001bj<\u001cak\u001d0kN4=\u001cfoJ4iLeiIc9Jkg\u001d`oKgiO`kKeg@0;J`<")));
                    }
                    c2760.f10362.addElement(this);
                }
                while (true) {
                    try {
                        try {
                            Socket accept = this.f10397.accept();
                            if (accept.getInetAddress().getHostAddress().equals(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("M4:\u001d4gH0=\u001adoO0oK6>@c9\u0019`mL7j\u001bkhOg"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("H39\u001b3oH4fA6n\u001a`jKajMe<Og:N0oJcg\u001dg"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u001d1:Lgn\u001e3>Ljm\u001abnN7j\u001bcgM1:I1iI3oNc"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u0019b<\u001edg\u0019dhHf9M1oA7kAd:Lj=O0n\u001cd>\u001df"))) || accept.getInetAddress().getHostAddress().equals(((C1216) App.f3760).m2758())) {
                                Thread thread = new Thread(new RunnableC2764(accept));
                                thread.setDaemon(true);
                                thread.start();
                            }
                        } catch (IOException unused) {
                            this.f10397.close();
                            return;
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
            this.f10397.close();
        }
    }

    @Override // p131.p225.p226.p232.InterfaceC2758
    /* renamed from: げつ〴ぬぐ */
    public void mo4727() {
        try {
            this.f10397.close();
        } catch (IOException unused) {
        }
    }
}
