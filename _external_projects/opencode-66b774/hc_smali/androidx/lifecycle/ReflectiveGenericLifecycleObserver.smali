.class public Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;->げつ〴ぬぐ:Ljava/lang/Object;

    sget-object v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Class;)Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;->〺つふすそ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 6

    iget-object v0, p0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;->〺つふすそ:Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    iget-object v1, p0, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 1
    iget-object v2, v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2, p1, p2, v1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/util/List;Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Ljava/lang/Object;)V

    iget-object v0, v0, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/Map;

    sget-object v2, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_ANY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1, p2, v1}, Lづざかべべ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/util/List;Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;Ljava/lang/Object;)V

    return-void
.end method
