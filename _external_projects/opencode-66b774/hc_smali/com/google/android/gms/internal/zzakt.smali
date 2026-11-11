.class public final synthetic Lcom/google/android/gms/internal/zzakt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbzc:Ljava/util/concurrent/Future;

.field private final zzdex:Lcom/google/android/gms/internal/zzakv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzakv;Ljava/util/concurrent/Future;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzakt;->zzdex:Lcom/google/android/gms/internal/zzakv;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzakt;->zzbzc:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzakt;->zzdex:Lcom/google/android/gms/internal/zzakv;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzakt;->zzbzc:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_e
    return-void
.end method
