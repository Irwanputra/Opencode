.class public final synthetic Lcom/google/android/gms/internal/zzzg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzakg;


# instance fields
.field private final zzclw:Lcom/google/android/gms/internal/zzzf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzzf;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzzg;->zzclw:Lcom/google/android/gms/internal/zzzf;

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzakv;
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzzg;->zzclw:Lcom/google/android/gms/internal/zzzf;

    check-cast p1, Lcom/google/android/gms/internal/zzanh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzzf;->zzh(Lcom/google/android/gms/internal/zzanh;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method
