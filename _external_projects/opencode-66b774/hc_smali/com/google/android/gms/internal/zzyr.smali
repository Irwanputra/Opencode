.class public final Lcom/google/android/gms/internal/zzyr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzclb:Ljava/util/concurrent/atomic/AtomicInteger;

.field private synthetic zzclc:I

.field private synthetic zzcld:Lcom/google/android/gms/internal/zzalf;

.field private synthetic zzcle:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/zzalf;Ljava/util/List;)V
    .registers 5

    iput-object p1, p0, Lcom/google/android/gms/internal/zzyr;->zzclb:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p2, p0, Lcom/google/android/gms/internal/zzyr;->zzclc:I

    iput-object p3, p0, Lcom/google/android/gms/internal/zzyr;->zzcld:Lcom/google/android/gms/internal/zzalf;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzyr;->zzcle:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzyr;->zzclb:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzyr;->zzclc:I

    if-lt v0, v1, :cond_1e

    :try_start_a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzyr;->zzcld:Lcom/google/android/gms/internal/zzalf;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzyr;->zzcle:Ljava/util/List;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzym;->zzn(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzalf;->set(Ljava/lang/Object;)V
    :try_end_15
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_a .. :try_end_15} :catch_18
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_15} :catch_16

    return-void

    :catch_16
    move-exception v0

    goto :goto_19

    :catch_18
    move-exception v0

    :goto_19
    const-string v1, "Unable to convert list of futures to a future of list"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1e
    return-void
.end method
