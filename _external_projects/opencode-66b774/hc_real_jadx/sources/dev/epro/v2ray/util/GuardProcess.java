package dev.epro.v2ray.util;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Semaphore;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class GuardProcess {
    private List<String> cmd;
    private volatile Thread guardThread;
    private volatile boolean isDestroyed;
    private volatile boolean isRestart = false;
    private volatile Process process;

    public GuardProcess(List<String> list) {
        this.cmd = list;
    }

    public void destroy() {
        this.isDestroyed = true;
        this.guardThread.interrupt();
        this.process.destroy();
        try {
            this.guardThread.join();
        } catch (InterruptedException unused) {
        }
    }

    public synchronized void restart() {
        this.isRestart = true;
        this.process.destroy();
    }

    public GuardProcess start(final Callback callback, final Context context) {
        final Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
        } catch (InterruptedException unused) {
        }
        Runnable runnable = new Runnable() { // from class: dev.epro.v2ray.util.GuardProcess.1
            @Override // java.lang.Runnable
            public void run() {
                Callback callback2 = null;
                while (!GuardProcess.this.isDestroyed) {
                    try {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            GuardProcess.this.process = new ProcessBuilder((List<String>) GuardProcess.this.cmd).redirectErrorStream(true).directory(context.getFilesDir()).start();
                            if (callback2 == null) {
                                callback2 = callback;
                            } else {
                                callback2.callback();
                            }
                            semaphore.release();
                            GuardProcess.this.process.waitFor();
                            synchronized (this) {
                                if (GuardProcess.this.isRestart) {
                                    GuardProcess.this.isRestart = false;
                                } else if (System.currentTimeMillis() - currentTimeMillis < 1000) {
                                    GuardProcess.this.isDestroyed = true;
                                }
                            }
                        } catch (Exception unused2) {
                            if (GuardProcess.this.process != null) {
                                GuardProcess.this.process.destroy();
                            }
                        }
                    } finally {
                        semaphore.release();
                    }
                }
            }
        };
        StringBuilder m4207 = C2098.m4207("GuardThread-");
        m4207.append(this.cmd);
        this.guardThread = new Thread(runnable, m4207.toString());
        this.guardThread.start();
        try {
            semaphore.acquire();
        } catch (InterruptedException unused2) {
        }
        return this;
    }

    public int waitFor() {
        this.guardThread.join();
        return 0;
    }
}
