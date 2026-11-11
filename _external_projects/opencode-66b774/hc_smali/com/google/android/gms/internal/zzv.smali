.class public final Lcom/google/android/gms/internal/zzv;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final zzab:Lcom/google/android/gms/internal/zzm;

.field private final zzbb:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzbc:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/zzr<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final zzbd:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Lcom/google/android/gms/internal/zzr<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final zzbe:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Lcom/google/android/gms/internal/zzr<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final zzbf:[Lcom/google/android/gms/internal/zzn;

.field private final zzbg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final zzj:Lcom/google/android/gms/internal/zzb;

.field private final zzk:Lcom/google/android/gms/internal/zzz;

.field private zzq:Lcom/google/android/gms/internal/zzd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzm;)V
    .registers 4

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/zzv;-><init>(Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzm;I)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzm;I)V
    .registers 6

    new-instance p3, Lcom/google/android/gms/internal/zzi;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p3, v0}, Lcom/google/android/gms/internal/zzi;-><init>(Landroid/os/Handler;)V

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/android/gms/internal/zzv;-><init>(Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzm;ILcom/google/android/gms/internal/zzz;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzm;ILcom/google/android/gms/internal/zzz;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzv;->zzbb:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzv;->zzbc:Ljava/util/Set;

    new-instance p3, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {p3}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzv;->zzbd:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance p3, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {p3}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzv;->zzbe:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzv;->zzbg:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzv;->zzj:Lcom/google/android/gms/internal/zzb;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzv;->zzab:Lcom/google/android/gms/internal/zzm;

    const/4 p1, 0x4

    new-array p1, p1, [Lcom/google/android/gms/internal/zzn;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzv;->zzbf:[Lcom/google/android/gms/internal/zzn;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzv;->zzk:Lcom/google/android/gms/internal/zzz;

    return-void
.end method


# virtual methods
.method public final start()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzq:Lcom/google/android/gms/internal/zzd;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzd;->quit()V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbf:[Lcom/google/android/gms/internal/zzn;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_c
    if-ge v3, v1, :cond_18

    aget-object v4, v0, v3

    if-eqz v4, :cond_15

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzn;->quit()V

    :cond_15
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_18
    new-instance v0, Lcom/google/android/gms/internal/zzd;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzv;->zzbd:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzv;->zzbe:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzv;->zzj:Lcom/google/android/gms/internal/zzb;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzv;->zzk:Lcom/google/android/gms/internal/zzz;

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/google/android/gms/internal/zzd;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzq:Lcom/google/android/gms/internal/zzd;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_2a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbf:[Lcom/google/android/gms/internal/zzn;

    array-length v0, v0

    if-ge v2, v0, :cond_46

    new-instance v0, Lcom/google/android/gms/internal/zzn;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzv;->zzbe:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzv;->zzab:Lcom/google/android/gms/internal/zzm;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzv;->zzj:Lcom/google/android/gms/internal/zzb;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzv;->zzk:Lcom/google/android/gms/internal/zzz;

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/google/android/gms/internal/zzn;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/zzm;Lcom/google/android/gms/internal/zzb;Lcom/google/android/gms/internal/zzz;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzv;->zzbf:[Lcom/google/android/gms/internal/zzn;

    aput-object v0, v1, v2

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2a

    :cond_46
    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/zzr;)Lcom/google/android/gms/internal/zzr;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzr<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/zzr<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzr;->zza(Lcom/google/android/gms/internal/zzv;)Lcom/google/android/gms/internal/zzr;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbc:Ljava/util/Set;

    monitor-enter v0

    :try_start_6
    iget-object v1, p0, Lcom/google/android/gms/internal/zzv;->zzbc:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_6 .. :try_end_c} :catchall_29

    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbb:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzr;->zza(I)Lcom/google/android/gms/internal/zzr;

    const-string v0, "add-to-queue"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzr;->zzb(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzr;->zzg()Z

    move-result v0

    if-nez v0, :cond_26

    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbe:Ljava/util/concurrent/PriorityBlockingQueue;

    :goto_22
    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_26
    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbd:Ljava/util/concurrent/PriorityBlockingQueue;

    goto :goto_22

    :catchall_29
    move-exception p1

    :try_start_2a
    monitor-exit v0
    :try_end_2b
    .catchall {:try_start_2a .. :try_end_2b} :catchall_29

    goto :goto_2d

    :goto_2c
    throw p1

    :goto_2d
    goto :goto_2c
.end method

.method public final zzf(Lcom/google/android/gms/internal/zzr;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzr<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbc:Ljava/util/Set;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzv;->zzbc:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_21

    iget-object p1, p0, Lcom/google/android/gms/internal/zzv;->zzbg:Ljava/util/List;

    monitor-enter p1

    :try_start_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzv;->zzbg:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_12

    :cond_1c
    monitor-exit p1

    return-void

    :catchall_1e
    move-exception v0

    monitor-exit p1
    :try_end_20
    .catchall {:try_start_c .. :try_end_20} :catchall_1e

    throw v0

    :catchall_21
    move-exception p1

    :try_start_22
    monitor-exit v0
    :try_end_23
    .catchall {:try_start_22 .. :try_end_23} :catchall_21

    goto :goto_25

    :goto_24
    throw p1

    :goto_25
    goto :goto_24
.end method
