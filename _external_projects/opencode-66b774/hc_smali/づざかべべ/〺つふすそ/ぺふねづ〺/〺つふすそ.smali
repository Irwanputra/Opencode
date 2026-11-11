.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/drawerlayout/widget/DrawerLayout$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;,
        Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$くし〴〺ぅ;,
        Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;,
        Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$〺つふすそ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final ぁごぐすすぃ:I

.field public くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

.field public final げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

.field public づざかべべ:Z

.field public final なぎぱいぢぎ:I

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->びぐびあび:Z

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〳ぜぞぜべっ:Z

    if-eqz p3, :cond_1d

    new-instance p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;

    invoke-direct {p1, p3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    new-instance p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;)V

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_31

    :cond_1d
    instance-of p3, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$〺つふすそ;

    if-eqz p3, :cond_2a

    check-cast p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$〺つふすそ;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$〺つふすそ;->てぜきぽく()Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    goto :goto_31

    :cond_2a
    new-instance p3, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$くし〴〺ぅ;

    invoke-direct {p3, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$くし〴〺ぅ;-><init>(Landroid/app/Activity;)V

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    :goto_31
    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    iput p4, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->なぎぱいぢぎ:I

    iput p5, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->ぁごぐすすぃ:I

    new-instance p1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;->づざかべべ()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    .line 2
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ()Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;F)V
    .registers 4

    iget-boolean p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->びぐびあび:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_13

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ(F)V

    goto :goto_16

    :cond_13
    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ(F)V

    :goto_16
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)V
    .registers 3

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ(F)V

    iget-boolean p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ:Z

    if-eqz p1, :cond_10

    iget p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->ぁごぐすすぃ:I

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)V

    :cond_10
    return-void
.end method

.method public げつ〴ぬぐ(I)V
    .registers 2

    return-void
.end method

.method public final づざかべべ(F)V
    .registers 5

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    const/4 v1, 0x1

    .line 1
    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Z

    if-eq v2, v1, :cond_1f

    goto :goto_1a

    :cond_e
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1f

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    const/4 v1, 0x0

    .line 3
    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Z

    if-eqz v2, :cond_1f

    :goto_1a
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Z

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    :cond_1f
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    .line 5
    iget v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_2c

    iput p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;->いいにぽつ:F

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_2c
    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->へぬ〴づぞ(I)Z

    move-result v0

    if-eqz v0, :cond_e

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ(F)V

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->づざかべべ:Z

    if-eqz v0, :cond_39

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/びぐびあび;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〺つふすそ:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v2, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->へぬ〴づぞ(I)Z

    move-result v1

    if-eqz v1, :cond_23

    iget v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->ぁごぐすすぃ:I

    goto :goto_25

    :cond_23
    iget v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->なぎぱいぢぎ:I

    .line 1
    :goto_25
    iget-boolean v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〳ぜぞぜべっ:Z

    if-nez v2, :cond_34

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;->〺つふすそ()Z

    move-result v2

    if-nez v2, :cond_34

    const/4 v2, 0x1

    iput-boolean v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->〳ぜぞぜべっ:Z

    :cond_34
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v2, v0, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;I)V

    :cond_39
    return-void
.end method
