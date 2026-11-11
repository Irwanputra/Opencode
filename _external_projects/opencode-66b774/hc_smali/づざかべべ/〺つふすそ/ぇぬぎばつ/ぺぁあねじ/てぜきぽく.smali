.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

.field public final くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public final づざかべべ:I

.field public final てぜきぽく:Landroid/widget/PopupWindow$OnDismissListener;

.field public なぎぱいぢぎ:Landroid/view/View;

.field public final びぐびあび:I

.field public ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

.field public ぺふねづ〺:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;ZII)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぁごぐすすぃ:I

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->てぜきぽく:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    iput-boolean p4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Z

    iput p5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび:I

    iput p6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->づざかべべ:I

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

.method public くし〴〺ぅ()V
    .registers 2

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぺふねづ〺:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_a
    return-void
.end method

.method public げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;
    .registers 15

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    if-nez v0, :cond_82

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_21

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    goto :goto_24

    :cond_21
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    :goto_24
    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lづざかべべ/〺つふすそ/びぐびあび;->abc_cascading_menus_min_smallest_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_3c

    const/4 v0, 0x1

    goto :goto_3d

    :cond_3c
    const/4 v0, 0x0

    :goto_3d
    if-eqz v0, :cond_50

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    iget v4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび:I

    iget v5, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->づざかべべ:I

    iget-boolean v6, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_62

    :cond_50
    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;

    iget-object v8, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v9, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v10, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    iget v11, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->びぐびあび:I

    iget v12, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->づざかべべ:I

    iget-boolean v13, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Z

    move-object v7, v0

    invoke-direct/range {v7 .. v13}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぉざぅち〻;-><init>(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/View;IIZ)V

    :goto_62
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->のぷのちつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->てぜきぽく:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ごづごきえ(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ぇぬぎばつ(Landroid/view/View;)V

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    invoke-interface {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;->てぜきぽく(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〳ぜぞぜべっ:Z

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ぉざぅち〻(Z)V

    iget v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぁごぐすすぃ:I

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ざとぅぼこ〺(I)V

    .line 2
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    :cond_82
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    return-object v0
.end method

.method public final づざかべべ(IIZZ)V
    .registers 8

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p4}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->ざっざへづ(Z)V

    if-eqz p3, :cond_48

    iget p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぁごぐすすぃ:I

    iget-object p4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    invoke-static {p4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p4

    invoke-static {p3, p4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぅみぱぎぎ(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_21

    iget-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    :cond_21
    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->は〲ぱなで(I)V

    invoke-virtual {v0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->でどあくず(I)V

    iget-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float p3, p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1
    iput-object p4, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;->〺つふすそ:Landroid/graphics/Rect;

    .line 2
    :cond_48
    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;->show()V

    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 4

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->〺つふすそ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Landroid/view/View;

    const/4 v2, 0x0

    if-nez v0, :cond_e

    return v2

    :cond_e
    invoke-virtual {p0, v2, v2, v2, v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->づざかべべ(IIZZ)V

    return v1
.end method

.method public びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->いいにぽつ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;->てぜきぽく(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    :cond_9
    return-void
.end method
