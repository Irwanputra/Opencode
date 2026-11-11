package p034.p065.p066;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p045.C1096;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1366 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1368 f6509 = new C1368();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final List<View> f6510 = new ArrayList();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1367 f6511;

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1367 {
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1368 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1368 f6512;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public long f6513 = 0;

        public String toString() {
            if (this.f6512 == null) {
                return Long.toBinaryString(this.f6513);
            }
            return this.f6512.toString() + "xx" + Long.toBinaryString(this.f6513);
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void m3088(int i) {
            if (i < 64) {
                this.f6513 |= 1 << i;
            } else {
                m3091();
                this.f6512.m3088(i - 64);
            }
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int m3089(int i) {
            long j;
            C1368 c1368 = this.f6512;
            if (c1368 == null) {
                if (i >= 64) {
                    j = this.f6513;
                    return Long.bitCount(j);
                }
            } else if (i >= 64) {
                return Long.bitCount(this.f6513) + c1368.m3089(i - 64);
            }
            j = this.f6513 & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void m3090() {
            this.f6513 = 0L;
            C1368 c1368 = this.f6512;
            if (c1368 != null) {
                c1368.m3090();
            }
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m3091() {
            if (this.f6512 == null) {
                this.f6512 = new C1368();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3092(int i) {
            if (i < 64) {
                this.f6513 &= (1 << i) ^ (-1);
                return;
            }
            C1368 c1368 = this.f6512;
            if (c1368 != null) {
                c1368.m3092(i - 64);
            }
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void m3093(int i, boolean z) {
            if (i >= 64) {
                m3091();
                this.f6512.m3093(i - 64, z);
                return;
            }
            long j = this.f6513;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f6513 = ((j & (j2 ^ (-1))) << 1) | (j & j2);
            if (z) {
                m3088(i);
            } else {
                m3092(i);
            }
            if (z2 || this.f6512 != null) {
                m3091();
                this.f6512.m3093(0, z2);
            }
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean m3094(int i) {
            if (i >= 64) {
                m3091();
                return this.f6512.m3094(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f6513;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ (-1));
            this.f6513 = j3;
            long j4 = j - 1;
            this.f6513 = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
            C1368 c1368 = this.f6512;
            if (c1368 != null) {
                if (c1368.m3095(0)) {
                    m3088(63);
                }
                this.f6512.m3094(0);
            }
            return z;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean m3095(int i) {
            if (i < 64) {
                return (this.f6513 & (1 << i)) != 0;
            }
            m3091();
            return this.f6512.m3095(i - 64);
        }
    }

    public C1366(InterfaceC1367 interfaceC1367) {
        this.f6511 = interfaceC1367;
    }

    public String toString() {
        return this.f6509.toString() + ", hidden list:" + this.f6510.size();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int m3076() {
        return ((C1395) this.f6511).m3151();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3077(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m3151 = i < 0 ? ((C1395) this.f6511).m3151() : m3084(i);
        this.f6509.m3093(m3151, z);
        if (z) {
            m3086(view);
        }
        C1395 c1395 = (C1395) this.f6511;
        c1395.getClass();
        RecyclerView.AbstractC0207 m684 = RecyclerView.m684(view);
        if (m684 != null) {
            if (!m684.m768() && !m684.m772()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(m684);
                throw new IllegalArgumentException(C2098.m4192(c1395.f6599, sb));
            }
            m684.f1471 &= -257;
        }
        c1395.f6599.attachViewToParent(view, m3151, layoutParams);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public View m3078(int i) {
        return ((C1395) this.f6511).f6599.getChildAt(i);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int m3079(View view) {
        int indexOfChild = ((C1395) this.f6511).f6599.indexOfChild(view);
        if (indexOfChild == -1 || this.f6509.m3095(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f6509.m3089(indexOfChild);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3080(int i) {
        RecyclerView.AbstractC0207 m684;
        int m3084 = m3084(i);
        this.f6509.m3094(m3084);
        C1395 c1395 = (C1395) this.f6511;
        View childAt = c1395.f6599.getChildAt(m3084);
        if (childAt != null && (m684 = RecyclerView.m684(childAt)) != null) {
            if (m684.m768() && !m684.m772()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(m684);
                throw new IllegalArgumentException(C2098.m4192(c1395.f6599, sb));
            }
            m684.m763(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        c1395.f6599.detachViewFromParent(m3084);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3081(View view, int i, boolean z) {
        int m3151 = i < 0 ? ((C1395) this.f6511).m3151() : m3084(i);
        this.f6509.m3093(m3151, z);
        if (z) {
            m3086(view);
        }
        C1395 c1395 = (C1395) this.f6511;
        c1395.f6599.addView(view, m3151);
        RecyclerView recyclerView = c1395.f6599;
        recyclerView.getClass();
        RecyclerView.m684(view);
        recyclerView.m706();
        List<RecyclerView.InterfaceC0226> list = recyclerView.f1434;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                recyclerView.f1434.get(size).mo884(view);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m3082() {
        return ((C1395) this.f6511).m3151() - this.f6510.size();
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final boolean m3083(View view) {
        if (!this.f6510.remove(view)) {
            return false;
        }
        C1395 c1395 = (C1395) this.f6511;
        c1395.getClass();
        RecyclerView.AbstractC0207 m684 = RecyclerView.m684(view);
        if (m684 == null) {
            return true;
        }
        c1395.f6599.m739(m684, m684.f1472);
        m684.f1472 = 0;
        return true;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int m3084(int i) {
        if (i < 0) {
            return -1;
        }
        int m3151 = ((C1395) this.f6511).m3151();
        int i2 = i;
        while (i2 < m3151) {
            int m3089 = i - (i2 - this.f6509.m3089(i2));
            if (m3089 == 0) {
                while (this.f6509.m3095(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m3089;
        }
        return -1;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View m3085(int i) {
        return ((C1395) this.f6511).m3153(m3084(i));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m3086(View view) {
        this.f6510.add(view);
        C1395 c1395 = (C1395) this.f6511;
        c1395.getClass();
        RecyclerView.AbstractC0207 m684 = RecyclerView.m684(view);
        if (m684 != null) {
            RecyclerView recyclerView = c1395.f6599;
            int i = m684.f1473;
            if (i == -1) {
                i = C1096.m2519(m684.f1476);
            }
            m684.f1472 = i;
            recyclerView.m739(m684, 4);
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m3087(View view) {
        return this.f6510.contains(view);
    }
}
