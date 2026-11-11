package p107.p108.p109.p110.p121.p128;

import androidx.core.app.NotificationCompat;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1852;
import p107.p108.p109.p110.p121.p122.C1931;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.ぺぁあねじ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1958 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f8544;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ServerSocket f8545;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f8546;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1931 f8547;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final String f8543 = C1958.class.getSimpleName();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Vector<C1959> f8542 = new Vector<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static int f8541 = 7071;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.ぺぁあねじ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1959 extends Thread {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f8548 = false;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Socket f8549;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public OutputStream f8550;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean f8551;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Socket f8552;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public InputStream f8553;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public OutputStream f8554;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public InputStream f8555;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public String f8556;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f8557;

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.ぺぁあねじ.げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C1960 extends Thread {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public InputStream f8558;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public OutputStream f8559;

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public boolean f8560;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public byte[] f8561 = new byte[NotificationCompat.FLAG_BUBBLE];

            public C1960(C1959 c1959, InputStream inputStream, OutputStream outputStream, boolean z) {
                this.f8558 = inputStream;
                this.f8559 = outputStream;
                this.f8560 = z;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                long j = 0;
                while (true) {
                    try {
                        int read = this.f8558.read(this.f8561);
                        if (read == -1) {
                            break;
                        }
                        if (read > 0) {
                            this.f8559.write(this.f8561, 0, read);
                            this.f8559.flush();
                            j += read;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (this.f8560) {
                    C1958.m4076(Crypt.a(Crypt.xrc("\u001cehOf=A4;Jk<K7n\u001agi\u001c`mM4hMgg\u001dbn\u00197;\u001d0=@khJc:Ag9\u001a4hK0lL4:L4kL`gHem\u0019")) + C1852.m3975(j, new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3")))));
                }
            }
        }

        public C1959(Socket socket, boolean z, int i) {
            this.f8549 = socket;
            this.f8551 = z;
            this.f8557 = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String sb;
            String str = "";
            C1958.f8542.add(this);
            System.currentTimeMillis();
            String str2 = C1958.f8543;
            this.f8549.getPort();
            this.f8556 = this.f8549.getInetAddress().getHostAddress();
            String a = Crypt.a(Crypt.xrc("LckIc9\u001cf>\u001cjm\u001ajnM3nAgmIf>\u001ejgKklOf<Oa>\u001d7g\u001a0kL49\u001eboKk<M7fL4iN1kJ0kN"));
            StringBuilder m4207 = C2098.m4207(a);
            m4207.append(App.f3759.getString(2131820626));
            m4207.append(Crypt.a(Crypt.xrc("M4hMalIdi\u001e1l\u001c7h\u001eki\u0019dj\u001a7=\u001bbfK7jA3")));
            if (this.f8557 == 1) {
                sb = Crypt.a(Crypt.xrc("\u001d6o\u001e6h\u001c0gMgnHbiJchLdgL1jMe=IbfOc"));
            } else {
                StringBuilder m42072 = C2098.m4207(Crypt.a(Crypt.xrc("AjoI69@ki@gf\u001e`=\u001adjHg:K3<\u001d`i\u001a`kAj")));
                m42072.append(this.f8557);
                sb = m42072.toString();
            }
            m4207.append(sb);
            String a2 = Crypt.a(Crypt.xrc("H1n\u001dkmIbnHgoLjh@gg\u001b7<OehLkmJ6iLciK1lO`<\u001ba:\u001e6m\u001a3kIj<N4>Lfo@7g\u00197<@"));
            m4207.append(a2);
            m4207.append(C1958.f8542.size());
            String a3 = Crypt.a(Crypt.xrc("Jc<O39MefK1m\u001c`=Ael\u001eah\u001e7oMcf\u001bfn@k"));
            m4207.append(a3);
            m4207.append(this.f8556);
            C1958.m4076(m4207.toString());
            try {
                this.f8555 = this.f8549.getInputStream();
                this.f8554 = this.f8549.getOutputStream();
                do {
                    String str3 = "";
                    do {
                        try {
                            int read = this.f8555.read();
                            if (read == -1) {
                                throw new Exception(Crypt.a(Crypt.xrc("Hf;L4:\u0019ko\u001cg=K3jLakKej\u001acf\u0019b:Hj>\u00197")));
                            }
                            str3 = str3 + ((char) read);
                        } catch (Exception e) {
                            String str4 = str3;
                            e = e;
                            str = str4;
                            if (str.length() > 0) {
                                C1958.m4075(e);
                            }
                            StringBuilder m42073 = C2098.m4207(a);
                            m42073.append(App.f3759.getString(2131820626));
                            m42073.append(Crypt.a(Crypt.xrc("L4>M1fHb:Af=Ne:\u001b7=L6gLeh\u00197lH3jAk:AjhOki\u001efoO4iN3;L`lI4l\u001eek\u0019b>Ldk\u001c")));
                            m42073.append(this.f8557);
                            m42073.append(a2);
                            m42073.append(C1958.f8542.size());
                            m42073.append(a3);
                            m42073.append(this.f8556);
                            C1958.m4076(m42073.toString());
                            m4081();
                        }
                    } while (!str3.endsWith("\r\n\r\n"));
                    System.currentTimeMillis();
                    String str5 = C1958.f8543;
                    m4084(str3);
                } while (!this.f8548);
                this.f8549.close();
            } catch (Exception e2) {
                e = e2;
            }
            StringBuilder m420732 = C2098.m4207(a);
            m420732.append(App.f3759.getString(2131820626));
            m420732.append(Crypt.a(Crypt.xrc("L4>M1fHb:Af=Ne:\u001b7=L6gLeh\u00197lH3jAk:AjhOki\u001efoO4iN3;L`lI4l\u001eek\u0019b>Ldk\u001c")));
            m420732.append(this.f8557);
            m420732.append(a2);
            m420732.append(C1958.f8542.size());
            m420732.append(a3);
            m420732.append(this.f8556);
            C1958.m4076(m420732.toString());
            m4081();
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final void m4077(String[] strArr) {
            String str = "";
            for (int i = 0; i < strArr.length; i++) {
                if (i == 0) {
                    String str2 = strArr[i];
                    String a = Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"));
                    String[] split = str2.split(a);
                    if (split.length == 3) {
                        String str3 = split[1];
                        if (str3.startsWith(Crypt.a(Crypt.xrc("A`>O`;@jh\u001bg>Kdh\u001b7=\u001dek\u001bc>\u001bglI4gIf"))) || str3.startsWith(Crypt.a(Crypt.xrc("\u001cdh\u001b0mL1n\u00197j@g:\u001b3gJf>\u001dgn\u001bf>NkmLd")))) {
                            str2 = split[0] + a + new URL(str3).getFile() + a + split[2];
                        }
                    }
                    strArr[i] = str2;
                }
                StringBuilder m4207 = C2098.m4207(str);
                m4207.append(strArr[i]);
                str = C2098.m4205(m4207.toString(), "\r\n");
            }
            this.f8550.write(C2098.m4205(str, "\r\n").getBytes());
            this.f8550.flush();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final void m4078(String str, int i) {
            C1958.m4076(Crypt.a(Crypt.xrc("I`nM4<Nk;\u001bb<\u001ce:O`<\u001dj;Od:\u001b1o\u001a1h@k")) + str + Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")) + i);
            Socket socket = new Socket(str, i);
            this.f8552 = socket;
            this.f8553 = socket.getInputStream();
            this.f8550 = this.f8552.getOutputStream();
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final void m4079(String[] strArr) {
            int read;
            long j = -1;
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].regionMatches(true, 0, Crypt.a(Crypt.xrc("JdgNdhN`nHknOg=I1o@1lM6>Lj9I6jOdmI3i\u001ed9H`n\u001a`g\u001c7mJb:M6oJkg\u0019aj@ggM")), 0, 16)) {
                    j = Integer.valueOf(strArr[i].substring(16, strArr[i].length())).intValue();
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("LanM4n\u001af:Kjg\u0019jhJ6<@7;I6jHf9\u001bk:J1kKdl\u001bkmK7g\u0019kfMbnKb:L`o\u001d`m\u001e6g\u001aal\u001b")));
                    m4207.append(C1852.m3975(j, new Locale(Crypt.a(Crypt.xrc("\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3")))));
                    C1958.m4076(m4207.toString());
                }
            }
            if (j == -1) {
                throw new Exception(Crypt.a(Crypt.xrc("MbfH0:Ab=\u001bgl\u001a4:\u001a4:\u001b3:\u001c09I6:@ehL1hL`gL4h@7=H3>\u001e3jNc;Mg;Heo\u001a`lLbl\u0019")));
            }
            byte[] bArr = new byte[65536];
            int i2 = 0;
            while (i2 < j && (read = this.f8555.read(bArr)) > 0) {
                i2 += read;
                this.f8550.write(bArr, 0, read);
                this.f8550.flush();
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m4080(String str, String str2) {
            String[] split = str2.split(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")));
            if (split.length != 3) {
                m4083(505, Crypt.a(Crypt.xrc("J6o\u001b1<\u00197j@1>\u001ek>\u001ekh\u001be;Jd:\u001eel@gf\u001e0k@aj\u001e7l@kfK`m\u001e4mJdj\u001b7o\u001e7k@j>\u001ddlO")));
                return;
            }
            m4078(str, Integer.valueOf(split[1].substring(split[1].indexOf(58) + 1)).intValue());
            this.f8554.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
            this.f8554.flush();
            C1960 c1960 = new C1960(this, this.f8553, this.f8554, true);
            C1960 c19602 = new C1960(this, this.f8555, this.f8550, false);
            c1960.start();
            c19602.start();
            c1960.join();
            c19602.join();
            this.f8548 = true;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public synchronized void m4081() {
            try {
                Socket socket = this.f8549;
                if (socket != null && socket.isConnected()) {
                    this.f8549.close();
                }
                this.f8549 = null;
            } catch (Exception unused) {
            }
            try {
                Socket socket2 = this.f8552;
                if (socket2 != null && socket2.isConnected()) {
                    this.f8552.close();
                }
                this.f8552 = null;
            } catch (Exception unused2) {
            }
            C1958.f8542.remove(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x01a9, code lost:
        
            r2 = r2 + r4.length();
            r5 = r4.indexOf(xyz.easypro.ecrypt.utils.Crypt.a(xyz.easypro.ecrypt.utils.Crypt.xrc("L`lOb=\u001bgmJaoKel\u001dam\u001djkI`h\u001bafJciJ7")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01be, code lost:
        
            if (r5 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01c0, code lost:
        
            r5 = r4.length() - 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01c5, code lost:
        
            r5 = java.lang.Integer.valueOf(r4.substring(0, r5), r15).intValue();
            r22.f8554.write(r4.getBytes());
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01da, code lost:
        
            if (r5 != 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01dc, code lost:
        
            r4 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01df, code lost:
        
            r5 = r5 + 2;
            r2 = r2 + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01e5, code lost:
        
            if (r5 <= 4096) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01e7, code lost:
        
            r7 = androidx.core.app.NotificationCompat.FLAG_BUBBLE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01eb, code lost:
        
            r8 = new byte[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01ed, code lost:
        
            if (r5 == 0) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01ef, code lost:
        
            r10 = r22.f8553;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01f1, code lost:
        
            if (r5 > 4096) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01f3, code lost:
        
            r14 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01f6, code lost:
        
            r10 = r10.read(r8, 0, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01fb, code lost:
        
            if (r10 == (-1)) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01fd, code lost:
        
            if (r10 <= 0) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01ff, code lost:
        
            r5 = r5 - r10;
            r22.f8554.write(r8, 0, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x020b, code lost:
        
            throw new java.lang.Exception(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01f5, code lost:
        
            r14 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
        
            r22.f8554.flush();
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0211, code lost:
        
            if (r4 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0213, code lost:
        
            r6 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
        
            r7 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01de, code lost:
        
            r4 = false;
         */
        /* renamed from: づざかべべ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m4082(java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 669
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.p128.C1958.C1959.m4082(java.lang.String):void");
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final void m4083(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(Crypt.a(Crypt.xrc("Af>\u001b0h\u001bg=Hf=ObmHej@7hK4n\u001ajlOkm\u001b4")));
            sb.append(i);
            String a = Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"));
            sb.append(a);
            sb.append(str);
            C1958.m4076(sb.toString());
            String str2 = Crypt.a(Crypt.xrc("\u001e`gMcj\u001cbkIeh\u001bbi\u0019e9K0:\u001egg\u001a69@jm\u001a3")) + i + a + str + Crypt.a(Crypt.xrc("Nb9\u0019fkO6:L6kH`mH1iMbl@jf\u001d0;N7<\u001cb"));
            this.f8554.write((Crypt.a(Crypt.xrc("Agn\u00196f\u001bk;\u001d6o\u00196nHb=H7nI`mNa=NknM7")) + i + a + str + "\r\nContent-Length: " + str2.length() + "\r\n\r\n").getBytes());
            this.f8554.write(str2.getBytes());
            this.f8554.flush();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x010e A[Catch: Exception -> 0x0168, IOException -> 0x0186, UnknownHostException -> 0x0188, TryCatch #2 {UnknownHostException -> 0x0188, IOException -> 0x0186, Exception -> 0x0168, blocks: (B:18:0x00cb, B:22:0x00eb, B:24:0x0106, B:26:0x010e, B:27:0x0120, B:29:0x0130, B:32:0x0136, B:34:0x013c, B:36:0x0152, B:37:0x0155, B:40:0x00f0, B:42:0x00f6, B:43:0x00fd), top: B:17:0x00cb }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0130 A[Catch: Exception -> 0x0168, IOException -> 0x0186, UnknownHostException -> 0x0188, TryCatch #2 {UnknownHostException -> 0x0188, IOException -> 0x0186, Exception -> 0x0168, blocks: (B:18:0x00cb, B:22:0x00eb, B:24:0x0106, B:26:0x010e, B:27:0x0120, B:29:0x0130, B:32:0x0136, B:34:0x013c, B:36:0x0152, B:37:0x0155, B:40:0x00f0, B:42:0x00f6, B:43:0x00fd), top: B:17:0x00cb }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0136 A[Catch: Exception -> 0x0168, IOException -> 0x0186, UnknownHostException -> 0x0188, TryCatch #2 {UnknownHostException -> 0x0188, IOException -> 0x0186, Exception -> 0x0168, blocks: (B:18:0x00cb, B:22:0x00eb, B:24:0x0106, B:26:0x010e, B:27:0x0120, B:29:0x0130, B:32:0x0136, B:34:0x013c, B:36:0x0152, B:37:0x0155, B:40:0x00f0, B:42:0x00f6, B:43:0x00fd), top: B:17:0x00cb }] */
        /* renamed from: びぐびあび, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m4084(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.p128.C1958.C1959.m4084(java.lang.String):void");
        }
    }

    public C1958() {
        System.currentTimeMillis();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m4075(Exception exc) {
        String exc2 = exc.toString();
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            StringBuilder m4179 = C2098.m4179(exc2, "\r\n");
            m4179.append(stackTraceElement.toString());
            exc2 = m4179.toString();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4076(String str) {
        String str2 = f8543;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
        m4207.append(str);
        C1687.m3666(str2, m4207.toString());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (this.f8547 == null) {
            this.f8547 = new C1931();
        }
        this.f8547.start();
        this.f8544 = true;
        for (int i = 0; i < 5; i++) {
            try {
                this.f8545 = new ServerSocket(f8541);
            } catch (Exception unused) {
                if (i == 4) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
        }
        while (!this.f8545.isClosed()) {
            try {
                Socket accept = this.f8545.accept();
                if (accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("M4:\u001d4gH0=\u001adoO0oK6>@c9\u0019`mL7j\u001bkhOg"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("H39\u001b3oH4fA6n\u001a`jKajMe<Og:N0oJcg\u001dg"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u001d1:Lgn\u001e3>Ljm\u001abnN7j\u001bcgM1:I1iI3oNc"))) || accept.getInetAddress().getHostAddress().contains(Crypt.a(Crypt.xrc("\u0019b<\u001edg\u0019dhHf9M1oA7kAd:Lj=O0n\u001cd>\u001df")))) {
                    String hostAddress = accept.getInetAddress().getHostAddress();
                    if (hostAddress.length() - hostAddress.replace(Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk")), "").length() == 3) {
                        if (f8542.size() == 0) {
                            this.f8546 = 1;
                        }
                        new C1959(accept, false, this.f8546).start();
                        this.f8546++;
                    } else {
                        C1687.m3697(f8543, Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g=\u00190=H0fAcn\u001d7m\u0019cl\u001ael\u001dcl\u001b4hM6n\u001eafL`m\u001c6:\u001e4f\u001def\u001ejjH09L`mMj9IjfJj=Aem")) + accept.getInetAddress().getHostAddress());
                    }
                }
            } catch (Exception e) {
                m4075(e);
                return;
            }
        }
    }
}
