.class public Lづざかべべ/のぷのちつ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;,
        Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static くし〴〺ぅ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ;


# instance fields
.field public final 〺つふすそ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3052\u3064\u3034\u306c\u3050$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    sput-object v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Class;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz v0, :cond_b

    return-object v0

    :cond_b
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object p1

    return-object p1
.end method

.method public final くし〴〺ぅ(Ljava/util/Map;Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Ljava/lang/Class;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3052\u3064\u3034\u306c\u3050$\u303a\u3064\u3075\u3059\u305d;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3073\u3050\u3073\u3042\u3073$\u3052\u3064\u3034\u306c\u3050;",
            ">;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3052\u3064\u3034\u306c\u3050$\u303a\u3064\u3075\u3059\u305d;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3073\u3050\u3073\u3042\u3073$\u3052\u3064\u3034\u306c\u3050;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-eqz v0, :cond_40

    if-ne p3, v0, :cond_b

    goto :goto_40

    :cond_b
    iget-object p1, p2, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Ljava/lang/reflect/Method;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, "Method "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " already declared with different @OnLifecycleEvent value: previous value "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", new value "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_40
    :goto_40
    if-nez v0, :cond_45

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_45
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;
    .registers 14

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_16

    invoke-virtual {p0, v0}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Class;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v0, v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_16
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1d
    if-ge v4, v2, :cond_4e

    aget-object v5, v0, v4

    invoke-virtual {p0, v5}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Class;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object v5

    iget-object v5, v5, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p0, v1, v7, v6, p1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/util/Map;Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Ljava/lang/Class;)V

    goto :goto_2f

    :cond_4b
    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_4e
    if-eqz p2, :cond_51

    goto :goto_55

    .line 1
    :cond_51
    :try_start_51
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p2
    :try_end_55
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_51 .. :try_end_55} :catch_d7

    .line 2
    :goto_55
    array-length v0, p2

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_58
    if-ge v2, v0, :cond_c3

    aget-object v5, p2, v2

    const-class v6, Lづざかべべ/のぷのちつ/へぬ〴づぞ;

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lづざかべべ/のぷのちつ/へぬ〴づぞ;

    const/4 v7, 0x1

    if-nez v6, :cond_68

    goto :goto_b8

    :cond_68
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v8, v4

    if-lez v8, :cond_83

    aget-object v8, v4, v3

    const-class v9, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_7b

    const/4 v8, 0x1

    goto :goto_84

    :cond_7b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid parameter type. Must be one and instanceof LifecycleOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_83
    const/4 v8, 0x0

    :goto_84
    invoke-interface {v6}, Lづざかべべ/のぷのちつ/へぬ〴づぞ;->value()Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    move-result-object v6

    array-length v9, v4

    const/4 v10, 0x2

    if-le v9, v7, :cond_ac

    aget-object v8, v4, v7

    const-class v9, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_a4

    sget-object v8, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_ANY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne v6, v8, :cond_9c

    const/4 v8, 0x2

    goto :goto_ac

    :cond_9c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Second arg is supported only for ON_ANY value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid parameter type. second arg must be an event"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_ac
    :goto_ac
    array-length v4, v4

    if-gt v4, v10, :cond_bb

    new-instance v4, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;

    invoke-direct {v4, v8, v5}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;-><init>(ILjava/lang/reflect/Method;)V

    invoke-virtual {p0, v1, v4, v6, p1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/util/Map;Lづざかべべ/のぷのちつ/げつ〴ぬぐ$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Ljava/lang/Class;)V

    const/4 v4, 0x1

    :goto_b8
    add-int/lit8 v2, v2, 0x1

    goto :goto_58

    :cond_bb
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "cannot have more than 2 params"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c3
    new-instance p2, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {p2, v1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Ljava/util/Map;)V

    iget-object v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :catch_d7
    move-exception p1

    .line 3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e1

    :goto_e0
    throw p2

    :goto_e1
    goto :goto_e0
.end method
