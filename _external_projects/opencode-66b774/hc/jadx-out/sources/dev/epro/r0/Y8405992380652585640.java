package dev.epro.r0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y8405992380652585640 {
    private boolean isEnabled;
    private final ArrayList eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public Y8405992380652585640(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(R1119249027005566153 r1119249027005566153) {
        this.closeables.add(r1119249027005566153);
    }

    public final G12293180102257068867 createNavigationEventHandler$activity(I15850359048462423476 i15850359048462423476) {
        G12293180102257068867 g12293180102257068867 = new G12293180102257068867(this, i15850359048462423476);
        this.eventHandlers.add(g12293180102257068867);
        return g12293180102257068867;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        boolean zIsTerminated;
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.closeables;
        Iterator<AutoCloseable> it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.eventHandlers;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((G12293180102257068867) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else if (next instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) next).release();
            } else {
                if (!(next instanceof MediaDrm)) {
                    K2042933864045806308.h();
                    return;
                }
                ((MediaDrm) next).release();
            }
        }
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        ArrayList arrayList = this.eventHandlers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            G12293180102257068867 g12293180102257068867 = (G12293180102257068867) obj;
            g12293180102257068867.f(g12293180102257068867.g && z);
        }
    }

    public void handleOnBackCancelled() {
    }

    public void handleOnBackProgressed(N7102107663372104177 n7102107663372104177) {
    }

    public void handleOnBackStarted(N7102107663372104177 n7102107663372104177) {
    }
}
