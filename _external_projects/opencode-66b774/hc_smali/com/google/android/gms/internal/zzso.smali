.class public final Lcom/google/android/gms/internal/zzso;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztc;


# instance fields
.field private synthetic val$name:Ljava/lang/String;

.field private synthetic zzbzf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzsn;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    iput-object p2, p0, Lcom/google/android/gms/internal/zzso;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzso;->zzbzf:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/zztd;)V
    .registers 4

    iget-object p1, p1, Lcom/google/android/gms/internal/zztd;->zzbzk:Lcom/google/android/gms/internal/zzkx;

    if-eqz p1, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzso;->val$name:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzso;->zzbzf:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/zzkx;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    return-void
.end method
