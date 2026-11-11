.class public Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final synthetic のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuPresenter;Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;Z)V
    .registers 13

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;->のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;

    sget v5, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionOverflowMenuStyle:I

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 2
    iput p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぁごぐすすぃ:I

    .line 3
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionMenuPresenter$なぎぱいぢぎ;

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;->のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ(Z)V

    .line 3
    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;->のぷのちつ:Landroidx/appcompat/widget/ActionMenuPresenter;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->でどあくず:Landroidx/appcompat/widget/ActionMenuPresenter$づざかべべ;

    invoke-super {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ()V

    return-void
.end method
