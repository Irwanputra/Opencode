package p000;

import java.io.IOException;
import java.util.ArrayList;
import p000.p001.AbstractRunnableC0607;
import p000.p001.p003.C0608;
import p000.p001.p003.C0609;
import p000.p001.p003.C0613;
import p000.p001.p003.C0615;
import p000.p001.p004.C0626;
import p000.p001.p005.C0632;
import p000.p001.p007.C0646;

/* renamed from: 〳ぜぞぜべっ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0586 implements InterfaceC0720 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0706 f4223;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f4224;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0608 f4225;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0595 f4226;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f4227;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractC0714 f4228;

    /* renamed from: 〳ぜぞぜべっ.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public final class C0587 extends AbstractRunnableC0607 {
        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw null;
         */
        @Override // p000.p001.AbstractRunnableC0607
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo1725() {
            /*
                r1 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0586.C0587.mo1725():void");
        }
    }

    public C0586(C0706 c0706, C0595 c0595, boolean z) {
        this.f4223 = c0706;
        this.f4226 = c0595;
        this.f4227 = z;
        this.f4225 = new C0608(c0706, z);
    }

    public Object clone() {
        C0706 c0706 = this.f4223;
        C0586 c0586 = new C0586(c0706, this.f4226, this.f4227);
        c0586.f4228 = ((C0722) c0706.f4675).f4785;
        return c0586;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0712 m1723() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f4223.f4692);
        arrayList.add(this.f4225);
        arrayList.add(new C0613(this.f4223.f4679));
        arrayList.add(new C0632(this.f4223.f4700));
        arrayList.add(new C0646(this.f4223));
        if (!this.f4227) {
            arrayList.addAll(this.f4223.f4678);
        }
        arrayList.add(new C0609(this.f4227));
        C0595 c0595 = this.f4226;
        AbstractC0714 abstractC0714 = this.f4228;
        C0706 c0706 = this.f4223;
        return new C0615(arrayList, null, null, null, 0, c0595, this, abstractC0714, c0706.f4677, c0706.f4682, c0706.f4680).m1777(c0595);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0712 m1724() {
        synchronized (this) {
            if (this.f4224) {
                throw new IllegalStateException("Already Executed");
            }
            this.f4224 = true;
        }
        this.f4225.f4287 = C0626.f4331.mo1792("response.body().close()");
        this.f4228.getClass();
        try {
            try {
                C0725 c0725 = this.f4223.f4676;
                synchronized (c0725) {
                    c0725.f4809.add(this);
                }
                C0712 m1723 = m1723();
                if (m1723 != null) {
                    return m1723;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                this.f4228.getClass();
                throw e;
            }
        } finally {
            C0725 c07252 = this.f4223.f4676;
            c07252.m1985(c07252.f4809, this, false);
        }
    }
}
