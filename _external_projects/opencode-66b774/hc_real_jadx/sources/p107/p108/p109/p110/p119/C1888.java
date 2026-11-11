package p107.p108.p109.p110.p119;

import java.text.SimpleDateFormat;
import java.util.Locale;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.p114.AsyncTaskC1840;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p131.p135.p142.InterfaceC2021;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1888 implements InterfaceC2021 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C1867 f8331;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public class C1889 implements InterfaceC1838 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f8333;

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC1890 implements Runnable {
            public RunnableC1890() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1867 c1867 = C1888.this.f8331;
                String str = C1867.f8270;
                c1867.m3995(0, 2131821096, 100);
            }
        }

        public C1889() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            String str = C1867.f8270;
            String str2 = C1867.f8270;
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
            C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
            m4207.append(C1888.this.f8331.m490(2131821097));
            C1687.m3737(str2, m4207.toString());
            this.f8333 = C1867.m3981(C1888.this.f8331, Crypt.a(Crypt.xrc("\u0019cfJgnLf9Me9Lkn\u001c7mOd=I7nLdf\u001a4lAj")));
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            if (this.f8333 || C1888.this.f8331.m525() == null) {
                return;
            }
            C1888.this.f8331.m525().runOnUiThread(new RunnableC1890());
        }
    }

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1891 implements InterfaceC1838 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f8336;

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ$げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
        public class RunnableC1892 implements Runnable {
            public RunnableC1892() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1867 c1867 = C1888.this.f8331;
                String str = C1867.f8270;
                c1867.m3995(0, 2131821096, 100);
            }
        }

        /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.いいにぽつ$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC1893 implements Runnable {
            public RunnableC1893() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1867 c1867 = C1888.this.f8331;
                String str = C1867.f8270;
                c1867.m3995(5, 2131821332, 100);
            }
        }

        public C1891() {
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: 〺つふすそ */
        public void mo1630() {
            if (C1888.this.f8331.m525() != null) {
                C1888.this.f8331.m525().runOnUiThread(new RunnableC1893());
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            String str = C1867.f8270;
            String str2 = C1867.f8270;
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
            C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc")));
            m4207.append(C1888.this.f8331.m490(2131821097));
            C1687.m3737(str2, m4207.toString());
            this.f8336 = C1867.m3981(C1888.this.f8331, Crypt.a(Crypt.xrc("\u0019cfJgnLf9Me9Lkn\u001c7mOd=I7nLdf\u001a4lAj")));
        }

        @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
        /* renamed from: げつ〴ぬぐ */
        public void mo1631() {
            if (this.f8336 || C1888.this.f8331.m525() == null) {
                return;
            }
            C1888.this.f8331.m525().runOnUiThread(new RunnableC1892());
        }
    }

    public C1888(C1867 c1867) {
        this.f8331 = c1867;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4001() {
        C1867 c1867 = this.f8331;
        int i = c1867.f8282;
        if (i >= 100) {
            c1867.m3995(5, 2131821332, 100);
            new AsyncTaskC1840(new C1889()).execute(new Void[0]);
            return;
        }
        while (i <= 100) {
            this.f8331.m3995(1, 2131820789, i);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        new AsyncTaskC1840(new C1891()).execute(new Void[0]);
    }
}
