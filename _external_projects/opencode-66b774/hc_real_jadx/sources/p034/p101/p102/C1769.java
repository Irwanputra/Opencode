package p034.p101.p102;

import androidx.core.app.NotificationCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p034.p080.C1507;
import p034.p094.AbstractC1666;
import p034.p094.AbstractC1674;
import p034.p094.C1676;
import p034.p094.C1679;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1667;
import p034.p094.InterfaceC1678;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.へぬ〴づぞ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1769 extends AbstractC1773 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1770 f7990;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1664 f7991;

    /* renamed from: づざかべべ.へぬ〴づぞ.げつ〴ぬぐ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1770 extends AbstractC1666 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public static final InterfaceC1667 f7992 = new C1771();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1507<C1772> f7993 = new C1507<>(10);

        /* renamed from: づざかべべ.へぬ〴づぞ.げつ〴ぬぐ.〺つふすそ$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C1771 implements InterfaceC1667 {
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public <T extends AbstractC1666> T m3818(Class<T> cls) {
                return new C1770();
            }
        }

        @Override // p034.p094.AbstractC1666
        /* renamed from: げつ〴ぬぐ */
        public void mo3638() {
            if (this.f7993.m3302() > 0) {
                this.f7993.m3296(0).getClass();
                throw null;
            }
            C1507<C1772> c1507 = this.f7993;
            int i = c1507.f6957;
            Object[] objArr = c1507.f6958;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c1507.f6957 = 0;
            c1507.f6955 = false;
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    /* renamed from: づざかべべ.へぬ〴づぞ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1772<D> extends C1676<D> {
        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C2786.m4817(null, sb);
            sb.append("}}");
            return sb.toString();
        }

        @Override // p034.p094.C1676
        /* renamed from: ぁごぐすすぃ */
        public void mo3647(D d) {
            super.mo3647(d);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: づざかべべ */
        public void mo560() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: なぎぱいぢぎ */
        public void mo561(InterfaceC1678<? super D> interfaceC1678) {
            super.mo561(interfaceC1678);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: びぐびあび */
        public void mo562() {
            throw null;
        }
    }

    public C1769(InterfaceC1664 interfaceC1664, C1679 c1679) {
        this.f7991 = interfaceC1664;
        InterfaceC1667 interfaceC1667 = C1770.f7992;
        String canonicalName = C1770.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String m4205 = C2098.m4205("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        AbstractC1666 abstractC1666 = c1679.f7795.get(m4205);
        if (!C1770.class.isInstance(abstractC1666)) {
            abstractC1666 = interfaceC1667 instanceof AbstractC1674 ? ((AbstractC1674) interfaceC1667).m3646(m4205, C1770.class) : ((C1770.C1771) interfaceC1667).m3818(C1770.class);
            AbstractC1666 put = c1679.f7795.put(m4205, abstractC1666);
            if (put != null) {
                put.mo3638();
            }
        }
        this.f7990 = (C1770) abstractC1666;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C2786.m4817(this.f7991, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // p034.p101.p102.AbstractC1773
    @Deprecated
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3817(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1770 c1770 = this.f7990;
        if (c1770.f7993.m3302() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c1770.f7993.m3302() <= 0) {
                return;
            }
            C1772 m3296 = c1770.f7993.m3296(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1770.f7993.m3300(0));
            printWriter.print(": ");
            printWriter.println(m3296.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }
}
