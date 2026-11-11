package p131.p145.p149;

import java.util.ArrayList;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2059 implements Cloneable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ArrayList<InterfaceC2060> f8824 = null;

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC2060 {
        /* renamed from: 〺つふすそ */
        void mo4137(AbstractC2059 abstractC2059);

        /* renamed from: くし〴〺ぅ */
        void mo4138(AbstractC2059 abstractC2059);

        /* renamed from: げつ〴ぬぐ */
        void mo4139(AbstractC2059 abstractC2059);
    }

    @Override // 
    /* renamed from: 〺つふすそ, reason: merged with bridge method [inline-methods] */
    public AbstractC2059 clone() {
        try {
            AbstractC2059 abstractC2059 = (AbstractC2059) super.clone();
            ArrayList<InterfaceC2060> arrayList = this.f8824;
            if (arrayList != null) {
                abstractC2059.f8824 = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC2059.f8824.add(arrayList.get(i));
                }
            }
            return abstractC2059;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: くし〴〺ぅ */
    public void mo4134() {
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4146(InterfaceC2060 interfaceC2060) {
        if (this.f8824 == null) {
            this.f8824 = new ArrayList<>();
        }
        this.f8824.add(interfaceC2060);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4147(InterfaceC2060 interfaceC2060) {
        ArrayList<InterfaceC2060> arrayList = this.f8824;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC2060);
        if (this.f8824.size() == 0) {
            this.f8824 = null;
        }
    }

    /* renamed from: なぎぱいぢぎ */
    public void mo4135() {
    }

    /* renamed from: びぐびあび */
    public abstract boolean mo4136();
}
