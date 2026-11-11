.class public final Lcom/google/android/gms/internal/zzdtn;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtn$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtn;",
        "Lcom/google/android/gms/internal/zzdtn$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtn;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxm:Lcom/google/android/gms/internal/zzdtn;


# instance fields
.field private zzlxl:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtn;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    return-void
.end method

.method public static zzak(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdtn;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdtn;

    return-object p0
.end method

.method public static zzbpw()Lcom/google/android/gms/internal/zzdtn;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    return-object v0
.end method

.method public static synthetic zzbpx()Lcom/google/android/gms/internal/zzdtn;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    sget-object v0, Lcom/google/android/gms/internal/zzdto;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_a8

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtn;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_2f

    const-class p1, Lcom/google/android/gms/internal/zzdtn;

    monitor-enter p1

    :try_start_1d
    sget-object p2, Lcom/google/android/gms/internal/zzdtn;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2a

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtn;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtn;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_32
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_3a
    :goto_3a
    if-nez p1, :cond_78

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p3

    if-eqz p3, :cond_54

    const/16 v0, 0xa

    if-eq p3, v0, :cond_4d

    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p3

    if-nez p3, :cond_3a

    goto :goto_54

    :cond_4d
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;
    :try_end_53
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_53} :catch_6c
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_53} :catch_58
    .catchall {:try_start_3c .. :try_end_53} :catchall_56

    goto :goto_3a

    :cond_54
    :goto_54
    const/4 p1, 0x1

    goto :goto_3a

    :catchall_56
    move-exception p1

    goto :goto_77

    :catch_58
    move-exception p1

    :try_start_59
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_6c
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_77
    .catchall {:try_start_59 .. :try_end_77} :catchall_56

    :goto_77
    throw p1

    :cond_78
    :pswitch_78
    sget-object p1, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    return-object p1

    :pswitch_7b
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtn;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    iget-object p3, p3, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    return-object p0

    :pswitch_98
    new-instance p1, Lcom/google/android/gms/internal/zzdtn$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdtn$zza;-><init>(Lcom/google/android/gms/internal/zzdto;)V

    return-object p1

    :pswitch_9e
    return-object v0

    :pswitch_9f
    sget-object p1, Lcom/google/android/gms/internal/zzdtn;->zzlxm:Lcom/google/android/gms/internal/zzdtn;

    return-object p1

    :pswitch_a2
    new-instance p1, Lcom/google/android/gms/internal/zzdtn;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtn;-><init>()V

    return-object p1

    :pswitch_data_a8
    .packed-switch 0x1
        :pswitch_a2
        :pswitch_9f
        :pswitch_9e
        :pswitch_98
        :pswitch_7b
        :pswitch_32
        :pswitch_78
        :pswitch_16
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbpv()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtn;->zzlxl:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
