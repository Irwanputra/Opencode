.class public Ldev/epro/v2ray/util/GuardProcess;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private cmd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile guardThread:Ljava/lang/Thread;

.field private volatile isDestroyed:Z

.field private volatile isRestart:Z

.field private volatile process:Ljava/lang/Process;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z

    iput-object p1, p0, Ldev/epro/v2ray/util/GuardProcess;->cmd:Ljava/util/List;

    return-void
.end method

.method public static synthetic access$000(Ldev/epro/v2ray/util/GuardProcess;)Z
    .registers 1

    iget-boolean p0, p0, Ldev/epro/v2ray/util/GuardProcess;->isDestroyed:Z

    return p0
.end method

.method public static synthetic access$002(Ldev/epro/v2ray/util/GuardProcess;Z)Z
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/util/GuardProcess;->isDestroyed:Z

    return p1
.end method

.method public static synthetic access$100(Ldev/epro/v2ray/util/GuardProcess;)Ljava/lang/Process;
    .registers 1

    iget-object p0, p0, Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;

    return-object p0
.end method

.method public static synthetic access$102(Ldev/epro/v2ray/util/GuardProcess;Ljava/lang/Process;)Ljava/lang/Process;
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;

    return-object p1
.end method

.method public static synthetic access$200(Ldev/epro/v2ray/util/GuardProcess;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Ldev/epro/v2ray/util/GuardProcess;->cmd:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$300(Ldev/epro/v2ray/util/GuardProcess;)Z
    .registers 1

    iget-boolean p0, p0, Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z

    return p0
.end method

.method public static synthetic access$302(Ldev/epro/v2ray/util/GuardProcess;Z)Z
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z

    return p1
.end method


# virtual methods
.method public destroy()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldev/epro/v2ray/util/GuardProcess;->isDestroyed:Z

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess;->guardThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    :try_start_d
    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess;->guardThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_12
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_12} :catch_12

    :catch_12
    return-void
.end method

.method public declared-synchronized restart()V
    .registers 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Ldev/epro/v2ray/util/GuardProcess;->isRestart:Z

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess;->process:Ljava/lang/Process;

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
    :try_end_9
    .catchall {:try_start_2 .. :try_end_9} :catchall_b

    monitor-exit p0

    return-void

    :catchall_b
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public start(Ldev/epro/v2ray/util/Callback;Landroid/content/Context;)Ldev/epro/v2ray/util/GuardProcess;
    .registers 6

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    :try_start_6
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_9} :catch_9

    :catch_9
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Ldev/epro/v2ray/util/GuardProcess$1;

    invoke-direct {v2, p0, p2, p1, v0}, Ldev/epro/v2ray/util/GuardProcess$1;-><init>(Ldev/epro/v2ray/util/GuardProcess;Landroid/content/Context;Ldev/epro/v2ray/util/Callback;Ljava/util/concurrent/Semaphore;)V

    const-string p1, "GuardThread-"

    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Ldev/epro/v2ray/util/GuardProcess;->cmd:Ljava/util/List;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v1, p0, Ldev/epro/v2ray/util/GuardProcess;->guardThread:Ljava/lang/Thread;

    iget-object p1, p0, Ldev/epro/v2ray/util/GuardProcess;->guardThread:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :try_start_29
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_2c
    .catch Ljava/lang/InterruptedException; {:try_start_29 .. :try_end_2c} :catch_2c

    :catch_2c
    return-object p0
.end method

.method public waitFor()I
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/util/GuardProcess;->guardThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    const/4 v0, 0x0

    return v0
.end method
