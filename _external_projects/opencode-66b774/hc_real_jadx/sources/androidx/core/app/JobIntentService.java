package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final HashMap<ComponentName, AbstractC0138> f1006 = new HashMap<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC0137 f1007;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC0138 f1008;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f1009 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final ArrayList<C0144> f1010;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AsyncTaskC0140 f1011;

    /* renamed from: androidx.core.app.JobIntentService$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0137 {
    }

    /* renamed from: androidx.core.app.JobIntentService$ぁごぐすすぃ, reason: contains not printable characters */
    public static abstract class AbstractC0138 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ComponentName f1012;

        public AbstractC0138(ComponentName componentName) {
            this.f1012 = componentName;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo379() {
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo380() {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo381() {
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C0139 extends AbstractC0138 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final PowerManager.WakeLock f1013;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final PowerManager.WakeLock f1014;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f1015;

        public C0139(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f1013 = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f1014 = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0138
        /* renamed from: 〺つふすそ */
        public void mo379() {
            synchronized (this) {
                if (!this.f1015) {
                    this.f1015 = true;
                    this.f1014.acquire(600000L);
                    this.f1013.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0138
        /* renamed from: くし〴〺ぅ */
        public void mo380() {
            synchronized (this) {
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC0138
        /* renamed from: げつ〴ぬぐ */
        public void mo381() {
            synchronized (this) {
                if (this.f1015) {
                    this.f1015 = false;
                    this.f1014.release();
                }
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$げつ〴ぬぐ, reason: contains not printable characters */
    public final class AsyncTaskC0140 extends AsyncTask<Void, Void, Void> {
        public AsyncTaskC0140() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[LOOP:0: B:2:0x0002->B:13:0x004c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Void[] r5) {
            /*
                r4 = this;
                java.lang.Void[] r5 = (java.lang.Void[]) r5
            L2:
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                androidx.core.app.JobIntentService$〺つふすそ r0 = r5.f1007
                r1 = 0
                if (r0 == 0) goto L31
                androidx.core.app.JobIntentService$なぎぱいぢぎ r0 = (androidx.core.app.JobIntentService.JobServiceEngineC0142) r0
                java.lang.Object r2 = r0.f1017
                monitor-enter(r2)
                android.app.job.JobParameters r5 = r0.f1018     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                goto L49
            L14:
                android.app.job.JobWorkItem r5 = r5.dequeueWork()     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                if (r5 == 0) goto L49
                android.content.Intent r2 = r5.getIntent()
                androidx.core.app.JobIntentService r3 = r0.f1019
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r2.setExtrasClassLoader(r3)
                androidx.core.app.JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ r2 = new androidx.core.app.JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ
                r2.<init>(r5)
                goto L4a
            L2e:
                r5 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                throw r5
            L31:
                java.util.ArrayList<androidx.core.app.JobIntentService$びぐびあび> r0 = r5.f1010
                monitor-enter(r0)
                java.util.ArrayList<androidx.core.app.JobIntentService$びぐびあび> r2 = r5.f1010     // Catch: java.lang.Throwable -> L5a
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L5a
                if (r2 <= 0) goto L48
                java.util.ArrayList<androidx.core.app.JobIntentService$びぐびあび> r5 = r5.f1010     // Catch: java.lang.Throwable -> L5a
                r2 = 0
                java.lang.Object r5 = r5.remove(r2)     // Catch: java.lang.Throwable -> L5a
                r2 = r5
                androidx.core.app.JobIntentService$づざかべべ r2 = (androidx.core.app.JobIntentService.InterfaceC0141) r2     // Catch: java.lang.Throwable -> L5a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                goto L4a
            L48:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            L49:
                r2 = r1
            L4a:
                if (r2 == 0) goto L59
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                android.content.Intent r0 = r2.getIntent()
                r5.m376(r0)
                r2.mo382()
                goto L2
            L59:
                return r1
            L5a:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                goto L5e
            L5d:
                throw r5
            L5e:
                goto L5d
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.AsyncTaskC0140.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public void onCancelled(Void r1) {
            JobIntentService.this.m377();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            JobIntentService.this.m377();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC0141 {
        Intent getIntent();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo382();
    }

    /* renamed from: androidx.core.app.JobIntentService$なぎぱいぢぎ, reason: contains not printable characters */
    public static final class JobServiceEngineC0142 extends JobServiceEngine implements InterfaceC0137 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Object f1017;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public JobParameters f1018;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final JobIntentService f1019;

        /* renamed from: androidx.core.app.JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
        public final class C0143 implements InterfaceC0141 {

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public final JobWorkItem f1021;

            public C0143(JobWorkItem jobWorkItem) {
                this.f1021 = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0141
            public Intent getIntent() {
                return this.f1021.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC0141
            /* renamed from: げつ〴ぬぐ */
            public void mo382() {
                synchronized (JobServiceEngineC0142.this.f1017) {
                    JobParameters jobParameters = JobServiceEngineC0142.this.f1018;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f1021);
                    }
                }
            }
        }

        public JobServiceEngineC0142(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f1017 = new Object();
            this.f1019 = jobIntentService;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f1018 = jobParameters;
            this.f1019.m378(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            AsyncTaskC0140 asyncTaskC0140 = this.f1019.f1011;
            if (asyncTaskC0140 != null) {
                asyncTaskC0140.cancel(false);
            }
            synchronized (this.f1017) {
                this.f1018 = null;
            }
            return true;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$びぐびあび, reason: contains not printable characters */
    public final class C0144 implements InterfaceC0141 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f1022;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Intent f1024;

        public C0144(Intent intent, int i) {
            this.f1024 = intent;
            this.f1022 = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0141
        public Intent getIntent() {
            return this.f1024;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC0141
        /* renamed from: げつ〴ぬぐ */
        public void mo382() {
            JobIntentService.this.stopSelf(this.f1022);
        }
    }

    public JobIntentService() {
        this.f1010 = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC0137 interfaceC0137 = this.f1007;
        if (interfaceC0137 != null) {
            return ((JobServiceEngineC0142) interfaceC0137).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f1007 = new JobServiceEngineC0142(this);
            this.f1008 = null;
            return;
        }
        this.f1007 = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, AbstractC0138> hashMap = f1006;
        AbstractC0138 abstractC0138 = hashMap.get(componentName);
        if (abstractC0138 == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            abstractC0138 = new C0139(this, componentName);
            hashMap.put(componentName, abstractC0138);
        }
        this.f1008 = abstractC0138;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0144> arrayList = this.f1010;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f1009 = true;
                this.f1008.mo381();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f1010 == null) {
            return 2;
        }
        this.f1008.mo380();
        synchronized (this.f1010) {
            ArrayList<C0144> arrayList = this.f1010;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0144(intent, i2));
            m378(true);
        }
        return 3;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract void m376(Intent intent);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m377() {
        ArrayList<C0144> arrayList = this.f1010;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f1011 = null;
                ArrayList<C0144> arrayList2 = this.f1010;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m378(false);
                } else if (!this.f1009) {
                    this.f1008.mo381();
                }
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m378(boolean z) {
        if (this.f1011 == null) {
            this.f1011 = new AsyncTaskC0140();
            AbstractC0138 abstractC0138 = this.f1008;
            if (abstractC0138 != null && z) {
                abstractC0138.mo379();
            }
            this.f1011.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
