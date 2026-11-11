.class public final Lcom/google/android/gms/internal/zzdrw;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdrw$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdrw;",
        "Lcom/google/android/gms/internal/zzdrw$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdrw;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlui:Lcom/google/android/gms/internal/zzdrw;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdrw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdrw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdrw;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method public static zzbnc()Lcom/google/android/gms/internal/zzdrw;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    return-object v0
.end method

.method public static synthetic zzbnd()Lcom/google/android/gms/internal/zzdrw;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    sget-object v0, Lcom/google/android/gms/internal/zzdrx;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_80

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_10
    return-object v0

    :pswitch_11
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_16
    sget-object p1, Lcom/google/android/gms/internal/zzdrw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_2f

    const-class p1, Lcom/google/android/gms/internal/zzdrw;

    monitor-enter p1

    :try_start_1d
    sget-object p2, Lcom/google/android/gms/internal/zzdrw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2a

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdrw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2a
    monitor-exit p1

    goto :goto_2f

    :catchall_2c
    move-exception p2

    monitor-exit p1
    :try_end_2e
    .catchall {:try_start_1d .. :try_end_2e} :catchall_2c

    throw p2

    :cond_2f
    :goto_2f
    sget-object p1, Lcom/google/android/gms/internal/zzdrw;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_32
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_3a
    :goto_3a
    if-nez p1, :cond_6c

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p3

    if-eqz p3, :cond_48

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p3
    :try_end_46
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_46} :catch_60
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_46} :catch_4c
    .catchall {:try_start_3c .. :try_end_46} :catchall_4a

    if-nez p3, :cond_3a

    :cond_48
    const/4 p1, 0x1

    goto :goto_3a

    :catchall_4a
    move-exception p1

    goto :goto_6b

    :catch_4c
    move-exception p1

    :try_start_4d
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_60
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_6b
    .catchall {:try_start_4d .. :try_end_6b} :catchall_4a

    :goto_6b
    throw p1

    :cond_6c
    :pswitch_6c
    sget-object p1, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    return-object p1

    :pswitch_6f
    return-object p0

    :pswitch_70
    new-instance p1, Lcom/google/android/gms/internal/zzdrw$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdrw$zza;-><init>(Lcom/google/android/gms/internal/zzdrx;)V

    return-object p1

    :pswitch_76
    return-object v0

    :pswitch_77
    sget-object p1, Lcom/google/android/gms/internal/zzdrw;->zzlui:Lcom/google/android/gms/internal/zzdrw;

    return-object p1

    :pswitch_7a
    new-instance p1, Lcom/google/android/gms/internal/zzdrw;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdrw;-><init>()V

    return-object p1

    :pswitch_data_80
    .packed-switch 0x1
        :pswitch_7a
        :pswitch_77
        :pswitch_76
        :pswitch_70
        :pswitch_6f
        :pswitch_32
        :pswitch_6c
        :pswitch_16
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzho()I
    .registers 3

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
