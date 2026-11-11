package p034.p065.p066;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p034.p035.p048.C1132;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC1400 implements Runnable {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f6613;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public long f6615;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final ThreadLocal<RunnableC1400> f6611 = new ThreadLocal<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Comparator<C1402> f6610 = new C1403();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ArrayList<RecyclerView> f6612 = new ArrayList<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ArrayList<C1402> f6614 = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ$〺つふすそ, reason: contains not printable characters */
    public static class C1401 implements RecyclerView.AbstractC0219.InterfaceC0221 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6616;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int[] f6617;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6618;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6619;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m3166(RecyclerView recyclerView, boolean z) {
            this.f6619 = 0;
            int[] iArr = this.f6617;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0219 abstractC0219 = recyclerView.f1438;
            if (recyclerView.f1428 == null || abstractC0219 == null || !abstractC0219.f1534) {
                return;
            }
            if (z) {
                if (!recyclerView.f1426.m3114()) {
                    abstractC0219.mo637(recyclerView.f1428.mo888(), this);
                }
            } else if (!recyclerView.m704()) {
                abstractC0219.mo671(this.f6618, this.f6616, recyclerView.f1386, this);
            }
            int i = this.f6619;
            if (i > abstractC0219.f1528) {
                abstractC0219.f1528 = i;
                abstractC0219.f1530 = z;
                recyclerView.f1411.m806();
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean m3167(int i) {
            if (this.f6617 != null) {
                int i2 = this.f6619 * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f6617[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3168(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f6619 * 2;
            int[] iArr = this.f6617;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f6617 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f6617 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f6617;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f6619++;
        }
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1402 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6620;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6621;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f6622;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f6623;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public RecyclerView f6624;
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1403 implements Comparator<C1402> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        
            if (r0 != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L18;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(p034.p065.p066.RunnableC1400.C1402 r7, p034.p065.p066.RunnableC1400.C1402 r8) {
            /*
                r6 = this;
                づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ$くし〴〺ぅ r7 = (p034.p065.p066.RunnableC1400.C1402) r7
                づざかべべ.ぇぬぎばつ.びぐびあび.のぷのちつ$くし〴〺ぅ r8 = (p034.p065.p066.RunnableC1400.C1402) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f6624
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f6624
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.f6622
                boolean r3 = r8.f6622
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f6620
                int r1 = r7.f6620
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f6621
                int r8 = r8.f6621
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p034.p065.p066.RunnableC1400.C1403.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C1132.m2568("RV Prefetch");
            if (!this.f6612.isEmpty()) {
                int size = this.f6612.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f6612.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m3163(TimeUnit.MILLISECONDS.toNanos(j) + this.f6615);
                }
            }
        } finally {
            this.f6613 = 0L;
            C1132.m2567();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3163(long j) {
        C1402 c1402;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1402 c14022;
        int size = this.f6612.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f6612.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f1407.m3166(recyclerView3, false);
                i += recyclerView3.f1407.f6619;
            }
        }
        this.f6614.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f6612.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1401 c1401 = recyclerView4.f1407;
                int abs = Math.abs(c1401.f6616) + Math.abs(c1401.f6618);
                for (int i5 = 0; i5 < c1401.f6619 * 2; i5 += 2) {
                    if (i3 >= this.f6614.size()) {
                        c14022 = new C1402();
                        this.f6614.add(c14022);
                    } else {
                        c14022 = this.f6614.get(i3);
                    }
                    int[] iArr = c1401.f6617;
                    int i6 = iArr[i5 + 1];
                    c14022.f6622 = i6 <= abs;
                    c14022.f6620 = abs;
                    c14022.f6621 = i6;
                    c14022.f6624 = recyclerView4;
                    c14022.f6623 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f6614, f6610);
        for (int i7 = 0; i7 < this.f6614.size() && (recyclerView = (c1402 = this.f6614.get(i7)).f6624) != null; i7++) {
            RecyclerView.AbstractC0207 m3164 = m3164(recyclerView, c1402.f6623, c1402.f6622 ? Long.MAX_VALUE : j);
            if (m3164 != null && m3164.f1469 != null && m3164.m765() && !m3164.m783() && (recyclerView2 = m3164.f1469.get()) != null) {
                if (recyclerView2.f1430 && recyclerView2.f1433.m3076() != 0) {
                    recyclerView2.m694();
                }
                C1401 c14012 = recyclerView2.f1407;
                c14012.m3166(recyclerView2, true);
                if (c14012.f6619 != 0) {
                    try {
                        C1132.m2568("RV Nested Prefetch");
                        RecyclerView.C0224 c0224 = recyclerView2.f1386;
                        RecyclerView.AbstractC0228 abstractC0228 = recyclerView2.f1428;
                        c0224.f1551 = 1;
                        c0224.f1547 = abstractC0228.mo888();
                        c0224.f1543 = false;
                        c0224.f1541 = false;
                        c0224.f1553 = false;
                        for (int i8 = 0; i8 < c14012.f6619 * 2; i8 += 2) {
                            m3164(recyclerView2, c14012.f6617[i8], j);
                        }
                    } finally {
                        C1132.m2567();
                    }
                } else {
                    continue;
                }
            }
            c1402.f6622 = false;
            c1402.f6620 = 0;
            c1402.f6621 = 0;
            c1402.f6624 = null;
            c1402.f6623 = 0;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final RecyclerView.AbstractC0207 m3164(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int m3076 = recyclerView.f1433.m3076();
        int i2 = 0;
        while (true) {
            if (i2 >= m3076) {
                z = false;
                break;
            }
            RecyclerView.AbstractC0207 m684 = RecyclerView.m684(recyclerView.f1433.m3078(i2));
            if (m684.f1475 == i && !m684.m783()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0217 c0217 = recyclerView.f1411;
        try {
            recyclerView.m721();
            RecyclerView.AbstractC0207 m809 = c0217.m809(i, false, j);
            if (m809 != null) {
                if (!m809.m765() || m809.m783()) {
                    c0217.m802(m809, false);
                } else {
                    c0217.m797(m809.f1476);
                }
            }
            return m809;
        } finally {
            recyclerView.m719(false);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3165(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f6613 == 0) {
            this.f6613 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1401 c1401 = recyclerView.f1407;
        c1401.f6618 = i;
        c1401.f6616 = i2;
    }
}
