.class public final Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static 〺つふすそ(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V
    .registers 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_a

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    goto :goto_3b

    .line 1
    :cond_a
    sget-boolean v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->てぜきぽく:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-nez v0, :cond_2a

    :try_start_11
    const-class v0, Landroid/os/Bundle;

    const-string v4, "putIBinder"

    new-array v5, v2, [Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v1

    const-class v6, Landroid/os/IBinder;

    aput-object v6, v5, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺふねづ〺:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_28
    .catch Ljava/lang/NoSuchMethodException; {:try_start_11 .. :try_end_28} :catch_28

    :catch_28
    sput-boolean v3, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->てぜきぽく:Z

    :cond_2a
    sget-object v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺふねづ〺:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3b

    :try_start_2e
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    aput-object p2, v2, v3

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_37
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2e .. :try_end_37} :catch_38
    .catch Ljava/lang/IllegalAccessException; {:try_start_2e .. :try_end_37} :catch_38
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2e .. :try_end_37} :catch_38

    goto :goto_3b

    :catch_38
    const/4 p0, 0x0

    sput-object p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺふねづ〺:Ljava/lang/reflect/Method;

    :cond_3b
    :goto_3b
    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
    .registers 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_b

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p0

    return-object p0

    .line 1
    :cond_b
    sget-boolean v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いいにぽつ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_26

    :try_start_11
    const-class v0, Landroid/os/Bundle;

    const-string v3, "getIBinder"

    new-array v4, v2, [Ljava/lang/Class;

    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_24
    .catch Ljava/lang/NoSuchMethodException; {:try_start_11 .. :try_end_24} :catch_24

    :catch_24
    sput-boolean v2, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いいにぽつ:Z

    :cond_26
    sget-object v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-eqz v0, :cond_39

    :try_start_2b
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;
    :try_end_35
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2b .. :try_end_35} :catch_37
    .catch Ljava/lang/IllegalAccessException; {:try_start_2b .. :try_end_35} :catch_37
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2b .. :try_end_35} :catch_37

    move-object v3, p0

    goto :goto_39

    :catch_37
    sput-object v3, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ:Ljava/lang/reflect/Method;

    :cond_39
    :goto_39
    return-object v3
.end method
