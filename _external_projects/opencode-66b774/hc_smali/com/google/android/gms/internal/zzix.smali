.class public final Lcom/google/android/gms/internal/zzix;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public zzbcn:Lcom/google/android/gms/internal/zzfl;

.field public zzbco:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbrf:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_46

    :try_start_18
    sget-object v0, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ:Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;

    const-string v1, "com.google.android.gms.ads.dynamite"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v0

    const-string v1, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->ぺぁあねじ(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfm;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzfl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzix;->zzbcn:Lcom/google/android/gms/internal/zzfl;

    .line 1
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzix;->zzbcn:Lcom/google/android/gms/internal/zzfl;

    .line 3
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    const-string p1, "GMA_SDK"

    .line 4
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/zzfl;->zza(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzix;->zzbco:Z
    :try_end_40
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_18 .. :try_end_40} :catch_41
    .catch Landroid/os/RemoteException; {:try_start_18 .. :try_end_40} :catch_41
    .catch Ljava/lang/NullPointerException; {:try_start_18 .. :try_end_40} :catch_41

    return-void

    :catch_41
    const-string p1, "Cannot dynamite load clearcut"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    :cond_46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    :try_start_6
    sget-object p3, Lcom/google/android/gms/dynamite/DynamiteModule;->〳ぜぞぜべっ:Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;

    const-string v0, "com.google.android.gms.ads.dynamite"

    invoke-static {p1, p3, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p3

    const-string v0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"

    invoke-virtual {p3, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->ぺぁあねじ(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/zzfm;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzfl;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/zzix;->zzbcn:Lcom/google/android/gms/internal/zzfl;

    .line 5
    new-instance p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {p3, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 6
    iget-object p3, p0, Lcom/google/android/gms/internal/zzix;->zzbcn:Lcom/google/android/gms/internal/zzfl;

    .line 7
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 8
    invoke-interface {p3, v0, p2, p1}, Lcom/google/android/gms/internal/zzfl;->zza(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzix;->zzbco:Z
    :try_end_2d
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$くし〴〺ぅ; {:try_start_6 .. :try_end_2d} :catch_2e
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_2d} :catch_2e
    .catch Ljava/lang/NullPointerException; {:try_start_6 .. :try_end_2d} :catch_2e

    return-void

    :catch_2e
    const-string p1, "Cannot dynamite load clearcut"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zzd([B)Lcom/google/android/gms/internal/zziz;
    .registers 4

    new-instance v0, Lcom/google/android/gms/internal/zziz;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/zziz;-><init>(Lcom/google/android/gms/internal/zzix;[BLcom/google/android/gms/internal/zziy;)V

    return-object v0
.end method
