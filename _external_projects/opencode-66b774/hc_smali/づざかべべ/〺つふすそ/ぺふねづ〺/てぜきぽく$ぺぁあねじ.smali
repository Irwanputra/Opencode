.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺぁあねじ;
.super Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation


# instance fields
.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;

.field public final synthetic びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺぁあねじ;->びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺぁあねじ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Landroid/content/IntentFilter;
    .registers 3

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public くし〴〺ぅ()I
    .registers 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺぁあねじ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;

    .line 1
    iget-object v2, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;

    .line 2
    iget-wide v3, v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;->〺つふすそ:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    cmp-long v9, v3, v5

    if-lez v9, :cond_14

    const/4 v3, 0x1

    goto :goto_15

    :cond_14
    const/4 v3, 0x0

    :goto_15
    if-eqz v3, :cond_1b

    .line 3
    :goto_17
    iget-boolean v1, v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    goto/16 :goto_f9

    .line 4
    :cond_1b
    iget-object v3, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->げつ〴ぬぐ:Landroid/content/Context;

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v3, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いいにぽつ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_37

    const-string v3, "network"

    .line 5
    :try_start_28
    iget-object v5, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->〺つふすそ:Landroid/location/LocationManager;

    invoke-virtual {v5, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_37

    iget-object v5, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->〺つふすそ:Landroid/location/LocationManager;

    invoke-virtual {v5, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3
    :try_end_36
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_36} :catch_37

    goto :goto_38

    :catch_37
    :cond_37
    move-object v3, v4

    .line 6
    :goto_38
    iget-object v5, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->げつ〴ぬぐ:Landroid/content/Context;

    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v5, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いいにぽつ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_54

    const-string v5, "gps"

    .line 7
    :try_start_44
    iget-object v6, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->〺つふすそ:Landroid/location/LocationManager;

    invoke-virtual {v6, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_54

    iget-object v6, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->〺つふすそ:Landroid/location/LocationManager;

    invoke-virtual {v6, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v4
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_44 .. :try_end_52} :catch_53

    goto :goto_54

    :catch_53
    nop

    :cond_54
    :goto_54
    if-eqz v4, :cond_65

    if-eqz v3, :cond_65

    .line 8
    invoke-virtual {v4}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v9

    cmp-long v11, v5, v9

    if-lez v11, :cond_68

    goto :goto_67

    :cond_65
    if-eqz v4, :cond_68

    :goto_67
    move-object v3, v4

    :cond_68
    if-eqz v3, :cond_e6

    .line 9
    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 10
    sget-object v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;

    if-nez v6, :cond_7b

    new-instance v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;

    invoke-direct {v6}, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;-><init>()V

    sput-object v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;

    :cond_7b
    sget-object v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;

    const-wide/32 v16, 0x5265c00

    sub-long v10, v4, v16

    .line 11
    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v14

    move-object v9, v6

    invoke-virtual/range {v9 .. v15}, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->げつ〴ぬぐ(JDD)V

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v12

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v14

    move-wide v10, v4

    invoke-virtual/range {v9 .. v15}, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->げつ〴ぬぐ(JDD)V

    iget v9, v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->くし〴〺ぅ:I

    if-ne v9, v8, :cond_9f

    const/4 v7, 0x1

    :cond_9f
    iget-wide v14, v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->〺つふすそ:J

    iget-wide v12, v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->げつ〴ぬぐ:J

    add-long v10, v4, v16

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v16

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v18

    move-object v9, v6

    move-wide/from16 v20, v12

    move-wide/from16 v12, v16

    move-wide/from16 v16, v14

    move-wide/from16 v14, v18

    invoke-virtual/range {v9 .. v15}, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->げつ〴ぬぐ(JDD)V

    iget-wide v9, v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/でどあくず;->〺つふすそ:J

    const-wide/16 v11, 0x0

    const-wide/16 v13, -0x1

    cmp-long v3, v16, v13

    if-eqz v3, :cond_dc

    cmp-long v3, v20, v13

    if-nez v3, :cond_c8

    goto :goto_dc

    :cond_c8
    cmp-long v3, v4, v20

    if-lez v3, :cond_ce

    add-long/2addr v9, v11

    goto :goto_d7

    :cond_ce
    cmp-long v3, v4, v16

    if-lez v3, :cond_d5

    add-long v9, v20, v11

    goto :goto_d7

    :cond_d5
    add-long v9, v16, v11

    :goto_d7
    const-wide/32 v3, 0xea60

    add-long/2addr v9, v3

    goto :goto_e0

    :cond_dc
    :goto_dc
    const-wide/32 v9, 0x2932e00

    add-long/2addr v9, v4

    :goto_e0
    iput-boolean v7, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    iput-wide v9, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぶでにく〼〳$げつ〴ぬぐ;->〺つふすそ:J

    goto/16 :goto_17

    .line 12
    :cond_e6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_f7

    const/16 v2, 0x16

    if-lt v1, v2, :cond_f8

    :cond_f7
    const/4 v7, 0x1

    :cond_f8
    move v1, v7

    :goto_f9
    if-eqz v1, :cond_fc

    const/4 v8, 0x2

    :cond_fc
    return v8
.end method

.method public びぐびあび()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$ぺぁあねじ;->びぐびあび:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->なぶひせが()Z

    return-void
.end method
