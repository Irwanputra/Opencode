.class public final Lcom/google/android/gms/internal/zzajs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzaju;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzajr;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzck(Ljava/lang/String;)V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzajt;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzajt;-><init>(Lcom/google/android/gms/internal/zzajs;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
