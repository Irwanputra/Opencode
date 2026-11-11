.class public final Lcom/google/android/gms/internal/zzdv;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private synthetic zzakh:Lcom/google/android/gms/internal/zzdt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdt;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdv;->zzakh:Lcom/google/android/gms/internal/zzdt;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdv;->zzakh:Lcom/google/android/gms/internal/zzdt;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdt;->zza(Lcom/google/android/gms/internal/zzdt;)V

    return-void
.end method
