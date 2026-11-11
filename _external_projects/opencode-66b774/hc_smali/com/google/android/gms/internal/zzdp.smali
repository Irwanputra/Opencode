.class public final Lcom/google/android/gms/internal/zzdp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzaji:Lcom/google/android/gms/internal/zzdm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdm;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdp;->zzaji:Lcom/google/android/gms/internal/zzdm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdp;->zzaji:Lcom/google/android/gms/internal/zzdm;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzdm;->zzair:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    return-void
.end method
