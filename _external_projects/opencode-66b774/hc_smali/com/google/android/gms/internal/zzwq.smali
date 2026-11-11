.class public final Lcom/google/android/gms/internal/zzwq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic zzcgj:Lcom/google/android/gms/internal/zzwo;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzwo;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzwq;->zzcgj:Lcom/google/android/gms/internal/zzwo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzwq;->zzcgj:Lcom/google/android/gms/internal/zzwo;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzxb;->zzbm(Ljava/lang/String;)V

    return-void
.end method
