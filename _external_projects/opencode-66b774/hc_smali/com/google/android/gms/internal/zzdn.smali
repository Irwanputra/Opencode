.class public final Lcom/google/android/gms/internal/zzdn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzaji:Lcom/google/android/gms/internal/zzdm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdm;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdn;->zzaji:Lcom/google/android/gms/internal/zzdm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdn;->zzaji:Lcom/google/android/gms/internal/zzdm;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdm;->zza(Lcom/google/android/gms/internal/zzdm;)V

    return-void
.end method
