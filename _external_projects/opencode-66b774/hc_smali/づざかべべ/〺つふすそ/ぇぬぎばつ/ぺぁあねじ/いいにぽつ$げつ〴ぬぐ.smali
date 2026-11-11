.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final くし〴〺ぅ:Landroid/view/ActionProvider;

.field public final synthetic びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    invoke-direct {p0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public づざかべべ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method

.method public なぎぱいぢぎ(Landroid/view/SubMenu;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    invoke-virtual {v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->びぐびあび(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    return-void
.end method
