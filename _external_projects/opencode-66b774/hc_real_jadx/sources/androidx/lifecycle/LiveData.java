package androidx.lifecycle;

import java.util.Map;
import p034.p069.p070.p071.C1447;
import p034.p069.p070.p072.C1458;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1678;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class LiveData<T> {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final Object f1272 = new Object();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f1273;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f1275;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public volatile Object f1278;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f1279;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public volatile Object f1280;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f1277 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1447<InterfaceC1678<? super T>, LiveData<T>.AbstractC0176> f1274 = new C1447<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f1276 = 0;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0176 implements Object {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final InterfaceC1664 f1281;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ LiveData f1282;

        @Override // androidx.lifecycle.LiveData.AbstractC0176
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean mo563() {
            return ((C1661) this.f1281.mo36()).f7776.compareTo(AbstractC1680.EnumC1681.STARTED) >= 0;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m564(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
            if (((C1661) this.f1281.mo36()).f7776 == AbstractC1680.EnumC1681.DESTROYED) {
                this.f1282.mo561(this.f1285);
            } else {
                m566(mo563());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0176
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public void mo565() {
            ((C1661) this.f1281.mo36()).f7779.mo3191(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$げつ〴ぬぐ, reason: contains not printable characters */
    public abstract class AbstractC0176 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1283;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f1284;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final InterfaceC1678<? super T> f1285;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ LiveData f1286;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void m566(boolean z) {
            if (z == this.f1283) {
                return;
            }
            this.f1283 = z;
            LiveData liveData = this.f1286;
            int i = liveData.f1276;
            boolean z2 = i == 0;
            liveData.f1276 = i + (z ? 1 : -1);
            if (z2 && z) {
                liveData.mo562();
            }
            LiveData liveData2 = this.f1286;
            if (liveData2.f1276 == 0 && !this.f1283) {
                liveData2.mo560();
            }
            if (this.f1283) {
                this.f1286.m559(this);
            }
        }

        /* renamed from: いいにぽつ */
        public abstract boolean mo563();

        /* renamed from: ぺぁあねじ */
        public void mo565() {
        }
    }

    public LiveData() {
        Object obj = f1272;
        this.f1280 = obj;
        this.f1278 = obj;
        this.f1279 = -1;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m557(String str) {
        if (C1458.m3197().f6753.mo3196()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m558(LiveData<T>.AbstractC0176 abstractC0176) {
        if (abstractC0176.f1283) {
            if (!abstractC0176.mo563()) {
                abstractC0176.m566(false);
                return;
            }
            int i = abstractC0176.f1284;
            int i2 = this.f1279;
            if (i >= i2) {
                return;
            }
            abstractC0176.f1284 = i2;
            abstractC0176.f1285.m3648((Object) this.f1280);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m559(LiveData<T>.AbstractC0176 abstractC0176) {
        if (this.f1275) {
            this.f1273 = true;
            return;
        }
        this.f1275 = true;
        do {
            this.f1273 = false;
            if (abstractC0176 != null) {
                m558(abstractC0176);
                abstractC0176 = null;
            } else {
                C1447<InterfaceC1678<? super T>, LiveData<T>.AbstractC0176>.C1453 m3188 = this.f1274.m3188();
                while (m3188.hasNext()) {
                    m558((AbstractC0176) ((Map.Entry) m3188.next()).getValue());
                    if (this.f1273) {
                        break;
                    }
                }
            }
        } while (this.f1273);
        this.f1275 = false;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo560() {
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo561(InterfaceC1678<? super T> interfaceC1678) {
        m557("removeObserver");
        LiveData<T>.AbstractC0176 mo3191 = this.f1274.mo3191(interfaceC1678);
        if (mo3191 == null) {
            return;
        }
        mo3191.mo565();
        mo3191.m566(false);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo562() {
    }
}
