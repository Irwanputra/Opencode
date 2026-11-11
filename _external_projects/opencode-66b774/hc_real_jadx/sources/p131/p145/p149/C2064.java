package p131.p145.p149;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import p131.p145.p149.AbstractC2059;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2064 extends AbstractC2059 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public long f8837;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C2074[] f8840;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public HashMap<String, C2074> f8841;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f8843;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static ThreadLocal<HandlerC2070> f8833 = new ThreadLocal<>();

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final ThreadLocal<ArrayList<C2064>> f8835 = new C2068();

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final ThreadLocal<ArrayList<C2064>> f8831 = new C2065();

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static final ThreadLocal<ArrayList<C2064>> f8832 = new C2067();

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final ThreadLocal<ArrayList<C2064>> f8834 = new C2071();

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final ThreadLocal<ArrayList<C2064>> f8836 = new C2069();

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final Interpolator f8829 = new AccelerateDecelerateInterpolator();

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static long f8830 = 10;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public long f8848 = -1;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f8844 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f8846 = 0;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f8838 = false;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f8850 = 0;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f8839 = false;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f8851 = false;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public long f8845 = 300;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public long f8847 = 0;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Interpolator f8849 = f8829;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ArrayList<InterfaceC2066> f8842 = null;

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$〺つふすそ, reason: contains not printable characters */
    public static class C2065 extends ThreadLocal<ArrayList<C2064>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<C2064> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$ぁごぐすすぃ, reason: contains not printable characters */
    public interface InterfaceC2066 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m4158(C2064 c2064);
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2067 extends ThreadLocal<ArrayList<C2064>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<C2064> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2068 extends ThreadLocal<ArrayList<C2064>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<C2064> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$づざかべべ, reason: contains not printable characters */
    public static class C2069 extends ThreadLocal<ArrayList<C2064>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<C2064> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$なぎぱいぢぎ, reason: contains not printable characters */
    public static class HandlerC2070 extends Handler {
        public HandlerC2070() {
        }

        public HandlerC2070(C2068 c2068) {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a9 A[SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r18) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p131.p145.p149.C2064.HandlerC2070.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.のぷのちつ$びぐびあび, reason: contains not printable characters */
    public static class C2071 extends ThreadLocal<ArrayList<C2064>> {
        @Override // java.lang.ThreadLocal
        public ArrayList<C2064> initialValue() {
            return new ArrayList<>();
        }
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ValueAnimator@");
        m4207.append(Integer.toHexString(hashCode()));
        String sb = m4207.toString();
        if (this.f8840 != null) {
            for (int i = 0; i < this.f8840.length; i++) {
                StringBuilder m4179 = C2098.m4179(sb, "\n    ");
                m4179.append(this.f8840[i].toString());
                sb = m4179.toString();
            }
        }
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m4150(long r9) {
        /*
            r8 = this;
            int r0 = r8.f8850
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r8.f8850 = r3
            long r4 = r8.f8848
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r8.f8843 = r9
            goto L1a
        L12:
            long r4 = r9 - r4
            r8.f8843 = r4
            r4 = -1
            r8.f8848 = r4
        L1a:
            int r0 = r8.f8850
            r4 = 0
            if (r0 == r3) goto L23
            r5 = 2
            if (r0 == r5) goto L23
            goto L73
        L23:
            long r5 = r8.f8845
            r0 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L32
            long r1 = r8.f8843
            long r9 = r9 - r1
            float r9 = (float) r9
            float r10 = (float) r5
            float r9 = r9 / r10
            goto L34
        L32:
            r9 = 1065353216(0x3f800000, float:1.0)
        L34:
            int r10 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r10 < 0) goto L68
            int r10 = r8.f8846
            if (r10 < 0) goto L41
            float r9 = java.lang.Math.min(r9, r0)
            goto L69
        L41:
            java.util.ArrayList<なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ> r10 = r8.f8824
            if (r10 == 0) goto L5a
            int r10 = r10.size()
            r1 = 0
        L4a:
            if (r1 >= r10) goto L5a
            java.util.ArrayList<なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ> r2 = r8.f8824
            java.lang.Object r2 = r2.get(r1)
            なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ r2 = (p131.p145.p149.AbstractC2059.InterfaceC2060) r2
            r2.mo4137(r8)
            int r1 = r1 + 1
            goto L4a
        L5a:
            int r10 = r8.f8846
            int r1 = (int) r9
            int r10 = r10 + r1
            r8.f8846 = r10
            float r9 = r9 % r0
            long r1 = r8.f8843
            long r5 = r8.f8845
            long r1 = r1 + r5
            r8.f8843 = r1
        L68:
            r3 = 0
        L69:
            boolean r10 = r8.f8844
            if (r10 == 0) goto L6f
            float r9 = r0 - r9
        L6f:
            r8.mo4151(r9)
            r4 = r3
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p145.p149.C2064.m4150(long):boolean");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo4151(float f) {
        float interpolation = this.f8849.getInterpolation(f);
        int length = this.f8840.length;
        for (int i = 0; i < length; i++) {
            this.f8840[i].mo4169(interpolation);
        }
        ArrayList<InterfaceC2066> arrayList = this.f8842;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f8842.get(i2).m4158(this);
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m4152() {
        ArrayList<AbstractC2059.InterfaceC2060> arrayList;
        f8835.get().remove(this);
        f8831.get().remove(this);
        f8832.get().remove(this);
        this.f8850 = 0;
        if (this.f8839 && (arrayList = this.f8824) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC2059.InterfaceC2060) arrayList2.get(i)).mo4139(this);
            }
        }
        this.f8839 = false;
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: くし〴〺ぅ */
    public void mo4134() {
        if (!f8835.get().contains(this) && !f8831.get().contains(this)) {
            this.f8838 = false;
            m4155();
        } else if (!this.f8851) {
            mo4157();
        }
        mo4151(1.0f);
        m4152();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2064 m4153(long j) {
        if (j >= 0) {
            this.f8845 = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: なぎぱいぢぎ */
    public void mo4135() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f8844 = false;
        this.f8846 = 0;
        this.f8850 = 0;
        this.f8838 = false;
        f8831.get().add(this);
        long j = 0;
        if (this.f8847 == 0) {
            if (this.f8851 && this.f8850 != 0) {
                j = AnimationUtils.currentAnimationTimeMillis() - this.f8843;
            }
            mo4157();
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.f8850 != 1) {
                this.f8848 = j;
                this.f8850 = 2;
            }
            this.f8843 = currentAnimationTimeMillis - j;
            m4150(currentAnimationTimeMillis);
            this.f8850 = 0;
            this.f8839 = true;
            ArrayList<AbstractC2059.InterfaceC2060> arrayList = this.f8824;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC2059.InterfaceC2060) arrayList2.get(i)).mo4138(this);
                }
            }
        }
        HandlerC2070 handlerC2070 = f8833.get();
        if (handlerC2070 == null) {
            handlerC2070 = new HandlerC2070(null);
            f8833.set(handlerC2070);
        }
        handlerC2070.sendEmptyMessage(0);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m4154(C2074... c2074Arr) {
        int length = c2074Arr.length;
        this.f8840 = c2074Arr;
        this.f8841 = new HashMap<>(length);
        for (C2074 c2074 : c2074Arr) {
            this.f8841.put(c2074.f8868, c2074);
        }
        this.f8851 = false;
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: びぐびあび */
    public boolean mo4136() {
        return this.f8850 == 1 || this.f8839;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m4155() {
        ArrayList<AbstractC2059.InterfaceC2060> arrayList;
        mo4157();
        f8835.get().add(this);
        if (this.f8847 <= 0 || (arrayList = this.f8824) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2059.InterfaceC2060) arrayList2.get(i)).mo4138(this);
        }
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: ぺぁあねじ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2064 mo4156() {
        C2064 c2064 = (C2064) super.mo4156();
        ArrayList<InterfaceC2066> arrayList = this.f8842;
        if (arrayList != null) {
            c2064.f8842 = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c2064.f8842.add(arrayList.get(i));
            }
        }
        c2064.f8848 = -1L;
        c2064.f8844 = false;
        c2064.f8846 = 0;
        c2064.f8851 = false;
        c2064.f8850 = 0;
        c2064.f8838 = false;
        C2074[] c2074Arr = this.f8840;
        if (c2074Arr != null) {
            int length = c2074Arr.length;
            c2064.f8840 = new C2074[length];
            c2064.f8841 = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C2074 clone = c2074Arr[i2].clone();
                c2064.f8840[i2] = clone;
                c2064.f8841.put(clone.f8868, clone);
            }
        }
        return c2064;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo4157() {
        if (this.f8851) {
            return;
        }
        int length = this.f8840.length;
        for (int i = 0; i < length; i++) {
            C2074 c2074 = this.f8840[i];
            if (c2074.f8870 == null) {
                Class cls = c2074.f8873;
                c2074.f8870 = cls == Integer.class ? C2074.f8864 : cls == Float.class ? C2074.f8865 : null;
            }
            InterfaceC2062 interfaceC2062 = c2074.f8870;
            if (interfaceC2062 != null) {
                c2074.f8869.f8779 = interfaceC2062;
            }
        }
        this.f8851 = true;
    }
}
