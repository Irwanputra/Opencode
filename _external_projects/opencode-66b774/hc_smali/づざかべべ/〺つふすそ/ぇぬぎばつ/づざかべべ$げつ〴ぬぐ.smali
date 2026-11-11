.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/content/Context;

.field public final くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u303a\u3064\u3075\u3059\u305d/\u3047\u306c\u304e\u3070\u3064/\u3065\u3056\u304b\u3079\u3079;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

.field public final びぐびあび:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    new-instance p1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/MenuItem;)Z
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    check-cast p2, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v1, v2, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;-><init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1b

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ;

    if-eqz v2, :cond_18

    iget-object v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;

    if-ne v3, p1, :cond_18

    return-object v2

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1b
    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final なぎぱいぢぎ(Landroid/view/Menu;)Landroid/view/Menu;
    .registers 5

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_1a

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/おぐぴう〸ず;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v0, v1, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/おぐぴう〸ず;-><init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    return-object v0
.end method

.method public びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/づざかべべ$げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
