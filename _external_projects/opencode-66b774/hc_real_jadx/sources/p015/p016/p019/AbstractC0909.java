package p015.p016.p019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p015.p016.p017.C0784;
import p015.p016.p020.C0976;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0909 extends AbstractC0917 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5235 = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ArrayList<AbstractC0917> f5236 = new ArrayList<>();

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static final class C0910 extends AbstractC0909 {
        public C0910() {
        }

        public C0910(AbstractC0917... abstractC0917Arr) {
            List asList = Arrays.asList(abstractC0917Arr);
            if (this.f5235 > 1) {
                this.f5236.add(new C0911(asList));
            } else {
                this.f5236.addAll(asList);
            }
            m2238();
        }

        public String toString() {
            return C0784.m2111(this.f5236, ", ");
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void m2239(AbstractC0917 abstractC0917) {
            this.f5236.add(abstractC0917);
            m2238();
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            for (int i = 0; i < this.f5235; i++) {
                if (this.f5236.get(i).mo2237(c0976, c09762)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0911 extends AbstractC0909 {
        public C0911(Collection<AbstractC0917> collection) {
            this.f5236.addAll(collection);
            m2238();
        }

        public C0911(AbstractC0917... abstractC0917Arr) {
            this(Arrays.asList(abstractC0917Arr));
        }

        public String toString() {
            return C0784.m2111(this.f5236, " ");
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            for (int i = 0; i < this.f5235; i++) {
                if (!this.f5236.get(i).mo2237(c0976, c09762)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m2238() {
        this.f5235 = this.f5236.size();
    }
}
