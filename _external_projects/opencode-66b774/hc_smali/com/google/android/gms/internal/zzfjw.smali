.class public final Lcom/google/android/gms/internal/zzfjw;
.super Lcom/google/android/gms/internal/zzfjm;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzfjm<",
        "Lcom/google/android/gms/internal/zzfjw;",
        ">;"
    }
.end annotation


# instance fields
.field public url:Ljava/lang/String;

.field public zzpnw:Ljava/lang/Integer;

.field private zzpnx:Ljava/lang/Integer;

.field public zzpny:Ljava/lang/String;

.field private zzpnz:Ljava/lang/String;

.field public zzpoa:Lcom/google/android/gms/internal/zzfjx;

.field public zzpob:[Lcom/google/android/gms/internal/zzfke;

.field public zzpoc:Ljava/lang/String;

.field public zzpod:Lcom/google/android/gms/internal/zzfkd;

.field private zzpoe:Ljava/lang/Boolean;

.field private zzpof:[Ljava/lang/String;

.field private zzpog:Ljava/lang/String;

.field private zzpoh:Ljava/lang/Boolean;

.field private zzpoi:Ljava/lang/Boolean;

.field private zzpoj:[B

.field public zzpok:Lcom/google/android/gms/internal/zzfkf;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfjm;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnx:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpny:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnz:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    invoke-static {}, Lcom/google/android/gms/internal/zzfke;->zzdao()[Lcom/google/android/gms/internal/zzfke;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoe:Ljava/lang/Boolean;

    sget-object v1, Lcom/google/android/gms/internal/zzfjv;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpog:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoh:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoi:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoj:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjm;->zzpnc:Lcom/google/android/gms/internal/zzfjo;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzfjs;->zzpfd:I

    return-void
.end method

.method private final zzao(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjw;
    .registers 8

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_166

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    if-nez v0, :cond_1a

    new-instance v0, Lcom/google/android/gms/internal/zzfkf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfkf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    :cond_1a
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    goto :goto_46

    :sswitch_1d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readBytes()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoj:[B

    goto :goto_0

    :sswitch_24
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    if-nez v0, :cond_2f

    new-instance v0, Lcom/google/android/gms/internal/zzfkd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfkd;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    :cond_2f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    goto :goto_46

    :sswitch_32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    goto :goto_0

    :sswitch_39
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    if-nez v0, :cond_44

    new-instance v0, Lcom/google/android/gms/internal/zzfjx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfjx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    :cond_44
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    :goto_46
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    goto :goto_0

    :sswitch_4a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    :try_start_4e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v2

    if-eqz v2, :cond_7a

    const/4 v3, 0x1

    if-eq v2, v3, :cond_7a

    const/4 v3, 0x2

    if-eq v2, v3, :cond_7a

    const/4 v3, 0x3

    if-eq v2, v3, :cond_7a

    const/4 v3, 0x4

    if-ne v2, v3, :cond_61

    goto :goto_7a

    :cond_61
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x27

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not a valid enum Verdict"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_7a
    :goto_7a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnx:Ljava/lang/Integer;
    :try_end_80
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4e .. :try_end_80} :catch_af

    goto/16 :goto_0

    :sswitch_82
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->getPosition()I

    move-result v1

    :try_start_86
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvw()I

    move-result v2

    packed-switch v2, :pswitch_data_1ac

    new-instance v3, Ljava/lang/IllegalArgumentException;

    goto :goto_98

    :pswitch_90
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    goto/16 :goto_0

    :goto_98
    const/16 v4, 0x2a

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not a valid enum ReportType"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_af
    .catch Ljava/lang/IllegalArgumentException; {:try_start_86 .. :try_end_af} :catch_af

    :catch_af
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zzmg(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjj;I)Z

    goto/16 :goto_0

    :sswitch_b7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvz()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoi:Ljava/lang/Boolean;

    goto/16 :goto_0

    :sswitch_c3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvz()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoh:Ljava/lang/Boolean;

    goto/16 :goto_0

    :sswitch_cf
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpog:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_d7
    const/16 v0, 0x32

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    if-nez v2, :cond_e3

    const/4 v3, 0x0

    goto :goto_e4

    :cond_e3
    array-length v3, v2

    :goto_e4
    add-int/2addr v0, v3

    new-array v4, v0, [Ljava/lang/String;

    if-eqz v3, :cond_ec

    invoke-static {v2, v1, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_ec
    :goto_ec
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_fc

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_ec

    :cond_fc
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v3

    iput-object v4, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_106
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvz()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoe:Ljava/lang/Boolean;

    goto/16 :goto_0

    :sswitch_112
    const/16 v0, 0x22

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzfjv;->zzb(Lcom/google/android/gms/internal/zzfjj;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    if-nez v2, :cond_11e

    const/4 v3, 0x0

    goto :goto_11f

    :cond_11e
    array-length v3, v2

    :goto_11f
    add-int/2addr v0, v3

    new-array v4, v0, [Lcom/google/android/gms/internal/zzfke;

    if-eqz v3, :cond_127

    invoke-static {v2, v1, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_127
    :goto_127
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_13d

    new-instance v1, Lcom/google/android/gms/internal/zzfke;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzfke;-><init>()V

    aput-object v1, v4, v3

    aget-object v1, v4, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->zzcvt()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_127

    :cond_13d
    new-instance v0, Lcom/google/android/gms/internal/zzfke;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzfke;-><init>()V

    aput-object v0, v4, v3

    aget-object v0, v4, v3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzfjj;->zza(Lcom/google/android/gms/internal/zzfjs;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    goto/16 :goto_0

    :sswitch_14d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnz:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_155
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpny:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_15d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzfjj;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_165
    return-object p0

    :sswitch_data_166
    .sparse-switch
        0x0 -> :sswitch_165
        0xa -> :sswitch_15d
        0x12 -> :sswitch_155
        0x1a -> :sswitch_14d
        0x22 -> :sswitch_112
        0x28 -> :sswitch_106
        0x32 -> :sswitch_d7
        0x3a -> :sswitch_cf
        0x40 -> :sswitch_c3
        0x48 -> :sswitch_b7
        0x50 -> :sswitch_82
        0x58 -> :sswitch_4a
        0x62 -> :sswitch_39
        0x6a -> :sswitch_32
        0x72 -> :sswitch_24
        0x7a -> :sswitch_1d
        0x8a -> :sswitch_f
    .end sparse-switch

    :pswitch_data_1ac
    .packed-switch 0x0
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
        :pswitch_90
    .end packed-switch
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjs;
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzfjw;->zzao(Lcom/google/android/gms/internal/zzfjj;)Lcom/google/android/gms/internal/zzfjw;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/zzfjk;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpny:Ljava/lang/String;

    if-eqz v0, :cond_10

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnz:Ljava/lang/String;

    if-eqz v0, :cond_18

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_18
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    array-length v0, v0

    if-lez v0, :cond_31

    const/4 v0, 0x0

    :goto_21
    iget-object v2, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    array-length v3, v2

    if-ge v0, v3, :cond_31

    aget-object v2, v2, v0

    if-eqz v2, :cond_2e

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_2e
    add-int/lit8 v0, v0, 0x1

    goto :goto_21

    :cond_31
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoe:Ljava/lang/Boolean;

    if-eqz v0, :cond_3d

    const/4 v2, 0x5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/zzfjk;->zzl(IZ)V

    :cond_3d
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    if-eqz v0, :cond_54

    array-length v0, v0

    if-lez v0, :cond_54

    :goto_44
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    array-length v2, v0

    if-ge v1, v2, :cond_54

    aget-object v0, v0, v1

    if-eqz v0, :cond_51

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_51
    add-int/lit8 v1, v1, 0x1

    goto :goto_44

    :cond_54
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpog:Ljava/lang/String;

    if-eqz v0, :cond_5c

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_5c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoh:Ljava/lang/Boolean;

    if-eqz v0, :cond_69

    const/16 v1, 0x8

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzl(IZ)V

    :cond_69
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoi:Ljava/lang/Boolean;

    if-eqz v0, :cond_76

    const/16 v1, 0x9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzl(IZ)V

    :cond_76
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    if-eqz v0, :cond_83

    const/16 v1, 0xa

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_83
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnx:Ljava/lang/Integer;

    if-eqz v0, :cond_90

    const/16 v1, 0xb

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzaa(II)V

    :cond_90
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    if-eqz v0, :cond_99

    const/16 v1, 0xc

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_99
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    if-eqz v0, :cond_a2

    const/16 v1, 0xd

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzn(ILjava/lang/String;)V

    :cond_a2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    if-eqz v0, :cond_ab

    const/16 v1, 0xe

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_ab
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoj:[B

    if-eqz v0, :cond_b4

    const/16 v1, 0xf

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zzc(I[B)V

    :cond_b4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    if-eqz v0, :cond_bd

    const/16 v1, 0x11

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzfjk;->zza(ILcom/google/android/gms/internal/zzfjs;)V

    :cond_bd
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzfjm;->zza(Lcom/google/android/gms/internal/zzfjk;)V

    return-void
.end method

.method public final zzq()I
    .registers 8

    invoke-super {p0}, Lcom/google/android/gms/internal/zzfjm;->zzq()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->url:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpny:Ljava/lang/String;

    if-eqz v1, :cond_18

    const/4 v3, 0x2

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_18
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnz:Ljava/lang/String;

    if-eqz v1, :cond_22

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_22
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    const/4 v3, 0x0

    if-eqz v1, :cond_3d

    array-length v1, v1

    if-lez v1, :cond_3d

    const/4 v1, 0x0

    :goto_2b
    iget-object v4, p0, Lcom/google/android/gms/internal/zzfjw;->zzpob:[Lcom/google/android/gms/internal/zzfke;

    array-length v5, v4

    if-ge v1, v5, :cond_3d

    aget-object v4, v4, v1

    if-eqz v4, :cond_3a

    const/4 v5, 0x4

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3a
    add-int/lit8 v1, v1, 0x1

    goto :goto_2b

    :cond_3d
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoe:Ljava/lang/Boolean;

    if-eqz v1, :cond_4b

    const/4 v4, 0x5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {v4}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_4b
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    if-eqz v1, :cond_6c

    array-length v1, v1

    if-lez v1, :cond_6c

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_54
    iget-object v5, p0, Lcom/google/android/gms/internal/zzfjw;->zzpof:[Ljava/lang/String;

    array-length v6, v5

    if-ge v3, v6, :cond_68

    aget-object v5, v5, v3

    if-eqz v5, :cond_65

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Lcom/google/android/gms/internal/zzfjk;->zztt(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v1

    move v1, v5

    :cond_65
    add-int/lit8 v3, v3, 0x1

    goto :goto_54

    :cond_68
    add-int/2addr v0, v1

    mul-int/lit8 v4, v4, 0x1

    add-int/2addr v0, v4

    :cond_6c
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpog:Ljava/lang/String;

    if-eqz v1, :cond_76

    const/4 v3, 0x7

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_76
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoh:Ljava/lang/Boolean;

    if-eqz v1, :cond_85

    const/16 v3, 0x8

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_85
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoi:Ljava/lang/Boolean;

    if-eqz v1, :cond_94

    const/16 v3, 0x9

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {v3}, Lcom/google/android/gms/internal/zzfjk;->zzlg(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_94
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    if-eqz v1, :cond_9e

    const/16 v2, 0xa

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_9e
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpnx:Ljava/lang/Integer;

    if-eqz v1, :cond_a8

    const/16 v2, 0xb

    invoke-static {v1, v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->のぷのちつ(Ljava/lang/Integer;II)I

    move-result v0

    :cond_a8
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoa:Lcom/google/android/gms/internal/zzfjx;

    if-eqz v1, :cond_b3

    const/16 v2, 0xc

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoc:Ljava/lang/String;

    if-eqz v1, :cond_be

    const/16 v2, 0xd

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzo(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_be
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpod:Lcom/google/android/gms/internal/zzfkd;

    if-eqz v1, :cond_c9

    const/16 v2, 0xe

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c9
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpoj:[B

    if-eqz v1, :cond_d4

    const/16 v2, 0xf

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzd(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d4
    iget-object v1, p0, Lcom/google/android/gms/internal/zzfjw;->zzpok:Lcom/google/android/gms/internal/zzfkf;

    if-eqz v1, :cond_df

    const/16 v2, 0x11

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzfjk;->zzb(ILcom/google/android/gms/internal/zzfjs;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_df
    return v0
.end method
