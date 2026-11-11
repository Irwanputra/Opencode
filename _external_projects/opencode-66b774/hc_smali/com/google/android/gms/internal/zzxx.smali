.class public final Lcom/google/android/gms/internal/zzxx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcjq:Lcom/google/android/gms/internal/zzxw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzxw;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzxx;->zzcjq:Lcom/google/android/gms/internal/zzxw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzxx;->zzcjq:Lcom/google/android/gms/internal/zzxw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzxw;->onStop()V

    return-void
.end method
