.class public final Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:[Ljava/lang/String;

.field public static final くし〴〺ぅ:[Ljava/lang/String;

.field public static final げつ〴ぬぐ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 15

    const/16 v0, 0xc

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "com.noshufou.android.su"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "com.noshufou.android.su.elite"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "eu.chainfire.supersu"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "com.koushikdutta.superuser"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "com.thirdparty.superuser"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "com.yellowes.su"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "com.topjohnwu.magisk"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    const-string v2, "com.kingroot.kinguser"

    const/4 v10, 0x7

    aput-object v2, v1, v10

    const-string v2, "com.kingo.root"

    const/16 v11, 0x8

    aput-object v2, v1, v11

    const-string v2, "com.smedialink.oneclickroot"

    const/16 v12, 0x9

    aput-object v2, v1, v12

    const-string v2, "com.zhiqupk.root.global"

    const/16 v13, 0xa

    aput-object v2, v1, v13

    const-string v2, "com.alephzain.framaroot"

    const/16 v14, 0xb

    aput-object v2, v1, v14

    sput-object v1, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[Ljava/lang/String;

    const/16 v1, 0xe

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "/data/local/"

    aput-object v2, v1, v3

    const-string v2, "/data/local/bin/"

    aput-object v2, v1, v4

    const-string v2, "/data/local/xbin/"

    aput-object v2, v1, v5

    const-string v2, "/sbin/"

    aput-object v2, v1, v6

    const-string v2, "/su/bin/"

    aput-object v2, v1, v7

    const-string v2, "/system/bin/"

    aput-object v2, v1, v8

    const-string v2, "/system/bin/.ext/"

    aput-object v2, v1, v9

    const-string v2, "/system/bin/failsafe/"

    aput-object v2, v1, v10

    const-string v2, "/system/sd/xbin/"

    aput-object v2, v1, v11

    const-string v2, "/system/usr/we-need-root/"

    aput-object v2, v1, v12

    const-string v2, "/system/xbin/"

    aput-object v2, v1, v13

    const-string v2, "/cache/"

    aput-object v2, v1, v14

    const-string v2, "/data/"

    aput-object v2, v1, v0

    const/16 v0, 0xd

    const-string v2, "/dev/"

    aput-object v2, v1, v0

    sput-object v1, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Ljava/lang/String;

    new-array v0, v10, [Ljava/lang/String;

    const-string v1, "/system"

    aput-object v1, v0, v3

    const-string v1, "/system/bin"

    aput-object v1, v0, v4

    const-string v1, "/system/sbin"

    aput-object v1, v0, v5

    const-string v1, "/system/xbin"

    aput-object v1, v0, v6

    const-string v1, "/vendor/bin"

    aput-object v1, v0, v7

    const-string v1, "/sbin"

    aput-object v1, v0, v8

    const-string v1, "/etc"

    aput-object v1, v0, v9

    sput-object v0, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:[Ljava/lang/String;

    return-void
.end method

.method public static げつ〴ぬぐ()[Ljava/lang/String;
    .registers 7

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "PATH"

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_57

    const-string v3, ""

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_57

    :cond_1d
    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_25
    if-ge v4, v3, :cond_4e

    aget-object v5, v1, v4

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_42

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2f

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_42
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4b

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4b
    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_4e
    new-array v1, v2, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    :goto_54
    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_57
    :goto_57
    new-array v1, v2, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_54
.end method
