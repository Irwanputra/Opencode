.class public final synthetic Lcom/google/android/gms/internal/zzakm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzdeo:Lcom/google/android/gms/internal/zzaki;

.field private final zzdep:Lcom/google/android/gms/internal/zzakv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaki;Lcom/google/android/gms/internal/zzakv;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzakm;->zzdeo:Lcom/google/android/gms/internal/zzaki;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzakm;->zzdep:Lcom/google/android/gms/internal/zzakv;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzakm;->zzdeo:Lcom/google/android/gms/internal/zzaki;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzakm;->zzdep:Lcom/google/android/gms/internal/zzakv;

    :try_start_4
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaki;->onSuccess(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_b} :catch_17
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_b} :catch_e
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_b} :catch_c

    return-void

    :catch_c
    move-exception v1

    goto :goto_1c

    :catch_e
    move-exception v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1c

    :catch_17
    move-exception v1

    invoke-virtual {v1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    :goto_1c
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaki;->zzb(Ljava/lang/Throwable;)V

    return-void
.end method
