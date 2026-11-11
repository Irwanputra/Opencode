package p034.p035.p040;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1032 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public HandlerThread f5440;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Handler f5441;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f5442 = new Object();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Handler.Callback f5443 = new C1035();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f5444 = 0;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1033 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ AtomicReference f5445;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ Callable f5446;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ AtomicBoolean f5447;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ Condition f5448;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ ReentrantLock f5449;

        public RunnableC1033(C1032 c1032, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f5445 = atomicReference;
            this.f5446 = callable;
            this.f5449 = reentrantLock;
            this.f5447 = atomicBoolean;
            this.f5448 = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5445.set(this.f5446.call());
            } catch (Exception unused) {
            }
            this.f5449.lock();
            try {
                this.f5447.set(false);
                this.f5448.signal();
            } finally {
                this.f5449.unlock();
            }
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.なぎぱいぢぎ$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1034<T> {
        /* renamed from: げつ〴ぬぐ */
        void mo2365(T t);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1035 implements Handler.Callback {
        public C1035() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C1032 c1032 = C1032.this;
                synchronized (c1032.f5442) {
                    if (!c1032.f5441.hasMessages(1)) {
                        c1032.f5440.quit();
                        c1032.f5440 = null;
                        c1032.f5441 = null;
                    }
                }
                return true;
            }
            if (i != 1) {
                return true;
            }
            C1032 c10322 = C1032.this;
            Runnable runnable = (Runnable) message.obj;
            c10322.getClass();
            runnable.run();
            synchronized (c10322.f5442) {
                c10322.f5441.removeMessages(0);
                Handler handler = c10322.f5441;
                handler.sendMessageDelayed(handler.obtainMessage(0), 10000);
            }
            return true;
        }
    }

    public C1032(String str, int i, int i2) {
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public <T> T m2368(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m2369(new RunnableC1033(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2369(Runnable runnable) {
        synchronized (this.f5442) {
            if (this.f5440 == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f5440 = handlerThread;
                handlerThread.start();
                this.f5441 = new Handler(this.f5440.getLooper(), this.f5443);
                this.f5444++;
            }
            this.f5441.removeMessages(0);
            Handler handler = this.f5441;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
