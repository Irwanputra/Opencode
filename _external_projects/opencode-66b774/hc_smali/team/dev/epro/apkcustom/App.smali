.class public Lteam/dev/epro/apkcustom/App;
.super Landroid/app/Application;
.source ""


# static fields
.field public static ぁごぐすすぃ:Z

.field public static くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

.field public static づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

.field public static なぎぱいぢぎ:Ljava/lang/String;

.field public static びぐびあび:Landroid/content/SharedPreferences;


# instance fields
.field public 〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lteam/dev/epro/apkcustom/App;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static 〺つふすそ()Landroid/content/SharedPreferences;
    .registers 1

    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;
    .registers 1

    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    return-object v0
.end method

.method public static げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;
    .registers 1

    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .registers 23

    move-object/from16 v1, p0

    invoke-super/range {p0 .. p0}, Landroid/app/Application;->onCreate()V

    .line 1
    sput-object v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/content/Context;

    .line 2
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    instance-of v0, v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    if-nez v0, :cond_17

    new-instance v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    invoke-direct {v0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;-><init>()V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 3
    :cond_17
    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぉざぅち〻;->げつ〴ぬぐ()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lt v0, v2, :cond_b8

    const-string v2, "\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    const v7, 0x7f11008c

    invoke-virtual {v1, v7}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Landroid/app/NotificationChannel;

    const-string v9, "L4hLe<O4fIghK4n\u0019bg\u001e6hKek\u001d6>\u001cd9Lg"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v7, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const v7, 0x7f110089

    invoke-virtual {v1, v7}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Landroid/app/NotificationChannel;->enableLights(Z)V

    const v7, -0xbbbbbc

    invoke-virtual {v8, v7}, Landroid/app/NotificationChannel;->setLightColor(I)V

    invoke-virtual {v2, v8}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const v7, 0x7f11008d

    invoke-virtual {v1, v7}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Landroid/app/NotificationChannel;

    const-string v9, "K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v7, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const v4, 0x7f11008a

    invoke-virtual {v1, v4}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Landroid/app/NotificationChannel;->enableLights(Z)V

    const v4, -0xffff01

    invoke-virtual {v8, v4}, Landroid/app/NotificationChannel;->setLightColor(I)V

    invoke-virtual {v2, v8}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const v4, 0x7f11008e

    invoke-virtual {v1, v4}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Landroid/app/NotificationChannel;

    const-string v8, "Kdl\u001cdiH0:AfnJ6kJemI4oAfmN6f@0j\u001af"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v4, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const v3, 0x7f11008b

    invoke-virtual {v1, v3}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    const v3, -0xff0001

    invoke-virtual {v7, v3}, Landroid/app/NotificationChannel;->setLightColor(I)V

    invoke-virtual {v2, v7}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 5
    :cond_b8
    new-instance v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;

    invoke-direct {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;-><init>()V

    iput-object v2, v1, Lteam/dev/epro/apkcustom/App;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;

    invoke-virtual {v2, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->〺つふすそ(Landroid/content/Context;)V

    const/16 v2, 0x15

    if-lt v0, v2, :cond_d6

    .line 6
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    if-nez v0, :cond_d1

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    invoke-direct {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>()V

    sput-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    :cond_d1
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    .line 7
    invoke-virtual {v0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ(Landroid/content/Context;)V

    :cond_d6
    sput-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    new-instance v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-direct {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;-><init>()V

    sput-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const-string v0, "\\A"

    const-string v3, "\n"

    .line 8
    sget-object v4, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 9
    invoke-virtual {v4}, Landroid/app/Application;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    array-length v7, v4

    const/4 v8, 0x0

    :goto_f6
    if-ge v8, v7, :cond_117

    aget-object v9, v4, v8

    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v10

    if-eqz v10, :cond_114

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺぁあねじ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_114

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v9

    invoke-static {v9}, Landroid/os/Process;->killProcess(I)V

    invoke-static {v6}, Ljava/lang/System;->exit(I)V

    :cond_114
    add-int/lit8 v8, v8, 0x1

    goto :goto_f6

    .line 10
    :cond_117
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 11
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぺでどぜべ()Z

    move-result v4

    iput-boolean v4, v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->くし〴〺ぅ:Z

    if-eqz v4, :cond_125

    goto/16 :goto_760

    :cond_125
    new-instance v4, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;

    .line 12
    sget-object v5, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 13
    invoke-direct {v4, v5}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;-><init>(Landroid/content/Context;)V

    .line 14
    iput-boolean v6, v4, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Z

    sput v6, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    .line 15
    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〺つふすそ()Z

    move-result v5

    iput-boolean v5, v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->くし〴〺ぅ:Z

    if-nez v5, :cond_75d

    .line 16
    new-instance v5, Ljava/util/ArrayList;

    sget-object v7, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[Ljava/lang/String;

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    iget-object v7, v4, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x0

    :goto_14e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_17d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    :try_start_15a
    invoke-virtual {v7, v9, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "Mg=\u001d6:Ja:Kgn\u001b0g@ai\u001efgOghJkhL39Ldl\u001a`nM4iK0oJd9Ig=\u001bcfI6:\u001c3mIjm\u001e7i\u001c"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;)V
    :try_end_179
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_15a .. :try_end_179} :catch_17b

    const/4 v8, 0x1

    goto :goto_14e

    :catch_17b
    nop

    goto :goto_14e

    :cond_17d
    if-nez v8, :cond_755

    const-string v5, "J3f\u001cehIe>@co\u001c4k\u001ec;H6kO4:L7mOci\u001b6"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-virtual {v4, v5}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_755

    .line 19
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v7, "Ldo\u001d3gObfKafN4iAg;MjhO7>H69Jb9Ad"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Oj<N79\u001bdmK0;\u0019f>\u001a6>@agOjm\u001cg=Hf9\u001c`"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "@4mAb=MgfK0>Kag\u001de<Jc;Ac=@1l\u001e6jK`"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\u001b6kN0k\u001d3mL1=\u001e0>M3f\u001ekfK49Kcm\u001bg;Ig"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :try_start_1c2
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v7

    const-string v8, "HjnL0lIblJf>O3:Afl@3>A4m\u001cafAk=\u001ce"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    if-nez v7, :cond_1db

    goto :goto_1ed

    :cond_1db
    new-instance v8, Ljava/util/Scanner;

    invoke-direct {v8, v7}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v8, v0}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7
    :try_end_1ec
    .catch Ljava/io/IOException; {:try_start_1c2 .. :try_end_1ec} :catch_1ed
    .catch Ljava/util/NoSuchElementException; {:try_start_1c2 .. :try_end_1ec} :catch_1ed

    goto :goto_1ee

    :catch_1ed
    :goto_1ed
    const/4 v7, 0x0

    :goto_1ee
    if-nez v7, :cond_1f3

    const/4 v6, 0x0

    goto/16 :goto_273

    .line 21
    :cond_1f3
    array-length v8, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1f6
    if-ge v9, v8, :cond_272

    aget-object v11, v7, v9

    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_202
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_26d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_268

    invoke-virtual {v6, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const-string v15, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v6

    const-string v6, "\u001b0>O0>\u00196lAeh@fj@6=Lfm\u001eelMbnKe<\u001d1"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v14, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_26a

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "\u001ej:Ig9Ob>I3mH`;I3<Jeh\u001c`hH6<@aj@c"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "J`=\u001a7iObf\u00193<\u001ac<N7nIk>Odh\u001b0m\u001d0:Me"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/Object;)V

    const/4 v10, 0x1

    goto :goto_26a

    :cond_268
    move-object/from16 v16, v6

    :cond_26a
    :goto_26a
    move-object/from16 v6, v16

    goto :goto_202

    :cond_26d
    move-object/from16 v16, v6

    add-int/lit8 v9, v9, 0x1

    goto :goto_1f6

    :cond_272
    move v6, v10

    :goto_273
    if-nez v6, :cond_755

    .line 22
    :try_start_275
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v6

    const-string v7, "\u001dk;L1>\u00197k@dmIjl@6gA7h@4i\u0019an\u001a3>\u001a`"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    if-nez v6, :cond_28e

    goto :goto_2a0

    :cond_28e
    new-instance v7, Ljava/util/Scanner;

    invoke-direct {v7, v6}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v7, v0}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_29f
    .catch Ljava/io/IOException; {:try_start_275 .. :try_end_29f} :catch_2a0
    .catch Ljava/util/NoSuchElementException; {:try_start_275 .. :try_end_29f} :catch_2a0

    goto :goto_2a1

    :catch_2a0
    :goto_2a0
    const/4 v0, 0x0

    :goto_2a1
    const-string v6, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v0, :cond_2b0

    const/4 v0, 0x0

    goto/16 :goto_36d

    .line 23
    :cond_2b0
    array-length v7, v0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_2b3
    if-ge v8, v7, :cond_36c

    aget-object v10, v0, v8

    invoke-virtual {v10, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x4

    if-ge v12, v13, :cond_2e1

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u0019gg@1mAc:\u001d4jJgkIkk\u001d4<\u0019k;N`n@0=Kg:Meg\u001aggO`9\u001bdnJ7f\u001b1<\u001dbnO7nAd9L1h@"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;)V

    move-object/from16 v16, v0

    move/from16 v17, v7

    goto/16 :goto_364

    :cond_2e1
    const/4 v12, 0x1

    aget-object v12, v11, v12

    const/4 v13, 0x3

    aget-object v11, v11, v13

    sget-object v13, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:[Ljava/lang/String;

    array-length v14, v13

    const/4 v15, 0x0

    :goto_2eb
    move-object/from16 v16, v0

    if-ge v15, v14, :cond_360

    aget-object v0, v13, v15

    invoke-virtual {v12, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_34f

    move/from16 v17, v7

    const-string v7, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    move/from16 v18, v9

    array-length v9, v7

    const/16 v19, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    :goto_30f
    if-ge v11, v9, :cond_355

    move/from16 v19, v9

    aget-object v9, v7, v11

    move-object/from16 v21, v7

    const-string v7, "K1jL49NbiJji\u0019jgJ0j\u001b1k\u001eb9I`kHah\u001ce"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_348

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u001b1m\u001e7kIkk@c9Hko@gkO6=\u001bd9\u001cem\u001b09\u001a7fK6>L3f@fkL3l\u001dd<Ik:JbfNf<\u001dd9\u00196<\u001ce9\u0019c<\u0019coL`n\u001b0<\u001b0f\u001cb;@foJ7l\u001b`>\u001den"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/Object;)V

    const/4 v9, 0x1

    goto :goto_357

    :cond_348
    add-int/lit8 v11, v11, 0x1

    move/from16 v9, v19

    move-object/from16 v7, v21

    goto :goto_30f

    :cond_34f
    move/from16 v17, v7

    move/from16 v18, v9

    move-object/from16 v20, v11

    :cond_355
    move/from16 v9, v18

    :goto_357
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v16

    move/from16 v7, v17

    move-object/from16 v11, v20

    goto :goto_2eb

    :cond_360
    move/from16 v17, v7

    move/from16 v18, v9

    :goto_364
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v16

    move/from16 v7, v17

    goto/16 :goto_2b3

    :cond_36c
    move v0, v9

    :goto_36d
    if-nez v0, :cond_755

    .line 24
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    if-eqz v0, :cond_385

    const-string v7, "A6jN4fKbiLg:Ak=\u00197g\u001bj;AbgAgj\u001ebhK`"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_385

    const/4 v0, 0x1

    goto :goto_386

    :cond_385
    const/4 v0, 0x0

    :goto_386
    if-nez v0, :cond_755

    .line 25
    :try_start_388
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/String;

    const-string v8, "JclJdk\u001ddiI`:I1mH0iKfoMfmLbg\u0019`jK`"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    const/4 v8, 0x1

    aput-object v5, v7, v8

    invoke-virtual {v0, v7}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0
    :try_end_3a3
    .catchall {:try_start_388 .. :try_end_3a3} :catchall_3c0

    :try_start_3a3
    new-instance v7, Ljava/io/BufferedReader;

    new-instance v8, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7
    :try_end_3b5
    .catchall {:try_start_3a3 .. :try_end_3b5} :catchall_3be

    if-eqz v7, :cond_3b9

    const/4 v7, 0x1

    goto :goto_3ba

    :cond_3b9
    const/4 v7, 0x0

    :goto_3ba
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    goto :goto_3c7

    :catchall_3be
    nop

    goto :goto_3c1

    :catchall_3c0
    const/4 v0, 0x0

    :goto_3c1
    if-eqz v0, :cond_3c6

    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    :cond_3c6
    const/4 v7, 0x0

    :goto_3c7
    if-nez v7, :cond_755

    .line 26
    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    .line 27
    sget-boolean v0, Lcom/scottyab/rootbeer/RootBeerNative;->げつ〴ぬぐ:Z

    if-nez v0, :cond_3dd

    const-string v0, "O4iAk<@f<IbfNg=L4h\u001ekj@glA3kAjlLgj\u001eal\u001eb>Hcl@`:Kk>I7m\u0019d:K7=\u001ej9Ib9\u001d7lJekObnM39\u001d3iN6k\u001bf:K3m\u001c6=Mb:\u001daoJ69\u001dcmMe;\u001ek9Md>@`9\u001c4<Hj;NamM6gOa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-static {v0}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Object;)V

    goto :goto_409

    :cond_3dd
    invoke-static {}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ()[Ljava/lang/String;

    move-result-object v0

    array-length v7, v0

    new-array v8, v7, [Ljava/lang/String;

    const/4 v9, 0x0

    :goto_3e5
    if-ge v9, v7, :cond_3f7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v11, v0, v9

    invoke-static {v10, v11, v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3e5

    :cond_3f7
    new-instance v0, Lcom/scottyab/rootbeer/RootBeerNative;

    invoke-direct {v0}, Lcom/scottyab/rootbeer/RootBeerNative;-><init>()V

    :try_start_3fc
    iget-boolean v5, v4, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Z

    invoke-virtual {v0, v5}, Lcom/scottyab/rootbeer/RootBeerNative;->setLogDebugMessages(Z)I

    invoke-virtual {v0, v8}, Lcom/scottyab/rootbeer/RootBeerNative;->checkForRoot([Ljava/lang/Object;)I

    move-result v0
    :try_end_405
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_3fc .. :try_end_405} :catch_409

    if-lez v0, :cond_409

    const/4 v0, 0x1

    goto :goto_40a

    :catch_409
    :cond_409
    :goto_409
    const/4 v0, 0x0

    :goto_40a
    if-nez v0, :cond_755

    const-string v5, "\u0019ai\u001ej;O4i\u001c7l\u001bkn\u001aff\u001ag=Ie;Nf=N`;\u0019c"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 29
    invoke-virtual {v4, v5}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_41e

    goto/16 :goto_755

    :cond_41e
    const-string v4, "Kej\u001e0k@ej\u001b`;Hen\u001b`:\u001bf9I0=HfkMjkO1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "MefO3lMc9JgnIfmMdjM`f\u001a0:O7<\u001cboHe"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 30
    :try_start_432
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    throw v0
    :try_end_438
    .catch Ljava/lang/Exception; {:try_start_432 .. :try_end_438} :catch_438

    :catch_438
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v8, v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_440
    const-string v11, "L7>Oj9Nk=Ag:@`oMbk\u0019emAbhI`jOb=@3"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\\s+"

    const-string v13, "\u001ecoLgj\u001949\u001bf9Abn\u001ag=HegOfkNej\u001cao\u001ee"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "LcgO`9A3=K3iI`g\u001b3gIb;\u001ebn\u001ddgKafI1"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "\u001bdnMbi\u001c7;\u0019`gJ`9Mah\u0019e<Hd;Mk9N3i\u001c6"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v1, "\u001aflJf9\u001b1oNckAj;Akg@c=\u001b3hHb:L1i\u001c`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v2

    const-string v2, "N7<If;\u001a`iJ3oLfjA`fN0lO3hJf=\u001c3m@b"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-ge v9, v8, :cond_52c

    aget-object v17, v0, v9

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    move/from16 v19, v8

    const-string v8, "\u0019dk\u001ee=@1:HelM0<A3=\u001bc:A19@en@d=\u001edh\u001c6>\u0019e>Ja<\u001eb;N6=Mb<\u001abf\u001efn\u00194kK3>\u001bbl\u001efn\u001ab9\u001dfiMb9Ocn\u001eg<Mkl\u001agfKaj@k9"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4a2

    add-int/lit8 v10, v10, 0x1

    const/4 v0, 0x2

    if-ne v10, v0, :cond_4a2

    goto :goto_516

    :cond_4a2
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v8, "Jag\u001aaiO`nM39J0l\u001e6l\u001bc>Jb=@fk\u001egfI`n\u001a3<MclLci\u001d6mO1k\u001cb=I1kL6;J0hLbmH"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4cb

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v8, "Nk>\u001c4nMef\u001dc;\u001a`n\u001e4jM1<\u001a6f\u0019blAbh\u001d3"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4cb

    goto :goto_516

    :cond_4cb
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-string v8, "I1l\u001a7g\u001cj9\u001dd<Mao\u001e6:O3k\u001ba;N`h\u001cbg\u001dd=@b>M1m\u001e4>NfoIagMehA3fKb;MkhM`g\u001c1j\u001c`<Hck@3:Hk:\u001c0i\u001cdfO`l\u001b1o\u001bk9N1o"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f6

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    move/from16 v20, v10

    const-string v10, "Ogl\u001a7m\u001c3o\u001afnAblMd9@0<\u001eaoM7=@j9Nb"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f8

    goto :goto_516

    :cond_4f6
    move/from16 v20, v10

    :cond_4f8
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_51e

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v8, "\u001cji\u001bdiAdgJk9\u001e6nLeh\u001c0;@19\u001edoK49\u001a0=I1iLg<Hfh\u001a7l\u00190oH7gO7>IkkJ7m\u001cb;\u001b"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_51e

    :goto_516
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->てぜきぽく:Ljava/util/List;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_604

    :cond_51e
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, v16

    move-object/from16 v0, v18

    move/from16 v8, v19

    move/from16 v10, v20

    goto/16 :goto_440

    :cond_52c
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const-string v0, "\u0019aoN7nNehHkmJdj\u001djn\u001cfnO6oOjl\u001bfi\u001cg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_54d
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v8, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/InputStreamReader;

    invoke-direct {v9, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_55c
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_583

    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_56e

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_55c

    :cond_56e
    sget-object v8, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->てぜきぽく:Ljava/util/List;

    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v9, v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_580
    .catch Ljava/lang/Exception; {:try_start_54d .. :try_end_580} :catch_582

    goto/16 :goto_607

    :catch_582
    nop

    .line 31
    :cond_583
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻えぱひがこ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5f8

    const/4 v0, 0x0

    aget-object v8, v6, v0

    invoke-virtual {v8, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5f8

    aget-object v8, v6, v0

    invoke-virtual {v8, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5f8

    aget-object v8, v6, v0

    invoke-virtual {v8, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5f8

    aget-object v8, v6, v0

    invoke-virtual {v8, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5b7

    goto :goto_5f8

    :cond_5b7
    const/4 v8, 0x0

    :goto_5b8
    array-length v9, v6

    if-ge v8, v9, :cond_5f6

    aget-object v9, v6, v8

    invoke-virtual {v9, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    aget-object v0, v9, v0

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5f2

    aget-object v0, v6, v8

    invoke-virtual {v0, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    aget-object v9, v6, v8

    invoke-virtual {v9, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v9, v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5ec

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_5ec

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5f2

    :cond_5ec
    sget-object v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->てぜきぽく:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_607

    :cond_5f2
    add-int/lit8 v8, v8, 0x1

    const/4 v0, 0x0

    goto :goto_5b8

    :cond_5f6
    const/4 v0, 0x0

    goto :goto_608

    :cond_5f8
    :goto_5f8
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->てぜきぽく:Ljava/util/List;

    const-string v4, "I0:H1iObj\u001d1:O4o\u0019dfO4mOf9Ogj\u0019ej@dhMe>Aa>OfgKc>\u001c3l\u001cf>\u001ccnMgg\u0019`g\u001d7i\u001b"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_604
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_607
    const/4 v0, 0x1

    :goto_608
    if-nez v0, :cond_757

    .line 33
    sget-object v0, Lteam/dev/epro/apkcustom/widgets/SystemNative;->げつ〴ぬぐ:[Ljava/lang/String;

    :try_start_60c
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v4, "\u001e1>A7f\u001bcj\u001a`fMkk\u001af9\u001bflKaj\u001909\u001a1kIk"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v4
    :try_end_61e
    .catch Ljava/lang/Exception; {:try_start_60c .. :try_end_61e} :catch_64f
    .catchall {:try_start_60c .. :try_end_61e} :catchall_641

    :try_start_61e
    new-instance v6, Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_627
    .catch Ljava/lang/Exception; {:try_start_61e .. :try_end_627} :catch_650
    .catchall {:try_start_61e .. :try_end_627} :catchall_63f

    :try_start_627
    const-string v0, "encrypt\n"

    invoke-virtual {v6, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    const-string v0, "exit\n"

    invoke-virtual {v6, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v4}, Ljava/lang/Process;->waitFor()I
    :try_end_637
    .catch Ljava/lang/Exception; {:try_start_627 .. :try_end_637} :catch_63d
    .catchall {:try_start_627 .. :try_end_637} :catchall_63b

    :try_start_637
    invoke-virtual {v6}, Ljava/io/DataOutputStream;->close()V
    :try_end_63a
    .catch Ljava/lang/Exception; {:try_start_637 .. :try_end_63a} :catch_65b

    goto :goto_658

    :catchall_63b
    move-exception v0

    goto :goto_644

    :catch_63d
    nop

    goto :goto_651

    :catchall_63f
    move-exception v0

    goto :goto_643

    :catchall_641
    move-exception v0

    const/4 v4, 0x0

    :goto_643
    const/4 v6, 0x0

    :goto_644
    if-eqz v6, :cond_649

    :try_start_646
    invoke-virtual {v6}, Ljava/io/DataOutputStream;->close()V

    :cond_649
    if-eqz v4, :cond_64e

    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V
    :try_end_64e
    .catch Ljava/lang/Exception; {:try_start_646 .. :try_end_64e} :catch_64e

    :catch_64e
    :cond_64e
    throw v0

    :catch_64f
    const/4 v4, 0x0

    :catch_650
    const/4 v6, 0x0

    :goto_651
    if-eqz v6, :cond_656

    :try_start_653
    invoke-virtual {v6}, Ljava/io/DataOutputStream;->close()V

    :cond_656
    if-eqz v4, :cond_65b

    :goto_658
    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V
    :try_end_65b
    .catch Ljava/lang/Exception; {:try_start_653 .. :try_end_65b} :catch_65b

    :catch_65b
    :cond_65b
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x0

    aput-object v0, v4, v6

    const-string v0, "N7l\u001dj9\u001cg=I6f\u001b79MaiJe<H7o\u0019a:LkhHc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_67c
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v4, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-direct {v6, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const/4 v6, 0x0

    :cond_68c
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6a9

    sget-object v8, Lteam/dev/epro/apkcustom/widgets/SystemNative;->げつ〴ぬぐ:[Ljava/lang/String;

    array-length v9, v8

    const/4 v10, 0x0

    :goto_696
    if-ge v10, v9, :cond_68c

    move/from16 v17, v9

    aget-object v9, v8, v10

    invoke-virtual {v7, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_6a4

    add-int/lit8 v6, v6, 0x1

    :cond_6a4
    add-int/lit8 v10, v10, 0x1

    move/from16 v9, v17

    goto :goto_696

    :cond_6a9
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    const/4 v0, 0x1

    if-le v6, v0, :cond_6b4

    goto/16 :goto_733

    :cond_6b4
    invoke-static {}, Lteam/dev/epro/apkcustom/widgets/SystemNative;->isMagiskPresentNative()Z

    move-result v0
    :try_end_6b8
    .catch Ljava/io/IOException; {:try_start_67c .. :try_end_6b8} :catch_738

    if-nez v0, :cond_6d3

    :try_start_6ba
    new-instance v4, Ljava/io/File;

    const-string v6, "LjjKaoMcjO3;\u001a6<LefMf<N7>Od>Ob:\u001b1"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_6d3

    const/4 v0, 0x1

    goto :goto_6d3

    :catch_6d1
    nop

    goto :goto_739

    :cond_6d3
    :goto_6d3
    if-nez v0, :cond_739

    .line 34
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 35
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻えぱひがこ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_708

    const/4 v2, 0x0

    aget-object v4, v3, v2

    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_708

    aget-object v1, v3, v2

    invoke-virtual {v1, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_708

    aget-object v1, v3, v2

    invoke-virtual {v1, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_708

    aget-object v1, v3, v2

    invoke-virtual {v1, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_709

    :cond_708
    const/4 v0, 0x1

    :cond_709
    const/4 v1, 0x0

    :goto_70a
    array-length v2, v3

    if-ge v1, v2, :cond_739

    aget-object v2, v3, v1

    invoke-virtual {v2, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_735

    aget-object v2, v3, v1

    invoke-virtual {v2, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    aget-object v4, v3, v1

    invoke-virtual {v4, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v2, v2, -0x1

    aget-object v2, v4, v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_731
    .catch Ljava/io/IOException; {:try_start_6ba .. :try_end_731} :catch_6d1

    if-eqz v2, :cond_735

    :goto_733
    const/4 v0, 0x1

    goto :goto_739

    :cond_735
    add-int/lit8 v1, v1, 0x1

    goto :goto_70a

    :catch_738
    const/4 v0, 0x0

    :cond_739
    :goto_739
    if-eqz v0, :cond_74a

    .line 36
    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->てぜきぽく:Ljava/util/List;

    const-string v2, "Nkl\u001d7n\u001d0<M6<\u001e3;L3=\u001e79\u001bb>Kk<J1kAg"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_74a
    if-nez v0, :cond_757

    .line 37
    invoke-virtual/range {v16 .. v16}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_753

    goto :goto_757

    :cond_753
    const/4 v0, 0x0

    goto :goto_758

    :cond_755
    :goto_755
    move-object/from16 v16, v2

    :cond_757
    :goto_757
    const/4 v0, 0x1

    :goto_758
    move-object/from16 v1, v16

    iput-boolean v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->くし〴〺ぅ:Z

    goto :goto_75e

    :cond_75d
    move-object v1, v2

    :goto_75e
    iget-boolean v5, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->くし〴〺ぅ:Z

    .line 38
    :goto_760
    sput-boolean v5, Lteam/dev/epro/apkcustom/App;->ぁごぐすすぃ:Z

    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぁごぐすすぃ;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぁごぐすすぃ;-><init>(Landroid/content/Context;)V

    .line 40
    sput-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    :try_start_77a
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/App;->なぎぱいぢぎ:Ljava/lang/String;
    :try_end_789
    .catch Ljava/lang/Exception; {:try_start_77a .. :try_end_789} :catch_78a

    goto :goto_796

    :catch_78a
    const-string v0, "\u001aeg\u001a1lHek\u0019b;\u00193hAfj\u001e6mH1:Ad;H7=\u001aem\u001d`>Hf<\u001ed9@j;\u001e4<K4jJbiJ0lM7:\u001a3=\u001b4;Lef\u0019k<\u001b1iIg9\u00197:\u001agf\u001aehJbo@0nK`f\u001b4l\u001ae;Jkf\u0019k:Nf<I1lM6lI3;O`oAjjAd"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/App;->なぎぱいぢぎ:Ljava/lang/String;

    :goto_796
    return-void
.end method
