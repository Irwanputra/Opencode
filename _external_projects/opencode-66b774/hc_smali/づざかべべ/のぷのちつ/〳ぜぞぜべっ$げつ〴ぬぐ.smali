.class public Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

.field public げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    sget-object v0, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Map;

    instance-of v0, p1, Lづざかべべ/のぷのちつ/づざかべべ;

    instance-of v1, p1, Lづざかべべ/のぷのちつ/〺つふすそ;

    if-eqz v0, :cond_18

    if-eqz v1, :cond_18

    new-instance v0, Landroidx/lifecycle/FullLifecycleObserverAdapter;

    move-object v1, p1

    check-cast v1, Lづざかべべ/のぷのちつ/〺つふすそ;

    check-cast p1, Lづざかべべ/のぷのちつ/づざかべべ;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/FullLifecycleObserverAdapter;-><init>(Lづざかべべ/のぷのちつ/〺つふすそ;Lづざかべべ/のぷのちつ/づざかべべ;)V

    goto :goto_7a

    :cond_18
    if-eqz v1, :cond_23

    new-instance v0, Landroidx/lifecycle/FullLifecycleObserverAdapter;

    check-cast p1, Lづざかべべ/のぷのちつ/〺つふすそ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/FullLifecycleObserverAdapter;-><init>(Lづざかべべ/のぷのちつ/〺つふすそ;Lづざかべべ/のぷのちつ/づざかべべ;)V

    goto :goto_7a

    :cond_23
    if-eqz v0, :cond_29

    move-object v0, p1

    check-cast v0, Lづざかべべ/のぷのちつ/づざかべべ;

    goto :goto_7a

    :cond_29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/のぷのちつ/いいにぽつ;->くし〴〺ぅ(Ljava/lang/Class;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_75

    sget-object v1, Lづざかべべ/のぷのちつ/いいにぽつ;->〺つふすそ:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_54

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;

    invoke-direct {v0, p1}, Landroidx/lifecycle/SingleGeneratedAdapterObserver;-><init>(Lづざかべべ/のぷのちつ/くし〴〺ぅ;)V

    goto :goto_7a

    :cond_54
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    :goto_5a
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6f

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Constructor;

    invoke-static {v3, p1}, Lづざかべべ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5a

    :cond_6f
    new-instance v0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    invoke-direct {v0, v1}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Lづざかべべ/のぷのちつ/くし〴〺ぅ;)V

    goto :goto_7a

    :cond_75
    new-instance v0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    invoke-direct {v0, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V

    .line 2
    :goto_7a
    iput-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

    iput-object p2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 5

    invoke-static {p2}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v1, v0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object v1

    iput-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/のぷのちつ/づざかべべ;

    invoke-interface {v1, p1, p2}, Lづざかべべ/のぷのちつ/づざかべべ;->びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-void
.end method
