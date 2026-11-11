package p131.p145.p149;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p131.p145.p149.AbstractC2059;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2034 extends AbstractC2059 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ArrayList<AbstractC2059> f8784 = new ArrayList<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public HashMap<AbstractC2059, C2038> f8787 = new HashMap<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ArrayList<C2038> f8785 = new ArrayList<>();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<C2038> f8786 = new ArrayList<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f8782 = true;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C2037 f8781 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f8788 = false;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f8783 = false;

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public class C2035 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2038 f8790;

        public C2035(AbstractC2059 abstractC2059) {
            C2038 c2038 = C2034.this.f8787.get(abstractC2059);
            this.f8790 = c2038;
            if (c2038 == null) {
                C2038 c20382 = new C2038(abstractC2059);
                this.f8790 = c20382;
                C2034.this.f8787.put(abstractC2059, c20382);
                C2034.this.f8785.add(this.f8790);
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2036 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f8791;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2038 f8792;

        public C2036(C2038 c2038, int i) {
            this.f8792 = c2038;
            this.f8791 = i;
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2037 implements AbstractC2059.InterfaceC2060 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2034 f8794;

        public C2037(C2034 c2034) {
            this.f8794 = c2034;
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo4137(AbstractC2059 abstractC2059) {
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo4138(AbstractC2059 abstractC2059) {
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo4139(AbstractC2059 abstractC2059) {
            abstractC2059.m4147(this);
            C2034.this.f8784.remove(abstractC2059);
            boolean z = true;
            this.f8794.f8787.get(abstractC2059).f8796 = true;
            if (C2034.this.f8788) {
                return;
            }
            ArrayList<C2038> arrayList = this.f8794.f8786;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!arrayList.get(i).f8796) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                ArrayList<AbstractC2059.InterfaceC2060> arrayList2 = C2034.this.f8824;
                if (arrayList2 != null) {
                    ArrayList arrayList3 = (ArrayList) arrayList2.clone();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC2059.InterfaceC2060) arrayList3.get(i2)).mo4139(this.f8794);
                    }
                }
                this.f8794.f8783 = false;
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ$づざかべべ, reason: contains not printable characters */
    public static class C2038 implements Cloneable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public AbstractC2059 f8795;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ArrayList<C2036> f8797 = null;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public ArrayList<C2036> f8800 = null;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ArrayList<C2038> f8798 = null;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public ArrayList<C2038> f8799 = null;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f8796 = false;

        public C2038(AbstractC2059 abstractC2059) {
            this.f8795 = abstractC2059;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C2038 clone() {
            try {
                C2038 c2038 = (C2038) super.clone();
                c2038.f8795 = this.f8795.clone();
                return c2038;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m4141(C2036 c2036) {
            if (this.f8797 == null) {
                this.f8797 = new ArrayList<>();
                this.f8798 = new ArrayList<>();
            }
            this.f8797.add(c2036);
            if (!this.f8798.contains(c2036.f8792)) {
                this.f8798.add(c2036.f8792);
            }
            C2038 c2038 = c2036.f8792;
            if (c2038.f8799 == null) {
                c2038.f8799 = new ArrayList<>();
            }
            c2038.f8799.add(this);
        }
    }

    /* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.〺つふすそ$びぐびあび, reason: contains not printable characters */
    public static class C2039 implements AbstractC2059.InterfaceC2060 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2038 f8801;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f8802;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2034 f8803;

        public C2039(C2034 c2034, C2038 c2038, int i) {
            this.f8803 = c2034;
            this.f8801 = c2038;
            this.f8802 = i;
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: 〺つふすそ */
        public void mo4137(AbstractC2059 abstractC2059) {
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: くし〴〺ぅ */
        public void mo4138(AbstractC2059 abstractC2059) {
            if (this.f8802 == 0) {
                m4142(abstractC2059);
            }
        }

        @Override // p131.p145.p149.AbstractC2059.InterfaceC2060
        /* renamed from: げつ〴ぬぐ */
        public void mo4139(AbstractC2059 abstractC2059) {
            if (this.f8802 == 1) {
                m4142(abstractC2059);
            }
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final void m4142(AbstractC2059 abstractC2059) {
            if (this.f8803.f8788) {
                return;
            }
            C2036 c2036 = null;
            int size = this.f8801.f8800.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C2036 c20362 = this.f8801.f8800.get(i);
                if (c20362.f8791 == this.f8802 && c20362.f8792.f8795 == abstractC2059) {
                    abstractC2059.m4147(this);
                    c2036 = c20362;
                    break;
                }
                i++;
            }
            this.f8801.f8800.remove(c2036);
            if (this.f8801.f8800.size() == 0) {
                this.f8801.f8795.mo4135();
                this.f8803.f8784.add(this.f8801.f8795);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m4131() {
        if (!this.f8782) {
            int size = this.f8785.size();
            for (int i = 0; i < size; i++) {
                C2038 c2038 = this.f8785.get(i);
                ArrayList<C2036> arrayList = c2038.f8797;
                if (arrayList != null && arrayList.size() > 0) {
                    int size2 = c2038.f8797.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C2036 c2036 = c2038.f8797.get(i2);
                        if (c2038.f8798 == null) {
                            c2038.f8798 = new ArrayList<>();
                        }
                        if (!c2038.f8798.contains(c2036.f8792)) {
                            c2038.f8798.add(c2036.f8792);
                        }
                    }
                }
                c2038.f8796 = false;
            }
            return;
        }
        this.f8786.clear();
        ArrayList arrayList2 = new ArrayList();
        int size3 = this.f8785.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C2038 c20382 = this.f8785.get(i3);
            ArrayList<C2036> arrayList3 = c20382.f8797;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(c20382);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        while (arrayList2.size() > 0) {
            int size4 = arrayList2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C2038 c20383 = (C2038) arrayList2.get(i4);
                this.f8786.add(c20383);
                ArrayList<C2038> arrayList5 = c20383.f8799;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        C2038 c20384 = c20383.f8799.get(i5);
                        c20384.f8798.remove(c20383);
                        if (c20384.f8798.size() == 0) {
                            arrayList4.add(c20384);
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            arrayList4.clear();
        }
        this.f8782 = false;
        if (this.f8786.size() != this.f8785.size()) {
            throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2034 clone() {
        C2034 c2034 = (C2034) super.clone();
        c2034.f8782 = true;
        c2034.f8788 = false;
        c2034.f8783 = false;
        c2034.f8784 = new ArrayList<>();
        c2034.f8787 = new HashMap<>();
        c2034.f8785 = new ArrayList<>();
        c2034.f8786 = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<C2038> it = this.f8785.iterator();
        while (it.hasNext()) {
            C2038 next = it.next();
            C2038 clone = next.clone();
            hashMap.put(next, clone);
            c2034.f8785.add(clone);
            c2034.f8787.put(clone.f8795, clone);
            ArrayList arrayList = null;
            clone.f8797 = null;
            clone.f8800 = null;
            clone.f8799 = null;
            clone.f8798 = null;
            ArrayList<AbstractC2059.InterfaceC2060> arrayList2 = clone.f8795.f8824;
            if (arrayList2 != null) {
                Iterator<AbstractC2059.InterfaceC2060> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AbstractC2059.InterfaceC2060 next2 = it2.next();
                    if (next2 instanceof C2037) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.remove((AbstractC2059.InterfaceC2060) it3.next());
                    }
                }
            }
        }
        Iterator<C2038> it4 = this.f8785.iterator();
        while (it4.hasNext()) {
            C2038 next3 = it4.next();
            C2038 c2038 = (C2038) hashMap.get(next3);
            ArrayList<C2036> arrayList3 = next3.f8797;
            if (arrayList3 != null) {
                Iterator<C2036> it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    C2036 next4 = it5.next();
                    c2038.m4141(new C2036((C2038) hashMap.get(next4.f8792), next4.f8791));
                }
            }
        }
        return c2034;
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo4134() {
        this.f8788 = true;
        if (this.f8783) {
            if (this.f8786.size() != this.f8785.size()) {
                m4131();
                Iterator<C2038> it = this.f8786.iterator();
                while (it.hasNext()) {
                    C2038 next = it.next();
                    if (this.f8781 == null) {
                        this.f8781 = new C2037(this);
                    }
                    next.f8795.m4146(this.f8781);
                }
            }
            if (this.f8786.size() > 0) {
                Iterator<C2038> it2 = this.f8786.iterator();
                while (it2.hasNext()) {
                    it2.next().f8795.mo4134();
                }
            }
            ArrayList<AbstractC2059.InterfaceC2060> arrayList = this.f8824;
            if (arrayList != null) {
                Iterator it3 = ((ArrayList) arrayList.clone()).iterator();
                while (it3.hasNext()) {
                    ((AbstractC2059.InterfaceC2060) it3.next()).mo4139(this);
                }
            }
            this.f8783 = false;
        }
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void mo4135() {
        this.f8788 = false;
        this.f8783 = true;
        m4131();
        int size = this.f8786.size();
        for (int i = 0; i < size; i++) {
            C2038 c2038 = this.f8786.get(i);
            ArrayList<AbstractC2059.InterfaceC2060> arrayList = c2038.f8795.f8824;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    AbstractC2059.InterfaceC2060 interfaceC2060 = (AbstractC2059.InterfaceC2060) it.next();
                    if ((interfaceC2060 instanceof C2039) || (interfaceC2060 instanceof C2037)) {
                        c2038.f8795.m4147(interfaceC2060);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            C2038 c20382 = this.f8786.get(i2);
            if (this.f8781 == null) {
                this.f8781 = new C2037(this);
            }
            ArrayList<C2036> arrayList3 = c20382.f8797;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(c20382);
            } else {
                int size2 = c20382.f8797.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C2036 c2036 = c20382.f8797.get(i3);
                    c2036.f8792.f8795.m4146(new C2039(this, c20382, c2036.f8791));
                }
                c20382.f8800 = (ArrayList) c20382.f8797.clone();
            }
            c20382.f8795.m4146(this.f8781);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C2038 c20383 = (C2038) it2.next();
            c20383.f8795.mo4135();
            this.f8784.add(c20383.f8795);
        }
        ArrayList<AbstractC2059.InterfaceC2060> arrayList4 = this.f8824;
        if (arrayList4 != null) {
            ArrayList arrayList5 = (ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC2059.InterfaceC2060) arrayList5.get(i4)).mo4138(this);
            }
        }
        if (this.f8785.size() == 0) {
            this.f8783 = false;
            ArrayList<AbstractC2059.InterfaceC2060> arrayList6 = this.f8824;
            if (arrayList6 != null) {
                ArrayList arrayList7 = (ArrayList) arrayList6.clone();
                int size4 = arrayList7.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((AbstractC2059.InterfaceC2060) arrayList7.get(i5)).mo4139(this);
                }
            }
        }
    }

    @Override // p131.p145.p149.AbstractC2059
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo4136() {
        Iterator<C2038> it = this.f8785.iterator();
        while (it.hasNext()) {
            if (it.next().f8795.mo4136()) {
                return true;
            }
        }
        return false;
    }
}
