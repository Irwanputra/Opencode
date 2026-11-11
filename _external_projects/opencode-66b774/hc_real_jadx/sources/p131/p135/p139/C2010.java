package p131.p135.p139;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p131.p135.p137.EnumC1975;
import p131.p135.p138.RunnableC2003;

/* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2010 extends ThreadPoolExecutor {

    /* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C2011 extends FutureTask<RunnableC2003> implements Comparable<C2011> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final RunnableC2003 f8738;

        public C2011(RunnableC2003 runnableC2003) {
            super(runnableC2003, null);
            this.f8738 = runnableC2003;
        }

        @Override // java.lang.Comparable
        public int compareTo(C2011 c2011) {
            RunnableC2003 runnableC2003 = this.f8738;
            EnumC1975 enumC1975 = runnableC2003.f8723;
            RunnableC2003 runnableC20032 = c2011.f8738;
            EnumC1975 enumC19752 = runnableC20032.f8723;
            return enumC1975 == enumC19752 ? runnableC2003.f8724 - runnableC20032.f8724 : enumC19752.ordinal() - enumC1975.ordinal();
        }
    }

    public C2010(int i, ThreadFactory threadFactory) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        C2011 c2011 = new C2011((RunnableC2003) runnable);
        execute(c2011);
        return c2011;
    }
}
