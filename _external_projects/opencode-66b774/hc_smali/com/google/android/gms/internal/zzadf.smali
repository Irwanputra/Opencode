.class public final Lcom/google/android/gms/internal/zzadf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcvc:Lcom/google/android/gms/internal/zzade;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzade;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadf;->zzcvc:Lcom/google/android/gms/internal/zzade;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzcvc:Lcom/google/android/gms/internal/zzade;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzade;->zza(Lcom/google/android/gms/internal/zzade;I)V

    return-void
.end method
