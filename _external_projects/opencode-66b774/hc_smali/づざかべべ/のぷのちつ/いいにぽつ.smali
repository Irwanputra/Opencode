.class public Lづざかべべ/のぷのちつ/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u304f\u3057\u3034\u303a\u3045;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public static げつ〴ぬぐ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    return-void
.end method

.method public static 〺つふすそ(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "."

    const-string v2, "_"

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_LifecycleAdapter"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static くし〴〺ぅ(Ljava/lang/Class;)I
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    sget-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 1
    :cond_f
    const-class v0, Lづざかべべ/のぷのちつ/なぎぱいぢぎ;

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1a

    goto/16 :goto_11e

    :cond_1a
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 2
    :try_start_1c
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_2b

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_2d

    :cond_2b
    const-string v4, ""

    :goto_2d
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_34

    goto :goto_3d

    :cond_34
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :goto_3d
    invoke-static {v5}, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_48

    goto :goto_5c

    :cond_48
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_5c
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Class;

    aput-object p0, v5, v3

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->isAccessible()Z

    move-result v5

    if-nez v5, :cond_7a

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
    :try_end_71
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1c .. :try_end_71} :catch_79
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1c .. :try_end_71} :catch_72

    goto :goto_7a

    :catch_72
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_79
    move-object v4, v1

    :cond_7a
    :goto_7a
    const/4 v5, 0x2

    if-eqz v4, :cond_85

    .line 3
    sget-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_11a

    :cond_85
    sget-object v4, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ;

    .line 4
    iget-object v6, v4, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    invoke-interface {v6, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_96

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_ba

    .line 5
    :cond_96
    :try_start_96
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6
    :try_end_9a
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_96 .. :try_end_9a} :catch_128

    .line 6
    array-length v7, v6

    const/4 v8, 0x0

    :goto_9c
    if-ge v8, v7, :cond_b2

    aget-object v9, v6, v8

    const-class v10, Lづざかべべ/のぷのちつ/へぬ〴づぞ;

    invoke-virtual {v9, v10}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v9

    check-cast v9, Lづざかべべ/のぷのちつ/へぬ〴づぞ;

    if-eqz v9, :cond_af

    invoke-virtual {v4, p0, v6}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v4, 0x1

    goto :goto_ba

    :cond_af
    add-int/lit8 v8, v8, 0x1

    goto :goto_9c

    :cond_b2
    iget-object v4, v4, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, p0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_ba
    if-eqz v4, :cond_bd

    goto :goto_11e

    .line 7
    :cond_bd
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_cb

    .line 8
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_cb

    const/4 v6, 0x1

    goto :goto_cc

    :cond_cb
    const/4 v6, 0x0

    :goto_cc
    if-eqz v6, :cond_e2

    .line 9
    invoke-static {v4}, Lづざかべべ/のぷのちつ/いいにぽつ;->くし〴〺ぅ(Ljava/lang/Class;)I

    move-result v1

    if-ne v1, v2, :cond_d5

    goto :goto_11e

    :cond_d5
    new-instance v1, Ljava/util/ArrayList;

    sget-object v6, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :cond_e2
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v4

    array-length v6, v4

    const/4 v7, 0x0

    :goto_e8
    if-ge v7, v6, :cond_116

    aget-object v8, v4, v7

    if-eqz v8, :cond_f6

    .line 10
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_f6

    const/4 v9, 0x1

    goto :goto_f7

    :cond_f6
    const/4 v9, 0x0

    :goto_f7
    if-nez v9, :cond_fa

    goto :goto_113

    .line 11
    :cond_fa
    invoke-static {v8}, Lづざかべべ/のぷのちつ/いいにぽつ;->くし〴〺ぅ(Ljava/lang/Class;)I

    move-result v9

    if-ne v9, v2, :cond_101

    goto :goto_11e

    :cond_101
    if-nez v1, :cond_108

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_108
    sget-object v9, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v1, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_113
    add-int/lit8 v7, v7, 0x1

    goto :goto_e8

    :cond_116
    if-eqz v1, :cond_11e

    sget-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    :goto_11a
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x2

    .line 12
    :cond_11e
    :goto_11e
    sget-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    :catch_128
    move-exception p0

    .line 13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_132

    :goto_131
    throw v0

    :goto_132
    goto :goto_131
.end method

.method public static げつ〴ぬぐ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Lづざかべべ/のぷのちつ/くし〴〺ぅ;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u304f\u3057\u3034\u303a\u3045;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u304f\u3057\u3034\u303a\u3045;"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lづざかべべ/のぷのちつ/くし〴〺ぅ;
    :try_end_c
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_c} :catch_1b
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_c} :catch_14
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_c} :catch_d

    return-object p0

    :catch_d
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_14
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1b
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
