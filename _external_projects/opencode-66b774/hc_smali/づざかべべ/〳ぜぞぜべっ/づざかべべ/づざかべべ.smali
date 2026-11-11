.class public final Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Ljava/lang/reflect/Field;

.field public static final ぁごぐすすぃ:Landroid/os/Handler;

.field public static final くし〴〺ぅ:Ljava/lang/reflect/Field;

.field public static final げつ〴ぬぐ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final づざかべべ:Ljava/lang/reflect/Method;

.field public static final なぎぱいぢぎ:Ljava/lang/reflect/Method;

.field public static final びぐびあび:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .registers 9

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->ぁごぐすすぃ:Landroid/os/Handler;

    const/4 v0, 0x0

    :try_start_c
    const-string v1, "android.app.ActivityThread"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_12
    .catchall {:try_start_c .. :try_end_12} :catchall_13

    goto :goto_14

    :catchall_13
    move-object v1, v0

    .line 2
    :goto_14
    sput-object v1, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Class;

    const/4 v1, 0x1

    .line 3
    :try_start_17
    const-class v2, Landroid/app/Activity;

    const-string v3, "mMainThread"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_22
    .catchall {:try_start_17 .. :try_end_22} :catchall_23

    goto :goto_24

    :catchall_23
    move-object v2, v0

    .line 4
    :goto_24
    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->〺つふすそ:Ljava/lang/reflect/Field;

    .line 5
    :try_start_26
    const-class v2, Landroid/app/Activity;

    const-string v3, "mToken"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_31
    .catchall {:try_start_26 .. :try_end_31} :catchall_32

    goto :goto_33

    :catchall_32
    move-object v2, v0

    .line 6
    :goto_33
    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Class;

    const/4 v3, 0x3

    const-string v4, "performStopActivity"

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-nez v2, :cond_40

    :catchall_3e
    move-object v2, v0

    goto :goto_55

    :cond_40
    :try_start_40
    new-array v7, v3, [Ljava/lang/Class;

    .line 7
    const-class v8, Landroid/os/IBinder;

    aput-object v8, v7, v6

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v1

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v5

    invoke-virtual {v2, v4, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_55
    .catchall {:try_start_40 .. :try_end_55} :catchall_3e

    .line 8
    :goto_55
    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->びぐびあび:Ljava/lang/reflect/Method;

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Class;

    if-nez v2, :cond_5d

    :catchall_5b
    move-object v2, v0

    goto :goto_6e

    :cond_5d
    :try_start_5d
    new-array v7, v5, [Ljava/lang/Class;

    .line 9
    const-class v8, Landroid/os/IBinder;

    aput-object v8, v7, v6

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v1

    invoke-virtual {v2, v4, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_6e
    .catchall {:try_start_5d .. :try_end_6e} :catchall_5b

    .line 10
    :goto_6e
    sput-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->づざかべべ:Ljava/lang/reflect/Method;

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Class;

    .line 11
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->げつ〴ぬぐ()Z

    move-result v4

    if-eqz v4, :cond_af

    if-nez v2, :cond_7b

    goto :goto_af

    :cond_7b
    :try_start_7b
    const-string v4, "requestRelaunchActivity"

    const/16 v7, 0x9

    new-array v7, v7, [Ljava/lang/Class;

    const-class v8, Landroid/os/IBinder;

    aput-object v8, v7, v6

    const-class v6, Ljava/util/List;

    aput-object v6, v7, v1

    const-class v6, Ljava/util/List;

    aput-object v6, v7, v5

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v3

    const/4 v3, 0x4

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v7, v3

    const/4 v3, 0x5

    const-class v6, Landroid/content/res/Configuration;

    aput-object v6, v7, v3

    const/4 v3, 0x6

    const-class v6, Landroid/content/res/Configuration;

    aput-object v6, v7, v3

    const/4 v3, 0x7

    aput-object v5, v7, v3

    const/16 v3, 0x8

    aput-object v5, v7, v3

    invoke-virtual {v2, v4, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_ae
    .catchall {:try_start_7b .. :try_end_ae} :catchall_af

    move-object v0, v2

    .line 12
    :catchall_af
    :cond_af
    :goto_af
    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->なぎぱいぢぎ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static げつ〴ぬぐ()Z
    .registers 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_d

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    return v0
.end method
