.class public final Lcom/google/android/gms/internal/zzamr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private zzayv:Z

.field private zzdjq:Lcom/google/android/gms/internal/zzamd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzamd;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamr;->zzayv:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzamr;->zzdjq:Lcom/google/android/gms/internal/zzamd;

    return-void
.end method

.method private final zzsp()V
    .registers 4

    sget-object v0, Lcom/google/android/gms/internal/zzahn;->zzdaw:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public final pause()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamr;->zzayv:Z

    return-void
.end method

.method public final resume()V
    .registers 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzamr;->zzayv:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamr;->zzsp()V

    return-void
.end method

.method public final run()V
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzamr;->zzayv:Z

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/zzamr;->zzdjq:Lcom/google/android/gms/internal/zzamd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamd;->zzrx()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamr;->zzsp()V

    :cond_c
    return-void
.end method
