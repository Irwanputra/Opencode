package p010.p011.p012.p013;

import android.content.Intent;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Build;
import android.os.Handler;
import android.system.Os;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0740;
import p010.p011.p012.p013.C0747;
import p010.p011.p012.p013.InterfaceC0737;
import p034.p095.C1687;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC0767 implements Runnable, InterfaceC0737 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final Vector<RunnableC0767> f4914 = new Vector<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Handler f4916;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public LocalServerSocket f4917;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public transient C0747 f4919;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LocalSocket f4920;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public OpenVPNService f4921;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f4922;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0775 f4925;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public LocalSocket f4927;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public InterfaceC0737.InterfaceC0739 f4928;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public LinkedList<FileDescriptor> f4923 = new LinkedList<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f4915 = false;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC0737.EnumC0738 f4918 = InterfaceC0737.EnumC0738.f4828;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Runnable f4924 = new RunnableC0769();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C0740.InterfaceC0741 f4926 = new C0768();

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.へぬ〴づぞ$〺つふすそ, reason: contains not printable characters */
    public class C0768 implements C0740.InterfaceC0741 {
        public C0768() {
        }

        @Override // p010.p011.p012.p013.C0740.InterfaceC0741
        /* renamed from: 〺つふすそ */
        public void mo2013(Intent intent, String str, int i) {
            RunnableC0767 runnableC0767 = RunnableC0767.this;
            runnableC0767.f4916.removeCallbacks(runnableC0767.f4924);
            RunnableC0767.this.m2074(C0747.EnumC0748.f4861, str, Integer.toString(i), false);
            OpenVPNService openVPNService = RunnableC0767.this.f4921;
            C0740.m2010().m2012(this);
        }

        @Override // p010.p011.p012.p013.C0740.InterfaceC0741
        /* renamed from: くし〴〺ぅ */
        public void mo2014(Intent intent) {
            StringBuilder sb = new StringBuilder();
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = obj == null ? Crypt.a(Crypt.xrc("H1m@c:KggLe9KkfAgj\u00196oI1oHb=\u001a6iJa")) : obj.toString();
                sb.append(String.format(locale, "%s - '%s'", objArr));
            }
            C0753.m2030(Crypt.a(Crypt.xrc("@ff\u001akk\u001afn@d:\u001agiO3hOgnO6gA69K3:OkmLji\u001ea;\u001bjk\u001e4l\u001agiOg<\u001c1=K49\u001d4oNbhN")) + ((Object) sb));
        }

        @Override // p010.p011.p012.p013.C0740.InterfaceC0741
        /* renamed from: げつ〴ぬぐ */
        public void mo2015(Intent intent) {
            C0753.m2035(Crypt.a(Crypt.xrc("OehKam\u001d6i\u001c`gJcnKdnAdfHj9\u001e0:A`;\u001ebjA1mIdlK7nLa>\u00196<A1<\u001agg\u001dc=Nan\u0019`f\u001bd:@1jH`nA7m@ciL4o@a:\u00193kLdkJen\u001c`<MemOg<@bf\u001d0=Ieh\u001d7:\u001bb9\u001ea9OgiKglHah\u001ec9@bnI4l\u001cdoMb:K6l\u001e3i\u001b0hHeiO3o\u001ag=O4mA`j\u001ajiMf:\u001a`:@3l\u00193lLaiH`=\u001afoOjo\u001ag9\u001ek9A1f\u001a3:\u001cj<\u001d`9\u001a0o\u001b0;Jko@3h\u001afhO`<I4o\u001acoHg;AcnMboN0:\u001aklAkk\u00196nMbo\u001a0;Kei\u001d6nMklN3n@b9LjoH3fA3mJ`kM`mK3<OjgM7o\u001dk:\u0019dhHklO`h\u001e7fLf>\u001969\u001e`n\u001efm\u001cboNan\u001b6h\u001bjg\u00191h\u001ccnJd9IjoJ1hA4;\u001bbfI6n\u001c1g\u001e7m\u001a6gL49LdiHb<\u001ea<\u001cfm\u001c1:Od9Mek\u001agmKgnMknHfo\u001bk9I6m@`i\u001bk:N0o\u001dk9\u00197l\u001b`<\u001c1kK3h@7mA4gO")));
        }

        @Override // p010.p011.p012.p013.C0740.InterfaceC0741
        /* renamed from: びぐびあび */
        public void mo2016() {
            C0753.m2030(Crypt.a(Crypt.xrc("\u001dal@4h\u0019c:I7hK3l\u001bchI`m@`:Na;\u001bj=@19Oki\u001d7n\u001e4nJjhIc=O1;\u001daiN6:\u001agoI49\u001b")));
        }
    }

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.へぬ〴づぞ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0769 implements Runnable {
        public RunnableC0769() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC0767.this.m2074(C0747.EnumC0748.f4861, Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")), Integer.toString(9050), false);
            OpenVPNService openVPNService = RunnableC0767.this.f4921;
            C0740.m2010().m2012(RunnableC0767.this.f4926);
        }
    }

    public RunnableC0767(C0775 c0775, OpenVPNService openVPNService) {
        this.f4925 = c0775;
        this.f4921 = openVPNService;
        this.f4916 = new Handler(openVPNService.getMainLooper());
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static boolean m2070() {
        boolean z;
        Vector<RunnableC0767> vector = f4914;
        synchronized (vector) {
            z = false;
            Iterator<RunnableC0767> it = vector.iterator();
            while (it.hasNext()) {
                RunnableC0767 next = it.next();
                boolean m2072 = next.m2072("signal SIGINT\n");
                try {
                    LocalSocket localSocket = next.f4920;
                    if (localSocket != null) {
                        localSocket.close();
                    }
                } catch (IOException unused) {
                }
                z = m2072;
            }
        }
        return z;
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    public void resume() {
        m2077();
        this.f4918 = InterfaceC0737.EnumC0738.f4828;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[2048];
        String str = "";
        Vector<RunnableC0767> vector = f4914;
        synchronized (vector) {
            vector.add(this);
        }
        try {
            LocalSocket accept = this.f4917.accept();
            this.f4920 = accept;
            InputStream inputStream = accept.getInputStream();
            try {
                this.f4917.close();
            } catch (IOException unused) {
                LinkedList<LogItem> linkedList = C0753.f4875;
            }
            m2072("version 3\n");
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1 || !App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk")), false)) {
                    return;
                }
                FileDescriptor[] fileDescriptorArr = null;
                try {
                    fileDescriptorArr = this.f4920.getAncillaryFileDescriptors();
                } catch (IOException unused2) {
                    LinkedList<LogItem> linkedList2 = C0753.f4875;
                }
                if (fileDescriptorArr != null) {
                    Collections.addAll(this.f4923, fileDescriptorArr);
                }
                str = m2071(str + new String(bArr, 0, read, Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"))));
            }
        } catch (IOException e) {
            if (!e.getMessage().equals(Crypt.a(Crypt.xrc("Hdn\u001bj;\u001b`n\u001d4i\u001bck@b=A7lL4gMd<\u001bfiIb"))) && !e.getMessage().equals(Crypt.a(Crypt.xrc("\u001b0lK3fJ`9@e;L4l\u001ac:\u001a1:\u0019g9Ia:A49JciIb>\u001ekm\u001e7;\u0019d=J4kMdn\u001a3mOk=N0<JkjN")))) {
                LinkedList<LogItem> linkedList3 = C0753.f4875;
            }
            Vector<RunnableC0767> vector2 = f4914;
            synchronized (vector2) {
                vector2.remove(this);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04da, code lost:
    
        if ((r1 instanceof java.net.InetSocketAddress) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x053c  */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2071(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 2298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.p011.p012.p013.RunnableC0767.m2071(java.lang.String):java.lang.String");
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    /* renamed from: 〺つふすそ */
    public void mo2005(InterfaceC0737.EnumC0738 enumC0738) {
        this.f4918 = enumC0738;
        if (this.f4915) {
            C0753.m2029(enumC0738);
        } else {
            m2072("signal SIGUSR1\n");
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m2072(String str) {
        try {
            LocalSocket localSocket = this.f4920;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return false;
            }
            this.f4920.getOutputStream().write(str.getBytes());
            this.f4920.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m2073(FileDescriptor fileDescriptor) {
        try {
            int intValue = ((Integer) FileDescriptor.class.getDeclaredMethod(Crypt.a(Crypt.xrc("\u001abjL09\u001ejkOej\u001de:Ak>\u001c0kJ6h\u001e7hI7;L`")), new Class[0]).invoke(fileDescriptor, new Object[0])).intValue();
            if (!this.f4921.protect(intValue)) {
                C0753.m2035(Crypt.a(Crypt.xrc("Aj:\u001djjH`gJcl\u001b4m\u001e`lO0nNdj\u001ajkIgkI3oNf;Mk=@b9\u001b0oNe:Lj<Hdj\u001cf9Ic:\u001e`9\u001a")));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                m2075(fileDescriptor);
            } else {
                NativeUtils.jniclose(intValue);
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            String str = Crypt.a(Crypt.xrc("Kj=H4mOg9Lj=\u001edgKenAek@f9JgnL0oO7mN4kOj>IglHd;\u001bcfLal\u001cfiH6=\u001bei\u001e6iH3>Ad:Nc;\u001c6:\u001a`lJg=\u001a0h\u001b6gN0mNa>\u001aak")) + fileDescriptor + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
            LinkedList<LogItem> linkedList = C0753.f4875;
            String str2 = Crypt.a(Crypt.xrc("Kj=H4mOg9Lj=\u001edgKenAek@f9JgnL0oO7mN4kOj>IglHd;\u001bcfLal\u001cfiH6=\u001bei\u001e6iH`jM`;N1h\u001dc>\u001cf9N7;\u001eki@a;N39K`>Jco")) + fileDescriptor;
        }
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    /* renamed from: くし〴〺ぅ */
    public void mo2006(boolean z) {
        if (this.f4915) {
            m2077();
        } else {
            m2072(z ? "network-change samenetwork\n" : "network-change\n");
        }
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    /* renamed from: げつ〴ぬぐ */
    public boolean mo2007(boolean z) {
        boolean m2070 = m2070();
        if (m2070) {
            this.f4922 = true;
            File file = new File(C1687.m3671(App.f3759));
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
            }
        }
        return m2070;
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    /* renamed from: づざかべべ */
    public void mo2008(String str) {
        m2072(Crypt.a(Crypt.xrc("Lf=Ok;@`o\u001aahKe9\u0019kmJ49\u001aj<J`k\u0019g9\u001a4")) + str + "\n");
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m2074(C0747.EnumC0748 enumC0748, String str, String str2, boolean z) {
        String str3;
        if (enumC0748 == C0747.EnumC0748.f4857 || str == null) {
            str3 = "proxy NONE\n";
        } else {
            C0753.m2043(2131821400, str, str2);
            String a = z ? Crypt.a(Crypt.xrc("\u001a1oA`kJci\u0019c<\u001c4hJdi\u001bj>Ma>\u001ekoOg:J1")) : "";
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[4];
            objArr[0] = enumC0748 == C0747.EnumC0748.f4858 ? Crypt.a(Crypt.xrc("Oe=\u001e`;HfoI3i\u001belM39McmMblJ3;Ig<L7")) : Crypt.a(Crypt.xrc("Od<Kg;\u001bjlH4mNko\u0019`l\u001a7h\u001dffK0iK6nHb"));
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = a;
            str3 = String.format(locale, "proxy %s %s %s%s\n", objArr);
        }
        m2072(str3);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m2075(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            String str = Crypt.a(Crypt.xrc("Nj9J7n\u001c3;A0oN7iKkiJfnJcnN7:\u0019cjA`gHjmAkh\u001ae>O3m\u001dghOff\u001bg:Hah@`o\u001eckO")) + fileDescriptor + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
            LinkedList<LogItem> linkedList = C0753.f4875;
        }
    }

    @Override // p010.p011.p012.p013.InterfaceC0737
    /* renamed from: びぐびあび */
    public void mo2009(InterfaceC0737.InterfaceC0739 interfaceC0739) {
        this.f4928 = interfaceC0739;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0889  */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2076(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 2662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.p011.p012.p013.RunnableC0767.m2076(java.lang.String):void");
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m2077() {
        if (this.f4915) {
            this.f4915 = false;
            System.currentTimeMillis();
            m2072("hold release\n");
            m2072("bytecount 2\n");
            m2072("state on\n");
        }
    }
}
